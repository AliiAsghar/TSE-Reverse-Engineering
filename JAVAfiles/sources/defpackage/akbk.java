package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akbk implements Runnable {
    private final Runnable a;
    private boolean b = false;

    public akbk(Runnable runnable) {
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        aiut.c();
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aiut.c();
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
