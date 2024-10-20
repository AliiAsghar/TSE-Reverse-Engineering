package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.aafl;
import defpackage.aaqg;
import defpackage.aaqo;
import defpackage.ahnz;
import defpackage.brg;
import defpackage.xzb;
import defpackage.zmr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CategoryToggleView extends aaqg {
    public ImageView a;
    public FrameLayout b;
    public aaqo c;
    public zmr d;
    private ObjectAnimator e;
    private ObjectAnimator f;
    private final float g;
    private final float h;
    private final float i;
    private boolean j;
    private GradientDrawable k;
    private final int l;

    public CategoryToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = getResources().getDimension(R.dimen.c2o_content_item_corner_radius);
        this.h = getResources().getDimension(R.dimen.category_toggle_elevation);
        this.i = getResources().getDimension(R.dimen.category_toggle_padding);
        getResources().getFraction(R.fraction.c2o_category_disabled_icon_alpha, 1, 1);
        this.j = false;
        this.l = getResources().getInteger(R.integer.c2o_category_toggle_animation_duration_ms);
    }

    final ObjectAnimator a() {
        if (this.f == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "cornerRadiusPercentage", 1.0f, brg.a);
            this.f = ofFloat;
            ofFloat.setDuration(this.l);
        }
        return this.f;
    }

    final ObjectAnimator b() {
        if (this.e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "cornerRadiusPercentage", brg.a, 1.0f);
            this.e = ofFloat;
            ofFloat.setDuration(this.l);
        }
        return this.e;
    }

    public final synchronized void c() {
        ObjectAnimator a = a();
        if (!b().isRunning() && !a.isRunning() && this.j) {
            xzb.l("BugleAnimation", "Start expand animation for category indicator");
            a.start();
            this.j = false;
        }
    }

    public final synchronized void d() {
        ObjectAnimator b = b();
        if (!b.isRunning() && !a().isRunning() && !this.j) {
            xzb.l("BugleAnimation", "Start shrink animation for category indicator");
            b.start();
            this.j = true;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.c2o_category_toggle_icon);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c2o_category_toggle_frame);
        this.b = frameLayout;
        frameLayout.setOnClickListener(this.d.a(new aafl(this, 16)));
        GradientDrawable gradientDrawable = (GradientDrawable) this.b.getBackground().mutate();
        this.k = gradientDrawable;
        Context context = getContext();
        context.getClass();
        gradientDrawable.setColor(ahnz.f(context, R.attr.colorSurfaceContainerHighest, "BugleSurfaceColors"));
        this.b.setClipToOutline(true);
        this.b.setBackground(this.k);
    }

    protected void setCornerRadiusPercentage(float f) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        float f2 = this.i;
        int height = getHeight();
        int width = getWidth() - ((int) (f2 + f2));
        float f3 = this.g;
        float f4 = (height / 2) - ((int) f3);
        float f5 = ((int) (f4 * f)) + f3;
        float f6 = width / 2;
        if (f5 < f6) {
            layoutParams.height = height;
        } else {
            float f7 = width;
            float f8 = 1.0f - f;
            layoutParams.height = (int) (f7 + ((f8 + f8) * f4));
            f5 = f6;
        }
        float f9 = this.h * f;
        setTranslationZ(f9);
        this.b.setTranslationZ(f9);
        this.a.setTranslationZ(f9);
        this.b.setLayoutParams(layoutParams);
        this.k.setCornerRadius(f5);
        this.b.setBackground(this.k);
    }
}
