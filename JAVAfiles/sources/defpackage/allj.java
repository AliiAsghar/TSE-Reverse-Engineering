package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class allj<E> extends AbstractCollection<E> implements alsj<E> {
    private transient Set a;
    private transient Set b;

    public int a(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.alsj
    public final boolean add(Object obj) {
        a(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection instanceof alsj) {
            alsj alsjVar = (alsj) collection;
            if (alsjVar instanceof alle) {
                alle alleVar = (alle) alsjVar;
                if (alleVar.isEmpty()) {
                    return false;
                }
                for (int a = alleVar.a.a(); a >= 0; a = alleVar.a.e(a)) {
                    a(alleVar.a.h(a), alleVar.a.c(a));
                }
            } else {
                if (alsjVar.isEmpty()) {
                    return false;
                }
                for (alsk alskVar : alsjVar.j()) {
                    a(alskVar.a, alskVar.a());
                }
            }
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        return alzz.aE(this, collection.iterator());
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.alsj
    public final boolean contains(Object obj) {
        if (b(obj) > 0) {
            return true;
        }
        return false;
    }

    public int d(Object obj, int i) {
        throw null;
    }

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return alzz.ab(this, obj);
    }

    public abstract Iterator f();

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.alsj
    public final Set i() {
        Set set = this.a;
        if (set == null) {
            alsl alslVar = new alsl(this);
            this.a = alslVar;
            return alslVar;
        }
        return set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.alsj
    public final Set j() {
        Set set = this.b;
        if (set == null) {
            alsm alsmVar = new alsm(this);
            this.b = alsmVar;
            return alsmVar;
        }
        return set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.alsj
    public final boolean remove(Object obj) {
        if (d(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof alsj) {
            collection = ((alsj) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof alsj) {
            collection = ((alsj) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}
