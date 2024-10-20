package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckw {
    public static final float a(long j) {
        cmk f = cku.f(j);
        if (!a.bB(f.b, 12884901888L)) {
            String a = cmj.a(f.b);
            Objects.toString(a);
            clj.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(a));
        }
        f.getClass();
        cmw cmwVar = ((cnn) f).p;
        float a2 = (float) ((cmwVar.a(cku.d(j)) * 0.2126d) + (cmwVar.a(cku.c(j)) * 0.7152d) + (cmwVar.a(cku.b(j)) * 0.0722d));
        if (a2 < brg.a) {
            a2 = 0.0f;
        }
        if (a2 > 1.0f) {
            return 1.0f;
        }
        return a2;
    }

    public static final int b(long j) {
        float[] fArr = cms.a;
        return (int) (cku.e(j, cms.e) >>> 32);
    }

    public static final long c(int i) {
        long j = cku.a;
        return i << 32;
    }

    public static final long d(long j) {
        long j2 = cku.a;
        return j << 32;
    }

    public static final long e(int i, int i2, int i3, int i4) {
        return c(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long f(float r19, float r20, float r21, float r22, defpackage.cmk r23) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckw.f(float, float, float, float, cmk):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long g(float r18, float r19, float r20, float r21, defpackage.cmk r22) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckw.g(float, float, float, float, cmk):long");
    }

    public static final long h(long j, long j2) {
        float f;
        float f2;
        long e = cku.e(j, cku.f(j2));
        float a = cku.a(e);
        float d = cku.d(e);
        float d2 = cku.d(j2);
        float a2 = cku.a(j2);
        float f3 = 1.0f - a;
        float f4 = (a2 * f3) + a;
        float f5 = brg.a;
        if (f4 == brg.a) {
            f = 0.0f;
        } else {
            f = ((d * a) + ((d2 * a2) * f3)) / f4;
        }
        float c = cku.c(e);
        float c2 = cku.c(j2);
        if (f4 == brg.a) {
            f2 = 0.0f;
        } else {
            f2 = ((c * a) + ((c2 * a2) * f3)) / f4;
        }
        float b = cku.b(e);
        float b2 = cku.b(j2);
        if (f4 != brg.a) {
            f5 = ((b * a) + ((b2 * a2) * f3)) / f4;
        }
        return g(f, f2, f5, f4, cku.f(j2));
    }

    public static final long i(long j, long j2, float f) {
        float[] fArr = cms.a;
        cmk cmkVar = cms.x;
        long e = cku.e(j, cmkVar);
        long e2 = cku.e(j2, cmkVar);
        float a = cku.a(e);
        float d = cku.d(e);
        float c = cku.c(e);
        float b = cku.b(e);
        float a2 = cku.a(e2);
        float d2 = cku.d(e2);
        float c2 = cku.c(e2);
        float b2 = cku.b(e2);
        if (f < brg.a) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return cku.e(g(drv.b(d, d2, f), drv.b(c, c2, f), drv.b(b, b2, f), drv.b(a, a2, f), cmkVar), cku.f(j2));
    }

    public static /* synthetic */ long j(float f, float f2, float f3, float f4, cmk cmkVar, int i) {
        if ((i & 16) != 0) {
            float[] fArr = cms.a;
            cmkVar = cms.e;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return f(f, f2, f3, f4, cmkVar);
    }

    public static /* synthetic */ long k(int i, int i2, int i3) {
        return e(i, i2, i3, 255);
    }
}
