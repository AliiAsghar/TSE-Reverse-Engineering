package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aais extends Animation {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    public aais(View view, int i, int i2) {
        this.a = view;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i;
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (f == 1.0f) {
            i = -2;
        } else {
            i = (int) (this.b + (this.c * f));
        }
        layoutParams.width = i;
        this.a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
