package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aait extends Animation {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public aait(View view, int i, int i2, int i3) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        if (f == 1.0f) {
            this.a.getLayoutParams().width = this.b;
        } else {
            this.a.getLayoutParams().width = this.c - ((int) (this.d * f));
        }
        this.a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
