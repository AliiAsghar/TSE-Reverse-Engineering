package defpackage;

import android.content.Context;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpz extends acda {
    final /* synthetic */ abqa a;
    private final Context b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abpz(defpackage.abqa r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.a = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpz.<init>(abqa, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        int g = this.a.g(this.b);
        if (abqp.f(g)) {
            this.a.c(this.b, g);
        }
    }
}
