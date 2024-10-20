package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqu implements Cloneable, ByteChannel, asqw, asqv {
    public asrl a;
    public long b;

    @Override // defpackage.asqw
    public final void A(long j) {
        throw null;
    }

    @Override // defpackage.asqw
    public final void B(long j) {
        while (j > 0) {
            asrl asrlVar = this.a;
            if (asrlVar != null) {
                int min = (int) Math.min(j, asrlVar.c - asrlVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                int i = asrlVar.b + min;
                asrlVar.b = i;
                if (i == asrlVar.c) {
                    this.a = asrlVar.a();
                    asrm.b(asrlVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.asqw
    public final boolean C() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.asqw
    public final boolean D(long j) {
        throw null;
    }

    public final byte[] E() {
        return F(this.b);
    }

    @Override // defpackage.asqw
    public final byte[] F(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int e = e(bArr, i2, i - i2);
                    if (e != -1) {
                        i2 += e;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ck(j, "byteCount: "));
    }

    public final void G(asqu asquVar, long j, long j2) {
        aotl.T(this.b, j, j2);
        if (j2 != 0) {
            asquVar.b += j2;
            asrl asrlVar = this.a;
            while (true) {
                asrlVar.getClass();
                long j3 = asrlVar.c - asrlVar.b;
                if (j < j3) {
                    break;
                }
                asrlVar = asrlVar.f;
                j -= j3;
            }
            while (j2 > 0) {
                asrlVar.getClass();
                asrl b = asrlVar.b();
                int i = b.b + ((int) j);
                b.b = i;
                b.c = Math.min(i + ((int) j2), b.c);
                asrl asrlVar2 = asquVar.a;
                if (asrlVar2 == null) {
                    b.g = b;
                    b.f = b.g;
                    asquVar.a = b.f;
                } else {
                    asrl asrlVar3 = asrlVar2.g;
                    asrlVar3.getClass();
                    asrlVar3.d(b);
                }
                j2 -= b.c - b.b;
                asrlVar = asrlVar.f;
                j = 0;
            }
        }
    }

    @Override // defpackage.asqw
    public final void H(asro asroVar) {
        long j = this.b;
        if (j > 0) {
            asroVar.hq(this, j);
        }
    }

    @Override // defpackage.asqv
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void J(asqx asqxVar) {
        asqxVar.m(this, asqxVar.b());
    }

    public final void K(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        aotl.T(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 < i4) {
                asrl w = w(1);
                int i5 = 8192 - w.c;
                byte[] bArr2 = w.a;
                int min = Math.min(i4 - i3, i5);
                int i6 = i3 + min;
                aqil.u(bArr, bArr2, w.c, i3, i6);
                w.c += min;
                i3 = i6;
            } else {
                this.b += j;
                return;
            }
        }
    }

    public final void L(asrq asrqVar) {
        do {
        } while (asrqVar.b(this, 8192L) != -1);
    }

    public final void M(int i) {
        asrl w = w(1);
        byte[] bArr = w.a;
        int i2 = w.c;
        w.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.asqv
    public final /* bridge */ /* synthetic */ void N(int i) {
        throw null;
    }

    public final void O(int i) {
        asrl w = w(4);
        byte[] bArr = w.a;
        int i2 = w.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        w.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.asqv
    public final /* bridge */ /* synthetic */ void P(int i) {
        throw null;
    }

    @Override // defpackage.asqv
    public final /* bridge */ /* synthetic */ void Q(int i) {
        throw null;
    }

    public final void R(String str, int i, int i2) {
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        int i3 = i + 1;
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            asrl w = w(1);
                            byte[] bArr = w.a;
                            int i4 = w.c - i;
                            int min = Math.min(i2, 8192 - i4);
                            bArr[i + i4] = (byte) charAt;
                            i = i3;
                            while (i < min) {
                                char charAt2 = str.charAt(i);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i + i4] = (byte) charAt2;
                                i++;
                            }
                            int i5 = w.c;
                            int i6 = (i4 + i) - i5;
                            w.c = i5 + i6;
                            this.b += i6;
                        } else {
                            if (charAt < 2048) {
                                asrl w2 = w(2);
                                byte[] bArr2 = w2.a;
                                int i7 = w2.c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                w2.c = i7 + 2;
                                this.b += 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                if (i3 < i2) {
                                    c = str.charAt(i3);
                                } else {
                                    c = 0;
                                }
                                if (charAt <= 56319 && c >= 56320 && c < 57344) {
                                    asrl w3 = w(4);
                                    byte[] bArr3 = w3.a;
                                    int i8 = w3.c;
                                    int i9 = (((charAt & 1023) << 10) | (c & 1023)) + 65536;
                                    bArr3[i8] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i8 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i8 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i8 + 3] = (byte) ((i9 & 63) | 128);
                                    w3.c = i8 + 4;
                                    this.b += 4;
                                    i += 2;
                                } else {
                                    M(63);
                                }
                            } else {
                                asrl w4 = w(3);
                                byte[] bArr4 = w4.a;
                                int i10 = w4.c;
                                bArr4[i10] = (byte) ((charAt >> '\f') | 224);
                                bArr4[i10 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr4[i10 + 2] = (byte) ((charAt & '?') | 128);
                                w4.c = i10 + 3;
                                this.b += 3;
                            }
                            i = i3;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
            throw new IllegalArgumentException(a.bU(i, i2, "endIndex < beginIndex: ", " < "));
        }
        throw new IllegalArgumentException(a.bV(i, "beginIndex < 0: "));
    }

    public final void S(int i) {
        if (i < 128) {
            M(i);
            return;
        }
        if (i < 2048) {
            asrl w = w(2);
            byte[] bArr = w.a;
            int i2 = w.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            w.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            M(63);
            return;
        }
        if (i < 65536) {
            asrl w2 = w(3);
            byte[] bArr2 = w2.a;
            int i3 = w2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            w2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            asrl w3 = w(4);
            byte[] bArr3 = w3.a;
            int i4 = w3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            w3.c = i4 + 4;
            this.b += 4;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(aotl.S(i)));
    }

    @Override // defpackage.asqv
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void X(byte[] bArr) {
        bArr.getClass();
        K(bArr, 0, bArr.length);
    }

    @Override // defpackage.asqv
    public final /* bridge */ /* synthetic */ void U(byte[] bArr) {
        K(bArr, 0, 0);
    }

    public final void V(long j) {
        if (j == 0) {
            M(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        asrl w = w(i);
        byte[] bArr = w.a;
        int i2 = w.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 >= i2) {
                bArr[i3] = asrt.a[(int) (15 & j)];
                j >>>= 4;
            } else {
                w.c += i;
                this.b += i;
                return;
            }
        }
    }

    @Override // defpackage.asqv
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void Z(String str) {
        str.getClass();
        R(str, 0, str.length());
    }

    public final void Y(long j) {
        boolean z;
        if (j == 0) {
            M(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j >= 0) {
                z = true;
            } else {
                Z("-9223372036854775808");
                return;
            }
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i = 2;
                    }
                } else if (j < 1000) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < 10000000) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < 100000000000L) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else if (j < 100000000000000L) {
                i = 14;
            } else {
                i = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i = 16;
            } else {
                i = 17;
            }
        } else if (j < 1000000000000000000L) {
            i = 18;
        } else {
            i = 19;
        }
        if (z) {
            i++;
        }
        asrl w = w(i);
        byte[] bArr = w.a;
        int i2 = w.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = asrt.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        w.c += i;
        this.b += i;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return asrs.j;
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 != 0) {
                if (j > j2) {
                    j = j2;
                }
                asquVar.hq(this, j);
                return j;
            }
            return -1L;
        }
        throw new IllegalArgumentException(a.ck(j, "byteCount < 0: "));
    }

    public final byte c(long j) {
        aotl.T(this.b, j, 1L);
        asrl asrlVar = this.a;
        asrlVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                asrlVar = asrlVar.g;
                asrlVar.getClass();
                j2 -= asrlVar.c - asrlVar.b;
            }
            asrlVar.getClass();
            return asrlVar.a[(int) ((asrlVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = asrlVar.c;
            int i2 = asrlVar.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                asrlVar = asrlVar.f;
                asrlVar.getClass();
                j3 = j4;
            } else {
                asrlVar.getClass();
                return asrlVar.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    public final /* synthetic */ Object clone() {
        asqu asquVar = new asqu();
        if (this.b != 0) {
            asrl asrlVar = this.a;
            asrlVar.getClass();
            asrl b = asrlVar.b();
            asquVar.a = b;
            b.g = b;
            b.f = b.g;
            for (asrl asrlVar2 = asrlVar.f; asrlVar2 != asrlVar; asrlVar2 = asrlVar2.f) {
                asrl asrlVar3 = b.g;
                asrlVar3.getClass();
                asrlVar2.getClass();
                asrlVar3.d(asrlVar2.b());
            }
            asquVar.b = this.b;
        }
        return asquVar;
    }

    @Override // defpackage.asqw
    public final byte d() {
        long j = this.b;
        if (j != 0) {
            asrl asrlVar = this.a;
            asrlVar.getClass();
            int i = asrlVar.b;
            int i2 = i + 1;
            byte[] bArr = asrlVar.a;
            int i3 = asrlVar.c;
            byte b = bArr[i];
            this.b = j - 1;
            if (i2 == i3) {
                this.a = asrlVar.a();
                asrm.b(asrlVar);
            } else {
                asrlVar.b = i2;
            }
            return b;
        }
        throw new EOFException();
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        aotl.T(bArr.length, i, i2);
        asrl asrlVar = this.a;
        if (asrlVar == null) {
            return -1;
        }
        int min = Math.min(i2, asrlVar.c - asrlVar.b);
        int i3 = asrlVar.b;
        aqil.u(asrlVar.a, bArr, i, i3, i3 + min);
        int i4 = asrlVar.b + min;
        asrlVar.b = i4;
        this.b -= min;
        if (i4 != asrlVar.c) {
            return min;
        }
        this.a = asrlVar.a();
        asrm.b(asrlVar);
        return min;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof asqu) {
            long j = this.b;
            asqu asquVar = (asqu) obj;
            if (j == asquVar.b) {
                if (j == 0) {
                    return true;
                }
                asrl asrlVar = this.a;
                asrlVar.getClass();
                asrl asrlVar2 = asquVar.a;
                asrlVar2.getClass();
                int i = asrlVar.b;
                int i2 = asrlVar2.b;
                long j2 = 0;
                while (j2 < this.b) {
                    long min = Math.min(asrlVar.c - i, asrlVar2.c - i2);
                    long j3 = 0;
                    while (j3 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (asrlVar.a[i] == asrlVar2.a[i2]) {
                            j3++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == asrlVar.c) {
                        asrlVar = asrlVar.f;
                        asrlVar.getClass();
                        i = asrlVar.b;
                    }
                    if (i2 == asrlVar2.c) {
                        asrlVar2 = asrlVar2.f;
                        asrlVar2.getClass();
                        i2 = asrlVar2.b;
                    }
                    j2 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.asqw
    public final int f() {
        long j = this.b;
        if (j >= 4) {
            asrl asrlVar = this.a;
            asrlVar.getClass();
            int i = asrlVar.b;
            int i2 = asrlVar.c;
            if (i2 - i < 4) {
                return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
            }
            byte[] bArr = asrlVar.a;
            int i3 = (bArr[i] & 255) << 24;
            int i4 = (bArr[i + 1] & 255) << 16;
            int i5 = (bArr[i + 2] & 255) << 8;
            int i6 = bArr[i + 3] & 255;
            this.b = j - 4;
            int i7 = i3 | i4 | i5 | i6;
            int i8 = i + 4;
            if (i8 == i2) {
                this.a = asrlVar.a();
                asrm.b(asrlVar);
                return i7;
            }
            asrlVar.b = i8;
            return i7;
        }
        throw new EOFException();
    }

    @Override // defpackage.asqw
    public final int g(asrf asrfVar) {
        asrfVar.getClass();
        int a = asrt.a(this, asrfVar, false);
        if (a == -1) {
            return -1;
        }
        B(asrfVar.a[a].b());
        return a;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        asrl asrlVar = this.a;
        asrlVar.getClass();
        asrl asrlVar2 = asrlVar.g;
        asrlVar2.getClass();
        if (asrlVar2.c < 8192 && asrlVar2.e) {
            j -= r3 - asrlVar2.b;
        }
        return j;
    }

    public final int hashCode() {
        asrl asrlVar = this.a;
        if (asrlVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = asrlVar.c;
            for (int i3 = asrlVar.b; i3 < i2; i3++) {
                i = (i * 31) + asrlVar.a[i3];
            }
            asrlVar = asrlVar.f;
            asrlVar.getClass();
        } while (asrlVar != this.a);
        return i;
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        asrl asrlVar;
        asrl asrlVar2;
        int i;
        asquVar.getClass();
        if (asquVar != this) {
            aotl.T(asquVar.b, 0L, j);
            while (j > 0) {
                asrl asrlVar3 = asquVar.a;
                asrlVar3.getClass();
                int i2 = asrlVar3.c;
                asrlVar3.getClass();
                int i3 = i2 - asrlVar3.b;
                int i4 = 0;
                if (j < i3) {
                    asrl asrlVar4 = this.a;
                    if (asrlVar4 != null) {
                        asrlVar = asrlVar4.g;
                    } else {
                        asrlVar = null;
                    }
                    int i5 = (int) j;
                    if (asrlVar != null && asrlVar.e) {
                        long j2 = asrlVar.c + j;
                        if (asrlVar.d) {
                            i = 0;
                        } else {
                            i = asrlVar.b;
                        }
                        if (j2 - i <= 8192) {
                            asrlVar3.getClass();
                            asrlVar3.c(asrlVar, i5);
                            asquVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    asrlVar3.getClass();
                    if (i5 <= i3) {
                        if (i5 >= 1024) {
                            asrlVar2 = asrlVar3.b();
                        } else {
                            byte[] bArr = asrlVar3.a;
                            asrl a = asrm.a();
                            byte[] bArr2 = a.a;
                            int i6 = asrlVar3.b;
                            aqil.u(bArr, bArr2, 0, i6, i6 + i5);
                            asrlVar2 = a;
                        }
                        asrlVar2.c = asrlVar2.b + i5;
                        asrlVar3.b += i5;
                        asrl asrlVar5 = asrlVar3.g;
                        asrlVar5.getClass();
                        asrlVar5.d(asrlVar2);
                        asquVar.a = asrlVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                asrl asrlVar6 = asquVar.a;
                asrlVar6.getClass();
                int i7 = asrlVar6.c - asrlVar6.b;
                asquVar.a = asrlVar6.a();
                asrl asrlVar7 = this.a;
                if (asrlVar7 == null) {
                    this.a = asrlVar6;
                    asrlVar6.g = asrlVar6;
                    asrlVar6.f = asrlVar6.g;
                } else {
                    asrl asrlVar8 = asrlVar7.g;
                    asrlVar8.getClass();
                    asrlVar8.d(asrlVar6);
                    asrl asrlVar9 = asrlVar6.g;
                    if (asrlVar9 != asrlVar6) {
                        asrlVar9.getClass();
                        if (asrlVar9.e) {
                            int i8 = asrlVar6.c - asrlVar6.b;
                            asrlVar9.getClass();
                            int i9 = 8192 - asrlVar9.c;
                            asrlVar9.getClass();
                            if (!asrlVar9.d) {
                                asrlVar9.getClass();
                                i4 = asrlVar9.b;
                            }
                            if (i8 <= i9 + i4) {
                                asrlVar9.getClass();
                                asrlVar6.c(asrlVar9, i8);
                                asrlVar6.a();
                                asrm.b(asrlVar6);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                long j3 = i7;
                asquVar.b -= j3;
                this.b += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final long i(byte b, long j, long j2) {
        asrl asrlVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 >= 0 && j3 <= j4) {
            long j6 = this.b;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 != j4 && (asrlVar = this.a) != null) {
                if (j6 - j3 < j3) {
                    while (j6 > j3) {
                        asrlVar = asrlVar.g;
                        asrlVar.getClass();
                        j6 -= asrlVar.c - asrlVar.b;
                    }
                    if (asrlVar != null) {
                        while (j6 < j4) {
                            byte[] bArr = asrlVar.a;
                            int min = (int) Math.min(asrlVar.c, (asrlVar.b + j4) - j6);
                            for (int i = (int) ((asrlVar.b + j3) - j6); i < min; i++) {
                                if (bArr[i] == b) {
                                    return (i - asrlVar.b) + j6;
                                }
                            }
                            j6 += asrlVar.c - asrlVar.b;
                            asrlVar = asrlVar.f;
                            asrlVar.getClass();
                            j3 = j6;
                        }
                    }
                } else {
                    while (true) {
                        long j7 = (asrlVar.c - asrlVar.b) + j5;
                        if (j7 > j3) {
                            break;
                        }
                        asrlVar = asrlVar.f;
                        asrlVar.getClass();
                        j5 = j7;
                    }
                    if (asrlVar != null) {
                        while (j5 < j4) {
                            byte[] bArr2 = asrlVar.a;
                            int min2 = (int) Math.min(asrlVar.c, (asrlVar.b + j4) - j5);
                            for (int i2 = (int) ((asrlVar.b + j3) - j5); i2 < min2; i2++) {
                                if (bArr2[i2] == b) {
                                    return (i2 - asrlVar.b) + j5;
                                }
                            }
                            j5 += asrlVar.c - asrlVar.b;
                            asrlVar = asrlVar.f;
                            asrlVar.getClass();
                            j3 = j5;
                        }
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.asqw
    public final long j(asqx asqxVar) {
        throw null;
    }

    @Override // defpackage.asqw
    public final InputStream k() {
        return new asrj(this, 1);
    }

    public final String l(long j, Charset charset) {
        charset.getClass();
        if (j >= 0 && j <= 2147483647L) {
            long j2 = this.b;
            if (j2 >= j) {
                if (j == 0) {
                    return "";
                }
                asrl asrlVar = this.a;
                asrlVar.getClass();
                int i = asrlVar.b;
                int i2 = asrlVar.c;
                if (i + j > i2) {
                    return new String(F(j), charset);
                }
                int i3 = (int) j;
                String str = new String(asrlVar.a, i, i3, charset);
                int i4 = i + i3;
                asrlVar.b = i4;
                this.b = j2 - j;
                if (i4 == i2) {
                    this.a = asrlVar.a();
                    asrm.b(asrlVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ck(j, "byteCount: "));
    }

    public final String m() {
        return l(this.b, arul.a);
    }

    public final String n(long j) {
        return l(j, arul.a);
    }

    @Override // defpackage.asqw
    public final String o() {
        throw null;
    }

    @Override // defpackage.asqw
    public final String p(long j) {
        throw null;
    }

    @Override // defpackage.asqv
    public final /* bridge */ /* synthetic */ asqv r(long j) {
        Y(j);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        asrl asrlVar = this.a;
        if (asrlVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), asrlVar.c - asrlVar.b);
        byteBuffer.put(asrlVar.a, asrlVar.b, min);
        int i = asrlVar.b + min;
        asrlVar.b = i;
        this.b -= min;
        if (i == asrlVar.c) {
            this.a = asrlVar.a();
            asrm.b(asrlVar);
        }
        return min;
    }

    public final asqx s() {
        return t(this.b);
    }

    @Override // defpackage.asqw
    public final asqx t(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (j >= 4096) {
                    asqx v = v((int) j);
                    B(j);
                    return v;
                }
                return new asqx(F(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ck(j, "byteCount: "));
    }

    public final String toString() {
        return u().toString();
    }

    public final asqx u() {
        long j = this.b;
        if (j <= 2147483647L) {
            return v((int) j);
        }
        throw new IllegalStateException(a.ck(j, "size > Int.MAX_VALUE: "));
    }

    public final asqx v(int i) {
        if (i == 0) {
            return asqx.a;
        }
        aotl.T(this.b, 0L, i);
        asrl asrlVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            asrlVar.getClass();
            int i5 = asrlVar.c;
            int i6 = asrlVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                asrlVar = asrlVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 + i4];
        asrl asrlVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            asrlVar2.getClass();
            bArr[i7] = asrlVar2.a;
            i2 += asrlVar2.c - asrlVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = asrlVar2.b;
            asrlVar2.d = true;
            i7++;
            asrlVar2 = asrlVar2.f;
        }
        return new asrn(bArr, iArr);
    }

    public final asrl w(int i) {
        if (i > 0) {
            asrl asrlVar = this.a;
            if (asrlVar == null) {
                asrl a = asrm.a();
                this.a = a;
                a.g = a;
                a.f = a;
                return a;
            }
            asrl asrlVar2 = asrlVar.g;
            asrlVar2.getClass();
            if (asrlVar2.c + i <= 8192 && asrlVar2.e) {
                return asrlVar2;
            }
            asrl a2 = asrm.a();
            asrlVar2.d(a2);
            return a2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            asrl w = w(1);
            int i2 = 8192 - w.c;
            byte[] bArr = w.a;
            int min = Math.min(i, i2);
            byteBuffer.get(bArr, w.c, min);
            i -= min;
            w.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.asqw
    public final short x() {
        int i;
        long j = this.b;
        if (j >= 2) {
            asrl asrlVar = this.a;
            asrlVar.getClass();
            int i2 = asrlVar.b;
            int i3 = asrlVar.c;
            if (i3 - i2 < 2) {
                i = ((d() & 255) << 8) | (d() & 255);
            } else {
                byte[] bArr = asrlVar.a;
                int i4 = (bArr[i2] & 255) << 8;
                int i5 = bArr[i2 + 1] & 255;
                this.b = j - 2;
                int i6 = i2 + 2;
                if (i6 == i3) {
                    this.a = asrlVar.a();
                    asrm.b(asrlVar);
                } else {
                    asrlVar.b = i6;
                }
                i = i4 | i5;
            }
            return (short) i;
        }
        throw new EOFException();
    }

    public final short y() {
        short x = x();
        int i = x >>> 8;
        return (short) (((x & 255) << 8) | (i & 255));
    }

    public final void z() {
        B(this.b);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.asrq
    public final void close() {
    }

    @Override // defpackage.asqv, defpackage.asro, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.asqv
    public final asqu q() {
        return this;
    }
}
