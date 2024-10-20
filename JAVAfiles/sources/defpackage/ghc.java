package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghc implements oa {
    private final ico a;

    public ghc(ico icoVar, gvf gvfVar) {
        d.s(true);
        d.s(gvfVar != null);
        this.a = icoVar;
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (nq.A(motionEvent) && nq.w(motionEvent)) {
            ico icoVar = this.a;
            if (icoVar.C(motionEvent)) {
                icoVar.E(motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
    }

    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
