package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cno {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public cno(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean a() {
        if (this.a == -3.0d) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.a == -2.0d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cno)) {
            return false;
        }
        cno cnoVar = (cno) obj;
        if (Double.compare(this.a, cnoVar.a) == 0 && Double.compare(this.b, cnoVar.b) == 0 && Double.compare(this.c, cnoVar.c) == 0 && Double.compare(this.d, cnoVar.d) == 0 && Double.compare(this.e, cnoVar.e) == 0 && Double.compare(this.f, cnoVar.f) == 0 && Double.compare(this.g, cnoVar.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((d.aI(this.a) * 31) + d.aI(this.b)) * 31) + d.aI(this.c)) * 31) + d.aI(this.d)) * 31) + d.aI(this.e)) * 31) + d.aI(this.f)) * 31) + d.aI(this.g);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    public /* synthetic */ cno(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
