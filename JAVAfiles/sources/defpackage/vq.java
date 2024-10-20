package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vq {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = new float[101];
    private static final float[] c = new float[101];

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i = 0;
        float f10 = brg.a;
        float f11 = 0.0f;
        while (true) {
            float[] fArr = b;
            float[] fArr2 = c;
            float f12 = 1.0f;
            if (i < 100) {
                float f13 = i;
                float f14 = 1.0f;
                while (true) {
                    f = f13 / 100.0f;
                    f2 = ((f14 - f10) / 2.0f) + f10;
                    f3 = f12 - f2;
                    f4 = f2 * 3.0f * f3;
                    f5 = f2 * f2 * f2;
                    float f15 = (((f3 * 0.175f) + (f2 * 0.35000002f)) * f4) + f5;
                    float f16 = f14;
                    if (Math.abs(f15 - f) < 1.0E-5d) {
                        break;
                    }
                    if (f15 > f) {
                        f14 = f2;
                    } else {
                        f10 = f2;
                        f14 = f16;
                    }
                    f12 = 1.0f;
                }
                fArr[i] = (f4 * ((f3 * 0.5f) + f2)) + f5;
                float f17 = 1.0f;
                while (true) {
                    f6 = ((f17 - f11) / 2.0f) + f11;
                    f7 = 1.0f - f6;
                    f8 = f6 * 3.0f * f7;
                    f9 = f6 * f6 * f6;
                    float f18 = (((f7 * 0.5f) + f6) * f8) + f9;
                    if (Math.abs(f18 - f) >= 1.0E-5d) {
                        if (f18 > f) {
                            f17 = f6;
                        } else {
                            f11 = f6;
                        }
                    }
                }
                fArr2[i] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
                i++;
            } else {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static final a a(float f) {
        float f2 = brg.a;
        float f3 = 1.0f;
        float q = arrn.q(f, brg.a, 1.0f);
        int i = (int) (q * 100.0f);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = b;
            float f5 = fArr[i];
            float f6 = q - f4;
            f2 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            f3 = f5 + (f6 * f2);
        }
        return new a(f3, f2);
    }
}
