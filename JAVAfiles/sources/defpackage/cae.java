package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cae {
    public final cab a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public tx s;
    private final bxr t;
    private final bxr u;
    private final bxr v;
    private byz w;
    private tx x;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static final List a(cae caeVar, int i, cae caeVar2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            arnv arnvVar;
            int f;
            boolean z5;
            boolean z6;
            int i2;
            int i3;
            int i4;
            int j = caeVar.j(i);
            int i5 = i + j;
            int b = caeVar.b(i);
            int b2 = caeVar.b(i5);
            int i6 = b2 - b;
            if (i >= 0 && cad.q(caeVar.b, caeVar.h(i))) {
                z4 = true;
            } else {
                z4 = false;
            }
            caeVar2.D(j);
            caeVar2.E(i6, caeVar2.o);
            if (caeVar.f < i5) {
                caeVar.F(i5);
            }
            if (caeVar.j < b2) {
                caeVar.G(b2, i5);
            }
            int[] iArr = caeVar2.b;
            int i7 = caeVar2.o;
            aqil.x(caeVar.b, iArr, i7 * 5, i * 5, i5 * 5);
            Object[] objArr = caeVar2.c;
            int i8 = caeVar2.h;
            aqil.y(caeVar.c, objArr, i8, b, b2);
            int i9 = caeVar2.q;
            cad.p(iArr, i7, i9);
            int i10 = i7 - i;
            int i11 = i7 + j;
            int c = i8 - caeVar2.c(iArr, i7);
            int i12 = caeVar2.l;
            int i13 = caeVar2.k;
            int length = objArr.length;
            boolean z7 = z4;
            int i14 = i12;
            int i15 = i7;
            while (i15 < i11) {
                if (i15 != i7) {
                    i2 = i11;
                    cad.p(iArr, i15, cad.h(iArr, i15) + i10);
                } else {
                    i2 = i11;
                }
                int c2 = caeVar2.c(iArr, i15) + c;
                if (i14 < i15) {
                    i3 = i7;
                    i4 = 0;
                } else {
                    i3 = i7;
                    i4 = caeVar2.j;
                }
                cad.m(iArr, i15, cae.V(c2, i4, i13, length));
                if (i15 == i14) {
                    i14++;
                }
                i15++;
                i7 = i3;
                i11 = i2;
            }
            int i16 = i7;
            int i17 = i11;
            caeVar2.l = i14;
            int e = cad.e(caeVar.d, i, caeVar.f());
            int e2 = cad.e(caeVar.d, i5, caeVar.f());
            if (e < e2) {
                ArrayList arrayList = caeVar.d;
                ArrayList arrayList2 = new ArrayList(e2 - e);
                for (int i18 = e; i18 < e2; i18++) {
                    bwa bwaVar = (bwa) arrayList.get(i18);
                    bwaVar.a += i10;
                    arrayList2.add(bwaVar);
                }
                caeVar2.d.addAll(cad.e(caeVar2.d, caeVar2.o, caeVar2.f()), arrayList2);
                arrayList.subList(e, e2).clear();
                arnvVar = arrayList2;
            } else {
                arnvVar = arnv.a;
            }
            if (!arnvVar.isEmpty()) {
                HashMap hashMap = caeVar.e;
                HashMap hashMap2 = caeVar2.e;
                if (hashMap != null && hashMap2 != null) {
                    int size = arnvVar.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        bwa bwaVar2 = (bwa) arnvVar.get(i19);
                        bxq bxqVar = (bxq) hashMap.get(bwaVar2);
                        if (bxqVar != null) {
                            hashMap.remove(bwaVar2);
                            hashMap2.put(bwaVar2, bxqVar);
                        }
                    }
                }
            }
            int i20 = caeVar2.q;
            if (caeVar2.s(i9) != null) {
                int i21 = i20 + 1;
                int i22 = caeVar2.o;
                while (i21 < i22) {
                    i21 += cad.c(caeVar2.b, i21);
                }
                throw null;
            }
            int l = caeVar.l(i);
            if (z3) {
                if (z) {
                    if (l >= 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        caeVar.L();
                        caeVar.x(l - caeVar.o);
                        caeVar.L();
                    }
                    caeVar.x(i - caeVar.o);
                    z5 = caeVar.T();
                    if (z6) {
                        caeVar.J();
                        caeVar.W();
                        caeVar.J();
                        caeVar.W();
                    }
                } else {
                    boolean U = caeVar.U(i, j);
                    caeVar.I(b, i6, i - 1);
                    z5 = U;
                }
                if (z5) {
                    bwp.i("Unexpectedly removed anchors");
                }
            }
            int i23 = caeVar2.n;
            if (cad.v(iArr, i16)) {
                f = 1;
            } else {
                f = cad.f(iArr, i16);
            }
            caeVar2.n = i23 + f;
            if (z2) {
                caeVar2.o = i17;
                caeVar2.h = i8 + i6;
            }
            if (z7) {
                caeVar2.P(i9);
            }
            return arnvVar;
        }
    }

    public cae(cab cabVar) {
        this.a = cabVar;
        this.b = cabVar.a;
        this.c = cabVar.c;
        this.d = cabVar.h;
        this.e = cabVar.i;
        this.s = cabVar.j;
        int i = cabVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = cabVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.t = new bxr();
        this.u = new bxr();
        this.v = new bxr();
        this.p = i;
        this.q = -1;
    }

    public static final int V(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    public static /* synthetic */ void X(cae caeVar) {
        int i = caeVar.q;
        int h = caeVar.h(i);
        if (!cad.t(caeVar.b, h)) {
            int[] iArr = caeVar.b;
            int i2 = (h * 5) + 1;
            iArr[i2] = iArr[i2] | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
            if (!cad.r(iArr, h)) {
                caeVar.P(caeVar.l(i));
            }
        }
    }

    private final int aa(int[] iArr, int i) {
        return c(iArr, i) + cad.a(iArr[(i * 5) + 1] >> 29);
    }

    private final int ab(int[] iArr, int i) {
        return ac(cad.h(iArr, h(i)));
    }

    private final int ac(int i) {
        if (i > -2) {
            return i;
        }
        return f() + i + 2;
    }

    private final int ad(int i, int i2) {
        if (i < i2) {
            return i;
        }
        return -((f() - i) + 2);
    }

    private final void ae() {
        this.u.e((e() - this.g) - this.p);
    }

    private final void af(int i, Object obj, boolean z, Object obj2) {
        int c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        bxr bxrVar = this.v;
        int i7 = this.q;
        int i8 = this.m;
        bxrVar.e(this.n);
        if (i8 > 0) {
            int i9 = this.o;
            int c2 = c(this.b, h(i9));
            D(1);
            this.h = c2;
            this.i = c2;
            int h = h(i9);
            Object obj3 = bwj.a.a;
            if (obj != obj3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!z && obj2 != obj3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i10 = this.k;
            int i11 = this.j;
            int length = this.c.length;
            int V = V(c2, i11, i10, length);
            if (V >= 0 && this.l < i9) {
                V = -(((length - i10) - V) + 1);
            }
            int[] iArr = this.b;
            int i12 = this.q;
            if (true != z) {
                i4 = 0;
            } else {
                i4 = 1073741824;
            }
            if (obj != obj3) {
                i5 = 536870912;
            } else {
                i5 = 0;
            }
            if (1 != i3) {
                i6 = 0;
            } else {
                i6 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            }
            int i13 = h * 5;
            iArr[i13] = i;
            iArr[i13 + 1] = i6 | i5 | i4;
            iArr[i13 + 2] = i12;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = V;
            int i14 = (z ? 1 : 0) + i2 + i3;
            if (i14 > 0) {
                E(i14, i9);
                Object[] objArr = this.c;
                int i15 = this.h;
                if (z) {
                    objArr[i15] = obj2;
                    i15++;
                }
                if (i2 != 0) {
                    objArr[i15] = obj;
                    i15++;
                }
                if (i3 != 0) {
                    objArr[i15] = obj2;
                    i15++;
                }
                this.h = i15;
            }
            this.n = 0;
            c = i9 + 1;
            this.q = i9;
            this.o = c;
            if (i7 >= 0 && s(i7) != null) {
                throw null;
            }
        } else {
            this.t.e(i7);
            ae();
            int i16 = this.o;
            int h2 = h(i16);
            if (!d.F(obj2, bwj.a.a)) {
                if (z) {
                    Q(this.o, obj2);
                } else {
                    O(obj2);
                }
            }
            this.h = n(this.b, h2);
            this.i = c(this.b, h(this.o + 1));
            this.n = cad.f(this.b, h2);
            this.q = i16;
            this.o = i16 + 1;
            c = i16 + cad.c(this.b, h2);
        }
        this.p = c;
    }

    private static final int ag(int i, int i2, int i3) {
        if (i < 0) {
            return (i3 - i2) + i + 1;
        }
        return i;
    }

    private final void ah() {
        this.p = (e() - this.g) - this.u.c();
    }

    private final void ai(Object obj) {
        if (this.m > 0) {
            E(1, this.q);
        }
        Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.i) {
            bwp.i("Writing to an invalid slot");
        }
        this.c[d(this.h - 1)] = obj;
    }

    public final void A() {
        if (this.m <= 0) {
            byy.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.v.b != this.t.b) {
                bwp.i("startGroup/endGroup mismatch while inserting");
            }
            ah();
        }
    }

    public final void B(int i) {
        if (this.m > 0) {
            bwp.i("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                bwp.i(defpackage.a.bU(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.o;
            int i4 = this.h;
            int i5 = this.i;
            this.o = i;
            L();
            this.o = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void C(int i, int i2, int i3) {
        int ad = ad(i, this.f);
        while (i3 < i2) {
            cad.p(this.b, h(i3), ad);
            int c = cad.c(this.b, h(i3)) + i3;
            C(i3, c, i3 + 1);
            i3 = c;
        }
    }

    public final void D(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.o;
            F(i3);
            int i4 = this.f;
            int i5 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length + length, i6 + i), 32);
                int i8 = max * 5;
                int i9 = max - i6;
                int[] iArr2 = new int[i8];
                aqil.x(iArr, iArr2, 0, 0, i4 * 5);
                aqil.x(iArr, iArr2, (i4 + i9) * 5, (i5 + i4) * 5, length * 5);
                this.b = iArr2;
                i5 = i9;
            }
            int i10 = this.p;
            if (i10 >= i4) {
                this.p = i10 + i;
            }
            int i11 = i4 + i;
            this.f = i11;
            this.g = i5 - i;
            if (i6 > 0) {
                i2 = b(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.l >= i4) {
                i7 = this.j;
            }
            int V = V(i2, i7, this.k, this.c.length);
            for (int i12 = i4; i12 < i11; i12++) {
                cad.m(this.b, i12, V);
            }
            int i13 = this.l;
            if (i13 >= i4) {
                this.l = i13 + i;
            }
        }
    }

    public final void E(int i, int i2) {
        if (i > 0) {
            G(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                aqil.y(objArr, objArr2, 0, 0, i3);
                aqil.y(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.i;
            if (i8 >= i3) {
                this.i = i8 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r7.b;
        r3 = r8 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
        r6 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r8 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        defpackage.aqil.x(r2, r2, r6, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        defpackage.aqil.x(r2, r2, r5, r4 + r5, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(int r8) {
        /*
            r7 = this;
            int r0 = r7.g
            int r1 = r7.f
            if (r1 == r8) goto L9e
            java.util.ArrayList r2 = r7.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = r7.g
            int r3 = r7.e()
            int r3 = r3 - r2
            if (r1 >= r8) goto L39
            java.util.ArrayList r2 = r7.d
            int r2 = defpackage.cad.e(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r7.d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r7.d
            java.lang.Object r4 = r4.get(r2)
            bwa r4 = (defpackage.bwa) r4
            int r5 = r4.a
            if (r5 >= 0) goto L5b
            int r5 = r5 + r3
            if (r5 >= r8) goto L5b
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            java.util.ArrayList r2 = r7.d
            int r2 = defpackage.cad.e(r2, r8, r3)
        L3f:
            java.util.ArrayList r4 = r7.d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r7.d
            java.lang.Object r4 = r4.get(r2)
            bwa r4 = (defpackage.bwa) r4
            int r5 = r4.a
            if (r5 < 0) goto L5b
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3f
        L5b:
            if (r0 <= 0) goto L71
            int[] r2 = r7.b
            int r3 = r8 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            int r6 = r3 + r4
            if (r8 >= r1) goto L6d
            defpackage.aqil.x(r2, r2, r6, r3, r5)
            goto L71
        L6d:
            int r4 = r4 + r5
            defpackage.aqil.x(r2, r2, r5, r4, r6)
        L71:
            if (r8 >= r1) goto L75
            int r1 = r8 + r0
        L75:
            int r2 = r7.e()
            if (r1 >= r2) goto L7d
            r3 = 1
            goto L7e
        L7d:
            r3 = 0
        L7e:
            defpackage.bwp.m(r3)
        L81:
            if (r1 >= r2) goto L9e
            int[] r3 = r7.b
            int r3 = defpackage.cad.h(r3, r1)
            int r4 = r7.ac(r3)
            int r4 = r7.ad(r4, r8)
            if (r4 == r3) goto L98
            int[] r3 = r7.b
            defpackage.cad.p(r3, r1, r4)
        L98:
            int r1 = r1 + 1
            if (r1 != r8) goto L81
            int r1 = r1 + r0
            goto L81
        L9e:
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cae.F(int):void");
    }

    public final void G(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                aqil.y(objArr, objArr, i + i3, i, i4);
            } else {
                aqil.y(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, f());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int h = h(min);
                int h2 = h(i5);
                int i6 = this.f;
                while (h < h2) {
                    int b = cad.b(this.b, h);
                    if (b < 0) {
                        bwp.i("Unexpected anchor value, expected a positive anchor");
                    }
                    cad.m(this.b, h, -((length - b) + 1));
                    h++;
                    if (h == i6) {
                        h += this.g;
                    }
                }
            } else {
                int h3 = h(i5);
                int h4 = h(min);
                while (h3 < h4) {
                    int b2 = cad.b(this.b, h3);
                    if (b2 >= 0) {
                        bwp.i("Unexpected anchor value, expected a negative anchor");
                    }
                    cad.m(this.b, h3, b2 + length + 1);
                    h3++;
                    if (h3 == this.f) {
                        h3 += this.g;
                    }
                }
            }
            this.l = min;
        }
        this.j = i;
    }

    public final void H() {
        boolean z;
        byz byzVar = this.w;
        if (byzVar != null) {
            while (byzVar.c()) {
                int a2 = byzVar.a();
                int h = h(a2);
                int i = a2 + 1;
                int j = j(a2) + a2;
                while (true) {
                    if (i < j) {
                        if (cad.q(this.b, h(i))) {
                            z = true;
                            break;
                        }
                        i += j(i);
                    } else {
                        z = false;
                        break;
                    }
                }
                if (cad.r(this.b, h) != z) {
                    int[] iArr = this.b;
                    int i2 = (h * 5) + 1;
                    if (z) {
                        iArr[i2] = iArr[i2] | VCardConfig.FLAG_APPEND_TYPE_PARAM;
                    } else {
                        iArr[i2] = iArr[i2] & (-67108865);
                    }
                    int l = l(a2);
                    if (l >= 0) {
                        byzVar.b(l);
                    }
                }
            }
        }
    }

    public final void I(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            G(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            aqil.d(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final void J() {
        int i = this.p;
        this.o = i;
        this.h = c(this.b, h(i));
    }

    public final void K(int i, Object obj, Object obj2) {
        af(i, obj, false, obj2);
    }

    public final void L() {
        if (this.m != 0) {
            bwp.i("Key must be supplied when inserting");
        }
        Object obj = bwj.a.a;
        af(0, obj, false, obj);
    }

    public final void M(int i, Object obj) {
        af(i, obj, false, bwj.a.a);
    }

    public final void N(int i, Object obj) {
        af(i, obj, true, bwj.a.a);
    }

    public final void O(Object obj) {
        int h = h(this.o);
        if (!cad.s(this.b, h)) {
            bwp.i("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(aa(this.b, h))] = obj;
    }

    public final void P(int i) {
        if (i >= 0) {
            byz byzVar = this.w;
            if (byzVar == null) {
                byzVar = new byz(null);
                this.w = byzVar;
            }
            byzVar.b(i);
        }
    }

    public final void Q(int i, Object obj) {
        int h = h(i);
        int[] iArr = this.b;
        if (h >= iArr.length || !cad.v(iArr, h)) {
            bwp.i(defpackage.a.cb(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, h))] = obj;
    }

    public final boolean R(int i, int i2) {
        int e;
        int j;
        if (i2 == this.q) {
            e = this.p;
        } else {
            if (i2 > this.t.b(0)) {
                j = j(i2);
            } else {
                bxr bxrVar = this.t;
                int i3 = bxrVar.b;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (bxrVar.a[i4] == i2) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    j = j(i2);
                } else {
                    e = (e() - this.g) - this.u.a[i4];
                }
            }
            e = j + i2;
        }
        if (i <= i2 || i >= e) {
            return false;
        }
        return true;
    }

    public final boolean S(int i) {
        return cad.v(this.b, h(i));
    }

    public final boolean T() {
        if (this.m != 0) {
            bwp.i("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int c = c(this.b, h(i));
        int m = m();
        if (s(this.q) != null && r(i) != null) {
            throw null;
        }
        byz byzVar = this.w;
        if (byzVar != null) {
            while (byzVar.c() && ((Number) aqjn.X(byzVar.a)).intValue() >= i) {
                byzVar.a();
            }
        }
        boolean U = U(i, this.o - i);
        I(c, this.h - c, i - 1);
        this.o = i;
        this.h = i2;
        this.n -= m;
        return U;
    }

    public final boolean U(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            F(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int e = cad.e(this.d, i3, e() - this.g);
                if (e >= this.d.size()) {
                    e--;
                }
                int i4 = e + 1;
                int i5 = 0;
                while (e >= 0) {
                    bwa bwaVar = (bwa) this.d.get(e);
                    int a2 = a(bwaVar);
                    if (a2 < i) {
                        break;
                    }
                    if (a2 < i3) {
                        bwaVar.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = e + 1;
                        }
                        i4 = e;
                    }
                    e--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.f = i;
            this.g += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = Math.max(i, i6 - i2);
            }
            int i7 = this.p;
            if (i7 >= this.f) {
                this.p = i7 - i2;
            }
            int i8 = this.q;
            if (i8 >= 0 && cad.r(this.b, h(i8))) {
                P(i8);
            }
        }
        return z;
    }

    public final void W() {
        int i;
        int h;
        ux uxVar;
        int i2 = this.m;
        int i3 = this.o;
        int i4 = this.p;
        int i5 = this.q;
        int h2 = h(i5);
        int i6 = i3 - i5;
        int i7 = this.n;
        boolean v = cad.v(this.b, h2);
        int i8 = 0;
        if (i2 > 0) {
            tx txVar = this.x;
            if (txVar != null && (uxVar = (ux) txVar.a(i5)) != null) {
                Object[] objArr = uxVar.a;
                int i9 = uxVar.b;
                for (int i10 = 0; i10 < i9; i10++) {
                    ai(objArr[i10]);
                }
            }
            cad.n(this.b, h2, i6);
            cad.o(this.b, h2, i7);
            bxr bxrVar = this.v;
            if (true == v) {
                i7 = 1;
            }
            this.n = bxrVar.c() + i7;
            int ab = ab(this.b, i5);
            this.q = ab;
            if (ab < 0) {
                h = f();
            } else {
                h = h(ab + 1);
            }
            if (h >= 0) {
                i8 = c(this.b, h);
            }
            this.h = i8;
            this.i = i8;
            return;
        }
        if (i3 != i4) {
            bwp.i("Expected to be at the end of a group");
        }
        int c = cad.c(this.b, h2);
        int f = cad.f(this.b, h2);
        cad.n(this.b, h2, i6);
        cad.o(this.b, h2, i7);
        int c2 = this.t.c();
        ah();
        this.q = c2;
        int ab2 = ab(this.b, i5);
        int c3 = this.v.c();
        this.n = c3;
        if (ab2 == c2) {
            if (!v) {
                i8 = i7 - f;
            }
            this.n = c3 + i8;
            return;
        }
        int i11 = i6 - c;
        if (v) {
            i = 0;
        } else {
            i = i7 - f;
        }
        if (i11 != 0 || i != 0) {
            while (ab2 != 0 && ab2 != c2) {
                if (i == 0) {
                    if (i11 == 0) {
                        break;
                    } else {
                        i = 0;
                    }
                }
                int h3 = h(ab2);
                if (i11 != 0) {
                    cad.n(this.b, h3, cad.c(this.b, h3) + i11);
                }
                if (i != 0) {
                    int[] iArr = this.b;
                    cad.o(iArr, h3, cad.f(iArr, h3) + i);
                }
                if (true == cad.v(this.b, h3)) {
                    i = 0;
                }
                ab2 = ab(this.b, ab2);
            }
            i8 = i;
        }
        this.n += i8;
    }

    public final void Y(cab cabVar, int i) {
        boolean z;
        int i2;
        if (this.m > 0) {
            z = true;
        } else {
            z = false;
        }
        bwp.m(z);
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int c = cad.c(cabVar.a, 0);
                int i3 = cabVar.b;
                if (c == i3) {
                    int[] iArr = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap hashMap = this.e;
                    tx txVar = this.s;
                    int[] iArr2 = cabVar.a;
                    Object[] objArr2 = cabVar.c;
                    int i4 = cabVar.d;
                    HashMap hashMap2 = cabVar.i;
                    tx txVar2 = cabVar.j;
                    this.b = iArr2;
                    this.c = objArr2;
                    this.d = cabVar.h;
                    this.f = i3;
                    this.g = (iArr2.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = hashMap2;
                    this.s = txVar2;
                    cabVar.g(iArr, 0, objArr, 0, arrayList, hashMap, txVar);
                    return;
                }
            }
            i2 = 0;
        } else {
            i2 = i;
        }
        cae c2 = cabVar.c();
        try {
            a.a(c2, i2, this, true, true, false);
            c2.z(true);
        } catch (Throwable th) {
            c2.z(false);
            throw th;
        }
    }

    public final void Z(Object obj) {
        if (this.m > 0 && this.h != this.j) {
            tx txVar = this.x;
            byte[] bArr = null;
            if (txVar == null) {
                txVar = new tx((byte[]) null);
            }
            this.x = txVar;
            int i = this.q;
            Object a2 = txVar.a(i);
            if (a2 == null) {
                a2 = new ux(bArr);
                txVar.f(i, a2);
            }
            ((ux) a2).d(obj);
            return;
        }
        ai(obj);
    }

    public final int a(bwa bwaVar) {
        int i = bwaVar.a;
        if (i < 0) {
            return f() + i;
        }
        return i;
    }

    public final int b(int i) {
        return c(this.b, h(i));
    }

    public final int c(int[] iArr, int i) {
        if (i >= e()) {
            return this.c.length - this.k;
        }
        return ag(cad.b(iArr, i), this.k, this.c.length);
    }

    public final int d(int i) {
        if (i < this.j) {
            return i;
        }
        return i + this.k;
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.g;
    }

    public final int g() {
        return this.c.length - this.k;
    }

    public final int h(int i) {
        if (i < this.f) {
            return i;
        }
        return i + this.g;
    }

    public final int i(int i) {
        return cad.d(this.b, h(i));
    }

    public final int j(int i) {
        return cad.c(this.b, h(i));
    }

    public final int k(int i) {
        return cad.f(this.b, h(i));
    }

    public final int l(int i) {
        return ab(this.b, i);
    }

    public final int m() {
        int i = this.o;
        int h = h(i);
        int c = i + cad.c(this.b, h);
        this.o = c;
        this.h = c(this.b, h(c));
        if (cad.v(this.b, h)) {
            return 1;
        }
        return cad.f(this.b, h);
    }

    public final int n(int[] iArr, int i) {
        if (i >= e()) {
            return this.c.length - this.k;
        }
        return ag(cad.j(iArr, i), this.k, this.c.length);
    }

    public final int o(int i, int i2) {
        int n = n(this.b, h(i));
        int c = c(this.b, h(i + 1));
        int i3 = n + i2;
        if (i3 < n || i3 >= c) {
            bwp.i(defpackage.a.bU(i, i2, "Write to an invalid slot index ", " for group "));
        }
        return i3;
    }

    public final int p(int i) {
        return c(this.b, h(i + j(i)));
    }

    public final bwa q(int i) {
        ArrayList arrayList = this.d;
        int i2 = cad.i(arrayList, i, f());
        if (i2 < 0) {
            if (i > this.f) {
                i = -(f() - i);
            }
            bwa bwaVar = new bwa(i);
            arrayList.add(-(i2 + 1), bwaVar);
            return bwaVar;
        }
        return (bwa) arrayList.get(i2);
    }

    public final bwa r(int i) {
        if (i >= 0 && i < f()) {
            return cad.k(this.d, i, f());
        }
        return null;
    }

    public final bxq s(int i) {
        bwa r;
        HashMap hashMap = this.e;
        if (hashMap == null || (r = r(i)) == null) {
            return null;
        }
        return (bxq) hashMap.get(r);
    }

    public final Object t(int i) {
        int h = h(i);
        if (cad.s(this.b, h)) {
            return this.c[aa(this.b, h)];
        }
        return bwj.a.a;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.o + " end=" + this.p + " size = " + f() + " gap=" + this.f + '-' + (this.f + this.g) + ')';
    }

    public final Object u(int i) {
        int h = h(i);
        if (cad.u(this.b, h)) {
            return this.c[cad.g(this.b, h)];
        }
        return null;
    }

    public final Object v(int i) {
        int h = h(i);
        if (cad.v(this.b, h)) {
            return this.c[d(c(this.b, h))];
        }
        return null;
    }

    public final Object w(int i, int i2, Object obj) {
        int d = d(o(i, i2));
        Object[] objArr = this.c;
        Object obj2 = objArr[d];
        objArr[d] = obj;
        return obj2;
    }

    public final void x(int i) {
        if (i < 0) {
            bwp.i("Cannot seek backwards");
        }
        if (this.m > 0) {
            byy.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.o + i;
        if (i2 < this.q || i2 > this.p) {
            bwp.i("Cannot seek outside the current group (" + this.q + '-' + this.p + ')');
        }
        this.o = i2;
        int c = c(this.b, h(i2));
        this.h = c;
        this.i = c;
    }

    public final void y() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            ae();
        }
    }

    public final void z(boolean z) {
        this.r = true;
        if (z && this.t.f()) {
            F(f());
            G(this.c.length - this.k, this.f);
            int i = this.j;
            aqil.d(this.c, null, i, this.k + i);
            H();
        }
        cab cabVar = this.a;
        int[] iArr = this.b;
        int i2 = this.f;
        Object[] objArr = this.c;
        int i3 = this.j;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        tx txVar = this.s;
        if (!cabVar.f) {
            byy.a("Unexpected writer close()");
        }
        cabVar.f = false;
        cabVar.g(iArr, i2, objArr, i3, arrayList, hashMap, txVar);
    }
}
