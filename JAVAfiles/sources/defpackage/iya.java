package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iya extends ViewOutlineProvider {
    final /* synthetic */ iyc a;
    final /* synthetic */ Rect b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public iya(iyc iycVar, Rect rect, int i, int i2) {
        this.a = iycVar;
        this.b = rect;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        Rect rect = this.b;
        ViewGroup viewGroup = this.a.c;
        float x = viewGroup.getX() + rect.left;
        float y = viewGroup.getY() + rect.top;
        float x2 = viewGroup.getX() + viewGroup.getWidth();
        float f = rect.right;
        float y2 = viewGroup.getY() + viewGroup.getHeight();
        float f2 = rect.bottom;
        int height = view.getHeight() / 2;
        float f3 = y2 - f2;
        float f4 = this.c;
        outline.setRoundRect((int) (x - f4), (int) (y - this.d), (int) ((x2 - f) + f4), (int) f3, height);
    }
}
