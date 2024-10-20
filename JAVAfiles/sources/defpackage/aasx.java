package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasx extends nq {
    final /* synthetic */ aasy a;

    public aasx(aasy aasyVar) {
        this.a = aasyVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        this.a.D();
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        int i2;
        aasy aasyVar = this.a;
        boolean w = aasyVar.w();
        if (aasyVar.r().b() >= 15) {
            return;
        }
        int B = aasyVar.B();
        if (w) {
            RecyclerView recyclerView2 = aasyVar.b;
            recyclerView2.scrollBy(B - recyclerView2.getPaddingLeft(), 0);
        }
        RecyclerView recyclerView3 = aasyVar.b;
        if (true != w) {
            i2 = 0;
        } else {
            i2 = B;
        }
        if (true == w) {
            B = 0;
        }
        recyclerView3.setPadding(i2, 0, B, 0);
    }
}
