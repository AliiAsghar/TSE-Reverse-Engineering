package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgx {
    public static final void a(cgy cgyVar, cgs cgsVar) {
        cgyVar.d(cgsVar);
    }

    public static final void b(czp czpVar, arqr arqrVar) {
        if (arqrVar.a(czpVar) != czo.a) {
            return;
        }
        czq.e(czpVar, arqrVar);
    }

    public static final boolean c(cgw cgwVar, long j) {
        if (!cgwVar.p.z) {
            return false;
        }
        cyn x = cwp.e(cgwVar).x();
        if (x.r()) {
            long a = ctj.a(x);
            float intBitsToFloat = Float.intBitsToFloat((int) (a >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (a & 4294967295L));
            long j2 = cgwVar.d;
            float f = ((int) (j2 >> 32)) + intBitsToFloat;
            float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f) {
                float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2) {
                    return true;
                }
            }
        }
        return false;
    }
}
