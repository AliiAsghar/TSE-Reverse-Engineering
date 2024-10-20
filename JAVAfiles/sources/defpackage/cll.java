package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cll {
    public final float[] a;

    public static final long a(float[] fArr, long j) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f3 * intBitsToFloat) + (f6 * intBitsToFloat2)) + f9);
        float f11 = (f * intBitsToFloat) + (f4 * intBitsToFloat2) + f7;
        float f12 = (f2 * intBitsToFloat) + (f5 * intBitsToFloat2) + f8;
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = brg.a;
        }
        return (Float.floatToRawIntBits(f11 * f10) << 32) | (Float.floatToRawIntBits(f10 * f12) & 4294967295L);
    }

    public static final void b(float[] fArr, cjl cjlVar) {
        float f;
        float f2;
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[7];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        float f13 = cjlVar.a;
        float f14 = f6 * f13;
        float f15 = cjlVar.b;
        float f16 = f9 * f15;
        float f17 = 1.0f / ((f14 + f16) + f12);
        float f18 = cjlVar.c;
        float f19 = cjlVar.d;
        int floatToRawIntBits = Float.floatToRawIntBits(f17) & Integer.MAX_VALUE;
        float f20 = f4 * f13;
        float f21 = f7 * f15;
        float f22 = f20 + f21 + f10;
        float f23 = f13 * f5;
        float f24 = f15 * f8;
        float f25 = f23 + f24 + f11;
        float f26 = f9 * f19;
        float f27 = 1.0f / ((f14 + f26) + f12);
        int floatToRawIntBits2 = Float.floatToRawIntBits(f27) & Integer.MAX_VALUE;
        float f28 = f7 * f19;
        float f29 = f20 + f28 + f10;
        float f30 = f8 * f19;
        float f31 = f23 + f30 + f11;
        float f32 = f6 * f18;
        float f33 = 1.0f / ((f32 + f16) + f12);
        int floatToRawIntBits3 = Float.floatToRawIntBits(f33) & Integer.MAX_VALUE;
        float f34 = f4 * f18;
        float f35 = f34 + f21 + f10;
        float f36 = f5 * f18;
        float f37 = f24 + f36 + f11;
        float f38 = 1.0f / ((f32 + f26) + f12);
        int floatToRawIntBits4 = Float.floatToRawIntBits(f38) & Integer.MAX_VALUE;
        float f39 = f34 + f28 + f10;
        float f40 = f36 + f30 + f11;
        if (floatToRawIntBits2 < 2139095040) {
            f = f27;
        } else {
            f = 0.0f;
        }
        float f41 = f * f29;
        if (floatToRawIntBits3 < 2139095040) {
            f2 = f33;
        } else {
            f2 = 0.0f;
        }
        float f42 = f2 * f35;
        if (floatToRawIntBits4 >= 2139095040) {
            f38 = 0.0f;
        }
        float f43 = f39 * f38;
        float min = Math.min(f41, Math.min(f42, f43));
        if (floatToRawIntBits < 2139095040) {
            f3 = f17;
        } else {
            f3 = 0.0f;
        }
        float f44 = f3 * f22;
        cjlVar.a = Math.min(f44, min);
        float f45 = f2 * f37;
        float f46 = f38 * f40;
        float f47 = f * f31;
        float f48 = f3 * f25;
        cjlVar.b = Math.min(f48, Math.min(f47, Math.min(f45, f46)));
        cjlVar.c = Math.max(f44, Math.max(f41, Math.max(f42, f43)));
        cjlVar.d = Math.max(f48, Math.max(f47, Math.max(f45, f46)));
    }

    public static final void c(float[] fArr) {
        int length = fArr.length;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void d(float[] fArr, float[] fArr2) {
        int length = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[8];
        float f7 = f5 * f6;
        float f8 = fArr[3];
        float f9 = fArr2[12];
        float f10 = f8 * f9;
        float f11 = fArr2[1];
        float f12 = f * f11;
        float f13 = fArr2[5];
        float f14 = f3 * f13;
        float f15 = fArr2[9];
        float f16 = f5 * f15;
        float f17 = fArr2[13];
        float f18 = f8 * f17;
        float f19 = fArr2[2];
        float f20 = f * f19;
        float f21 = fArr2[6];
        float f22 = f3 * f21;
        float f23 = fArr2[10];
        float f24 = f5 * f23;
        float f25 = fArr2[14];
        float f26 = f8 * f25;
        float f27 = fArr2[3];
        float f28 = fArr2[7];
        float f29 = fArr2[11];
        float f30 = fArr2[15];
        float f31 = fArr[4];
        float f32 = fArr[5];
        float f33 = fArr[6];
        float f34 = f33 * f6;
        float f35 = fArr[7];
        float f36 = f35 * f9;
        float f37 = f31 * f11;
        float f38 = f32 * f13;
        float f39 = f33 * f15;
        float f40 = f35 * f17;
        float f41 = f31 * f19;
        float f42 = f32 * f21;
        float f43 = f33 * f23;
        float f44 = f35 * f25;
        float f45 = fArr[8];
        float f46 = fArr[9];
        float f47 = fArr[10];
        float f48 = f47 * f6;
        float f49 = fArr[11];
        float f50 = f49 * f9;
        float f51 = f45 * f11;
        float f52 = f46 * f13;
        float f53 = f47 * f15;
        float f54 = f49 * f17;
        float f55 = f45 * f19;
        float f56 = f46 * f21;
        float f57 = f47 * f23;
        float f58 = f49 * f25;
        float f59 = fArr[12];
        float f60 = fArr[13];
        float f61 = fArr[14];
        float f62 = fArr[15];
        float f63 = f9 * f62;
        float f64 = (f2 * f59) + (f4 * f60);
        float f65 = f15 * f61;
        float f66 = f17 * f62;
        float f67 = f23 * f61;
        float f68 = f25 * f62;
        fArr[0] = (f * f2) + (f3 * f4) + f7 + f10;
        fArr[1] = f12 + f14 + f16 + f18;
        fArr[2] = f20 + f22 + f24 + f26;
        fArr[3] = (f * f27) + (f3 * f28) + (f5 * f29) + (f8 * f30);
        fArr[4] = (f31 * f2) + (f32 * f4) + f34 + f36;
        fArr[5] = f37 + f38 + f39 + f40;
        fArr[6] = f41 + f42 + f43 + f44;
        fArr[7] = (f31 * f27) + (f32 * f28) + (f33 * f29) + (f35 * f30);
        fArr[8] = (f45 * f2) + (f46 * f4) + f48 + f50;
        fArr[9] = f51 + f52 + f53 + f54;
        fArr[10] = f55 + f56 + f57 + f58;
        fArr[11] = (f45 * f27) + (f46 * f28) + (f47 * f29) + (f49 * f30);
        fArr[12] = f64 + (f6 * f61) + f63;
        fArr[13] = (f11 * f59) + (f13 * f60) + f65 + f66;
        fArr[14] = (f19 * f59) + (f21 * f60) + f67 + f68;
        fArr[15] = (f59 * f27) + (f60 * f28) + (f61 * f29) + (f62 * f30);
    }

    public static /* synthetic */ float[] e() {
        return new float[]{1.0f, brg.a, brg.a, brg.a, brg.a, 1.0f, brg.a, brg.a, brg.a, brg.a, 1.0f, brg.a, brg.a, brg.a, brg.a, 1.0f};
    }

    public static final void f(float[] fArr, float f, float f2) {
        int length = fArr.length;
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * brg.a) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * brg.a) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * brg.a) + fArr[14];
        float f6 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * brg.a) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cll) && d.F(this.a, ((cll) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return arsd.q(sb.toString());
    }
}
