package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bez implements ays {
    final /* synthetic */ bfb a;

    public bez(bfb bfbVar) {
        this.a = bfbVar;
    }

    @Override // defpackage.ays
    public final void b(long j) {
        baa d;
        int a;
        cpm cpmVar;
        bfb bfbVar = this.a;
        bfbVar.n = d.aH(bfbVar.n, j);
        ayd aydVar = this.a.c;
        if (aydVar != null && (d = aydVar.d()) != null) {
            bfb bfbVar2 = this.a;
            bfbVar2.o(new cjn(d.aH(bfbVar2.l, bfbVar2.n)));
            dob dobVar = bfbVar2.a;
            cjn d2 = bfbVar2.d();
            d2.getClass();
            a = d.a(d2.a, true);
            int b = dobVar.b(a);
            long a2 = djd.a(b, b);
            long j2 = djc.a;
            if (!a.bB(a2, bfbVar2.f().b)) {
                ayd aydVar2 = bfbVar2.c;
                if ((aydVar2 == null || aydVar2.p()) && (cpmVar = bfbVar2.h) != null) {
                    cpmVar.a(9);
                }
                bfbVar2.b.a(new doj(bfbVar2.f().a, a2));
            }
        }
    }

    @Override // defpackage.ays
    public final void c(long j) {
        baa d;
        long a = bdp.a(this.a.a(true));
        ayd aydVar = this.a.c;
        if (aydVar != null && (d = aydVar.d()) != null) {
            long c = d.c(a);
            bfb bfbVar = this.a;
            bfbVar.l = c;
            bfbVar.o(new cjn(c));
            bfb bfbVar2 = this.a;
            bfbVar2.n = 0L;
            bfbVar2.q(axp.a);
            this.a.u(false);
        }
    }

    @Override // defpackage.ays
    public final void d() {
        this.a.q(null);
        this.a.o(null);
    }

    @Override // defpackage.ays
    public final void e() {
        this.a.q(null);
        this.a.o(null);
    }

    @Override // defpackage.ays
    public final void a() {
    }

    @Override // defpackage.ays
    public final void f() {
    }
}
