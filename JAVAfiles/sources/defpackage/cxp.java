package defpackage;

import defpackage.cga;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxp implements cny, cnt {
    public final cnr a;
    private cwx b;

    public cxp() {
        this(null);
    }

    @Override // defpackage.cny
    public final void A(cko ckoVar, long j, long j2, float f, float f2) {
        cnr cnrVar = this.a;
        ckr ckrVar = cnrVar.a.c;
        clp p = cnrVar.p();
        if (ckoVar != null) {
            ckoVar.a(cnw.b(cnrVar), p, f2);
        } else if (p.a() != f2) {
            p.i(f2);
        }
        ckc ckcVar = (ckc) p;
        if (!d.F(ckcVar.d, null)) {
            p.l(null);
        }
        if (!a.bA(ckcVar.b, 3)) {
            p.j(3);
        }
        if (p.c() != f) {
            p.r(f);
        }
        if (p.b() != 4.0f) {
            p.q(4.0f);
        }
        if (!a.bA(p.e(), 0)) {
            p.o(0);
        }
        if (!a.bA(p.f(), 0)) {
            p.p(0);
        }
        if (!d.F(null, null)) {
            p.t();
        }
        if (!a.bA(p.d(), 1)) {
            p.m(1);
        }
        ckrVar.e(j, j2, p);
    }

    @Override // defpackage.cny
    public final void B(clr clrVar, long j, float f, cnz cnzVar) {
        this.a.B(clrVar, j, f, cnzVar);
    }

    @Override // defpackage.cny
    public final void C(cko ckoVar, long j, long j2, long j3, float f, cnz cnzVar) {
        int i = (int) (j & 4294967295L);
        cnr cnrVar = this.a;
        int i2 = (int) (j >> 32);
        cnrVar.a.c.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), cnrVar.G(ckoVar, cnzVar, f, null, 3, 1));
    }

    @Override // defpackage.cny
    public final void D(long j, long j2, long j3, long j4, cnz cnzVar, float f) {
        this.a.D(j, j2, j3, j4, cnzVar, f);
    }

    @Override // defpackage.cny
    public final void E(long j, long j2, long j3, float f, int i) {
        this.a.E(j, j2, j3, f, i);
    }

    @Override // defpackage.cny
    public final void F(cko ckoVar, long j, long j2, float f, cnz cnzVar) {
        this.a.F(ckoVar, j, j2, f, cnzVar);
    }

    @Override // defpackage.cny
    public final long a() {
        return cnw.a(this.a);
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.a.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.drc
    public final float ef(long j) {
        return drb.a(this.a, j);
    }

    @Override // defpackage.dqv
    public final float eg(float f) {
        return dqu.a(this.a, f);
    }

    @Override // defpackage.dqv
    public final float eh(int i) {
        return dqu.b(this.a, i);
    }

    @Override // defpackage.dqv
    public final float el(long j) {
        return dqu.c(this.a, j);
    }

    @Override // defpackage.dqv
    public final float em(float f) {
        return dqu.d(this.a, f);
    }

    @Override // defpackage.dqv
    public final int en(long j) {
        return dqu.e(this.a, j);
    }

    @Override // defpackage.dqv
    public final int eo(float f) {
        return dqu.f(this.a, f);
    }

    @Override // defpackage.dqv
    public final long ep(long j) {
        return dqu.g(this.a, j);
    }

    @Override // defpackage.dqv
    public final long eq(long j) {
        return dqu.h(this.a, j);
    }

    @Override // defpackage.drc
    public final long er(float f) {
        return drb.b(this.a, f);
    }

    @Override // defpackage.dqv
    public final long es(float f) {
        return dqu.i(this.a, f);
    }

    @Override // defpackage.cny
    public final long o() {
        return cnw.b(this.a);
    }

    @Override // defpackage.cnt
    public final void p() {
        ckr b = q().b();
        cwx cwxVar = this.b;
        cwxVar.getClass();
        cga.c cVar = cwxVar.A().t;
        if (cVar != null && (cVar.r & 4) != 0) {
            while (cVar != null) {
                int i = cVar.q;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    cVar = cVar.t;
                }
            }
        }
        cVar = null;
        if (cVar != null) {
            cbh cbhVar = null;
            while (cVar != null) {
                if (cVar instanceof cwx) {
                    cwx cwxVar2 = (cwx) cVar;
                    cof cofVar = ((cnr.AnonymousClass1) q()).b;
                    cyn f = cwp.f(cwxVar2, 4);
                    f.r.u().t(b, drj.c(f.c), f, cwxVar2, cofVar);
                } else if ((cVar.q & 4) != 0 && (cVar instanceof cwr)) {
                    int i2 = 0;
                    for (cga.c cVar2 = ((cwr) cVar).B; cVar2 != null; cVar2 = cVar2.t) {
                        if ((cVar2.q & 4) != 0) {
                            i2++;
                            if (i2 == 1) {
                                cVar = cVar2;
                            } else {
                                if (cbhVar == null) {
                                    cbhVar = new cbh(new cga.c[16]);
                                }
                                if (cVar != null) {
                                    cbhVar.n(cVar);
                                }
                                cbhVar.n(cVar2);
                                cVar = null;
                            }
                        }
                    }
                    if (i2 != 1) {
                    }
                }
                cVar = cwp.a(cbhVar);
            }
            return;
        }
        cyn f2 = cwp.f(cwxVar, 4);
        if (f2.y() == cwxVar.A()) {
            f2 = f2.u;
            f2.getClass();
        }
        f2.C(b, ((cnr.AnonymousClass1) q()).b);
    }

    @Override // defpackage.cny
    public final cnu q() {
        return this.a.b;
    }

    @Override // defpackage.cny
    public final drk r() {
        return this.a.r();
    }

    @Override // defpackage.cny
    public final void s(long j, long j2, long j3, float f, cnz cnzVar, ckv ckvVar, int i) {
        this.a.s(j, j2, j3, f, cnzVar, ckvVar, i);
    }

    public final void t(ckr ckrVar, long j, cyn cynVar, cwx cwxVar, cof cofVar) {
        cwx cwxVar2 = this.b;
        this.b = cwxVar;
        cnr cnrVar = this.a;
        cnu cnuVar = cnrVar.b;
        drk q = cynVar.q();
        dqv c = cnrVar.b.c();
        drk d = cnuVar.d();
        ckr b = cnuVar.b();
        long a = cnuVar.a();
        cnr.AnonymousClass1 anonymousClass1 = (cnr.AnonymousClass1) cnuVar;
        cof cofVar2 = anonymousClass1.b;
        cnuVar.f(cynVar);
        cnuVar.g(q);
        cnuVar.e(ckrVar);
        cnuVar.h(j);
        anonymousClass1.b = cofVar;
        ckrVar.l();
        try {
            cwxVar.r(this);
            ckrVar.j();
            cnu cnuVar2 = cnrVar.b;
            cnuVar2.f(c);
            cnuVar2.g(d);
            cnuVar2.e(b);
            cnuVar2.h(a);
            ((cnr.AnonymousClass1) cnuVar2).b = cofVar2;
            this.b = cwxVar2;
        } catch (Throwable th) {
            ckrVar.j();
            cnu cnuVar3 = cnrVar.b;
            cnuVar3.f(c);
            cnuVar3.g(d);
            cnuVar3.e(b);
            cnuVar3.h(a);
            ((cnr.AnonymousClass1) cnuVar3).b = cofVar2;
            throw th;
        }
    }

    @Override // defpackage.cny
    public final void v(long j, float f, long j2, float f2, cnz cnzVar, int i) {
        this.a.v(j, f, j2, f2, cnzVar, i);
    }

    @Override // defpackage.cny
    public final void w(clr clrVar, cko ckoVar, float f, cnz cnzVar, int i) {
        this.a.w(clrVar, ckoVar, f, cnzVar, i);
    }

    @Override // defpackage.cny
    public final void x(long j, float f, float f2, long j2, long j3, cnz cnzVar) {
        this.a.x(j, f, f2, j2, j3, cnzVar);
    }

    @Override // defpackage.cny
    public final void y(clg clgVar, long j, long j2, float f, cnz cnzVar, ckv ckvVar, int i, int i2) {
        this.a.y(clgVar, j, j2, f, cnzVar, ckvVar, i, i2);
    }

    @Override // defpackage.cny
    public final void z(clg clgVar, cnz cnzVar, ckv ckvVar) {
        cnr cnrVar = this.a;
        cnrVar.a.c.t(clgVar, cnrVar.G(null, cnzVar, 1.0f, ckvVar, 3, 1));
    }

    public /* synthetic */ cxp(byte[] bArr) {
        this.a = new cnr();
    }
}
