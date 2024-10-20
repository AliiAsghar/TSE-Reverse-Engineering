package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyh implements esj {
    final /* synthetic */ eyk a;

    public eyh(eyk eykVar) {
        this.a = eykVar;
    }

    @Override // defpackage.esj
    public final void a() {
        new exl(this, 2).run();
    }

    @Override // defpackage.esj
    public final void b(esh eshVar) {
        this.a.a(eshVar);
    }

    @Override // defpackage.esj
    public final void c(long j) {
        if (j == 0) {
            this.a.o = true;
            j = 0;
        }
        this.a.n = j;
        new eyg(0).run();
    }

    @Override // defpackage.esj
    public final void d(int i, int i2) {
        new eyr(this, i, i2, 1).run();
    }

    @Override // defpackage.esj
    public final void e() {
        eyk eykVar = this.a;
        eykVar.l = true;
        eykVar.b();
    }
}
