package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asez implements Runnable {
    final /* synthetic */ asfa a;
    private Runnable b;

    public asez(asfa asfaVar, Runnable runnable) {
        this.a = asfaVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        do {
            try {
                this.b.run();
            } catch (Throwable th) {
                arro.m(arpj.a, th);
            }
            Runnable g = this.a.g();
            if (g == null) {
                return;
            }
            this.b = g;
            i++;
        } while (i < 16);
        asfa asfaVar = this.a;
        asfaVar.a.a(asfaVar, this);
    }
}
