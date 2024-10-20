package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qh implements ql {
    final ni a;
    final /* synthetic */ qi b;
    private final SparseIntArray c = new SparseIntArray(1);
    private final SparseIntArray d = new SparseIntArray(1);

    public qh(qi qiVar, ni niVar) {
        this.b = qiVar;
        this.a = niVar;
    }

    @Override // defpackage.ql
    public final int a(int i) {
        int indexOfKey = this.d.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.a.c);
    }

    @Override // defpackage.ql
    public final int b(int i) {
        int indexOfKey = this.c.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.c.valueAt(indexOfKey);
        }
        qi qiVar = this.b;
        ni niVar = this.a;
        int i2 = qiVar.b;
        qiVar.b = i2 + 1;
        qiVar.a.put(i2, niVar);
        this.c.put(i, i2);
        this.d.put(i2, i);
        return i2;
    }
}
