package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amv {
    private static final FillElement a = FillElement.a.b(1.0f);
    private static final FillElement b = new FillElement(aks.a, 1.0f);
    private static final FillElement c = FillElement.a.a(1.0f);
    private static final WrapContentElement d;
    private static final WrapContentElement e;
    private static final WrapContentElement f;
    private static final WrapContentElement g;
    private static final WrapContentElement h;
    private static final WrapContentElement i;

    static {
        int i2 = cfq.a;
        d = WrapContentElement.a.c(cfq.a.n);
        e = WrapContentElement.a.c(cfq.a.m);
        f = WrapContentElement.a.a(cfq.a.k);
        g = WrapContentElement.a.a(cfq.a.j);
        h = WrapContentElement.a.b(cfq.a.e);
        i = WrapContentElement.a.b(cfq.a.a);
    }

    public static final cga a(cga cgaVar, float f2, float f3) {
        return cgaVar.a(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static final cga b(cga cgaVar, float f2) {
        FillElement a2;
        if (f2 == 1.0f) {
            a2 = c;
        } else {
            a2 = FillElement.a.a(f2);
        }
        return cgaVar.a(a2);
    }

    public static final cga c(cga cgaVar, float f2) {
        FillElement b2;
        if (f2 == 1.0f) {
            b2 = a;
        } else {
            b2 = FillElement.a.b(f2);
        }
        return cgaVar.a(b2);
    }

    public static final cga d(cga cgaVar, float f2) {
        return cgaVar.a(new SizeElement(brg.a, f2, brg.a, f2, true, 5));
    }

    public static final cga e(cga cgaVar, float f2, float f3) {
        return cgaVar.a(new SizeElement(brg.a, f2, brg.a, f3, true, 5));
    }

    public static final cga f(cga cgaVar, float f2) {
        return cgaVar.a(new SizeElement(brg.a, f2, brg.a, f2, false, 5));
    }

    public static final cga g(cga cgaVar, float f2) {
        return cgaVar.a(new SizeElement(f2, f2, f2, f2, false));
    }

    public static final cga h(cga cgaVar, float f2) {
        return cgaVar.a(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final cga i(cga cgaVar, long j) {
        return j(cgaVar, dra.b(j), dra.a(j));
    }

    public static final cga j(cga cgaVar, float f2, float f3) {
        return cgaVar.a(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final cga k(cga cgaVar, float f2, float f3, float f4, float f5) {
        return cgaVar.a(new SizeElement(f2, f3, f4, f5, true));
    }

    public static final cga l(cga cgaVar, float f2) {
        return cgaVar.a(new SizeElement(f2, brg.a, f2, brg.a, true, 10));
    }

    public static final cga m(cga cgaVar, float f2, float f3) {
        return cgaVar.a(new SizeElement(f2, brg.a, f3, brg.a, true, 10));
    }

    public static /* synthetic */ cga n(cga cgaVar) {
        return cgaVar.a(b);
    }

    public static /* synthetic */ cga o(cga cgaVar) {
        return b(cgaVar, 1.0f);
    }

    public static /* synthetic */ cga p(cga cgaVar) {
        return c(cgaVar, 1.0f);
    }

    public static /* synthetic */ cga q(cga cgaVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return e(cgaVar, f2, f3);
    }

    public static /* synthetic */ cga r(cga cgaVar, float f2, float f3, int i2) {
        float f4;
        float f5;
        if ((i2 & 2) != 0) {
            f4 = Float.NaN;
        } else {
            f4 = f3;
        }
        if (1 == (i2 & 1)) {
            f5 = Float.NaN;
        } else {
            f5 = f2;
        }
        return cgaVar.a(new SizeElement(brg.a, f5, brg.a, f4, false, 5));
    }

    public static /* synthetic */ cga s(cga cgaVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return k(cgaVar, f2, f3, f4, f5);
    }

    public static /* synthetic */ cga t(cga cgaVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return m(cgaVar, f2, f3);
    }

    public static /* synthetic */ cga u(cga cgaVar) {
        WrapContentElement a2;
        int i2 = cfq.a;
        cfq.c cVar = cfq.a.k;
        if (d.F(cVar, cVar)) {
            a2 = f;
        } else if (d.F(cVar, cfq.a.j)) {
            a2 = g;
        } else {
            a2 = WrapContentElement.a.a(cVar);
        }
        return cgaVar.a(a2);
    }

    public static /* synthetic */ cga v(cga cgaVar, cfq cfqVar, int i2) {
        WrapContentElement b2;
        if ((i2 & 1) != 0) {
            int i3 = cfq.a;
            cfqVar = cfq.a.e;
        }
        int i4 = cfq.a;
        if (d.F(cfqVar, cfq.a.e)) {
            b2 = h;
        } else if (d.F(cfqVar, cfq.a.a)) {
            b2 = i;
        } else {
            b2 = WrapContentElement.a.b(cfqVar);
        }
        return cgaVar.a(b2);
    }

    public static /* synthetic */ cga w(cga cgaVar) {
        WrapContentElement c2;
        int i2 = cfq.a;
        cfq.b bVar = cfq.a.n;
        if (d.F(bVar, bVar)) {
            c2 = d;
        } else if (d.F(bVar, cfq.a.m)) {
            c2 = e;
        } else {
            c2 = WrapContentElement.a.c(bVar);
        }
        return cgaVar.a(c2);
    }

    public static /* synthetic */ cga x(cga cgaVar, float f2, float f3) {
        return cgaVar.a(new SizeElement(f2, f3, Float.NaN, Float.NaN, false));
    }
}
