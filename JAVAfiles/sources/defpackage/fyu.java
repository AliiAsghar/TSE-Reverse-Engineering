package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyu {
    private final Runnable A;
    private final Runnable B;
    private final Runnable C;
    public final fyj a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public final Runnable p;
    public boolean t;
    public boolean u;
    private final AnimatorSet w;
    private final AnimatorSet x;
    private final AnimatorSet y;
    private final AnimatorSet z;
    public final Runnable o = new fyk(this, 3);
    public final View.OnLayoutChangeListener q = new fyc(this, 2);
    public boolean v = true;
    public int s = 0;
    public final List r = new ArrayList();

    public fyu(fyj fyjVar) {
        this.a = fyjVar;
        int i = 4;
        this.A = new fyk(this, i);
        int i2 = 5;
        this.p = new fyk(this, i2);
        int i3 = 6;
        this.B = new fyk(this, i3);
        int i4 = 7;
        this.C = new fyk(this, i4);
        this.b = fyjVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) fyjVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) fyjVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) fyjVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) fyjVar.findViewById(R.id.exo_time);
        View findViewById = fyjVar.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f = (ViewGroup) fyjVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) fyjVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) fyjVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = fyjVar.findViewById(R.id.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = fyjVar.findViewById(R.id.exo_overflow_hide);
        byte[] bArr = null;
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new jh(this, i4, bArr));
            findViewById3.setOnClickListener(new jh(this, i4, bArr));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, brg.a);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new qu(this, i, bArr));
        ofFloat.addListener(new fyl(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new qu(this, i2, bArr));
        ofFloat2.addListener(new fym(this));
        Resources resources = fyjVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new fyn(this, fyjVar));
        animatorSet.play(ofFloat).with(q(brg.a, dimension, findViewById)).with(q(brg.a, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new fyo(this, fyjVar));
        animatorSet2.play(q(dimension, dimension2, findViewById)).with(q(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.x = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new fyp(this, fyjVar));
        animatorSet3.play(ofFloat).with(q(brg.a, dimension2, findViewById)).with(q(brg.a, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.y = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new fyq(this));
        animatorSet4.play(ofFloat2).with(q(dimension, brg.a, findViewById)).with(q(dimension, brg.a, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.z = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new fyr(this));
        animatorSet5.play(ofFloat2).with(q(dimension2, brg.a, findViewById)).with(q(dimension2, brg.a, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(brg.a, 1.0f);
        this.m = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new qu(this, i3, bArr));
        ofFloat3.addListener(new fys(this));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, brg.a);
        this.n = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new qu(this, 7, bArr));
        ofFloat4.addListener(new fyt(this));
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height;
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static /* synthetic */ void n(fyu fyuVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = fyuVar.b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = fyuVar.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = fyuVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static final boolean p(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    private static ObjectAnimator q(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public final void c(float f) {
        if (this.h != null) {
            this.h.setTranslationX((int) (r0.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
    }

    public final void d() {
        this.x.start();
    }

    public final void e() {
        k(2);
    }

    public final void f() {
        this.w.start();
    }

    public final void g(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public final void h() {
        this.a.removeCallbacks(this.C);
        this.a.removeCallbacks(this.A);
        this.a.removeCallbacks(this.B);
        this.a.removeCallbacks(this.p);
    }

    public final void i() {
        if (this.s != 3) {
            h();
            int i = this.a.H;
            if (i > 0) {
                if (!this.v) {
                    g(this.C, i);
                } else if (this.s == 1) {
                    g(this.p, 2000L);
                } else {
                    g(this.B, i);
                }
            }
        }
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.r.remove(view);
            return;
        }
        if (this.t && p(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.r.add(view);
    }

    public final void k(int i) {
        int i2 = this.s;
        this.s = i;
        if (i == 2) {
            this.a.setVisibility(8);
        } else if (i2 == 2) {
            this.a.setVisibility(0);
            i2 = 2;
        }
        if (i2 != i) {
            fyj fyjVar = this.a;
            Iterator it = fyjVar.b.iterator();
            while (it.hasNext()) {
                fyw fywVar = (fyw) it.next();
                fyjVar.getVisibility();
                fywVar.a.j();
            }
        }
    }

    public final void l() {
        if (!this.v) {
            k(0);
            i();
            return;
        }
        int i = this.s;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    }
                } else {
                    this.u = true;
                }
            } else {
                this.z.start();
            }
        } else {
            this.y.start();
        }
        i();
    }

    public final boolean m(View view) {
        if (view != null && this.r.contains(view)) {
            return true;
        }
        return false;
    }
}
