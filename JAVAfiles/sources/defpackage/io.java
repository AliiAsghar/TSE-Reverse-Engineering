package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class io extends FrameLayout implements hn {
    final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public io(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.hn
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.hn
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
