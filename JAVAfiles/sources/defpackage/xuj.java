package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xuj extends Animation {
    private final View a;
    private int b;
    private final ViewGroup.MarginLayoutParams c;
    private final int d;
    private final int e;

    public xuj(View view, int i) {
        this(view, i, 0);
    }

    public final void a(int i) {
        this.b = i;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.c;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = i;
            this.c.bottomMargin = -i;
        }
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.c;
        if (marginLayoutParams != null) {
            if (f >= 1.0f) {
                int i = this.e;
                if (i == 0) {
                    marginLayoutParams.bottomMargin = 0;
                } else if (i == 1) {
                    marginLayoutParams.bottomMargin = -this.b;
                } else {
                    marginLayoutParams.height = this.d;
                }
            } else {
                int i2 = this.e;
                if (i2 == 0) {
                    float f2 = this.b;
                    marginLayoutParams.bottomMargin = (int) ((f * f2) - f2);
                } else if (i2 == 1) {
                    marginLayoutParams.bottomMargin = (int) ((-this.b) * f);
                } else {
                    marginLayoutParams.height = (int) (this.b + ((this.d - r0) * f));
                }
            }
            this.a.requestLayout();
        }
    }

    @Override // android.view.animation.Animation
    public final void setDuration(long j) {
        super.setDuration(xui.a(this.a.getContext(), j));
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public xuj(View view, int i, int i2) {
        this.e = i;
        this.a = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.c = marginLayoutParams;
        if (i == 0) {
            int measuredHeight = view.getMeasuredHeight();
            this.b = measuredHeight;
            this.d = measuredHeight;
        } else {
            if (i == 1) {
                this.b = view.getMeasuredHeight();
                this.d = 0;
                return;
            }
            this.d = i2;
            if (marginLayoutParams == null) {
                this.b = 0;
            } else {
                marginLayoutParams.bottomMargin = 0;
                this.b = marginLayoutParams.height;
            }
        }
    }
}
