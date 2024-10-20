package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajha extends ajgo {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajha(ExtendedFloatingActionButton extendedFloatingActionButton, aodz aodzVar) {
        super(extendedFloatingActionButton, aodzVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void e() {
        super.e();
        this.d = true;
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.o = 0;
        if (!this.d) {
            extendedFloatingActionButton.setVisibility(8);
        }
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void g(Animator animator) {
        super.g(animator);
        this.d = false;
        this.c.setVisibility(0);
        this.c.o = 1;
    }

    @Override // defpackage.ajhq
    public final int h() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.ajhq
    public final void i() {
        this.c.setVisibility(8);
    }

    @Override // defpackage.ajhq
    public final boolean j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.o;
        if (visibility == 0) {
            if (i == 1) {
                return true;
            }
            return false;
        }
        if (i != 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ajhq
    public final void k() {
    }
}
