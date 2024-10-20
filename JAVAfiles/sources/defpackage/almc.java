package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almc extends AbstractCollection {
    final /* synthetic */ almd a;

    public almc(almd almdVar) {
        this.a = almdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        almd almdVar = this.a;
        Map j = almdVar.j();
        if (j != null) {
            return j.values().iterator();
        }
        return new allx(almdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
