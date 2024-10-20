package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ao extends ar {
    int ag;
    int ah;
    private euc at;
    protected final ak af = new ak();
    private int am = 0;
    private int an = 0;
    private an[] ao = new an[4];
    private an[] ap = new an[4];
    private an[] aq = new an[4];
    public int ai = 2;
    private final boolean[] ar = new boolean[3];
    private final an[] as = new an[4];
    public boolean aj = false;
    public boolean ak = false;

    private final int G(ak akVar, an[] anVarArr, an anVar, int i, boolean[] zArr) {
        boolean z;
        an anVar2;
        int i2;
        char c;
        boolean z2;
        an anVar3;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        an anVar4 = null;
        anVarArr[0] = null;
        anVarArr[2] = null;
        anVarArr[1] = null;
        anVarArr[3] = null;
        float f = brg.a;
        int i3 = 5;
        if (i == 0) {
            am amVar = anVar.i.b;
            if (amVar != null && amVar.a != this) {
                z2 = false;
            } else {
                z2 = true;
            }
            anVar.ab = null;
            if (anVar.K != 8) {
                anVar3 = anVar;
            } else {
                anVar3 = null;
            }
            an anVar5 = anVar;
            i2 = 0;
            an anVar6 = null;
            an anVar7 = anVar3;
            while (anVar5.k.b != null) {
                anVar5.ab = anVar4;
                if (anVar5.K != 8) {
                    if (anVar3 == null) {
                        anVar3 = anVar5;
                    }
                    if (anVar7 != null && anVar7 != anVar5) {
                        anVar7.ab = anVar5;
                    }
                    anVar7 = anVar5;
                } else {
                    am amVar2 = anVar5.i;
                    akVar.n(amVar2.f, amVar2.b.f, 0, 5);
                    akVar.n(anVar5.k.f, anVar5.i.f, 0, 5);
                }
                if (anVar5.K != 8 && anVar5.ad == 3) {
                    if (anVar5.ae == 3) {
                        zArr[0] = false;
                    }
                    if (anVar5.u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        an[] anVarArr2 = this.ao;
                        int length = anVarArr2.length;
                        if (i4 >= length) {
                            this.ao = (an[]) Arrays.copyOf(anVarArr2, length + length);
                        }
                        this.ao[i2] = anVar5;
                        i2 = i4;
                    }
                }
                an anVar8 = anVar5.k.b.a;
                am amVar3 = anVar8.i.b;
                if (amVar3 == null || amVar3.a != anVar5 || anVar8 == anVar5) {
                    break;
                }
                anVar6 = anVar8;
                anVar5 = anVar6;
                anVar4 = null;
                f = brg.a;
            }
            am amVar4 = anVar5.k.b;
            if (amVar4 != null && amVar4.a != this) {
                z2 = false;
            }
            if (anVar.i.b != null && anVar6.k.b != null) {
                c2 = 1;
            } else {
                c2 = 1;
                zArr[1] = true;
            }
            anVar.X = z2;
            anVar6.ab = null;
            anVarArr[0] = anVar;
            anVarArr[2] = anVar3;
            anVarArr[c2] = anVar6;
            anVarArr[3] = anVar7;
        } else {
            am amVar5 = anVar.j.b;
            if (amVar5 != null && amVar5.a != this) {
                z = false;
            } else {
                z = true;
            }
            an anVar9 = null;
            anVar.ac = null;
            if (anVar.K != 8) {
                anVar2 = anVar;
            } else {
                anVar2 = null;
            }
            an anVar10 = anVar;
            int i5 = 0;
            an anVar11 = null;
            an anVar12 = anVar2;
            an anVar13 = anVar12;
            while (anVar10.l.b != null) {
                anVar10.ac = anVar9;
                if (anVar10.K != 8) {
                    if (anVar12 == null) {
                        anVar12 = anVar10;
                    }
                    if (anVar13 != null && anVar13 != anVar10) {
                        anVar13.ac = anVar10;
                    }
                    anVar13 = anVar10;
                } else {
                    am amVar6 = anVar10.j;
                    akVar.n(amVar6.f, amVar6.b.f, 0, i3);
                    akVar.n(anVar10.l.f, anVar10.j.f, 0, i3);
                }
                if (anVar10.K != 8 && anVar10.ae == 3) {
                    if (anVar10.ad == 3) {
                        zArr[0] = false;
                    }
                    if (anVar10.u <= brg.a) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        an[] anVarArr3 = this.ao;
                        int length2 = anVarArr3.length;
                        if (i6 >= length2) {
                            this.ao = (an[]) Arrays.copyOf(anVarArr3, length2 + length2);
                        }
                        this.ao[i5] = anVar10;
                        i5 = i6;
                    }
                }
                an anVar14 = anVar10.l.b.a;
                am amVar7 = anVar14.j.b;
                if (amVar7 == null || amVar7.a != anVar10 || anVar14 == anVar10) {
                    break;
                }
                anVar11 = anVar14;
                anVar10 = anVar11;
                anVar9 = null;
                i3 = 5;
            }
            i2 = i5;
            am amVar8 = anVar10.l.b;
            if (amVar8 != null && amVar8.a != this) {
                z = false;
            }
            if (anVar.j.b != null && anVar11.l.b != null) {
                c = 1;
            } else {
                c = 1;
                zArr[1] = true;
            }
            anVar.Y = z;
            anVar11.ac = null;
            anVarArr[0] = anVar;
            anVarArr[2] = anVar12;
            anVarArr[c] = anVar11;
            anVarArr[3] = anVar13;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void H(defpackage.ak r31) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.H(ak):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(defpackage.ak r31) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.I(ak):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(an anVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                am amVar = anVar.i;
                am amVar2 = amVar.b;
                if (amVar2 == null) {
                    break;
                }
                an anVar2 = amVar2.a;
                am amVar3 = anVar2.k.b;
                if (amVar3 == null || amVar3 != amVar || anVar2 == anVar) {
                    break;
                } else {
                    anVar = anVar2;
                }
            }
            while (true) {
                int i3 = this.am;
                if (i2 < i3) {
                    if (this.aq[i2] != anVar) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    int i4 = i3 + 1;
                    an[] anVarArr = this.aq;
                    int length = anVarArr.length;
                    if (i4 >= length) {
                        this.aq = (an[]) Arrays.copyOf(anVarArr, length + length);
                    }
                    an[] anVarArr2 = this.aq;
                    int i5 = this.am;
                    anVarArr2[i5] = anVar;
                    this.am = i5 + 1;
                    return;
                }
            }
        } else {
            while (true) {
                am amVar4 = anVar.j;
                am amVar5 = amVar4.b;
                if (amVar5 == null) {
                    break;
                }
                an anVar3 = amVar5.a;
                am amVar6 = anVar3.l.b;
                if (amVar6 == null || amVar6 != amVar4 || anVar3 == anVar) {
                    break;
                } else {
                    anVar = anVar3;
                }
            }
            while (true) {
                int i6 = this.an;
                if (i2 < i6) {
                    if (this.ap[i2] != anVar) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    int i7 = i6 + 1;
                    an[] anVarArr3 = this.ap;
                    int length2 = anVarArr3.length;
                    if (i7 >= length2) {
                        this.ap = (an[]) Arrays.copyOf(anVarArr3, length2 + length2);
                    }
                    an[] anVarArr4 = this.ap;
                    int i8 = this.an;
                    anVarArr4[i8] = anVar;
                    this.an = i8 + 1;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.an r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.B(an, boolean[]):void");
    }

    public final void C(an anVar, boolean[] zArr) {
        int i;
        an anVar2;
        int i2;
        am amVar;
        am amVar2;
        am amVar3;
        int i3;
        boolean z;
        am amVar4;
        am amVar5;
        am amVar6;
        am amVar7;
        an anVar3;
        boolean z2 = false;
        r1 = 0;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (anVar.ae == 3 && anVar.ad != 3 && anVar.u > brg.a) {
            zArr[0] = false;
            return;
        }
        int e = anVar.e();
        anVar.U = true;
        if (anVar instanceof ap) {
            ap apVar = (ap) anVar;
            if (apVar.ai == 0) {
                int i5 = apVar.ag;
                if (i5 != -1) {
                    i = i5;
                } else {
                    int i6 = apVar.ah;
                    i = 0;
                    if (i6 != -1) {
                        i4 = i6;
                    }
                }
            } else {
                i4 = e;
                i = i4;
            }
        } else {
            am amVar8 = anVar.m;
            if (amVar8.b == null && anVar.j.b == null && anVar.l.b == null) {
                i = e + anVar.x;
            } else {
                am amVar9 = anVar.l.b;
                if (amVar9 != null && (amVar7 = anVar.j.b) != null && (amVar9 == amVar7 || ((anVar3 = amVar9.a) == amVar7.a && anVar3 != anVar.r))) {
                    zArr[0] = false;
                    return;
                }
                if (amVar8.c()) {
                    an anVar4 = anVar.m.b.a;
                    if (!anVar4.U) {
                        C(anVar4, zArr);
                    }
                    int max = Math.max((anVar4.L - anVar4.t) + e, e);
                    int max2 = Math.max((anVar4.O - anVar4.t) + e, e);
                    if (anVar.K == 8) {
                        int i7 = anVar.t;
                        max -= i7;
                        max2 -= i7;
                    }
                    anVar.L = max;
                    anVar.O = max2;
                    return;
                }
                an anVar5 = null;
                if (anVar.j.c()) {
                    am amVar10 = anVar.j;
                    anVar2 = amVar10.b.a;
                    i = amVar10.a() + e;
                    if (!anVar2.s() && !anVar2.U) {
                        C(anVar2, zArr);
                    }
                } else {
                    i = e;
                    anVar2 = null;
                }
                if (anVar.l.c()) {
                    am amVar11 = anVar.l;
                    an anVar6 = amVar11.b.a;
                    e += amVar11.a();
                    if (!anVar6.s() && !anVar6.U) {
                        C(anVar6, zArr);
                    }
                    anVar5 = anVar6;
                }
                if (anVar.j.b != null && !anVar2.s()) {
                    int i8 = anVar.j.b.g;
                    if (i8 == 3) {
                        i3 = anVar2.L - anVar2.e();
                    } else {
                        if (i8 == 5) {
                            i3 = anVar2.L;
                        }
                        if (anVar2.R && ((amVar5 = anVar2.j.b) == null || amVar5.a == anVar || (amVar6 = anVar2.l.b) == null || amVar6.a == anVar || anVar2.ae == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        anVar.R = z;
                        if (z && ((amVar4 = anVar2.l.b) == null || amVar4.a != anVar)) {
                            i += i - anVar2.L;
                        }
                    }
                    i += i3;
                    if (anVar2.R) {
                    }
                    z = true;
                    anVar.R = z;
                    if (z) {
                        i += i - anVar2.L;
                    }
                }
                if (anVar.l.b != null && !anVar5.s()) {
                    int i9 = anVar.l.b.g;
                    if (i9 == 5) {
                        i2 = anVar5.O - anVar5.e();
                    } else {
                        if (i9 == 3) {
                            i2 = anVar5.O;
                        }
                        if (!anVar5.S || ((amVar2 = anVar5.j.b) != null && amVar2.a != anVar && (amVar3 = anVar5.l.b) != null && amVar3.a != anVar && anVar5.ae != 3)) {
                            z2 = true;
                        }
                        anVar.S = z2;
                        if (z2 && ((amVar = anVar5.j.b) == null || amVar.a != anVar)) {
                            i4 = e + (e - anVar5.O);
                        }
                    }
                    e += i2;
                    if (!anVar5.S) {
                    }
                    z2 = true;
                    anVar.S = z2;
                    if (z2) {
                        i4 = e + (e - anVar5.O);
                    }
                }
            }
            i4 = e;
        }
        if (anVar.K == 8) {
            int i10 = anVar.t;
            i -= i10;
            i4 -= i10;
        }
        anVar.L = i;
        anVar.O = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ff A[LOOP:16: B:277:0x05fd->B:278:0x05ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0533  */
    /* JADX WARN: Type inference failed for: r0v12, types: [an] */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [an] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [int] */
    /* JADX WARN: Type inference failed for: r6v27, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.ArrayList] */
    @Override // defpackage.ar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x06b6, code lost:
    
        if (r3.K != 8) goto L241;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(defpackage.ak r20) {
        /*
            Method dump skipped, instructions count: 1773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.E(ak):boolean");
    }

    @Override // defpackage.ar, defpackage.an
    public final void i() {
        this.af.l();
        super.i();
    }
}
