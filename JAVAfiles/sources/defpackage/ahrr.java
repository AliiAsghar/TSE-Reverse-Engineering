package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrr {
    private static final ahrq d = ahrq.a(Integer.MAX_VALUE);
    public volatile ahrv a = ahru.a;
    public volatile boolean b = true;
    public volatile ahrq c = d;

    public ahrr(Context context, Executor executor, ahru ahruVar, apwt apwtVar, boolean z, algw algwVar, armf armfVar) {
        armf armfVar2;
        if (z && !algwVar.f()) {
            armfVar2 = armfVar;
        } else {
            armfVar2 = null;
        }
        b(new qnh(this, context, apwtVar, executor, ahruVar, armfVar2, 3), executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(apwt apwtVar) {
        try {
            ahlx ahlxVar = (ahlx) apwtVar.b();
            this.b = ahlxVar.b();
            this.c = ahrq.a(ahlxVar.a());
        } catch (Throwable th) {
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(th)).h("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'h', "Sampler.java")).q("Couldn't get config");
            this.b = false;
        }
    }
}
