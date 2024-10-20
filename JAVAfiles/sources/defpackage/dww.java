package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dww extends dwy {
    public final dwq a;
    dwr b;

    public dww(dwc dwcVar) {
        super(dwcVar);
        dwq dwqVar = new dwq(this);
        this.a = dwqVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        dwqVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0411  */
    @Override // defpackage.dwy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dww.b():void");
    }

    @Override // defpackage.dwy
    public final void c() {
        dwq dwqVar = this.h;
        if (dwqVar.i) {
            this.d.ak = dwqVar.f;
        }
    }

    @Override // defpackage.dwy
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.dwy
    public final boolean e() {
        if (this.j != 3 || this.d.D == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dwy, defpackage.dwo
    public final void f() {
        float f;
        float f2;
        float f3;
        int i = this.k;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 3) {
                dwr dwrVar = this.e;
                if (dwrVar.c && !dwrVar.i && this.j == 3) {
                    dwc dwcVar = this.d;
                    int i3 = dwcVar.D;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            dwr dwrVar2 = dwcVar.o.e;
                            if (dwrVar2.i) {
                                int i4 = dwcVar.ai;
                                if (i4 != -1) {
                                    if (i4 != 0) {
                                        f = dwrVar2.f;
                                        f2 = dwcVar.ah;
                                    } else {
                                        f3 = dwrVar2.f * dwcVar.ah;
                                        dwrVar.c((int) (f3 + 0.5f));
                                    }
                                } else {
                                    f = dwrVar2.f;
                                    f2 = dwcVar.ah;
                                }
                                f3 = f / f2;
                                dwrVar.c((int) (f3 + 0.5f));
                            }
                        }
                    } else {
                        dwc dwcVar2 = dwcVar.ae;
                        if (dwcVar2 != null) {
                            if (dwcVar2.p.e.i) {
                                dwrVar.c((int) ((r5.f * dwcVar.K) + 0.5f));
                            }
                        }
                    }
                }
                dwq dwqVar = this.h;
                if (dwqVar.c) {
                    dwq dwqVar2 = this.i;
                    if (dwqVar2.c) {
                        if (!dwqVar.i || !dwqVar2.i || !this.e.i) {
                            if (!this.e.i && this.j == 3) {
                                dwc dwcVar3 = this.d;
                                if (dwcVar3.C == 0 && !dwcVar3.S()) {
                                    dwq dwqVar3 = (dwq) this.h.k.get(0);
                                    dwq dwqVar4 = (dwq) this.i.k.get(0);
                                    int i5 = dwqVar3.f;
                                    dwq dwqVar5 = this.h;
                                    int i6 = i5 + dwqVar5.e;
                                    int i7 = dwqVar4.f + this.i.e;
                                    dwqVar5.c(i6);
                                    this.i.c(i7);
                                    this.e.c(i7 - i6);
                                    return;
                                }
                            }
                            if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                                dwq dwqVar6 = (dwq) this.h.k.get(0);
                                dwq dwqVar7 = (dwq) this.i.k.get(0);
                                int i8 = dwqVar6.f + this.h.e;
                                int i9 = dwqVar7.f + this.i.e;
                                dwr dwrVar3 = this.e;
                                int i10 = i9 - i8;
                                int i11 = dwrVar3.m;
                                if (i10 < i11) {
                                    dwrVar3.c(i10);
                                } else {
                                    dwrVar3.c(i11);
                                }
                            }
                            if (this.e.i && this.h.k.size() > 0 && this.i.k.size() > 0) {
                                dwq dwqVar8 = (dwq) this.h.k.get(0);
                                dwq dwqVar9 = (dwq) this.i.k.get(0);
                                int i12 = dwqVar8.f;
                                dwq dwqVar10 = this.h;
                                int i13 = dwqVar10.e + i12;
                                int i14 = dwqVar9.f;
                                int i15 = this.i.e + i14;
                                float f4 = this.d.ap;
                                if (dwqVar8 == dwqVar9) {
                                    f4 = 0.5f;
                                }
                                if (dwqVar8 != dwqVar9) {
                                    i14 = i15;
                                }
                                if (dwqVar8 != dwqVar9) {
                                    i12 = i13;
                                }
                                dwqVar10.c((int) (i12 + 0.5f + (((i14 - i12) - this.e.f) * f4)));
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
            dwc dwcVar4 = this.d;
            m(dwcVar4.U, dwcVar4.W, 1);
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
        this.a.b();
        this.a.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.as));
    }
}
