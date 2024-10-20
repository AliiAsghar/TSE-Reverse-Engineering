package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghi {
    public final RecyclerView a;
    public final no b;
    public final Context c;
    public final ico h;
    public final qdq i;
    public gvf j;
    public gvf k;
    public gvf l;
    public final adfg f = new adfg();
    public final nq g = new nq(null);
    public final int[] d = {1};
    public final int[] e = {3};

    public ghi(RecyclerView recyclerView, qdq qdqVar, ico icoVar) {
        boolean z;
        boolean z2;
        d.s(true);
        d.s(true);
        if (recyclerView != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = recyclerView;
        this.c = recyclerView.getContext();
        no noVar = recyclerView.l;
        this.b = noVar;
        if (noVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        d.s(true);
        d.s(true);
        d.s(true);
        this.h = icoVar;
        this.i = qdqVar;
        d.s(recyclerView != null);
        d.s(true);
    }
}
