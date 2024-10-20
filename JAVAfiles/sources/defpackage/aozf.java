package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozf extends aozg {
    private final ByteBuffer f;
    private final long g;
    private long h;
    private long i;
    private final long j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public aozf(ByteBuffer byteBuffer) {
        this.f = byteBuffer;
        long e = apdb.e(byteBuffer);
        this.g = e;
        this.h = byteBuffer.limit() + e;
        long position = e + byteBuffer.position();
        this.i = position;
        this.j = position;
    }

    private final int G(long j) {
        return (int) (j - this.g);
    }

    private final int Q() {
        return (int) (this.h - this.i);
    }

    private final void R() {
        long j = this.h + this.k;
        this.h = j;
        int i = (int) (j - this.j);
        int i2 = this.m;
        if (i > i2) {
            int i3 = i - i2;
            this.k = i3;
            this.h = j - i3;
            return;
        }
        this.k = 0;
    }

    @Override // defpackage.aozg
    public final void A(int i) {
        this.m = i;
        R();
    }

    public final void B(int i) {
        if (i >= 0 && i <= Q()) {
            this.i += i;
        } else {
            if (i < 0) {
                throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.aozg
    public final boolean C() {
        if (this.i == this.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aozg
    public final boolean D() {
        if (r() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aozg
    public final boolean E(int i) {
        int b = apdh.b(i);
        int i2 = 0;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            return false;
                        }
                        if (b == 5) {
                            B(4);
                            return true;
                        }
                        throw new apaz();
                    }
                    N();
                    z(apdh.c(apdh.a(i), 4));
                    return true;
                }
                B(j());
                return true;
            }
            B(8);
            return true;
        }
        if (Q() >= 10) {
            while (i2 < 10) {
                long j = this.i;
                this.i = 1 + j;
                if (apdb.a(j) < 0) {
                    i2++;
                }
            }
            throw new apba("CodedInputStream encountered a malformed varint.");
        }
        while (i2 < 10) {
            if (a() < 0) {
                i2++;
            }
        }
        throw new apba("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // defpackage.aozg
    public final byte[] F() {
        int j = j();
        if (j >= 0 && j <= Q()) {
            byte[] bArr = new byte[j];
            long j2 = this.i;
            long j3 = j;
            long j4 = j2 + j3;
            ByteBuffer byteBuffer = this.f;
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            try {
                try {
                    byteBuffer.position(G(j2));
                    byteBuffer.limit(G(j4));
                    ByteBuffer slice = this.f.slice();
                    byteBuffer.position(position);
                    byteBuffer.limit(limit);
                    slice.get(bArr);
                    this.i += j3;
                    return bArr;
                } catch (IllegalArgumentException e) {
                    apba apbaVar = new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    apbaVar.initCause(e);
                    throw apbaVar;
                }
            } catch (Throwable th) {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                throw th;
            }
        }
        if (j <= 0) {
            if (j == 0) {
                return apay.b;
            }
            throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final byte a() {
        long j = this.i;
        if (j != this.h) {
            this.i = 1 + j;
            return apdb.a(j);
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aozg
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.aozg
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.aozg
    public final int d() {
        return (int) (this.i - this.j);
    }

    @Override // defpackage.aozg
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            int i2 = this.m;
            if (d <= i2) {
                this.m = d;
                R();
                return i2;
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.aozg
    public final int f() {
        return j();
    }

    @Override // defpackage.aozg
    public final int g() {
        return i();
    }

    @Override // defpackage.aozg
    public final int h() {
        return j();
    }

    public final int i() {
        long j = this.i;
        if (this.h - j >= 4) {
            this.i = 4 + j;
            int a = apdb.a(j) & 255;
            int a2 = apdb.a(1 + j) & 255;
            int a3 = apdb.a(2 + j) & 255;
            return ((apdb.a(j + 3) & 255) << 24) | (a2 << 8) | a | (a3 << 16);
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (defpackage.apdb.a(r3) >= 0) goto L33;
     */
    @Override // defpackage.aozg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            r9 = this;
            long r0 = r9.i
            long r2 = r9.h
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = defpackage.apdb.a(r0)
            if (r4 < 0) goto L16
            r9.i = r2
            return r4
        L16:
            long r5 = r9.h
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = defpackage.apdb.a(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = defpackage.apdb.a(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = defpackage.apdb.a(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = defpackage.apdb.a(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = defpackage.apdb.a(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = defpackage.apdb.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = defpackage.apdb.a(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = defpackage.apdb.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = defpackage.apdb.a(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.i = r5
            return r0
        L92:
            long r0 = r9.s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aozf.j():int");
    }

    @Override // defpackage.aozg
    public final int k() {
        return i();
    }

    @Override // defpackage.aozg
    public final int l() {
        return H(j());
    }

    @Override // defpackage.aozg
    public final int m() {
        if (C()) {
            this.l = 0;
            return 0;
        }
        int j = j();
        this.l = j;
        if (apdh.a(j) != 0) {
            return j;
        }
        throw new apba("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.aozg
    public final int n() {
        return j();
    }

    @Override // defpackage.aozg
    public final long o() {
        return q();
    }

    @Override // defpackage.aozg
    public final long p() {
        return r();
    }

    public final long q() {
        long j = this.i;
        if (this.h - j >= 8) {
            this.i = 8 + j;
            long a = apdb.a(j);
            long a2 = apdb.a(1 + j);
            long a3 = apdb.a(2 + j);
            long a4 = apdb.a(3 + j);
            long a5 = apdb.a(4 + j);
            return ((apdb.a(j + 7) & 255) << 56) | (a & 255) | ((a2 & 255) << 8) | ((a3 & 255) << 16) | ((a4 & 255) << 24) | ((a5 & 255) << 32) | ((apdb.a(5 + j) & 255) << 40) | ((apdb.a(6 + j) & 255) << 48);
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aozg
    public final long r() {
        long j;
        long j2;
        int i;
        long j3 = this.i;
        if (this.h != j3) {
            long j4 = 1 + j3;
            byte a = apdb.a(j3);
            if (a >= 0) {
                this.i = j4;
                return a;
            }
            if (this.h - j4 >= 9) {
                long j5 = 2 + j3;
                int a2 = (apdb.a(j4) << 7) ^ a;
                if (a2 < 0) {
                    i = a2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int a3 = a2 ^ (apdb.a(j5) << 14);
                    if (a3 >= 0) {
                        j = a3 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int a4 = a3 ^ (apdb.a(j6) << 21);
                        if (a4 < 0) {
                            i = (-2080896) ^ a4;
                        } else {
                            j6 = 5 + j3;
                            long a5 = (apdb.a(j5) << 28) ^ a4;
                            if (a5 >= 0) {
                                j = 266354560 ^ a5;
                            } else {
                                long j7 = 6 + j3;
                                long a6 = (apdb.a(j6) << 35) ^ a5;
                                if (a6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j5 = j3 + 7;
                                    long a7 = a6 ^ (apdb.a(j7) << 42);
                                    if (a7 >= 0) {
                                        j = 4363953127296L ^ a7;
                                    } else {
                                        j7 = 8 + j3;
                                        a6 = a7 ^ (apdb.a(j5) << 49);
                                        if (a6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long a8 = (a6 ^ (apdb.a(j7) << 56)) ^ 71499008037633920L;
                                            if (a8 < 0) {
                                                long j8 = j3 + 10;
                                                if (apdb.a(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = a8;
                                        }
                                    }
                                    this.i = j5;
                                    return j;
                                }
                                j = j2 ^ a6;
                                j5 = j7;
                                this.i = j5;
                                return j;
                            }
                        }
                    }
                    j5 = j6;
                    this.i = j5;
                    return j;
                }
                j = i;
                this.i = j5;
                return j;
            }
        }
        return s();
    }

    final long s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new apba("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.aozg
    public final long t() {
        return q();
    }

    @Override // defpackage.aozg
    public final long u() {
        return I(r());
    }

    @Override // defpackage.aozg
    public final long v() {
        return r();
    }

    @Override // defpackage.aozg
    public final aozb w() {
        int j = j();
        if (j > 0 && j <= Q()) {
            byte[] bArr = new byte[j];
            long j2 = j;
            apdb.k(this.i, bArr, 0L, j2);
            this.i += j2;
            return new aoyz(bArr);
        }
        if (j == 0) {
            return aozb.b;
        }
        if (j < 0) {
            throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aozg
    public final String x() {
        int j = j();
        if (j > 0 && j <= Q()) {
            byte[] bArr = new byte[j];
            long j2 = j;
            apdb.k(this.i, bArr, 0L, j2);
            String str = new String(bArr, apay.a);
            this.i += j2;
            return str;
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aozg
    public final String y() {
        int j = j();
        if (j > 0 && j <= Q()) {
            String f = apdd.f(this.f, G(this.i), j);
            this.i += j;
            return f;
        }
        if (j == 0) {
            return "";
        }
        if (j <= 0) {
            throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aozg
    public final void z(int i) {
        if (this.l == i) {
        } else {
            throw new apba("Protocol message end-group tag did not match expected tag.");
        }
    }
}
