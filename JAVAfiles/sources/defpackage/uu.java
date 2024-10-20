package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uu {
    public long[] a = vf.a;
    public Object[] b = vp.c;
    public float[] c = tr.a;
    public int d;
    public int e;
    private int f;

    public /* synthetic */ uu(byte[] bArr) {
        g(vf.d(6));
    }

    private final int e(int i) {
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

    private final void f() {
        this.f = vf.a(this.d) - this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(int i) {
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
        f();
        this.b = new Object[i2];
        this.c = new float[i2];
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

    public final boolean b(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void c() {
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
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r6 = e(r5);
        r11 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r36.f != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (((r36.a[r6 >> 3] >> ((r6 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r6 = r36.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r6 <= 8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r20 = r5;
        r4 = java.lang.Long.compare((r36.e * 32) ^ Long.MIN_VALUE, (r6 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r4 > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        r4 = r36.a;
        r5 = r36.d;
        r6 = r36.b;
        r7 = r36.c;
        r12 = r5 + 7;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r15 >= (r12 >> 3)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        r8 = r4[r15] & (-9187201950435737472L);
        r4[r15] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        r8 = defpackage.aqil.h(r4);
        r9 = r8 - 1;
        r4[r9] = (r4[r9] & 72057594037927935L) | (-72057594037927936L);
        r4[r8] = r4[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r8 == r5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
    
        r9 = r8 >> 3;
        r10 = (r8 & 7) << 3;
        r16 = (r4[r9] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        if (r16 == 254) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
    
        r13 = r6[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        r13 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011c, code lost:
    
        r13 = r13 * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r12 = r13 & 127;
        r13 = r13 >>> r11;
        r16 = e(r13);
        r13 = r13 & r5;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        if ((((r16 - r13) & r5) / 8) != (((r8 - r13) & r5) / 8)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016c, code lost:
    
        r32 = r2;
        r1 = r16 >> 3;
        r2 = r4[r1];
        r11 = (r16 & 7) << 3;
        r13 = r14 << r11;
        r12 = (~(255 << r11)) & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0187, code lost:
    
        if (((r2 >> r11) & 255) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        r2 = ~(255 << r10);
        r4[r1] = r12 | r13;
        r4[r9] = (r4[r9] & r2) | (128 << r10);
        r6[r16] = r6[r8];
        r6[r8] = null;
        r7[r16] = r7[r8];
        r7[r8] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01be, code lost:
    
        r4[defpackage.aqil.h(r4)] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r2 = r32;
        r11 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a8, code lost:
    
        r4[r1] = r12 | r13;
        r1 = r6[r16];
        r6[r16] = r6[r8];
        r6[r8] = r1;
        r1 = r7[r16];
        r7[r16] = r7[r8];
        r7[r8] = r1;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        r4[r9] = ((~(255 << r10)) & r4[r9]) | (r14 << r10);
        r4[defpackage.aqil.h(r4)] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r2 = r2;
        r11 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        r32 = r2;
        r21 = 0;
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x026d, code lost:
    
        r6 = e(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0278, code lost:
    
        r2 = 1;
        r36.e++;
        r1 = r36.f;
        r3 = r36.a;
        r4 = r6 >> 3;
        r7 = r3[r4];
        r5 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0293, code lost:
    
        if (((r7 >> r5) & 255) != 128) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0296, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0298, code lost:
    
        r36.f = r1 - r2;
        r1 = r36.d;
        r7 = (r7 & (~(255 << r5))) | (r32 << r5);
        r3[r4] = r7;
        r3[(((r6 - 7) & r1) + (r1 & 7)) >> 3] = r7;
        r11 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e3, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ea, code lost:
    
        r21 = 0;
        r1 = defpackage.vf.b(r36.d);
        r2 = r36.a;
        r3 = r36.b;
        r4 = r36.c;
        r5 = r36.d;
        g(r1);
        r1 = r36.a;
        r6 = r36.b;
        r7 = r36.c;
        r8 = r36.d;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0207, code lost:
    
        if (r9 >= r5) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0219, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021b, code lost:
    
        r10 = r3[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021d, code lost:
    
        if (r10 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x021f, code lost:
    
        r11 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0226, code lost:
    
        r11 = r11 * (-862048943);
        r13 = e((r11 ^ (r11 << 16)) >>> 7);
        r14 = r13 >> 3;
        r15 = (r13 & 7) << 3;
        r16 = r2;
        r17 = r3;
        r2 = ((r11 & 127) << r15) | (r1[r14] & (~(255 << r15)));
        r1[r14] = r2;
        r1[(((r13 - 7) & r8) + (r8 & 7)) >> 3] = r2;
        r6[r13] = r10;
        r7[r13] = r4[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0266, code lost:
    
        r9 = r9 + 1;
        r2 = r16;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0224, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0262, code lost:
    
        r16 = r2;
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e6, code lost:
    
        r32 = r2;
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0274, code lost:
    
        r32 = r2;
        r21 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r37, float r38) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.d(java.lang.Object, float):void");
    }

    public final boolean equals(Object obj) {
        char c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        if (uuVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
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
                            Object obj2 = objArr[i5];
                            float f = fArr[i5];
                            int a = uuVar.a(obj2);
                            if (a < 0) {
                                a.bK(a.cc(obj2, "There is no key ", " in the map"));
                            }
                            if (f != uuVar.c[a]) {
                                return false;
                            }
                            c = '\b';
                        } else {
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
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                        float f = fArr[i7];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += Float.floatToIntBits(f) ^ i2;
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
            float[] fArr = this.c;
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
                                float f = fArr[i6];
                                if (obj == this) {
                                    obj = "(this)";
                                }
                                sb.append(obj);
                                sb.append("=");
                                sb.append(f);
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

    public uu() {
    }
}
