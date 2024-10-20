package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggt implements oa, ghg {
    private boolean a;
    private final ico b = new ico(new ghk());

    @Override // defpackage.ghg
    public final void a() {
        this.a = false;
    }

    @Override // defpackage.ghg
    public final boolean b() {
        return this.a;
    }

    public final void c(int i, oa oaVar) {
        boolean z;
        if (oaVar != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.b.B(i, oaVar);
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
        if (!z) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.a) {
            ((oa) this.b.A(motionEvent)).e(recyclerView, motionEvent);
        }
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.a && nq.v(motionEvent)) {
            this.a = false;
        }
        if (this.a || !((oa) this.b.A(motionEvent)).k(recyclerView, motionEvent)) {
            return false;
        }
        return true;
    }
}
