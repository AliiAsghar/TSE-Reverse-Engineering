package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alkz extends alkw implements Set {
    final /* synthetic */ alla f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alkz(alla allaVar, Object obj, Set set) {
        super(allaVar, obj, set, null);
        this.f = allaVar;
    }

    @Override // defpackage.alkw, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean Q = alzz.Q((Set) this.b, collection);
        if (Q) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return Q;
    }
}
