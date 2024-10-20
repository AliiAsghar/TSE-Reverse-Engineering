package defpackage;

import defpackage.bck;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bck<T extends bck<T>> {
    public final dob a;
    public final bfn b;
    public long c;
    public final dhv d;
    private final dhv e;
    private final long f;
    private final diy g;

    public bck(dhv dhvVar, long j, diy diyVar, dob dobVar, bfn bfnVar) {
        this.e = dhvVar;
        this.f = j;
        this.g = diyVar;
        this.a = dobVar;
        this.b = bfnVar;
        this.c = j;
        this.d = dhvVar;
    }

    private final int A() {
        return this.a.a(djc.a(this.c));
    }

    private final void B() {
        int a;
        this.b.a();
        if (g().length() > 0 && (a = a()) != -1) {
            h(a, a);
        }
    }

    private final void C() {
        Integer e;
        this.b.a();
        if (g().length() > 0 && (e = e()) != null) {
            int intValue = e.intValue();
            h(intValue, intValue);
        }
    }

    private final void D() {
        int b;
        this.b.a();
        if (g().length() > 0 && (b = b()) != -1) {
            h(b, b);
        }
    }

    private final void E() {
        Integer f;
        this.b.a();
        if (g().length() > 0 && (f = f()) != null) {
            int intValue = f.intValue();
            h(intValue, intValue);
        }
    }

    private final int y(int i) {
        return arrn.s(i, g().length() - 1);
    }

    private final int z(diy diyVar, int i) {
        int A = A();
        bfn bfnVar = this.b;
        if (bfnVar.a == null) {
            bfnVar.a = Float.valueOf(diyVar.m(A).b);
        }
        int g = diyVar.g(A) + i;
        if (g < 0) {
            return 0;
        }
        if (g >= diyVar.e()) {
            return g().length();
        }
        float a = diyVar.a(g) - 1.0f;
        Float f = this.b.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((i() && floatValue >= diyVar.c(g)) || (!i() && floatValue <= diyVar.b(g))) {
            return diyVar.f(g, true);
        }
        return this.a.b(diyVar.j((Float.floatToRawIntBits(f.floatValue()) << 32) | (Float.floatToRawIntBits(a) & 4294967295L)));
    }

    public final int a() {
        return ayn.a(this.d.b, djc.a(this.c));
    }

    public final int b() {
        return ayn.b(this.d.b, djc.a(this.c));
    }

    public final Integer c() {
        diy diyVar = this.g;
        if (diyVar != null) {
            return Integer.valueOf(this.a.b(diyVar.f(diyVar.g(this.a.a(djc.c(this.c))), true)));
        }
        return null;
    }

    public final Integer d() {
        diy diyVar = this.g;
        if (diyVar != null) {
            return Integer.valueOf(this.a.b(diyVar.i(diyVar.g(this.a.a(djc.d(this.c))))));
        }
        return null;
    }

    public final Integer e() {
        int a;
        diy diyVar = this.g;
        if (diyVar != null) {
            int A = A();
            while (true) {
                if (A >= this.e.a()) {
                    a = this.e.a();
                    break;
                }
                long k = diyVar.k(y(A));
                if (djc.a(k) <= A) {
                    A++;
                } else {
                    a = this.a.b(djc.a(k));
                    break;
                }
            }
            return Integer.valueOf(a);
        }
        return null;
    }

    public final Integer f() {
        int i;
        diy diyVar = this.g;
        if (diyVar != null) {
            int A = A();
            while (true) {
                if (A <= 0) {
                    i = 0;
                    break;
                }
                long k = diyVar.k(y(A));
                if (djc.e(k) >= A) {
                    A--;
                } else {
                    i = this.a.b(djc.e(k));
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final String g() {
        return this.d.b;
    }

    public final void h(int i, int i2) {
        long a = djd.a(i, i2);
        long j = djc.a;
        this.c = a;
    }

    public final boolean i() {
        dqh dqhVar;
        diy diyVar = this.g;
        if (diyVar != null) {
            dqhVar = diyVar.q(A());
        } else {
            dqhVar = null;
        }
        if (dqhVar != dqh.b) {
            return true;
        }
        return false;
    }

    public final void j() {
        if (g().length() > 0) {
            long j = this.f;
            long j2 = djc.a;
            this.c = djd.a(djc.e(j), djc.a(this.c));
        }
    }

    public final void k() {
        diy diyVar;
        if (g().length() > 0 && (diyVar = this.g) != null) {
            int z = z(diyVar, 1);
            h(z, z);
        }
    }

    public final void l() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                D();
            } else {
                B();
            }
        }
    }

    public final void m() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                E();
            } else {
                C();
            }
        }
    }

    public final void n() {
        this.b.a();
        if (g().length() > 0) {
            int a = aym.a(g(), djc.c(this.c));
            if (a == djc.c(this.c) && a != g().length()) {
                a = aym.a(g(), a + 1);
            }
            h(a, a);
        }
    }

    public final void o() {
        this.b.a();
        if (g().length() > 0) {
            int b = aym.b(g(), djc.d(this.c));
            if (b == djc.d(this.c) && b != 0) {
                b = aym.b(g(), b - 1);
            }
            h(b, b);
        }
    }

    public final void p() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                B();
            } else {
                D();
            }
        }
    }

    public final void q() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                C();
            } else {
                E();
            }
        }
    }

    public final void r() {
        this.b.a();
        if (g().length() > 0) {
            int length = g().length();
            h(length, length);
        }
    }

    public final void s() {
        this.b.a();
        if (g().length() > 0) {
            h(0, 0);
        }
    }

    public final void t() {
        Integer c;
        this.b.a();
        if (g().length() > 0 && (c = c()) != null) {
            int intValue = c.intValue();
            h(intValue, intValue);
        }
    }

    public final void u() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                w();
            } else {
                t();
            }
        }
    }

    public final void v() {
        this.b.a();
        if (g().length() > 0) {
            if (i()) {
                t();
            } else {
                w();
            }
        }
    }

    public final void w() {
        Integer d;
        this.b.a();
        if (g().length() > 0 && (d = d()) != null) {
            int intValue = d.intValue();
            h(intValue, intValue);
        }
    }

    public final void x() {
        diy diyVar;
        if (g().length() > 0 && (diyVar = this.g) != null) {
            int z = z(diyVar, -1);
            h(z, z);
        }
    }
}
