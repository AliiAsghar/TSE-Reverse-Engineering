package defpackage;

import defpackage.bdd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfa implements ays {
    final /* synthetic */ bfb a;
    final /* synthetic */ boolean b;

    public bfa(bfb bfbVar, boolean z) {
        this.a = bfbVar;
        this.b = z;
    }

    @Override // defpackage.ays
    public final void b(long j) {
        bfb bfbVar = this.a;
        bfbVar.n = d.aH(bfbVar.n, j);
        bfb bfbVar2 = this.a;
        bfbVar2.o(new cjn(d.aH(bfbVar2.l, bfbVar2.n)));
        bfb bfbVar3 = this.a;
        doj f = bfbVar3.f();
        cjn d = bfbVar3.d();
        d.getClass();
        int i = bdd.a;
        bfbVar3.b(f, d.a, false, this.b, bdd.a.d, true);
        this.a.u(false);
    }

    @Override // defpackage.ays
    public final void d() {
        this.a.q(null);
        this.a.o(null);
        this.a.u(true);
    }

    @Override // defpackage.ays
    public final void e() {
        this.a.q(null);
        this.a.o(null);
        this.a.u(true);
    }

    @Override // defpackage.ays
    public final void f() {
        axp axpVar;
        baa d;
        if (this.b) {
            axpVar = axp.b;
        } else {
            axpVar = axp.c;
        }
        this.a.q(axpVar);
        long a = bdp.a(this.a.a(this.b));
        ayd aydVar = this.a.c;
        if (aydVar != null && (d = aydVar.d()) != null) {
            long c = d.c(a);
            bfb bfbVar = this.a;
            bfbVar.l = c;
            bfbVar.o(new cjn(c));
            bfb bfbVar2 = this.a;
            bfbVar2.n = 0L;
            bfbVar2.u = -1;
            ayd aydVar2 = this.a.c;
            if (aydVar2 != null) {
                aydVar2.h(true);
            }
            this.a.u(false);
        }
    }

    @Override // defpackage.ays
    public final void a() {
    }

    @Override // defpackage.ays
    public final void c(long j) {
    }
}
