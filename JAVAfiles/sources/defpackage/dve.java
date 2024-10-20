package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dve implements dvl {
    public Object a;
    public float ab;
    public float ac;
    public Object af;
    public dwc ag;
    final dvo b;
    public dvs c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    protected int j = 0;
    protected int k = 0;
    protected int l = 0;
    protected int m = 0;
    protected int n = 0;
    protected int o = 0;
    protected int p = 0;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    int v = 0;
    int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    protected Object J = null;
    public Object K = null;
    public Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    public Object T = null;
    protected Object U = null;
    protected Object V = null;
    public Object W = null;
    Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object aa = null;
    public int ak = 0;
    public dvj ad = dvj.b(dvj.b);
    public dvj ae = dvj.b(dvj.b);
    public final HashMap ah = new HashMap();
    public HashMap ai = new HashMap();
    public dut aj = null;

    public dve(dvo dvoVar) {
        this.b = dvoVar;
    }

    private final void x(dwc dwcVar, Object obj, int i) {
        dwc dwcVar2;
        if (obj instanceof dvl) {
            dwcVar2 = ((dvl) obj).b();
        } else {
            dwcVar2 = null;
        }
        dwc dwcVar3 = dwcVar2;
        if (dwcVar3 != null) {
            int i2 = i - 1;
            int i3 = dvd.b;
            if (i2 != 19) {
                switch (i2) {
                    case 0:
                        dwcVar.U(2).n(dwcVar3.U(2), this.j, this.p, false);
                        return;
                    case 1:
                        dwcVar.U(2).n(dwcVar3.U(4), this.j, this.p, false);
                        return;
                    case 2:
                        dwcVar.U(4).n(dwcVar3.U(2), this.k, this.q, false);
                        return;
                    case 3:
                        dwcVar.U(4).n(dwcVar3.U(4), this.k, this.q, false);
                        return;
                    case 4:
                        dwcVar.U(2).n(dwcVar3.U(2), this.l, this.r, false);
                        return;
                    case 5:
                        dwcVar.U(2).n(dwcVar3.U(4), this.l, this.r, false);
                        return;
                    case 6:
                        dwcVar.U(4).n(dwcVar3.U(2), this.m, this.s, false);
                        return;
                    case 7:
                        dwcVar.U(4).n(dwcVar3.U(4), this.m, this.s, false);
                        return;
                    case 8:
                        dwcVar.U(3).n(dwcVar3.U(3), this.n, this.t, false);
                        return;
                    case 9:
                        dwcVar.U(3).n(dwcVar3.U(5), this.n, this.t, false);
                        return;
                    case 10:
                        dwcVar.Z(3, dwcVar3, 6, this.n, this.t);
                        return;
                    case 11:
                        dwcVar.U(5).n(dwcVar3.U(3), this.o, this.u, false);
                        return;
                    case 12:
                        dwcVar.U(5).n(dwcVar3.U(5), this.o, this.u, false);
                        return;
                    case 13:
                        dwcVar.Z(5, dwcVar3, 6, this.o, this.u);
                        return;
                    case 14:
                        dwcVar.Z(6, dwcVar3, 6, this.v, this.w);
                        return;
                    case 15:
                        dwcVar.Z(6, dwcVar3, 3, this.v, this.w);
                        return;
                    case 16:
                        dwcVar.Z(6, dwcVar3, 5, this.v, this.w);
                        return;
                    default:
                        return;
                }
            }
            dwcVar.r(dwcVar3, this.ab, (int) this.ac);
        }
    }

    @Override // defpackage.dvl
    public final dvs a() {
        return this.c;
    }

    @Override // defpackage.dvl
    public dwc b() {
        dwc dwcVar = this.ag;
        if (dwcVar == null) {
            dwc dwcVar2 = new dwc(this.ad.j, this.ae.j);
            this.ag = dwcVar2;
            dwcVar2.aq = this.af;
            return dwcVar2;
        }
        return dwcVar;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof dve)) {
            return (dvl) this.b.c.get(obj);
        }
        return obj;
    }

    @Override // defpackage.dvl
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.dvl
    public void e() {
        if (this.ag != null) {
            dvs dvsVar = this.c;
            if (dvsVar != null) {
                dvsVar.e();
            }
            this.ad.d(this.ag, 0);
            this.ae.d(this.ag, 1);
            this.J = c(this.J);
            this.K = c(this.K);
            this.L = c(this.L);
            this.M = c(this.M);
            this.N = c(this.N);
            this.O = c(this.O);
            this.P = c(this.P);
            this.Q = c(this.Q);
            this.R = c(this.R);
            this.S = c(this.S);
            this.U = c(this.U);
            this.V = c(this.V);
            this.X = c(this.X);
            this.Y = c(this.Y);
            this.Z = c(this.Z);
            x(this.ag, this.J, 1);
            x(this.ag, this.K, 2);
            x(this.ag, this.L, 3);
            x(this.ag, this.M, 4);
            x(this.ag, this.N, 5);
            x(this.ag, this.O, 6);
            x(this.ag, this.P, 7);
            x(this.ag, this.Q, 8);
            x(this.ag, this.R, 9);
            x(this.ag, this.S, 10);
            x(this.ag, this.T, 11);
            x(this.ag, this.U, 12);
            x(this.ag, this.V, 13);
            x(this.ag, this.W, 14);
            x(this.ag, this.X, 15);
            x(this.ag, this.Y, 16);
            x(this.ag, this.Z, 17);
            x(this.ag, this.aa, 20);
            int i = this.d;
            if (i != 0) {
                this.ag.at = i;
            }
            int i2 = this.e;
            if (i2 != 0) {
                this.ag.au = i2;
            }
            float f = this.f;
            if (f != -1.0f) {
                this.ag.D(f);
            }
            float f2 = this.g;
            if (f2 != -1.0f) {
                this.ag.L(f2);
            }
            dwc dwcVar = this.ag;
            dwcVar.ao = this.h;
            dwcVar.ap = this.i;
            dvp dvpVar = dwcVar.u;
            dvpVar.f = this.x;
            dvpVar.g = this.y;
            dvpVar.h = this.z;
            dvpVar.i = this.A;
            dvpVar.j = this.B;
            dvpVar.k = this.C;
            dvpVar.l = this.D;
            dvpVar.m = this.E;
            dvpVar.n = this.G;
            dvpVar.o = this.H;
            dvpVar.p = this.F;
            int i3 = this.I;
            dvpVar.q = i3;
            dwcVar.ar = i3;
            dvpVar.s = this.aj;
            for (String str : this.ah.keySet()) {
                Integer num = (Integer) this.ah.get(str);
                dvp dvpVar2 = this.ag.u;
                int intValue = num.intValue();
                if (dvpVar2.r.containsKey(str)) {
                    ((dur) dvpVar2.r.get(str)).c = intValue;
                } else {
                    dvpVar2.r.put(str, new dur(str, intValue));
                }
            }
            HashMap hashMap = this.ai;
            if (hashMap != null) {
                for (String str2 : hashMap.keySet()) {
                    float floatValue = ((Float) this.ai.get(str2)).floatValue();
                    dvp dvpVar3 = this.ag.u;
                    if (dvpVar3.r.containsKey(str2)) {
                        ((dur) dvpVar3.r.get(str2)).d = floatValue;
                    } else {
                        dvpVar3.r.put(str2, new dur(str2, floatValue));
                    }
                }
            }
        }
    }

    @Override // defpackage.dvl
    public final void f(dwc dwcVar) {
        if (dwcVar == null) {
            return;
        }
        this.ag = dwcVar;
        dwcVar.aq = this.af;
    }

    public final void g(dvs dvsVar) {
        this.c = dvsVar;
        f(dvsVar.b());
    }

    public final void h(Object obj) {
        this.ak = 15;
        this.X = obj;
    }

    public final void i(Object obj) {
        this.ak = 13;
        this.V = obj;
    }

    public final void j(Object obj) {
        this.ak = 12;
        this.U = obj;
    }

    public final void k() {
        int i = this.ak;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 19) {
                switch (i2) {
                    case 0:
                    case 1:
                        this.J = null;
                        this.K = null;
                        this.j = 0;
                        this.p = 0;
                        return;
                    case 2:
                    case 3:
                        this.L = null;
                        this.M = null;
                        this.k = 0;
                        this.q = 0;
                        return;
                    case 4:
                    case 5:
                        this.N = null;
                        this.O = null;
                        this.l = 0;
                        this.r = 0;
                        return;
                    case 6:
                    case 7:
                        this.P = null;
                        this.Q = null;
                        this.m = 0;
                        this.s = 0;
                        return;
                    case 8:
                    case 9:
                    case 10:
                        this.R = null;
                        this.S = null;
                        this.T = null;
                        this.n = 0;
                        this.t = 0;
                        return;
                    case 11:
                    case 12:
                    case 13:
                        this.U = null;
                        this.V = null;
                        this.W = null;
                        this.o = 0;
                        this.u = 0;
                        return;
                    case 14:
                        this.X = null;
                        return;
                    default:
                        return;
                }
            }
            this.aa = null;
            return;
        }
        this.J = null;
        this.K = null;
        this.j = 0;
        this.L = null;
        this.M = null;
        this.k = 0;
        this.N = null;
        this.O = null;
        this.l = 0;
        this.P = null;
        this.Q = null;
        this.m = 0;
        this.R = null;
        this.S = null;
        this.n = 0;
        this.U = null;
        this.V = null;
        this.o = 0;
        this.X = null;
        this.aa = null;
        this.h = 0.5f;
        this.i = 0.5f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
    }

    public final void l(Object obj) {
        this.ak = 8;
        this.Q = obj;
    }

    public final void m(Object obj) {
        this.ak = 7;
        this.P = obj;
    }

    public final void n(Object obj) {
        this.ak = 1;
        this.J = obj;
    }

    public void o(int i) {
        int i2 = this.ak;
        if (i2 != 0) {
            int i3 = i2 - 1;
            if (i3 != 19) {
                switch (i3) {
                    case 0:
                    case 1:
                        this.j = i;
                        return;
                    case 2:
                    case 3:
                        this.k = i;
                        return;
                    case 4:
                    case 5:
                        this.l = i;
                        return;
                    case 6:
                    case 7:
                        this.m = i;
                        return;
                    case 8:
                    case 9:
                    case 10:
                        this.n = i;
                        return;
                    case 11:
                    case 12:
                    case 13:
                        this.o = i;
                        return;
                    case 14:
                    case 15:
                    case 16:
                        this.v = i;
                        return;
                    default:
                        return;
                }
            }
            this.ac = i;
            return;
        }
        this.j = i;
        this.k = i;
        this.l = i;
        this.m = i;
        this.n = i;
        this.o = i;
    }

    public final void p(int i) {
        int i2 = this.ak;
        if (i2 != 0) {
            switch (i2 - 1) {
                case 0:
                case 1:
                    this.p = i;
                    return;
                case 2:
                case 3:
                    this.q = i;
                    return;
                case 4:
                case 5:
                    this.r = i;
                    return;
                case 6:
                case 7:
                    this.s = i;
                    return;
                case 8:
                case 9:
                case 10:
                    this.t = i;
                    return;
                case 11:
                case 12:
                case 13:
                    this.u = i;
                    return;
                case 14:
                case 15:
                case 16:
                    this.w = i;
                    return;
                default:
                    return;
            }
        }
        this.p = i;
        this.q = i;
        this.r = i;
        this.s = i;
        this.t = i;
        this.u = i;
    }

    public final void q(Object obj) {
        p(this.b.a(obj));
    }

    public final void r(Object obj) {
        this.ak = 4;
        this.M = obj;
    }

    public final void s(Object obj) {
        this.ak = 6;
        this.O = obj;
    }

    public final void t(Object obj) {
        this.ak = 5;
        this.N = obj;
    }

    public final void u(Object obj) {
        this.ak = 10;
        this.S = obj;
    }

    public final void v(Object obj) {
        this.ak = 9;
        this.R = obj;
    }

    public void w(Object obj) {
        o(this.b.a(obj));
    }
}
