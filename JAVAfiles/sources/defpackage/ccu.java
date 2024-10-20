package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccu<K, V> {
    public static final ccu a = new ccu(0, 0, new Object[0]);
    public Object[] b;
    private int c;
    private int d;
    private final cdg e;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<K, V> {
        public ccu a;
        public final int b;

        public a(ccu ccuVar, int i) {
            this.a = ccuVar;
            this.b = i;
        }
    }

    public ccu(int i, int i2, Object[] objArr, cdg cdgVar) {
        this.c = i;
        this.d = i2;
        this.e = cdgVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int bitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = bitCount + bitCount; i < length; i++) {
            bitCount += i(i).n();
        }
        return bitCount;
    }

    private final ccu o(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, cdg cdgVar) {
        if (i3 > 30) {
            return new ccu(0, 0, new Object[]{obj, obj2, obj3, obj4}, cdgVar);
        }
        int a2 = ccy.a(i, i3);
        int a3 = ccy.a(i2, i3);
        if (a2 != a3) {
            Object[] objArr = new Object[4];
            if (a2 < a3) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new ccu((1 << a2) | (1 << a3), 0, objArr, cdgVar);
        }
        return new ccu(0, 1 << a2, new Object[]{o(i, obj, obj2, i2, obj3, obj4, i3 + 5, cdgVar)}, cdgVar);
    }

    private final ccu p(int i, ccg ccgVar) {
        ccgVar.f(ccgVar.a() - 1);
        ccgVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e == ccgVar.a) {
            this.b = ccy.c(objArr, i);
            return this;
        }
        return new ccu(0, 0, ccy.c(objArr, i), ccgVar.a);
    }

    private final ccu q(int i, int i2, ccg ccgVar) {
        ccgVar.f(ccgVar.a() - 1);
        ccgVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e == ccgVar.a) {
            this.b = ccy.c(objArr, i);
            this.c ^= i2;
            return this;
        }
        return new ccu(i2 ^ this.c, this.d, ccy.c(objArr, i), ccgVar.a);
    }

    private final ccu r(ccu ccuVar, ccu ccuVar2, int i, int i2, cdg cdgVar) {
        if (ccuVar2 == null) {
            Object[] objArr = this.b;
            if (objArr.length == 1) {
                return null;
            }
            if (this.e == cdgVar) {
                this.b = ccy.d(objArr, i);
                this.d ^= i2;
            } else {
                return new ccu(this.c, i2 ^ this.d, ccy.d(objArr, i), cdgVar);
            }
        } else if (this.e == cdgVar || ccuVar != ccuVar2) {
            return s(i, ccuVar2, cdgVar);
        }
        return this;
    }

    private final ccu s(int i, ccu ccuVar, cdg cdgVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (ccuVar.b.length == 2 && ccuVar.d == 0) {
                ccuVar.c = this.d;
                return ccuVar;
            }
            length = 1;
        }
        if (this.e == cdgVar) {
            objArr[i] = ccuVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        copyOf.getClass();
        copyOf[i] = ccuVar;
        return new ccu(this.c, this.d, copyOf, cdgVar);
    }

    private final ccu t(int i, int i2, ccu ccuVar) {
        Object[] objArr = ccuVar.b;
        if (objArr.length == 2 && ccuVar.d == 0) {
            if (this.b.length == 1) {
                ccuVar.c = this.d;
                return ccuVar;
            }
            int b = b(i2);
            Object[] objArr2 = this.b;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            int length = objArr2.length;
            Object[] copyOf = Arrays.copyOf(objArr2, length + 1);
            copyOf.getClass();
            aqil.y(copyOf, copyOf, i + 2, i + 1, length);
            aqil.y(copyOf, copyOf, b + 2, b, i);
            copyOf[b] = obj;
            copyOf[b + 1] = obj2;
            return new ccu(this.c ^ i2, i2 ^ this.d, copyOf);
        }
        Object[] objArr3 = this.b;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2.getClass();
        copyOf2[i] = ccuVar;
        return new ccu(this.c, this.d, copyOf2);
    }

    private final Object u(int i) {
        return this.b[i];
    }

    private final Object v(int i) {
        return this.b[i + 1];
    }

    private final boolean w(Object obj) {
        arta A = arrn.A(arrn.B(0, this.b.length), 2);
        int i = A.a;
        int i2 = A.b;
        int i3 = A.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!d.F(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean x(ccu ccuVar) {
        if (this == ccuVar) {
            return true;
        }
        if (this.d != ccuVar.d || this.c != ccuVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != ccuVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean y(int i) {
        if ((i & this.d) != 0) {
            return true;
        }
        return false;
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, cdg cdgVar) {
        int i5;
        Object u = u(i);
        if (u != null) {
            i5 = u.hashCode();
        } else {
            i5 = 0;
        }
        ccu o = o(i5, u, v(i), i3, obj, obj2, i4 + 5, cdgVar);
        int c = c(i2);
        int i6 = c + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        aqil.K(objArr, objArr2, 0, i, 6);
        aqil.y(objArr, objArr2, i, i + 2, i6);
        objArr2[c - 1] = o;
        aqil.y(objArr, objArr2, c, i6, length);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int bitCount = Integer.bitCount((i - 1) & this.c);
        return bitCount + bitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount((i - 1) & this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        r11.a = t(r2, r0, r11.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (r11 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ccu.a d(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccu.d(int, java.lang.Object, java.lang.Object, int):ccu$a");
    }

    public final ccu e(int i, Object obj, Object obj2, int i2, ccg ccgVar) {
        ccu e;
        int a2 = 1 << ccy.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (d.F(obj, u(b))) {
                ccgVar.c = v(b);
                if (v(b) != obj2) {
                    int i3 = b + 1;
                    if (this.e == ccgVar.a) {
                        this.b[i3] = obj2;
                    } else {
                        ccgVar.d++;
                        Object[] objArr = this.b;
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        copyOf.getClass();
                        copyOf[i3] = obj2;
                        return new ccu(this.c, this.d, copyOf, ccgVar.a);
                    }
                }
            } else {
                ccgVar.f(ccgVar.a() + 1);
                cdg cdgVar = ccgVar.a;
                if (this.e == cdgVar) {
                    this.b = z(b, a2, i, obj, obj2, i2, cdgVar);
                    this.c ^= a2;
                    this.d |= a2;
                } else {
                    return new ccu(this.c ^ a2, this.d | a2, z(b, a2, i, obj, obj2, i2, cdgVar), cdgVar);
                }
            }
        } else if (y(a2)) {
            int c = c(a2);
            ccu i4 = i(c);
            if (i2 == 30) {
                arta A = arrn.A(arrn.B(0, i4.b.length), 2);
                int i5 = A.a;
                int i6 = A.b;
                int i7 = A.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!d.F(obj, i4.u(i5))) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    int i8 = i5 + 1;
                    ccgVar.c = i4.v(i5);
                    if (i4.e == ccgVar.a) {
                        i4.b[i8] = obj2;
                        e = i4;
                    } else {
                        ccgVar.d++;
                        Object[] objArr2 = i4.b;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2.getClass();
                        copyOf2[i8] = obj2;
                        e = new ccu(0, 0, copyOf2, ccgVar.a);
                    }
                }
                ccgVar.f(ccgVar.a() + 1);
                e = new ccu(0, 0, ccy.b(i4.b, 0, obj, obj2), ccgVar.a);
                break;
            }
            e = i4.e(i, obj, obj2, i2 + 5, ccgVar);
            if (i4 != e) {
                return s(c, e, ccgVar.a);
            }
        } else {
            ccgVar.f(ccgVar.a() + 1);
            cdg cdgVar2 = ccgVar.a;
            int b2 = b(a2);
            if (this.e == cdgVar2) {
                this.b = ccy.b(this.b, b2, obj, obj2);
                this.c |= a2;
            } else {
                return new ccu(this.c | a2, this.d, ccy.b(this.b, b2, obj, obj2), cdgVar2);
            }
        }
        return this;
    }

    public final ccu f(ccu ccuVar, int i, cde cdeVar, ccg ccgVar) {
        ccu ccuVar2;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        ccu ccuVar3;
        ccu o;
        int i5;
        int i6;
        int i7;
        if (this == ccuVar) {
            cdeVar.a += n();
            return this;
        }
        int i8 = 0;
        if (i > 30) {
            cdg cdgVar = ccgVar.a;
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + ccuVar.b.length);
            copyOf.getClass();
            int length = this.b.length;
            arta A = arrn.A(arrn.B(0, ccuVar.b.length), 2);
            int i9 = A.a;
            int i10 = A.b;
            int i11 = A.c;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (!w(ccuVar.b[i9])) {
                        Object[] objArr3 = ccuVar.b;
                        copyOf[length] = objArr3[i9];
                        copyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    } else {
                        cdeVar.a++;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.b.length) {
                if (length != ccuVar.b.length) {
                    if (length == copyOf.length) {
                        return new ccu(0, 0, copyOf, cdgVar);
                    }
                    Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                    copyOf2.getClass();
                    return new ccu(0, 0, copyOf2, cdgVar);
                }
                return ccuVar;
            }
            return this;
        }
        int i12 = this.d | ccuVar.d;
        int i13 = this.c;
        int i14 = ccuVar.c;
        int i15 = i13 ^ i14;
        int i16 = i13 & i14;
        int i17 = (~i12) & i15;
        while (i16 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i16);
            if (d.F(u(b(lowestOneBit)), ccuVar.u(ccuVar.b(lowestOneBit)))) {
                i17 |= lowestOneBit;
            } else {
                i12 |= lowestOneBit;
            }
            i16 ^= lowestOneBit;
        }
        if ((i12 & i17) != 0) {
            byy.b("Check failed.");
        }
        if (d.F(this.e, ccgVar.a) && this.c == i17 && this.d == i12) {
            ccuVar2 = this;
        } else {
            int bitCount = Integer.bitCount(i17);
            ccuVar2 = new ccu(i17, i12, new Object[bitCount + bitCount + Integer.bitCount(i12)]);
        }
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr4 = ccuVar2.b;
            int length2 = (objArr4.length - 1) - i19;
            if (y(lowestOneBit2)) {
                o = i(c(lowestOneBit2));
                if (ccuVar.y(lowestOneBit2)) {
                    o = o.f(ccuVar.i(ccuVar.c(lowestOneBit2)), i + 5, cdeVar, ccgVar);
                } else if (ccuVar.m(lowestOneBit2)) {
                    int i20 = i + 5;
                    int b = ccuVar.b(lowestOneBit2);
                    Object u = ccuVar.u(b);
                    Object v = ccuVar.v(b);
                    int a2 = ccgVar.a();
                    if (u != null) {
                        i7 = u.hashCode();
                    } else {
                        i7 = i8;
                    }
                    o = o.e(i7, u, v, i20, ccgVar);
                    if (ccgVar.a() == a2) {
                        cdeVar.a++;
                    }
                }
            } else if (ccuVar.y(lowestOneBit2)) {
                o = ccuVar.i(ccuVar.c(lowestOneBit2));
                if (m(lowestOneBit2)) {
                    int i21 = i + 5;
                    int b2 = b(lowestOneBit2);
                    Object u2 = u(b2);
                    if (u2 != null) {
                        i5 = u2.hashCode();
                    } else {
                        i5 = 0;
                    }
                    if (o.l(i5, u2, i21)) {
                        cdeVar.a++;
                    } else {
                        Object v2 = v(b2);
                        if (u2 != null) {
                            i6 = u2.hashCode();
                        } else {
                            i6 = 0;
                        }
                        o = o.e(i6, u2, v2, i21, ccgVar);
                    }
                }
            } else {
                int i22 = i + 5;
                int b3 = b(lowestOneBit2);
                Object u3 = u(b3);
                Object v3 = v(b3);
                int b4 = ccuVar.b(lowestOneBit2);
                Object u4 = ccuVar.u(b4);
                Object v4 = ccuVar.v(b4);
                if (u3 != null) {
                    i2 = u3.hashCode();
                } else {
                    i2 = 0;
                }
                if (u4 != null) {
                    i3 = u4.hashCode();
                } else {
                    i3 = 0;
                }
                objArr = objArr4;
                i4 = lowestOneBit2;
                ccuVar3 = ccuVar2;
                o = o(i2, u3, v3, i3, u4, v4, i22, ccgVar.a);
                objArr[length2] = o;
                i18 ^= i4;
                i19++;
                ccuVar2 = ccuVar3;
                i8 = 0;
            }
            objArr = objArr4;
            i4 = lowestOneBit2;
            ccuVar3 = ccuVar2;
            objArr[length2] = o;
            i18 ^= i4;
            i19++;
            ccuVar2 = ccuVar3;
            i8 = 0;
        }
        ccu ccuVar4 = ccuVar2;
        int i23 = 0;
        while (i17 != 0) {
            int i24 = i23 + i23;
            int i25 = i24 + 1;
            int lowestOneBit3 = Integer.lowestOneBit(i17);
            if (!ccuVar.m(lowestOneBit3)) {
                int b5 = b(lowestOneBit3);
                ccuVar4.b[i24] = u(b5);
                ccuVar4.b[i25] = v(b5);
            } else {
                int b6 = ccuVar.b(lowestOneBit3);
                ccuVar4.b[i24] = ccuVar.u(b6);
                ccuVar4.b[i25] = ccuVar.v(b6);
                if (m(lowestOneBit3)) {
                    cdeVar.a++;
                }
            }
            i17 ^= lowestOneBit3;
            i23++;
        }
        if (!x(ccuVar4)) {
            if (!ccuVar.x(ccuVar4)) {
                return ccuVar4;
            }
            return ccuVar;
        }
        return this;
    }

    public final ccu g(int i, Object obj, int i2, ccg ccgVar) {
        ccu g;
        ccu ccuVar;
        int a2 = 1 << ccy.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (d.F(obj, u(b))) {
                return q(b, a2, ccgVar);
            }
        } else if (y(a2)) {
            int c = c(a2);
            ccu i3 = i(c);
            if (i2 == 30) {
                arta A = arrn.A(arrn.B(0, i3.b.length), 2);
                int i4 = A.a;
                int i5 = A.b;
                int i6 = A.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!d.F(obj, i3.u(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    g = i3.p(i4, ccgVar);
                }
                ccuVar = i3;
                return r(i3, ccuVar, c, a2, ccgVar.a);
            }
            g = i3.g(i, obj, i2 + 5, ccgVar);
            ccuVar = g;
            return r(i3, ccuVar, c, a2, ccgVar.a);
        }
        return this;
    }

    public final ccu h(int i, Object obj, Object obj2, int i2, ccg ccgVar) {
        ccu h;
        ccu ccuVar;
        int a2 = 1 << ccy.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (d.F(obj, u(b)) && d.F(obj2, v(b))) {
                return q(b, a2, ccgVar);
            }
        } else if (y(a2)) {
            int c = c(a2);
            ccu i3 = i(c);
            if (i2 == 30) {
                arta A = arrn.A(arrn.B(0, i3.b.length), 2);
                int i4 = A.a;
                int i5 = A.b;
                int i6 = A.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (d.F(obj, i3.u(i4)) && d.F(obj2, i3.v(i4))) {
                            h = i3.p(i4, ccgVar);
                            break;
                        }
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    }
                }
                ccuVar = i3;
                return r(i3, ccuVar, c, a2, ccgVar.a);
            }
            h = i3.h(i, obj, obj2, i2 + 5, ccgVar);
            ccuVar = h;
            return r(i3, ccuVar, c, a2, ccgVar.a);
        }
        return this;
    }

    public final ccu i(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (ccu) obj;
    }

    public final ccu j(int i, Object obj, int i2) {
        ccu j;
        int a2 = 1 << ccy.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (d.F(obj, u(b))) {
                Object[] objArr = this.b;
                if (objArr.length == 2) {
                    return null;
                }
                return new ccu(this.c ^ a2, this.d, ccy.c(objArr, b));
            }
            return this;
        }
        if (y(a2)) {
            int c = c(a2);
            ccu i3 = i(c);
            if (i2 == 30) {
                arta A = arrn.A(arrn.B(0, i3.b.length), 2);
                int i4 = A.a;
                int i5 = A.b;
                int i6 = A.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!d.F(obj, i3.u(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    Object[] objArr2 = i3.b;
                    if (objArr2.length == 2) {
                        j = null;
                    } else {
                        j = new ccu(0, 0, ccy.c(objArr2, i4));
                    }
                }
                j = i3;
                break;
            }
            j = i3.j(i, obj, i2 + 5);
            if (j == null) {
                Object[] objArr3 = this.b;
                if (objArr3.length == 1) {
                    return null;
                }
                return new ccu(this.c, this.d ^ a2, ccy.d(objArr3, c));
            }
            if (i3 != j) {
                return t(c, a2, j);
            }
            return this;
        }
        return this;
    }

    public final Object k(int i, Object obj, int i2) {
        int a2 = 1 << ccy.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (!d.F(obj, u(b))) {
                return null;
            }
            return v(b);
        }
        if (!y(a2)) {
            return null;
        }
        ccu i3 = i(c(a2));
        if (i2 == 30) {
            arta A = arrn.A(arrn.B(0, i3.b.length), 2);
            int i4 = A.a;
            int i5 = A.b;
            int i6 = A.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                return null;
            }
            while (!d.F(obj, i3.u(i4))) {
                if (i4 == i5) {
                    return null;
                }
                i4 += i6;
            }
            return i3.v(i4);
        }
        return i3.k(i, obj, i2 + 5);
    }

    public final boolean l(int i, Object obj, int i2) {
        int a2 = 1 << ccy.a(i, i2);
        if (m(a2)) {
            return d.F(obj, u(b(a2)));
        }
        if (y(a2)) {
            ccu i3 = i(c(a2));
            if (i2 == 30) {
                return i3.w(obj);
            }
            return i3.l(i, obj, i2 + 5);
        }
        return false;
    }

    public final boolean m(int i) {
        if ((i & this.c) != 0) {
            return true;
        }
        return false;
    }

    public ccu(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
