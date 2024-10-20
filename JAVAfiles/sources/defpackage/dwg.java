package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwg extends dwc {
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public dwb d = this.U;
    public int e = 0;
    private boolean f;

    public dwg() {
        this.ac.clear();
        this.ac.add(this.d);
        int length = this.ab.length;
        for (int i = 0; i < 6; i++) {
            this.ab[i] = this.d;
        }
    }

    @Override // defpackage.dwc
    public final dwb U(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.e != 0) {
                return null;
            }
            return this.d;
        }
        if (this.e != 1) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.dwc
    public final void a(dun dunVar, boolean z) {
        boolean z2;
        dwd dwdVar = (dwd) this.ae;
        if (dwdVar != null) {
            Object U = dwdVar.U(2);
            Object U2 = dwdVar.U(4);
            dwc dwcVar = this.ae;
            boolean z3 = true;
            if (dwcVar != null && dwcVar.aA[0] == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.e == 0) {
                U = dwdVar.U(3);
                U2 = dwdVar.U(5);
                if (dwcVar == null || dwcVar.aA[1] != 2) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.f) {
                dwb dwbVar = this.d;
                if (dwbVar.c) {
                    duq b = dunVar.b(dwbVar);
                    dunVar.f(b, this.d.a());
                    if (this.b != -1) {
                        if (z2) {
                            dunVar.g(dunVar.b(U2), b, 0, 5);
                        }
                    } else if (this.c != -1 && z2) {
                        duq b2 = dunVar.b(U2);
                        dunVar.g(b, dunVar.b(U), 0, 5);
                        dunVar.g(b2, b, 0, 5);
                    }
                    this.f = false;
                    return;
                }
            }
            if (this.b != -1) {
                duq b3 = dunVar.b(this.d);
                dunVar.m(b3, dunVar.b(U), this.b, 8);
                if (z2) {
                    dunVar.g(dunVar.b(U2), b3, 0, 5);
                    return;
                }
                return;
            }
            if (this.c != -1) {
                duq b4 = dunVar.b(this.d);
                duq b5 = dunVar.b(U2);
                dunVar.m(b4, b5, -this.c, 8);
                if (z2) {
                    dunVar.g(b4, dunVar.b(U), 0, 5);
                    dunVar.g(b5, b4, 0, 5);
                    return;
                }
                return;
            }
            if (this.a != -1.0f) {
                duq b6 = dunVar.b(this.d);
                duq b7 = dunVar.b(U2);
                float f = this.a;
                dum a = dunVar.a();
                a.e.g(b6, -1.0f);
                a.e.g(b7, f);
                dunVar.e(a);
            }
        }
    }

    @Override // defpackage.dwc
    public final void ac(boolean z) {
        if (this.ae == null) {
            return;
        }
        int o = dun.o(this.d);
        if (this.e == 1) {
            this.aj = o;
            this.ak = 0;
            B(this.ae.h());
            M(0);
            return;
        }
        this.aj = 0;
        this.ak = o;
        M(this.ae.j());
        B(0);
    }

    public final void ae(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.c = i;
        }
    }

    public final void af(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.c = -1;
        }
    }

    public final void ag(int i) {
        if (this.e != i) {
            this.e = i;
            this.ac.clear();
            if (this.e == 1) {
                this.d = this.T;
            } else {
                this.d = this.U;
            }
            this.ac.add(this.d);
            int length = this.ab.length;
            for (int i2 = 0; i2 < 6; i2++) {
                this.ab[i2] = this.d;
            }
        }
    }

    @Override // defpackage.dwc
    public final boolean ay() {
        return true;
    }

    public final void b(int i) {
        this.d.f(i);
        this.f = true;
    }

    public final void c(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.c = -1;
        }
    }

    @Override // defpackage.dwc
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.dwc
    public final boolean f() {
        return this.f;
    }
}
