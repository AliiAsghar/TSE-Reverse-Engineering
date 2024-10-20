package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dqu {
    public static float a(dqv dqvVar, float f) {
        return f / dqvVar.ec();
    }

    public static float b(dqv dqvVar, int i) {
        return i / dqvVar.ec();
    }

    public static float c(dqv dqvVar, long j) {
        if (a.bB(drm.c(j), 4294967296L)) {
            return dqvVar.em(dqvVar.ef(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static float d(dqv dqvVar, float f) {
        return f * dqvVar.ec();
    }

    public static int e(dqv dqvVar, long j) {
        return Math.round(dqvVar.el(j));
    }

    public static int f(dqv dqvVar, float f) {
        float em = dqvVar.em(f);
        if (Float.isInfinite(em)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(em);
    }

    public static long g(dqv dqvVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return a.z(dqvVar.eg(Float.intBitsToFloat((int) (j >> 32))), dqvVar.eg(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public static long h(dqv dqvVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float em = dqvVar.em(dra.b(j));
        float em2 = dqvVar.em(dra.a(j));
        return (Float.floatToRawIntBits(em) << 32) | (Float.floatToRawIntBits(em2) & 4294967295L);
    }

    public static long i(dqv dqvVar, float f) {
        return dqvVar.er(dqvVar.eg(f));
    }
}
