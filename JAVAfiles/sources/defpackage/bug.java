package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bug {
    public static final bug a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f = 0.69000006f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[][] fArr = buf.a;
        float[] fArr2 = buf.c;
        double d = buf.d(50.0d) * 63.66197723675813d;
        float[][] fArr3 = buf.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = fArr4[1] * f3;
        float f5 = fArr2[2];
        float f6 = fArr4[2] * f5;
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0] * f;
        float f8 = fArr5[1] * f3;
        float f9 = fArr5[2] * f5;
        float[] fArr6 = fArr3[2];
        float f10 = f * fArr6[0];
        float f11 = f3 * fArr6[1];
        float f12 = f5 * fArr6[2];
        float f13 = (float) (d / 100.0d);
        float exp = 1.0f - (((float) Math.exp(((-f13) - 42.0f) / 92.0f)) * 0.2777778f);
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = brg.a;
        }
        float f14 = f7 + f8 + f9;
        float f15 = f2 + f4 + f6;
        float[] fArr7 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / ((f10 + f11) + f12)) * exp) + 1.0f) - exp};
        float f16 = 1.0f / ((5.0f * f13) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float cbrt = (float) Math.cbrt(f13 * 5.0d);
        float d3 = ((float) buf.d(50.0d)) / fArr2[1];
        double d4 = d3;
        float sqrt = (float) Math.sqrt(d4);
        float pow = (float) Math.pow(d4, 0.20000000298023224d);
        float f19 = (f17 * f13) + (0.1f * f18 * f18 * cbrt);
        float pow2 = (float) Math.pow(((fArr7[0] * f19) * f15) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow(((fArr7[1] * f19) * f14) / 100.0f, 0.41999998688697815d);
        float pow4 = (float) Math.pow(((fArr7[2] * f19) * r7) / 100.0f, 0.41999998688697815d);
        float[] fArr8 = {pow2, pow3, pow4};
        float f20 = fArr8[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr8[1];
        float f23 = (400.0f * pow4) / (pow4 + 27.13f);
        float[] fArr9 = {f21, (f22 * 400.0f) / (f22 + 27.13f), f23};
        float f24 = fArr9[0];
        float f25 = 0.725f / pow;
        a = new bug(d3, (f24 + f24 + fArr9[1] + (f23 * 0.05f)) * f25, f25, f25, fArr7, f19, (float) Math.pow(f19, 0.25d), sqrt + 1.48f);
    }

    public bug(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.g = fArr;
        this.h = f5;
        this.i = f6;
        this.j = f7;
    }
}
