package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ud {
    public long[] a;
    public long[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public ud() {
        this.a = vf.a;
        this.b = ui.a;
        this.c = ua.a;
    }

    private final int c(int i) {
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

    private final void d() {
        this.f = vf.a(this.d) - this.e;
    }

    private final void e(int i) {
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
        d();
        this.b = new long[i2];
        this.c = new int[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r3 = defpackage.a.A(r18)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            int r4 = r3 >>> 7
            int r5 = r0.d
            r4 = r4 & r5
            r6 = 0
        L15:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r4 & 7
            int r10 = r4 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            int r10 = r10 + 1
            r13 = r8[r10]
            int r8 = 64 - r9
            long r13 = r13 << r8
            long r8 = (long) r9
            long r8 = -r8
            r10 = r6
            long r6 = (long) r7
            r15 = 63
            long r8 = r8 >> r15
            long r8 = r8 & r13
            long r8 = r8 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r11
            long r6 = r6 ^ r8
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r6
            long r6 = ~r6
            long r6 = r6 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r11
        L47:
            r13 = 0
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 == 0) goto L63
            int r13 = java.lang.Long.numberOfTrailingZeros(r6)
            int r13 = r13 >> 3
            int r13 = r13 + r4
            r13 = r13 & r5
            long[] r14 = r0.b
            r15 = r14[r13]
            int r14 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r14 != 0) goto L5e
            goto L6d
        L5e:
            r13 = -1
            long r13 = r13 + r6
            long r6 = r6 & r13
            goto L47
        L63:
            long r6 = ~r8
            r15 = 6
            long r6 = r6 << r15
            long r6 = r6 & r8
            long r6 = r6 & r11
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 == 0) goto L7d
            r13 = -1
        L6d:
            if (r13 >= 0) goto L78
            java.lang.String r3 = "Cannot find value for key "
            java.lang.String r1 = defpackage.a.ck(r1, r3)
            defpackage.a.bK(r1)
        L78:
            int[] r1 = r0.c
            r1 = r1[r13]
            return r1
        L7d:
            int r6 = r10 + 8
            int r4 = r4 + r6
            r4 = r4 & r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud.a(long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r1 = c(r3);
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r37.f != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (((r37.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        r1 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        r25 = r3;
        r1 = java.lang.Long.compare((r37.e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r1 > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r1 = r37.a;
        r2 = r37.d;
        r3 = r37.b;
        r4 = r37.c;
        r10 = r2 + 7;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r11 >= (r10 >> 3)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        r9 = r1[r11] & r15;
        r1[r11] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r11 = r11 + 1;
        r10 = r10;
        r15 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        r8 = defpackage.aqil.h(r1);
        r9 = r8 - 1;
        r1[r9] = (r1[r9] & 72057594037927935L) | (-72057594037927936L);
        r1[r8] = r1[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        if (r9 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        r10 = r9 >> 3;
        r16 = (r9 & 7) << 3;
        r29 = (r1[r10] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
    
        if (r29 != r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        if (r29 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r20 = defpackage.a.A(r3[r9]) * (-862048943);
        r17 = r20 ^ (r20 << 16);
        r8 = r17 & 127;
        r11 = r17 >>> 7;
        r17 = c(r11);
        r11 = r11 & r2;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        if ((((r17 - r11) & r2) / 8) != (((r9 - r11) & r2) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
    
        r5 = r17 >> 3;
        r14 = r1[r5];
        r8 = (r17 & 7) << 3;
        r12 = r12 << r8;
        r12 = r14 & (~(255 << r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0172, code lost:
    
        if (((r14 >> r8) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0174, code lost:
    
        r14 = ~(255 << r16);
        r1[r5] = r12 | r12;
        r1[r10] = (r1[r10] & r14) | (128 << r16);
        r3[r17] = r3[r9];
        r3[r9] = 0;
        r4[r17] = r4[r9];
        r4[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a7, code lost:
    
        r1[defpackage.aqil.h(r1)] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0191, code lost:
    
        r1[r5] = r12 | r12;
        r12 = r3[r17];
        r3[r17] = r3[r9];
        r3[r9] = r12;
        r5 = r4[r17];
        r4[r17] = r4[r9];
        r4[r9] = r5;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        r1[r10] = (r12 << r16) | (r1[r10] & (~(255 << r16)));
        r1[defpackage.aqil.h(r1)] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c0, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024e, code lost:
    
        r23 = r6;
        r1 = c(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0259, code lost:
    
        r3 = 1;
        r37.e++;
        r2 = r37.f;
        r4 = r37.a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0273, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0276, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0277, code lost:
    
        r37.f = r2 - r3;
        r2 = r37.d;
        r6 = (r6 & (~(255 << r8))) | (r23 << r8);
        r4[r5] = r6;
        r4[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r10 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c8, code lost:
    
        r1 = defpackage.vf.b(r37.d);
        r2 = r37.a;
        r3 = r37.b;
        r4 = r37.c;
        r5 = r37.d;
        e(r1);
        r1 = r37.a;
        r9 = r37.b;
        r10 = r37.c;
        r11 = r37.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e3, code lost:
    
        if (r12 >= r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f4, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f6, code lost:
    
        r13 = r3[r12];
        r15 = defpackage.a.A(r13) * (-862048943);
        r8 = c((r15 ^ (r15 << 16)) >>> 7);
        r17 = r8 >> 3;
        r18 = (r8 & 7) << 3;
        r19 = r2;
        r27 = r3;
        r23 = r6;
        r7 = r5;
        r2 = (r1[r17] & (~(255 << r18))) | ((r15 & 127) << r18);
        r1[r17] = r2;
        r1[(((r8 - 7) & r11) + (r11 & 7)) >> 3] = r2;
        r9[r8] = r13;
        r10[r8] = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0243, code lost:
    
        r12 = r12 + 1;
        r5 = r7;
        r2 = r19;
        r6 = r23;
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0239, code lost:
    
        r19 = r2;
        r27 = r3;
        r23 = r6;
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c6, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0257, code lost:
    
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r38, int r40) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud.b(long, int):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        if (udVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
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
                                if (iArr[i5] != udVar.a(jArr[i5])) {
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
        }
        return true;
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr2[i2];
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
                        i3 += iArr[i6] ^ a.A(jArr[i6]);
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
        int i2;
        int i3;
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            long[] jArr = this.b;
            int[] iArr = this.c;
            long[] jArr2 = this.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    long j = jArr2[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = i4 - length;
                        int i7 = 0;
                        while (true) {
                            i2 = 8 - ((~i6) >>> 31);
                            if (i7 >= i2) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i8 = (i4 << 3) + i7;
                                i3 = i4;
                                long j2 = jArr[i8];
                                int i9 = iArr[i8];
                                sb.append(j2);
                                sb.append("=");
                                sb.append(i9);
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
                        int i10 = i4;
                        if (i2 != 8) {
                            break;
                        }
                        i = i10;
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
        return "{}";
    }

    public ud(int i) {
        this.a = vf.a;
        this.b = ui.a;
        this.c = ua.a;
        e(vf.d(i));
    }

    public /* synthetic */ ud(byte[] bArr) {
        this(6);
    }
}
