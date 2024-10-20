package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwf extends dwj {
    public dwc[] aJ;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public float g = 0.5f;
    public float h = 0.5f;
    public float i = 0.5f;
    public float j = 0.5f;
    public float k = 0.5f;
    public float aB = 0.5f;
    public int aC = 0;
    public int aD = 0;
    public int aE = 2;
    public int aF = 2;
    public int aG = 0;
    public int aH = -1;
    public int aI = 0;
    private final ArrayList aY = new ArrayList();
    private dwc[] aZ = null;
    private dwc[] ba = null;
    private int[] bb = null;
    public int aK = 0;

    @Override // defpackage.dwc
    public final void a(dun dunVar, boolean z) {
        boolean z2;
        boolean z3;
        dwc dwcVar;
        float f;
        int i;
        boolean z4;
        super.a(dunVar, z);
        dwc dwcVar2 = this.ae;
        if (dwcVar2 != null && ((dwd) dwcVar2).d) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.aG;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = this.aY.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            dwe dweVar = (dwe) this.aY.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            dweVar.d(z2, i3, z4);
                        }
                    }
                } else if (this.bb != null && this.ba != null && this.aZ != null) {
                    for (int i4 = 0; i4 < this.aK; i4++) {
                        this.aJ[i4].v();
                    }
                    int[] iArr = this.bb;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.g;
                    dwc dwcVar3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.g;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        dwc dwcVar4 = this.ba[i];
                        if (dwcVar4 != null && dwcVar4.ar != 8) {
                            if (i7 == 0) {
                                dwcVar4.q(dwcVar4.T, this.T, this.aR);
                                dwcVar4.at = this.a;
                                dwcVar4.ao = f;
                                i7 = 0;
                            }
                            if (i7 == i5 - 1) {
                                dwcVar4.q(dwcVar4.V, this.V, this.aS);
                            }
                            if (i7 > 0 && dwcVar3 != null) {
                                dwcVar4.q(dwcVar4.T, dwcVar3.V, this.aC);
                                dwcVar3.q(dwcVar3.V, dwcVar4.T, 0);
                            }
                            dwcVar3 = dwcVar4;
                        }
                        i7++;
                        f2 = f;
                    }
                    int i8 = 0;
                    while (i8 < i6) {
                        dwc dwcVar5 = this.aZ[i8];
                        if (dwcVar5 != null && dwcVar5.ar != 8) {
                            if (i8 == 0) {
                                dwcVar5.q(dwcVar5.U, this.U, this.aN);
                                dwcVar5.au = this.b;
                                dwcVar5.ap = this.h;
                                i8 = 0;
                            }
                            if (i8 == i6 - 1) {
                                dwcVar5.q(dwcVar5.W, this.W, this.aO);
                            }
                            if (i8 > 0 && dwcVar3 != null) {
                                dwcVar5.q(dwcVar5.U, dwcVar3.W, this.aD);
                                dwcVar3.q(dwcVar3.W, dwcVar5.U, 0);
                            }
                            dwcVar3 = dwcVar5;
                        }
                        i8++;
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            int i11 = (i10 * i5) + i9;
                            if (this.aI == 1) {
                                i11 = (i9 * i6) + i10;
                            }
                            dwc[] dwcVarArr = this.aJ;
                            if (i11 < dwcVarArr.length && (dwcVar = dwcVarArr[i11]) != null && dwcVar.ar != 8) {
                                dwc dwcVar6 = this.ba[i9];
                                dwc dwcVar7 = this.aZ[i10];
                                if (dwcVar != dwcVar6) {
                                    dwcVar.q(dwcVar.T, dwcVar6.T, 0);
                                    dwcVar.q(dwcVar.V, dwcVar6.V, 0);
                                }
                                if (dwcVar != dwcVar7) {
                                    dwcVar.q(dwcVar.U, dwcVar7.U, 0);
                                    dwcVar.q(dwcVar.W, dwcVar7.W, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = this.aY.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    dwe dweVar2 = (dwe) this.aY.get(i12);
                    if (i12 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    dweVar2.d(z2, i12, z3);
                }
            }
        } else if (this.aY.size() > 0) {
            ((dwe) this.aY.get(0)).d(z2, 0, true);
        }
        this.aT = false;
    }

    public final int ae(dwc dwcVar, int i) {
        if (dwcVar == null) {
            return 0;
        }
        if (dwcVar.W() == 3) {
            int i2 = dwcVar.C;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dwcVar.H * i);
                if (i3 != dwcVar.j()) {
                    dwcVar.r = true;
                    ak(dwcVar, 1, i3, dwcVar.X(), dwcVar.h());
                }
                return i3;
            }
            if (i2 != 1 && i2 == 3) {
                return (int) ((dwcVar.h() * dwcVar.ah) + 0.5f);
            }
        }
        return dwcVar.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x070f  */
    @Override // defpackage.dwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwf.b(int, int, int, int):void");
    }

    public final int c(dwc dwcVar, int i) {
        if (dwcVar == null) {
            return 0;
        }
        if (dwcVar.X() == 3) {
            int i2 = dwcVar.D;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dwcVar.K * i);
                if (i3 != dwcVar.h()) {
                    dwcVar.r = true;
                    ak(dwcVar, dwcVar.W(), dwcVar.j(), 1, i3);
                }
                return i3;
            }
            if (i2 != 1 && i2 == 3) {
                return (int) ((dwcVar.j() * dwcVar.ah) + 0.5f);
            }
        }
        return dwcVar.h();
    }
}
