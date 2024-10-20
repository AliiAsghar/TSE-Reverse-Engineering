package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwd implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public aqwd(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}
