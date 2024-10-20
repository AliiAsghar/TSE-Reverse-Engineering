package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vag implements vah {
    private final kpo c;
    private final anen d;
    private static final alwo b = alwo.o("MmsPolicy");
    public static final uuf a = uuh.f(uuh.b, "mms_policy_query_timeout", 3000);

    public vag(kpo kpoVar, anen anenVar) {
        this.c = kpoVar;
        this.d = anenVar;
    }

    private final akul d(Function function) {
        akrh e = aktp.e("MmsPolicy#isMmsAllowedFuture");
        try {
            akul i = this.c.a().i(new uwa(function, 13), this.d);
            e.b(i);
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final boolean e(Function function) {
        boolean z = true;
        try {
            if (aiut.g()) {
                z = ((Boolean) d(function).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS)).booleanValue();
            } else {
                z = ((Boolean) agkg.b(d(function), ((Long) a.e()).longValue(), TimeUnit.MILLISECONDS)).booleanValue();
            }
        } catch (InterruptedException e) {
            ((alwl) ((alwl) ((alwl) b.i()).g(e)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", 'B', "MmsPolicy.java")).q("Interrupted while querying MmsController");
        } catch (ExecutionException e2) {
            ((alwl) ((alwl) ((alwl) b.i()).g(e2)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", '@', "MmsPolicy.java")).q("Failed to query MmsController");
        } catch (TimeoutException e3) {
            ((alwl) ((alwl) ((alwl) b.i()).g(e3)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", 'D', "MmsPolicy.java")).q("Timeout while querying MmsController");
        }
        return z;
    }

    public final boolean a() {
        return e(new uzd(17));
    }

    public final boolean b() {
        return e(new uzd(15));
    }

    @Override // defpackage.vah
    public final boolean c() {
        return e(new uzd(16));
    }
}
