package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvy extends dwj {
    dwd a;
    private dwc[] aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private boolean[][] aH;
    private int[][] aI;
    private int[][] aJ;
    public float c;
    public float d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public int k;
    public boolean b = false;
    Set j = new HashSet();
    private int aK = 0;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dvy() {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.b = r0
            r6.aG = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r6.j = r1
            r6.aK = r0
            r6.aq()
            int[][] r1 = r6.aI
            r2 = 1
            if (r1 == 0) goto L30
            int r3 = r6.aM
            int r1 = r1.length
            if (r1 != r3) goto L30
            boolean[][] r1 = r6.aH
            if (r1 == 0) goto L30
            int r3 = r6.aC
            int r4 = r1.length
            if (r4 != r3) goto L30
            r1 = r1[r0]
            int r1 = r1.length
            int r3 = r6.aE
            if (r1 != r3) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r0
        L31:
            if (r1 != 0) goto L36
            r6.ap()
        L36:
            if (r1 == 0) goto L69
            r1 = r0
        L39:
            boolean[][] r3 = r6.aH
            int r3 = r3.length
            if (r1 >= r3) goto L50
            r3 = r0
        L3f:
            boolean[][] r4 = r6.aH
            r5 = r4[r0]
            int r5 = r5.length
            if (r3 >= r5) goto L4d
            r4 = r4[r1]
            r4[r3] = r2
            int r3 = r3 + 1
            goto L3f
        L4d:
            int r1 = r1 + 1
            goto L39
        L50:
            r1 = r0
        L51:
            int[][] r3 = r6.aI
            int r3 = r3.length
            if (r1 >= r3) goto L69
            r3 = r0
        L57:
            int[][] r4 = r6.aI
            r5 = r4[r0]
            int r5 = r5.length
            if (r3 >= r5) goto L66
            r4 = r4[r1]
            r5 = -1
            r4[r3] = r5
            int r3 = r3 + 1
            goto L57
        L66:
            int r1 = r1 + 1
            goto L51
        L69:
            r6.aG = r0
            java.lang.String r1 = r6.h
            if (r1 == 0) goto L84
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L84
            java.lang.String r1 = r6.h
            int[][] r0 = r6.at(r1, r0)
            if (r0 == 0) goto L84
            r6.an(r0)
        L84:
            java.lang.String r0 = r6.g
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            java.lang.String r0 = r6.g
            int[][] r0 = r6.at(r0, r2)
            if (r0 == 0) goto L9d
            r6.ao(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvy.<init>():void");
    }

    private final int ae(int i) {
        if (this.i == 1) {
            return i / this.aC;
        }
        return i % this.aE;
    }

    private final int al(int i) {
        if (this.i == 1) {
            return i % this.aC;
        }
        return i / this.aE;
    }

    private final void am(dwc dwcVar, int i, int i2, int i3, int i4) {
        dwcVar.T.l(this.aB[i2].T, 0);
        dwcVar.U.l(this.aB[i].U, 0);
        dwcVar.V.l(this.aB[(i2 + i4) - 1].V, 0);
        dwcVar.W.l(this.aB[(i + i3) - 1].W, 0);
    }

    private final void an(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!ar(al(iArr2[0]), ae(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private final void ao(int[][] iArr) {
        if (!as()) {
            for (int i = 0; i < iArr.length; i++) {
                int al = al(iArr[i][0]);
                int ae = ae(iArr[i][0]);
                int[] iArr2 = iArr[i];
                if (ar(al, ae, iArr2[1], iArr2[2])) {
                    dwc dwcVar = this.aL[i];
                    int[] iArr3 = iArr[i];
                    am(dwcVar, al, ae, iArr3[1], iArr3[2]);
                    this.j.add(this.aL[i].v);
                } else {
                    return;
                }
            }
        }
    }

    private final void ap() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.aC, this.aE);
        this.aH = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.aM;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.aI = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private final void aq() {
        int i;
        int i2 = this.aD;
        if (i2 != 0 && (i = this.aF) != 0) {
            this.aC = i2;
            this.aE = i;
            return;
        }
        int i3 = this.aF;
        if (i3 > 0) {
            this.aE = i3;
            this.aC = ((this.aM + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.aC = i2;
            this.aE = ((this.aM + i2) - 1) / i2;
        } else {
            int sqrt = (int) (Math.sqrt(this.aM) + 1.5d);
            this.aC = sqrt;
            this.aE = ((this.aM + sqrt) - 1) / sqrt;
        }
    }

    private final boolean ar(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.aH;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final boolean as() {
        if ((this.k & 2) > 0) {
            return true;
        }
        return false;
    }

    private final int[][] at(String str, boolean z) {
        try {
            String[] split = str.split(",");
            Arrays.sort(split, new ebn(1));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
            if (this.aC != 1 && this.aE != 1) {
                for (int i = 0; i < split.length; i++) {
                    String[] split2 = split[i].trim().split(":");
                    String[] split3 = split2[1].split("x");
                    iArr[i][0] = Integer.parseInt(split2[0]);
                    if ((this.k & 1) > 0) {
                        iArr[i][1] = Integer.parseInt(split3[1]);
                        iArr[i][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i][1] = Integer.parseInt(split3[0]);
                        iArr[i][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < split.length; i4++) {
                String[] split4 = split[i4].trim().split(":");
                iArr[i4][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i4];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.aE == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i2 += iArr[i4][1];
                    if (z) {
                        i2--;
                    }
                }
                if (this.aC == 1) {
                    iArr[i4][2] = Integer.parseInt(split4[1]);
                    i3 += iArr[i4][2];
                    if (z) {
                        i3--;
                    }
                }
            }
            if (i2 != 0 && !this.b) {
                d(this.aC + i2);
            }
            if (i3 != 0 && !this.b) {
                c(this.aE + i3);
            }
            this.b = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private static final void au(dwc dwcVar) {
        dwcVar.D(-1.0f);
        dwcVar.T.e();
        dwcVar.V.e();
    }

    private static final void av(dwc dwcVar) {
        dwcVar.L(-1.0f);
        dwcVar.U.e();
        dwcVar.W.e();
        dwcVar.X.e();
    }

    private static final dwc aw() {
        dwc dwcVar = new dwc();
        int[] iArr = dwcVar.aA;
        iArr[0] = 3;
        iArr[1] = 3;
        dwcVar.v = String.valueOf(dwcVar.hashCode());
        return dwcVar;
    }

    private static final float[] ax(int i, String str) {
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",");
            float[] fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < split.length) {
                    try {
                        fArr[i2] = Float.parseFloat(split[i2]);
                    } catch (Exception e) {
                        System.err.println("Error parsing `" + split[i2] + "`: " + e.getMessage());
                        fArr[i2] = 1.0f;
                    }
                } else {
                    fArr[i2] = 1.0f;
                }
            }
            return fArr;
        }
        return null;
    }

    @Override // defpackage.dwc
    public final void a(dun dunVar, boolean z) {
        int i;
        int i2;
        int[][] iArr;
        int i3;
        super.a(dunVar, z);
        int max = Math.max(this.aC, this.aE);
        dwc dwcVar = this.aB[0];
        float[] ax = ax(this.aC, this.e);
        if (this.aC == 1) {
            av(dwcVar);
            dwcVar.U.l(this.U, 0);
            dwcVar.W.l(this.W, 0);
        } else {
            int i4 = 0;
            while (true) {
                i = this.aC;
                if (i4 >= i) {
                    break;
                }
                dwc dwcVar2 = this.aB[i4];
                av(dwcVar2);
                if (ax != null) {
                    dwcVar2.L(ax[i4]);
                }
                if (i4 > 0) {
                    dwcVar2.U.l(this.aB[i4 - 1].W, 0);
                } else {
                    dwcVar2.U.l(this.U, 0);
                }
                if (i4 < this.aC - 1) {
                    dwcVar2.W.l(this.aB[i4 + 1].U, 0);
                } else {
                    dwcVar2.W.l(this.W, 0);
                }
                if (i4 > 0) {
                    dwcVar2.U.f = (int) this.d;
                }
                i4++;
            }
            while (i < max) {
                dwc dwcVar3 = this.aB[i];
                av(dwcVar3);
                dwcVar3.U.l(this.U, 0);
                dwcVar3.W.l(this.W, 0);
                i++;
            }
        }
        int max2 = Math.max(this.aC, this.aE);
        dwc dwcVar4 = this.aB[0];
        float[] ax2 = ax(this.aE, this.f);
        if (this.aE == 1) {
            au(dwcVar4);
            dwcVar4.T.l(this.T, 0);
            dwcVar4.V.l(this.V, 0);
        } else {
            int i5 = 0;
            while (true) {
                i2 = this.aE;
                if (i5 >= i2) {
                    break;
                }
                dwc dwcVar5 = this.aB[i5];
                au(dwcVar5);
                if (ax2 != null) {
                    dwcVar5.D(ax2[i5]);
                }
                if (i5 > 0) {
                    dwcVar5.T.l(this.aB[i5 - 1].V, 0);
                } else {
                    dwcVar5.T.l(this.T, 0);
                }
                if (i5 < this.aE - 1) {
                    dwcVar5.V.l(this.aB[i5 + 1].T, 0);
                } else {
                    dwcVar5.V.l(this.V, 0);
                }
                if (i5 > 0) {
                    dwcVar5.T.f = (int) this.c;
                }
                i5++;
            }
            while (i2 < max2) {
                dwc dwcVar6 = this.aB[i2];
                au(dwcVar6);
                dwcVar6.T.l(this.T, 0);
                dwcVar6.V.l(this.V, 0);
                i2++;
            }
        }
        for (int i6 = 0; i6 < this.aM; i6++) {
            if (!this.j.contains(this.aL[i6].v)) {
                boolean z2 = false;
                int i7 = 0;
                while (true) {
                    if (z2) {
                        break;
                    }
                    i7 = this.aG;
                    if (i7 >= this.aC * this.aE) {
                        i7 = -1;
                        break;
                    }
                    int al = al(i7);
                    int ae = ae(this.aG);
                    boolean[] zArr = this.aH[al];
                    if (zArr[ae]) {
                        zArr[ae] = false;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.aG++;
                }
                int al2 = al(i7);
                int ae2 = ae(i7);
                if (i7 != -1) {
                    if (as() && (iArr = this.aJ) != null && (i3 = this.aK) < iArr.length) {
                        int[] iArr2 = iArr[i3];
                        if (iArr2[0] == i7) {
                            this.aH[al2][ae2] = true;
                            if (ar(al2, ae2, iArr2[1], iArr2[2])) {
                                dwc dwcVar7 = this.aL[i6];
                                int[] iArr3 = this.aJ[this.aK];
                                am(dwcVar7, al2, ae2, iArr3[1], iArr3[2]);
                                this.aK++;
                            }
                        }
                    }
                    am(this.aL[i6], al2, ae2, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.dwj
    public final void b(int i, int i2, int i3, int i4) {
        int[][] at;
        this.a = (dwd) this.ae;
        if (this.aC > 0 && this.aE > 0) {
            this.aG = 0;
            String str = this.h;
            if (str != null && !str.trim().isEmpty() && (at = at(this.h, false)) != null) {
                an(at);
            }
            String str2 = this.g;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.aJ = at(this.g, true);
            }
            int max = Math.max(this.aC, this.aE);
            dwc[] dwcVarArr = this.aB;
            if (dwcVarArr == null) {
                this.aB = new dwc[max];
                int i5 = 0;
                while (true) {
                    dwc[] dwcVarArr2 = this.aB;
                    if (i5 >= dwcVarArr2.length) {
                        break;
                    }
                    dwcVarArr2[i5] = aw();
                    i5++;
                }
            } else if (max != dwcVarArr.length) {
                dwc[] dwcVarArr3 = new dwc[max];
                for (int i6 = 0; i6 < max; i6++) {
                    dwc[] dwcVarArr4 = this.aB;
                    if (i6 < dwcVarArr4.length) {
                        dwcVarArr3[i6] = dwcVarArr4[i6];
                    } else {
                        dwcVarArr3[i6] = aw();
                    }
                }
                while (true) {
                    dwc[] dwcVarArr5 = this.aB;
                    if (max >= dwcVarArr5.length) {
                        break;
                    }
                    this.a.an(dwcVarArr5[max]);
                    max++;
                }
                this.aB = dwcVarArr3;
            }
            int[][] iArr = this.aJ;
            if (iArr != null) {
                ao(iArr);
            }
        }
        dwd dwdVar = this.a;
        for (dwc dwcVar : this.aB) {
            dwdVar.am(dwcVar);
        }
    }

    public final void c(int i) {
        if (i <= 50 && this.aF != i) {
            this.aF = i;
            aq();
            ap();
        }
    }

    public final void d(int i) {
        if (i <= 50 && this.aD != i) {
            this.aD = i;
            aq();
            ap();
        }
    }
}
