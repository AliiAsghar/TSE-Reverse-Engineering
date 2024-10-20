package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ve {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public ve(int i) {
        this.a = vf.a;
        Object[] objArr = vp.c;
        this.b = objArr;
        this.c = objArr;
        if (i < 0) {
            a.bH("Capacity must be a positive value.");
        }
        m(vf.d(i));
    }

    public static /* synthetic */ boolean e(ve veVar, Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = veVar.d;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = (i4 >>> 7) & i2;
        int i6 = 0;
        while (true) {
            long[] jArr = veVar.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i4;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = ((i4 & 127) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i2;
                if (d.F(veVar.b[numberOfTrailingZeros], obj)) {
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

    private final int k(int i) {
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

    private final void l() {
        this.f = vf.a(this.d) - this.e;
    }

    private final void m(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        int i3 = 0;
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
            int i4 = i2 >> 3;
            long j = 255 << ((i2 & 7) << 3);
            jArr[i4] = (jArr[i4] & (~j)) | j;
        }
        this.a = jArr;
        l();
        if (i2 == 0) {
            objArr = vp.c;
        } else {
            i3 = i2;
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i3 == 0) {
            objArr2 = vp.c;
        } else {
            objArr2 = new Object[i3];
        }
        this.c = objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.d
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r3
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
        L14:
            r3 = r3 & r2
            r4 = r1 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r3 & 7
            int r7 = r3 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L48:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L66
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            java.lang.Object[] r11 = r14.b
            r11 = r11[r10]
            boolean r11 = defpackage.d.F(r11, r15)
            if (r11 == 0) goto L61
            goto L70
        L61:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L48
        L66:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L79
            r10 = -1
        L70:
            if (r10 < 0) goto L77
            java.lang.Object[] r15 = r14.c
            r15 = r15[r10]
            return r15
        L77:
            r15 = 0
            return r15
        L79:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.a(java.lang.Object):java.lang.Object");
    }

    public final boolean b(Object obj) {
        Object[] objArr = this.c;
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
                            if ((255 & j) < 128 && d.F(obj, objArr[(i << 3) + i3])) {
                                return true;
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
        return false;
    }

    public final boolean c() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (veVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj2 = objArr[i5];
                                Object obj3 = objArr2[i5];
                                if (obj3 == null) {
                                    if (veVar.a(obj2) != null || !e(veVar, obj2)) {
                                        break loop0;
                                    }
                                } else if (!d.F(obj3, veVar.a(obj2))) {
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        int i;
        long j;
        int i2;
        int i3;
        long[] jArr;
        Object[] objArr;
        int i4;
        int compare;
        int i5;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * (-862048943);
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 >>> 7;
        int i9 = this.d;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = i7;
            long j2 = i7 & 127;
            long j3 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
            long j4 = (72340172838076673L * j2) ^ j3;
            for (long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j5 != 0; j5 &= (-1) + j5) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i10) & i9;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int k = k(i8);
                long j6 = 255;
                int i15 = 7;
                if (this.f == 0 && ((this.a[k >> 3] >> ((k & 7) << 3)) & 255) != 254) {
                    int i16 = this.d;
                    if (i16 > 8) {
                        i3 = i8;
                        compare = Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr3 = this.a;
                            int i17 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            int i18 = 0;
                            for (int i19 = i17 + 7; i18 < (i19 >> 3); i19 = i19) {
                                long j7 = jArr3[i18] & (-9187201950435737472L);
                                jArr3[i18] = ((~j7) + (j7 >>> 7)) & (-72340172838076674L);
                                i18++;
                            }
                            int h = aqil.h(jArr3);
                            int i20 = h - 1;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[h] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i17) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j8 = (jArr3[i22] >> i23) & 255;
                                if (j8 == 128 || j8 != 254) {
                                    i21++;
                                } else {
                                    Object obj2 = objArr2[i21];
                                    if (obj2 != null) {
                                        i5 = obj2.hashCode();
                                    } else {
                                        i5 = 0;
                                    }
                                    int i24 = i5 * (-862048943);
                                    int i25 = i24 ^ (i24 << 16);
                                    int i26 = i25 & 127;
                                    int i27 = i25 >>> i15;
                                    int k2 = k(i27);
                                    int i28 = i27 & i17;
                                    long j9 = j2;
                                    long j10 = i26;
                                    if (((k2 - i28) & i17) / 8 == ((i21 - i28) & i17) / 8) {
                                        jArr3[i22] = (j10 << i23) | (jArr3[i22] & (~(255 << i23)));
                                        jArr3[aqil.h(jArr3)] = jArr3[0];
                                        i21++;
                                        j2 = j9;
                                    } else {
                                        int i29 = k2 >> 3;
                                        long j11 = jArr3[i29];
                                        int i30 = (k2 & 7) << 3;
                                        long j12 = j10 << i30;
                                        long j13 = j11 & (~(255 << i30));
                                        if (((j11 >> i30) & 255) == 128) {
                                            long j14 = ~(255 << i23);
                                            jArr3[i29] = j12 | j13;
                                            jArr3[i22] = (jArr3[i22] & j14) | (128 << i23);
                                            objArr2[k2] = objArr2[i21];
                                            objArr2[i21] = null;
                                            objArr3[k2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            jArr3[i29] = j12 | j13;
                                            Object obj3 = objArr2[k2];
                                            objArr2[k2] = objArr2[i21];
                                            objArr2[i21] = obj3;
                                            Object obj4 = objArr3[k2];
                                            objArr3[k2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr3[aqil.h(jArr3)] = jArr3[0];
                                        i21++;
                                        j2 = j9;
                                        i15 = 7;
                                    }
                                }
                            }
                            j = j2;
                            i2 = 0;
                            l();
                            k = k(i3);
                        } else {
                            j = j2;
                        }
                    } else {
                        j = j2;
                        i3 = i8;
                    }
                    i2 = 0;
                    int b = vf.b(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i31 = this.d;
                    m(b);
                    long[] jArr5 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr4[i33 >> 3] >> ((i33 & 7) << 3)) & j6) < 128) {
                            Object obj5 = objArr4[i33];
                            if (obj5 != null) {
                                i4 = obj5.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i34 = i4 * (-862048943);
                            int k3 = k((i34 ^ (i34 << 16)) >>> 7);
                            int i35 = k3 >> 3;
                            int i36 = (k3 & 7) << 3;
                            jArr = jArr4;
                            objArr = objArr4;
                            long j15 = (jArr5[i35] & (~(j6 << i36))) | ((r11 & 127) << i36);
                            jArr5[i35] = j15;
                            jArr5[(((k3 - 7) & i32) + (i32 & 7)) >> 3] = j15;
                            objArr6[k3] = obj5;
                            objArr7[k3] = objArr5[i33];
                        } else {
                            jArr = jArr4;
                            objArr = objArr4;
                        }
                        i33++;
                        jArr4 = jArr;
                        objArr4 = objArr;
                        j6 = 255;
                    }
                    k = k(i3);
                } else {
                    j = j2;
                    i2 = 0;
                }
                int i37 = 1;
                this.e++;
                int i38 = this.f;
                long[] jArr6 = this.a;
                int i39 = k >> 3;
                long j16 = jArr6[i39];
                int i40 = (k & 7) << 3;
                if (((j16 >> i40) & 255) != 128) {
                    i37 = i2;
                }
                this.f = i38 - i37;
                int i41 = this.d;
                long j17 = (j16 & (~(255 << i40))) | (j << i40);
                jArr6[i39] = j17;
                jArr6[(((k - 7) & i41) + (i41 & 7)) >> 3] = j17;
                return ~k;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i7 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.d
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r3
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
        L14:
            r3 = r3 & r2
            r4 = r1 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r3 & 7
            int r7 = r3 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L48:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L66
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            java.lang.Object[] r11 = r14.b
            r11 = r11[r10]
            boolean r11 = defpackage.d.F(r11, r15)
            if (r11 == 0) goto L61
            goto L70
        L61:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L48
        L66:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L79
            r10 = -1
        L70:
            if (r10 < 0) goto L77
            java.lang.Object r15 = r14.h(r10)
            return r15
        L77:
            r15 = 0
            return r15
        L79:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.g(java.lang.Object):java.lang.Object");
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = i4 - length;
                int i7 = 0;
                while (true) {
                    i = 8 - ((~i6) >>> 31);
                    if (i7 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr[i8];
                        Object obj2 = objArr2[i8];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj2 != null) {
                            i3 = obj2.hashCode();
                        } else {
                            i3 = 0;
                        }
                        i5 += i3 ^ i2;
                    }
                    j >>= 8;
                    i7++;
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
        return i5;
    }

    public final void i() {
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
        aqil.d(this.b, null, 0, this.d);
        l();
    }

    public final void j(Object obj, Object obj2) {
        int f = f(obj);
        if (f < 0) {
            f = ~f;
        }
        this.b[f] = obj;
        this.c[f] = obj2;
    }

    public final String toString() {
        int i;
        if (c()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                            Object obj2 = objArr2[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public /* synthetic */ ve(byte[] bArr) {
        this(6);
    }

    public ve() {
        this.a = vf.a;
        Object[] objArr = vp.c;
        this.b = objArr;
        this.c = objArr;
    }
}
