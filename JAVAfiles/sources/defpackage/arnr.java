package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arnr extends arnm {
    private static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    private final int g(int i) {
        if (i == 0) {
            return aqil.i(this.b);
        }
        return i - 1;
    }

    private final int h(int i) {
        if (i == aqil.i(this.b)) {
            return 0;
        }
        return i + 1;
    }

    private final int i(int i) {
        if (i < 0) {
            return i + this.b.length;
        }
        return i;
    }

    private final int j(int i) {
        int length = this.b.length;
        if (i >= length) {
            return i - length;
        }
        return i;
    }

    private final void k(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c += collection.size();
    }

    private final void l(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i <= length) {
                return;
            }
            if (objArr == d) {
                this.b = new Object[arrn.r(i, 10)];
                return;
            }
            Object[] objArr2 = new Object[aqil.M(length, i)];
            aqil.y(objArr, objArr2, 0, this.a, length);
            Object[] objArr3 = this.b;
            int length2 = objArr3.length;
            int i2 = this.a;
            aqil.y(objArr3, objArr2, length2 - i2, 0, i2);
            this.a = 0;
            this.b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final void m(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            aqil.d(objArr, null, i, i2);
        } else {
            aqil.d(objArr, null, i, objArr.length);
            aqil.d(this.b, null, 0, i2);
        }
    }

    private final void n() {
        this.modCount++;
    }

    public final Object a() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a.O(i, this.c);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        n();
        l(this.c + 1);
        int j = j(this.a + i);
        int i2 = this.c;
        if (i < ((i2 + 1) >> 1)) {
            int g = g(j);
            int g2 = g(this.a);
            int i3 = this.a;
            if (g >= i3) {
                Object[] objArr = this.b;
                objArr[g2] = objArr[i3];
                aqil.y(objArr, objArr, i3, i3 + 1, g + 1);
            } else {
                Object[] objArr2 = this.b;
                aqil.y(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                aqil.y(objArr3, objArr3, 0, 1, g + 1);
            }
            this.b[g] = obj;
            this.a = g2;
        } else {
            int j2 = j(this.a + i2);
            if (j < j2) {
                Object[] objArr4 = this.b;
                aqil.y(objArr4, objArr4, j + 1, j, j2);
            } else {
                Object[] objArr5 = this.b;
                aqil.y(objArr5, objArr5, 1, 0, j2);
                Object[] objArr6 = this.b;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                aqil.y(objArr6, objArr6, j + 1, j, length);
            }
            this.b[j] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        a.O(i, this.c);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        n();
        l(this.c + collection.size());
        int j = j(this.a + this.c);
        int j2 = j(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i2 = this.a;
            int i3 = i2 - size;
            if (j2 < i2) {
                Object[] objArr = this.b;
                aqil.y(objArr, objArr, i3, i2, objArr.length);
                if (size >= j2) {
                    Object[] objArr2 = this.b;
                    aqil.y(objArr2, objArr2, objArr2.length - size, 0, j2);
                } else {
                    Object[] objArr3 = this.b;
                    aqil.y(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    aqil.y(objArr4, objArr4, 0, size, j2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                aqil.y(objArr5, objArr5, i3, i2, j2);
            } else {
                Object[] objArr6 = this.b;
                int length = objArr6.length;
                i3 += length;
                int i4 = length - i3;
                if (i4 >= j2 - i2) {
                    aqil.y(objArr6, objArr6, i3, i2, j2);
                } else {
                    aqil.y(objArr6, objArr6, i3, i2, i2 + i4);
                    Object[] objArr7 = this.b;
                    aqil.y(objArr7, objArr7, 0, this.a + i4, j2);
                }
            }
            this.a = i3;
            k(i(j2 - size), collection);
        } else {
            int i5 = j2 + size;
            if (j2 < j) {
                int i6 = size + j;
                Object[] objArr8 = this.b;
                int length2 = objArr8.length;
                if (i6 <= length2) {
                    aqil.y(objArr8, objArr8, i5, j2, j);
                } else if (i5 >= length2) {
                    aqil.y(objArr8, objArr8, i5 - length2, j2, j);
                } else {
                    int i7 = j - (i6 - length2);
                    aqil.y(objArr8, objArr8, 0, i7, j);
                    Object[] objArr9 = this.b;
                    aqil.y(objArr9, objArr9, i5, j2, i7);
                }
            } else {
                Object[] objArr10 = this.b;
                aqil.y(objArr10, objArr10, size, 0, j);
                Object[] objArr11 = this.b;
                int length3 = objArr11.length;
                if (i5 >= length3) {
                    aqil.y(objArr11, objArr11, i5 - length3, j2, length3);
                } else {
                    aqil.y(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.b;
                    aqil.y(objArr12, objArr12, i5, j2, objArr12.length - size);
                }
            }
            k(j2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        l(this.c + 1);
        int g = g(this.a);
        this.a = g;
        this.b[g] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        n();
        l(this.c + 1);
        this.b[j(this.a + this.c)] = obj;
        this.c++;
    }

    public final Object b() {
        if (!isEmpty()) {
            return this.b[j(this.a + aqjn.z(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // defpackage.arnm
    public final int c() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            m(this.a, j(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arnm
    public final Object d(int i) {
        a.N(i, this.c);
        if (i == aqjn.z(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        n();
        int j = j(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[j];
        if (i < (this.c >> 1)) {
            int i2 = this.a;
            if (j >= i2) {
                aqil.y(objArr, objArr, i2 + 1, i2, j);
            } else {
                aqil.y(objArr, objArr, 1, 0, j);
                Object[] objArr2 = this.b;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.a;
                aqil.y(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.b;
            int i4 = this.a;
            objArr3[i4] = null;
            this.a = h(i4);
        } else {
            int j2 = j(this.a + aqjn.z(this));
            if (j <= j2) {
                Object[] objArr4 = this.b;
                aqil.y(objArr4, objArr4, j, j + 1, j2 + 1);
            } else {
                Object[] objArr5 = this.b;
                aqil.y(objArr5, objArr5, j, j + 1, objArr5.length);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                aqil.y(objArr6, objArr6, 0, 1, j2 + 1);
            }
            this.b[j2] = null;
        }
        this.c--;
        return obj;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.b[j(this.a + aqjn.z(this))];
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.N(i, this.c);
        return this.b[j(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int j = j(this.a + this.c);
        int i2 = this.a;
        if (i2 < j) {
            while (i2 < j) {
                if (!d.F(obj, this.b[i2])) {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 >= j) {
            int length = this.b.length;
            while (i2 < length) {
                if (!d.F(obj, this.b[i2])) {
                    i2++;
                }
            }
            for (int i3 = 0; i3 < j; i3++) {
                if (d.F(obj, this.b[i3])) {
                    i2 = i3 + this.b.length;
                    i = this.a;
                    return i2 - i;
                }
            }
            return -1;
        }
        return -1;
        i = this.a;
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        int j = j(this.a + this.c);
        int i3 = this.a;
        if (i3 < j) {
            i = j - 1;
            if (i3 <= i) {
                while (!d.F(obj, this.b[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.a;
            }
            return -1;
        }
        if (i3 > j) {
            for (int i4 = j - 1; i4 >= 0; i4--) {
                if (d.F(obj, this.b[i4])) {
                    i = i4 + this.b.length;
                    i2 = this.a;
                    break;
                }
            }
            i = aqil.i(this.b);
            int i5 = this.a;
            if (i5 <= i) {
                while (!d.F(obj, this.b[i])) {
                    if (i != i5) {
                        i--;
                    }
                }
                i2 = this.a;
            }
        }
        return -1;
        return i - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int j;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int j2 = j(this.a + this.c);
            int i = this.a;
            if (i < j2) {
                j = i;
                while (i < j2) {
                    Object obj = this.b[i];
                    if (!collection.contains(obj)) {
                        this.b[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                aqil.d(this.b, null, j, j2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[j] = obj3;
                        j = h(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.c = i(j - this.a);
                return true;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            n();
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = h(i);
            this.c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            n();
            int j = j(this.a + aqjn.z(this));
            Object[] objArr = this.b;
            Object obj = objArr[j];
            objArr[j] = null;
            this.c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a.P(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.c) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            n();
            if (i < this.c - i2) {
                int j = j(this.a + (i - 1));
                int j2 = j(this.a + (i2 - 1));
                while (i > 0) {
                    int i4 = j + 1;
                    int min = Math.min(i, Math.min(i4, j2 + 1));
                    Object[] objArr = this.b;
                    int i5 = j2 - min;
                    int i6 = j - min;
                    aqil.y(objArr, objArr, i5 + 1, i6 + 1, i4);
                    j = i(i6);
                    j2 = i(i5);
                    i -= min;
                }
                int j3 = j(this.a + i3);
                m(this.a, j3);
                this.a = j3;
            } else {
                int j4 = j(this.a + i2);
                int j5 = j(this.a + i);
                int i7 = this.c;
                while (true) {
                    i7 -= i2;
                    if (i7 <= 0) {
                        break;
                    }
                    int length = this.b.length;
                    i2 = Math.min(i7, Math.min(length - j4, length - j5));
                    Object[] objArr2 = this.b;
                    int i8 = j4 + i2;
                    aqil.y(objArr2, objArr2, j5, j4, i8);
                    j4 = j(i8);
                    j5 = j(j5 + i2);
                }
                int j6 = j(this.a + this.c);
                m(i(j6 - i3), j6);
            }
            this.c -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int j;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int j2 = j(this.a + this.c);
            int i = this.a;
            if (i < j2) {
                j = i;
                while (i < j2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                aqil.d(this.b, null, j, j2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[j] = obj3;
                        j = h(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.c = i(j - this.a);
                return true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a.N(i, this.c);
        int j = j(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[j];
        objArr[j] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int j = j(this.a + this.c);
        int i2 = this.a;
        if (i2 < j) {
            aqil.K(this.b, objArr, i2, j, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            aqil.y(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.b;
            aqil.y(objArr3, objArr, objArr3.length - this.a, 0, j);
        }
        aqjn.I(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        l(this.c + collection.size());
        k(j(this.a + this.c), collection);
        return true;
    }
}
