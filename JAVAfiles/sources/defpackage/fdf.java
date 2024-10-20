package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdf extends Handler {
    final /* synthetic */ fdj a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdf(fdj fdjVar, Looper looper) {
        super(looper);
        this.a = fdjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Object obj, boolean z) {
        obtainMessage(i, new fdg(fgm.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Exception exc;
        Object fdiVar;
        String str;
        fdg fdgVar = (fdg) message.obj;
        try {
            int i = message.what;
            String str2 = null;
            if (i != 1) {
                if (i == 2) {
                    fdj fdjVar = this.a;
                    fvq fvqVar = fdjVar.h;
                    UUID uuid = fdjVar.c;
                    fdx fdxVar = (fdx) fdgVar.d;
                    ?? r6 = fdxVar.b;
                    if (true != TextUtils.isEmpty(r6)) {
                        str2 = r6;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        HashMap hashMap = new HashMap();
                        if (eqc.e.equals(uuid)) {
                            str = "text/xml";
                        } else if (eqc.c.equals(uuid)) {
                            str = "application/json";
                        } else {
                            str = "application/octet-stream";
                        }
                        hashMap.put(assi.a, str);
                        if (eqc.e.equals(uuid)) {
                            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                        }
                        synchronized (fvqVar.b) {
                            hashMap.putAll(fvqVar.b);
                        }
                        exc = edz.x(((evo) fvqVar.a).a(), str2, (byte[]) fdxVar.a, hashMap);
                    } else {
                        evk evkVar = new evk();
                        evkVar.a = Uri.EMPTY;
                        evkVar.a();
                        throw new fed(new IllegalStateException("No license URL"));
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                fvq fvqVar2 = this.a.h;
                fvq fvqVar3 = (fvq) fdgVar.d;
                exc = edz.x(((evo) fvqVar2.a).a(), a.co(eul.H((byte[]) fvqVar3.b), (String) fvqVar3.a, "&signedRequest="), null, Collections.emptyMap());
            }
        } catch (fed e) {
            fdg fdgVar2 = (fdg) message.obj;
            if (fdgVar2.b) {
                int i2 = fdgVar2.e + 1;
                fdgVar2.e = i2;
                if (i2 <= eec.g(3)) {
                    int i3 = fgm.a;
                    long j = fdgVar2.a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    long j2 = fdgVar2.c;
                    if (e.getCause() instanceof IOException) {
                        fdiVar = (IOException) e.getCause();
                    } else {
                        fdiVar = new fdi(e.getCause());
                    }
                    long h = eec.h(new atal(fdiVar, fdgVar2.e));
                    if (h != -9223372036854775807L) {
                        synchronized (this) {
                            if (!this.b) {
                                sendMessageDelayed(Message.obtain(message), h);
                                return;
                            }
                        }
                    }
                }
            }
            exc = e;
        } catch (Exception e2) {
            eub.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            exc = e2;
        }
        long j3 = fdgVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.d.obtainMessage(message.what, Pair.create(fdgVar.d, exc)).sendToTarget();
            }
        }
    }
}
