package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alli<K, V> implements alrz<K, V> {
    private transient Collection a;
    private transient Set b;
    private transient Collection c;
    private transient Map d;

    @Override // defpackage.alrz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof alrz)) {
            return false;
        }
        return t().equals(((alrz) obj).t());
    }

    public abstract Collection f();

    public abstract Collection h();

    @Override // defpackage.alrz
    public final int hashCode() {
        return t().hashCode();
    }

    public abstract Iterator j();

    public Iterator k() {
        throw null;
    }

    public abstract Map m();

    public abstract Set n();

    @Override // defpackage.alrz
    public void q(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.alrz
    public Collection r() {
        Collection collection = this.a;
        if (collection == null) {
            Collection f = f();
            this.a = f;
            return f;
        }
        return collection;
    }

    @Override // defpackage.alrz
    public Collection s() {
        Collection collection = this.c;
        if (collection == null) {
            Collection h = h();
            this.c = h;
            return h;
        }
        return collection;
    }

    @Override // defpackage.alrz
    public Map t() {
        Map map = this.d;
        if (map == null) {
            Map m = m();
            this.d = m;
            return m;
        }
        return map;
    }

    public final String toString() {
        return t().toString();
    }

    @Override // defpackage.alrz
    public Set u() {
        Set set = this.b;
        if (set == null) {
            Set n = n();
            this.b = n;
            return n;
        }
        return set;
    }

    @Override // defpackage.alrz
    public final boolean v(Object obj, Object obj2) {
        Collection collection = (Collection) t().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alrz
    public boolean w(Object obj) {
        Iterator<V> it = t().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alrz
    public boolean x() {
        if (e() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alrz
    public boolean y(Object obj, Object obj2) {
        Collection collection = (Collection) t().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }
}
