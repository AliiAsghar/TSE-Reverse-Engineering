package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abl {
    public float a = 1.0f;
    public double b = Math.sqrt(50.0d);
    public float c = 1.0f;

    public final float a() {
        double d = this.b;
        return (float) (d * d);
    }

    public final long b(float f, float f2, long j) {
        double exp;
        double exp2;
        float f3 = f - this.a;
        float f4 = this.c;
        double d = f4;
        double d2 = this.b;
        double d3 = (-f4) * d2;
        double d4 = f2;
        double d5 = f3;
        double d6 = d * d;
        double d7 = j / 1000.0d;
        if (f4 > 1.0f) {
            double sqrt = d2 * Math.sqrt(d6 - 1.0d);
            double d8 = d3 + sqrt;
            double d9 = d3 - sqrt;
            double d10 = d9 * d7;
            double d11 = ((d9 * d5) - d4) / (d9 - d8);
            double d12 = d5 - d11;
            double exp3 = Math.exp(d10) * d12;
            double d13 = d7 * d8;
            double exp4 = Math.exp(d13) * d11;
            exp2 = (d12 * d9 * Math.exp(d10)) + (d11 * d8 * Math.exp(d13));
            exp = exp3 + exp4;
        } else if (f4 == 1.0f) {
            double d14 = (-d2) * d7;
            double d15 = d4 + (d2 * d5);
            double d16 = d5 + (d7 * d15);
            double exp5 = Math.exp(d14) * d16;
            exp2 = (d16 * Math.exp(d14) * (-this.b)) + (d15 * Math.exp(d14));
            exp = exp5;
        } else {
            double sqrt2 = d2 * Math.sqrt(1.0d - d6);
            double d17 = sqrt2 * d7;
            double d18 = d7 * d3;
            double d19 = (1.0d / sqrt2) * (((-d3) * d5) + d4);
            exp = Math.exp(d18) * ((Math.cos(d17) * d5) + (Math.sin(d17) * d19));
            exp2 = (Math.exp(d18) * (((-sqrt2) * d5 * Math.sin(d17)) + (sqrt2 * d19 * Math.cos(d17)))) + (d3 * exp);
        }
        return (Float.floatToRawIntBits((float) (exp + this.a)) << 32) | (Float.floatToRawIntBits((float) exp2) & 4294967295L);
    }
}
