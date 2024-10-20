package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tt {
    public long[] a = vf.a;
    public int[] b = ua.a;
    public int[] c = ua.a;
    public int d;
    public int e;
    private int f;

    public tt() {
    }

    private final int f(int i) {
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

    private final void g() {
        this.f = vf.a(this.d) - this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i) {
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
        g();
        this.b = new int[i2];
        this.c = new int[i2];
    }

    public final int a(int i) {
        int i2 = (-862048943) * i;
        int i3 = this.d;
        int i4 = ((i2 ^ (i2 << 16)) >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = j ^ ((r0 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int b(int i) {
        int a = a(i);
        if (a < 0) {
            a.bK(a.bV(i, "Cannot find value for key "));
        }
        return this.c[a];
    }

    public final void c() {
        this.e = 0;
        if (this.a != vf.a) {
            aqil.D(r0, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r5 = f(r4);
        r11 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r34.f != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (((r34.a[r5 >> 3] >> ((r5 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        r5 = r34.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r5 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r5 = java.lang.Long.compare((r34.e * 32) ^ Long.MIN_VALUE, (r5 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r5 > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r5 = r34.a;
        r6 = r34.d;
        r8 = r34.b;
        r9 = r34.c;
        r12 = r6 + 7;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r15 >= (r12 >> 3)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        r13 = r5[r15] & (-9187201950435737472L);
        r5[r15] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r15 = r15 + 1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        r25 = r8;
        r7 = defpackage.aqil.h(r5);
        r8 = r7 - 1;
        r5[r8] = (r5[r8] & 72057594037927935L) | (-72057594037927936L);
        r5[r7] = r5[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        if (r8 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r7 = r8 >> 3;
        r16 = (r8 & 7) << 3;
        r12 = (r5[r7] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        if (r12 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        if (r12 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
    
        r17 = r25[r8] * (-862048943);
        r13 = r17 ^ (r17 << 16);
        r10 = r13 & 127;
        r13 = r13 >>> r11;
        r21 = f(r13);
        r13 = r13 & r6;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
    
        if ((((r21 - r13) & r6) / 8) != (((r8 - r13) & r6) / 8)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015c, code lost:
    
        r30 = r2;
        r1 = r21 >> 3;
        r2 = r5[r1];
        r12 = (r21 & 7) << 3;
        r13 = r14 << r12;
        r32 = r2 & (~(255 << r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
    
        if (((r2 >> r12) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0178, code lost:
    
        r2 = ~(255 << r16);
        r5[r1] = r32 | r13;
        r5[r7] = (r5[r7] & r2) | (128 << r16);
        r25[r21] = r25[r8];
        r25[r8] = 0;
        r9[r21] = r9[r8];
        r9[r8] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ac, code lost:
    
        r5[defpackage.aqil.h(r5)] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r2 = r30;
        r11 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
    
        r5[r1] = r32 | r13;
        r1 = r25[r21];
        r25[r21] = r25[r8];
        r25[r8] = r1;
        r1 = r9[r21];
        r9[r21] = r9[r8];
        r9[r8] = r1;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        r5[r7] = ((~(255 << r16)) & r5[r7]) | (r14 << r16);
        r5[defpackage.aqil.h(r5)] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c7, code lost:
    
        r30 = r2;
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0250, code lost:
    
        r5 = f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0258, code lost:
    
        r34.e++;
        r1 = r34.f;
        r3 = r34.a;
        r4 = r5 >> 3;
        r6 = r3[r4];
        r8 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0273, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0275, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027a, code lost:
    
        r34.f = r1 - r17;
        r1 = r34.d;
        r6 = (r6 & (~(255 << r8))) | (r30 << r8);
        r3[r4] = r6;
        r3[(((r5 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r11 = ~r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0278, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cf, code lost:
    
        r30 = r2;
        r1 = defpackage.vf.b(r34.d);
        r3 = r34.a;
        r5 = r34.b;
        r6 = r34.c;
        r7 = r34.d;
        h(r1);
        r1 = r34.a;
        r8 = r34.b;
        r9 = r34.c;
        r10 = r34.d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ec, code lost:
    
        if (r11 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ff, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0201, code lost:
    
        r12 = r5[r11];
        r14 = r12 * (-862048943);
        r2 = f((r14 ^ (r14 << 16)) >>> 7);
        r16 = r2 >> 3;
        r21 = (r2 & 7) << 3;
        r24 = r3;
        r23 = r4;
        r3 = ((r14 & 127) << r21) | (r1[r16] & (~(255 << r21)));
        r1[r16] = r3;
        r1[(((r2 - 7) & r10) + (r10 & 7)) >> 3] = r3;
        r8[r2] = r12;
        r9[r2] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0248, code lost:
    
        r11 = r11 + 1;
        r4 = r23;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0244, code lost:
    
        r24 = r3;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0256, code lost:
    
        r30 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt.d(int, int):void");
    }

    public final int e(int i) {
        int a = a(i);
        if (a >= 0) {
            return this.c[a];
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        if (ttVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
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
                                if (iArr2[i5] != ttVar.b(iArr[i5])) {
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

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        i3 += iArr2[i6] ^ iArr[i6];
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
        return i3;
    }

    public final String toString() {
        int i;
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            int[] iArr = this.b;
            int[] iArr2 = this.c;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i2 - length;
                        int i5 = 0;
                        while (true) {
                            i = 8 - ((~i4) >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                int i8 = iArr2[i6];
                                sb.append(i7);
                                sb.append("=");
                                sb.append(i8);
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

    public /* synthetic */ tt(byte[] bArr) {
        h(vf.d(6));
    }
}
