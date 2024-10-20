package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vc {
    public long[] a = vf.a;
    public Object[] b = vp.c;
    public long[] c = vk.a;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    private int h;

    public vc(int i) {
        l(vf.d(i));
    }

    private final int i(int i) {
        int i2 = this.f;
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

    private final void j(int[] iArr) {
        int i;
        long[] jArr = this.c;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j = jArr[i2];
            long j2 = j >> 31;
            long j3 = j & 2147483647L;
            long j4 = j & (-4611686018427387904L);
            int i4 = (int) (j2 & 2147483647L);
            if (i4 == Integer.MAX_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = iArr[i4];
            }
            int i5 = (int) j3;
            long j5 = (j4 | i) << 31;
            if (i5 != Integer.MAX_VALUE) {
                i3 = iArr[i5];
            }
            jArr[i2] = j5 | i3;
            i2++;
        }
        int i6 = this.d;
        if (i6 != Integer.MAX_VALUE) {
            this.d = iArr[i6];
        }
        int i7 = this.e;
        if (i7 != Integer.MAX_VALUE) {
            this.e = iArr[i7];
        }
    }

    private final void k() {
        this.h = vf.a(this.f) - this.g;
    }

    private final void l(int i) {
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr;
        long[] jArr2;
        int i4 = 0;
        if (i > 0) {
            i2 = Math.max(7, vf.c(i));
        } else {
            i2 = 0;
        }
        this.f = i2;
        if (i2 == 0) {
            jArr = vf.a;
            i3 = 0;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            aqil.D(jArr, -9187201950435737472L, jArr.length);
            i3 = i2;
        }
        this.a = jArr;
        int i5 = i3 >> 3;
        long j = 255 << ((7 & i3) << 3);
        jArr[i5] = (jArr[i5] & (~j)) | j;
        k();
        if (i2 == 0) {
            objArr = vp.c;
        } else {
            i4 = i2;
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i4 == 0) {
            jArr2 = vk.a;
        } else {
            jArr2 = new long[i4];
            aqil.D(jArr2, 4611686018427387903L, jArr2.length);
        }
        this.c = jArr2;
    }

    public final boolean a(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = this.f;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = (i4 >>> 7) & i2;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i4;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = ((i4 & 127) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i2;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    if (numberOfTrailingZeros >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) == 0) {
                i6 += 8;
                i5 = (i5 + i6) & i2;
                i4 = i9;
            } else {
                return false;
            }
        }
    }

    public final boolean b() {
        if (this.g == 0) {
            return true;
        }
        return false;
    }

    public final int c(Object obj) {
        int i;
        long j;
        int i2;
        int i3;
        long[] jArr;
        Object[] objArr;
        int i4;
        int i5;
        int compare;
        int i6;
        long j2;
        int i7;
        int i8;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * (-862048943);
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 >>> 7;
        int i12 = this.f;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = i10;
            long j3 = i10 & 127;
            long j4 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
            long j5 = (72340172838076673L * j3) ^ j4;
            for (long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L); j6 != 0; j6 &= (-1) + j6) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i13) & i12;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int i18 = i(i11);
                long j7 = 255;
                int i19 = 7;
                if (this.h == 0 && ((this.a[i18 >> 3] >> ((i18 & 7) << 3)) & 255) != 254) {
                    int i20 = this.f;
                    if (i20 > 8) {
                        i3 = i11;
                        compare = Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr3 = this.a;
                            if (jArr3 == null) {
                                j = j3;
                                i5 = i3;
                                i2 = 0;
                                i18 = i(i5);
                            } else {
                                int i21 = this.f;
                                Object[] objArr2 = this.b;
                                long[] jArr4 = this.c;
                                int[] iArr = new int[i21];
                                int i22 = (i21 + 7) >> 3;
                                int i23 = 0;
                                while (i23 < i22) {
                                    long j8 = jArr3[i23] & (-9187201950435737472L);
                                    jArr3[i23] = ((~j8) + (j8 >>> 7)) & (-72340172838076674L);
                                    i23++;
                                    iArr = iArr;
                                }
                                int[] iArr2 = iArr;
                                int h = aqil.h(jArr3);
                                int i24 = h - 1;
                                jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[h] = jArr3[0];
                                int i25 = 0;
                                int i26 = -1;
                                while (i25 != i21) {
                                    int i27 = i25 >> 3;
                                    int i28 = (i25 & 7) << 3;
                                    long j9 = (jArr3[i27] >> i28) & 255;
                                    if (j9 == 128) {
                                        i26 = i25;
                                        i25++;
                                    } else if (j9 != 254) {
                                        i25++;
                                    } else {
                                        Object obj2 = objArr2[i25];
                                        if (obj2 != null) {
                                            i6 = obj2.hashCode();
                                        } else {
                                            i6 = 0;
                                        }
                                        int i29 = i6 * (-862048943);
                                        int i30 = i29 ^ (i29 << 16);
                                        int i31 = i30 & 127;
                                        int i32 = i30 >>> i19;
                                        int i33 = i(i32);
                                        int i34 = i32 & i21;
                                        int i35 = i25;
                                        long j10 = i31;
                                        if (((i33 - i34) & i21) / 8 == ((i25 - i34) & i21) / 8) {
                                            j2 = j3;
                                            jArr3[i27] = ((~(255 << i28)) & jArr3[i27]) | (j10 << i28);
                                            iArr2[i35] = i35;
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i25 = i35 + 1;
                                        } else {
                                            j2 = j3;
                                            int i36 = i33 >> 3;
                                            long j11 = jArr3[i36];
                                            int i37 = (i33 & 7) << 3;
                                            long j12 = j10 << i37;
                                            int i38 = i26;
                                            long j13 = j11 & (~(255 << i37));
                                            if (((j11 >> i37) & 255) == 128) {
                                                long j14 = ~(255 << i28);
                                                jArr3[i36] = j12 | j13;
                                                jArr3[i27] = (jArr3[i27] & j14) | (128 << i28);
                                                objArr2[i33] = objArr2[i35];
                                                objArr2[i35] = null;
                                                jArr4[i33] = jArr4[i35];
                                                jArr4[i35] = 4611686018427387903L;
                                                iArr2[i35] = i33;
                                                i7 = i21;
                                                i8 = i35;
                                                i26 = i8;
                                            } else {
                                                int i39 = i21;
                                                jArr3[i36] = j13 | j12;
                                                i26 = i38;
                                                if (i26 == -1) {
                                                    long[] jArr5 = vf.a;
                                                    i26 = i35 + 1;
                                                    i7 = i39;
                                                    while (true) {
                                                        if (i26 < i7) {
                                                            if (((jArr3[i26 >> 3] >> ((i26 & 7) << 3)) & 255) == 128) {
                                                                break;
                                                            }
                                                            i26++;
                                                        } else {
                                                            i26 = -1;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    i7 = i39;
                                                }
                                                objArr2[i26] = objArr2[i33];
                                                objArr2[i33] = objArr2[i35];
                                                objArr2[i35] = objArr2[i26];
                                                jArr4[i26] = jArr4[i33];
                                                jArr4[i33] = jArr4[i35];
                                                jArr4[i35] = jArr4[i26];
                                                iArr2[i35] = i33;
                                                iArr2[i33] = i35;
                                                i8 = i35 - 1;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i25 = i8 + 1;
                                            i21 = i7;
                                        }
                                        j3 = j2;
                                        i19 = 7;
                                    }
                                }
                                j = j3;
                                i2 = 0;
                                k();
                                j(iArr2);
                                i5 = i3;
                                i18 = i(i5);
                            }
                        } else {
                            j = j3;
                        }
                    } else {
                        j = j3;
                        i3 = i11;
                    }
                    i2 = 0;
                    int b = vf.b(this.f);
                    long[] jArr6 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr7 = this.c;
                    int i40 = this.f;
                    int[] iArr3 = new int[i40];
                    l(b);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i41 = this.f;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr6[i42 >> 3] >> ((i42 & 7) << 3)) & j7) < 128) {
                            Object obj3 = objArr3[i42];
                            if (obj3 != null) {
                                i4 = obj3.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i43 = i4 * (-862048943);
                            int i44 = i((i43 ^ (i43 << 16)) >>> 7);
                            int i45 = i44 >> 3;
                            int i46 = (i44 & 7) << 3;
                            jArr = jArr6;
                            objArr = objArr3;
                            long j15 = (jArr8[i45] & (~(j7 << i46))) | ((r12 & 127) << i46);
                            jArr8[i45] = j15;
                            jArr8[(((i44 - 7) & i41) + (i41 & 7)) >> 3] = j15;
                            objArr4[i44] = obj3;
                            jArr9[i44] = jArr7[i42];
                            iArr3[i42] = i44;
                        } else {
                            jArr = jArr6;
                            objArr = objArr3;
                        }
                        i42++;
                        jArr6 = jArr;
                        objArr3 = objArr;
                        j7 = 255;
                    }
                    j(iArr3);
                    i5 = i3;
                    i18 = i(i5);
                } else {
                    j = j3;
                    i2 = 0;
                }
                int i47 = 1;
                this.g++;
                int i48 = this.h;
                long[] jArr10 = this.a;
                int i49 = i18 >> 3;
                long j16 = jArr10[i49];
                int i50 = (i18 & 7) << 3;
                if (((j16 >> i50) & 255) != 128) {
                    i47 = i2;
                }
                this.h = i48 - i47;
                int i51 = this.f;
                long j17 = (j16 & (~(255 << i50))) | (j << i50);
                jArr10[i49] = j17;
                jArr10[(((i18 - 7) & i51) + (i51 & 7)) >> 3] = j17;
                return i18;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i10 = i17;
        }
    }

    public final void d() {
        this.g = 0;
        if (this.a != vf.a) {
            aqil.D(r1, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        aqil.d(this.b, null, 0, this.f);
        aqil.D(r0, 4611686018427387903L, this.c.length);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        k();
    }

    public final void e(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.f;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | i6;
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (i5 << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vc)) {
            return false;
        }
        vc vcVar = (vc) obj;
        if (vcVar.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
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
                            if ((255 & j) < 128 && !vcVar.a(objArr[(i << 3) + i3])) {
                                return false;
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

    public final boolean f(Object obj) {
        int i = this.g;
        int c = c(obj);
        this.b[c] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[c] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((c & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = c;
        if (this.e == Integer.MAX_VALUE) {
            this.e = c;
        }
        if (this.g != i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r18.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.f
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r5 & 7
            int r10 = r5 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r3
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4d:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6b
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.b
            r14 = r14[r9]
            boolean r14 = defpackage.d.F(r14, r1)
            if (r14 == 0) goto L66
            goto L75
        L66:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4d
        L6b:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L80
            r9 = -1
        L75:
            if (r9 < 0) goto L79
            r2 = r13
            goto L7a
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L7f
            r0.e(r9)
        L7f:
            return r2
        L80:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc.g(java.lang.Object):boolean");
    }

    public final boolean h(Collection collection) {
        int i;
        collection.getClass();
        Object[] objArr = this.b;
        int i2 = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!aqjn.aH(collection, objArr[i6])) {
                                e(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
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
        }
        if (i2 == this.g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = (~(i4 - length)) >>> 31;
                    int i6 = 0;
                    while (true) {
                        i = 8 - i5;
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i4 << 3) + i6];
                            if (!d.F(obj, this)) {
                                if (obj != null) {
                                    i2 = obj.hashCode();
                                } else {
                                    i2 = 0;
                                }
                                i3 += i2;
                            }
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        rh rhVar = new rh(this, 4);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i != Integer.MAX_VALUE) {
                long j = jArr[i] >> 31;
                Object obj = objArr[i];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) rhVar.a(obj));
                i2++;
                i = (int) (j & 2147483647L);
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public vc() {
    }
}
