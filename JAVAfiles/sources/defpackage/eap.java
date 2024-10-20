package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eap {
    private static final ThreadLocal a = new ThreadLocal();

    public static double a(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = g(i, i2);
            }
            double b = b(i) + 0.05d;
            double b2 = b(i2) + 0.05d;
            return Math.max(b, b2) / Math.min(b, b2);
        }
        throw new IllegalArgumentException("background can not be translucent: #".concat(String.valueOf(Integer.toHexString(i2))));
    }

    public static double b(int i) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = red / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = green / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = blue / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            double d4 = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return d4 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int c(float[] fArr) {
        int round;
        int round2;
        int i;
        int i2;
        int i3 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 + f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                int i4 = round;
                i = round2;
                i2 = i4;
                break;
            case 1:
                i3 = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                int i42 = round;
                i = round2;
                i2 = i42;
                break;
            case 2:
                float f5 = abs2 + f4;
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round(f5 * 255.0f);
                break;
            case 3:
                float f6 = abs + f4;
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round(f6 * 255.0f);
                break;
            case 4:
                float f7 = abs + f4;
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round(f7 * 255.0f);
                break;
            case 5:
            case 6:
                float f8 = abs2 + f4;
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round(f8 * 255.0f);
                break;
            default:
                i2 = 0;
                i = 0;
                break;
        }
        return Color.rgb(m(i3), m(i2), m(i));
    }

    public static int d(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        double d8 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        double d9 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m((int) Math.round(d4 * 255.0d)), m((int) Math.round(d5 * 255.0d)), m((int) Math.round(d6 * 255.0d)));
    }

    public static int e(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static int f(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = f;
            if (a(h(i, 255), i2) >= d) {
                int i4 = 0;
                for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                    int i6 = (i4 + i3) / 2;
                    double a2 = a(h(i, i6), i2);
                    if (a2 >= d) {
                        i3 = i6;
                    }
                    if (a2 < d) {
                        i4 = i6;
                    }
                }
                return i3;
            }
            return -1;
        }
        throw new IllegalArgumentException("background can not be translucent: #".concat(String.valueOf(Integer.toHexString(i2))));
    }

    public static int g(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, k(Color.red(i), alpha2, Color.red(i2), alpha, i3), k(Color.green(i), alpha2, Color.green(i2), alpha, i3), k(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int h(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static void i(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else if (max == f3) {
                f = ((f4 - f2) / f5) + 2.0f;
            } else {
                f = 4.0f + ((f2 - f3) / f5);
            }
            abs = f5 / (1.0f - Math.abs((f6 + f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < brg.a) {
            f7 += 360.0f;
        }
        fArr[0] = l(f7, 360.0f);
        fArr[1] = l(abs, 1.0f);
        fArr[2] = l(f6, 1.0f);
    }

    public static void j(int i, float[] fArr) {
        i(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    private static int k(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static float l(float f, float f2) {
        if (f < brg.a) {
            return brg.a;
        }
        return Math.min(f, f2);
    }

    private static int m(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }
}
