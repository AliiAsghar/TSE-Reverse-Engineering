package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dez implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ bzj b;

    public dez(View view, bzj bzjVar) {
        this.a = view;
        this.b = bzjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.u();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
