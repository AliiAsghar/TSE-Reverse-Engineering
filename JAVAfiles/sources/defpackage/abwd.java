package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwd implements Runnable, absf, abtc {
    private static abwd c;
    public final Handler b;
    private final abug e;
    private final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public int a = 0;

    private abwd(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        acda acdaVar = new acda(handlerThread.getLooper());
        this.b = acdaVar;
        this.e = new abwa(context, acdaVar.getLooper(), this, this);
    }

    public static synchronized abwd a(Context context) {
        abwd abwdVar;
        synchronized (abwd.class) {
            if (c == null) {
                c = new abwd(context);
            }
            abwdVar = c;
        }
        return abwdVar;
    }

    private final void e(String str) {
        while (true) {
            abwc abwcVar = (abwc) this.d.poll();
            if (abwcVar == null) {
                return;
            }
            abug abugVar = this.e;
            abwcVar.c(new abwb(abugVar.b, this, str, abwcVar.g));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x03b6, code lost:
    
        if (r7 != null) goto L296;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f() {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwd.f():void");
    }

    public final void b(abwc abwcVar) {
        abwcVar.g.c(2, abwm.COARSE);
        this.d.offer(abwcVar);
        this.b.post(this);
    }

    public final void c() {
        if (this.d.isEmpty() && this.a == 0 && this.e.p()) {
            this.e.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Runnable runnable) {
        if (Looper.myLooper() == this.b.getLooper()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }

    @Override // defpackage.absf
    public final void onConnected(Bundle bundle) {
        abhg.d(this.b);
        f();
    }

    @Override // defpackage.abtc
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        abhg.d(this.b);
        e("Connection failed: ".concat(connectionResult.toString()));
    }

    @Override // defpackage.absf
    public final void onConnectionSuspended(int i) {
        abhg.d(this.b);
        e(a.bV(i, "Disconnected: "));
    }

    @Override // java.lang.Runnable
    public final void run() {
        abhg.d(this.b);
        if (this.e.p()) {
            f();
            return;
        }
        if (!this.e.q() && !this.d.isEmpty()) {
            abug abugVar = this.e;
            int h = abugVar.c.h(abugVar.b, 12800000);
            if (h != 0) {
                abugVar.C(1, null);
                abugVar.D(new abtx(abugVar), h, null);
            } else {
                abugVar.m(new abtx(abugVar));
            }
        }
    }
}
