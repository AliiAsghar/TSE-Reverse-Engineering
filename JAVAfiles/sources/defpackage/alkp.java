package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
class alkp extends alrv {
    final /* synthetic */ alla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alkp(alla allaVar, Map map) {
        super(map);
        this.a = allaVar;
    }

    @Override // defpackage.alrv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        alzz.aD(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.d.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.alrv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new alko(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.alrv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.a.b -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
