package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amci {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    public final boolean h;
    private final boolean[] i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public amci(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            defpackage.albo.K(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            defpackage.albo.K(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amci.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(char c) {
        if (c <= 127) {
            byte b = this.g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    throw new amcl("Unrecognized character: " + c);
                }
                throw new amcl("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            return b;
        }
        throw new amcl("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    public final amci c() {
        if (this.h) {
            return this;
        }
        byte[] bArr = this.g;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i = 65; i <= 90; i++) {
            int i2 = i | 32;
            byte[] bArr2 = this.g;
            byte b = bArr2[i];
            byte b2 = bArr2[i2];
            if (b == -1) {
                copyOf[i] = b2;
            } else {
                char c = (char) i;
                char c2 = (char) i2;
                if (b2 == -1) {
                    copyOf[i2] = b;
                } else {
                    throw new IllegalStateException(albo.F("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                }
            }
        }
        return new amci(this.a.concat(".ignoreCase()"), this.b, copyOf, true);
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            if (i >= cArr.length) {
                return false;
            }
            if (albo.as(cArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean e() {
        int i = 0;
        while (true) {
            char[] cArr = this.b;
            if (i >= cArr.length) {
                return false;
            }
            if (albo.at(cArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amci) {
            amci amciVar = (amci) obj;
            if (this.h == amciVar.h && Arrays.equals(this.b, amciVar.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(int i) {
        return this.i[i % this.e];
    }

    public final int hashCode() {
        int i;
        boolean z = this.h;
        int hashCode = Arrays.hashCode(this.b);
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[LOOP:0: B:14:0x0060->B:16:0x0064, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private amci(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            r6.getClass()
            r4.b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L84
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L84
            if (r5 <= 0) goto L7c
            int[] r1 = defpackage.anbf.a     // Catch: java.lang.ArithmeticException -> L84
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L84
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L84
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L37;
                case 2: goto L42;
                case 3: goto L42;
                case 4: goto L2e;
                case 5: goto L2e;
                case 6: goto L1f;
                case 7: goto L1f;
                case 8: goto L1f;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L84
        L1c:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L84
            goto L78
        L1f:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L84
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L48
        L2e:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L84
            int r0 = 32 - r0
            goto L48
        L37:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            defpackage.albo.cH(r0)     // Catch: java.lang.ArithmeticException -> L84
        L42:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L84
            int r0 = 31 - r0
        L48:
            r4.d = r0     // Catch: java.lang.ArithmeticException -> L84
            int r5 = r5 + (-1)
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.e = r3
            int r6 = r0 >> r6
            r4.f = r6
            r4.c = r5
            r4.g = r7
            boolean[] r5 = new boolean[r3]
        L60:
            int r6 = r4.f
            if (r1 >= r6) goto L73
            int r6 = r1 * 8
            int r7 = r4.d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = defpackage.albo.cR(r6, r7, r0)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L60
        L73:
            r4.i = r5
            r4.h = r8
            return
        L78:
            r5.<init>()     // Catch: java.lang.ArithmeticException -> L84
            throw r5     // Catch: java.lang.ArithmeticException -> L84
        L7c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L84
            java.lang.String r7 = "x (0) must be > 0"
            r5.<init>(r7)     // Catch: java.lang.ArithmeticException -> L84
            throw r5     // Catch: java.lang.ArithmeticException -> L84
        L84:
            r5 = move-exception
            int r6 = r6.length
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal alphabet length "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amci.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
