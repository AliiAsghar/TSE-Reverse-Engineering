package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ful {
    public boolean c;
    public boolean d;
    public boolean e;
    public final euj a = new euj(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final euf b = new euf();

    public ful(byte[] bArr) {
    }

    public static long b(euf eufVar) {
        int i = eufVar.b;
        if (eufVar.b() >= 9) {
            byte[] bArr = new byte[9];
            eufVar.E(bArr, 0, 9);
            eufVar.J(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        long j3 = (248 & j2) >> 3;
                        long j4 = (j2 & 3) << 13;
                        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static final int d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(flv flvVar) {
        this.b.G(eul.f);
        this.c = true;
        flvVar.l();
    }

    public final void c(flv flvVar) {
        this.b.G(eul.f);
        this.c = true;
        flvVar.l();
    }

    public ful() {
    }
}
