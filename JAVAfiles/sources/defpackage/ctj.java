package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ctj {
    public static final long a(cti ctiVar) {
        return ctiVar.i(0L);
    }

    public static final long b(cti ctiVar) {
        return ctiVar.k(0L);
    }

    public static final cjp c(cti ctiVar) {
        cjp n;
        cti o = ctiVar.o();
        if (o != null) {
            n = o.n(ctiVar, true);
            return n;
        }
        return new cjp(brg.a, brg.a, (int) (ctiVar.g() >> 32), (int) (ctiVar.g() & 4294967295L));
    }

    public static final cjp d(cti ctiVar) {
        cjp n;
        n = f(ctiVar).n(ctiVar, true);
        return n;
    }

    public static final cjp e(cti ctiVar) {
        cti f = f(ctiVar);
        long g = f.g() >> 32;
        long g2 = f.g() & 4294967295L;
        cjp d = d(ctiVar);
        float f2 = d.b;
        float f3 = d.c;
        float f4 = d.d;
        float f5 = d.e;
        if (f2 < brg.a) {
            f2 = 0.0f;
        }
        float f6 = (int) g;
        if (f2 > f6) {
            f2 = f6;
        }
        if (f4 < brg.a) {
            f4 = 0.0f;
        }
        if (f4 <= f6) {
            f6 = f4;
        }
        if (f2 != f6) {
            if (f5 < brg.a) {
                f5 = 0.0f;
            }
            if (f3 < brg.a) {
                f3 = 0.0f;
            }
            float f7 = (int) g2;
            if (f3 > f7) {
                f3 = f7;
            }
            if (f5 > f7) {
                f5 = f7;
            }
            if (f3 != f5) {
                long k = f.k((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                long k2 = f.k((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                long k3 = f.k((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
                long k4 = f.k((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (k2 >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (k4 >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (k3 >> 32));
                float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
                float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (k & 4294967295L));
                float intBitsToFloat6 = Float.intBitsToFloat((int) (k2 & 4294967295L));
                float intBitsToFloat7 = Float.intBitsToFloat((int) (k4 & 4294967295L));
                float intBitsToFloat8 = Float.intBitsToFloat((int) (k3 & 4294967295L));
                return new cjp(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
            }
        }
        return cjp.a;
    }

    public static final cti f(cti ctiVar) {
        cti ctiVar2;
        cyn cynVar;
        cyn cynVar2;
        cti o = ctiVar.o();
        while (true) {
            cti ctiVar3 = o;
            ctiVar2 = ctiVar;
            ctiVar = ctiVar3;
            if (ctiVar == null) {
                break;
            }
            o = ctiVar.o();
        }
        if (ctiVar2 instanceof cyn) {
            cynVar = (cyn) ctiVar2;
        } else {
            cynVar = null;
        }
        if (cynVar == null) {
            return ctiVar2;
        }
        do {
            cynVar2 = cynVar;
            cynVar = cynVar.v;
        } while (cynVar != null);
        return cynVar2;
    }
}
