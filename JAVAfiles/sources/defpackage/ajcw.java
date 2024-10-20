package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajcw implements View.OnAttachStateChangeListener {
    private final /* synthetic */ int a;

    public ajcw(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a != 0) {
            view.getClass();
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a != 0) {
            view.getClass();
        } else if (view instanceof TextView) {
            ahnz.r(((TextView) view).getText());
        }
    }
}
