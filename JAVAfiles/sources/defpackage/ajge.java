package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajge {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    static final double[] b = {95.047d, 100.0d, 108.883d};

    public static double a(int i) {
        double pow;
        double d = i / 255.0d;
        if (d <= 0.040449936d) {
            pow = d / 12.92d;
        } else {
            pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
        return pow * 100.0d;
    }

    public static double b(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d2 * d2 * d2;
        if (d3 <= 0.008856451679035631d) {
            d3 = ((d2 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d3 * 100.0d;
    }

    public static int c(double[] dArr) {
        return d(a.L(dArr[0]), a.L(dArr[1]), a.L(dArr[2]));
    }

    public static int d(int i, int i2, int i3) {
        return (i << 16) | (-16777216) | (i2 << 8) | i3;
    }
}
