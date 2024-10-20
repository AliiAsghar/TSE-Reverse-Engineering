package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyi extends nq {
    final /* synthetic */ nw a;
    final /* synthetic */ ghw b;

    public kyi(ghw ghwVar, nw nwVar) {
        this.a = nwVar;
        this.b = ghwVar;
    }

    private final void k() {
        if (((LinearLayoutManager) this.a).L() == 0) {
            ((RecyclerView) this.b.a).ae(0);
        }
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        if (i == 0) {
            k();
        }
    }

    @Override // defpackage.nq
    public final void dF(int i, int i2) {
        if (i2 != 0 && i != 0) {
            return;
        }
        k();
    }
}
