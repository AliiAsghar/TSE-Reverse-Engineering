package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wys {
    public static final xze a = xze.g("Bugle", "MmsSender");
    public final xbf b;
    public final yjy c;
    protected final wnt d;
    public final apwt e;
    public final gf f;
    public final znj g;
    private final xyt h;
    private final yjr i;
    private final yck j;
    private final odn k;

    public wys(znj znjVar, xbf xbfVar, xyt xytVar, yjr yjrVar, yjy yjyVar, wnt wntVar, apwt apwtVar, yck yckVar, gf gfVar, odn odnVar) {
        this.g = znjVar;
        this.b = xbfVar;
        this.h = xytVar;
        this.i = yjrVar;
        this.c = yjyVar;
        this.d = wntVar;
        this.e = apwtVar;
        this.j = yckVar;
        this.f = gfVar;
        this.k = odnVar;
    }

    public final int a(int i, int i2, int i3) {
        boolean z;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        xyl.f(z);
        if (!((yaq) this.h.a()).r() && (this.i.w() || this.c.a() <= 0)) {
            return 2;
        }
        if (i == 3) {
            if (!((yaq) this.h.a()).r() || ((yaq) this.h.a()).b(i3) != yay.UNAVAILABLE) {
                return 2;
            }
            i = 3;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 13 && this.k.a()) {
                        return 1;
                    }
                    return 2;
                }
            } else {
                if (i2 == 404) {
                    return 3;
                }
                xyo e = a.e();
                e.H("Platform returned HTTP failure, returning message send status AUTO_RETRY");
                e.x("httpStatusCode", i2);
                e.q();
                return 1;
            }
        }
        xyo e2 = a.e();
        e2.H("Platform returned transient error, returning message send status AUTO_RETRY");
        e2.x("resultCode", i);
        e2.q();
        return 1;
    }

    protected final Uri b(Context context, gj gjVar, int i) {
        Uri d = uhm.d(context);
        File e = uhm.e(context, d);
        if (e != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(e);
                try {
                    File parentFile = e.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    byte[] b = new vao(context, gjVar).b();
                    if (b != null) {
                        int d2 = this.b.a(i).d();
                        int length = b.length;
                        if (length <= d2) {
                            fileOutputStream.write(b);
                            fileOutputStream.close();
                            return d;
                        }
                        xyo b2 = a.b();
                        b2.H("pdu size exceeds limit.");
                        b2.H("pduBytes:");
                        b2.F(length);
                        b2.H("limit:");
                        b2.F(d2);
                        b2.l(i);
                        b2.q();
                        throw new wyr(3);
                    }
                    throw new wyr(3, "Failed to compose PDU");
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e.delete();
                xyo b3 = a.b();
                b3.H("Cannot create temporary file");
                b3.H(e);
                b3.r(e2);
                throw new wyr(1, "Cannot create raw mms file");
            } catch (OutOfMemoryError e3) {
                e.delete();
                xyo b4 = a.b();
                b4.H("Out of memory in composing PDU");
                b4.r(e3);
                throw new wyr(2);
            }
        }
        a.m("Cannot create temp file");
        throw new wyr(1, "Cannot create mms temp file");
    }

    public final void c(Context context, int i, String str, String str2, int i2, long j) {
        String str3;
        try {
            xze xzeVar = a;
            if (xzeVar.s(3)) {
                xyo a2 = xzeVar.a();
                a2.H("Sending M-NotifyResp.ind for received MMS. status: 0X");
                a2.u(Integer.toHexString(i2));
                a2.q();
            }
            if (str2 == null) {
                xzeVar.q("Can't send NotifyResp; contentLocation is null");
                return;
            }
            if (str == null) {
                xzeVar.q("Can't send NotifyResp; transaction id is null");
                return;
            }
            gj gjVar = new gj(str.getBytes(StandardCharsets.UTF_8), i2);
            Uri parse = Uri.parse(str2);
            xyo c = xzeVar.c();
            c.H("sendNotifyResponseForMmsDownload");
            c.l(i);
            c.k(parse);
            c.q();
            try {
                if (true != this.b.a(i).s()) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                d(context, i, parse, str3, gjVar, false, null, j);
            } catch (gk e) {
                e = e;
                a.n("safeSendNotifyResponseForMmsDownload failed to retrieve message", e);
            } catch (wyr e2) {
                e = e2;
                a.n("safeSendNotifyResponseForMmsDownload failed to retrieve message", e);
            }
        } catch (gk | wyr e3) {
            e = e3;
        }
    }

    public final void d(Context context, int i, Uri uri, String str, gj gjVar, boolean z, Bundle bundle, long j) {
        Uri b = b(context, gjVar, i);
        Intent c = this.d.c(context, uri, b, z, bundle, j);
        if (this.j.m != -2) {
            try {
                PendingIntent.getBroadcast(context, 0, c, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)).send(context, this.j.m, new Intent());
                return;
            } catch (PendingIntent.CanceledException e) {
                a.r("Not able to force MMS send result status", e);
            }
        }
        lfl bc = ((mho) this.e.b()).bc();
        if ((gjVar instanceof gv) && bc != null) {
            bc.h(1, b);
        }
        gf gfVar = this.f;
        c.putExtra("mms_api", 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, c, yhy.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        xyo c2 = gf.a.c();
        c2.H("sending MMS. ");
        c2.v(j);
        c2.q();
        int e2 = d.e(i);
        SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(e2);
        if (yhx.e) {
            smsManagerForSubscriptionId.sendMultimediaMessage(context, b, str, gfVar.a(e2), broadcast, j);
        } else {
            smsManagerForSubscriptionId.sendMultimediaMessage(context, b, str, gfVar.a(e2), broadcast);
        }
    }
}
