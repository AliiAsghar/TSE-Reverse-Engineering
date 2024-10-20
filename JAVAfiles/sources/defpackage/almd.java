package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almd extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public almd() {
        l(3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            l(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(a.bV(readInt, "Invalid size: "));
    }

    private final int s(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object bp = alzz.bp(i2);
        if (i4 != 0) {
            alzz.br(bp, i3 & i5, i4 + 1);
        }
        Object g = g();
        int[] p = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int bn = alzz.bn(g, i6);
            while (bn != 0) {
                int i7 = bn - 1;
                int i8 = p[i7];
                int bj = alzz.bj(i8, i) | i6;
                int i9 = bj & i5;
                int bn2 = alzz.bn(bp, i9);
                alzz.br(bp, i9, bn);
                p[i7] = alzz.bk(bj, bn2, i5);
                bn = i8 & i;
            }
        }
        this.g = bp;
        t(i5);
        return i5;
    }

    private final void t(int i) {
        this.e = alzz.bk(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator i = i();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        k();
        Map j = j();
        if (j != null) {
            this.e = albo.cp(size(), 3, 1073741823);
            j.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(q(), 0, this.f, (Object) null);
        Arrays.fill(r(), 0, this.f, (Object) null);
        alzz.bq(g());
        Arrays.fill(p(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map j = j();
        if (j != null) {
            return j.containsKey(obj);
        }
        if (d(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map j = j();
        if (j == null) {
            for (int i = 0; i < this.f; i++) {
                if (d.B(obj, h(i))) {
                    return true;
                }
            }
            return false;
        }
        return j.containsValue(obj);
    }

    public final int d(Object obj) {
        if (o()) {
            return -1;
        }
        int bg = alzz.bg(obj);
        int c = c();
        int bn = alzz.bn(g(), bg & c);
        if (bn == 0) {
            return -1;
        }
        int bj = alzz.bj(bg, c);
        do {
            int i = bn - 1;
            int i2 = p()[i];
            if (alzz.bj(i2, c) == bj && d.B(obj, e(i))) {
                return i;
            }
            bn = i2 & c;
        } while (bn != 0);
        return -1;
    }

    public final Object e(int i) {
        return q()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set == null) {
            ally allyVar = new ally(this);
            this.i = allyVar;
            return allyVar;
        }
        return set;
    }

    public final Object f(Object obj) {
        if (!o()) {
            int c = c();
            int bm = alzz.bm(obj, null, c, g(), p(), q(), null);
            if (bm != -1) {
                Object h = h(bm);
                m(bm, c);
                this.f--;
                k();
                return h;
            }
        }
        return a;
    }

    public final Object g() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map j = j();
        if (j != null) {
            return j.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return h(d);
    }

    public final Object h(int i) {
        return r()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator i() {
        Map j = j();
        if (j != null) {
            return j.entrySet().iterator();
        }
        return new allw(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map j() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set == null) {
            alma almaVar = new alma(this);
            this.h = almaVar;
            return almaVar;
        }
        return set;
    }

    final void l(int i) {
        d.t(true, "Expected size must be >= 0");
        this.e = albo.cp(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i, int i2) {
        Object g = g();
        int[] p = p();
        Object[] q = q();
        Object[] r = r();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            int i4 = i + 1;
            Object obj = q[i3];
            q[i] = obj;
            r[i] = r[i3];
            q[i3] = null;
            r[i3] = null;
            p[i] = p[i3];
            p[i3] = 0;
            int bg = alzz.bg(obj) & i2;
            int bn = alzz.bn(g, bg);
            if (bn == size) {
                alzz.br(g, bg, i4);
                return;
            }
            while (true) {
                int i5 = bn - 1;
                int i6 = p[i5];
                int i7 = i6 & i2;
                if (i7 != size) {
                    bn = i7;
                } else {
                    p[i5] = alzz.bk(i6, i4, i2);
                    return;
                }
            }
        } else {
            q[i] = null;
            r[i] = null;
            p[i] = 0;
        }
    }

    public final void n(int i, Object obj) {
        r()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        if (this.g == null) {
            return true;
        }
        return false;
    }

    public final int[] p() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (o()) {
            albo.U(o(), "Arrays already allocated");
            int i = this.e;
            int bo = alzz.bo(i);
            this.g = alzz.bp(bo);
            t(bo - 1);
            this.b = new int[i];
            this.c = new Object[i];
            this.d = new Object[i];
        }
        Map j = j();
        if (j != null) {
            return j.put(obj, obj2);
        }
        int[] p = p();
        Object[] q = q();
        Object[] r = r();
        int i2 = this.f;
        int i3 = i2 + 1;
        int bg = alzz.bg(obj);
        int c = c();
        int i4 = bg & c;
        int bn = alzz.bn(g(), i4);
        if (bn == 0) {
            if (i3 > c) {
                c = s(c, alzz.bl(c), bg, i2);
            } else {
                alzz.br(g(), i4, i3);
            }
        } else {
            int bj = alzz.bj(bg, c);
            int i5 = 0;
            while (true) {
                int i6 = bn - 1;
                int i7 = p[i6];
                if (alzz.bj(i7, c) == bj && d.B(obj, q[i6])) {
                    Object obj3 = r[i6];
                    r[i6] = obj2;
                    return obj3;
                }
                int i8 = i7 & c;
                i5++;
                if (i8 == 0) {
                    if (i5 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        int a2 = a();
                        while (a2 >= 0) {
                            linkedHashMap.put(e(a2), h(a2));
                            a2 = b(a2);
                        }
                        this.g = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        k();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > c) {
                        c = s(c, alzz.bl(c), bg, i2);
                    } else {
                        p[i6] = alzz.bk(i7, i3, c);
                    }
                } else {
                    bn = i8;
                }
            }
        }
        int length = p().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(p(), min);
            this.c = Arrays.copyOf(q(), min);
            this.d = Arrays.copyOf(r(), min);
        }
        p()[i2] = alzz.bk(bg, 0, c);
        q()[i2] = obj;
        n(i2, obj2);
        this.f = i3;
        k();
        return null;
    }

    public final Object[] q() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] r() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map j = j();
        if (j != null) {
            return j.remove(obj);
        }
        Object f = f(obj);
        if (f == a) {
            return null;
        }
        return f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map j = j();
        if (j != null) {
            return j.size();
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection == null) {
            almc almcVar = new almc(this);
            this.j = almcVar;
            return almcVar;
        }
        return collection;
    }

    public almd(int i) {
        l(i);
    }
}
