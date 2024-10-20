package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aron<E> extends arnm<E> implements List<E>, RandomAccess, Serializable, arsh {
    public static final aron a;
    public Object[] b;
    public int c;
    public boolean d;

    static {
        aron aronVar = new aron(0);
        aronVar.d = true;
        a = aronVar;
    }

    public aron() {
        this((byte[]) null);
    }

    private final void j(int i, int i2) {
        int i3 = this.c + i2;
        if (i3 >= 0) {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i3 > length) {
                this.b = arrj.A(objArr, aqil.M(length, i3));
            }
            Object[] objArr2 = this.b;
            aqil.y(objArr2, objArr2, i + i2, i, this.c);
            this.c += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void k() {
        this.modCount++;
    }

    private final Object writeReplace() {
        if (this.d) {
            return new arow(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        a.O(i, this.c);
        g(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        a.O(i, this.c);
        int size = collection.size();
        f(i, collection, size);
        return size > 0;
    }

    public final int b(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(this.b[i6]) == z) {
                Object[] objArr = this.b;
                objArr[i + i4] = objArr[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        Object[] objArr2 = this.b;
        aqil.y(objArr2, objArr2, i + i4, i + i2, this.c);
        Object[] objArr3 = this.b;
        int i8 = this.c;
        arrj.y(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            k();
        }
        this.c -= i7;
        return i7;
    }

    @Override // defpackage.arnm
    public final int c() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        i(0, this.c);
    }

    @Override // defpackage.arnm
    public final Object d(int i) {
        h();
        a.N(i, this.c);
        return e(i);
    }

    public final Object e(int i) {
        k();
        Object[] objArr = this.b;
        Object obj = objArr[i];
        aqil.y(objArr, objArr, i, i + 1, this.c);
        arrj.x(this.b, this.c - 1);
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (arrj.z(this.b, 0, this.c, (List) obj)) {
            return true;
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        k();
        j(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i + i3] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        k();
        j(i, 1);
        this.b[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.N(i, this.c);
        return this.b[i];
    }

    public final void h() {
        if (!this.d) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return arrj.v(this.b, 0, this.c);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            k();
        }
        Object[] objArr = this.b;
        aqil.y(objArr, objArr, i, i + i2, this.c);
        Object[] objArr2 = this.b;
        int i3 = this.c;
        arrj.y(objArr2, i3 - i2, i3);
        this.c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.c; i++) {
            if (d.F(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (d.F(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        if (b(0, this.c, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        if (b(0, this.c, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        a.N(i, this.c);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.P(i, i2, this.c);
        return new arol(this.b, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return aqil.e(this.b, 0, this.c);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return arrj.w(this.b, 0, this.c, this);
    }

    public aron(int i) {
        this.b = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        a.O(i, this.c);
        return new arom(this, i, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.b, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        aqil.y(this.b, objArr, 0, 0, i);
        aqjn.I(this.c, objArr);
        return objArr;
    }

    public /* synthetic */ aron(byte[] bArr) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g(this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        f(this.c, collection, size);
        return size > 0;
    }
}
