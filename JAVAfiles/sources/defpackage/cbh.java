package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbh<T> implements RandomAccess {
    public Object[] a;
    public int b = 0;
    private List c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a<T> implements List<T>, arsh {
        private final cbh a;

        public a(cbh cbhVar) {
            this.a = cbhVar;
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.a.f(i, obj);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            return this.a.k(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.a.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.a.l(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            cbi.a(this, i);
            return this.a.a[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.a.a(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            if (this.a.b == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            cbh cbhVar = this.a;
            int i = cbhVar.b;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            Object[] objArr = cbhVar.a;
            while (!d.F(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            cbi.a(this, i);
            return this.a.c(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            if (!collection.isEmpty()) {
                cbh cbhVar = this.a;
                int i = cbhVar.b;
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    cbhVar.m(it.next());
                }
                if (i != cbhVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            cbh cbhVar = this.a;
            int i = cbhVar.b;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!collection.contains(cbhVar.a[i2])) {
                    cbhVar.c(i2);
                }
            }
            if (i != cbhVar.b) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            cbi.a(this, i);
            return this.a.d(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return this.a.b;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            cbi.b(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return arri.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.a.n(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            cbh cbhVar = this.a;
            return cbhVar.k(cbhVar.b, collection);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return arri.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.m(obj);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class b<T> implements List<T>, arsh {
        private final List a;
        private final int b;
        private int c;

        public b(List list, int i, int i2) {
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.a.add(i + this.b, obj);
            this.c++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            this.a.addAll(i + this.b, collection);
            int size = collection.size();
            this.c += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.c = this.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (d.F(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            cbi.a(this, i);
            return this.a.get(i + this.b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (d.F(this.a.get(i2), obj)) {
                    return i2 - this.b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            if (this.c == this.b) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (!d.F(this.a.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    }
                }
                return i - this.b;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            cbi.a(this, i);
            this.c--;
            return this.a.remove(i + this.b);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            int i = this.c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.a.get(i2))) {
                        this.a.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            cbi.a(this, i);
            return this.a.set(i + this.b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return this.c - this.b;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            cbi.b(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return arri.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i = this.c;
            this.c = i + 1;
            this.a.add(i, obj);
            return true;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return arri.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            this.a.addAll(this.c, collection);
            int size = collection.size();
            this.c += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (d.F(this.a.get(i2), obj)) {
                    this.a.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class c<T> implements ListIterator<T>, arse {
        private final List a;
        private int b;

        public c(List list, int i) {
            this.a = list;
            this.b = i;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.a.add(this.b, obj);
            this.b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.b < this.a.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.b;
            this.b = i + 1;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.b - 1;
            this.b = i;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.b - 1;
            this.b = i;
            this.a.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.a.set(this.b, obj);
        }
    }

    public cbh(Object[] objArr) {
        this.a = objArr;
    }

    public static final void q() {
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int a(Object obj) {
        int i = this.b;
        if (i > 0) {
            Object[] objArr = this.a;
            int i2 = 0;
            while (!d.F(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final Object b() {
        if (this.b != 0) {
            return this.a[0];
        }
        q();
        throw new armj();
    }

    public final Object c(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            aqil.y(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final Object d(int i, Object obj) {
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List e() {
        List list = this.c;
        if (list == null) {
            a aVar = new a(this);
            this.c = aVar;
            return aVar;
        }
        return list;
    }

    public final void f(int i, Object obj) {
        h(this.b + 1);
        Object[] objArr = this.a;
        int i2 = this.b;
        if (i != i2) {
            aqil.y(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.b++;
    }

    public final void g() {
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (i >= 0) {
                objArr[i] = null;
            } else {
                this.b = 0;
                return;
            }
        }
    }

    public final void h(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, length + length));
            copyOf.getClass();
            this.a = copyOf;
        }
    }

    public final void i(int i, int i2) {
        if (i2 > i) {
            int i3 = this.b;
            if (i2 < i3) {
                Object[] objArr = this.a;
                aqil.y(objArr, objArr, i, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.b = i5;
        }
    }

    public final void j(Comparator comparator) {
        Object[] objArr = this.a;
        int i = this.b;
        objArr.getClass();
        Arrays.sort(objArr, 0, i, comparator);
    }

    public final boolean k(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        h(this.b + collection.size());
        Object[] objArr = this.a;
        if (i != this.b) {
            aqil.y(objArr, objArr, collection.size() + i, i, this.b);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                aqjn.G();
            }
            objArr[i2 + i] = t;
            i2 = i3;
        }
        this.b += collection.size();
        return true;
    }

    public final boolean l(Object obj) {
        int i = this.b - 1;
        if (i >= 0) {
            for (int i2 = 0; !d.F(this.a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean m(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            c(a2);
            return true;
        }
        return false;
    }

    public final void n(Object obj) {
        h(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        objArr[i] = obj;
        this.b = i + 1;
    }

    public final void o(int i, cbh cbhVar) {
        int i2 = cbhVar.b;
        if (i2 == 0) {
            return;
        }
        h(this.b + i2);
        Object[] objArr = this.a;
        int i3 = this.b;
        if (i != i3) {
            aqil.y(objArr, objArr, cbhVar.b + i, i, i3);
        }
        aqil.y(cbhVar.a, objArr, i, 0, cbhVar.b);
        this.b += cbhVar.b;
    }

    public final void p(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        h(this.b + list.size());
        Object[] objArr = this.a;
        if (i != this.b) {
            aqil.y(objArr, objArr, list.size() + i, i, this.b);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = list.get(i2);
        }
        this.b += list.size();
    }
}
