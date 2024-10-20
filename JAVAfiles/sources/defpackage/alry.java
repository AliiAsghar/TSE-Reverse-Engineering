package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class alry extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set == null) {
            Set b = b();
            this.a = b;
            return b;
        }
        return set;
    }

    public Set g() {
        return new alrv(this);
    }

    public Collection gW() {
        return new alrx(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set == null) {
            Set g = g();
            this.b = g;
            return g;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection == null) {
            Collection gW = gW();
            this.c = gW;
            return gW;
        }
        return collection;
    }
}
