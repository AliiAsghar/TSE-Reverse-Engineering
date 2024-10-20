package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class almf<E> extends AbstractSet<E> implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    almf() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object bp = alzz.bp(i2);
        if (i4 != 0) {
            alzz.br(bp, i3 & i5, i4 + 1);
        }
        Object j = j();
        int[] l = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int bn = alzz.bn(j, i6);
            while (bn != 0) {
                int i7 = bn - 1;
                int i8 = l[i7];
                int bj = alzz.bj(i8, i) | i6;
                int i9 = bj & i5;
                int bn2 = alzz.bn(bp, i9);
                alzz.br(bp, i9, bn);
                l[i7] = alzz.bk(bj, bn2, i5);
                bn = i8 & i;
            }
        }
        this.c = bp;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = alzz.bk(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            f(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(a.bV(readInt, "Invalid size: "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        if (g()) {
            albo.U(g(), "Arrays already allocated");
            int i = this.b;
            int bo = alzz.bo(i);
            this.c = alzz.bp(bo);
            k(bo - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set d = d();
        if (d != null) {
            return d.add(obj);
        }
        int[] l = l();
        Object[] m = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int bg = alzz.bg(obj);
        int h = h();
        int i4 = bg & h;
        int bn = alzz.bn(j(), i4);
        if (bn == 0) {
            if (i3 > h) {
                h = i(h, alzz.bl(h), bg, i2);
            } else {
                alzz.br(j(), i4, i3);
            }
        } else {
            int bj = alzz.bj(bg, h);
            int i5 = 0;
            while (true) {
                int i6 = bn - 1;
                int i7 = l[i6];
                if (alzz.bj(i7, h) == bj && d.B(obj, m[i6])) {
                    return false;
                }
                int i8 = i7 & h;
                i5++;
                if (i8 == 0) {
                    if (i5 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int a = a();
                        while (a >= 0) {
                            linkedHashSet.add(c(a));
                            a = b(a);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > h) {
                        h = i(h, alzz.bl(h), bg, i2);
                    } else {
                        l[i6] = alzz.bk(i7, i3, h);
                    }
                } else {
                    bn = i8;
                }
            }
        }
        int length = l().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), min);
            this.a = Arrays.copyOf(m(), min);
        }
        l()[i2] = alzz.bk(bg, 0, h);
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set d = d();
        if (d != null) {
            this.b = albo.cp(size(), 3, 1073741823);
            d.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        alzz.bq(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set d = d();
        if (d != null) {
            return d.contains(obj);
        }
        int bg = alzz.bg(obj);
        int h = h();
        int bn = alzz.bn(j(), bg & h);
        if (bn == 0) {
            return false;
        }
        int bj = alzz.bj(bg, h);
        do {
            int i = bn - 1;
            int i2 = l()[i];
            if (alzz.bj(i2, h) == bj && d.B(obj, c(i))) {
                return true;
            }
            bn = i2 & h;
        } while (bn != 0);
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        d.t(true, "Expected size must be >= 0");
        this.b = albo.cp(i, 1, 1073741823);
    }

    final boolean g() {
        if (this.c == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set d = d();
        if (d != null) {
            return d.iterator();
        }
        return new alme(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!g()) {
            Set d = d();
            if (d != null) {
                return d.remove(obj);
            }
            int h = h();
            int bm = alzz.bm(obj, null, h, j(), l(), m(), null);
            if (bm != -1) {
                Object j = j();
                int[] l = l();
                Object[] m = m();
                int size = size();
                int i3 = size - 1;
                if (bm < i3) {
                    int i4 = bm + 1;
                    Object obj2 = m[i3];
                    m[bm] = obj2;
                    m[i3] = null;
                    l[bm] = l[i3];
                    l[i3] = 0;
                    int bg = alzz.bg(obj2) & h;
                    int bn = alzz.bn(j, bg);
                    if (bn == size) {
                        alzz.br(j, bg, i4);
                    } else {
                        while (true) {
                            i = bn - 1;
                            i2 = l[i];
                            int i5 = i2 & h;
                            if (i5 == size) {
                                break;
                            }
                            bn = i5;
                        }
                        l[i] = alzz.bk(i2, i4, h);
                    }
                } else {
                    m[bm] = null;
                    l[bm] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set d = d();
        if (d != null) {
            return d.size();
        }
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set d = d();
        return d != null ? d.toArray() : Arrays.copyOf(m(), this.e);
    }

    public almf(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set d = d();
        if (d != null) {
            return d.toArray(objArr);
        }
        Object[] m = m();
        int i = this.e;
        albo.S(0, i, m.length);
        int length = objArr.length;
        if (length < i) {
            objArr = alzz.U(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(m, 0, objArr, 0, i);
        return objArr;
    }
}
