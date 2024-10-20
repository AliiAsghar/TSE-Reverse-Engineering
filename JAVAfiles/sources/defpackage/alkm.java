package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
class alkm extends alry {
    final transient Map a;
    final /* synthetic */ alla b;

    public alkm(alla allaVar, Map map) {
        this.b = allaVar;
        this.a = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return new alnv(key, this.b.c(key, (Collection) entry.getValue()));
    }

    @Override // defpackage.alry
    public final Set b() {
        return new alkk(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        alla allaVar = this.b;
        if (map == allaVar.a) {
            allaVar.o();
        } else {
            alzz.aD(new alkl(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.a.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) alzz.ah(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.alry, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.u();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.b.a();
        a.addAll(collection);
        this.b.b -= collection.size();
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
