package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdt implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;

    public agdt(View view, View view2, int i) {
        this.a = view;
        this.b = view2;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() > 0 && this.a.getHeight() > 0) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.getWidth();
            this.b.setElevation(arrn.s(this.c >> 3, this.a.getHeight()));
        }
    }
}
