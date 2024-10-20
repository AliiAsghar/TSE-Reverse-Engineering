package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.NotificationReceiver;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vim extends vhr implements vij {
    private static final alwo c = alwo.o("BugleNotifications");
    ConversationId b;
    private final Context d;
    private final via e;
    private final armf h;
    private final armf i;
    private final mbl j;
    private final xnv k;
    private final qoq l;
    private final armf m;
    private int n;
    private xyq o;
    private final ArrayList p;
    private String q;
    private String r;
    private boolean s;
    private int t;
    private int u;
    private final lrf v;
    private final ibi w;
    private final wpp x;

    public vim(Context context, vjs vjsVar, armf armfVar, armf armfVar2, mbl mblVar, xnv xnvVar, qoq qoqVar, wpp wppVar, ibi ibiVar, via viaVar, lrf lrfVar, armf armfVar3) {
        super(vjsVar.n(vhu.MESSAGE_FAILURE));
        this.t = 1;
        this.o = new xyq();
        this.p = new ArrayList();
        this.b = InvalidConversationId.a;
        this.d = context;
        this.h = armfVar2;
        this.i = armfVar;
        this.j = mblVar;
        this.k = xnvVar;
        this.w = ibiVar;
        this.e = viaVar;
        this.l = qoqVar;
        this.x = wppVar;
        this.v = lrfVar;
        this.m = armfVar3;
    }

    @Override // defpackage.vhr, defpackage.vhv
    public final Notification b() {
        String string;
        int i;
        String quantityString;
        vik vikVar;
        PendingIntent b;
        amme ammeVar;
        String S;
        String string2;
        String string3;
        Resources resources = this.d.getResources();
        String str = this.r;
        String str2 = this.q;
        int size = this.o.size();
        int i2 = this.n;
        int i3 = this.t;
        int i4 = i3 - 1;
        if (i2 == 1) {
            if (i3 != 0) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            string2 = resources.getString(R.string.notification_delivery_failures_line1_singular);
                            string3 = resources.getString(R.string.notification_delivery_failures_line2_singular, str2);
                        } else {
                            throw new AssertionError("Unexpected failure type: ".concat(vom.k(i3)));
                        }
                    } else {
                        String string4 = resources.getString(R.string.notification_download_failures_line1_singular, str2);
                        String ag = albo.ag(str);
                        string2 = string4;
                        string3 = ag;
                    }
                } else {
                    string2 = resources.getString(R.string.notification_waiting_for_connection_timeout_line1_singular);
                    string3 = resources.getString(R.string.notification_waiting_for_connection_timeout_line2_singular, str2);
                }
                vikVar = new vik(string2, string3);
            } else {
                throw null;
            }
        } else if (i3 != 0) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        string = resources.getString(R.string.notification_delivery_failures_line1_plural);
                        i = R.plurals.notification_delivery_failures_line2_plural;
                    } else {
                        throw new AssertionError("Unexpected failure type: ".concat(vom.k(i3)));
                    }
                } else {
                    string = resources.getString(R.string.notification_download_failures_line1_plural);
                    i = R.plurals.notification_download_failures;
                }
            } else {
                string = resources.getString(R.string.notification_waiting_for_connection_timeout_line1_plural);
                i = R.plurals.notification_waiting_for_connection_timeout_line2_plural;
            }
            if (size == 1) {
                quantityString = resources.getQuantityString(i, 1, Integer.valueOf(i2), 1, str2);
            } else {
                quantityString = resources.getQuantityString(i, size, Integer.valueOf(i2), Integer.valueOf(size));
            }
            vikVar = new vik(string, quantityString);
        } else {
            throw null;
        }
        xyq xyqVar = this.o;
        if (xyqVar.size() == 1) {
            smr q = ((rtz) this.m.b()).q(xyqVar.a());
            lrf lrfVar = this.v;
            ConversationIdType a = xyqVar.a();
            if (q == null) {
                S = null;
            } else {
                S = q.S();
            }
            ConversationId l = lrfVar.l(a, S, this.s);
            this.b = l;
            b = this.l.m(this.d, l, this.s);
        } else {
            b = this.l.b(this.d);
        }
        dyu dyuVar = new dyu(this.d, g());
        dyuVar.i(vikVar.a);
        dyuVar.v(vikVar.a);
        dyuVar.h(vikVar.b);
        dyuVar.x(this.k.f().toEpochMilli());
        dyuVar.q(R.drawable.notification_icon);
        dyuVar.g = b;
        dyuVar.s(ydk.g(this.d, "raw", "message_failure"));
        dyuVar.l = 4;
        if (((Boolean) wos.a.e()).booleanValue()) {
            wpp wppVar = this.x;
            int i5 = this.t;
            int i6 = i5 - 1;
            if (i5 != 0) {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            ammeVar = amme.MESSAGE_DELIVERY_FAILURE_RECIPIENT_LOST_RCS;
                        } else {
                            throw new AssertionError("Unexpected failure type: ".concat(vom.k(i5)));
                        }
                    } else {
                        ammeVar = amme.MESSAGE_DOWNLOAD_FAILURE;
                    }
                } else {
                    ammeVar = amme.MESSAGE_SENDING_FAILURE;
                }
                dyuVar.e(wppVar.M(ammeVar));
            } else {
                throw null;
            }
        }
        Context context = this.d;
        lqn f = lqn.f(context, NotificationReceiver.class, "android.intent.action.VIEW");
        f.c(context.getPackageName());
        Intent a2 = f.a();
        a2.setAction("com.google.android.apps.messaging.reset_failed_message_notification");
        a2.putParcelableArrayListExtra("failed_messages", (ArrayList) Collection.EL.stream(this.p).map(new vil(0)).collect(Collectors.toCollection(new uzg(8))));
        PendingIntent b2 = aipr.b(this.d, 1, a2, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        b2.getClass();
        dyuVar.k(b2);
        return dyuVar.a();
    }

    @Override // defpackage.vij
    public final void d(boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        if (z) {
            str = "null_debug";
        } else {
            str = null;
        }
        if (z) {
            i = this.u;
        } else {
            ubl ublVar = (ubl) this.i.b();
            ibi ibiVar = this.w;
            ArrayList ap = alzz.ap(8, 18, 19, 106, 112);
            int i3 = 17;
            if (((Boolean) vij.a.e()).booleanValue()) {
                ap.add(17);
            }
            ap.add(21);
            sbf a = ((say) ibiVar.a).a();
            a.c(new rrv(6));
            a.e(new rpf(ap, 12));
            a.t((agmh) sbi.c.m);
            a.f(new atkn(sbi.c.h, true));
            sbd sbdVar = (sbd) a.b().n();
            int i4 = -1;
            try {
                sbdVar.moveToPosition(-1);
                while (sbdVar.moveToNext()) {
                    ConversationIdType M = sbdVar.M();
                    MessageIdType O = sbdVar.O();
                    int m = sbdVar.m();
                    int r = sbdVar.r();
                    if (((Boolean) a.e()).booleanValue() && r == i3) {
                        i2 = 3;
                    } else if (r != 106 && r != 107 && r != 111 && r != 112) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    this.p.add(new vii(M, O, m, i2));
                    if (!ublVar.c(M)) {
                        i4 = sbdVar.getPosition();
                        this.n++;
                        this.o.add(M);
                        if (qrl.a()) {
                            this.s = sbdVar.bc();
                        }
                        this.t = i2;
                    }
                    i3 = 17;
                }
                int size = this.p.size();
                if (size > 0 || this.n > 0) {
                    alwl alwlVar = (alwl) c.g();
                    alwlVar.X(vjh.a, Integer.valueOf(size));
                    alwlVar.X(vjh.b, Integer.valueOf(this.n));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification/MessageFailureNotificationImpl", "logFailedMessageCounts", 479, "MessageFailureNotificationImpl.java")).q("Found failed messages.");
                }
                if (this.n == 0) {
                    sbdVar.close();
                    i = 1;
                } else {
                    sbdVar.moveToPosition(i4);
                    sbdVar.l();
                    this.r = sbdVar.aJ();
                    rto z2 = ((uac) this.h.b()).z(sbdVar.M());
                    if (z2 != null) {
                        str2 = z2.r();
                    } else {
                        str2 = "";
                    }
                    this.q = str2;
                    sbdVar.close();
                    i = 2;
                }
            } catch (Throwable th) {
                sbdVar.close();
                throw th;
            }
        }
        int i5 = i - 1;
        if (i != 0) {
            if (i5 != 0) {
                if (i5 == 1) {
                    this.e.D(this);
                    int i6 = this.t;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            this.j.e("Bugle.Connectivity.ZeroConnectivity.Timeout.Notification.Sent", this.n);
                        } else if (i6 == 2) {
                            mbl mblVar = this.j;
                            int i7 = xyp.a;
                            int i8 = i7 - 1;
                            if (i7 != 0) {
                                mblVar.e("Bugle.Notification.Mms.DownloadFailure.Count", i8);
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
            } else if (str != null) {
                this.e.h(str, c());
            } else {
                this.e.g(c());
            }
            ArrayList arrayList = this.p;
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                vii viiVar = (vii) arrayList.get(i9);
                int i10 = viiVar.d;
                if (i10 == 1) {
                    mbl mblVar2 = this.j;
                    if (viiVar.c == 10004) {
                        str3 = "Bugle.Message.Fallback.Send.Timeout.Notification.Count";
                    } else {
                        str3 = "Bugle.Message.Fallback.Send.Failed.Notification.Count";
                    }
                    mblVar2.c(str3);
                } else if (i10 == 3) {
                    this.j.c("Bugle.Rcs.Delivery.Failure.Notification.Count");
                }
            }
            return;
        }
        throw null;
    }

    public vim(Context context, vjs vjsVar, armf armfVar, armf armfVar2, mbl mblVar, xnv xnvVar, qoq qoqVar, wpp wppVar, ibi ibiVar, via viaVar, int i, int i2, int i3, ArrayList arrayList, xyq xyqVar, lrf lrfVar, armf armfVar3) {
        super(vjsVar.n(vhu.MESSAGE_FAILURE));
        this.t = 1;
        this.o = new xyq();
        new ArrayList();
        this.b = InvalidConversationId.a;
        this.d = context;
        this.h = armfVar2;
        this.i = armfVar;
        this.j = mblVar;
        this.k = xnvVar;
        this.w = ibiVar;
        this.e = viaVar;
        this.l = qoqVar;
        this.x = wppVar;
        this.u = i;
        this.t = i2;
        this.n = i3;
        this.p = arrayList;
        this.o = xyqVar;
        this.q = "My Conversation Name";
        this.r = "My MMS Failure Text";
        this.v = lrfVar;
        this.m = armfVar3;
    }
}
