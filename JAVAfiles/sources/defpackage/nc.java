package defpackage;

import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nc implements AbsListView.OnScrollListener {
    final /* synthetic */ nd a;

    public nc(nd ndVar) {
        this.a = ndVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.w() && this.a.q.getContentView() != null) {
            nd ndVar = this.a;
            ndVar.o.removeCallbacks(ndVar.r);
            this.a.r.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
