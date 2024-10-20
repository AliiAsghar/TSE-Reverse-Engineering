package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsk extends arrp implements arqg<Object> {
    final /* synthetic */ dsn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsk(dsn dsnVar) {
        super(0);
        this.a = dsnVar;
    }

    @Override // defpackage.arqg
    public final Object a() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.w.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
