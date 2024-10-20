package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uf {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public uf() {
        this.a = vf.a;
        this.b = ui.a;
        this.c = vp.c;
    }

    private final int h(long j) {
        long j2;
        int i;
        int i2;
        long[] jArr;
        long[] jArr2;
        long j3;
        int i3;
        int compare;
        int A = a.A(j) * (-862048943);
        int i4 = A ^ (A << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = i8;
            long j4 = i4 & 127;
            long j5 = (((-i10) >> 63) & (jArr3[i9 + 1] << (64 - i10))) | (jArr3[i9] >>> i10);
            long j6 = (72340172838076673L * j4) ^ j5;
            long j7 = -9187201950435737472L;
            for (long j8 = (~j6) & ((-72340172838076673L) + j6) & (-9187201950435737472L); j8 != 0; j8 &= (-1) + j8) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int i12 = i(i5);
                long j9 = 128;
                if (this.f == 0 && ((this.a[i12 >> 3] >> ((i12 & 7) << 3)) & 255) != 254) {
                    int i13 = this.d;
                    if (i13 > 8) {
                        i2 = i5;
                        compare = Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i13 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr4 = this.a;
                            int i14 = this.d;
                            long[] jArr5 = this.b;
                            Object[] objArr = this.c;
                            int i15 = i14 + 7;
                            int i16 = 0;
                            while (i16 < (i15 >> 3)) {
                                long j10 = jArr4[i16] & j7;
                                jArr4[i16] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i16++;
                                i15 = i15;
                                j7 = -9187201950435737472L;
                            }
                            int h = aqil.h(jArr4);
                            int i17 = h - 1;
                            jArr4[i17] = (jArr4[i17] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[h] = jArr4[0];
                            int i18 = 0;
                            while (i18 != i14) {
                                int i19 = i18 >> 3;
                                int i20 = (i18 & 7) << 3;
                                long j11 = (jArr4[i19] >> i20) & 255;
                                if (j11 == j9 || j11 != 254) {
                                    i18++;
                                } else {
                                    int A2 = a.A(jArr5[i18]) * (-862048943);
                                    int i21 = A2 ^ (A2 << 16);
                                    int i22 = i21 & 127;
                                    int i23 = i21 >>> 7;
                                    int i24 = i(i23);
                                    int i25 = i23 & i14;
                                    long j12 = i22;
                                    if (((i24 - i25) & i14) / 8 == ((i18 - i25) & i14) / 8) {
                                        jArr4[i19] = (j12 << i20) | (jArr4[i19] & (~(255 << i20)));
                                        jArr4[aqil.h(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i18++;
                                        j9 = 128;
                                    } else {
                                        int i26 = i24 >> 3;
                                        long j13 = jArr4[i26];
                                        int i27 = (i24 & 7) << 3;
                                        long j14 = j12 << i27;
                                        long j15 = (~(255 << i27)) & j13;
                                        if (((j13 >> i27) & 255) == 128) {
                                            long j16 = ~(255 << i20);
                                            jArr4[i26] = j15 | j14;
                                            jArr4[i19] = (jArr4[i19] & j16) | (128 << i20);
                                            jArr5[i24] = jArr5[i18];
                                            jArr5[i18] = 0;
                                            objArr[i24] = objArr[i18];
                                            objArr[i18] = null;
                                        } else {
                                            jArr4[i26] = j15 | j14;
                                            long j17 = jArr5[i24];
                                            jArr5[i24] = jArr5[i18];
                                            jArr5[i18] = j17;
                                            Object obj = objArr[i24];
                                            objArr[i24] = objArr[i18];
                                            objArr[i18] = obj;
                                            i18--;
                                        }
                                        jArr4[aqil.h(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i18++;
                                        j9 = 128;
                                    }
                                }
                            }
                            i = 0;
                            j();
                            j2 = j4;
                            i12 = i(i2);
                        }
                    } else {
                        i2 = i5;
                    }
                    i = 0;
                    int b = vf.b(this.d);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    Object[] objArr2 = this.c;
                    int i28 = this.d;
                    k(b);
                    long[] jArr8 = this.a;
                    long[] jArr9 = this.b;
                    Object[] objArr3 = this.c;
                    int i29 = this.d;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr6[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < 128) {
                            long j18 = jArr7[i30];
                            int A3 = a.A(j18) * (-862048943);
                            int i31 = i((A3 ^ (A3 << 16)) >>> 7);
                            int i32 = i31 >> 3;
                            int i33 = (i31 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr7;
                            j3 = j4;
                            i3 = i28;
                            long j19 = (jArr8[i32] & (~(255 << i33))) | ((r14 & 127) << i33);
                            jArr8[i32] = j19;
                            jArr8[(((i31 - 7) & i29) + (i29 & 7)) >> 3] = j19;
                            jArr9[i31] = j18;
                            objArr3[i31] = objArr2[i30];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr7;
                            j3 = j4;
                            i3 = i28;
                        }
                        i30++;
                        i28 = i3;
                        jArr6 = jArr;
                        j4 = j3;
                        jArr7 = jArr2;
                    }
                    j2 = j4;
                    i12 = i(i2);
                } else {
                    j2 = j4;
                    i = 0;
                }
                int i34 = 1;
                this.e++;
                int i35 = this.f;
                long[] jArr10 = this.a;
                int i36 = i12 >> 3;
                long j20 = jArr10[i36];
                int i37 = (i12 & 7) << 3;
                if (((j20 >> i37) & 255) != 128) {
                    i34 = i;
                }
                this.f = i35 - i34;
                int i38 = this.d;
                long j21 = (j20 & (~(255 << i37))) | (j2 << i37);
                jArr10[i36] = j21;
                jArr10[(((i12 - 7) & i38) + (i38 & 7)) >> 3] = j21;
                return i12;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
            i5 = i5;
        }
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

    private final void j() {
        this.f = vf.a(this.d) - this.e;
    }

    private final void k(int i) {
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
        j();
        this.b = new long[i2];
        this.c = new Object[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = defpackage.a.A(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
            r2 = r2 & r3
            r4 = 0
        L12:
            r5 = r1 & 127(0x7f, float:1.78E-43)
            long[] r6 = r0.a
            r7 = r2 & 7
            int r8 = r2 >> 3
            r9 = r6[r8]
            int r7 = r7 << 3
            long r9 = r9 >>> r7
            int r8 = r8 + 1
            r11 = r6[r8]
            int r6 = 64 - r7
            long r11 = r11 << r6
            long r6 = (long) r7
            long r6 = -r6
            long r13 = (long) r5
            r5 = 63
            long r5 = r6 >> r5
            long r5 = r5 & r11
            long r5 = r5 | r9
            r7 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r7
            long r7 = r5 ^ r13
            r9 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r9 = r9 + r7
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L45:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L61
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r3
            long[] r12 = r0.b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L5c
            goto L6b
        L5c:
            r11 = -1
            long r11 = r11 + r7
            long r7 = r7 & r11
            goto L45
        L61:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L74
            r11 = -1
        L6b:
            if (r11 < 0) goto L72
            java.lang.Object[] r1 = r0.c
            r1 = r1[r11]
            return r1
        L72:
            r1 = 0
            return r1
        L74:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf.a(long):java.lang.Object");
    }

    public final boolean b(long j) {
        int A = a.A(j) * (-862048943);
        int i = this.d;
        int i2 = ((A ^ (A << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.a;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            int i6 = i3;
            long j2 = (((-i5) >> 63) & (jArr[i4 + 1] << (64 - i5))) | (jArr[i4] >>> i5);
            long j3 = ((r1 & 127) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i2) & i;
                if (this.b[numberOfTrailingZeros] == j) {
                    if (numberOfTrailingZeros >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) == 0) {
                i3 = i6 + 8;
                i2 = (i2 + i3) & i;
            } else {
                return false;
            }
        }
    }

    public final boolean c() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = defpackage.a.A(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
            r2 = r2 & r3
            r4 = 0
        L13:
            r5 = r1 & 127(0x7f, float:1.78E-43)
            long[] r6 = r0.a
            r7 = r2 & 7
            int r8 = r2 >> 3
            r9 = r6[r8]
            int r7 = r7 << 3
            long r9 = r9 >>> r7
            int r8 = r8 + 1
            r11 = r6[r8]
            int r6 = 64 - r7
            long r11 = r11 << r6
            long r6 = (long) r7
            long r6 = -r6
            long r13 = (long) r5
            r5 = 63
            long r5 = r6 >> r5
            long r5 = r5 & r11
            long r5 = r5 | r9
            r7 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r7
            long r7 = r5 ^ r13
            r9 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r9 = r9 + r7
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L46:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r14 = -1
            if (r13 == 0) goto L63
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r3
            long[] r12 = r0.b
            r15 = r12[r11]
            int r12 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r12 != 0) goto L5e
            goto L6d
        L5e:
            r11 = -1
            long r11 = r11 + r7
            long r7 = r7 & r11
            goto L46
        L63:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L9f
            r11 = r14
        L6d:
            r1 = 0
            if (r11 < 0) goto L9e
            int r2 = r0.e
            int r2 = r2 + r14
            r0.e = r2
            long[] r2 = r0.a
            int r3 = r0.d
            int r4 = r11 >> 3
            r5 = r2[r4]
            r7 = r11 & 7
            int r7 = r7 << 3
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            r8 = 254(0xfe, double:1.255E-321)
            long r7 = r8 << r7
            long r5 = r5 | r7
            r2[r4] = r5
            int r4 = r11 + (-7)
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r2[r3] = r5
            java.lang.Object[] r2 = r0.c
            r3 = r2[r11]
            r2[r11] = r1
            return r3
        L9e:
            return r1
        L9f:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf.d(long):java.lang.Object");
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
        aqil.d(this.c, null, 0, this.d);
        j();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        if (ufVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        char c = '\b';
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                long j2 = jArr[i5];
                                Object obj2 = objArr[i5];
                                if (obj2 == null) {
                                    if (ufVar.a(j2) != null || !ufVar.b(j2)) {
                                        break loop0;
                                    }
                                } else if (!d.F(obj2, ufVar.a(j2))) {
                                    return false;
                                }
                                c = '\b';
                            }
                            j >>= c;
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
            return false;
        }
        return true;
    }

    public final void f(long j, Object obj) {
        int h = h(j);
        this.b[h] = j;
        this.c[h] = obj;
    }

    public final void g(long j, Object obj) {
        int h = h(j);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        this.b[h] = j;
        objArr[h] = obj;
    }

    public final int hashCode() {
        int i;
        int i2;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j = jArr2[i3];
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
                        long j2 = jArr[i7];
                        Object obj = objArr[i7];
                        int A = a.A(j2);
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += i2 ^ A;
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
        int i2;
        int i3;
        if (c()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = (~(i4 - length)) >>> 31;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - i6;
                        if (i7 >= i2) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j2 = jArr[i8];
                            Object obj = objArr[i8];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i2 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i4;
                }
                if (i == length) {
                    break;
                }
                i4 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public uf(int i) {
        this.a = vf.a;
        this.b = ui.a;
        this.c = vp.c;
        k(vf.d(i));
    }

    public /* synthetic */ uf(byte[] bArr) {
        this(6);
    }
}
