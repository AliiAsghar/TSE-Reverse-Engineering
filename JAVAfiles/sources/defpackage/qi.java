package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qi implements qm {
    final SparseArray a = new SparseArray();
    int b = 0;

    @Override // defpackage.qm
    public final ni a(int i) {
        ni niVar = (ni) this.a.get(i);
        if (niVar != null) {
            return niVar;
        }
        throw new IllegalArgumentException(a.bV(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.qm
    public final ql b(ni niVar) {
        return new qh(this, niVar);
    }
}
