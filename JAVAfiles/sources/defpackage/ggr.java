package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggr implements oa, ghg {
    public boolean a;

    @Override // defpackage.ghg
    public final void a() {
        this.a = false;
    }

    @Override // defpackage.ghg
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (nq.x(motionEvent) && this.a) {
            this.a = false;
            return true;
        }
        if (nq.v(motionEvent) && this.a) {
            a();
        }
        return false;
    }

    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
