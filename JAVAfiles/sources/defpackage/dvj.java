package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvj {
    public static final Object a = new String("FIXED_DIMENSION");
    public static final Object b = new String("WRAP_DIMENSION");
    public static final Object c = new String("SPREAD_DIMENSION");
    public static final Object d = new String("PARENT_DIMENSION");
    public static final Object e = new String("PERCENT_DIMENSION");
    public static final Object f = new String("RATIO_DIMENSION");
    public int g;
    public int h;
    public float i;
    int j;
    public String k;
    public Object l;
    public boolean m;

    private dvj() {
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.l = b;
        this.m = false;
    }

    public static dvj a(int i) {
        dvj dvjVar = new dvj(a);
        dvjVar.l = null;
        dvjVar.j = i;
        return dvjVar;
    }

    public static dvj b(Object obj) {
        dvj dvjVar = new dvj(a);
        dvjVar.l = obj;
        return dvjVar;
    }

    public static dvj c(Object obj) {
        dvj dvjVar = new dvj();
        dvjVar.f(obj);
        return dvjVar;
    }

    public final void d(dwc dwcVar, int i) {
        String str = this.k;
        if (str != null) {
            dwcVar.y(str);
        }
        int i2 = 0;
        if (i == 0) {
            if (this.m) {
                dwcVar.aa(3);
                Object obj = this.l;
                if (obj == b) {
                    i2 = 1;
                } else if (obj == e) {
                    i2 = 2;
                }
                dwcVar.C(i2, this.g, this.h, this.i);
                return;
            }
            int i3 = this.g;
            if (i3 > 0) {
                dwcVar.J(i3);
            }
            int i4 = this.h;
            if (i4 < Integer.MAX_VALUE) {
                dwcVar.H(i4);
            }
            Object obj2 = this.l;
            if (obj2 == b) {
                dwcVar.aa(2);
                return;
            }
            if (obj2 == d) {
                dwcVar.aa(4);
                return;
            } else {
                if (obj2 == null) {
                    dwcVar.aa(1);
                    dwcVar.M(this.j);
                    return;
                }
                return;
            }
        }
        if (this.m) {
            dwcVar.ab(3);
            Object obj3 = this.l;
            if (obj3 == b) {
                i2 = 1;
            } else if (obj3 == e) {
                i2 = 2;
            }
            dwcVar.K(i2, this.g, this.h, this.i);
            return;
        }
        int i5 = this.g;
        if (i5 > 0) {
            dwcVar.I(i5);
        }
        int i6 = this.h;
        if (i6 < Integer.MAX_VALUE) {
            dwcVar.G(i6);
        }
        Object obj4 = this.l;
        if (obj4 == b) {
            dwcVar.ab(2);
            return;
        }
        if (obj4 == d) {
            dwcVar.ab(4);
        } else if (obj4 == null) {
            dwcVar.ab(1);
            dwcVar.B(this.j);
        }
    }

    public final void e(int i) {
        if (i >= 0) {
            this.g = i;
        }
    }

    public final void f(Object obj) {
        this.l = obj;
        this.m = true;
    }

    public dvj(Object obj) {
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.m = false;
        this.l = obj;
    }
}
