package defpackage;

import android.util.SparseArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qk implements qm {
    final SparseArray a = new SparseArray();

    @Override // defpackage.qm
    public final ni a(int i) {
        List list = (List) this.a.get(i);
        if (list != null && !list.isEmpty()) {
            return (ni) list.get(0);
        }
        throw new IllegalArgumentException(a.bV(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.qm
    public final ql b(ni niVar) {
        return new qj(this, niVar);
    }
}
