package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
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
public final class dlo extends dlg implements List<dlh>, j$.util.List<dlh>, arse {
    public final List d;

    public dlo(List list) {
        this.d = list;
        if (!list.isEmpty()) {
            return;
        }
        doz.c("At least one font should be passed to FontFamily");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, dlh dlhVar) {
        a.o();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends dlh> collection) {
        return a.s();
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        a.p();
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        a.p();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof dlh)) {
            return false;
        }
        return this.d.contains((dlh) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dlo) && d.F(this.d, ((dlo) obj).d)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ dlh get(int i) {
        return (dlh) this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof dlh)) {
            return -1;
        }
        return this.d.indexOf((dlh) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<dlh> iterator() {
        return this.d.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof dlh)) {
            return -1;
        }
        return this.d.lastIndexOf((dlh) obj);
    }

    @Override // java.util.List
    public final ListIterator<dlh> listIterator() {
        return this.d.listIterator();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dlh, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ dlh remove(int i) {
        return a.l();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return a.i();
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        return a.m();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        return a.m();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        a.q();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return a.i();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dlh, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ dlh set(int i, dlh dlhVar) {
        return a.n();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.d.size();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        a.r();
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
    public final java.util.List<dlh> subList(int i, int i2) {
        return this.d.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=" + this.d + ')';
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return a.i();
    }

    @Override // java.util.List
    public final ListIterator<dlh> listIterator(int i) {
        return this.d.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return a.h();
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
