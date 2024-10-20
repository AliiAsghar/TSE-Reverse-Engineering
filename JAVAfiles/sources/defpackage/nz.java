package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nz {
    public RecyclerView a;
    public Scroller b;
    private final nq c = new ph(this);

    public abstract int a(nw nwVar, int i, int i2);

    public abstract View b(nw nwVar);

    public abstract int[] c(nw nwVar, View view);

    public ok d(nw nwVar) {
        if (!(nwVar instanceof oj)) {
            return null;
        }
        return new pi(this, this.a.getContext());
    }

    public final void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aM(this.c);
                this.a.F = null;
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.F == null) {
                    recyclerView.aL(this.c);
                    RecyclerView recyclerView3 = this.a;
                    recyclerView3.F = this;
                    this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void f() {
        nw nwVar;
        View b;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (nwVar = recyclerView.m) != null && (b = b(nwVar)) != null) {
            int[] c = c(nwVar, b);
            int i = 0;
            int i2 = c[0];
            if (i2 == 0) {
                if (c[1] == 0) {
                    return;
                }
            } else {
                i = i2;
            }
            this.a.am(i, c[1]);
        }
    }
}
