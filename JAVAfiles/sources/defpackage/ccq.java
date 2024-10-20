package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccq<K, V> extends arnp<K> implements Set<K>, Collection<K>, j$.util.Set<K>, arse {
    private final cce a;

    public ccq(cce cceVar) {
        this.a = cceVar;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.e();
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.arnp, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new ccr(this.a.b);
    }
}
