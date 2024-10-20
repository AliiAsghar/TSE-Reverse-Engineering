package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class an {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    an ab;
    an ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final am i;
    final am j;
    final am k;
    final am l;
    final am m;
    final am n;
    final am o;
    final am p;
    public final ArrayList q;
    public an r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public an() {
        am amVar = new am(this, 2);
        this.i = amVar;
        am amVar2 = new am(this, 3);
        this.j = amVar2;
        am amVar3 = new am(this, 4);
        this.k = amVar3;
        am amVar4 = new am(this, 5);
        this.l = amVar4;
        am amVar5 = new am(this, 6);
        this.m = amVar5;
        am amVar6 = new am(this, 8);
        this.n = amVar6;
        am amVar7 = new am(this, 9);
        this.o = amVar7;
        this.p = new am(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = brg.a;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = brg.a;
        this.aa = brg.a;
        this.ab = null;
        this.ac = null;
        arrayList.add(amVar);
        arrayList.add(amVar2);
        arrayList.add(amVar3);
        arrayList.add(amVar4);
        arrayList.add(amVar6);
        arrayList.add(amVar7);
        arrayList.add(amVar5);
    }

    private final void A(ak akVar, boolean z, boolean z2, am amVar, am amVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8 = i6;
        al e = akVar.e(amVar);
        al e2 = akVar.e(amVar2);
        al e3 = akVar.e(amVar.b);
        al e4 = akVar.e(amVar2.b);
        int a = amVar.a();
        int a2 = amVar2.a();
        int i9 = this.K;
        boolean z5 = i9 != 8;
        int i10 = i9 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (e3 == null && e4 == null) {
            ai a3 = akVar.a();
            a3.g(e, i);
            akVar.g(a3);
            if (z3) {
                return;
            }
            if (z) {
                akVar.g(ak.c(akVar, e2, e, i4, true));
                return;
            } else {
                if (z6) {
                    akVar.g(ak.c(akVar, e2, e, i10, false));
                    return;
                }
                ai a4 = akVar.a();
                a4.g(e2, i2);
                akVar.g(a4);
                return;
            }
        }
        if (e3 != null && e4 == null) {
            ai a5 = akVar.a();
            a5.h(e, e3, a);
            akVar.g(a5);
            if (z) {
                akVar.g(ak.c(akVar, e2, e, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ai a6 = akVar.a();
                a6.h(e2, e, i10);
                akVar.g(a6);
                return;
            } else {
                ai a7 = akVar.a();
                a7.g(e2, i2);
                akVar.g(a7);
                return;
            }
        }
        if (e3 == null) {
            ai a8 = akVar.a();
            a8.h(e2, e4, -a2);
            akVar.g(a8);
            if (z) {
                akVar.g(ak.c(akVar, e2, e, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ai a9 = akVar.a();
                a9.h(e2, e, i10);
                akVar.g(a9);
                return;
            } else {
                ai a10 = akVar.a();
                a10.g(e, i);
                akVar.g(a10);
                return;
            }
        }
        if (!z6) {
            if (z3) {
                akVar.i(e, e3, a, 3);
                akVar.j(e2, e4, -a2, 3);
                akVar.g(ak.b(akVar, e, e3, a, f, e4, e2, a2, true));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -a2;
            if (i5 == 1) {
                if (i8 <= i10) {
                    i8 = i10;
                }
                if (i7 > 0) {
                    if (i7 < i8) {
                        i8 = i7;
                    } else {
                        akVar.j(e2, e, i7, 3);
                    }
                }
                akVar.n(e2, e, i8, 3);
                akVar.i(e, e3, a, 2);
                akVar.j(e2, e4, i11, 2);
                akVar.m(e, e3, a, f, e4, e2, a2);
                return;
            }
            if (i8 == 0 && i7 == 0) {
                ai a11 = akVar.a();
                a11.h(e, e3, a);
                akVar.g(a11);
                ai a12 = akVar.a();
                a12.h(e2, e4, i11);
                akVar.g(a12);
                return;
            }
            if (i7 > 0) {
                akVar.j(e2, e, i7, 3);
            }
            akVar.i(e, e3, a, 2);
            akVar.j(e2, e4, i11, 2);
            akVar.m(e, e3, a, f, e4, e2, a2);
            return;
        }
        if (z) {
            akVar.g(ak.c(akVar, e2, e, i4, true));
        } else {
            ai a13 = akVar.a();
            a13.h(e2, e, i10);
            akVar.g(a13);
        }
        int i12 = amVar.h;
        if (i12 != amVar2.h) {
            int i13 = -a2;
            if (i12 == 2) {
                ai a14 = akVar.a();
                a14.h(e, e3, a);
                akVar.g(a14);
                al f2 = akVar.f();
                ai a15 = akVar.a();
                a15.j(e2, e4, f2, i13);
                akVar.g(a15);
                return;
            }
            al f3 = akVar.f();
            ai a16 = akVar.a();
            a16.i(e, e3, f3, a);
            akVar.g(a16);
            ai a17 = akVar.a();
            a17.h(e2, e4, i13);
            akVar.g(a17);
            return;
        }
        if (e3 == e4) {
            akVar.g(ak.b(akVar, e, e3, 0, 0.5f, e4, e2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -a2;
        int i15 = amVar.i;
        al f4 = akVar.f();
        ai a18 = akVar.a();
        a18.i(e, e3, f4, a);
        if (i15 != 2) {
            akVar.k(a18, (int) (-a18.d.a(f4)));
        }
        akVar.g(a18);
        int i16 = amVar2.i;
        al f5 = akVar.f();
        ai a19 = akVar.a();
        a19.j(e2, e4, f5, i14);
        if (i16 != 2) {
            akVar.k(a19, (int) (-a19.d.a(f5)));
        }
        akVar.g(a19);
        akVar.g(ak.b(akVar, e, e3, a, f, e4, e2, a2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int i = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                i = Math.max(this.g, i);
            } else {
                i = this.g;
                if (i > 0) {
                    this.t = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.h;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int f() {
        int i = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                i = Math.max(this.e, i);
            } else {
                i = this.e;
                if (i > 0) {
                    this.s = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.f;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = brg.a;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = brg.a;
        this.aa = brg.a;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean r() {
        if (this.C > 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.r == null) {
            return true;
        }
        return false;
    }

    public am t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void u(int i, an anVar, int i2, int i3, int i4) {
        t(i).d(anVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e8, code lost:
    
        if (r13 == (-1)) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(defpackage.ak r42) {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.x(ak):void");
    }

    public void y() {
        int i;
        int i2;
        int p = ak.p(this.i);
        int p2 = ak.p(this.j);
        int p3 = ak.p(this.k) - p;
        int p4 = ak.p(this.l) - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && p3 < (i2 = this.s)) {
            p3 = i2;
        }
        if (this.ae == 1 && p4 < (i = this.t)) {
            p4 = i;
        }
        this.s = p3;
        this.t = p4;
        int i3 = this.E;
        if (p4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (p3 < i4) {
            this.s = i4;
        }
    }

    public void z(ktk ktkVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
