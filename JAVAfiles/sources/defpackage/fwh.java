package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fwh extends ezg {
    protected long j;
    protected fxa k;
    protected boolean l;
    protected fvp m;
    private eqn n;
    private eqn o;
    private final fxo p;
    private final fvc q;
    private final ewl r;
    private boolean s;
    private boolean t;
    private boolean u;

    public fwh(int i, fxo fxoVar, fvc fvcVar) {
        super(i);
        this.p = fxoVar;
        this.q = fvcVar;
        this.r = new ewl(0);
    }

    private final boolean ac() {
        if (this.k != null) {
            return true;
        }
        if (this.o == null) {
            if (this.m != null && dyf.g(this.n.o) == 1) {
                eqn b = this.m.b();
                if (b == null) {
                    return false;
                }
                this.o = aa(b);
            } else {
                this.o = aa(this.n);
            }
        }
        fxe i = ((fxf) this.q).i(this.o);
        if (i == null) {
            return false;
        }
        this.k = i;
        return true;
    }

    private final boolean ad(ewl ewlVar) {
        int P = P(Q(), ewlVar, 0);
        if (P != -5) {
            if (P != -4) {
                return false;
            }
            ewlVar.i();
            if (!ewlVar.eR()) {
                this.p.d(this.b, ewlVar.f);
                return true;
            }
            return true;
        }
        throw new IllegalStateException("Format changes are not supported.");
    }

    @Override // defpackage.fbd
    public final void S(long j, long j2) {
        boolean z;
        boolean z2;
        try {
            if (this.s && !this.l) {
                eqn eqnVar = this.n;
                if (eqnVar == null || this.t) {
                    if (eqnVar == null) {
                        fqu Q = Q();
                        if (P(Q, this.r, 2) == -5) {
                            eqn eqnVar2 = Q.a;
                            dzg.g(eqnVar2);
                            eqn Z = Z(eqnVar2);
                            this.n = Z;
                            this.t = this.q.d(Z, 3);
                        } else {
                            return;
                        }
                    }
                    if (this.t) {
                        if (dyf.g(this.n.o) != 2 || ac()) {
                            W(this.n);
                            this.t = false;
                        } else {
                            return;
                        }
                    }
                }
                if (this.m == null) {
                    if (!ac()) {
                        return;
                    }
                    while (true) {
                        ewl c = this.k.c();
                        if (c != null) {
                            if (!this.u) {
                                if (ad(c)) {
                                    if (Y(c)) {
                                        continue;
                                    } else {
                                        this.u = true;
                                    }
                                } else {
                                    return;
                                }
                            }
                            boolean eR = c.eR();
                            this.k.j();
                            this.u = false;
                            this.l = eR;
                            if (eR) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                do {
                    if (ac()) {
                        z = X();
                    } else {
                        z = false;
                    }
                    if (this.m.j(this.r) && ad(this.r)) {
                        if (!Y(this.r)) {
                            ab(this.r);
                            this.m.f(this.r);
                        }
                        z2 = true;
                    }
                    z2 = false;
                } while (z | z2);
            }
        } catch (fwo e) {
            this.s = false;
            this.q.b(e);
        }
    }

    @Override // defpackage.fbd
    public final boolean T() {
        return this.l;
    }

    @Override // defpackage.fbd
    public final boolean U() {
        return true;
    }

    @Override // defpackage.fbf
    public final int V(eqn eqnVar) {
        int i;
        if (erl.b(eqnVar.o) == this.b) {
            i = 4;
        } else {
            i = 0;
        }
        return dzn.d(i);
    }

    protected abstract void W(eqn eqnVar);

    protected abstract boolean X();

    protected abstract boolean Y(ewl ewlVar);

    @Override // defpackage.ezg, defpackage.fbd
    public final fan i() {
        return this.p;
    }

    @Override // defpackage.ezg
    protected final void t(boolean z, boolean z2) {
        this.p.d(this.b, 0L);
    }

    @Override // defpackage.ezg
    protected final void w() {
        fvp fvpVar = this.m;
        if (fvpVar != null) {
            fvpVar.g();
        }
    }

    @Override // defpackage.ezg
    protected final void x() {
        this.s = true;
    }

    @Override // defpackage.ezg
    protected final void y() {
        this.s = false;
    }

    @Override // defpackage.ezg
    protected final void z(eqn[] eqnVarArr, long j, long j2, fgv fgvVar) {
        this.j = j;
    }

    protected eqn Z(eqn eqnVar) {
        return eqnVar;
    }

    protected eqn aa(eqn eqnVar) {
        return eqnVar;
    }

    protected void ab(ewl ewlVar) {
    }
}
