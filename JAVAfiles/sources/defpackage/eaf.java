package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public eaf(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eaf b(int i) {
        float f;
        eao eaoVar = eao.a;
        float a = eag.a(Color.red(i));
        float a2 = eag.a(Color.green(i));
        float a3 = eag.a(Color.blue(i));
        float[][] fArr = eag.d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[0] * a) + (fArr2[1] * a2);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[0] * a) + (fArr3[1] * a2);
        float[] fArr4 = fArr[2];
        float f4 = (a * fArr4[0]) + (a2 * fArr4[1]) + (a3 * fArr4[2]);
        float[] fArr5 = {f2 + (fArr2[2] * a3), f3 + (fArr3[2] * a3), f4};
        float[][] fArr6 = eag.a;
        float f5 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f6 = fArr7[0] * f5;
        float f7 = fArr5[1];
        float f8 = fArr7[1] * f7;
        float f9 = fArr7[2] * f4;
        float[] fArr8 = fArr6[1];
        float f10 = fArr8[0] * f5;
        float f11 = fArr8[1] * f7;
        float f12 = fArr8[2] * f4;
        float[] fArr9 = fArr6[2];
        float f13 = f5 * fArr9[0];
        float f14 = f7 * fArr9[1];
        float f15 = f4 * fArr9[2];
        float[] fArr10 = eaoVar.g;
        float f16 = fArr10[0] * (f6 + f8 + f9);
        float f17 = fArr10[1] * (f10 + f11 + f12);
        float f18 = fArr10[2] * (f13 + f14 + f15);
        float pow = (float) Math.pow((eaoVar.h * Math.abs(f16)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((eaoVar.h * Math.abs(f17)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((eaoVar.h * Math.abs(f18)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float atan2 = (((float) Math.atan2(((float) ((signum + signum2) - (d + d))) / 9.0f, ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < brg.a) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float f20 = (((((40.0f * signum) + (signum2 * 20.0f)) + signum3) / 20.0f) * eaoVar.c) / eaoVar.b;
        float f21 = eaoVar.e;
        float pow4 = (float) Math.pow(f20, eaoVar.j * 0.69f);
        float f22 = eaoVar.e;
        float f23 = pow4 * 100.0f;
        float sqrt = ((float) Math.sqrt(f23 / 100.0f)) * 5.7971015f * (eaoVar.b + 4.0f) * eaoVar.i;
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float cos = ((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f * 3846.1538f * eaoVar.d;
        float sqrt2 = (float) Math.sqrt((r0 * r0) + (r5 * r5));
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, eaoVar.f), 0.73d)) * ((float) Math.pow((cos * sqrt2) / (((((signum * 20.0f) + r14) + (21.0f * signum3)) / 20.0f) + 0.305f), 0.9d)) * ((float) Math.sqrt(f23 / 100.0d));
        float f24 = eaoVar.i * pow5;
        float f25 = eaoVar.e;
        float sqrt3 = (float) Math.sqrt((r11 * 0.69f) / (eaoVar.b + 4.0f));
        double d2 = f19;
        float log = ((float) Math.log((0.0228f * f24) + 1.0f)) * 43.85965f;
        float cos2 = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        fArr5[0] = atan2;
        fArr5[1] = pow5;
        float f26 = log * sin;
        float[] fArr11 = {f23, sqrt, f24, sqrt3 * 50.0f, (1.7f * f23) / ((0.007f * f23) + 1.0f), cos2 * log, f26};
        return new eaf(atan2, pow5, fArr11[0], fArr11[4], fArr11[5], f26);
    }

    public static eaf c(float f, float f2, float f3) {
        eao eaoVar = eao.a;
        float f4 = eaoVar.e;
        double d = f / 100.0d;
        Math.sqrt(d);
        float f5 = eaoVar.b;
        float f6 = eaoVar.i * f2;
        float sqrt = (float) Math.sqrt(d);
        float f7 = eaoVar.e;
        Math.sqrt(((f2 / sqrt) * 0.69f) / (eaoVar.b + 4.0f));
        double d2 = (3.1415927f * f3) / 180.0f;
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        return new eaf(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(eao eaoVar) {
        float f = this.b;
        double d = f;
        float f2 = brg.a;
        if (d != 0.0d) {
            double d2 = this.c;
            if (d2 != 0.0d) {
                f2 = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        }
        float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, eaoVar.f), 0.73d), 1.1111111111111112d);
        double d3 = (this.a * 3.1415927f) / 180.0f;
        double cos = Math.cos(2.0d + d3) + 3.8d;
        float f3 = eaoVar.e;
        float pow2 = eaoVar.b * ((float) Math.pow(this.c / 100.0d, 1.4492753673265821d / eaoVar.j));
        float f4 = ((float) cos) * 0.25f * 3846.1538f * eaoVar.d;
        float f5 = pow2 / eaoVar.c;
        float sin = (float) Math.sin(d3);
        float cos2 = (float) Math.cos(d3);
        float f6 = (((0.305f + f5) * 23.0f) * pow) / (((f4 * 23.0f) + ((11.0f * pow) * cos2)) + ((108.0f * pow) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = f5 * 460.0f;
        float max = (float) Math.max(0.0d, (Math.abs(r2) * 27.13d) / (400.0d - Math.abs(r2)));
        float signum = Math.signum((((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f) * (100.0f / eaoVar.h);
        float pow3 = (float) Math.pow(max, 2.380952380952381d);
        float max2 = (float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8)));
        float signum2 = Math.signum(((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f) * (100.0f / eaoVar.h);
        float pow4 = (float) Math.pow(max2, 2.380952380952381d);
        float f10 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float max3 = (float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
        float signum3 = Math.signum(f10) * (100.0f / eaoVar.h);
        float pow5 = (float) Math.pow(max3, 2.380952380952381d);
        float[] fArr = eaoVar.g;
        float f11 = (signum * pow3) / fArr[0];
        float f12 = (signum2 * pow4) / fArr[1];
        float f13 = (signum3 * pow5) / fArr[2];
        float[][] fArr2 = eag.b;
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f11;
        float f15 = fArr3[1] * f12;
        float f16 = fArr3[2] * f13;
        float[] fArr4 = fArr2[1];
        float f17 = fArr4[0] * f11;
        float f18 = fArr4[1] * f12;
        float f19 = fArr4[2] * f13;
        float[] fArr5 = fArr2[2];
        return eap.d(f14 + f15 + f16, f17 + f18 + f19, (f11 * fArr5[0]) + (f12 * fArr5[1]) + (f13 * fArr5[2]));
    }
}
