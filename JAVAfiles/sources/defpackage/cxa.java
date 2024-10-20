package defpackage;

import defpackage.cga;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxa implements List<cga.c>, j$.util.List<cga.c>, arse {
    public Object[] a = new Object[16];
    public long[] b = new long[16];
    public int c = -1;
    public int d;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a implements ListIterator<cga.c>, arse {
        private int b;
        private final int c;
        private final int d;

        public a(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(cga.c cVar) {
            defpackage.a.p();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            if (this.b < this.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.b > this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            Object[] objArr = cxa.this.a;
            int i = this.b;
            this.b = i + 1;
            Object obj = objArr[i];
            obj.getClass();
            return (cga.c) obj;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b - this.c;
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ cga.c previous() {
            Object[] objArr = cxa.this.a;
            int i = this.b - 1;
            this.b = i;
            Object obj = objArr[i];
            obj.getClass();
            return (cga.c) obj;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.b - this.c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            defpackage.a.g();
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(cga.c cVar) {
            defpackage.a.p();
        }

        public /* synthetic */ a(cxa cxaVar, int i, int i2) {
            this(1 == (i2 & 1) ? 0 : i, 0, cxaVar.d);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class b implements List<cga.c>, j$.util.List<cga.c>, arse {
        private final int b;
        private final int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final int a() {
            return this.c - this.b;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, cga.c cVar) {
            defpackage.a.o();
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends cga.c> collection) {
            return defpackage.a.s();
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            defpackage.a.p();
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            defpackage.a.p();
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            defpackage.a.g();
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof cga.c) || indexOf((cga.c) obj) == -1) {
                return false;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((cga.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ cga.c get(int i) {
            Object obj = cxa.this.a[i + this.b];
            obj.getClass();
            return (cga.c) obj;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof cga.c)) {
                return -1;
            }
            cga.c cVar = (cga.c) obj;
            int i = this.b;
            int i2 = this.c;
            if (i > i2) {
                return -1;
            }
            while (!d.F(cxa.this.a[i], cVar)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            if (a() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<cga.c> iterator() {
            int i = this.c;
            cxa cxaVar = cxa.this;
            int i2 = this.b;
            return new a(i2, i2, i);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof cga.c)) {
                return -1;
            }
            cga.c cVar = (cga.c) obj;
            int i = this.c;
            int i2 = this.b;
            if (i2 > i) {
                return -1;
            }
            while (!d.F(cxa.this.a[i], cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.b;
        }

        @Override // java.util.List
        public final ListIterator<cga.c> listIterator() {
            int i = this.c;
            cxa cxaVar = cxa.this;
            int i2 = this.b;
            return new a(i2, i2, i);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, cga$c] */
        @Override // java.util.List
        public final /* bridge */ /* synthetic */ cga.c remove(int i) {
            return defpackage.a.l();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(java.util.Collection collection) {
            return defpackage.a.i();
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            return defpackage.a.m();
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            return defpackage.a.m();
        }

        @Override // java.util.List, j$.util.List
        public final void replaceAll(UnaryOperator unaryOperator) {
            defpackage.a.q();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(java.util.Collection collection) {
            return defpackage.a.i();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, cga$c] */
        @Override // java.util.List
        public final /* bridge */ /* synthetic */ cga.c set(int i, cga.c cVar) {
            return defpackage.a.n();
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List, j$.util.List
        public final void sort(Comparator comparator) {
            defpackage.a.r();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
        public final /* synthetic */ Spliterator spliterator() {
            return List.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.List
        public final java.util.List<cga.c> subList(int i, int i2) {
            int i3 = this.b;
            return new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return arri.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            return defpackage.a.h();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(java.util.Collection collection) {
            return defpackage.a.i();
        }

        @Override // java.util.List
        public final ListIterator<cga.c> listIterator(int i) {
            int i2 = this.b;
            return new a(i + i2, i2, this.c);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return defpackage.a.h();
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return arri.b(this, objArr);
        }
    }

    public final long a() {
        long a2 = cxb.a(Float.POSITIVE_INFINITY, false);
        int i = this.c + 1;
        int z = aqjn.z(this);
        if (i <= z) {
            while (true) {
                long j = this.b[i];
                if (cww.b(j, a2) < 0) {
                    a2 = j;
                }
                if (cww.a(a2) < brg.a && cww.c(a2)) {
                    return a2;
                }
                if (i == z) {
                    break;
                }
                i++;
            }
        }
        return a2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, cga.c cVar) {
        defpackage.a.o();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends cga.c> collection) {
        return defpackage.a.s();
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        defpackage.a.p();
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        defpackage.a.p();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cga.c get(int i) {
        Object obj = this.a[i];
        obj.getClass();
        return (cga.c) obj;
    }

    public final void c() {
        int i = this.c;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i >= length) {
            int i2 = length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            copyOf.getClass();
            this.a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.b, i2);
            copyOf2.getClass();
            this.b = copyOf2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        d();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof cga.c) || indexOf((cga.c) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((cga.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i = this.c + 1;
        int z = aqjn.z(this);
        if (i <= z) {
            while (true) {
                this.a[i] = null;
                if (i == z) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.d = this.c + 1;
    }

    public final boolean e(float f, boolean z) {
        if (this.c == aqjn.z(this)) {
            return true;
        }
        if (cww.b(a(), cxb.a(f, z)) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof cga.c)) {
            return -1;
        }
        cga.c cVar = (cga.c) obj;
        int z = aqjn.z(this);
        if (z < 0) {
            return -1;
        }
        int i = 0;
        while (!d.F(this.a[i], cVar)) {
            if (i == z) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<cga.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof cga.c)) {
            return -1;
        }
        cga.c cVar = (cga.c) obj;
        for (int z = aqjn.z(this); z >= 0; z--) {
            if (d.F(this.a[z], cVar)) {
                return z;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<cga.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, cga$c] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ cga.c remove(int i) {
        return defpackage.a.l();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return defpackage.a.i();
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        return defpackage.a.m();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        return defpackage.a.m();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        defpackage.a.q();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.a.i();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, cga$c] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ cga.c set(int i, cga.c cVar) {
        return defpackage.a.n();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        defpackage.a.r();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List<cga.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return defpackage.a.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return defpackage.a.i();
    }

    @Override // java.util.List
    public final ListIterator<cga.c> listIterator(int i) {
        return new a(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return defpackage.a.h();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return arri.b(this, objArr);
    }
}
