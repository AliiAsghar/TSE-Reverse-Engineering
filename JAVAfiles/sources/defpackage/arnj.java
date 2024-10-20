package defpackage;

import j$.util.List;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arnj<E> extends arne<E> implements List<E>, j$.util.List<E>, arse {
    @Override // java.util.List
    public final void add(int i, Object obj) {
        a.o();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return a.s();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        collection.getClass();
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!d.F(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        int i2 = 1;
        for (E e : this) {
            int i3 = i2 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!d.F(it.next(), obj)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new arng(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (d.F(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new arnh(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return a.l();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        a.q();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return a.n();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        a.r();
    }

    @Override // defpackage.arne, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return new arni(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new arnh(this, i);
    }
}
