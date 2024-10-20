package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afga extends nq {
    final /* synthetic */ afgb a;
    final /* synthetic */ nw b;

    public afga(afgb afgbVar, nw nwVar) {
        this.a = afgbVar;
        this.b = nwVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        if (!this.a.b.g() && ((SpannedGridLayoutManager) this.b).c != 0) {
            return;
        }
        recyclerView.aM(this);
        this.a.a.G();
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
    }
}
