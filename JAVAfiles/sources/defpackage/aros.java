package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aros implements Map, Serializable, arsi {
    public static final aros a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private arou l;
    private arov m;
    private arot n;

    static {
        aros arosVar = new aros(0);
        arosVar.h = true;
        a = arosVar;
    }

    public aros() {
        this(8);
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.k;
    }

    private final void n(int i) {
        Object[] objArr;
        int d = d();
        int i2 = this.e;
        int i3 = d - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            p(l());
            return;
        }
        int i5 = this.e + i;
        if (i5 >= 0) {
            if (i5 > d()) {
                int M = aqil.M(d(), i5);
                this.b = arrj.A(this.b, M);
                Object[] objArr2 = this.c;
                if (objArr2 != null) {
                    objArr = arrj.A(objArr2, M);
                } else {
                    objArr = null;
                }
                this.c = objArr;
                int[] copyOf = Arrays.copyOf(this.d, M);
                copyOf.getClass();
                this.d = copyOf;
                int t = arrj.t(M);
                if (t > l()) {
                    p(t);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void o() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0067, code lost:
    
        r3[r0] = r7;
        r6.d[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(int r7) {
        /*
            r6 = this;
            r6.o()
            int r0 = r6.e
            int r1 = r6.g
            r2 = 0
            if (r0 <= r1) goto L37
            java.lang.Object[] r0 = r6.c
            r1 = r2
            r3 = r1
        Le:
            int r4 = r6.e
            if (r1 >= r4) goto L29
            int[] r4 = r6.d
            r4 = r4[r1]
            if (r4 < 0) goto L26
            java.lang.Object[] r4 = r6.b
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L24
            r4 = r0[r1]
            r0[r3] = r4
        L24:
            int r3 = r3 + 1
        L26:
            int r1 = r1 + 1
            goto Le
        L29:
            java.lang.Object[] r1 = r6.b
            defpackage.arrj.y(r1, r3, r4)
            if (r0 == 0) goto L35
            int r1 = r6.e
            defpackage.arrj.y(r0, r3, r1)
        L35:
            r6.e = r3
        L37:
            int r0 = r6.l()
            if (r7 == r0) goto L48
            int[] r0 = new int[r7]
            r6.i = r0
            int r7 = defpackage.arrj.u(r7)
            r6.k = r7
            goto L51
        L48:
            int[] r7 = r6.i
            int r0 = r6.l()
            defpackage.aqil.C(r7, r2, r0)
        L51:
            int r7 = r6.e
            if (r2 >= r7) goto L88
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.b
            r0 = r0[r2]
            int r0 = r6.m(r0)
            int r1 = r6.j
        L61:
            int[] r3 = r6.i
            r4 = r3[r0]
            if (r4 != 0) goto L6f
            r3[r0] = r7
            int[] r1 = r6.d
            r1[r2] = r0
            r2 = r7
            goto L51
        L6f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L80
            int r3 = r0 + (-1)
            if (r0 != 0) goto L7e
            int r0 = r6.l()
            int r0 = r0 + (-1)
            goto L61
        L7e:
            r0 = r3
            goto L61
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aros.p(int):void");
    }

    private final Object writeReplace() {
        if (this.h) {
            return new arox(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int m = m(obj);
            int i = this.j;
            int i2 = i + i;
            int l = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[m];
                if (i4 <= 0) {
                    if (this.e >= d()) {
                        n(1);
                    } else {
                        int i5 = this.e;
                        int i6 = i5 + 1;
                        this.e = i6;
                        this.b[i5] = obj;
                        this.d[i5] = m;
                        this.i[m] = i6;
                        this.g++;
                        o();
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                } else {
                    if (d.F(this.b[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > arrn.s(i2, l)) {
                        int l2 = l();
                        p(l2 + l2);
                        break;
                    }
                    int i7 = m - 1;
                    if (m == 0) {
                        m = l() - 1;
                    } else {
                        m = i7;
                    }
                }
            }
        }
    }

    public final int b(Object obj) {
        int m = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[m];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (d.F(this.b[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = m - 1;
            if (m == 0) {
                m = l() - 1;
            } else {
                m = i4;
            }
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (d.F(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        arob it = new artb(0, this.e - 1).iterator();
        while (it.a) {
            int a2 = it.a();
            int[] iArr = this.d;
            int i = iArr[a2];
            if (i >= 0) {
                this.i[i] = 0;
                iArr[a2] = -1;
            }
        }
        arrj.y(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            arrj.y(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        o();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        aros arosVar = a;
        arosVar.getClass();
        return arosVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        arot arotVar = this.n;
        if (arotVar == null) {
            arot arotVar2 = new arot(this);
            this.n = arotVar2;
            return arotVar2;
        }
        return arotVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.g == map.size() && h(map.entrySet())) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (!this.h) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x0021->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r11) {
        /*
            r10 = this;
            java.lang.Object[] r0 = r10.b
            defpackage.arrj.x(r0, r11)
            java.lang.Object[] r0 = r10.c
            if (r0 == 0) goto Lc
            defpackage.arrj.x(r0, r11)
        Lc:
            int[] r0 = r10.d
            r0 = r0[r11]
            int r1 = r10.j
            int r1 = r1 + r1
            int r2 = r10.l()
            int r2 = r2 >> 1
            int r1 = defpackage.arrn.s(r1, r2)
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L21:
            r5 = -1
            if (r0 != 0) goto L2a
            int r0 = r10.l()
            int r0 = r0 + r5
            goto L2c
        L2a:
            int r0 = r0 + (-1)
        L2c:
            int r4 = r4 + 1
            int r6 = r10.j
            if (r4 <= r6) goto L37
            int[] r0 = r10.i
            r0[r1] = r2
            goto L6a
        L37:
            int[] r6 = r10.i
            r7 = r6[r0]
            if (r7 != 0) goto L40
            r6[r1] = r2
            goto L6a
        L40:
            if (r7 >= 0) goto L47
            r6[r1] = r5
        L44:
            r1 = r0
            r4 = r2
            goto L63
        L47:
            java.lang.Object[] r6 = r10.b
            int r8 = r7 + (-1)
            r6 = r6[r8]
            int r6 = r10.m(r6)
            int r6 = r6 - r0
            int r9 = r10.l()
            int r9 = r9 + r5
            r6 = r6 & r9
            if (r6 < r4) goto L63
            int[] r4 = r10.i
            r4[r1] = r7
            int[] r4 = r10.d
            r4[r8] = r1
            goto L44
        L63:
            int r3 = r3 + r5
            if (r3 >= 0) goto L21
            int[] r0 = r10.i
            r0[r1] = r5
        L6a:
            int[] r0 = r10.d
            r0[r11] = r5
            int r11 = r10.g
            int r11 = r11 + r5
            r10.g = r11
            r10.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aros.g(int):void");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[b];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        aroo arooVar = new aroo(this);
        int i3 = 0;
        while (arooVar.hasNext()) {
            int i4 = arooVar.b;
            aros arosVar = arooVar.a;
            if (i4 < arosVar.e) {
                arooVar.b = i4 + 1;
                arooVar.c = i4;
                Object obj = arosVar.b[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = arooVar.a.c;
                objArr.getClass();
                Object obj2 = objArr[arooVar.c];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                arooVar.b();
                i3 += i ^ i2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i3;
    }

    public final boolean i(Map.Entry entry) {
        int b = b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return d.F(objArr[b], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.g == 0) {
            return true;
        }
        return false;
    }

    public final boolean j(Object obj) {
        f();
        int b = b(obj);
        if (b < 0) {
            return false;
        }
        g(b);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[d()];
        this.c = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        arou arouVar = this.l;
        if (arouVar == null) {
            arou arouVar2 = new arou(this);
            this.l = arouVar2;
            return arouVar2;
        }
        return arouVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int a2 = a(obj);
        Object[] k = k();
        if (a2 < 0) {
            int i = (-a2) - 1;
            Object obj3 = k[i];
            k[i] = obj2;
            return obj3;
        }
        k[a2] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            n(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a2 = a(entry.getKey());
                Object[] k = k();
                if (a2 >= 0) {
                    k[a2] = entry.getValue();
                } else {
                    int i = (-a2) - 1;
                    if (!d.F(entry.getValue(), k[i])) {
                        k[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[b];
        g(b);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        aroo arooVar = new aroo(this);
        int i = 0;
        while (arooVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = arooVar.b;
            aros arosVar = arooVar.a;
            if (i2 < arosVar.e) {
                arooVar.b = i2 + 1;
                arooVar.c = i2;
                Object obj = arosVar.b[i2];
                if (obj == arosVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                aros arosVar2 = arooVar.a;
                Object[] objArr = arosVar2.c;
                objArr.getClass();
                Object obj2 = objArr[arooVar.c];
                if (obj2 == arosVar2) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                arooVar.b();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        arov arovVar = this.m;
        if (arovVar == null) {
            arov arovVar2 = new arov(this);
            this.m = arovVar2;
            return arovVar2;
        }
        return arovVar;
    }

    public aros(int i) {
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[arrj.t(i)];
        this.b = objArr;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = arrj.u(l());
    }
}
