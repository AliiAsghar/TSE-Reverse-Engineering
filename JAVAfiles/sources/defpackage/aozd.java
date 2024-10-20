package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aozd extends aozg {
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int l;
    private long n;
    private long o;
    private long p;
    private int k = Integer.MAX_VALUE;
    private int m = 0;

    public aozd(Iterable iterable, int i) {
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        if (i == 0) {
            this.h = apay.c;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            return;
        }
        T();
    }

    private final int G() {
        return (int) (((this.i - this.m) - this.n) + this.o);
    }

    private final long Q() {
        return this.p - this.n;
    }

    private final void R() {
        if (this.g.hasNext()) {
            T();
            return;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void S() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i > i2) {
            int i3 = i - i2;
            this.j = i3;
            this.i = i - i3;
            return;
        }
        this.j = 0;
    }

    private final void T() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.o);
        long position = byteBuffer.position();
        this.n = position;
        this.o = position;
        this.p = this.h.limit();
        long e = apdb.e(this.h);
        this.n += e;
        this.o += e;
        this.p += e;
    }

    private final void U(byte[] bArr, int i) {
        if (i <= G()) {
            int i2 = i;
            while (i2 > 0) {
                if (Q() == 0) {
                    R();
                }
                int min = Math.min(i2, (int) Q());
                long j = min;
                apdb.k(this.n, bArr, i - i2, j);
                i2 -= min;
                this.n += j;
            }
            return;
        }
        if (i <= 0) {
        } else {
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.aozg
    public final void A(int i) {
        this.k = i;
        S();
    }

    public final void B(int i) {
        if (i >= 0) {
            if (i <= ((this.i - this.m) - this.n) + this.o) {
                while (i > 0) {
                    if (Q() == 0) {
                        R();
                    }
                    int min = Math.min(i, (int) Q());
                    i -= min;
                    this.n += min;
                }
                return;
            }
        }
        if (i < 0) {
            throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aozg
    public final boolean C() {
        if ((this.m + this.n) - this.o == this.i) {
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
        for (int i2 = 0; i2 < 10; i2++) {
            if (a() >= 0) {
                return true;
            }
        }
        throw new apba("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.aozg
    public final byte[] F() {
        int j = j();
        if (j >= 0) {
            long j2 = j;
            if (j2 <= Q()) {
                byte[] bArr = new byte[j];
                apdb.k(this.n, bArr, 0L, j2);
                this.n += j2;
                return bArr;
            }
        }
        if (j >= 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            U(bArr2, j);
            return bArr2;
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
        if (Q() == 0) {
            R();
        }
        long j = this.n;
        this.n = 1 + j;
        return apdb.a(j);
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
        return (int) ((this.m + this.n) - this.o);
    }

    @Override // defpackage.aozg
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            int i2 = this.k;
            if (d <= i2) {
                this.k = d;
                S();
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
        if (Q() >= 4) {
            long j = this.n;
            this.n = 4 + j;
            int a = apdb.a(j) & 255;
            int a2 = (apdb.a(1 + j) & 255) << 8;
            return ((apdb.a(j + 3) & 255) << 24) | a | a2 | ((apdb.a(2 + j) & 255) << 16);
        }
        int a3 = a() & 255;
        int a4 = (a() & 255) << 8;
        return a3 | a4 | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    @Override // defpackage.aozg
    public final int j() {
        int i;
        long j = this.n;
        if (this.p != j) {
            long j2 = j + 1;
            byte a = apdb.a(j);
            if (a >= 0) {
                this.n++;
                return a;
            }
            if (this.p - this.n >= 10) {
                long j3 = 2 + j;
                int a2 = (apdb.a(j2) << 7) ^ a;
                if (a2 < 0) {
                    i = a2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int a3 = (apdb.a(j3) << 14) ^ a2;
                    if (a3 >= 0) {
                        i = a3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int a4 = a3 ^ (apdb.a(j4) << 21);
                        if (a4 < 0) {
                            i = (-2080896) ^ a4;
                        } else {
                            j4 = 5 + j;
                            byte a5 = apdb.a(j5);
                            int i2 = (a4 ^ (a5 << 28)) ^ 266354560;
                            if (a5 < 0) {
                                j5 = 6 + j;
                                if (apdb.a(j4) < 0) {
                                    j4 = 7 + j;
                                    if (apdb.a(j5) < 0) {
                                        j5 = 8 + j;
                                        if (apdb.a(j4) < 0) {
                                            j4 = 9 + j;
                                            if (apdb.a(j5) < 0) {
                                                long j6 = j + 10;
                                                if (apdb.a(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.n = j3;
                return i;
            }
        }
        return (int) s();
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
        long a;
        long a2;
        if (Q() >= 8) {
            this.n = 8 + this.n;
            long a3 = (apdb.a(2 + r13) & 255) << 16;
            long a4 = (apdb.a(3 + r13) & 255) << 24;
            long a5 = (apdb.a(r13 + 4) & 255) << 32;
            long a6 = (apdb.a(r13 + 5) & 255) << 40;
            long a7 = (apdb.a(r13 + 6) & 255) << 48;
            a = (apdb.a(r13 + 7) & 255) << 56;
            a2 = (apdb.a(r13) & 255) | ((apdb.a(1 + r13) & 255) << 8) | a3 | a4 | a5 | a6 | a7;
        } else {
            long a8 = (a() & 255) << 16;
            long a9 = (a() & 255) << 24;
            long a10 = (a() & 255) << 32;
            long a11 = (a() & 255) << 40;
            long a12 = (a() & 255) << 48;
            a = (a() & 255) << 56;
            a2 = (a() & 255) | ((a() & 255) << 8) | a8 | a9 | a10 | a11 | a12;
        }
        return a2 | a;
    }

    @Override // defpackage.aozg
    public final long r() {
        long j;
        long j2;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte a = apdb.a(j3);
            if (a >= 0) {
                this.n++;
                return a;
            }
            if (this.p - this.n >= 10) {
                long j5 = 2 + j3;
                int a2 = (apdb.a(j4) << 7) ^ a;
                if (a2 < 0) {
                    j = a2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int a3 = (apdb.a(j5) << 14) ^ a2;
                    if (a3 >= 0) {
                        j = a3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int a4 = a3 ^ (apdb.a(j6) << 21);
                        if (a4 < 0) {
                            j = (-2080896) ^ a4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long a5 = (apdb.a(j7) << 28) ^ a4;
                            if (a5 >= 0) {
                                j = 266354560 ^ a5;
                            } else {
                                long j8 = 6 + j3;
                                long a6 = a5 ^ (apdb.a(j6) << 35);
                                if (a6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long a7 = a6 ^ (apdb.a(j8) << 42);
                                    if (a7 >= 0) {
                                        j = 4363953127296L ^ a7;
                                    } else {
                                        j8 = 8 + j3;
                                        a6 = a7 ^ (apdb.a(j9) << 49);
                                        if (a6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long a8 = (a6 ^ (apdb.a(j8) << 56)) ^ 71499008037633920L;
                                            if (a8 < 0) {
                                                long j10 = j3 + 10;
                                                if (apdb.a(j9) >= 0) {
                                                    j = a8;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = a8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ a6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.n = j5;
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
        if (j > 0) {
            long j2 = this.p;
            long j3 = this.n;
            long j4 = j;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[j];
                apdb.k(j3, bArr, 0L, j4);
                this.n += j4;
                return new aoyz(bArr);
            }
        }
        if (j > 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            U(bArr2, j);
            return new aoyz(bArr2);
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
        if (j > 0) {
            long j2 = this.p;
            long j3 = this.n;
            long j4 = j;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[j];
                apdb.k(j3, bArr, 0L, j4);
                String str = new String(bArr, apay.a);
                this.n += j4;
                return str;
            }
        }
        if (j > 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            U(bArr2, j);
            return new String(bArr2, apay.a);
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
        if (j > 0) {
            long j2 = this.p;
            long j3 = this.n;
            long j4 = j;
            if (j4 <= j2 - j3) {
                String f = apdd.f(this.h, (int) (j3 - this.o), j);
                this.n += j4;
                return f;
            }
        }
        if (j >= 0 && j <= G()) {
            byte[] bArr = new byte[j];
            U(bArr, j);
            return aowt.k(bArr, 0, j);
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
