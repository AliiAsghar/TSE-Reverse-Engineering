package defpackage;

import defpackage.cmu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cml {
    public static final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d >= d5 * d4) {
            return (Math.pow(d, 1.0d / d6) - d3) / d2;
        }
        return d / d4;
    }

    public static final double b(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d >= d5) {
            return Math.pow((d2 * d) + d3, d6);
        }
        return d * d4;
    }

    public static final boolean c(cnp cnpVar, cnp cnpVar2) {
        if (cnpVar == cnpVar2) {
            return true;
        }
        if (Math.abs(cnpVar.a - cnpVar2.a) < 0.001f && Math.abs(cnpVar.b - cnpVar2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final float[] d(float[] fArr, float[] fArr2, float[] fArr3) {
        i(fArr, fArr2);
        i(fArr, fArr3);
        return f(e(fArr), g(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final float[] e(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static /* synthetic */ cmk h(cmk cmkVar, cnp cnpVar) {
        boolean bB = a.bB(cmkVar.b, 12884901888L);
        cmi cmiVar = cmi.a;
        if (bB) {
            cmkVar.getClass();
            cnn cnnVar = (cnn) cmkVar;
            if (!c(cnnVar.d, cnpVar)) {
                return new cnn(cnnVar.a, cnnVar.h, cnpVar, f(d(cmiVar.b, cnnVar.d.a(), cnpVar.a()), cnnVar.i), cnnVar.k, cnnVar.n, cnnVar.e, cnnVar.f, cnnVar.g, -1);
            }
            return cmkVar;
        }
        return cmkVar;
    }

    public static final void i(float[] fArr, float[] fArr2) {
        if (fArr2.length < 3) {
            return;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final cmu j(cmk cmkVar, cmk cmkVar2) {
        cmu cmuVar;
        if (cmkVar == cmkVar2) {
            return new cmt(cmkVar);
        }
        if (a.bB(cmkVar.b, 12884901888L) && a.bB(cmkVar2.b, 12884901888L)) {
            cmkVar.getClass();
            cmkVar2.getClass();
            cmuVar = new cmu.a((cnn) cmkVar, (cnn) cmkVar2);
        } else {
            cmuVar = new cmu(cmkVar, cmkVar2, 0);
        }
        return cmuVar;
    }
}
