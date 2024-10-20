package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vl {
    private int[] a;
    private Object[] b;
    public int d;

    public vl() {
        this((byte[]) null);
    }

    private final int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a = vp.a(this.a, i2, i);
        if (a < 0) {
            return a;
        }
        if (d.F(obj, this.b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (d.F(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (d.F(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int a = vp.a(this.a, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int b(Object obj) {
        int i = this.d;
        int i2 = i + i;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (d.F(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int c(Object obj) {
        if (obj == null) {
            return j();
        }
        return a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.d > 0) {
            this.a = vp.a;
            this.b = vp.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        if (c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final Object d(int i) {
        if (i < 0 || i >= this.d) {
            a.bH(a.bV(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i];
    }

    public Object e(int i) {
        if (i < 0 || i >= this.d) {
            a.bH(a.bV(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.a;
            int length = iArr.length;
            int i5 = 8;
            if (length > 8 && i3 < length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                copyOf.getClass();
                this.a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
                copyOf2.getClass();
                this.b = copyOf2;
                if (i3 == this.d) {
                    if (i > 0) {
                        aqil.x(iArr, this.a, 0, 0, i);
                        aqil.y(objArr, this.b, 0, 0, i2);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        aqil.x(iArr, this.a, i, i6, i3);
                        aqil.y(objArr, this.b, i2, i6 + i6, i3 + i3);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    aqil.x(iArr, iArr, i, i7, i3);
                    Object[] objArr2 = this.b;
                    aqil.y(objArr2, objArr2, i2, i7 + i7, i3 + i3);
                }
                Object[] objArr3 = this.b;
                int i8 = i4 + i4;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i3 == this.d) {
                this.d = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof vl) {
                int i = this.d;
                vl vlVar = (vl) obj;
                if (i != vlVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object d = d(i2);
                    Object g = g(i2);
                    Object obj2 = vlVar.get(d);
                    if (g == null) {
                        if (obj2 != null || !vlVar.containsKey(d)) {
                            return false;
                        }
                    } else if (!d.F(g, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                Object d2 = d(i4);
                Object g2 = g(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(d2);
                if (g2 == null) {
                    if (obj3 != null || !map.containsKey(d2)) {
                        return false;
                    }
                } else if (!d.F(g2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            a.bH(a.bV(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object g(int i) {
        if (i < 0 || i >= this.d) {
            a.bH(a.bV(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i + 1];
    }

    public final Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.b[c + c + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return this.b[c + c + 1];
        }
        return obj2;
    }

    public final void h(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i + i);
            copyOf2.getClass();
            this.b = copyOf2;
        }
        if (this.d == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i2 = this.d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public void i(vl vlVar) {
        int i = vlVar.d;
        h(this.d + i);
        if (this.d == 0) {
            if (i > 0) {
                aqil.x(vlVar.a, this.a, 0, 0, i);
                aqil.y(vlVar.b, this.b, 0, 0, i + i);
                this.d = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(vlVar.d(i2), vlVar.g(i2));
        }
    }

    public final boolean isEmpty() {
        if (this.d <= 0) {
            return true;
        }
        return false;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int j;
        int i2 = this.d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            j = a(obj, i);
        } else {
            j = j();
        }
        if (j >= 0) {
            int i3 = j + j + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~j;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
            copyOf2.getClass();
            this.b = copyOf2;
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.a;
            int i6 = i4 + 1;
            aqil.x(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.b;
            int i7 = this.d;
            aqil.y(objArr2, objArr2, i6 + i6, i4 + i4, i7 + i7);
        }
        int i8 = this.d;
        if (i2 == i8) {
            int[] iArr3 = this.a;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.b;
                int i9 = i4 + i4;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return e(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return f(c, obj2);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object d = d(i2);
            if (d != sb) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public vl(int i) {
        this.a = i == 0 ? vp.a : new int[i];
        this.b = i == 0 ? vp.c : new Object[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0 || !d.F(obj2, g(c))) {
            return false;
        }
        e(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !d.F(obj2, g(c))) {
            return false;
        }
        f(c, obj3);
        return true;
    }

    public /* synthetic */ vl(byte[] bArr) {
        this(0);
    }
}
