package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class of extends nq {
    final /* synthetic */ RecyclerView a;

    public of(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.nq
    public final void dB(int i, int i2, Object obj) {
        this.a.x(null);
        ni niVar = this.a.V;
        if (i2 > 0) {
            ((ArrayList) niVar.e).add(niVar.c(4, i, i2, obj));
            niVar.a |= 4;
            if (((ArrayList) niVar.e).size() == 1) {
                k();
            }
        }
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        this.a.x(null);
        ni niVar = this.a.V;
        if (i2 > 0) {
            ((ArrayList) niVar.e).add(niVar.c(1, i, i2, null));
            niVar.a |= 1;
            if (((ArrayList) niVar.e).size() == 1) {
                k();
            }
        }
    }

    @Override // defpackage.nq
    public final void dD(int i, int i2) {
        this.a.x(null);
        ni niVar = this.a.V;
        if (i2 > 0) {
            ((ArrayList) niVar.e).add(niVar.c(2, i, i2, null));
            niVar.a |= 2;
            if (((ArrayList) niVar.e).size() == 1) {
                k();
            }
        }
    }

    @Override // defpackage.nq
    public final void dE() {
        no noVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView.f != null && (noVar = recyclerView.l) != null && noVar.B()) {
            this.a.requestLayout();
        }
    }

    @Override // defpackage.nq
    public final void dF(int i, int i2) {
        this.a.x(null);
        ni niVar = this.a.V;
        if (i != i2) {
            ((ArrayList) niVar.e).add(niVar.c(8, i, i2, null));
            niVar.a |= 8;
            if (((ArrayList) niVar.e).size() == 1) {
                k();
            }
        }
    }

    @Override // defpackage.nq
    public final void dz() {
        this.a.x(null);
        RecyclerView recyclerView = this.a;
        recyclerView.M.f = true;
        recyclerView.Y(true);
        if (!this.a.V.l()) {
            this.a.requestLayout();
        }
    }

    final void k() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.q && recyclerView.p) {
            Runnable runnable = recyclerView.i;
            int[] iArr = eek.a;
            recyclerView.postOnAnimation(runnable);
        } else {
            recyclerView.u = true;
            recyclerView.requestLayout();
        }
    }
}
