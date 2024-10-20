package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cmu {
    private final cmk a;
    private final cmk b;
    private final cmk c;
    private final float[] d;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends cmu {
        private final cnn a;
        private final cnn b;
        private final float[] c;

        public a(cnn cnnVar, cnn cnnVar2) {
            super(cnnVar2, cnnVar, cnnVar2, null);
            float[] f;
            this.a = cnnVar;
            this.b = cnnVar2;
            if (cml.c(cnnVar.d, cnnVar2.d)) {
                f = cml.f(cnnVar2.j, cnnVar.i);
            } else {
                float[] fArr = cnnVar.i;
                float[] fArr2 = cnnVar2.j;
                float[] a = cnnVar.d.a();
                float[] a2 = cnnVar2.d.a();
                cnp cnpVar = cnnVar.d;
                cnp cnpVar2 = cmx.a;
                if (!cml.c(cnpVar, cmx.b)) {
                    float[] fArr3 = cmi.a.b;
                    float[] copyOf = Arrays.copyOf(cmx.e, 3);
                    copyOf.getClass();
                    fArr = cml.f(cml.d(fArr3, a, copyOf), cnnVar.i);
                }
                if (!cml.c(cnnVar2.d, cmx.b)) {
                    float[] fArr4 = cmi.a.b;
                    float[] copyOf2 = Arrays.copyOf(cmx.e, 3);
                    copyOf2.getClass();
                    fArr2 = cml.e(cml.f(cml.d(fArr4, a2, copyOf2), cnnVar2.i));
                }
                f = cml.f(fArr2, defpackage.a.bA(0, 3) ? cml.g(new float[]{a[0] / a2[0], a[1] / a2[1], a[2] / a2[2]}, fArr) : fArr);
            }
            this.c = f;
        }

        @Override // defpackage.cmu
        public final long a(long j) {
            double d = cku.d(j);
            float c = cku.c(j);
            float b = cku.b(j);
            float a = (float) this.a.p.a(d);
            float a2 = (float) this.a.p.a(c);
            float a3 = (float) this.a.p.a(b);
            float[] fArr = this.c;
            float f = fArr[0] * a;
            float f2 = fArr[3] * a2;
            float f3 = fArr[6] * a3;
            float f4 = fArr[1] * a;
            float f5 = fArr[4] * a2;
            float f6 = fArr[7] * a3;
            float f7 = fArr[2] * a;
            float f8 = fArr[5] * a2;
            return ckw.f((float) this.b.m.a(f + f2 + f3), (float) this.b.m.a(f4 + f5 + f6), (float) this.b.m.a(f7 + f8 + (fArr[8] * a3)), cku.a(j), this.b);
        }
    }

    public cmu(cmk cmkVar, cmk cmkVar2, cmk cmkVar3, float[] fArr) {
        this.a = cmkVar;
        this.b = cmkVar2;
        this.c = cmkVar3;
        this.d = fArr;
    }

    public long a(long j) {
        cmk cmkVar = this.b;
        float d = cku.d(j);
        float c = cku.c(j);
        float b = cku.b(j);
        long d2 = cmkVar.d(d, c, b);
        cmk cmkVar2 = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float c2 = cmkVar2.c(d, c, b);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            c2 *= fArr[2];
        }
        float f = intBitsToFloat2;
        float f2 = intBitsToFloat;
        float a2 = cku.a(j);
        return this.c.e(f2, f, c2, a2, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cmu(defpackage.cmk r9, defpackage.cmk r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.a.bB(r0, r2)
            if (r0 == 0) goto L16
            cnp r0 = defpackage.cmx.a
            cnp r0 = defpackage.cmx.b
            cmk r0 = defpackage.cml.h(r9, r0)
            goto L17
        L16:
            r0 = r9
        L17:
            long r4 = r10.b
            boolean r1 = defpackage.a.bB(r4, r2)
            if (r1 == 0) goto L28
            cnp r1 = defpackage.cmx.a
            cnp r1 = defpackage.cmx.b
            cmk r1 = defpackage.cml.h(r10, r1)
            goto L29
        L28:
            r1 = r10
        L29:
            r4 = 3
            boolean r11 = defpackage.a.bA(r11, r4)
            r5 = 0
            if (r11 != 0) goto L32
            goto L85
        L32:
            long r6 = r9.b
            boolean r11 = defpackage.a.bB(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.a.bB(r6, r2)
            r3 = 0
            if (r11 == 0) goto L45
            if (r2 == 0) goto L44
            goto L85
        L44:
            r2 = r3
        L45:
            r6 = 1
            if (r11 != 0) goto L4b
            if (r2 == 0) goto L85
            r2 = r6
        L4b:
            if (r6 == r11) goto L4e
            r9 = r10
        L4e:
            r9.getClass()
            cnn r9 = (defpackage.cnn) r9
            if (r11 == 0) goto L5c
            cnp r11 = r9.d
            float[] r11 = r11.a()
            goto L60
        L5c:
            cnp r11 = defpackage.cmx.a
            float[] r11 = defpackage.cmx.e
        L60:
            if (r2 == 0) goto L69
            cnp r9 = r9.d
            float[] r9 = r9.a()
            goto L6d
        L69:
            cnp r9 = defpackage.cmx.a
            float[] r9 = defpackage.cmx.e
        L6d:
            float[] r5 = new float[r4]
            r2 = r11[r3]
            r4 = r9[r3]
            float r2 = r2 / r4
            r5[r3] = r2
            r2 = r11[r6]
            r3 = r9[r6]
            float r2 = r2 / r3
            r5[r6] = r2
            r2 = 2
            r11 = r11[r2]
            r9 = r9[r2]
            float r11 = r11 / r9
            r5[r2] = r11
        L85:
            r8.<init>(r10, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmu.<init>(cmk, cmk, int):void");
    }
}
