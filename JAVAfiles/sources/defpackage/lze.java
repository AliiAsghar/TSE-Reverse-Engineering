package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lze implements abbk {
    private final /* synthetic */ int a;

    @Override // defpackage.abbk
    public final void a(View view, WindowInsets windowInsets) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                    return;
                } else {
                    view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                    return;
                }
            }
            view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
            return;
        }
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
    }
}
