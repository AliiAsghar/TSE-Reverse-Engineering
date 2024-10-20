package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasl implements yjj {
    final /* synthetic */ Runnable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aasm c;

    public aasl(aasm aasmVar, Runnable runnable, boolean z) {
        this.a = runnable;
        this.b = z;
        this.c = aasmVar;
    }

    @Override // defpackage.yjj
    public final void b() {
        if (!this.b && this.c.i.n()) {
            this.c.k.h();
        }
    }

    @Override // defpackage.yjj
    public final void d() {
        this.a.run();
    }

    @Override // defpackage.yjj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void c() {
    }
}
