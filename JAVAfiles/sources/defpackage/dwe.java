package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwe {
    public dwc a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ dwf h;
    private int i;
    private dwb j;
    private dwb k;
    private dwb l;
    private dwb m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public dwe(dwf dwfVar, int i, dwb dwbVar, dwb dwbVar2, dwb dwbVar3, dwb dwbVar4, int i2) {
        this.h = dwfVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = dwbVar;
        this.k = dwbVar2;
        this.l = dwbVar3;
        this.m = dwbVar4;
        this.n = dwfVar.aR;
        this.o = dwfVar.aN;
        this.p = dwfVar.aS;
        this.q = dwfVar.aO;
        this.r = i2;
    }

    public final int a() {
        if (this.i == 1) {
            return this.d - this.h.aD;
        }
        return this.d;
    }

    public final int b() {
        if (this.i == 0) {
            return this.c - this.h.aC;
        }
        return this.c;
    }

    public final void c(dwc dwcVar) {
        int i = 0;
        if (this.i == 0) {
            int ae = this.h.ae(dwcVar, this.r);
            if (dwcVar.W() == 3) {
                this.g++;
                ae = 0;
            }
            dwf dwfVar = this.h;
            int i2 = dwfVar.aC;
            if (dwcVar.ar != 8) {
                i = i2;
            }
            this.c += ae + i;
            int c = dwfVar.c(dwcVar, this.r);
            if (this.a == null || this.b < c) {
                this.a = dwcVar;
                this.b = c;
                this.d = c;
            }
        } else {
            int ae2 = this.h.ae(dwcVar, this.r);
            int c2 = this.h.c(dwcVar, this.r);
            if (dwcVar.X() == 3) {
                this.g++;
                c2 = 0;
            }
            int i3 = this.h.aD;
            if (dwcVar.ar != 8) {
                i = i3;
            }
            this.d += c2 + i;
            if (this.a == null || this.b < ae2) {
                this.a = dwcVar;
                this.b = ae2;
                this.c = ae2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwe.d(boolean, int, boolean):void");
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 != 0) {
            int i3 = this.f;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.e + i5;
                dwf dwfVar = this.h;
                if (i6 >= dwfVar.aK) {
                    break;
                }
                dwc dwcVar = dwfVar.aJ[i6];
                if (this.i == 0) {
                    if (dwcVar != null && dwcVar.W() == 3 && dwcVar.C == 0) {
                        this.h.ak(dwcVar, 1, i4, dwcVar.X(), dwcVar.h());
                    }
                } else if (dwcVar != null && dwcVar.X() == 3 && dwcVar.D == 0) {
                    this.h.ak(dwcVar, dwcVar.W(), dwcVar.j(), 1, i4);
                }
            }
            this.c = 0;
            this.d = 0;
            this.a = null;
            this.b = 0;
            int i7 = this.f;
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = this.e + i8;
                dwf dwfVar2 = this.h;
                if (i9 < dwfVar2.aK) {
                    dwc dwcVar2 = dwfVar2.aJ[i9];
                    if (this.i == 0) {
                        int j = dwcVar2.j();
                        dwf dwfVar3 = this.h;
                        int i10 = dwfVar3.aC;
                        if (dwcVar2.ar == 8) {
                            i10 = 0;
                        }
                        this.c += j + i10;
                        int c = dwfVar3.c(dwcVar2, this.r);
                        if (this.a == null || this.b < c) {
                            this.a = dwcVar2;
                            this.b = c;
                            this.d = c;
                        }
                    } else {
                        int ae = dwfVar2.ae(dwcVar2, this.r);
                        int c2 = this.h.c(dwcVar2, this.r);
                        int i11 = this.h.aD;
                        if (dwcVar2.ar == 8) {
                            i11 = 0;
                        }
                        this.d += c2 + i11;
                        if (this.a == null || this.b < ae) {
                            this.a = dwcVar2;
                            this.b = ae;
                            this.c = ae;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, dwb dwbVar, dwb dwbVar2, dwb dwbVar3, dwb dwbVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = dwbVar;
        this.k = dwbVar2;
        this.l = dwbVar3;
        this.m = dwbVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
