package defpackage;

import android.animation.ValueAnimator;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwk {
    public final agak a;
    public final afvz b;
    public final afwi c;
    public final arqg d;
    private float i;
    private final arml g = armd.a(new afpw(this, 13));
    private final arml h = armd.a(new afpw(this, 12));
    public final agdz e = new agdx(this, 1);
    public boolean f = true;

    public afwk(agak agakVar, afvz afvzVar, afwi afwiVar, arqg arqgVar) {
        this.a = agakVar;
        this.b = afvzVar;
        this.c = afwiVar;
        this.d = arqgVar;
    }

    static /* synthetic */ float d(afwk afwkVar) {
        return afwkVar.g(((ConstraintLayout) afwkVar.b.c).getTranslationY());
    }

    private final float g(float f) {
        return arrn.q((-f) / ((TabLayout) this.b.i).getTop(), brg.a, 1.0f);
    }

    private final boolean h() {
        float f = this.i;
        if (f != brg.a && f != 1.0f) {
            return false;
        }
        return true;
    }

    private final void i(float f, float f2, Interpolator interpolator) {
        if (f2 == f) {
            this.d.a();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(Math.abs(f2 - f) * ((Number) this.h.a()).intValue());
        ofFloat.addUpdateListener(new ztg(this, 9));
        ofFloat.addListener(new afwj(this));
        ofFloat.start();
    }

    public final boolean a(int i, boolean z) {
        if (this.c.b()) {
            float q = arrn.q(((ConstraintLayout) this.b.c).getTranslationY() - i, -((TabLayout) this.b.i).getTop(), brg.a);
            return c(g(q), q, z);
        }
        return false;
    }

    public final boolean b() {
        if (this.c.b() && !h()) {
            return false;
        }
        return true;
    }

    public final boolean c(float f, float f2, boolean z) {
        boolean z2;
        if (this.i == f && h()) {
            z2 = false;
            if (z) {
                this.d.a();
                return false;
            }
        } else {
            ((ViewGroup) this.b.f).setAlpha(arrn.q(1.0f - (f + f), brg.a, 1.0f));
            ((ConstraintLayout) this.b.c).setTranslationY(f2);
            Object obj = this.b.d;
            if (((View) obj).getVisibility() != 0) {
                obj = null;
            }
            if (obj != null) {
                ((AppCompatImageView) obj).setTranslationY((-f2) - ((((r0.getHeight() - ((Number) this.g.a()).intValue()) / 2) + ((ConstraintLayout) this.b.c).getPaddingTop()) * f));
                View view = (View) this.b.i;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (afwv.A((View) this.b.i)) {
                        marginLayoutParams.rightMargin = (int) ((((ConstraintLayout) this.b.b).getWidth() - r0.getLeft()) * f);
                    } else {
                        marginLayoutParams.leftMargin = (int) (r0.getRight() * f);
                    }
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            this.i = f;
            z2 = true;
            if (z) {
                this.d.a();
                return true;
            }
        }
        return z2;
    }

    public final void e() {
        if (((TabLayout) this.b.i).getTop() == 0) {
            c(brg.a, brg.a, true);
            this.f = true;
        } else {
            i(brg.a, d(this), new AccelerateInterpolator());
        }
    }

    public final void f() {
        float f;
        if (this.c.b()) {
            float d = d(this);
            if (d <= 0.5f) {
                f = brg.a;
            } else {
                f = 1.0f;
            }
            i(f, d, new DecelerateInterpolator());
        }
    }
}
