package defpackage;

import defpackage.bcy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bej {
    public static final cjp a = new cjp(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final long a(bdy bdyVar, long j, bcy.a aVar) {
        cti ctiVar;
        cti j2;
        int i;
        float q;
        bcw e = bdyVar.e(aVar);
        if (e != null && (ctiVar = bdyVar.h) != null && (j2 = e.j()) != null && (i = aVar.b) <= e.d()) {
            cjn cjnVar = (cjn) bdyVar.i.a();
            cjnVar.getClass();
            float intBitsToFloat = Float.intBitsToFloat((int) (j2.h(ctiVar, cjnVar.a) >> 32));
            long f = e.f(i);
            if (djc.h(f)) {
                q = e.b(i);
            } else {
                float b = e.b(djc.e(f));
                float c = e.c(djc.a(f) - 1);
                q = arrn.q(intBitsToFloat, Math.min(b, c), Math.max(b, c));
            }
            if (q != -1.0f) {
                if (a.bB(j, 0L) || Math.abs(intBitsToFloat - q) <= ((int) (j >> 32)) / 2) {
                    if (e.a(i) != -1.0f) {
                        return ctiVar.h(j2, (Float.floatToRawIntBits(q) << 32) | (4294967295L & Float.floatToRawIntBits(r9)));
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public static final cjp b(cti ctiVar) {
        cjp e = ctj.e(ctiVar);
        long m = ctiVar.m(e.c());
        float f = e.d;
        float f2 = e.e;
        long j = m >> 32;
        long m2 = ctiVar.m((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new cjp(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) (m & 4294967295L)), Float.intBitsToFloat((int) (m2 >> 32)), Float.intBitsToFloat((int) (m2 & 4294967295L)));
    }

    public static final boolean c(cjp cjpVar, long j) {
        float f = cjpVar.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f <= intBitsToFloat && intBitsToFloat <= cjpVar.d) {
            float f2 = cjpVar.c;
            float f3 = cjpVar.e;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (f2 <= intBitsToFloat2 && intBitsToFloat2 <= f3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
