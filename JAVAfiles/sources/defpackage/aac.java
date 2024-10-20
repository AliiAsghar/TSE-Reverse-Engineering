package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aac {
    public final a[][] a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final float a;
        public final float b;
        public float c;
        public float d;
        public final float e;
        public final float f;
        public final boolean g;
        public final float h;
        public final float i;
        private final float j;
        private final float k;
        private final float l;
        private final float m;
        private float n;
        private final float[] o;
        private final float p;
        private final float q;
        private final float r;

        public a(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            boolean z;
            float f7;
            boolean z2;
            float f8;
            float f9;
            float[] fArr;
            this.a = f;
            this.b = f2;
            this.j = f3;
            this.k = f4;
            this.l = f5;
            this.m = f6;
            float f10 = f6 - f4;
            if (i != 1 && (i == 4 ? f10 <= brg.a : i != 5 || f10 >= brg.a)) {
                z = false;
            } else {
                z = true;
            }
            float f11 = f5 - f3;
            if (true != z) {
                f7 = 1.0f;
            } else {
                f7 = -1.0f;
            }
            this.r = f7;
            float f12 = 1.0f / (f2 - f);
            this.p = f12;
            float[] fArr2 = new float[101];
            this.o = fArr2;
            if (i != 3 && Math.abs(f11) >= 0.001f && Math.abs(f10) >= 0.001f) {
                this.e = f11 * f7;
                this.f = f10 * (-f7);
                if (z) {
                    f8 = f5;
                } else {
                    f8 = f3;
                }
                this.h = f8;
                if (z) {
                    f9 = f4;
                } else {
                    f9 = f6;
                }
                this.i = f9;
                float f13 = f5 - f3;
                float f14 = f4 - f6;
                float[] fArr3 = aad.a;
                float f15 = f14;
                float f16 = 0.0f;
                float f17 = 0.0f;
                int i2 = 1;
                while (true) {
                    double radians = (float) Math.toRadians((i2 * 90.0d) / 90.0d);
                    float sin = ((float) Math.sin(radians)) * f13;
                    float cos = ((float) Math.cos(radians)) * f14;
                    double d = sin - f17;
                    fArr = fArr2;
                    f16 += (float) Math.hypot(d, cos - f15);
                    fArr3[i2] = f16;
                    if (i2 == 90) {
                        break;
                    }
                    i2++;
                    fArr2 = fArr;
                    f15 = cos;
                    f17 = sin;
                }
                this.n = f16;
                int i3 = 1;
                while (true) {
                    fArr3[i3] = fArr3[i3] / f16;
                    if (i3 == 90) {
                        break;
                    } else {
                        i3++;
                    }
                }
                for (int i4 = 0; i4 < 101; i4++) {
                    float f18 = i4 / 100.0f;
                    int binarySearch = Arrays.binarySearch(fArr3, 0, 91, f18);
                    if (binarySearch >= 0) {
                        fArr[i4] = binarySearch / 90.0f;
                    } else if (binarySearch == -1) {
                        fArr[i4] = 0.0f;
                    } else {
                        int i5 = -binarySearch;
                        int i6 = i5 - 1;
                        int i7 = i5 - 2;
                        float f19 = fArr3[i7];
                        fArr[i4] = (i7 + ((f18 - f19) / (fArr3[i6] - f19))) / 90.0f;
                    }
                }
                this.q = this.n * this.p;
                z2 = false;
            } else {
                float hypot = (float) Math.hypot(f10, f11);
                this.n = hypot;
                this.q = hypot * f12;
                this.h = f11 * f12;
                this.i = f10 * f12;
                this.e = Float.NaN;
                this.f = Float.NaN;
                z2 = true;
            }
            this.g = z2;
        }

        public final float a() {
            float f = this.e * this.d;
            return f * this.r * (this.q / ((float) Math.hypot(f, (-this.f) * this.c)));
        }

        public final float b() {
            float f = this.e * this.d;
            float f2 = (-this.f) * this.c;
            return f2 * this.r * (this.q / ((float) Math.hypot(f, f2)));
        }

        public final float c(float f) {
            float f2 = this.l;
            float f3 = this.j;
            return f3 + ((f - this.a) * this.p * (f2 - f3));
        }

        public final float d(float f) {
            float f2 = this.m;
            float f3 = this.k;
            return f3 + ((f - this.a) * this.p * (f2 - f3));
        }

        public final void e(float f) {
            float f2;
            if (this.r == -1.0f) {
                f2 = this.b - f;
            } else {
                f2 = f - this.a;
            }
            float f3 = f2 * this.p;
            float f4 = brg.a;
            if (f3 > brg.a) {
                f4 = 1.0f;
                if (f3 < 1.0f) {
                    float f5 = f3 * 100.0f;
                    float[] fArr = this.o;
                    int i = (int) f5;
                    float f6 = fArr[i];
                    f4 = f6 + ((f5 - i) * (fArr[i + 1] - f6));
                }
            }
            double d = f4 * 1.5707964f;
            this.c = (float) Math.sin(d);
            this.d = (float) Math.cos(d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if (r6 == 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[LOOP:1: B:15:0x0040->B:16:0x0042, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aac(int[] r27, float[] r28, float[][] r29) {
        /*
            r26 = this;
            r0 = r28
            r26.<init>()
            int r1 = r0.length
            int r1 = r1 + (-1)
            aac$a[][] r2 = new aac.a[r1]
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r4
            r7 = r6
        Lf:
            if (r5 >= r1) goto L7d
            r8 = r27[r5]
            r9 = 3
            if (r8 == 0) goto L2c
            if (r8 == r4) goto L29
            r10 = 2
            if (r8 == r10) goto L27
            if (r8 == r9) goto L25
            r9 = 4
            if (r8 == r9) goto L2c
            r9 = 5
            if (r8 == r9) goto L2c
            r15 = r7
            goto L2d
        L25:
            if (r6 != r4) goto L29
        L27:
            r6 = r10
            goto L2a
        L29:
            r6 = r4
        L2a:
            r15 = r6
            goto L2d
        L2c:
            r15 = r9
        L2d:
            r14 = r29[r5]
            int r16 = r5 + 1
            r17 = r29[r16]
            r18 = r0[r5]
            r19 = r0[r16]
            int r7 = r14.length
            int r8 = r7 >> 1
            r7 = r7 & r4
            int r13 = r8 + r7
            aac$a[] r12 = new aac.a[r13]
            r11 = r3
        L40:
            if (r11 >= r13) goto L75
            int r7 = r11 + r11
            aac$a r20 = new aac$a
            r21 = r14[r7]
            int r8 = r7 + 1
            r22 = r14[r8]
            r23 = r17[r7]
            r24 = r17[r8]
            r7 = r20
            r8 = r15
            r9 = r18
            r10 = r19
            r25 = r11
            r11 = r21
            r21 = r12
            r12 = r22
            r22 = r13
            r13 = r23
            r23 = r14
            r14 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r21[r25] = r20
            int r11 = r25 + 1
            r12 = r21
            r13 = r22
            r14 = r23
            goto L40
        L75:
            r21 = r12
            r2[r5] = r21
            r7 = r15
            r5 = r16
            goto Lf
        L7d:
            r5 = r26
            r5.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aac.<init>(int[], float[], float[][]):void");
    }
}
