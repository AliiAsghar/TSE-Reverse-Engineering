package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import defpackage.cee;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsn<T extends View> extends drx {
    private final int A;
    private final String B;
    private cee.a C;
    public final View w;
    public arqr x;
    public arqr y;
    private final cee z;

    public dsn(Context context, bwr bwrVar, View view, cqa cqaVar, cee ceeVar, int i, czb czbVar) {
        super(context, bwrVar, cqaVar, view, czbVar);
        Object obj;
        this.w = view;
        this.z = ceeVar;
        this.A = i;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.B = valueOf;
        if (ceeVar != null) {
            obj = ceeVar.c(valueOf);
        } else {
            obj = null;
        }
        SparseArray<Parcelable> sparseArray = obj instanceof SparseArray ? (SparseArray) obj : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (ceeVar != null) {
            o(ceeVar.b(valueOf, new dsk(this)));
        }
        arqr arqrVar = dsa.a;
        this.x = arqrVar;
        this.y = arqrVar;
    }

    public final void o(cee.a aVar) {
        cee.a aVar2 = this.C;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.C = aVar;
    }
}
