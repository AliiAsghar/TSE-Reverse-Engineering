package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajdo implements Runnable {
    final /* synthetic */ ajdp a;
    private final CoordinatorLayout b;
    private final View c;

    public ajdo(ajdp ajdpVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = ajdpVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c != null && (overScroller = this.a.b) != null) {
            if (overScroller.computeScrollOffset()) {
                ajdp ajdpVar = this.a;
                ajdpVar.W(this.b, this.c, ajdpVar.b.getCurrY());
                this.c.postOnAnimation(this);
                return;
            }
            this.a.Q(this.b, this.c);
        }
    }
}
