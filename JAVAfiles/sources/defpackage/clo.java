package defpackage;

import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clo {
    public static /* synthetic */ void a(cny cnyVar, cln clnVar, cko ckoVar, float f) {
        boolean z = clnVar instanceof cln.b;
        coc cocVar = coc.a;
        if (z) {
            cjp cjpVar = ((cln.b) clnVar).a;
            cnyVar.F(ckoVar, e(cjpVar), c(cjpVar), f, cocVar);
            return;
        }
        if (clnVar instanceof cln.c) {
            cln.c cVar = (cln.c) clnVar;
            clr clrVar = cVar.b;
            if (clrVar != null) {
                cnyVar.w(clrVar, ckoVar, f, cocVar, 3);
                return;
            }
            cjr cjrVar = cVar.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (cjrVar.h >> 32));
            cnyVar.C(ckoVar, f(cjrVar), d(cjrVar), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f, cocVar);
            return;
        }
        if (clnVar instanceof cln.a) {
            cnyVar.w(((cln.a) clnVar).a, ckoVar, f, cocVar, 3);
            return;
        }
        throw new armm();
    }

    public static /* synthetic */ void b(cny cnyVar, cln clnVar, long j) {
        boolean z = clnVar instanceof cln.b;
        coc cocVar = coc.a;
        if (z) {
            cjp cjpVar = ((cln.b) clnVar).a;
            cnyVar.s(j, e(cjpVar), c(cjpVar), 1.0f, cocVar, null, 3);
            return;
        }
        if (clnVar instanceof cln.c) {
            cln.c cVar = (cln.c) clnVar;
            clr clrVar = cVar.b;
            if (clrVar != null) {
                cnyVar.B(clrVar, j, 1.0f, cocVar);
                return;
            }
            cjr cjrVar = cVar.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (cjrVar.h >> 32));
            cnyVar.D(j, f(cjrVar), d(cjrVar), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), cocVar, 1.0f);
            return;
        }
        if (clnVar instanceof cln.a) {
            cnyVar.B(((cln.a) clnVar).a, j, 1.0f, cocVar);
            return;
        }
        throw new armm();
    }

    private static final long c(cjp cjpVar) {
        return (Float.floatToRawIntBits(cjpVar.d - cjpVar.b) << 32) | (Float.floatToRawIntBits(cjpVar.e - cjpVar.c) & 4294967295L);
    }

    private static final long d(cjr cjrVar) {
        float b = cjrVar.b();
        float a = cjrVar.a();
        return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
    }

    private static final long e(cjp cjpVar) {
        return (Float.floatToRawIntBits(cjpVar.b) << 32) | (Float.floatToRawIntBits(cjpVar.c) & 4294967295L);
    }

    private static final long f(cjr cjrVar) {
        return (Float.floatToRawIntBits(cjrVar.a) << 32) | (Float.floatToRawIntBits(cjrVar.b) & 4294967295L);
    }
}
