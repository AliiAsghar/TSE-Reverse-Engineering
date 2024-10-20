package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahkc {
    public static final /* synthetic */ int b = 0;
    private static final ahkc c;
    private static volatile boolean d;
    private static volatile ahkc e;
    public final ahkd a;

    static {
        ahkc ahkcVar = new ahkc(new ahkb());
        c = ahkcVar;
        d = true;
        e = ahkcVar;
    }

    public ahkc(ahkd ahkdVar) {
        ahkdVar.getClass();
        this.a = ahkdVar;
    }

    public static ahkc a() {
        alwk alwkVar;
        if (e == c && d) {
            d = false;
            alvg alvgVar = (alvg) ahkh.a.i();
            if (Math.random() < 0.01d) {
                alwkVar = alwk.FULL;
            } else {
                alwkVar = alwk.NONE;
            }
            alvgVar.Z(alwkVar);
            ((alvg) alvgVar.h("com/google/android/libraries/performance/primes/Primes", "get", 186, "Primes.java")).q("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return e;
    }

    public static synchronized void b(ahkc ahkcVar) {
        synchronized (ahkc.class) {
            if (e != c) {
                ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/Primes", "cache", 146, "Primes.java")).q("Primes cached more than once. This call will be ignored.");
            } else {
                e = ahkcVar;
            }
        }
    }

    public static boolean d() {
        if (e != c) {
            return true;
        }
        return false;
    }

    public final void c(ahpn ahpnVar) {
        this.a.d(ahpnVar);
    }

    public final void e(ahka ahkaVar) {
        this.a.i(ahkaVar);
    }
}
