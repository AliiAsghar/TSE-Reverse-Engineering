package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alla extends alli implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public alla(Map map) {
        d.s(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override // defpackage.alrz
    public Collection b(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return c(obj, collection);
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.alrz
    public final int e() {
        return this.b;
    }

    @Override // defpackage.alli
    public final Collection f() {
        if (this instanceof altk) {
            return new allg(this);
        }
        return new alsf(this);
    }

    public Collection g() {
        throw null;
    }

    @Override // defpackage.alli
    public final Collection h() {
        return new allh(this);
    }

    public Collection i(Collection collection) {
        throw null;
    }

    @Override // defpackage.alli
    public final Iterator j() {
        return new alkj(this);
    }

    @Override // defpackage.alli
    public final Iterator k() {
        return new alki(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List l(Object obj, List list, alkw alkwVar) {
        if (list instanceof RandomAccess) {
            return new alks(this, obj, list, alkwVar);
        }
        return new alky(this, obj, list, alkwVar);
    }

    @Override // defpackage.alli
    public Map m() {
        return new alkm(this, this.a);
    }

    @Override // defpackage.alli
    public Set n() {
        return new alkp(this, this.a);
    }

    @Override // defpackage.alrz
    public final void o() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            d.s(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.alli, defpackage.alrz
    public final void q(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection a = a();
            if (a.add(obj2)) {
                this.b++;
                this.a.put(obj, a);
                return;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.b++;
        }
    }
}
