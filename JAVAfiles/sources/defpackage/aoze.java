package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoze extends aozg {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public aoze(InputStream inputStream, int i) {
        byte[] bArr = apay.b;
        this.f = inputStream;
        this.g = new byte[i];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private static int G(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (apba e) {
            e.a();
            throw e;
        }
    }

    private final List Q(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.l += read;
                    i2 += read;
                } else {
                    throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void R() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
            return;
        }
        this.i = 0;
    }

    private final void S(int i) {
        if (!T(i)) {
            if (i > (this.c - this.l) - this.j) {
                throw new apba("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final boolean T(int i) {
        int i2 = this.j;
        int i3 = i2 + i;
        int i4 = this.h;
        if (i3 > i4) {
            int i5 = this.c;
            int i6 = this.l;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i6 = this.l + i2;
                this.l = i6;
                i4 = this.h - i2;
                this.h = i4;
                this.j = 0;
            }
            InputStream inputStream = this.f;
            byte[] bArr2 = this.g;
            int G = G(inputStream, bArr2, i4, Math.min(bArr2.length - i4, (this.c - i6) - i4));
            if (G != 0 && G >= -1 && G <= this.g.length) {
                if (G <= 0) {
                    return false;
                }
                this.h += G;
                R();
                if (this.h >= i) {
                    return true;
                }
                return T(i);
            }
            throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#read(byte[]) returned invalid result: " + G + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException(a.cb(i, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    private final byte[] U(int i) {
        if (i == 0) {
            return apay.b;
        }
        int i2 = this.l;
        int i3 = this.j;
        int i4 = i2 + i3 + i;
        if (i4 - this.c <= 0) {
            int i5 = this.m;
            if (i4 <= i5) {
                int i6 = this.h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f.available()) {
                            return null;
                        }
                    } catch (apba e) {
                        e.a();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.g, this.j, bArr, 0, i6);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (i6 < i) {
                    int G = G(this.f, bArr, i6, i - i6);
                    if (G != -1) {
                        this.l += G;
                        i6 += G;
                    } else {
                        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }
                return bArr;
            }
            B((i5 - i2) - i3);
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final byte[] V(int i) {
        byte[] U = U(i);
        if (U != null) {
            return U;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> Q = Q(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : Q) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.aozg
    public final void A(int i) {
        this.m = i;
        R();
    }

    public final void B(int i) {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
            return;
        }
        if (i >= 0) {
            int i5 = this.l;
            int i6 = i5 + i3;
            int i7 = this.m;
            if (i6 + i <= i7) {
                this.l = i6;
                this.h = 0;
                this.j = 0;
                while (i4 < i) {
                    try {
                        long j = i - i4;
                        try {
                            long skip = this.f.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i4 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (apba e) {
                            e.a();
                            throw e;
                        }
                    } finally {
                        this.l += i4;
                        R();
                    }
                }
                if (i4 < i) {
                    int i8 = this.h;
                    int i9 = i8 - this.j;
                    this.j = i8;
                    S(1);
                    while (true) {
                        int i10 = i - i9;
                        int i11 = this.h;
                        if (i10 > i11) {
                            i9 += i11;
                            this.j = i11;
                            S(1);
                        } else {
                            this.j = i10;
                            return;
                        }
                    }
                }
            } else {
                B((i7 - i5) - i3);
                throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.aozg
    public final boolean C() {
        if (this.j == this.h && !T(1)) {
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
        if (this.h - this.j >= 10) {
            while (i2 < 10) {
                byte[] bArr = this.g;
                int i3 = this.j;
                this.j = i3 + 1;
                if (bArr[i3] < 0) {
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
        int i = this.h;
        int i2 = this.j;
        if (j <= i - i2 && j > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.g, i2, i2 + j);
            this.j += j;
            return copyOfRange;
        }
        if (j >= 0) {
            return V(j);
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() {
        if (this.j == this.h) {
            S(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
        return bArr[i];
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
        return this.l + this.j;
    }

    @Override // defpackage.aozg
    public final int e(int i) {
        if (i >= 0) {
            int i2 = i + this.l + this.j;
            if (i2 >= 0) {
                int i3 = this.m;
                if (i2 <= i3) {
                    this.m = i2;
                    R();
                    return i3;
                }
                throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new apba("Failed to parse the message.");
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
        int i = this.j;
        if (this.h - i < 4) {
            S(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.aozg
    public final int j() {
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.j = i5;
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
            this.k = 0;
            return 0;
        }
        int j = j();
        this.k = j;
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
        int i = this.j;
        if (this.h - i < 8) {
            S(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 7] & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.aozg
    public final long r() {
        long j;
        long j2;
        int i = this.j;
        int i2 = this.h;
        if (i2 != i) {
            byte[] bArr = this.g;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.j = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (bArr[i8] << 28) ^ i9;
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (bArr[i6] << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (bArr[i4] << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.j = i4;
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
        int i = this.h;
        int i2 = this.j;
        if (j <= i - i2 && j > 0) {
            aozb y = aozb.y(this.g, i2, j);
            this.j += j;
            return y;
        }
        if (j == 0) {
            return aozb.b;
        }
        if (j >= 0) {
            byte[] U = U(j);
            if (U != null) {
                return aozb.w(U);
            }
            int i3 = this.j;
            int i4 = this.h;
            int i5 = i4 - i3;
            this.l += i4;
            this.j = 0;
            this.h = 0;
            List<byte[]> Q = Q(j - i5);
            byte[] bArr = new byte[j];
            System.arraycopy(this.g, i3, bArr, 0, i5);
            for (byte[] bArr2 : Q) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return new aoyz(bArr);
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.aozg
    public final String x() {
        int j = j();
        if (j > 0) {
            int i = this.h;
            int i2 = this.j;
            if (j <= i - i2) {
                String str = new String(this.g, i2, j, apay.a);
                this.j += j;
                return str;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j >= 0) {
            if (j <= this.h) {
                S(j);
                String str2 = new String(this.g, this.j, j, apay.a);
                this.j += j;
                return str2;
            }
            return new String(V(j), apay.a);
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.aozg
    public final String y() {
        byte[] V;
        int j = j();
        int i = this.j;
        int i2 = this.h;
        if (j <= i2 - i && j > 0) {
            V = this.g;
            this.j = i + j;
        } else {
            if (j == 0) {
                return "";
            }
            if (j >= 0) {
                i = 0;
                if (j <= i2) {
                    S(j);
                    V = this.g;
                    this.j = j;
                } else {
                    V = V(j);
                }
            } else {
                throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return aowt.k(V, i, j);
    }

    @Override // defpackage.aozg
    public final void z(int i) {
        if (this.k == i) {
        } else {
            throw new apba("Protocol message end-group tag did not match expected tag.");
        }
    }
}
