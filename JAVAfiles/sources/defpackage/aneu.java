package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aneu implements Runnable {
    final /* synthetic */ Runnable a;

    public aneu(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}
