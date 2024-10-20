package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cco<K, V> extends arnp<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, Collection<Map.Entry<? extends K, ? extends V>>, j$.util.Set<Map.Entry<? extends K, ? extends V>>, arse {
    private final cce a;

    public cco(cce cceVar) {
        this.a = cceVar;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.e();
    }

    @Override // defpackage.arne, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object obj2 = this.a.get(entry.getKey());
        if (obj2 != null) {
            return d.F(obj2, entry.getValue());
        }
        if (entry.getValue() != null || !this.a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.arnp, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ccp(this.a.b);
    }
}
