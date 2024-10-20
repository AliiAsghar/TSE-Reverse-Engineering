package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vg implements Set, arse {
    final /* synthetic */ vh b;

    public vg(vh vhVar) {
        this.b = vhVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return a.h();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        return a.i();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        a.g();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return arrn.b(new ub(this.b, (arpe) null, 2));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return a.h();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        return a.i();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return a.i();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.b.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return arri.b(this, objArr);
    }
}
