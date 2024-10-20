package com.google.android.apps.messaging.ui.appsettings.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import defpackage.ajci;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.arro;
import defpackage.gfx;
import defpackage.yyb;
import defpackage.yzc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SwatchieIllustrationPreference extends Preference {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/ui/appsettings/widgets/SwatchieIllustrationPreference");
    public LottieAnimationView a;
    private ajci c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        yyb b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwatchieIllustrationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.y = R.layout.swatchie_illustration_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        gfxVar.getClass();
        super.a(gfxVar);
        View D = gfxVar.D(R.id.lottie_view);
        D.getClass();
        this.a = (LottieAnimationView) D;
        int i = this.j.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.j.getResources().getDisplayMetrics().heightPixels;
        View D2 = gfxVar.D(R.id.illustration_frame);
        D2.getClass();
        FrameLayout frameLayout = (FrameLayout) D2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = Math.min(i, i2);
        frameLayout.setLayoutParams(layoutParams);
        Context context = this.j;
        context.getClass();
        int q = yzc.q(context);
        View D3 = gfxVar.D(R.id.background_view);
        D3.getClass();
        ImageView imageView = (ImageView) D3;
        imageView.setColorFilter(q);
        ((a) yyb.aL(a.class)).b();
        ajci ajciVar = this.c;
        if (ajciVar != null) {
            ajciVar.e(k());
        } else {
            alvw d = b.d();
            d.X(alwp.a, "Bugle");
            ((alvg) d.h("com/google/android/apps/messaging/ui/appsettings/widgets/SwatchieIllustrationPreference", "onBindViewHolder", 61, "SwatchieIllustrationPreference.kt")).q("No illustration set for SwatchieIllustrationPreference");
        }
        LottieAnimationView k = k();
        Resources resources = imageView.getResources();
        resources.getClass();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.settings_illustration_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.settings_illustration_height);
        imageView.setMaxHeight(dimensionPixelSize2);
        k.setMaxHeight(dimensionPixelSize2);
        float f = dimensionPixelSize2;
        k.setMaxWidth((int) (f * (dimensionPixelSize / f)));
    }

    public final LottieAnimationView k() {
        LottieAnimationView lottieAnimationView = this.a;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        arro.b("illustrationView");
        return null;
    }

    public final void l(ajci ajciVar) {
        this.c = ajciVar;
        d();
    }
}
