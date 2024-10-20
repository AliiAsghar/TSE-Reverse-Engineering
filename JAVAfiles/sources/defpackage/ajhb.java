package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajhb extends ajgo {
    final /* synthetic */ ExtendedFloatingActionButton c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajhb(ExtendedFloatingActionButton extendedFloatingActionButton, aodz aodzVar) {
        super(extendedFloatingActionButton, aodzVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void f() {
        super.f();
        this.c.o = 0;
    }

    @Override // defpackage.ajgo, defpackage.ajhq
    public final void g(Animator animator) {
        super.g(animator);
        this.c.setVisibility(0);
        this.c.o = 2;
    }

    @Override // defpackage.ajhq
    public final int h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.ajhq
    public final void i() {
        this.c.setVisibility(0);
        this.c.setAlpha(1.0f);
        this.c.setScaleY(1.0f);
        this.c.setScaleX(1.0f);
    }

    @Override // defpackage.ajhq
    public final boolean j() {
        return this.c.p();
    }

    @Override // defpackage.ajhq
    public final void k() {
    }
}
