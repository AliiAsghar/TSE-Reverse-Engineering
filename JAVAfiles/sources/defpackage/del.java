package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class del implements View.OnAttachStateChangeListener {
    final /* synthetic */ czt a;
    final /* synthetic */ arsb b;

    public del(czt cztVar, arsb arsbVar) {
        this.a = cztVar;
        this.b = arsbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        czt cztVar = this.a;
        enm c = dyx.c(cztVar);
        if (c != null) {
            this.b.a = den.a(cztVar, c.N());
            this.a.removeOnAttachStateChangeListener(this);
            return;
        }
        csg.a(a.cc(cztVar, "View tree for ", " has no ViewTreeLifecycleOwner"));
        throw new armj();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
