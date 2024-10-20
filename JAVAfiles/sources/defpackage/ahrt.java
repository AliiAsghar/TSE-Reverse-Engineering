package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahrt extends ahrv {
    private final Random b;
    private final long c;
    private final ahrl d;
    private final anca e;

    public ahrt(asja asjaVar, Random random, ahrl ahrlVar, anca ancaVar) {
        super(asjaVar);
        this.b = random;
        this.c = asjaVar.c;
        this.d = ahrlVar;
        this.e = ancaVar;
    }

    @Override // defpackage.ahrv
    public final long a(String str) {
        long sqrt;
        if (albo.ah(str)) {
            sqrt = this.c;
        } else {
            ahrl ahrlVar = this.d;
            long epochMilli = this.e.a().toEpochMilli() - ahrlVar.d;
            char c = 0;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long min = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = ahrlVar.a;
                    int i2 = (int) min;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = ahrlVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                ahrlVar.d += j * 14400000;
            }
            int hashCode = str.hashCode() * ahrlVar.c;
            if (!str.isEmpty()) {
                c = str.charAt(0);
            }
            int i3 = ((hashCode >>> 24) + c) & 255;
            int length = ((hashCode >>> 16) + str.length()) & 255;
            int min2 = Math.min((int) ahrlVar.a[i3], (int) ahrlVar.b[length]);
            int i4 = min2 + 1;
            short min3 = (short) Math.min(32767, i4);
            short[] sArr3 = ahrlVar.a;
            if (sArr3[i3] == min2) {
                sArr3[i3] = min3;
            }
            short[] sArr4 = ahrlVar.b;
            if (sArr4[length] == min2) {
                sArr4[length] = min3;
            }
            sqrt = (int) (this.c / (i4 < 50 ? Math.sqrt(i4) : i4));
        }
        if (this.b.nextDouble() * 1000.0d < sqrt) {
            return sqrt;
        }
        return -1L;
    }

    @Override // defpackage.ahrv
    public final asja b(Long l) {
        if (l != null) {
            if (l.longValue() != this.a.c) {
                aozy createBuilder = asja.a.createBuilder();
                int aD = a.aD(this.a.d);
                if (aD == 0) {
                    aD = 1;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asja asjaVar = (asja) createBuilder.b;
                asjaVar.d = aD - 1;
                asjaVar.b |= 4;
                long longValue = l.longValue();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asja asjaVar2 = (asja) createBuilder.b;
                asjaVar2.b |= 2;
                asjaVar2.c = longValue;
                return (asja) createBuilder.s();
            }
        }
        return this.a;
    }

    @Override // defpackage.ahrv
    public final asja c(Long l) {
        if (d()) {
            return b(l);
        }
        return e();
    }

    @Override // defpackage.ahrv
    public final boolean d() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }
}
