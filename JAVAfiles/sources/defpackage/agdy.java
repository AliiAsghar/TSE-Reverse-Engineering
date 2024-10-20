package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdy implements agea {
    final /* synthetic */ RecyclerView a;
    private final aazm b;

    public agdy(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.b = new aazm(agdl.d, new afyq(recyclerView, 12), new afyq(recyclerView, 13));
    }

    @Override // defpackage.agea
    public final int a() {
        return this.a.computeVerticalScrollOffset();
    }

    @Override // defpackage.agea
    public final /* synthetic */ View b() {
        return null;
    }

    @Override // defpackage.agea
    public final void c(int i) {
        this.a.av(0, i);
    }

    @Override // defpackage.agea
    public final void e(int i) {
        RecyclerView recyclerView = this.a;
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.invalidate();
    }

    @Override // defpackage.agea
    public final boolean f() {
        if (!this.a.canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agea
    public final boolean g() {
        if (!this.a.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agea
    public final /* synthetic */ boolean h(int i) {
        return false;
    }

    @Override // defpackage.agea
    public final void i(int i) {
        this.a.scrollBy(0, i);
    }

    @Override // defpackage.agea
    public final void j(boolean z) {
        RecyclerView recyclerView = this.a;
        if (z) {
            recyclerView.as();
        }
        nw nwVar = recyclerView.m;
        if (nwVar != null) {
            if (nwVar instanceof GridLayoutManager) {
                ((GridLayoutManager) nwVar).ad(0, 0);
                return;
            }
            if (nwVar instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) nwVar;
                pm pmVar = staggeredGridLayoutManager.i;
                if (pmVar != null) {
                    pmVar.a();
                }
                staggeredGridLayoutManager.f = 0;
                staggeredGridLayoutManager.g = 0;
                staggeredGridLayoutManager.bc();
            }
        }
    }

    @Override // defpackage.agea
    public final aazm k() {
        return this.b;
    }

    @Override // defpackage.agea
    public final /* synthetic */ void d() {
    }
}
