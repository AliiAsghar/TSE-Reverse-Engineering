package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztr extends aabr {
    public static final alwo a = alwo.o("BugleBanners");
    public zts A;
    public zts B;
    public zts C;
    public zts D;
    public int E;
    public int F;
    public final ahmn G;
    private final af H;
    public final aksr b;
    public final armf c;
    public final Context d;
    public final af e;
    public final ConstraintLayout f;
    public final ztq g;
    public ConstraintLayout h;
    public LinearLayout i;
    public IllustrationViewStub j;
    public IllustrationViewStub k;
    public ImageView l;
    public Button m;
    public Button n;
    public TextView o;
    public TextView p;
    public ViewGroup q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public zsu y;
    public zsu z;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akvv {
    }

    public ztr(aksr aksrVar, ahmn ahmnVar, armf armfVar, Context context) {
        super(null, null, null);
        af afVar = new af();
        this.e = afVar;
        af afVar2 = new af();
        this.H = afVar2;
        this.E = 1;
        this.F = 1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = true;
        this.b = aksrVar;
        this.G = ahmnVar;
        this.c = armfVar;
        this.d = context;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.f = constraintLayout;
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipChildren(false);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ztq ztqVar = new ztq(this, context);
        this.g = ztqVar;
        ztqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ColorStateList valueOf = ColorStateList.valueOf(ahnz.f(context, R.attr.colorOutlineVariant, "FullBannerUiController"));
        ajev ajevVar = ztqVar.s;
        if (ajevVar.o != valueOf) {
            ajevVar.o = valueOf;
            ajevVar.k();
        }
        ztqVar.invalidate();
        ztqVar.setId(R.id.banner_card_id);
        constraintLayout.addView(ztqVar);
        afVar.e(constraintLayout);
        afVar.n(-2);
        afVar.o(0);
        int dimension = (int) context.getResources().getDimension(R.dimen.banner2o_full_outside_margin);
        afVar.g(R.id.banner_card_id, 7, 0, 7, dimension);
        afVar.g(R.id.banner_card_id, 3, 0, 3, dimension);
        afVar.g(R.id.banner_card_id, 4, 0, 4, dimension);
        afVar.g(R.id.banner_card_id, 6, 0, 6, dimension);
        afVar.b(constraintLayout);
        afVar2.e(constraintLayout);
        afVar2.n((int) context.getResources().getDimension(R.dimen.banner2o_chip_height));
        afVar2.o((int) context.getResources().getDimension(R.dimen.banner2o_chip_width));
        int dimension2 = (int) context.getResources().getDimension(R.dimen.banner2o_chip_outside_margin);
        afVar2.g(R.id.banner_card_id, 7, 0, 7, dimension2);
        afVar2.g(R.id.banner_card_id, 3, 0, 3, dimension2);
        afVar2.d(R.id.banner_card_id, 6);
        ((Integer) ((utz) zsv.a.get()).e()).intValue();
    }

    public static void b(ztq ztqVar, int i, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(ztqVar.getAlpha(), brg.a);
        ofFloat.setDuration(150L);
        ofFloat.setStartDelay(i);
        ofFloat.addUpdateListener(new ztg(ztqVar, 1));
        ofFloat.addListener(new ztn(runnable));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ztqVar.getAlpha(), 1.0f);
        ofFloat2.setDuration(150L);
        ofFloat2.setStartDelay(i + 150);
        ofFloat2.addUpdateListener(new ztg(ztqVar, 0));
        ofFloat.start();
        ofFloat2.start();
    }

    private final void bf() {
        int dimension = (int) this.d.getResources().getDimension(R.dimen.banner2o_full_body_to_end_margin);
        if (this.o.getVisibility() == 8) {
            if (this.D == null) {
                dimension = 0;
            } else {
                dimension = (int) this.d.getResources().getDimension(R.dimen.banner2o_full_body_and_close_only_end_margin);
            }
        }
        if (dimension == this.p.getPaddingEnd()) {
            return;
        }
        TextView textView = this.p;
        textView.setPadding(textView.getPaddingStart(), this.p.getPaddingTop(), dimension, this.p.getPaddingBottom());
        this.p.requestLayout();
    }

    public static /* bridge */ /* synthetic */ void n(ztr ztrVar) {
        ztrVar.v = true;
    }

    public final Slide a(int i, int i2) {
        Slide slide = new Slide();
        slide.setDuration(i2);
        slide.setSlideEdge(i);
        slide.addTarget(this.g);
        slide.setInterpolator(new OvershootInterpolator());
        return slide;
    }

    public final void c(boolean z) {
        if (z) {
            this.F = 1;
            this.g.setVisibility(0);
        } else {
            this.F = 2;
            this.g.setVisibility(4);
        }
    }

    public final void d(CharSequence charSequence) {
        int i;
        TextView textView = this.p;
        if (true != TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.p.setText(charSequence);
        this.p.setSingleLine(false);
        this.p.setEllipsize(null);
        bf();
    }

    public final void e(String str) {
        this.g.setContentDescription(str);
    }

    public final void f(boolean z) {
        this.m.setEnabled(z);
    }

    public final void g(String str) {
        int i;
        Button button = this.m;
        if (true != albo.ah(str)) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        this.m.setText(str);
        int dimension = (int) this.d.getResources().getDimension(R.dimen.banner2o_full_bottom_padding);
        if (this.m.getVisibility() == 8) {
            dimension = (int) this.d.getResources().getDimension(R.dimen.banner2o_full_bottom_padding_no_buttons);
        }
        if (dimension == this.h.getPaddingBottom()) {
            return;
        }
        ConstraintLayout constraintLayout = this.h;
        constraintLayout.setPadding(constraintLayout.getPaddingStart(), this.h.getPaddingTop(), this.h.getPaddingEnd(), dimension);
        this.h.requestLayout();
    }

    public final void h(int i, int i2) {
        q(i, OptionalInt.of(i2));
    }

    public final void i(zts ztsVar) {
        this.l.setVisibility(0);
        this.D = ztsVar;
        this.l.setOnClickListener(new akwb(this.b, "FullBannerUiController: Close clicked", new zqq(this, 6), 1));
        bf();
    }

    public final void j(zts ztsVar) {
        this.A = ztsVar;
        this.m.setOnClickListener(new akwb(this.b, "FullBannerUiController: End button clicked", new zqq(this, 8), 1));
    }

    public final void k(zts ztsVar) {
        this.B = ztsVar;
        this.n.setOnClickListener(new akwb(this.b, "FullBannerUiController: Start button clicked", new zqq(this, 7), 1));
    }

    public final void l(String str) {
        int i;
        Button button = this.n;
        if (true != albo.ah(str)) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        this.n.setText(str);
    }

    public final void m(CharSequence charSequence) {
        int i;
        TextView textView = this.o;
        if (true != TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.o.setText(charSequence);
        bf();
    }

    public final void o() {
        if (this.E != 2 && !this.u && this.t <= 0 && !this.v) {
            ((mbl) this.c.b()).c("Bugle.Banners2o.Collapsed.Count");
            zwf zwfVar = new zwf();
            zwfVar.setDuration(166L);
            View view = this.j.d;
            view.getClass();
            zwfVar.addTarget(view);
            Fade fade = new Fade(2);
            fade.setStartDelay(83L);
            fade.setDuration(83L);
            fade.addTarget(this.h);
            zwe zweVar = new zwe();
            zweVar.setStartDelay(83L);
            zweVar.setDuration(333L);
            zweVar.addTarget(this.g);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setStartDelay(83L);
            changeBounds.setDuration(333L);
            changeBounds.addTarget(this.f);
            changeBounds.addTarget(this.g);
            Fade fade2 = new Fade(1);
            fade2.setStartDelay(333L);
            fade2.setDuration(83L);
            fade2.addTarget(this.i);
            zwf zwfVar2 = new zwf();
            zwfVar2.setStartDelay(333L);
            zwfVar2.setDuration(166L);
            View view2 = this.k.d;
            view2.getClass();
            zwfVar2.addTarget(view2);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(fade);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(fade2);
            transitionSet.addTransition(zweVar);
            transitionSet.addTransition(zwfVar);
            transitionSet.addTransition(zwfVar2);
            transitionSet.addListener((Transition.TransitionListener) new akuh(this.G, new ztl(this), "FullBannerUiController: Collapse transition"));
            b(this.g, 183, new zth(0));
            TransitionManager.beginDelayedTransition(this.f, transitionSet);
            this.E = 2;
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.H.b(this.f);
            this.g.gb(this.d.getResources().getDimension(R.dimen.banner2o_chip_corner_radius));
            this.j.setScaleX(brg.a);
            this.j.setScaleY(brg.a);
            this.k.setScaleX(1.0f);
            this.k.setScaleY(1.0f);
        }
    }

    public final void p() {
        this.w = true;
    }

    public final void q(int i, OptionalInt optionalInt) {
        IllustrationViewStub illustrationViewStub = this.j;
        illustrationViewStub.a = i;
        illustrationViewStub.e();
        IllustrationViewStub illustrationViewStub2 = this.k;
        illustrationViewStub2.a = i;
        illustrationViewStub2.e();
        optionalInt.ifPresent(new ztf(this, 0));
        this.j.c();
        this.k.c();
    }

    public final void r() {
        this.n.setEnabled(false);
    }

    public final void s(zsu zsuVar, boolean z) {
        int i = ztq.j;
        this.g.f();
        if (!z) {
            this.s++;
            c(false);
            int i2 = this.s - 1;
            this.s = i2;
            if (i2 == 0 && zsuVar != null) {
                zsuVar.a(this);
                return;
            }
            return;
        }
        Slide a2 = a(48, 500);
        a2.addListener(new akuh(this.G, new ztj(this, zsuVar), "FullBannerUiController: Slide out top transition"));
        ViewGroup viewGroup = this.q;
        viewGroup.getClass();
        TransitionManager.beginDelayedTransition(viewGroup, a2);
        c(false);
    }
}
