package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class dtl implements dtj {
    @Override // defpackage.dtj
    public final void a(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // defpackage.dtj
    public final void c(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // defpackage.dtj
    public void b(View view, int i, int i2) {
    }
}
