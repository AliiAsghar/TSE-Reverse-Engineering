package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alnm extends AbstractMap implements Serializable, allp {
    transient Object[] a;
    transient Object[] b;
    public transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient allp g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public alnm() {
        j();
    }

    private final int n(int i) {
        return i & (this.h.length - 1);
    }

    private final void o(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int n = n(i2);
        int[] iArr = this.h;
        int i3 = iArr[n];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[n] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.j;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.j[i3];
            } else {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
            }
        }
    }

    private final void p(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int n = n(i2);
        int[] iArr = this.i;
        int i3 = iArr[n];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[n] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.k;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.k[i3];
            } else {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
        }
    }

    private final void q(int i) {
        int length = this.j.length;
        if (length < i) {
            int f = alnt.f(length, i);
            this.a = Arrays.copyOf(this.a, f);
            this.b = Arrays.copyOf(this.b, f);
            this.j = w(this.j, f);
            this.k = w(this.k, f);
            this.m = w(this.m, f);
            this.f = w(this.f, f);
        }
        if (this.h.length < i) {
            int bh = alzz.bh(i);
            this.h = v(bh);
            this.i = v(bh);
            for (int i2 = 0; i2 < this.c; i2++) {
                int n = n(alzz.bg(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[n];
                iArr2[n] = i2;
                int n2 = n(alzz.bg(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[n2];
                iArr4[n2] = i2;
            }
        }
    }

    private final void r(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int n = n(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[n];
        iArr2[n] = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        j();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int n = n(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[n];
        iArr2[n] = i;
    }

    private final void t(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        o(i, i2);
        p(i, i3);
        u(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            u(i7, i);
            u(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int n = n(alzz.bg(obj));
            int[] iArr = this.h;
            int i9 = iArr[n];
            if (i9 == i6) {
                iArr[n] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.j[i9];
                    }
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int n2 = n(alzz.bg(obj2));
            int[] iArr3 = this.i;
            int i11 = iArr3[n2];
            if (i11 == i6) {
                iArr3[n2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.k[i11];
                    }
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void u(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private static int[] v(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] w(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.allp
    public final allp a() {
        allp allpVar = this.g;
        if (allpVar == null) {
            alng alngVar = new alng(this);
            this.g = alngVar;
            return alngVar;
        }
        return allpVar;
    }

    final int b(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[n(i)];
        while (i2 != -1) {
            if (d.B(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(Object obj) {
        return d(obj, alzz.bg(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (c(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(Object obj, int i) {
        return b(obj, i, this.h, this.j, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(Object obj) {
        return f(obj, alzz.bg(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set == null) {
            alnf alnfVar = new alnf(this);
            this.p = alnfVar;
            return alnfVar;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(Object obj, int i) {
        return b(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.o;
        if (set == null) {
            alnj alnjVar = new alnj(this);
            this.o = alnjVar;
            return alnjVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int c = c(obj);
        if (c == -1) {
            return null;
        }
        return this.b[c];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i, int i2) {
        t(i, i2, alzz.bg(this.b[i]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i, int i2) {
        t(i, alzz.bg(this.a[i]), i2);
    }

    final void j() {
        albo.x(16, "expectedSize");
        int bh = alzz.bh(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.h = v(bh);
        this.i = v(bh);
        this.j = v(16);
        this.k = v(16);
        this.e = -2;
        this.l = -2;
        this.m = v(16);
        this.f = v(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object k(Object obj, Object obj2) {
        boolean z;
        int i;
        int bg = alzz.bg(obj);
        int f = f(obj, bg);
        if (f != -1) {
            Object obj3 = this.a[f];
            if (d.B(obj3, obj2)) {
                return obj2;
            }
            l(f, obj2);
            return obj3;
        }
        int i2 = this.l;
        int bg2 = alzz.bg(obj2);
        if (d(obj2, bg2) == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.N(z, "Key already present: %s", obj2);
        q(this.c + 1);
        Object[] objArr = this.a;
        int i3 = this.c;
        objArr[i3] = obj2;
        this.b[i3] = obj;
        r(i3, bg2);
        s(this.c, bg);
        if (i2 == -2) {
            i = this.e;
        } else {
            i = this.f[i2];
        }
        u(i2, this.c);
        u(this.c, i);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.n;
        if (set == null) {
            alni alniVar = new alni(this);
            this.n = alniVar;
            return alniVar;
        }
        return set;
    }

    public final void l(int i, Object obj) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int d = d(obj, alzz.bg(obj));
        int i2 = this.l;
        if (d == -1) {
            if (i2 == i) {
                i2 = this.m[i];
            } else if (i2 == this.c) {
                i2 = d;
            }
            if (i == -2) {
                d = this.f[-2];
            } else if (this.c != -2) {
                d = -2;
            }
            u(this.m[i], this.f[i]);
            o(i, alzz.bg(this.a[i]));
            this.a[i] = obj;
            r(i, alzz.bg(obj));
            u(i2, i);
            u(i, d);
            return;
        }
        throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(String.valueOf(obj))));
    }

    public final void m(int i, Object obj) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int bg = alzz.bg(obj);
        if (f(obj, bg) == -1) {
            p(i, alzz.bg(this.b[i]));
            this.b[i] = obj;
            s(i, bg);
            return;
        }
        throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.allp
    public final Object put(Object obj, Object obj2) {
        boolean z;
        int bg = alzz.bg(obj);
        int d = d(obj, bg);
        if (d != -1) {
            Object obj3 = this.b[d];
            if (!d.B(obj3, obj2)) {
                m(d, obj2);
                return obj3;
            }
            return obj2;
        }
        int bg2 = alzz.bg(obj2);
        if (f(obj2, bg2) == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.N(z, "Value already present: %s", obj2);
        q(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        r(i, bg);
        s(this.c, bg2);
        u(this.l, this.c);
        u(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int bg = alzz.bg(obj);
        int d = d(obj, bg);
        if (d == -1) {
            return null;
        }
        Object obj2 = this.b[d];
        h(d, bg);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
