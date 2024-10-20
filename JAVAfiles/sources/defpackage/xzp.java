package defpackage;

import android.content.Context;
import android.os.SystemClock;
import defpackage.xzo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzp extends xzq {
    final /* synthetic */ xzq a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzp(String str, xzq xzqVar, Context context) {
        super(str);
        this.a = xzqVar;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.run();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            synchronized (f) {
                f.remove(this.a);
            }
            xzm ge = ((xzo.a) akec.w(this.b, xzo.a.class)).ge();
            if (ge != null) {
                ge.k(this.h, elapsedRealtime2, e);
            }
        } catch (IllegalStateException e) {
            alvw i = xzq.g.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncRunnable$1", "run", 'U', "SafeAsyncRunnable.java")).q("Exception in SafeAsyncRunnable");
        }
    }
}
