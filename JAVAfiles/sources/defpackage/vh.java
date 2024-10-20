package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vh {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    private int e;

    public vh(int i) {
        this.a = vf.a;
        this.b = vp.c;
        p(vf.d(i));
    }

    private final int m(Object obj) {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        int compare;
        int i5;
        long j2;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * (-862048943);
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 >>> 7;
        int i9 = this.c;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i7;
            long j3 = i7 & 127;
            long j4 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j5 = (72340172838076673L * j3) ^ j4;
            for (long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L); j6 != 0; j6 &= (-1) + j6) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i10) & i9;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int n = n(i8);
                long j7 = 255;
                if (this.e == 0 && ((this.a[n >> 3] >> ((n & 7) << 3)) & 255) != 254) {
                    int i16 = this.c;
                    if (i16 > 8) {
                        i3 = i8;
                        compare = Long.compare((this.d * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr2 = this.a;
                            int i17 = this.c;
                            Object[] objArr = this.b;
                            int i18 = i17 + 7;
                            for (int i19 = 0; i19 < (i18 >> 3); i19++) {
                                long j8 = jArr2[i19] & (-9187201950435737472L);
                                jArr2[i19] = ((~j8) + (j8 >>> 7)) & (-72340172838076674L);
                            }
                            int h = aqil.h(jArr2);
                            int i20 = h - 1;
                            jArr2[i20] = (jArr2[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[h] = jArr2[0];
                            int i21 = 0;
                            while (i21 != i17) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j9 = (jArr2[i22] >> i23) & j7;
                                if (j9 == 128 || j9 != 254) {
                                    i21++;
                                } else {
                                    Object obj2 = objArr[i21];
                                    if (obj2 != null) {
                                        i5 = obj2.hashCode();
                                    } else {
                                        i5 = 0;
                                    }
                                    int i24 = i5 * (-862048943);
                                    int i25 = i24 ^ (i24 << 16);
                                    int i26 = i25 & 127;
                                    int i27 = i25 >>> 7;
                                    int n2 = n(i27);
                                    int i28 = i27 & i17;
                                    long j10 = i26;
                                    if (((n2 - i28) & i17) / 8 == ((i21 - i28) & i17) / 8) {
                                        j2 = j3;
                                        jArr2[i22] = ((~(255 << i23)) & jArr2[i22]) | (j10 << i23);
                                        jArr2[aqil.h(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    } else {
                                        j2 = j3;
                                        int i29 = n2 >> 3;
                                        long j11 = jArr2[i29];
                                        int i30 = (n2 & 7) << 3;
                                        long j12 = j10 << i30;
                                        long j13 = (~(255 << i30)) & j11;
                                        if (((j11 >> i30) & 255) == 128) {
                                            long j14 = ~(255 << i23);
                                            jArr2[i29] = j13 | j12;
                                            jArr2[i22] = (jArr2[i22] & j14) | (128 << i23);
                                            objArr[n2] = objArr[i21];
                                            objArr[i21] = null;
                                        } else {
                                            jArr2[i29] = j13 | j12;
                                            Object obj3 = objArr[n2];
                                            objArr[n2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            i21--;
                                        }
                                        jArr2[aqil.h(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    }
                                    j3 = j2;
                                    j7 = 255;
                                }
                            }
                            j = j3;
                            i2 = 0;
                            o();
                            n = n(i3);
                        } else {
                            j = j3;
                        }
                    } else {
                        j = j3;
                        i3 = i8;
                    }
                    i2 = 0;
                    int b = vf.b(this.c);
                    long[] jArr3 = this.a;
                    Object[] objArr2 = this.b;
                    int i31 = this.c;
                    p(b);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int i32 = this.c;
                    for (int i33 = 0; i33 < i31; i33++) {
                        if (((jArr3[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr2[i33];
                            if (obj4 != null) {
                                i4 = obj4.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i34 = i4 * (-862048943);
                            int n3 = n((i34 ^ (i34 << 16)) >>> 7);
                            int i35 = n3 >> 3;
                            int i36 = (n3 & 7) << 3;
                            long j15 = ((r10 & 127) << i36) | (jArr4[i35] & (~(255 << i36)));
                            jArr4[i35] = j15;
                            jArr4[(((n3 - 7) & i32) + (i32 & 7)) >> 3] = j15;
                            objArr3[n3] = obj4;
                        }
                    }
                    n = n(i3);
                } else {
                    j = j3;
                    i2 = 0;
                }
                this.d++;
                int i37 = this.e;
                long[] jArr5 = this.a;
                int i38 = n >> 3;
                long j16 = jArr5[i38];
                int i39 = (n & 7) << 3;
                if (((j16 >> i39) & 255) != 128) {
                    i14 = i2;
                }
                this.e = i37 - i14;
                int i40 = this.c;
                long j17 = (j16 & (~(255 << i39))) | (j << i39);
                jArr5[i38] = j17;
                jArr5[(((n - 7) & i40) + (i40 & 7)) >> 3] = j17;
                return n;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i7 = i15;
        }
    }

    private final int n(int i) {
        int i2 = this.c;
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

    private final void o() {
        this.e = vf.a(this.c) - this.d;
    }

    private final void p(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        int i3 = 0;
        if (i > 0) {
            i2 = Math.max(7, vf.c(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
        if (i2 == 0) {
            jArr = vf.a;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            aqil.D(jArr, -9187201950435737472L, jArr.length);
            i3 = i2;
        }
        this.a = jArr;
        int i4 = i3 >> 3;
        long j = 255 << ((7 & i3) << 3);
        jArr[i4] = j | (jArr[i4] & (~j));
        o();
        if (i2 == 0) {
            objArr = vp.c;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
    }

    public final boolean a(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = this.c;
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
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.d = 0;
        if (this.a != vf.a) {
            aqil.D(r1, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        aqil.d(this.b, null, 0, this.c);
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.c
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
            if (r4 == 0) goto L76
            r10 = -1
        L70:
            if (r10 < 0) goto L75
            r14.i(r10)
        L75:
            return
        L76:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh.e(java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        if (vhVar.d != this.d) {
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
                            if ((255 & j) < 128 && !vhVar.a(objArr[(i << 3) + i3])) {
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

    public final void f(vh vhVar) {
        int i;
        vhVar.getClass();
        Object[] objArr = vhVar.b;
        long[] jArr = vhVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            h(objArr[(i2 << 3) + i4]);
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(Object obj) {
        this.b[m(obj)] = obj;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (this.c * 31) + this.d;
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

    public final void i(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final boolean j(Object obj) {
        int i = this.d;
        this.b[m(obj)] = obj;
        if (this.d != i) {
            return true;
        }
        return false;
    }

    public final boolean k(Iterable iterable) {
        int i = this.d;
        g(iterable);
        if (i != this.d) {
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
    public final boolean l(java.lang.Object r18) {
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
            int r4 = r0.c
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
            r0.i(r9)
        L7f:
            return r2
        L80:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh.l(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        rh rhVar = new rh(this, 5);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 < i5) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i4];
                                if (i2 == -1) {
                                    sb.append((CharSequence) "...");
                                    break loop0;
                                }
                                if (i2 != 0) {
                                    sb.append((CharSequence) ", ");
                                }
                                sb.append((CharSequence) rhVar.a(obj));
                                i2++;
                            }
                            j >>= 8;
                            i4++;
                        } else if (i5 != 8) {
                            break;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ vh(byte[] bArr) {
        this(6);
    }

    public vh() {
        this.a = vf.a;
        this.b = vp.c;
    }
}
