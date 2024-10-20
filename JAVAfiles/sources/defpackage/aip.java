package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aip {
    private final ahp a;
    private long b;

    public aip(ahp ahpVar) {
        this.a = ahpVar;
        this.b = 0L;
    }

    public final float a(long j) {
        long j2;
        if (this.a == ahp.b) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long b(crc crcVar, float f) {
        float abs;
        long j;
        long floatToRawIntBits;
        int floatToRawIntBits2;
        long aH = d.aH(this.b, a.Q(crcVar.c, crcVar.g));
        this.b = aH;
        if (this.a == null) {
            abs = cjn.a(aH);
        } else {
            abs = Math.abs(a(aH));
        }
        if (abs >= f) {
            if (this.a == null) {
                long j2 = this.b;
                return a.Q(this.b, cjn.e(cjn.d(j2, cjn.a(j2)), f));
            }
            float a = a(this.b) - (Math.signum(a(this.b)) * f);
            long j3 = this.b;
            if (this.a == ahp.b) {
                j = j3 & 4294967295L;
            } else {
                j = j3 >> 32;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) j);
            if (this.a == ahp.b) {
                floatToRawIntBits = Float.floatToRawIntBits(a);
                floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            } else {
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits2 = Float.floatToRawIntBits(a);
            }
            return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
        }
        return 9205357640488583168L;
    }

    public final void c() {
        this.b = 0L;
    }

    public aip() {
        this(null);
    }
}
