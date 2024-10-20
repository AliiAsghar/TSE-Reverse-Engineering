package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alud<K, V> extends alum<Map.Entry<K, Collection<V>>> {
    private static final long serialVersionUID = 0;

    public alud(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            Set a = a();
            if (!(obj instanceof Map.Entry)) {
                contains = false;
            } else {
                contains = a.contains(alzz.al((Map.Entry) obj));
            }
        }
        return contains;
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean t;
        synchronized (this.g) {
            t = albo.t(a(), collection);
        }
        return t;
    }

    @Override // defpackage.alum, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean P;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            P = alzz.P(a(), obj);
        }
        return P;
    }

    @Override // defpackage.alug, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new aluc(this, super.iterator());
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            Set a = a();
            if (!(obj instanceof Map.Entry)) {
                remove = false;
            } else {
                remove = a.remove(alzz.al((Map.Entry) obj));
            }
        }
        return remove;
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean aG;
        synchronized (this.g) {
            aG = alzz.aG(a().iterator(), collection);
        }
        return aG;
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.g) {
            Iterator it = a().iterator();
            collection.getClass();
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set a = a();
            objArr = new Object[a.size()];
            alzz.aa(a, objArr);
        }
        return objArr;
    }

    @Override // defpackage.alug, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        synchronized (this.g) {
            Set a = a();
            int size = a.size();
            if (objArr.length < size) {
                objArr = alzz.U(objArr, size);
            }
            alzz.aa(a, objArr);
            if (objArr.length > size) {
                objArr[size] = null;
            }
        }
        return objArr;
    }
}
