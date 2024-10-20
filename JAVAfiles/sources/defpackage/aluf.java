package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aluf<V> extends alug<Collection<V>> {
    private static final long serialVersionUID = 0;

    public aluf(Collection collection, Object obj) {
        super(collection, obj);
    }

    @Override // defpackage.alug, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new alue(this, super.iterator());
    }
}
