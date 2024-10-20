package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccs<K, V> extends arne<V> implements Collection<V>, j$.util.Collection<V>, arse {
    private final cce a;

    public ccs(cce cceVar) {
        this.a = cceVar;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.e();
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new cct(this.a.b);
    }
}
