package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktj implements Runnable {
    final /* synthetic */ aksa a;
    final /* synthetic */ Runnable b;

    public aktj(aksa aksaVar, Runnable runnable) {
        this.a = aksaVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aksa, akry] */
    @Override // java.lang.Runnable
    public final void run() {
        akry h = akqj.h(akqj.b(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
