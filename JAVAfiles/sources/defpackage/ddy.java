package defpackage;

import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddy {
    public static final boolean a(cln clnVar, float f, float f2) {
        if (clnVar instanceof cln.b) {
            cjp cjpVar = ((cln.b) clnVar).a;
            if (cjpVar.b <= f && f < cjpVar.d && cjpVar.c <= f2 && f2 < cjpVar.e) {
                return true;
            }
        } else if (clnVar instanceof cln.c) {
            cjr cjrVar = ((cln.c) clnVar).a;
            if (f >= cjrVar.a && f < cjrVar.c && f2 >= cjrVar.b && f2 < cjrVar.d) {
                if (Float.intBitsToFloat((int) (cjrVar.e >> 32)) + Float.intBitsToFloat((int) (cjrVar.f >> 32)) <= cjrVar.b()) {
                    if (Float.intBitsToFloat((int) (cjrVar.h >> 32)) + Float.intBitsToFloat((int) (cjrVar.g >> 32)) <= cjrVar.b()) {
                        if (Float.intBitsToFloat((int) (cjrVar.e & 4294967295L)) + Float.intBitsToFloat((int) (cjrVar.h & 4294967295L)) <= cjrVar.a()) {
                            if (Float.intBitsToFloat((int) (cjrVar.f & 4294967295L)) + Float.intBitsToFloat((int) (cjrVar.g & 4294967295L)) <= cjrVar.a()) {
                                float intBitsToFloat = cjrVar.a + Float.intBitsToFloat((int) (cjrVar.e >> 32));
                                float intBitsToFloat2 = cjrVar.b + Float.intBitsToFloat((int) (cjrVar.e & 4294967295L));
                                float intBitsToFloat3 = cjrVar.c - Float.intBitsToFloat((int) (cjrVar.f >> 32));
                                float intBitsToFloat4 = cjrVar.b + Float.intBitsToFloat((int) (cjrVar.f & 4294967295L));
                                float intBitsToFloat5 = cjrVar.c - Float.intBitsToFloat((int) (cjrVar.g >> 32));
                                float intBitsToFloat6 = cjrVar.d - Float.intBitsToFloat((int) (cjrVar.g & 4294967295L));
                                float intBitsToFloat7 = cjrVar.d - Float.intBitsToFloat((int) (4294967295L & cjrVar.h));
                                float intBitsToFloat8 = cjrVar.a + Float.intBitsToFloat((int) (cjrVar.h >> 32));
                                if (f < intBitsToFloat && f2 < intBitsToFloat2) {
                                    return b(f, f2, cjrVar.e, intBitsToFloat, intBitsToFloat2);
                                }
                                if (f < intBitsToFloat8 && f2 > intBitsToFloat7) {
                                    return b(f, f2, cjrVar.h, intBitsToFloat8, intBitsToFloat7);
                                }
                                if (f > intBitsToFloat3 && f2 < intBitsToFloat4) {
                                    return b(f, f2, cjrVar.f, intBitsToFloat3, intBitsToFloat4);
                                }
                                if (f <= intBitsToFloat5 || f2 <= intBitsToFloat6) {
                                    return true;
                                }
                                return b(f, f2, cjrVar.g, intBitsToFloat5, intBitsToFloat6);
                            }
                        }
                    }
                }
                cke ckeVar = new cke((byte[]) null);
                clq.c(ckeVar, cjrVar);
                return c(ckeVar, f, f2);
            }
        } else {
            if (clnVar instanceof cln.a) {
                return c(((cln.a) clnVar).a, f, f2);
            }
            throw new armm();
        }
        return false;
    }

    private static final boolean b(float f, float f2, long j, float f3, float f4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        if (((f6 * f6) / (intBitsToFloat * intBitsToFloat)) + ((f5 * f5) / (intBitsToFloat2 * intBitsToFloat2)) <= 1.0f) {
            return true;
        }
        return false;
    }

    private static final boolean c(clr clrVar, float f, float f2) {
        cjp cjpVar = new cjp(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        cke ckeVar = new cke((byte[]) null);
        clq.b(ckeVar, cjpVar);
        cke ckeVar2 = new cke((byte[]) null);
        ckeVar2.p(clrVar, ckeVar, 1);
        boolean isEmpty = ckeVar2.a.isEmpty();
        ckeVar2.k();
        ckeVar.k();
        if (!isEmpty) {
            return true;
        }
        return false;
    }
}
