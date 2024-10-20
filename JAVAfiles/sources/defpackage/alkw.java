package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class alkw extends AbstractCollection {
    final Object a;
    Collection b;
    final alkw c;
    final Collection d;
    final /* synthetic */ alla e;

    public alkw(alla allaVar, Object obj, Collection collection, alkw alkwVar) {
        Collection collection2;
        this.e = allaVar;
        this.a = obj;
        this.b = collection;
        this.c = alkwVar;
        if (alkwVar == null) {
            collection2 = null;
        } else {
            collection2 = alkwVar.b;
        }
        this.d = collection2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        alkw alkwVar = this.c;
        if (alkwVar != null) {
            alkwVar.a();
            return;
        }
        alla allaVar = this.e;
        allaVar.a.put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.e.b++;
            if (isEmpty) {
                a();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        alkw alkwVar = this.c;
        if (alkwVar != null) {
            alkwVar.b();
            alkw alkwVar2 = this.c;
            if (alkwVar2.b != this.d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.b.isEmpty()) {
            alla allaVar = this.e;
            Collection collection = (Collection) allaVar.a.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        alkw alkwVar = this.c;
        if (alkwVar != null) {
            alkwVar.c();
        } else if (this.b.isEmpty()) {
            alla allaVar = this.e;
            allaVar.a.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.b -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new alkv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            alla allaVar = this.e;
            allaVar.b--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}
