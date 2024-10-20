package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asuv extends asuw {
    public int a;
    public asuz b;
    private int i;
    private int j;
    private int k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asuv(int r6, int r7, int r8, int r9, java.math.BigInteger r10, java.math.BigInteger r11, java.math.BigInteger r12, java.math.BigInteger r13) {
        /*
            r5 = this;
            r0 = r8 | r9
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L11
            int[] r0 = new int[r1]
            r0[r4] = r4
            r0[r3] = r7
            r0[r2] = r6
            goto L1f
        L11:
            r0 = 5
            int[] r0 = new int[r0]
            r0[r4] = r4
            r0[r3] = r7
            r0[r2] = r8
            r0[r1] = r9
            r1 = 4
            r0[r1] = r6
        L1f:
            asvd r1 = defpackage.asve.a
            r1 = r0[r4]
            if (r1 != 0) goto L6e
        L25:
            int r1 = r0.length
            if (r3 >= r1) goto L3b
            r1 = r0[r3]
            int r2 = r3 + (-1)
            r2 = r0[r2]
            if (r1 <= r2) goto L33
            int r3 = r3 + 1
            goto L25
        L33:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Polynomial exponents must be monotonically increasing"
            r6.<init>(r7)
            throw r6
        L3b:
            asvg r1 = new asvg
            asvd r2 = defpackage.asve.a
            asvf r3 = new asvf
            r3.<init>(r0)
            r1.<init>(r2, r3)
            r5.<init>(r1)
            r5.a = r6
            r5.i = r7
            r5.j = r8
            r5.k = r9
            r5.f = r12
            r5.g = r13
            asuz r6 = new asuz
            r7 = 0
            r6.<init>(r5, r7, r7)
            r5.b = r6
            asuy r6 = r5.c(r10)
            r5.d = r6
            asuy r6 = r5.c(r11)
            r5.e = r6
            r6 = 6
            r5.h = r6
            return
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Irreducible polynomials in GF(2) must have constant term"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asuv.<init>(int, int, int, int, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger):void");
    }

    public static BigInteger a(SecureRandom secureRandom, int i) {
        while (i > 0) {
            int i2 = (i + 7) >> 3;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (((byte) (255 >>> ((i2 * 8) - i))) & bArr[0]);
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.signum() > 0) {
                return bigInteger;
            }
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    @Override // defpackage.asuw
    public final asva b(BigInteger bigInteger, BigInteger bigInteger2) {
        asuy c = c(bigInteger);
        asuy c2 = c(bigInteger2);
        int i = this.h;
        if (i == 5 || i == 6) {
            if (c.n()) {
                if (!c2.j().equals(this.e)) {
                    throw new IllegalArgumentException();
                }
            } else {
                c2 = c2.e(c).c(c);
            }
        }
        return new asuz(this, c, c2);
    }

    @Override // defpackage.asuw
    public final asuy c(BigInteger bigInteger) {
        int[] iArr;
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int bitLength = bigInteger.bitLength();
            int i = this.a;
            if (bitLength <= i) {
                int i2 = this.j;
                int i3 = this.k;
                if ((i2 | i3) == 0) {
                    iArr = new int[]{this.i};
                } else {
                    iArr = new int[]{this.i, i2, i3};
                }
                return new asux(i, iArr, new asvb(bigInteger));
            }
        }
        throw new IllegalArgumentException("x value invalid in F2m field element");
    }

    @Override // defpackage.asuw
    public final asva d() {
        return this.b;
    }

    public asuv(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }
}
