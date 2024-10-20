package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggc extends mr {
    final /* synthetic */ ReactiveGridLayoutManager c;

    public aggc(ReactiveGridLayoutManager reactiveGridLayoutManager) {
        this.c = reactiveGridLayoutManager;
    }

    @Override // defpackage.mr
    public final int b(int i) {
        no noVar;
        RecyclerView recyclerView = this.c.L;
        int i2 = -1;
        if (recyclerView != null && (noVar = recyclerView.l) != null) {
            i2 = noVar.c(i);
        }
        int i3 = ((GridLayoutManager) this.c).b;
        if (i2 != 1 && i2 != 6) {
            return 1;
        }
        return i3;
    }
}
