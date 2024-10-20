package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alrw extends alru {
    final Map a;
    final alrs b;

    public alrw(Map map, alrs alrsVar) {
        map.getClass();
        this.a = map;
        this.b = alrsVar;
    }

    @Override // defpackage.alru
    public final Iterator a() {
        return alzz.aC(this.a.entrySet().iterator(), alzz.ad(this.b));
    }

    @Override // defpackage.alru, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null && !this.a.containsKey(obj)) {
            return null;
        }
        return this.b.a(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.containsKey(obj)) {
            return this.b.a(obj, this.a.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new alrx(this);
    }
}
