package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aae implements aak {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public aae(float f, float f2, float f3, float f4) {
        int a;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            abi.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f4 - f2) * 3.0f;
        double d = f5;
        float f6 = (f2 + brg.a) * 3.0f;
        double d2 = f6;
        double d3 = d + d;
        float f7 = (1.0f - f4) * 3.0f;
        double d4 = f7;
        double d5 = (d2 - d3) + d4;
        if (d5 == 0.0d) {
            a = d == d4 ? 0 : ckk.a((float) ((d3 - d4) / (d3 - (d4 + d4))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d * d) - (d4 * d2));
            double d7 = (-d2) + d;
            int a2 = ckk.a((float) ((-(d6 + d7)) / d5), fArr, 0);
            a = ckk.a((float) ((d6 - d7) / d5), fArr, a2) + a2;
            if (a > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    a = 1;
                }
            }
        }
        float f10 = f5 - f6;
        float f11 = f7 - f5;
        float f12 = f10 + f10;
        int a3 = a + ckk.a((-f12) / ((f11 + f11) - f12), fArr, a);
        float min = Math.min(brg.a, 1.0f);
        float max = Math.max(brg.a, 1.0f);
        for (int i = 0; i < a3; i++) {
            float f13 = fArr[i];
            float f14 = ((((((((f2 - f4) * 3.0f) + 1.0f + brg.a) * f13) + (((f4 - (f2 + f2)) + brg.a) * 3.0f)) * f13) + f6) * f13) + brg.a;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long z = a.z(min, max);
        this.e = Float.intBitsToFloat((int) (z >> 32));
        this.f = Float.intBitsToFloat((int) (z & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0220, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0254, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0258, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c4, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L12;
     */
    @Override // defpackage.aak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r24) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aae.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aae) {
            aae aaeVar = (aae) obj;
            if (this.a == aaeVar.a && this.b == aaeVar.b && this.c == aaeVar.c && this.d == aaeVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
