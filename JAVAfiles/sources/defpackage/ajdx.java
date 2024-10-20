package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajdx implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public ajdx(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        asqc asqcVar;
        ehk ehkVar = this.a.a;
        if (ehkVar != null && ehkVar.l()) {
            this.b.postOnAnimation(this);
        } else if (this.c && (asqcVar = this.a.f) != null) {
            asqcVar.j(this.b);
        }
    }
}
