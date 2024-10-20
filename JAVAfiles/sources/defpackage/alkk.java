package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alkk extends alrr {
    final /* synthetic */ alkm a;

    public alkk(alkm alkmVar) {
        this.a = alkmVar;
    }

    @Override // defpackage.alrr
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.alrr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return albo.u(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new alkl(this.a);
    }

    @Override // defpackage.alrr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        alkm alkmVar = this.a;
        Object key = entry.getKey();
        alla allaVar = alkmVar.b;
        Map map = allaVar.a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            allaVar.b -= size;
            return true;
        }
        return true;
    }
}
