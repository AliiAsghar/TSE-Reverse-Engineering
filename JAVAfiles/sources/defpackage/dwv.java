package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwv extends dwy {
    private static final int[] a = new int[2];

    public dwv(dwc dwcVar) {
        super(dwcVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.dwy
    public final void b() {
        dwc dwcVar;
        dwc dwcVar2;
        dwc dwcVar3;
        dwc dwcVar4 = this.d;
        if (dwcVar4.l) {
            this.e.c(dwcVar4.j());
        }
        if (!this.e.i) {
            int W = this.d.W();
            this.j = W;
            if (W != 3) {
                if (this.j == 4 && (dwcVar3 = this.d.ae) != null && (dwcVar3.W() == 1 || dwcVar3.W() == 4)) {
                    int j = (dwcVar3.j() - this.d.T.b()) - this.d.V.b();
                    j(this.h, dwcVar3.o.h, this.d.T.b());
                    j(this.i, dwcVar3.o.i, -this.d.V.b());
                    this.e.c(j);
                    return;
                }
                if (this.j == 1) {
                    this.e.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (dwcVar = this.d.ae) != null && (dwcVar.W() == 1 || dwcVar.W() == 4)) {
            j(this.h, dwcVar.o.h, this.d.T.b());
            j(this.i, dwcVar.o.i, -this.d.V.b());
            return;
        }
        dwr dwrVar = this.e;
        if (dwrVar.i) {
            dwc dwcVar5 = this.d;
            if (dwcVar5.l) {
                dwb[] dwbVarArr = dwcVar5.ab;
                dwb dwbVar = dwbVarArr[0];
                dwb dwbVar2 = dwbVar.e;
                if (dwbVar2 != null && dwbVarArr[1].e != null) {
                    if (dwcVar5.R()) {
                        this.h.e = this.d.ab[0].b();
                        this.i.e = -this.d.ab[1].b();
                        return;
                    }
                    dwq k = k(this.d.ab[0]);
                    if (k != null) {
                        j(this.h, k, this.d.ab[0].b());
                    }
                    dwq k2 = k(this.d.ab[1]);
                    if (k2 != null) {
                        j(this.i, k2, -this.d.ab[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (dwbVar2 != null) {
                    dwq k3 = k(dwbVar);
                    if (k3 != null) {
                        j(this.h, k3, this.d.ab[0].b());
                        j(this.i, this.h, this.e.f);
                        return;
                    }
                    return;
                }
                dwb dwbVar3 = dwbVarArr[1];
                if (dwbVar3.e != null) {
                    dwq k4 = k(dwbVar3);
                    if (k4 != null) {
                        j(this.i, k4, -this.d.ab[1].b());
                        j(this.h, this.i, -this.e.f);
                        return;
                    }
                    return;
                }
                if (!(dwcVar5 instanceof dwh) && dwcVar5.ae != null && dwcVar5.U(7).e == null) {
                    dwc dwcVar6 = this.d;
                    j(this.h, dwcVar6.ae.o.h, dwcVar6.k());
                    j(this.i, this.h, this.e.f);
                    return;
                }
                return;
            }
        }
        if (this.j == 3) {
            dwc dwcVar7 = this.d;
            int i = dwcVar7.C;
            if (i != 2) {
                if (i == 3) {
                    if (dwcVar7.D == 3) {
                        this.h.a = this;
                        this.i.a = this;
                        dww dwwVar = dwcVar7.p;
                        dwwVar.h.a = this;
                        dwwVar.i.a = this;
                        dwrVar.a = this;
                        if (dwcVar7.S()) {
                            this.e.k.add(this.d.p.e);
                            this.d.p.e.j.add(this.e);
                            dww dwwVar2 = this.d.p;
                            dwwVar2.e.a = this;
                            this.e.k.add(dwwVar2.h);
                            this.e.k.add(this.d.p.i);
                            this.d.p.h.j.add(this.e);
                            this.d.p.i.j.add(this.e);
                        } else if (this.d.R()) {
                            this.d.p.e.k.add(this.e);
                            this.e.j.add(this.d.p.e);
                        } else {
                            this.d.p.e.k.add(this.e);
                        }
                    } else {
                        dwr dwrVar2 = dwcVar7.p.e;
                        dwrVar.k.add(dwrVar2);
                        dwrVar2.j.add(this.e);
                        this.d.p.h.j.add(this.e);
                        this.d.p.i.j.add(this.e);
                        dwr dwrVar3 = this.e;
                        dwrVar3.b = true;
                        dwrVar3.j.add(this.h);
                        this.e.j.add(this.i);
                        this.h.k.add(this.e);
                        this.i.k.add(this.e);
                    }
                }
            } else {
                dwc dwcVar8 = dwcVar7.ae;
                if (dwcVar8 != null) {
                    dwr dwrVar4 = dwcVar8.p.e;
                    dwrVar.k.add(dwrVar4);
                    dwrVar4.j.add(this.e);
                    dwr dwrVar5 = this.e;
                    dwrVar5.b = true;
                    dwrVar5.j.add(this.h);
                    this.e.j.add(this.i);
                }
            }
        }
        dwc dwcVar9 = this.d;
        dwb[] dwbVarArr2 = dwcVar9.ab;
        dwb dwbVar4 = dwbVarArr2[0];
        dwb dwbVar5 = dwbVar4.e;
        if (dwbVar5 != null && dwbVarArr2[1].e != null) {
            if (dwcVar9.R()) {
                this.h.e = this.d.ab[0].b();
                this.i.e = -this.d.ab[1].b();
                return;
            }
            dwq k5 = k(this.d.ab[0]);
            dwq k6 = k(this.d.ab[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.k = 4;
            return;
        }
        if (dwbVar5 != null) {
            dwq k7 = k(dwbVar4);
            if (k7 != null) {
                j(this.h, k7, this.d.ab[0].b());
                i(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        dwb dwbVar6 = dwbVarArr2[1];
        if (dwbVar6.e != null) {
            dwq k8 = k(dwbVar6);
            if (k8 != null) {
                j(this.i, k8, -this.d.ab[1].b());
                i(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if (!(dwcVar9 instanceof dwh) && (dwcVar2 = dwcVar9.ae) != null) {
            j(this.h, dwcVar2.o.h, dwcVar9.k());
            i(this.i, this.h, 1, this.e);
        }
    }

    @Override // defpackage.dwy
    public final void c() {
        dwq dwqVar = this.h;
        if (dwqVar.i) {
            this.d.aj = dwqVar.f;
        }
    }

    @Override // defpackage.dwy
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.dwy
    public final boolean e() {
        if (this.j != 3 || this.d.C == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dwy, defpackage.dwo
    public final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        int i = this.k;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 3) {
                dwr dwrVar = this.e;
                if (!dwrVar.i && this.j == 3) {
                    dwc dwcVar = this.d;
                    int i3 = dwcVar.C;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int i4 = dwcVar.D;
                            if (i4 != 0 && i4 != 3) {
                                int i5 = dwcVar.ai;
                                if (i5 != -1) {
                                    if (i5 != 0) {
                                        f = dwcVar.p.e.f;
                                        f2 = dwcVar.ah;
                                    } else {
                                        f3 = dwcVar.p.e.f / dwcVar.ah;
                                        dwrVar.c((int) (f3 + 0.5f));
                                    }
                                } else {
                                    f = dwcVar.p.e.f;
                                    f2 = dwcVar.ah;
                                }
                                f3 = f * f2;
                                dwrVar.c((int) (f3 + 0.5f));
                            } else {
                                dww dwwVar = dwcVar.p;
                                dwq dwqVar = dwwVar.h;
                                dwq dwqVar2 = dwwVar.i;
                                if (dwcVar.T.e != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (dwcVar.U.e != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (dwcVar.V.e != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (dwcVar.W.e != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int i6 = dwcVar.ai;
                                if (z && z2 && z3 && z4) {
                                    float f4 = dwcVar.ah;
                                    if (dwqVar.i && dwqVar2.i) {
                                        dwq dwqVar3 = this.h;
                                        if (dwqVar3.c && this.i.c) {
                                            int i7 = ((dwq) dwqVar3.k.get(0)).f + this.h.e;
                                            int i8 = ((dwq) this.i.k.get(0)).f - this.i.e;
                                            int i9 = dwqVar.f + dwqVar.e;
                                            int i10 = dwqVar2.f - dwqVar2.e;
                                            int[] iArr = a;
                                            n(iArr, i7, i8, i9, i10, f4, i6);
                                            this.e.c(iArr[0]);
                                            this.d.p.e.c(iArr[1]);
                                            return;
                                        }
                                        return;
                                    }
                                    dwq dwqVar4 = this.h;
                                    if (dwqVar4.i) {
                                        dwq dwqVar5 = this.i;
                                        if (dwqVar5.i) {
                                            if (dwqVar.c && dwqVar2.c) {
                                                int i11 = dwqVar4.f + dwqVar4.e;
                                                int i12 = dwqVar5.f - dwqVar5.e;
                                                int i13 = ((dwq) dwqVar.k.get(0)).f + dwqVar.e;
                                                int i14 = ((dwq) dwqVar2.k.get(0)).f - dwqVar2.e;
                                                int[] iArr2 = a;
                                                n(iArr2, i11, i12, i13, i14, f4, i6);
                                                this.e.c(iArr2[0]);
                                                this.d.p.e.c(iArr2[1]);
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    dwq dwqVar6 = this.h;
                                    if (dwqVar6.c && this.i.c && dwqVar.c && dwqVar2.c) {
                                        int i15 = ((dwq) dwqVar6.k.get(0)).f + this.h.e;
                                        int i16 = ((dwq) this.i.k.get(0)).f - this.i.e;
                                        int i17 = ((dwq) dwqVar.k.get(0)).f + dwqVar.e;
                                        int i18 = ((dwq) dwqVar2.k.get(0)).f - dwqVar2.e;
                                        int[] iArr3 = a;
                                        n(iArr3, i15, i16, i17, i18, f4, i6);
                                        this.e.c(iArr3[0]);
                                        this.d.p.e.c(iArr3[1]);
                                    } else {
                                        return;
                                    }
                                } else if (z && z3) {
                                    dwq dwqVar7 = this.h;
                                    if (dwqVar7.c && this.i.c) {
                                        float f5 = dwcVar.ah;
                                        int i19 = (((dwq) this.i.k.get(0)).f - this.i.e) - (((dwq) dwqVar7.k.get(0)).f + this.h.e);
                                        if (i6 != -1 && i6 != 0) {
                                            int h = h(i19, 0);
                                            int i20 = (int) ((h / f5) + 0.5f);
                                            int h2 = h(i20, 1);
                                            if (i20 != h2) {
                                                h = (int) ((h2 * f5) + 0.5f);
                                            }
                                            this.e.c(h);
                                            this.d.p.e.c(h2);
                                        } else {
                                            int h3 = h(i19, 0);
                                            int i21 = (int) ((h3 * f5) + 0.5f);
                                            int h4 = h(i21, 1);
                                            if (i21 != h4) {
                                                h3 = (int) ((h4 / f5) + 0.5f);
                                            }
                                            this.e.c(h3);
                                            this.d.p.e.c(h4);
                                        }
                                    } else {
                                        return;
                                    }
                                } else if (z2 && z4) {
                                    if (dwqVar.c && dwqVar2.c) {
                                        float f6 = dwcVar.ah;
                                        int i22 = (((dwq) dwqVar2.k.get(0)).f - dwqVar2.e) - (((dwq) dwqVar.k.get(0)).f + dwqVar.e);
                                        if (i6 != 0) {
                                            int h5 = h(i22, 1);
                                            int i23 = (int) ((h5 / f6) + 0.5f);
                                            int h6 = h(i23, 0);
                                            if (i23 != h6) {
                                                h5 = (int) ((h6 * f6) + 0.5f);
                                            }
                                            this.e.c(h6);
                                            this.d.p.e.c(h5);
                                        } else {
                                            int h7 = h(i22, 1);
                                            int i24 = (int) ((h7 * f6) + 0.5f);
                                            int h8 = h(i24, 0);
                                            if (i24 != h8) {
                                                h7 = (int) ((h8 / f6) + 0.5f);
                                            }
                                            this.e.c(h8);
                                            this.d.p.e.c(h7);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        dwc dwcVar2 = dwcVar.ae;
                        if (dwcVar2 != null) {
                            if (dwcVar2.o.e.i) {
                                dwrVar.c((int) ((r7.f * dwcVar.H) + 0.5f));
                            }
                        }
                    }
                }
                dwq dwqVar8 = this.h;
                if (dwqVar8.c) {
                    dwq dwqVar9 = this.i;
                    if (dwqVar9.c) {
                        if (!dwqVar8.i || !dwqVar9.i || !this.e.i) {
                            if (!this.e.i && this.j == 3) {
                                dwc dwcVar3 = this.d;
                                if (dwcVar3.C == 0 && !dwcVar3.R()) {
                                    dwq dwqVar10 = (dwq) this.h.k.get(0);
                                    dwq dwqVar11 = (dwq) this.i.k.get(0);
                                    int i25 = dwqVar10.f;
                                    dwq dwqVar12 = this.h;
                                    int i26 = i25 + dwqVar12.e;
                                    int i27 = dwqVar11.f + this.i.e;
                                    dwqVar12.c(i26);
                                    this.i.c(i27);
                                    this.e.c(i27 - i26);
                                    return;
                                }
                            }
                            if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                                dwq dwqVar13 = (dwq) this.h.k.get(0);
                                dwq dwqVar14 = (dwq) this.i.k.get(0);
                                int min = Math.min((dwqVar14.f + this.i.e) - (dwqVar13.f + this.h.e), this.e.m);
                                dwc dwcVar4 = this.d;
                                int i28 = dwcVar4.G;
                                int max = Math.max(dwcVar4.F, min);
                                if (i28 > 0) {
                                    max = Math.min(i28, max);
                                }
                                this.e.c(max);
                            }
                            if (this.e.i) {
                                dwq dwqVar15 = (dwq) this.h.k.get(0);
                                dwq dwqVar16 = (dwq) this.i.k.get(0);
                                int i29 = dwqVar15.f;
                                dwq dwqVar17 = this.h;
                                int i30 = dwqVar17.e + i29;
                                int i31 = dwqVar16.f;
                                int i32 = this.i.e + i31;
                                float f7 = this.d.ao;
                                if (dwqVar15 == dwqVar16) {
                                    f7 = 0.5f;
                                }
                                if (dwqVar15 != dwqVar16) {
                                    i31 = i32;
                                }
                                if (dwqVar15 != dwqVar16) {
                                    i29 = i30;
                                }
                                dwqVar17.c((int) (i29 + 0.5f + (((i31 - i29) - this.e.f) * f7)));
                                this.i.c(this.h.f + this.e.f);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            dwc dwcVar5 = this.d;
            m(dwcVar5.T, dwcVar5.V, 0);
            return;
        }
        throw null;
    }

    public final void g() {
        this.g = false;
        this.h.b();
        this.h.i = false;
        this.i.b();
        this.i.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.as));
    }
}
