package defpackage;

import defpackage.cbm;
import defpackage.cez;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfj<T> implements List<T>, arsh {
    public int a;
    private final cez b;
    private final int c;
    private int d;

    /* compiled from: PG */
    /* renamed from: cfj$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 implements ListIterator<T>, arse {
        final /* synthetic */ arrz a;
        final /* synthetic */ cfj b;

        public AnonymousClass1(arrz arrzVar, cfj cfjVar) {
            this.a = arrzVar;
            this.b = cfjVar;
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(Object obj) {
            cfa.b();
            throw new armj();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.a.a < this.b.a - 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.a.a >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.a.a + 1;
            cfa.a(i, this.b.a);
            this.a.a = i;
            return this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a.a + 1;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.a.a;
            cfa.a(i, this.b.a);
            this.a.a = i - 1;
            return this.b.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.a.a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final /* bridge */ /* synthetic */ void remove() {
            cfa.b();
            throw new armj();
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(Object obj) {
            cfa.b();
            throw new armj();
        }
    }

    public cfj(cez cezVar, int i, int i2) {
        this.b = cezVar;
        this.c = i;
        this.d = cezVar.b();
        this.a = i2 - i;
    }

    private final void b() {
        if (this.b.b() == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        Object d = this.b.d(this.c + i);
        this.a--;
        this.d = this.b.b();
        return d;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(this.c + i, obj);
        this.a++;
        this.d = this.b.b();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        boolean addAll = this.b.addAll(i + this.c, collection);
        if (addAll) {
            this.a += collection.size();
            this.d = this.b.b();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        cbm cbmVar;
        ces b;
        boolean g;
        if (this.a > 0) {
            b();
            cez cezVar = this.b;
            int i2 = this.c;
            int i3 = this.a + i2;
            do {
                synchronized (cfa.a) {
                    cfi cfiVar = cezVar.a;
                    cfiVar.getClass();
                    cez.a aVar = (cez.a) cex.e(cfiVar);
                    i = aVar.b;
                    cbmVar = aVar.a;
                }
                cbmVar.getClass();
                cbm.a b2 = cbmVar.b();
                b2.subList(i2, i3).clear();
                cbm a = b2.a();
                if (d.F(a, cbmVar)) {
                    break;
                }
                cfi cfiVar2 = cezVar.a;
                cfiVar2.getClass();
                synchronized (cex.c) {
                    b = cex.b();
                    g = cez.g((cez.a) cex.l(cfiVar2, cezVar, b), i, a, true);
                }
                cex.t(b, cezVar);
            } while (!g);
            this.a = 0;
            this.d = this.b.b();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
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
        b();
        cfa.a(i, this.a);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        arob it = arrn.B(i, this.a + i).iterator();
        while (it.a) {
            int a = it.a();
            if (d.F(obj, this.b.get(a))) {
                return a - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        for (int i = (this.c + this.a) - 1; i >= this.c; i--) {
            if (d.F(obj, this.b.get(i))) {
                return i - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        cbm cbmVar;
        ces b;
        boolean g;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        cez cezVar = this.b;
        int a = cezVar.a();
        do {
            synchronized (cfa.a) {
                cfi cfiVar = cezVar.a;
                cfiVar.getClass();
                cez.a aVar = (cez.a) cex.e(cfiVar);
                i = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm.a b2 = cbmVar.b();
            b2.subList(i2, i3).retainAll(collection);
            cbm a2 = b2.a();
            if (d.F(a2, cbmVar)) {
                break;
            }
            cfi cfiVar2 = cezVar.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = cez.g((cez.a) cex.l(cfiVar2, cezVar, b), i, a2, true);
            }
            cex.t(b, cezVar);
        } while (!g);
        int a3 = a - cezVar.a();
        if (a3 > 0) {
            this.d = this.b.b();
            this.a -= a3;
        }
        if (a3 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        cfa.a(i, this.a);
        b();
        int i2 = this.c;
        cez cezVar = this.b;
        Object obj2 = cezVar.set(i + i2, obj);
        this.d = cezVar.b();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            byy.a("fromIndex or toIndex are out of bounds");
        }
        b();
        cez cezVar = this.b;
        int i3 = this.c;
        return new cfj(cezVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        arrz arrzVar = new arrz();
        arrzVar.a = i - 1;
        return new AnonymousClass1(arrzVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        a(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return arri.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        this.b.add(this.c + this.a, obj);
        this.a++;
        this.d = this.b.b();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.a, collection);
    }
}
