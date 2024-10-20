package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apbe implements Iterator {
    private final Iterator a;

    public apbe(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        if (entry.getValue() instanceof apbf) {
            return new apbd(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
