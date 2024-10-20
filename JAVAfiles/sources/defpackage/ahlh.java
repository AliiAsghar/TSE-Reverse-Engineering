package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahlh {
    public int a = 1;

    public abstract void i(ahka ahkaVar);

    public abstract void j(ahka ahkaVar);

    public final void k(ahka ahkaVar) {
        if (this.a == 3) {
            ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).q("Already in the background, not transitioning");
        } else {
            this.a = 3;
            i(ahkaVar);
        }
    }

    public final void l(ahka ahkaVar) {
        if (this.a == 2) {
            ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).q("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(ahkaVar);
        }
    }
}
