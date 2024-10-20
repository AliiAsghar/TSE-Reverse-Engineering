package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bue {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final bue a(int i) {
            float f;
            bug bugVar = bug.a;
            float[][] fArr = buf.a;
            double b = buf.b((i >> 16) & 255);
            float b2 = buf.b((i >> 8) & 255);
            float b3 = buf.b(i & 255);
            double[][] dArr = buf.d;
            double[] dArr2 = dArr[0];
            double d = dArr2[0] * b;
            double d2 = b2;
            double d3 = dArr2[1] * d2;
            double d4 = b3;
            double d5 = dArr2[2] * d4;
            double[] dArr3 = dArr[1];
            double d6 = dArr3[0] * b;
            double d7 = dArr3[1] * d2;
            double d8 = dArr3[2] * d4;
            double[] dArr4 = dArr[2];
            float f2 = (float) ((b * dArr4[0]) + (d2 * dArr4[1]) + (d4 * dArr4[2]));
            float[] fArr2 = {(float) (d + d3 + d5), (float) (d6 + d7 + d8), f2};
            float[][] fArr3 = buf.a;
            float f3 = fArr2[0];
            float[] fArr4 = fArr3[0];
            float f4 = fArr4[0] * f3;
            float f5 = fArr2[1];
            float f6 = fArr4[1] * f5;
            float f7 = fArr4[2] * f2;
            float[] fArr5 = fArr3[1];
            float f8 = fArr5[0] * f3;
            float f9 = fArr5[1] * f5;
            float f10 = fArr5[2] * f2;
            float[] fArr6 = fArr3[2];
            float f11 = f3 * fArr6[0];
            float f12 = f5 * fArr6[1];
            float f13 = f2 * fArr6[2];
            float[] fArr7 = bugVar.g;
            float f14 = fArr7[0] * (f4 + f6 + f7);
            float f15 = fArr7[1] * (f8 + f9 + f10);
            float f16 = fArr7[2] * (f11 + f12 + f13);
            float pow = (float) Math.pow((bugVar.h * Math.abs(f14)) / 100.0f, 0.41999998688697815d);
            float pow2 = (float) Math.pow((bugVar.h * Math.abs(f15)) / 100.0f, 0.41999998688697815d);
            float pow3 = (float) Math.pow((bugVar.h * Math.abs(f16)) / 100.0f, 0.41999998688697815d);
            float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
            float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
            float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
            float atan2 = (((float) Math.atan2(((signum + signum2) - (signum3 + signum3)) / 9.0f, (((signum * 11.0f) + ((-12.0f) * signum2)) + signum3) / 11.0f)) * 180.0f) / 3.1415927f;
            if (atan2 < brg.a) {
                atan2 += 360.0f;
            } else if (atan2 >= 360.0f) {
                atan2 -= 360.0f;
            }
            float f17 = atan2;
            float f18 = (f17 * 3.1415927f) / 180.0f;
            float f19 = (((((40.0f * signum) + (signum2 * 20.0f)) + signum3) / 20.0f) * bugVar.d) / bugVar.c;
            float f20 = bugVar.f;
            float pow4 = ((float) Math.pow(f19, bugVar.j * 0.69000006f)) * 100.0f;
            if (f17 < 20.14d) {
                f = f17 + 360.0f;
            } else {
                f = f17;
            }
            float pow5 = ((float) Math.pow((((((((float) Math.cos(((f * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * bugVar.e) * ((float) Math.sqrt((r9 * r9) + (r2 * r2)))) / (((((signum * 20.0f) + r4) + (signum3 * 21.0f)) / 20.0f) + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, bugVar.b)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
            float f21 = bugVar.i * pow5;
            float f22 = bugVar.f;
            Math.sqrt((r0 * 0.69000006f) / (bugVar.c + 4.0f));
            float log = (float) Math.log((f21 * 0.0228f) + 1.0f);
            double d9 = f18;
            float f23 = log * 43.85965f;
            return new bue(f17, pow5, pow4, (1.7f * pow4) / ((0.007f * pow4) + 1.0f), f23 * ((float) Math.cos(d9)), f23 * ((float) Math.sin(d9)));
        }

        public static final bue b(float f, float f2, float f3) {
            bug bugVar = bug.a;
            float f4 = bugVar.i * f2;
            float sqrt = (float) Math.sqrt(f / 100.0d);
            float f5 = bugVar.f;
            Math.sqrt(((f2 / sqrt) * 0.69000006f) / (bugVar.c + 4.0f));
            float log = (float) Math.log((f4 * 0.0228d) + 1.0d);
            double d = (3.1415927f * f3) / 180.0f;
            float f6 = log * 43.85965f;
            return new bue(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), f6 * ((float) Math.cos(d)), f6 * ((float) Math.sin(d)));
        }
    }

    public bue(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final int a(bug bugVar) {
        float sqrt;
        float f = this.b;
        if (f != brg.a) {
            if (this.c != brg.a) {
                sqrt = f / ((float) Math.sqrt(r4 / 100.0f));
                float pow = (float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, bugVar.b), 0.7300000190734863d)), 1.1111111640930176d);
                float f2 = (this.a * 3.1415927f) / 180.0f;
                float cos = (float) Math.cos(2.0f + f2);
                float f3 = bugVar.c;
                float f4 = this.c / 100.0f;
                float f5 = bugVar.f;
                float pow2 = f3 * ((float) Math.pow(f4, 1.4492753f / bugVar.j));
                float f6 = (cos + 3.8f) * 0.25f * 3846.1538f * bugVar.e;
                float f7 = pow2 / bugVar.d;
                double d = f2;
                float sin = (float) Math.sin(d);
                float cos2 = (float) Math.cos(d);
                float f8 = sqrt / pow;
                float f9 = (((0.305f + f7) * 23.0f) * f8) / (((f6 * 23.0f) + ((11.0f * f8) * cos2)) + ((108.0f * f8) * sin));
                float f10 = cos2 * f9;
                float f11 = f9 * sin;
                float f12 = f7 * 460.0f;
                float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
                float max = Math.max(brg.a, (Math.abs(f13) * 27.13f) / (400.0f - Math.abs(f13)));
                float signum = Math.signum(f13) * (100.0f / bugVar.h);
                float pow3 = (float) Math.pow(max, 2.3809523582458496d);
                float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
                float max2 = Math.max(brg.a, (Math.abs(f14) * 27.13f) / (400.0f - Math.abs(f14)));
                float signum2 = Math.signum(f14) * (100.0f / bugVar.h);
                float pow4 = (float) Math.pow(max2, 2.3809523582458496d);
                float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
                float max3 = Math.max(brg.a, (Math.abs(f15) * 27.13f) / (400.0f - Math.abs(f15)));
                float signum3 = Math.signum(f15) * (100.0f / bugVar.h);
                float pow5 = (float) Math.pow(max3, 2.3809523582458496d);
                float[] fArr = bugVar.g;
                float f16 = (signum * pow3) / fArr[0];
                float f17 = (signum2 * pow4) / fArr[1];
                float f18 = (signum3 * pow5) / fArr[2];
                float[][] fArr2 = buf.a;
                float[][] fArr3 = buf.b;
                float[] fArr4 = fArr3[0];
                float f19 = fArr4[0] * f16;
                float f20 = fArr4[1] * f17;
                float f21 = fArr4[2] * f18;
                float[] fArr5 = fArr3[1];
                float f22 = fArr5[0] * f16;
                float f23 = fArr5[1] * f17;
                float f24 = fArr5[2] * f18;
                float[] fArr6 = fArr3[2];
                return eap.d(f19 + f20 + f21, f22 + f23 + f24, (f16 * fArr6[0]) + (f17 * fArr6[1]) + (f18 * fArr6[2]));
            }
        }
        sqrt = 0.0f;
        float pow6 = (float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, bugVar.b), 0.7300000190734863d)), 1.1111111640930176d);
        float f25 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = (float) Math.cos(2.0f + f25);
        float f32 = bugVar.c;
        float f42 = this.c / 100.0f;
        float f52 = bugVar.f;
        float pow22 = f32 * ((float) Math.pow(f42, 1.4492753f / bugVar.j));
        float f62 = (cos3 + 3.8f) * 0.25f * 3846.1538f * bugVar.e;
        float f72 = pow22 / bugVar.d;
        double d2 = f25;
        float sin2 = (float) Math.sin(d2);
        float cos22 = (float) Math.cos(d2);
        float f82 = sqrt / pow6;
        float f92 = (((0.305f + f72) * 23.0f) * f82) / (((f62 * 23.0f) + ((11.0f * f82) * cos22)) + ((108.0f * f82) * sin2));
        float f102 = cos22 * f92;
        float f112 = f92 * sin2;
        float f122 = f72 * 460.0f;
        float f132 = (((451.0f * f102) + f122) + (288.0f * f112)) / 1403.0f;
        float max4 = Math.max(brg.a, (Math.abs(f132) * 27.13f) / (400.0f - Math.abs(f132)));
        float signum4 = Math.signum(f132) * (100.0f / bugVar.h);
        float pow32 = (float) Math.pow(max4, 2.3809523582458496d);
        float f142 = ((f122 - (891.0f * f102)) - (261.0f * f112)) / 1403.0f;
        float max22 = Math.max(brg.a, (Math.abs(f142) * 27.13f) / (400.0f - Math.abs(f142)));
        float signum22 = Math.signum(f142) * (100.0f / bugVar.h);
        float pow42 = (float) Math.pow(max22, 2.3809523582458496d);
        float f152 = ((f122 - (f102 * 220.0f)) - (f112 * 6300.0f)) / 1403.0f;
        float max32 = Math.max(brg.a, (Math.abs(f152) * 27.13f) / (400.0f - Math.abs(f152)));
        float signum32 = Math.signum(f152) * (100.0f / bugVar.h);
        float pow52 = (float) Math.pow(max32, 2.3809523582458496d);
        float[] fArr7 = bugVar.g;
        float f162 = (signum4 * pow32) / fArr7[0];
        float f172 = (signum22 * pow42) / fArr7[1];
        float f182 = (signum32 * pow52) / fArr7[2];
        float[][] fArr22 = buf.a;
        float[][] fArr32 = buf.b;
        float[] fArr42 = fArr32[0];
        float f192 = fArr42[0] * f162;
        float f202 = fArr42[1] * f172;
        float f212 = fArr42[2] * f182;
        float[] fArr52 = fArr32[1];
        float f222 = fArr52[0] * f162;
        float f232 = fArr52[1] * f172;
        float f242 = fArr52[2] * f182;
        float[] fArr62 = fArr32[2];
        return eap.d(f192 + f202 + f212, f222 + f232 + f242, (f162 * fArr62[0]) + (f172 * fArr62[1]) + (f182 * fArr62[2]));
    }
}
