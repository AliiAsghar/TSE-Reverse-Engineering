package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vj {
    public long[] a;
    public Object[] b;
    public Object[] c;
    private final arqv d;
    private final arqr e;
    private final arqx f;
    private long[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public /* synthetic */ vj() {
        eif eifVar = eif.b;
        rp rpVar = rp.c;
        jjn jjnVar = jjn.b;
        this.d = eifVar;
        this.e = rpVar;
        this.f = jjnVar;
        this.a = vf.a;
        Object[] objArr = vp.c;
        this.b = objArr;
        this.c = objArr;
        this.g = vk.a;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        i(vf.d(16));
    }

    private final int e(int i) {
        int i2 = this.h;
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

    private final int f(Object obj) {
        int hashCode = obj.hashCode() * (-862048943);
        int i = this.h;
        int i2 = ((hashCode ^ (hashCode << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.a;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = (((-i5) >> 63) & (jArr[i4 + 1] << (64 - i5))) | (jArr[i4] >>> i5);
            long j2 = j ^ ((r0 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i2) & i;
                if (d.F(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final Object g(int i) {
        this.j--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.h;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        long[] jArr2 = this.g;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | i6;
        } else {
            this.l = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & (-4611686016279904257L)) | (i5 << 31);
        } else {
            this.m = i5;
        }
        if (this.n == i) {
            this.n = i5;
        }
        jArr2[i] = 4611686018427387903L;
        return obj;
    }

    private final void h() {
        this.i = vf.a(this.h) - this.j;
    }

    private final void i(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        long[] jArr2;
        int i3 = 0;
        if (i > 0) {
            i2 = Math.max(7, vf.c(i));
        } else {
            i2 = 0;
        }
        this.h = i2;
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
        h();
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
        if (i3 == 0) {
            jArr2 = vk.a;
        } else {
            jArr2 = new long[i3];
            aqil.D(jArr2, 4611686018427387903L, jArr2.length);
        }
        this.g = jArr2;
    }

    public final Object a(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            long[] jArr = this.g;
            jArr[f] = (jArr[f] & 4611686018427387903L) | 4611686018427387904L;
            return this.c[f];
        }
        this.e.a(obj);
        return null;
    }

    public final Object b(Object obj) {
        Object g;
        int f = f(obj);
        if (f < 0 || (g = g(f)) == null) {
            return null;
        }
        this.k -= ((Number) this.d.a(obj, g)).intValue();
        this.f.a(obj, g, null, false);
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b6, code lost:
    
        r7 = 4294967295L;
        r45.l = (int) (r14[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c7, code lost:
    
        r1 = r45.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c9, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cb, code lost:
    
        r45.m = (int) (r14[r1] & r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d1, code lost:
    
        r1 = r45.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d3, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d5, code lost:
    
        r45.n = (int) (r14[r1] & r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c2, code lost:
    
        r7 = 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02dd, code lost:
    
        r37 = r8;
        r1 = defpackage.vf.b(r45.h);
        r2 = r45.a;
        r3 = r45.b;
        r5 = r45.c;
        r6 = r45.g;
        r7 = r45.h;
        r8 = new int[r7];
        i(r1);
        r1 = r45.a;
        r9 = r45.b;
        r11 = r45.c;
        r12 = r45.g;
        r13 = r45.h;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ff, code lost:
    
        if (r14 >= r7) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0313, code lost:
    
        if (((r2[r14 >> 3] >> ((r14 & 7) << 3)) & 255) >= 128) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0315, code lost:
    
        r15 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0317, code lost:
    
        if (r15 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0319, code lost:
    
        r27 = r15.hashCode();
        r18 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0326, code lost:
    
        r27 = r27 * r18;
        r19 = r27 ^ (r27 << 16);
        r4 = e(r19 >>> 7);
        r20 = r2;
        r2 = r19 & 127;
        r19 = r4 >> 3;
        r21 = (r4 & 7) << 3;
        r35 = r7;
        r36 = r8;
        r22 = r3;
        r2 = (r2 << r21) | (r1[r19] & (~(255 << r21)));
        r1[r19] = r2;
        r1[(((r4 - 7) & r13) + (r13 & 7)) >> 3] = r2;
        r9[r4] = r15;
        r11[r4] = r5[r14];
        r12[r4] = r6[r14];
        r36[r14] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0375, code lost:
    
        r14 = r14 + 1;
        r2 = r20;
        r3 = r22;
        r7 = r35;
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0321, code lost:
    
        r18 = -862048943;
        r27 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036a, code lost:
    
        r20 = r2;
        r22 = r3;
        r35 = r7;
        r36 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0381, code lost:
    
        r36 = r8;
        r1 = r45.g;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0387, code lost:
    
        if (r3 >= r2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0389, code lost:
    
        r4 = r1[r3];
        r6 = (r4 >> 31) & 2147483647L;
        r8 = r4 & 2147483647L;
        r4 = r4 & (-4611686018427387904L);
        r6 = (int) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0398, code lost:
    
        if (r6 != Integer.MAX_VALUE) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x039a, code lost:
    
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03a0, code lost:
    
        r8 = (int) r8;
        r4 = (r4 | r6) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03a5, code lost:
    
        if (r8 != Integer.MAX_VALUE) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03a7, code lost:
    
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03ad, code lost:
    
        r1[r3] = r4 | r6;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03a9, code lost:
    
        r6 = r36[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x039c, code lost:
    
        r6 = r36[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03b4, code lost:
    
        r1 = r45.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03b9, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03bb, code lost:
    
        r45.l = r36[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03bf, code lost:
    
        r1 = r45.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03c1, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03c3, code lost:
    
        r45.m = r36[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03c7, code lost:
    
        r1 = r45.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03c9, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03cb, code lost:
    
        r45.n = r36[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d4, code lost:
    
        r37 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        r3 = e(r23);
        r7 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r45.i != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (((r45.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r3 = r45.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r3 <= 8) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r3 = java.lang.Long.compare((r45.j * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r3 > 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        r3 = r45.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r3 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        r37 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03cf, code lost:
    
        r3 = e(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03d6, code lost:
    
        r45.j++;
        r1 = r45.i;
        r2 = r45.a;
        r4 = r3 >> 3;
        r5 = r2[r4];
        r7 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03f1, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03f4, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03f6, code lost:
    
        r45.i = r1 - r16;
        r1 = r45.h;
        r5 = (r5 & (~(255 << r7))) | (r37 << r7);
        r2[r4] = r5;
        r2[(((r3 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r12 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
    
        r6 = r45.h;
        r11 = r45.b;
        r12 = r45.c;
        r13 = r45.g;
        r14 = new long[r6];
        defpackage.aqil.D(r14, -1, r6);
        r15 = (r6 + 7) >> 3;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if (r4 >= r15) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        r1 = r3[r4] & (-9187201950435737472L);
        r3[r4] = (-72340172838076674L) & ((~r1) + (r1 >>> 7));
        r4 = r4 + 1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ff, code lost:
    
        r37 = r8;
        r1 = defpackage.aqil.h(r3);
        r2 = r1 - 1;
        r3[r2] = (r3[r2] & 72057594037927935L) | (-72057594037927936L);
        r3[r1] = r3[0];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
    
        if (r1 == r6) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
    
        r8 = r1 >> 3;
        r9 = (r1 & 7) << 3;
        r17 = (r3[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012e, code lost:
    
        if (r17 != 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (r17 == 254) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        r15 = r11[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        if (r15 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        r15 = r15.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        r15 = r15 * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r2 = r15 & 127;
        r15 = r15 >>> r7;
        r7 = e(r15);
        r15 = r15 & r6;
        r4 = ((r7 - r15) & r6) / 8;
        r5 = ((r1 - r15) & r6) / 8;
        r15 = r12;
        r18 = r13;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0164, code lost:
    
        if (r4 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        r21 = r3;
        r4 = r1;
        r21[r8] = (r21[r8] & (~(255 << r9))) | (r12 << r9);
        r14[r1] = (r4 << 32) | r4;
        r21[r21.length - 1] = r21[0];
        r3 = r21;
        r1 = r1 + 1;
        r12 = r15;
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
    
        r7 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0190, code lost:
    
        r2 = r3;
        r4 = r7;
        r21 = r7 >> 3;
        r41 = r2[r21];
        r27 = (r7 & 7) << 3;
        r12 = r12 << r27;
        r3 = r41 & (~(255 << r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b2, code lost:
    
        if (((r41 >> r27) & 255) != 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b4, code lost:
    
        r27 = r6;
        r5 = ~(255 << r9);
        r2[r21] = r3 | r12;
        r2[r8] = (r2[r8] & r5) | (128 << r9);
        r11[r7] = r11[r1];
        r11[r1] = null;
        r15[r7] = r15[r1];
        r15[r1] = null;
        r18[r7] = r18[r1];
        r18[r1] = 4611686018427387903L;
        r3 = (int) ((r14[r1] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ea, code lost:
    
        if (r3 == (-1)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ec, code lost:
    
        r14[r3] = (r14[r3] & (-4294967296L)) | r4;
        r14[r1] = (r14[r1] & 4294967295L) | (-4294967296L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0200, code lost:
    
        r14[r7] = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0257, code lost:
    
        r2[r2.length - 1] = r2[0];
        r1 = r1 + 1;
        r3 = r2;
        r12 = r15;
        r13 = r18;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fc, code lost:
    
        r14[r1] = r4 | (-4294967296L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0205, code lost:
    
        r27 = r6;
        r8 = r1;
        r35 = r4 << 32;
        r2[r21] = r3 | r12;
        r3 = r11[r7];
        r11[r7] = r11[r1];
        r11[r1] = r3;
        r3 = r15[r7];
        r15[r7] = r15[r1];
        r15[r1] = r3;
        r3 = r18[r7];
        r18[r7] = r18[r1];
        r18[r1] = r3;
        r3 = (int) ((r14[r1] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0236, code lost:
    
        if (r3 == (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0238, code lost:
    
        r14[r3] = (r14[r3] & (-4294967296L)) | r4;
        r14[r1] = r35 | (r14[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024e, code lost:
    
        r14[r7] = (r3 << 32) | r8;
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0249, code lost:
    
        r14[r1] = r35 | r4;
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0141, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0130, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0269, code lost:
    
        h();
        r1 = r45.g;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0270, code lost:
    
        if (r3 >= r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0272, code lost:
    
        r5 = r1[r3];
        r7 = (r5 >> 31) & 2147483647L;
        r11 = r5 & 2147483647L;
        r5 = r5 & (-4611686018427387904L);
        r7 = (int) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0282, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0284, code lost:
    
        r7 = Integer.MAX_VALUE;
        r20 = 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0295, code lost:
    
        r8 = (int) r11;
        r5 = (r5 | r7) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x029d, code lost:
    
        if (r8 != Integer.MAX_VALUE) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x029f, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a8, code lost:
    
        r1[r3] = r5 | r7;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a3, code lost:
    
        r7 = (int) (r14[r8] & r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028b, code lost:
    
        r20 = 4294967295L;
        r7 = (int) (r14[r7] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02af, code lost:
    
        r1 = r45.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b4, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r46, java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj.c(java.lang.Object, java.lang.Object):void");
    }

    public final void d() {
        while (this.k > 16 && this.j != 0) {
            long[] jArr = this.g;
            int i = this.n;
            if (i == Integer.MAX_VALUE) {
                i = this.m;
            }
            while (i != Integer.MAX_VALUE) {
                long j = jArr[i];
                if (((int) ((j >> 62) & 1)) == 0) {
                    break;
                }
                jArr[i] = j & 4611686018427387903L;
                i = (int) (2147483647L & (j >> 31));
                if (i == Integer.MAX_VALUE) {
                    i = this.m;
                }
            }
            int i2 = (int) (2147483647L & (jArr[i] >> 31));
            if (i2 == Integer.MAX_VALUE) {
                i2 = Integer.MAX_VALUE;
            }
            this.n = i2;
            if (i != Integer.MAX_VALUE) {
                Object obj = this.b[i];
                obj.getClass();
                Object g = g(i);
                if (g != null) {
                    this.k -= ((Number) this.d.a(obj, g)).intValue();
                    this.f.a(obj, g, null, true);
                }
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        if (vjVar.k != this.k || vjVar.j != this.j) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                                Object obj2 = objArr[i5];
                                obj2.getClass();
                                Object obj3 = objArr2[i5];
                                obj3.getClass();
                                if (!d.F(obj3, vjVar.a(obj2))) {
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
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                        Object obj = objArr[i6];
                        obj.getClass();
                        Object obj2 = objArr2[i6];
                        obj2.getClass();
                        i3 += obj2.hashCode() ^ obj.hashCode();
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
        return "SieveCache[maxSize=16, size=" + this.k + ", capacity=" + this.h + ", count=" + this.j + ']';
    }
}
