package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgz extends ajgo {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private final ajhc d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajgz(ExtendedFloatingActionButton extendedFloatingActionButton, aodz aodzVar, ajhc ajhcVar, boolean z) {
        super(extendedFloatingActionButton, aodzVar);
        this.c = extendedFloatingActionButton;
        this.d = ajhcVar;
        this.e = z;
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final AnimatorSet a() {
        float f;
        ajdh c = c();
        if (c.f("width")) {
            PropertyValuesHolder[] g = c.g("width");
            g[0].setFloatValues(this.c.getWidth(), this.d.d());
            c.e("width", g);
        }
        if (c.f("height")) {
            PropertyValuesHolder[] g2 = c.g("height");
            g2[0].setFloatValues(this.c.getHeight(), this.d.a());
            c.e("height", g2);
        }
        if (c.f("paddingStart")) {
            PropertyValuesHolder[] g3 = c.g("paddingStart");
            g3[0].setFloatValues(this.c.getPaddingStart(), this.d.c());
            c.e("paddingStart", g3);
        }
        if (c.f("paddingEnd")) {
            PropertyValuesHolder[] g4 = c.g("paddingEnd");
            g4[0].setFloatValues(this.c.getPaddingEnd(), this.d.b());
            c.e("paddingEnd", g4);
        }
        if (c.f("labelOpacity")) {
            PropertyValuesHolder[] g5 = c.g("labelOpacity");
            boolean z = this.e;
            float f2 = 1.0f;
            if (true != z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (true != z) {
                f2 = 0.0f;
            }
            g5[0].setFloatValues(f, f2);
            c.e("labelOpacity", g5);
        }
        return super.b(c);
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.s = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = this.d.e().width;
        layoutParams.height = this.d.e().height;
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void g(Animator animator) {
        super.g(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.r = this.e;
        extendedFloatingActionButton.s = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.ajhq
    public final int h() {
        if (this.e) {
            return R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
        }
        return R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.ajhq
    public final void i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.r = this.e;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!this.e) {
            this.c.u = layoutParams.width;
            this.c.v = layoutParams.height;
        }
        layoutParams.width = this.d.e().width;
        layoutParams.height = this.d.e().height;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = this.c;
        ajhc ajhcVar = this.d;
        extendedFloatingActionButton2.setPaddingRelative(ajhcVar.c(), extendedFloatingActionButton2.getPaddingTop(), ajhcVar.b(), extendedFloatingActionButton2.getPaddingBottom());
        this.c.requestLayout();
    }

    @Override // defpackage.ajhq
    public final boolean j() {
        boolean z = this.e;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        if (z != extendedFloatingActionButton.r && extendedFloatingActionButton.d != null && !TextUtils.isEmpty(extendedFloatingActionButton.getText())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ajhq
    public final void k() {
    }
}
