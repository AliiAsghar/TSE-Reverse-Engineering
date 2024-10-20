package defpackage;

import defpackage.bcy;
import defpackage.bdd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beb implements ays {
    final /* synthetic */ boolean a;
    final /* synthetic */ bdy b;

    public beb(boolean z, bdy bdyVar) {
        this.a = z;
        this.b = bdyVar;
    }

    private final void g() {
        this.b.u(true);
        this.b.p(null);
        this.b.m(null);
    }

    @Override // defpackage.ays
    public final void a() {
        g();
    }

    @Override // defpackage.ays
    public final void b(long j) {
        if (this.b.d() != null) {
            bdy bdyVar = this.b;
            bdyVar.o(d.aH(bdyVar.c(), j));
            bdy bdyVar2 = this.b;
            long aH = d.aH(bdyVar2.b(), bdyVar2.c());
            bdy bdyVar3 = this.b;
            cjn cjnVar = new cjn(aH);
            boolean z = this.a;
            long b = bdyVar3.b();
            int i = bdd.a;
            if (bdyVar3.E(cjnVar, b, z, bdd.a.d)) {
                this.b.n(aH);
                this.b.o(0L);
            }
        }
    }

    @Override // defpackage.ays
    public final void c(long j) {
        bcy.a aVar;
        if (this.b.d() != null) {
            bcy f = this.b.f();
            f.getClass();
            if (this.a) {
                aVar = f.a;
            } else {
                aVar = f.b;
            }
            Object a = this.b.a.j.a(aVar.c);
            if (a != null) {
                bcw bcwVar = (bcw) a;
                cti j2 = bcwVar.j();
                if (j2 != null) {
                    long e = bcwVar.e(f, this.a);
                    if ((9223372034707292159L & e) != 9205357640488583168L) {
                        long a2 = bdp.a(e);
                        bdy bdyVar = this.b;
                        bdyVar.n(bdyVar.i().h(j2, a2));
                        this.b.o(0L);
                        return;
                    }
                    return;
                }
                aju.b("Current selectable should have layout coordinates.");
                throw new armj();
            }
            aju.b("SelectionRegistrar should contain the current selection's selectableIds");
            throw new armj();
        }
    }

    @Override // defpackage.ays
    public final void d() {
        g();
    }

    @Override // defpackage.ays
    public final void e() {
        g();
    }

    @Override // defpackage.ays
    public final void f() {
        cjn g;
        bcy f;
        bcy.a aVar;
        cti j;
        axp axpVar;
        if (this.a) {
            g = this.b.h();
        } else {
            g = this.b.g();
        }
        if (g != null && (f = this.b.f()) != null) {
            if (this.a) {
                aVar = f.a;
            } else {
                aVar = f.b;
            }
            bcw e = this.b.e(aVar);
            if (e != null && (j = e.j()) != null) {
                long e2 = e.e(f, this.a);
                if ((9223372034707292159L & e2) != 9205357640488583168L) {
                    long a = bdp.a(e2);
                    bdy bdyVar = this.b;
                    bdyVar.m(new cjn(bdyVar.i().h(j, a)));
                    bdy bdyVar2 = this.b;
                    if (this.a) {
                        axpVar = axp.b;
                    } else {
                        axpVar = axp.c;
                    }
                    bdyVar2.p(axpVar);
                    this.b.u(false);
                }
            }
        }
    }
}
