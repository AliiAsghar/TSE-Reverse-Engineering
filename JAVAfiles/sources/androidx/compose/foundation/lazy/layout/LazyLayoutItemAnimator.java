package androidx.compose.foundation.lazy.layout;

import defpackage.arl;
import defpackage.arm;
import defpackage.arv;
import defpackage.arwe;
import defpackage.asd;
import defpackage.cga;
import defpackage.clc;
import defpackage.cnr;
import defpackage.cnt;
import defpackage.cof;
import defpackage.coh;
import defpackage.cwx;
import defpackage.cyg;
import defpackage.d;
import defpackage.dqs;
import defpackage.dre;
import defpackage.ve;
import defpackage.vh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends asd> {
    public cwx b;
    private arv d;
    private int e;
    private final ve j = new ve((byte[]) null);
    private final vh k = new vh((byte[]) null);
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    public final List a = new ArrayList();
    public final cga c = new DisplayingDisappearingItemsElement(this);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    private static final class DisplayingDisappearingItemsElement extends cyg<a> {
        private final LazyLayoutItemAnimator a;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.a = lazyLayoutItemAnimator;
        }

        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ cga.c d() {
            return new a(this.a);
        }

        @Override // defpackage.cyg
        public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
            a aVar = (a) cVar;
            LazyLayoutItemAnimator lazyLayoutItemAnimator = aVar.a;
            LazyLayoutItemAnimator lazyLayoutItemAnimator2 = this.a;
            if (!d.F(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) && aVar.p.z) {
                aVar.a.d();
                lazyLayoutItemAnimator2.b = aVar;
                aVar.a = lazyLayoutItemAnimator2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof DisplayingDisappearingItemsElement) && d.F(this.a, ((DisplayingDisappearingItemsElement) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        public dqs b;
        public int c;
        public int d;
        public int f;
        public int g;
        public arl[] a = arm.a;
        public int e = 1;

        public static /* synthetic */ void b(b bVar, asd asdVar, arwe arweVar, clc clcVar, int i, int i2) {
            int a;
            long k = asdVar.k(0);
            if (!asdVar.p()) {
                a = dre.b(k);
            } else {
                a = dre.a(k);
            }
            bVar.a(asdVar, arweVar, clcVar, i, i2, a);
        }

        public final void a(asd asdVar, arwe arweVar, clc clcVar, int i, int i2, int i3) {
            for (arl arlVar : this.a) {
            }
            this.f = i;
            this.g = i2;
            int length = this.a.length;
            for (int h = asdVar.h(); h < length; h++) {
                arl arlVar2 = this.a[h];
                if (arlVar2 != null) {
                    arlVar2.d();
                }
            }
            if (this.a.length != asdVar.h()) {
                Object[] copyOf = Arrays.copyOf(this.a, asdVar.h());
                copyOf.getClass();
                this.a = (arl[]) copyOf;
            }
            this.b = new dqs(asdVar.j());
            this.c = i3;
            this.d = asdVar.f();
            this.e = asdVar.i();
            int h2 = asdVar.h();
            for (int i4 = 0; i4 < h2; i4++) {
                if (arm.a(asdVar.l(i4)) == null) {
                    arl arlVar3 = this.a[i4];
                    if (arlVar3 != null) {
                        arlVar3.d();
                    }
                    this.a[i4] = null;
                } else {
                    if (this.a[i4] == null) {
                        this.a[i4] = new arl(arweVar, clcVar);
                        throw null;
                    }
                    throw null;
                }
            }
        }
    }

    static /* synthetic */ void e(LazyLayoutItemAnimator lazyLayoutItemAnimator, asd asdVar, int i) {
        Object a2 = lazyLayoutItemAnimator.j.a(asdVar.e());
        a2.getClass();
        j(asdVar, i, (b) a2);
    }

    private final void f() {
        int i;
        ve veVar = this.j;
        if (veVar.d()) {
            Object[] objArr = veVar.c;
            long[] jArr = veVar.a;
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
                                for (arl arlVar : ((b) objArr[(i2 << 3) + i4]).a) {
                                    if (arlVar != null) {
                                        arlVar.d();
                                    }
                                }
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.j.i();
        }
    }

    private final void g(Object obj) {
        arl[] arlVarArr;
        b bVar = (b) this.j.g(obj);
        if (bVar != null && (arlVarArr = bVar.a) != null) {
            for (arl arlVar : arlVarArr) {
                if (arlVar != null) {
                    arlVar.d();
                }
            }
        }
    }

    private static final boolean h(asd asdVar) {
        int h = asdVar.h();
        for (int i = 0; i < h; i++) {
            if (arm.a(asdVar.l(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private static final int i(asd asdVar) {
        long k = asdVar.k(0);
        if (asdVar.p()) {
            return dre.b(k);
        }
        return dre.a(k);
    }

    private static final void j(asd asdVar, int i, b bVar) {
        long f;
        int i2 = 0;
        long k = asdVar.k(0);
        if (asdVar.p()) {
            f = dre.f(k, 0, i, 1);
        } else {
            f = dre.f(k, i, 0, 2);
        }
        arl[] arlVarArr = bVar.a;
        int length = arlVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            arl arlVar = arlVarArr[i2];
            int i4 = i3 + 1;
            if (arlVar != null) {
                arlVar.b = dre.d(f, dre.c(asdVar.k(i3), k));
            }
            i2++;
            i3 = i4;
        }
    }

    private final void k(asd asdVar) {
        Object a2 = this.j.a(asdVar.e());
        a2.getClass();
        arl[] arlVarArr = ((b) a2).a;
        int length = arlVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arl arlVar = arlVarArr[i];
            int i3 = i2 + 1;
            if (arlVar != null) {
                arlVar.b = asdVar.k(i2);
            }
            i++;
            i2 = i3;
        }
    }

    private static final int l(int[] iArr, asd asdVar) {
        int f = asdVar.f();
        int i = asdVar.i() + f;
        int i2 = 0;
        while (f < i) {
            int g = iArr[f] + asdVar.g();
            iArr[f] = g;
            i2 = Math.max(i2, g);
            f++;
        }
        return i2;
    }

    public final long a() {
        List list = this.a;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            arl arlVar = (arl) list.get(i);
            cof cofVar = arlVar.d;
            if (cofVar != null) {
                j = (Math.max((int) (j & 4294967295L), dre.b(arlVar.b) + ((int) (cofVar.l & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), dre.a(arlVar.b) + ((int) (cofVar.l >> 32))) << 32);
            }
        }
        return j;
    }

    public final arl b(Object obj, int i) {
        arl[] arlVarArr;
        b bVar = (b) this.j.a(obj);
        if (bVar != null && (arlVarArr = bVar.a) != null) {
            return arlVarArr[i];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d3, code lost:
    
        defpackage.cwy.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d6, code lost:
    
        r6.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dc, code lost:
    
        k(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0109, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x010c, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r34.e = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x010b, code lost:
    
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0100, code lost:
    
        r8 = -1;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e7, code lost:
    
        r24 = r1;
        r25 = r6;
        r26 = r7;
        g(r12.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0202, code lost:
    
        r25 = r6;
        r1 = new int[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        if (r41 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0208, code lost:
    
        if (r25 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0210, code lost:
    
        if (r34.f.isEmpty() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r41 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0212, code lost:
    
        r2 = r34.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0219, code lost:
    
        if (r2.size() <= 1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021b, code lost:
    
        r4 = r25;
        defpackage.aqjn.M(r2, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.AnonymousClass3());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0228, code lost:
    
        r2 = r34.f;
        r3 = r2.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022f, code lost:
    
        if (r6 >= r3) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0231, code lost:
    
        r7 = (defpackage.asd) r2.get(r6);
        e(r34, r7, r45 - l(r1, r7));
        k(r7);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0246, code lost:
    
        defpackage.aqil.C(r1, 0, r1.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0253, code lost:
    
        if (r34.g.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r9 = r9 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0255, code lost:
    
        r2 = r34.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025c, code lost:
    
        if (r2.size() <= 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025e, code lost:
    
        defpackage.aqjn.M(r2, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.AnonymousClass1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0266, code lost:
    
        r2 = r34.g;
        r3 = r2.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026d, code lost:
    
        if (r6 >= r3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026f, code lost:
    
        r7 = (defpackage.asd) r2.get(r6);
        e(r34, r7, (r46 + l(r1, r7)) - r7.g());
        k(r7);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0289, code lost:
    
        defpackage.aqil.C(r1, 0, r1.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028d, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0290, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r42 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0296, code lost:
    
        r2 = r34.k;
        r3 = r2.b;
        r2 = r2.a;
        r4 = r2.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x029f, code lost:
    
        if (r4 < 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a1, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a2, code lost:
    
        r9 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ac, code lost:
    
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ae, code lost:
    
        r12 = 8 - ((~(r7 - r4)) >>> 31);
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b8, code lost:
    
        if (r13 >= r12) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02be, code lost:
    
        if ((r9 & 255) >= 128) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02c0, code lost:
    
        r14 = r3[(r7 << 3) + r13];
        r15 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r34.j.a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r44 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02cd, code lost:
    
        if (r15 != null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02cf, code lost:
    
        r31 = r2;
        r32 = r3;
        r23 = r4;
        r41 = r11;
        r2 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03fc, code lost:
    
        r9 = r9 >> r2;
        r13 = r13 + 1;
        r11 = r41;
        r5 = r43;
        r4 = r23;
        r2 = r31;
        r3 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02df, code lost:
    
        r31 = r2;
        r2 = r39.a(r14);
        r32 = r3;
        r3 = java.lang.Math.min(r5, r15.e);
        r15.e = r3;
        r3 = java.lang.Math.min(r5 - r3, r15.d);
        r15.d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fc, code lost:
    
        if (r2 != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fe, code lost:
    
        r2 = r15.a;
        r3 = r2.length;
        r5 = 0;
        r23 = false;
        r24 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0306, code lost:
    
        if (r5 >= r3) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0308, code lost:
    
        r25 = r3;
        r3 = r2[r5];
        r26 = r24 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x030e, code lost:
    
        if (r3 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0314, code lost:
    
        if (r3.f() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0316, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0318, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036a, code lost:
    
        r5 = r5 + 1;
        r3 = r25;
        r24 = r26;
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x031d, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x032b, code lost:
    
        if (((java.lang.Boolean) r3.a.a()).booleanValue() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x032d, code lost:
    
        r3.d();
        r15.a[r24] = null;
        r34.a.remove(r3);
        r2 = r34.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r13 = r34.j;
        r14 = r13.b;
        r13 = r13.a;
        r15 = r13.length - 2;
        r41 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033d, code lost:
    
        if (r2 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x033f, code lost:
    
        defpackage.cwy.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0345, code lost:
    
        if (r3.d == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0347, code lost:
    
        r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x034e, code lost:
    
        if (r3.f() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0350, code lost:
    
        r34.a.add(r3);
        r2 = r34.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0357, code lost:
    
        if (r2 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0359, code lost:
    
        defpackage.cwy.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r15 < 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x035d, code lost:
    
        r3.d();
        r15.a[r24] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0367, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0375, code lost:
    
        if (r23 != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0377, code lost:
    
        g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x037a, code lost:
    
        r23 = r4;
        r41 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03fa, code lost:
    
        r2 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0380, code lost:
    
        r5 = r15.b;
        r5.getClass();
        r41 = r11;
        r23 = r4;
        r3 = r40.d(r2, r3, r15.e, r5.a);
        r3.q();
        r4 = r15.a;
        r5 = r4.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03a4, code lost:
    
        if (r11 >= r5) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03a6, code lost:
    
        r24 = r4[r11];
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03aa, code lost:
    
        if (r24 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03ac, code lost:
    
        r4 = r24.g();
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03b3, code lost:
    
        if (r4 != true) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03cb, code lost:
    
        r15.a(r3, r47, r48, r45, r46, r15.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03e0, code lost:
    
        if (r2 >= r34.e) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03e2, code lost:
    
        r34.h.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r11 = r13[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03e8, code lost:
    
        r34.i.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03b8, code lost:
    
        r11 = r11 + 1;
        r5 = r24;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03b6, code lost:
    
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bf, code lost:
    
        if (r6 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c5, code lost:
    
        if (r2 != r6.a(r14)) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c7, code lost:
    
        g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (((((~r11) << 7) & r11) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03ee, code lost:
    
        r31 = r2;
        r32 = r3;
        r23 = r4;
        r41 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x040b, code lost:
    
        r8 = r39;
        r31 = r2;
        r32 = r3;
        r23 = r4;
        r41 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0419, code lost:
    
        if (r12 != 8) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x041b, code lost:
    
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x042a, code lost:
    
        if (r7 == r4) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x042c, code lost:
    
        r7 = r7 + 1;
        r11 = r41;
        r5 = r43;
        r2 = r31;
        r3 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0442, code lost:
    
        if (r34.h.isEmpty() != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        r1 = 8 - ((~(r8 - r15)) >>> 31);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0444, code lost:
    
        r2 = r34.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044b, code lost:
    
        if (r2.size() <= 1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x044d, code lost:
    
        defpackage.aqjn.M(r2, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.AnonymousClass4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0455, code lost:
    
        r2 = r34.h;
        r3 = r2.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x045c, code lost:
    
        if (r4 >= r3) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x045e, code lost:
    
        r5 = (defpackage.asd) r2.get(r4);
        r6 = r34.j.a(r5.e());
        r6.getClass();
        r6 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r6;
        r7 = l(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0477, code lost:
    
        if (r42 == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0479, code lost:
    
        r9 = i((defpackage.asd) defpackage.aqjn.X(r38));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0486, code lost:
    
        r5.o(r9 - r7, r6.c, r36, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0490, code lost:
    
        if (r41 == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r2 >= r1) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0492, code lost:
    
        k(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0495, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0484, code lost:
    
        r9 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0498, code lost:
    
        r7 = r36;
        r10 = r37;
        defpackage.aqil.C(r1, 0, r1.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04ab, code lost:
    
        if (r34.i.isEmpty() != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04ad, code lost:
    
        r2 = r34.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04b4, code lost:
    
        if (r2.size() <= 1) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04b6, code lost:
    
        defpackage.aqjn.M(r2, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.AnonymousClass2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04be, code lost:
    
        r2 = r34.i;
        r3 = r2.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04c5, code lost:
    
        if (r11 >= r3) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04c7, code lost:
    
        r4 = (defpackage.asd) r2.get(r11);
        r5 = r34.j.a(r4.e());
        r5.getClass();
        r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r5;
        r6 = l(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04e0, code lost:
    
        if (r42 == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04e2, code lost:
    
        r8 = i((defpackage.asd) defpackage.aqjn.ac(r38));
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04f4, code lost:
    
        r4.o(r8 + r6, r5.c, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04fa, code lost:
    
        if (r41 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04fc, code lost:
    
        k(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if ((r11 & 255) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04ff, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04ed, code lost:
    
        r8 = r5.g - r4.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0502, code lost:
    
        r1 = r34.h;
        java.util.Collections.reverse(r1);
        r38.addAll(0, r1);
        r38.addAll(r34.i);
        r34.f.clear();
        r34.g.clear();
        r34.h.clear();
        r34.i.clear();
        r34.k.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x052b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04a1, code lost:
    
        r7 = r36;
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r24 = r13;
        r23 = r14;
        r34.k.j(r14[(r8 << 3) + r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x041e, code lost:
    
        r8 = r39;
        r31 = r2;
        r32 = r3;
        r41 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0438, code lost:
    
        r8 = r39;
        r41 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0226, code lost:
    
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x024b, code lost:
    
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x028f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0292, code lost:
    
        r6 = r25;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x005b, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0051, code lost:
    
        r9 = r9 << 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0045, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r11 = r11 >> 8;
        r2 = r2 + 1;
        r14 = r23;
        r13 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r24 = r13;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        r24 = r13;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r1 != 8) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r8 == r15) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        r8 = r8 + 1;
        r14 = r23;
        r13 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        r24 = r13;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        r1 = r38.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r2 >= r1) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r12 = (defpackage.asd) r3.get(r2);
        r34.k.l(r12.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (h(r12) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        r13 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r34.j.a(r12.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (r6 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        r8 = r6.a(r12.e());
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r8 != (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        if (r14 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        r14 = -1;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        if (r13 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010f, code lost:
    
        r13 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b();
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.b(r13, r12, r47, r48, r45, r46);
        r34.j.j(r12.e(), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        if (r12.a() == r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        if (r14 == (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        r34.f.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e0, code lost:
    
        r24 = r1;
        r25 = r6;
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f4, code lost:
    
        r2 = r2 + 1;
        r3 = r38;
        r1 = r24;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
    
        r34.g.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
    
        r14 = r12.k(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014e, code lost:
    
        if (r12.p() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        r11 = defpackage.dre.b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0159, code lost:
    
        j(r12, r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015c, code lost:
    
        if (r8 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        r8 = r13.a;
        r11 = r8.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        if (r12 >= r11) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0164, code lost:
    
        r13 = r8[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0166, code lost:
    
        if (r13 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0168, code lost:
    
        r13.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        r11 = defpackage.dre.a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
    
        if (r41 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.b(r13, r12, r47, r48, r45, r46);
        r11 = r13.a;
        r14 = r11.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0183, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r15 >= r14) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        r1 = r11[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r9 = r35;
        r7 = r34.e;
        r11 = (defpackage.asd) defpackage.aqjn.Z(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
    
        r3 = r1.b;
        r25 = r6;
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019a, code lost:
    
        if (defpackage.a.bB(r3, 9223372034707292159L) != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019c, code lost:
    
        r1.b = defpackage.dre.d(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a7, code lost:
    
        r15 = r15 + 1;
        r1 = r24;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a3, code lost:
    
        r25 = r6;
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r11 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b4, code lost:
    
        r25 = r6;
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        if (r8 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        r1 = r13.a;
        r3 = r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        if (r4 >= r3) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        r6 = r1[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c2, code lost:
    
        if (r6 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c8, code lost:
    
        if (r6.f() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ca, code lost:
    
        r34.a.remove(r6);
        r7 = r34.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d1, code lost:
    
        if (r7 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r11 = r11.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r35, int r36, int r37, java.util.List r38, defpackage.arv r39, defpackage.asg r40, boolean r41, boolean r42, int r43, boolean r44, int r45, int r46, defpackage.arwe r47, defpackage.clc r48) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.c(int, int, int, java.util.List, arv, asg, boolean, boolean, int, boolean, int, int, arwe, clc):void");
    }

    public final void d() {
        f();
        this.d = null;
        this.e = -1;
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends cga.c implements cwx {
        public LazyLayoutItemAnimator a;

        public a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.a = lazyLayoutItemAnimator;
        }

        @Override // cga.c
        public final void dQ() {
            this.a.b = this;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && d.F(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.cwx
        public final void r(cnt cntVar) {
            List list = this.a.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arl arlVar = (arl) list.get(i);
                cof cofVar = arlVar.d;
                if (cofVar != null) {
                    long j = arlVar.c;
                    int a = dre.a(j);
                    int b = dre.b(j);
                    float a2 = a - dre.a(cofVar.k);
                    float b2 = b - dre.b(r6);
                    ((cnr.AnonymousClass1) cntVar.q()).a.e(a2, b2);
                    float f = -a2;
                    float f2 = -b2;
                    try {
                        coh.a(cntVar, cofVar);
                    } finally {
                        ((cnr.AnonymousClass1) cntVar.q()).a.e(f, f2);
                    }
                }
            }
            cntVar.p();
        }

        @Override // cga.c
        public final void s() {
            this.a.d();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
        }

        @Override // defpackage.cwx
        public final /* synthetic */ void t() {
        }
    }
}
