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
public final class asl implements List<a>, j$.util.List<a>, arse {
    public final List a = new cez();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        Object d();
    }

    public final int a() {
        return ((cez) this.a).a();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, a aVar) {
        defpackage.a.o();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends a> collection) {
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
    public final a get(int i) {
        return (a) this.a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        defpackage.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.contains((a) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return this.a.indexOf((a) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<a> iterator() {
        return new cff((cez) this.a, 0);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return this.a.lastIndexOf((a) obj);
    }

    @Override // java.util.List
    public final ListIterator<a> listIterator() {
        return new cff((cez) this.a, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, asl$a] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ a remove(int i) {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, asl$a] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ a set(int i, a aVar) {
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
    public final java.util.List<a> subList(int i, int i2) {
        return this.a.subList(i, i2);
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
    public final ListIterator<a> listIterator(int i) {
        return new cff((cez) this.a, i);
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
