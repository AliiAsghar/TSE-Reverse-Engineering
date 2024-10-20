package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapa extends nq {
    final /* synthetic */ aapc a;

    public aapa(aapc aapcVar) {
        this.a = aapcVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        if (this.a.s.c(recyclerView, true)) {
            this.a.b.setVisibility(8);
        } else {
            this.a.b.setVisibility(0);
        }
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
    }
}
