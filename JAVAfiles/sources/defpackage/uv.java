package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uv {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public uv(int i) {
        this.a = vf.a;
        this.b = vp.c;
        this.c = ua.a;
        if (i < 0) {
            a.bH("Capacity must be a positive value.");
        }
        l(vf.d(i));
    }

    private final int i(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final int j(Object obj) {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int compare;
        int i6;
        long j2;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * (-862048943);
        int i8 = i7 ^ (i7 << 16);
        int i9 = i8 >>> 7;
        int i10 = this.d;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = i8;
            long j3 = i8 & 127;
            long j4 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j5 = (72340172838076673L * j3) ^ j4;
            for (long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L); j6 != 0; j6 &= (-1) + j6) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i11) & i10;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int i16 = i(i9);
                long j7 = 255;
                if (this.f == 0 && ((this.a[i16 >> 3] >> ((i16 & 7) << 3)) & 255) != 254) {
                    int i17 = this.d;
                    if (i17 > 8) {
                        i3 = i9;
                        compare = Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i17 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr2 = this.a;
                            int i18 = this.d;
                            Object[] objArr = this.b;
                            int[] iArr = this.c;
                            int i19 = 0;
                            for (int i20 = i18 + 7; i19 < (i20 >> 3); i20 = i20) {
                                long j8 = jArr2[i19] & (-9187201950435737472L);
                                jArr2[i19] = ((~j8) + (j8 >>> 7)) & (-72340172838076674L);
                                i19++;
                            }
                            int h = aqil.h(jArr2);
                            int i21 = h - 1;
                            jArr2[i21] = (jArr2[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[h] = jArr2[0];
                            int i22 = 0;
                            while (i22 != i18) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j9 = (jArr2[i23] >> i24) & j7;
                                if (j9 == 128 || j9 != 254) {
                                    i22++;
                                } else {
                                    Object obj2 = objArr[i22];
                                    if (obj2 != null) {
                                        i6 = obj2.hashCode();
                                    } else {
                                        i6 = 0;
                                    }
                                    int i25 = i6 * (-862048943);
                                    int i26 = i25 ^ (i25 << 16);
                                    int i27 = i26 & 127;
                                    int i28 = i26 >>> 7;
                                    int i29 = i(i28);
                                    int i30 = i28 & i18;
                                    long j10 = i27;
                                    if (((i29 - i30) & i18) / 8 == ((i22 - i30) & i18) / 8) {
                                        j2 = j3;
                                        jArr2[i23] = ((~(255 << i24)) & jArr2[i23]) | (j10 << i24);
                                        jArr2[aqil.h(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                    } else {
                                        j2 = j3;
                                        int i31 = i29 >> 3;
                                        long j11 = jArr2[i31];
                                        int i32 = (i29 & 7) << 3;
                                        long j12 = j10 << i32;
                                        long j13 = j11 & (~(255 << i32));
                                        if (((j11 >> i32) & 255) == 128) {
                                            long j14 = ~(255 << i24);
                                            jArr2[i31] = j13 | j12;
                                            jArr2[i23] = (jArr2[i23] & j14) | (128 << i24);
                                            objArr[i29] = objArr[i22];
                                            objArr[i22] = null;
                                            iArr[i29] = iArr[i22];
                                            iArr[i22] = 0;
                                        } else {
                                            jArr2[i31] = j13 | j12;
                                            Object obj3 = objArr[i29];
                                            objArr[i29] = objArr[i22];
                                            objArr[i22] = obj3;
                                            int i33 = iArr[i29];
                                            iArr[i29] = iArr[i22];
                                            iArr[i22] = i33;
                                            i22--;
                                        }
                                        jArr2[aqil.h(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                    }
                                    j3 = j2;
                                    j7 = 255;
                                }
                            }
                            j = j3;
                            i2 = 0;
                            k();
                            i16 = i(i3);
                        } else {
                            j = j3;
                        }
                    } else {
                        j = j3;
                        i3 = i9;
                    }
                    i2 = 0;
                    int b = vf.b(this.d);
                    long[] jArr3 = this.a;
                    Object[] objArr2 = this.b;
                    int[] iArr2 = this.c;
                    int i34 = this.d;
                    l(b);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr3 = this.c;
                    int i35 = this.d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr3[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr2[i36];
                            if (obj4 != null) {
                                i5 = obj4.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i37 = i5 * (-862048943);
                            int i38 = i((i37 ^ (i37 << 16)) >>> 7);
                            int i39 = i38 >> 3;
                            int i40 = (i38 & 7) << 3;
                            i4 = i36;
                            long j15 = (jArr4[i39] & (~(255 << i40))) | ((r12 & 127) << i40);
                            jArr4[i39] = j15;
                            jArr4[(((i38 - 7) & i35) + (i35 & 7)) >> 3] = j15;
                            objArr3[i38] = obj4;
                            iArr3[i38] = iArr2[i4];
                        } else {
                            i4 = i36;
                        }
                        i36 = i4 + 1;
                    }
                    i16 = i(i3);
                } else {
                    j = j3;
                    i2 = 0;
                }
                int i41 = 1;
                this.e++;
                int i42 = this.f;
                long[] jArr5 = this.a;
                int i43 = i16 >> 3;
                long j16 = jArr5[i43];
                int i44 = (i16 & 7) << 3;
                if (((j16 >> i44) & 255) != 128) {
                    i41 = i2;
                }
                this.f = i42 - i41;
                int i45 = this.d;
                long j17 = (j16 & (~(255 << i44))) | (j << i44);
                jArr5[i43] = j17;
                jArr5[(((i16 - 7) & i45) + (i45 & 7)) >> 3] = j17;
                return ~i16;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i8 = i15;
        }
    }

    private final void k() {
        this.f = vf.a(this.d) - this.e;
    }

    private final void l(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, vf.c(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = vf.a;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            aqil.D(jArr, -9187201950435737472L, jArr.length);
        }
        this.a = jArr;
        int i3 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        k();
        this.b = new Object[i2];
        this.c = new int[i2];
    }

    public final int a(Object obj) {
        int i;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.d;
        int i4 = i * (-862048943);
        int i5 = (i4 ^ (i4 << 16)) >>> 7;
        while (true) {
            int i6 = i5 & i3;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ ((r1 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i3;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i5 = i6 + i2;
        }
    }

    public final int b(Object obj) {
        int a = a(obj);
        if (a < 0) {
            a.bK(a.cc(obj, "There is no key ", " in the map"));
        }
        return this.c[a];
    }

    public final int c(Object obj, int i) {
        int a = a(obj);
        if (a >= 0) {
            return this.c[a];
        }
        return i;
    }

    public final boolean d() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        this.e = 0;
        if (this.a != vf.a) {
            aqil.D(r1, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        aqil.d(this.b, null, 0, this.d);
        k();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        if (uvVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                if (iArr[i5] != uvVar.b(objArr[i5])) {
                                    return false;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            break;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void g(Object obj, int i) {
        int j = j(obj);
        if (j < 0) {
            j = ~j;
        }
        this.b[j] = obj;
        this.c[j] = i;
    }

    public final int h(Object obj, int i) {
        int i2;
        int j = j(obj);
        if (j < 0) {
            j = ~j;
            i2 = -1;
        } else {
            i2 = this.c[j];
        }
        this.b[j] = obj;
        this.c[j] = i;
        return i2;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i3 - length;
                int i6 = 0;
                while (true) {
                    i = 8 - ((~i5) >>> 31);
                    if (i6 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        Object obj = objArr[i7];
                        int i8 = iArr[i7];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += i8 ^ i2;
                    }
                    j >>= 8;
                    i6++;
                }
                if (i != 8) {
                    break;
                }
            }
            if (i3 == length) {
                break;
            }
            i3++;
        }
        return i4;
    }

    public final String toString() {
        int i;
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            Object[] objArr = this.b;
            int[] iArr = this.c;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = (~(i2 - length)) >>> 31;
                        int i5 = 0;
                        while (true) {
                            i = 8 - i4;
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i2 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                if (obj == this) {
                                    obj = "(this)";
                                }
                                sb.append(obj);
                                sb.append("=");
                                sb.append(i7);
                                i3++;
                                if (i3 < this.e) {
                                    sb.append(", ");
                                }
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append('}');
            return sb.toString();
        }
        return "{}";
    }

    public /* synthetic */ uv(byte[] bArr) {
        this(6);
    }

    public uv() {
        this.a = vf.a;
        this.b = vp.c;
        this.c = ua.a;
    }
}
