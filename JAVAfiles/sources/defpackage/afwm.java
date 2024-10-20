package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwm extends ViewOutlineProvider {
    final /* synthetic */ int a;
    final /* synthetic */ Rect b;
    final /* synthetic */ int c;
    final /* synthetic */ float d;

    public afwm(int i, Rect rect, int i2, float f) {
        this.a = i;
        this.b = rect;
        this.c = i2;
        this.d = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        outline.setRoundRect(-this.a, this.b.top - this.c, view.getWidth() + this.a, view.getHeight() - this.b.bottom, this.d);
    }
}
