package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnh {
    public int a;
    public int b;
    public int c = -1;
    public int d = -1;
    private final doc e;

    public dnh(dhv dhvVar, long j) {
        this.e = new doc(dhvVar.b);
        this.a = djc.d(j);
        this.b = djc.c(j);
        int d = djc.d(j);
        int c = djc.c(j);
        if (d >= 0 && d <= dhvVar.a()) {
            if (c >= 0 && c <= dhvVar.a()) {
                if (d <= c) {
                    return;
                } else {
                    throw new IllegalArgumentException(a.bU(c, d, "Do not set reversed range: ", " > "));
                }
            } else {
                throw new IndexOutOfBoundsException("end (" + c + ") offset is outside of text region " + dhvVar.a());
            }
        }
        throw new IndexOutOfBoundsException("start (" + d + ") offset is outside of text region " + dhvVar.a());
    }

    private final void l(int i) {
        if (i < 0) {
            doz.b(a.bV(i, "Cannot set selectionEnd to a negative value: "));
        }
        this.b = i;
    }

    private final void m(int i) {
        if (i < 0) {
            doz.b(a.bV(i, "Cannot set selectionStart to a negative value: "));
        }
        this.a = i;
    }

    public final char a(int i) {
        doc docVar = this.e;
        dnk dnkVar = docVar.b;
        if (dnkVar == null) {
            return docVar.a.charAt(i);
        }
        int i2 = docVar.c;
        if (i < i2) {
            return docVar.a.charAt(i);
        }
        int b = dnkVar.b();
        if (i < b + i2) {
            int i3 = i - i2;
            int i4 = dnkVar.c;
            if (i3 < i4) {
                return dnkVar.b[i3];
            }
            return dnkVar.b[(i3 - i4) + dnkVar.d];
        }
        return docVar.a.charAt(i - ((b - docVar.d) + i2));
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return this.e.a();
    }

    public final long d() {
        long a = djd.a(this.a, this.b);
        long j = djc.a;
        return a;
    }

    public final djc e() {
        if (k()) {
            return new djc(djd.a(this.c, this.d));
        }
        return null;
    }

    public final void f() {
        this.c = -1;
        this.d = -1;
    }

    public final void g(int i, int i2) {
        long a = djd.a(i, i2);
        long j = djc.a;
        this.e.b(i, i2, "");
        long a2 = dni.a(djd.a(this.a, this.b), a);
        m(djc.d(a2));
        l(djc.c(a2));
        if (k()) {
            long a3 = dni.a(djd.a(this.c, this.d), a);
            if (djc.h(a3)) {
                f();
            } else {
                this.c = djc.d(a3);
                this.d = djc.c(a3);
            }
        }
    }

    public final void h(int i, int i2, String str) {
        if (i >= 0 && i <= this.e.a()) {
            if (i2 >= 0 && i2 <= this.e.a()) {
                if (i <= i2) {
                    this.e.b(i, i2, str);
                    m(str.length() + i);
                    l(i + str.length());
                    this.c = -1;
                    this.d = -1;
                    return;
                }
                throw new IllegalArgumentException(a.bU(i2, i, "Do not set reversed range: ", " > "));
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.e.a());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void i(int i, int i2) {
        if (i >= 0 && i <= this.e.a()) {
            if (i2 >= 0 && i2 <= this.e.a()) {
                if (i < i2) {
                    this.c = i;
                    this.d = i2;
                    return;
                }
                throw new IllegalArgumentException(a.bU(i2, i, "Do not set reversed or empty range: ", " > "));
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.e.a());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void j(int i, int i2) {
        if (i >= 0 && i <= this.e.a()) {
            if (i2 >= 0 && i2 <= this.e.a()) {
                if (i <= i2) {
                    m(i);
                    l(i2);
                    return;
                }
                throw new IllegalArgumentException(a.bU(i2, i, "Do not set reversed range: ", " > "));
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.e.a());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final boolean k() {
        if (this.c != -1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.e.toString();
    }
}
