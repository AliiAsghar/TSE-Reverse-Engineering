package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buf {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final double[][] d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    private static final double[][] e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    public static final int a(float f) {
        float f2;
        boolean z;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (16.0f + f) / 116.0f;
        float f5 = f4 * f4 * f4;
        if (f > 8.0f) {
            f2 = f5;
        } else {
            f2 = f / 903.2963f;
        }
        if (f5 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return eap.d(f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]);
    }

    public static final float b(int i) {
        float pow;
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final int c(double d2) {
        if (d2 < 0.0d) {
            return -1;
        }
        if (d2 != 0.0d) {
            return 1;
        }
        return 0;
    }

    public static final double d(double d2) {
        double d3;
        if (d2 > 8.0d) {
            d3 = Math.pow((d2 + 16.0d) / 116.0d, 3.0d);
        } else {
            d3 = d2 / 903.2962962962963d;
        }
        return d3 * 100.0d;
    }

    public static final int e(double d2, double d3, double d4) {
        return g(a.L(d2), a.L(d3), a.L(d4));
    }

    public static final int f(double d2) {
        double d3;
        boolean z;
        double d4;
        double d5 = (d2 + 16.0d) / 116.0d;
        double d6 = d5 * d5 * d5;
        if (d2 > 8.0d) {
            d3 = d6;
        } else {
            d3 = d2 / 903.2962962962963d;
        }
        if (d6 > 0.008856451679035631d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d4 = d6;
        } else {
            d4 = d2 / 903.2962962962963d;
        }
        if (!z) {
            d6 = d2 / 903.2962962962963d;
        }
        double d7 = d4 * r0[0];
        double d8 = d3 * r0[1];
        double d9 = c[2];
        double[][] dArr = e;
        double[] dArr2 = dArr[0];
        double d10 = dArr2[0] * d7;
        double d11 = dArr2[1] * d8;
        double d12 = d6 * d9;
        double d13 = dArr2[2] * d12;
        double[] dArr3 = dArr[1];
        double d14 = dArr3[0] * d7;
        double d15 = dArr3[1] * d8;
        double d16 = dArr3[2] * d12;
        double[] dArr4 = dArr[2];
        return g(a.L(d10 + d11 + d13), a.L(d14 + d15 + d16), a.L((dArr4[0] * d7) + (dArr4[1] * d8) + (dArr4[2] * d12)));
    }

    private static final int g(int i, int i2, int i3) {
        return (i << 16) | (-16777216) | (i2 << 8) | i3;
    }
}
