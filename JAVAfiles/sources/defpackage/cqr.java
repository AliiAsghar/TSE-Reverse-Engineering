package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqr {
    public static final long a(crc crcVar) {
        return c(crcVar, false);
    }

    public static final long b(crc crcVar) {
        return c(crcVar, true);
    }

    public static final long c(crc crcVar, boolean z) {
        long Q = a.Q(crcVar.c, crcVar.g);
        if (!z && crcVar.c()) {
            return 0L;
        }
        return Q;
    }

    public static final boolean d(crc crcVar) {
        if (!crcVar.c() && !crcVar.h && crcVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean e(crc crcVar) {
        if (!crcVar.h && crcVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean f(crc crcVar) {
        if (!crcVar.c() && crcVar.h && !crcVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean g(crc crcVar) {
        if (crcVar.h && !crcVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean h(crc crcVar, long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        boolean bA = a.bA(crcVar.i, 1);
        long j3 = crcVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = bA ? 1.0f : 0.0f;
        float f2 = intBitsToFloat3 * f;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        if (intBitsToFloat < (-f2)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > ((int) (j >> 32)) + f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 <= ((int) (j & 4294967295L)) + intBitsToFloat4) {
            z4 = false;
        }
        return z6 | z4;
    }

    public static final boolean i(crc crcVar) {
        if (!a.bB(c(crcVar, true), 0L)) {
            return true;
        }
        return false;
    }
}
