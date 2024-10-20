package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dew implements View.OnAttachStateChangeListener {
    final /* synthetic */ arxm a;

    public dew(arxm arxmVar) {
        this.a = arxmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.a.v(null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
