package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwc {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int[] E;
    public int F;
    public int G;
    public float H;
    public int I;
    public int J;
    public float K;
    int L;
    float M;
    public final int[] N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public final dwb T;
    public final dwb U;
    public final dwb V;
    public final dwb W;
    public final dwb X;
    final dwb Y;
    final dwb Z;
    private boolean a;
    public final int[] aA;
    public final dwb aa;
    public final dwb[] ab;
    protected final ArrayList ac;
    public final boolean[] ad;
    public dwc ae;
    int af;
    public int ag;
    public float ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public float ao;
    public float ap;
    public Object aq;
    public int ar;
    public String as;
    public int at;
    public int au;
    public final float[] av;
    public final dwc[] aw;
    public final dwc[] ax;
    public int ay;
    public int az;
    public boolean l;
    public dwn m;
    public dwn n;
    public dwv o;
    public dww p;
    public final boolean[] q;
    public boolean r;
    public int s;
    public int t;
    public final dvp u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public dwc() {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new dvp(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        dwb dwbVar = new dwb(this, 2);
        this.T = dwbVar;
        dwb dwbVar2 = new dwb(this, 3);
        this.U = dwbVar2;
        dwb dwbVar3 = new dwb(this, 4);
        this.V = dwbVar3;
        dwb dwbVar4 = new dwb(this, 5);
        this.W = dwbVar4;
        dwb dwbVar5 = new dwb(this, 6);
        this.X = dwbVar5;
        this.Y = new dwb(this, 8);
        this.Z = new dwb(this, 9);
        dwb dwbVar6 = new dwb(this, 7);
        this.aa = dwbVar6;
        this.ab = new dwb[]{dwbVar, dwbVar3, dwbVar2, dwbVar4, dwbVar5, dwbVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.af = 0;
        this.ag = 0;
        this.ah = brg.a;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new dwc[]{null, null};
        this.ax = new dwc[]{null, null};
        this.ay = -1;
        this.az = -1;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ae(defpackage.dun r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.duq r35, defpackage.duq r36, int r37, boolean r38, defpackage.dwb r39, defpackage.dwb r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwc.ae(dun, boolean, boolean, boolean, boolean, duq, duq, int, boolean, dwb, dwb, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private final void b() {
        this.ac.add(this.T);
        this.ac.add(this.U);
        this.ac.add(this.V);
        this.ac.add(this.W);
        this.ac.add(this.Y);
        this.ac.add(this.Z);
        this.ac.add(this.aa);
        this.ac.add(this.X);
    }

    private final boolean c(int i) {
        dwb dwbVar;
        dwb dwbVar2;
        dwb[] dwbVarArr = this.ab;
        int i2 = i + i;
        dwb dwbVar3 = dwbVarArr[i2];
        dwb dwbVar4 = dwbVar3.e;
        if (dwbVar4 != null && dwbVar4.e != dwbVar3 && (dwbVar2 = (dwbVar = dwbVarArr[i2 + 1]).e) != null && dwbVar2.e == dwbVar) {
            return true;
        }
        return false;
    }

    public final void A(int i, int i2) {
        if (this.w) {
            return;
        }
        this.U.f(i);
        this.W.f(i2);
        this.ak = i;
        this.ag = i2 - i;
        if (this.P) {
            this.X.f(i + this.al);
        }
        this.w = true;
    }

    public final void B(int i) {
        this.ag = i;
        int i2 = this.an;
        if (i < i2) {
            this.ag = i2;
        }
    }

    public final void C(int i, int i2, int i3, float f) {
        this.C = i;
        this.F = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.G = i3;
        this.H = f;
        if (f > brg.a && f < 1.0f && i == 0) {
            this.C = 2;
        }
    }

    public final void D(float f) {
        this.av[0] = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E(int i, boolean z) {
        this.ad[i] = z;
    }

    public final void F(int i, int i2) {
        this.R = i;
        this.S = i2;
        this.r = false;
    }

    public final void G(int i) {
        this.N[1] = i;
    }

    public final void H(int i) {
        this.N[0] = i;
    }

    public final void I(int i) {
        if (i < 0) {
            this.an = 0;
        } else {
            this.an = i;
        }
    }

    public final void J(int i) {
        if (i < 0) {
            this.am = 0;
        } else {
            this.am = i;
        }
    }

    public final void K(int i, int i2, int i3, float f) {
        this.D = i;
        this.I = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.J = i3;
        this.K = f;
        if (f > brg.a && f < 1.0f && i == 0) {
            this.D = 2;
        }
    }

    public final void L(float f) {
        this.av[1] = f;
    }

    public final void M(int i) {
        this.af = i;
        int i2 = this.am;
        if (i < i2) {
            this.af = i2;
        }
    }

    public void N(boolean z, boolean z2) {
        int i;
        int i2;
        dwv dwvVar = this.o;
        boolean z3 = z & dwvVar.g;
        dww dwwVar = this.p;
        boolean z4 = z2 & dwwVar.g;
        int i3 = dwvVar.h.f;
        int i4 = dwwVar.h.f;
        int i5 = dwvVar.i.f;
        int i6 = dwwVar.i.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aj = i3;
        }
        if (z4) {
            this.ak = i4;
        }
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.aA[0] == 1 && i8 < (i2 = this.af)) {
                i8 = i2;
            }
            this.af = i8;
            int i9 = this.am;
            if (i8 < i9) {
                this.af = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.aA[1] == 1 && i10 < (i = this.ag)) {
                i10 = i;
            }
            this.ag = i10;
            int i11 = this.an;
            if (i10 < i11) {
                this.ag = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O() {
        if (!(this instanceof dwj) && !(this instanceof dwg)) {
            return false;
        }
        return true;
    }

    public final boolean P(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.T.e != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.V.e != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.U.e != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.W.e != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.X.e != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 + i3 + i4 < 2) {
            return true;
        }
        return false;
    }

    public final boolean Q(int i, int i2) {
        dwb dwbVar;
        dwb dwbVar2;
        dwb dwbVar3;
        dwb dwbVar4;
        if (i == 0) {
            dwb dwbVar5 = this.T.e;
            if (dwbVar5 != null && dwbVar5.c && (dwbVar4 = (dwbVar3 = this.V).e) != null && dwbVar4.c && (dwbVar4.a() - dwbVar3.b()) - (this.T.e.a() + this.T.b()) >= i2) {
                return true;
            }
            return false;
        }
        dwb dwbVar6 = this.U.e;
        if (dwbVar6 != null && dwbVar6.c && (dwbVar2 = (dwbVar = this.W).e) != null && dwbVar2.c && (dwbVar2.a() - dwbVar.b()) - (this.U.e.a() + this.U.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        dwb dwbVar = this.T;
        dwb dwbVar2 = dwbVar.e;
        if (dwbVar2 == null || dwbVar2.e != dwbVar) {
            dwb dwbVar3 = this.V;
            dwb dwbVar4 = dwbVar3.e;
            if (dwbVar4 != null && dwbVar4.e == dwbVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean S() {
        dwb dwbVar = this.U;
        dwb dwbVar2 = dwbVar.e;
        if (dwbVar2 == null || dwbVar2.e != dwbVar) {
            dwb dwbVar3 = this.W;
            dwb dwbVar4 = dwbVar3.e;
            if (dwbVar4 != null && dwbVar4.e == dwbVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean T() {
        if (this.r && this.ar != 8) {
            return true;
        }
        return false;
    }

    public dwb U(int i) {
        switch (i - 1) {
            case 1:
                return this.T;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.X;
            case 6:
                return this.aa;
            case 7:
                return this.Y;
            default:
                return this.Z;
        }
    }

    public final int V(int i) {
        if (i == 0) {
            return W();
        }
        return X();
    }

    public final int W() {
        return this.aA[0];
    }

    public final int X() {
        return this.aA[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
    
        if (r11 == 4) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(int r11, defpackage.dwc r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwc.Y(int, dwc, int, int):void");
    }

    public final void Z(int i, dwc dwcVar, int i2, int i3, int i4) {
        U(i).n(dwcVar.U(i2), i3, i4, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x040d, code lost:
    
        if (r6 == (-1)) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x02df, code lost:
    
        if (r6 == 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r50.w != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x015c, code lost:
    
        if (r50.w != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.dun r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwc.a(dun, boolean):void");
    }

    public final void aa(int i) {
        this.aA[0] = i;
    }

    public final void ab(int i) {
        this.aA[1] = i;
    }

    public void ac(boolean z) {
        int i;
        dww dwwVar;
        dwv dwvVar;
        int o = dun.o(this.T);
        int o2 = dun.o(this.U);
        int o3 = dun.o(this.V);
        int o4 = dun.o(this.W);
        if (z && (dwvVar = this.o) != null) {
            dwq dwqVar = dwvVar.h;
            if (dwqVar.i) {
                dwq dwqVar2 = dwvVar.i;
                if (dwqVar2.i) {
                    o = dwqVar.f;
                    o3 = dwqVar2.f;
                }
            }
        }
        if (z && (dwwVar = this.p) != null) {
            dwq dwqVar3 = dwwVar.h;
            if (dwqVar3.i) {
                dwq dwqVar4 = dwwVar.i;
                if (dwqVar4.i) {
                    o2 = dwqVar3.f;
                    o4 = dwqVar4.f;
                }
            }
        }
        if (o3 - o < 0 || o4 - o2 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        this.aj = o;
        this.ak = o2;
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        int i2 = o3 - o;
        int[] iArr = this.aA;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.af;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = o4 - o2;
        if (iArr[1] == 1 && i5 < (i = this.ag)) {
            i5 = i;
        }
        this.af = i2;
        this.ag = i5;
        int i6 = this.an;
        if (i5 < i6) {
            this.ag = i6;
        }
        int i7 = this.am;
        if (i2 < i7) {
            this.af = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.G;
        if (i8 > 0 && i3 == 3) {
            this.af = Math.min(i7, i8);
        }
        int i9 = this.J;
        if (i9 > 0 && this.aA[1] == 3) {
            this.ag = Math.min(this.ag, i9);
        }
        int i10 = this.af;
        if (i2 != i10) {
            this.s = i10;
        }
        int i11 = this.ag;
        if (i5 != i11) {
            this.t = i11;
        }
    }

    public void ad(ktk ktkVar) {
        this.T.m();
        this.U.m();
        this.V.m();
        this.W.m();
        this.X.m();
        this.aa.m();
        this.Y.m();
        this.Z.m();
    }

    public boolean ay() {
        if (this.ar != 8) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        if (this.T.c && this.V.c) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.w) {
            return true;
        }
        if (this.U.c && this.W.c) {
            return true;
        }
        return false;
    }

    public final int g() {
        return l() + this.ag;
    }

    public final int h() {
        if (this.ar == 8) {
            return 0;
        }
        return this.ag;
    }

    public final int i() {
        return k() + this.af;
    }

    public final int j() {
        if (this.ar == 8) {
            return 0;
        }
        return this.af;
    }

    public final int k() {
        dwc dwcVar = this.ae;
        if (dwcVar != null && (dwcVar instanceof dwd)) {
            return ((dwd) dwcVar).f + this.aj;
        }
        return this.aj;
    }

    public final int l() {
        dwc dwcVar = this.ae;
        if (dwcVar != null && (dwcVar instanceof dwd)) {
            return ((dwd) dwcVar).g + this.ak;
        }
        return this.ak;
    }

    public final dwc m(int i) {
        dwb dwbVar;
        dwb dwbVar2;
        if (i == 0) {
            dwb dwbVar3 = this.V;
            dwbVar2 = dwbVar3.e;
            if (dwbVar2 == null || dwbVar2.e != dwbVar3) {
                return null;
            }
        } else if (i != 1 || (dwbVar2 = (dwbVar = this.W).e) == null || dwbVar2.e != dwbVar) {
            return null;
        }
        return dwbVar2.d;
    }

    public final dwc n(int i) {
        dwb dwbVar;
        dwb dwbVar2;
        if (i == 0) {
            dwb dwbVar3 = this.T;
            dwbVar2 = dwbVar3.e;
            if (dwbVar2 == null || dwbVar2.e != dwbVar3) {
                return null;
            }
        } else if (i != 1 || (dwbVar2 = (dwbVar = this.U).e) == null || dwbVar2.e != dwbVar) {
            return null;
        }
        return dwbVar2.d;
    }

    public final dwy o(int i) {
        if (i == 0) {
            return this.o;
        }
        if (i == 1) {
            return this.p;
        }
        return null;
    }

    public final void p(dwd dwdVar, dun dunVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                dwi.a(dwdVar, dunVar, this);
                hashSet.remove(this);
                a(dunVar, dwdVar.aj(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.T.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((dwb) it.next()).d.p(dwdVar, dunVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.V.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((dwb) it2.next()).d.p(dwdVar, dunVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.U.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((dwb) it3.next()).d.p(dwdVar, dunVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.W.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((dwb) it4.next()).d.p(dwdVar, dunVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.X.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((dwb) it5.next()).d.p(dwdVar, dunVar, hashSet, 1, true);
            }
        }
    }

    public final void q(dwb dwbVar, dwb dwbVar2, int i) {
        if (dwbVar.d == this) {
            Y(dwbVar.i, dwbVar2.d, dwbVar2.i, i);
        }
    }

    public final void r(dwc dwcVar, float f, int i) {
        Z(7, dwcVar, 7, i, 0);
        this.O = f;
    }

    public final void s(dun dunVar) {
        dunVar.b(this.T);
        dunVar.b(this.U);
        dunVar.b(this.V);
        dunVar.b(this.W);
        if (this.al > 0) {
            dunVar.b(this.X);
        }
    }

    public final void t() {
        if (this.o == null) {
            this.o = new dwv(this);
        }
        if (this.p == null) {
            this.p = new dww(this);
        }
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.as != null) {
            str = "id: " + this.as + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.aj);
        sb.append(", ");
        sb.append(this.ak);
        sb.append(") - (");
        sb.append(this.af);
        sb.append(" x ");
        sb.append(this.ag);
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.T.e();
        this.U.e();
        this.V.e();
        this.W.e();
        this.X.e();
        this.Y.e();
        this.Z.e();
        this.aa.e();
        this.ae = null;
        this.O = Float.NaN;
        this.af = 0;
        this.ag = 0;
        this.ah = brg.a;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        int[] iArr = this.aA;
        iArr[0] = 1;
        iArr[1] = 1;
        this.aq = null;
        this.ar = 0;
        this.at = 0;
        this.au = 0;
        float[] fArr = this.av;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.z = -1;
        this.A = -1;
        int[] iArr2 = this.N;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.C = 0;
        this.D = 0;
        this.H = 1.0f;
        this.K = 1.0f;
        this.G = Integer.MAX_VALUE;
        this.J = Integer.MAX_VALUE;
        this.F = 0;
        this.I = 0;
        this.L = -1;
        this.M = 1.0f;
        boolean[] zArr = this.q;
        zArr[0] = true;
        zArr[1] = true;
        this.Q = false;
        boolean[] zArr2 = this.ad;
        zArr2[0] = false;
        zArr2[1] = false;
        this.r = true;
        int[] iArr3 = this.E;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.s = -1;
        this.t = -1;
    }

    public final void v() {
        dwc dwcVar = this.ae;
        if (dwcVar != null && (dwcVar instanceof dwd)) {
        }
        int size = this.ac.size();
        for (int i = 0; i < size; i++) {
            ((dwb) this.ac.get(i)).e();
        }
    }

    public final void w() {
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        int size = this.ac.size();
        for (int i = 0; i < size; i++) {
            dwb dwbVar = (dwb) this.ac.get(i);
            dwbVar.c = false;
            dwbVar.b = 0;
        }
    }

    public final void x(int i) {
        boolean z;
        this.al = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.P = z;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0089 -> B:31:0x008a). Please report as a decompilation issue!!! */
    public final void y(String str) {
        int i;
        float f;
        int i2 = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                }
                int i4 = i3;
                i3 = indexOf + 1;
                i = i4;
            } else {
                i = -1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i3, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > brg.a && parseFloat2 > brg.a) {
                        if (i == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = i2;
            } else {
                String substring4 = str.substring(i3);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = i2;
            }
            i2 = (f > i2 ? 1 : (f == i2 ? 0 : -1));
            if (i2 > 0) {
                this.ah = f;
                this.ai = i;
                return;
            }
            return;
        }
        this.ah = brg.a;
    }

    public final void z(int i, int i2) {
        if (this.a) {
            return;
        }
        this.T.f(i);
        this.V.f(i2);
        this.aj = i;
        this.af = i2 - i;
        this.a = true;
    }

    public dwc(int i, int i2) {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new dvp(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        dwb dwbVar = new dwb(this, 2);
        this.T = dwbVar;
        dwb dwbVar2 = new dwb(this, 3);
        this.U = dwbVar2;
        dwb dwbVar3 = new dwb(this, 4);
        this.V = dwbVar3;
        dwb dwbVar4 = new dwb(this, 5);
        this.W = dwbVar4;
        dwb dwbVar5 = new dwb(this, 6);
        this.X = dwbVar5;
        this.Y = new dwb(this, 8);
        this.Z = new dwb(this, 9);
        dwb dwbVar6 = new dwb(this, 7);
        this.aa = dwbVar6;
        this.ab = new dwb[]{dwbVar, dwbVar3, dwbVar2, dwbVar4, dwbVar5, dwbVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.ah = brg.a;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new dwc[]{null, null};
        this.ax = new dwc[]{null, null};
        this.ay = -1;
        this.az = -1;
        this.af = i;
        this.ag = i2;
        b();
    }
}
