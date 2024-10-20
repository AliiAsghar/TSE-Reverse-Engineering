package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmq extends ajnc {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public ajmq(ajnb ajnbVar) {
        super(ajnbVar);
        this.j = new ajeg(this, 2);
        this.k = new ilc(this, 7);
        this.b = ajgk.g(ajnbVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = ajgk.g(ajnbVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = ajgk.l(ajnbVar.getContext(), R.attr.motionEasingLinearInterpolator, ajdd.a);
        this.i = ajgk.l(ajnbVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, ajdd.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.d);
        ofFloat.setDuration(this.b);
        ofFloat.addUpdateListener(new ztg(this, 14));
        return ofFloat;
    }

    @Override // defpackage.ajnc
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.ajnc
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.ajnc
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.ajnc
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.ajnc
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean r = this.f.r();
        if (z) {
            if (!this.l.isRunning()) {
                this.m.cancel();
                this.l.start();
                if (r) {
                    this.l.end();
                    return;
                }
                return;
            }
            return;
        }
        this.l.cancel();
        this.m.start();
        if (!r) {
            this.m.end();
        }
    }

    @Override // defpackage.ajnc
    public final void g(EditText editText) {
        this.a = editText;
        this.e.i(k());
    }

    @Override // defpackage.ajnc
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.ajnc
    public final void i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.i);
        ofFloat.setDuration(this.c);
        ofFloat.addUpdateListener(new ztg(this, 15));
        ValueAnimator m = m(brg.a, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, m);
        this.l.addListener(new ajmo(this));
        ValueAnimator m2 = m(1.0f, brg.a);
        this.m = m2;
        m2.addListener(new ajmp(this));
    }

    @Override // defpackage.ajnc
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new ajir(this, 6, null));
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText != null) {
            if ((editText.hasFocus() || this.h.hasFocus()) && this.a.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ajnc
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
