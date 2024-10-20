package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arol<E> extends arnm<E> implements List<E>, RandomAccess, Serializable, arsh {
    public Object[] a;
    public final int b;
    public int c;
    public final aron d;
    private final arol e;

    public arol(Object[] objArr, int i, int i2, arol arolVar, aron aronVar) {
        objArr.getClass();
        aronVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = arolVar;
        this.d = aronVar;
        this.modCount = aronVar.modCount;
    }

    private final int b(int i, int i2, Collection collection, boolean z) {
        int b;
        arol arolVar = this.e;
        if (arolVar != null) {
            b = arolVar.b(i, i2, collection, z);
        } else {
            aron aronVar = this.d;
            aron aronVar2 = aron.a;
            b = aronVar.b(i, i2, collection, z);
        }
        if (b > 0) {
            j();
        }
        this.c -= b;
        return b;
    }

    private final Object e(int i) {
        Object e;
        j();
        arol arolVar = this.e;
        if (arolVar != null) {
            e = arolVar.e(i);
        } else {
            aron aronVar = this.d;
            aron aronVar2 = aron.a;
            e = aronVar.e(i);
        }
        this.c--;
        return e;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        arol arolVar = this.e;
        if (arolVar != null) {
            arolVar.f(i, collection, i2);
        } else {
            aron aronVar = this.d;
            aron aronVar2 = aron.a;
            aronVar.f(i, collection, i2);
        }
        aron aronVar3 = this.d;
        aron aronVar4 = aron.a;
        this.a = aronVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        arol arolVar = this.e;
        if (arolVar != null) {
            arolVar.g(i, obj);
        } else {
            aron aronVar = this.d;
            aron aronVar2 = aron.a;
            aronVar.g(i, obj);
        }
        aron aronVar3 = this.d;
        aron aronVar4 = aron.a;
        this.a = aronVar3.b;
        this.c++;
    }

    private final void h() {
        aron aronVar = aron.a;
        if (this.d.modCount == this.modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (!l()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        arol arolVar = this.e;
        if (arolVar != null) {
            arolVar.k(i, i2);
        } else {
            aron aronVar = this.d;
            aron aronVar2 = aron.a;
            aronVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        aron aronVar = aron.a;
        return this.d.d;
    }

    private final Object writeReplace() {
        if (l()) {
            return new arow(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        a.O(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        a.O(i, this.c);
        int size = collection.size();
        f(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.arnm
    public final int c() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // defpackage.arnm
    public final Object d(int i) {
        i();
        h();
        a.N(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (arrj.z(this.a, this.b, this.c, (List) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        a.N(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return arrj.v(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (d.F(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
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
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (d.F(this.a[this.b + i], obj)) {
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
        i();
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
        i();
        h();
        if (b(this.b, this.c, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        if (b(this.b, this.c, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        a.N(i, this.c);
        Object[] objArr = this.a;
        int i2 = this.b + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.P(i, i2, this.c);
        return new arol(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return aqil.e(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return arrj.w(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        a.O(i, this.c);
        return new arom(this, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        Object[] objArr3 = this.a;
        int i3 = this.b;
        aqil.y(objArr3, objArr, 0, i3, i + i3);
        aqjn.I(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}
