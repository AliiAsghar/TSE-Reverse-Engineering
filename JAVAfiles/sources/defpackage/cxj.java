package defpackage;

import defpackage.cga;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxj extends cyn {
    private static final clp D;
    private csr E;
    public cxi f;
    public dqs g;
    public cyc h;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends cyc {
        public a() {
            super(cxj.this);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int a(int i) {
            cxj cxjVar = cxj.this;
            cxi cxiVar = cxjVar.f;
            cyc z = cxjVar.D().z();
            z.getClass();
            return cxiVar.d(this, z, i);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int b(int i) {
            cxj cxjVar = cxj.this;
            cxi cxiVar = cxjVar.f;
            cyc z = cxjVar.D().z();
            z.getClass();
            return cxiVar.e(this, z, i);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int c(int i) {
            cxj cxjVar = cxj.this;
            cxi cxiVar = cxjVar.f;
            cyc z = cxjVar.D().z();
            z.getClass();
            return cxiVar.f(this, z, i);
        }

        @Override // defpackage.cyc, defpackage.ctc
        public final int d(int i) {
            cxj cxjVar = cxj.this;
            cxi cxiVar = cxjVar.f;
            cyc z = cxjVar.D().z();
            z.getClass();
            return cxiVar.g(this, z, i);
        }

        @Override // defpackage.cuc
        public final cvc e(long j) {
            x(j);
            dqs dqsVar = new dqs(j);
            cxj cxjVar = cxj.this;
            cxjVar.g = dqsVar;
            cxi cxiVar = cxjVar.f;
            cyc z = cxjVar.D().z();
            z.getClass();
            super.C(cxiVar.b(this, z, j));
            return this;
        }

        @Override // defpackage.cya
        public final int s(csh cshVar) {
            uv uvVar = this.o;
            int a = cxk.a(this, cshVar);
            uvVar.g(cshVar, a);
            return a;
        }
    }

    static {
        ckc ckcVar = new ckc();
        ckcVar.k(cku.f);
        ckcVar.r(1.0f);
        ckcVar.s(1);
        D = ckcVar;
    }

    public cxj(cxn cxnVar, cxi cxiVar) {
        super(cxnVar);
        a aVar;
        this.f = cxiVar;
        if (cxnVar.k != null) {
            aVar = new a();
        } else {
            aVar = null;
        }
        this.h = aVar;
        this.E = (cxiVar.A().q & 512) != 0 ? new csr(this, (csp) cxiVar) : null;
    }

    private final void aw() {
        boolean z;
        dri driVar;
        if (this.j) {
            return;
        }
        ai();
        csr csrVar = this.E;
        if (csrVar != null) {
            csp cspVar = csrVar.b;
            this.h.getClass();
            cspVar.x();
            if (!csrVar.c) {
                long j = this.c;
                cyc cycVar = this.h;
                dri driVar2 = null;
                if (cycVar != null) {
                    driVar = new dri(cycVar.z());
                } else {
                    driVar = null;
                }
                if (dri.d(j, driVar)) {
                    long j2 = D().c;
                    cyc z2 = D().z();
                    if (z2 != null) {
                        driVar2 = new dri(z2.z());
                    }
                    if (dri.d(j2, driVar2)) {
                        z = true;
                        D().s = z;
                    }
                }
            }
            z = false;
            D().s = z;
        }
        H().o();
        D().s = false;
    }

    @Override // defpackage.cyn
    public final void A() {
        if (this.h == null) {
            this.h = new a();
        }
    }

    @Override // defpackage.cyn
    public final void C(ckr ckrVar, cof cofVar) {
        D().aa(ckrVar, cofVar);
        if (((dai) cxq.a(this.r)).t) {
            ab(ckrVar, D);
        }
    }

    public final cyn D() {
        cyn cynVar = this.u;
        cynVar.getClass();
        return cynVar;
    }

    public final void E(cxi cxiVar) {
        if (!d.F(cxiVar, this.f)) {
            if ((cxiVar.A().q & 512) != 0) {
                csp cspVar = (csp) cxiVar;
                csr csrVar = this.E;
                if (csrVar != null) {
                    csrVar.b = cspVar;
                } else {
                    csrVar = new csr(this, cspVar);
                }
                this.E = csrVar;
            } else {
                this.E = null;
            }
        }
        this.f = cxiVar;
    }

    @Override // defpackage.ctc
    public final int a(int i) {
        csr csrVar = this.E;
        if (csrVar != null) {
            return csrVar.b.a(csrVar, D(), i);
        }
        return this.f.d(this, D(), i);
    }

    @Override // defpackage.ctc
    public final int b(int i) {
        csr csrVar = this.E;
        if (csrVar != null) {
            return csrVar.b.h(csrVar, D(), i);
        }
        return this.f.e(this, D(), i);
    }

    @Override // defpackage.ctc
    public final int c(int i) {
        csr csrVar = this.E;
        if (csrVar != null) {
            return csrVar.b.i(csrVar, D(), i);
        }
        return this.f.f(this, D(), i);
    }

    @Override // defpackage.ctc
    public final int d(int i) {
        csr csrVar = this.E;
        if (csrVar != null) {
            return csrVar.b.j(csrVar, D(), i);
        }
        return this.f.g(this, D(), i);
    }

    @Override // defpackage.cuc
    public final cvc e(long j) {
        cuf b;
        boolean z;
        dri driVar;
        if (this.t) {
            dqs dqsVar = this.g;
            if (dqsVar != null) {
                j = dqsVar.a;
            } else {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
        }
        x(j);
        csr csrVar = this.E;
        if (csrVar != null) {
            cxj cxjVar = csrVar.a;
            csp cspVar = csrVar.b;
            cyc cycVar = cxjVar.h;
            cycVar.getClass();
            cuf H = cycVar.H();
            H.k();
            H.j();
            boolean z2 = false;
            if (!cspVar.w() && dqs.f(j, this.g)) {
                z = false;
            } else {
                z = true;
            }
            csrVar.c = z;
            if (!z) {
                D().t = true;
            }
            b = cspVar.o(csrVar, D(), j);
            D().t = false;
            int k = b.k();
            cyc cycVar2 = this.h;
            cycVar2.getClass();
            if (k == cycVar2.a) {
                int j2 = b.j();
                cyc cycVar3 = this.h;
                cycVar3.getClass();
                if (j2 == cycVar3.b) {
                    z2 = true;
                }
            }
            if (!csrVar.c) {
                long j3 = D().c;
                cyc z3 = D().z();
                if (z3 != null) {
                    driVar = new dri(z3.z());
                } else {
                    driVar = null;
                }
                if (dri.d(j3, driVar) && !z2) {
                    b = new cuf(this) { // from class: cxj.1
                        private final int b;
                        private final int c;

                        {
                            cyc cycVar4 = this.h;
                            cycVar4.getClass();
                            this.b = cycVar4.a;
                            cycVar4.getClass();
                            this.c = cycVar4.b;
                        }

                        @Override // defpackage.cuf
                        public final int j() {
                            return this.c;
                        }

                        @Override // defpackage.cuf
                        public final int k() {
                            return this.b;
                        }

                        @Override // defpackage.cuf
                        public final Map m() {
                            return cuf.this.m();
                        }

                        @Override // defpackage.cuf
                        public final arqr n() {
                            return cuf.this.n();
                        }

                        @Override // defpackage.cuf
                        public final void o() {
                            cuf.this.o();
                        }
                    };
                }
            }
        } else {
            b = this.f.b(this, D(), j);
        }
        an(b);
        ah();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyn, defpackage.cvc
    public final void ee(long j, float f, arqr arqrVar) {
        super.ee(j, f, arqrVar);
        aw();
    }

    @Override // defpackage.cya
    public final int s(csh cshVar) {
        cyc cycVar = this.h;
        if (cycVar != null) {
            return cycVar.o.c(cshVar, Integer.MIN_VALUE);
        }
        return cxk.a(this, cshVar);
    }

    @Override // defpackage.cyn, defpackage.cvc
    public final void v(long j, float f, cof cofVar) {
        super.v(j, f, cofVar);
        aw();
    }

    @Override // defpackage.cyn
    public final cga.c y() {
        return this.f.A();
    }

    @Override // defpackage.cyn
    public final cyc z() {
        return this.h;
    }
}
