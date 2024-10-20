package com.google.android.setupdesign;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.setupdesign.view.BottomScrollView;
import defpackage.agxw;
import defpackage.ajeg;
import defpackage.ajgl;
import defpackage.ajki;
import defpackage.ajue;
import defpackage.ajus;
import defpackage.ajuu;
import defpackage.ajva;
import defpackage.ajvg;
import defpackage.ajvl;
import defpackage.ajvm;
import defpackage.ajvn;
import defpackage.ajvp;
import defpackage.ajvv;
import defpackage.ajvw;
import defpackage.ajvx;
import defpackage.ajvy;
import defpackage.ajwa;
import defpackage.ajwb;
import defpackage.ajwc;
import defpackage.ajwd;
import defpackage.ajwe;
import defpackage.ajwf;
import defpackage.hgi;
import defpackage.kwe;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GlifLayout extends ajue {
    public static final /* synthetic */ int f = 0;
    private static final agxw k = new agxw(GlifLayout.class);
    private ColorStateList g;
    private boolean h;
    private boolean i;
    private ColorStateList j;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private final void q(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int a;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ajvp.f, i, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(4, false);
        if (e() && z2) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        k(ajvx.class, new ajvx(this, attributeSet, i));
        k(ajvv.class, new ajvv(this, attributeSet, i));
        k(ajvy.class, new ajvy(this, attributeSet, i));
        k(ajwb.class, new ajwb(this));
        k(ajwc.class, new ajwc(this, attributeSet, i));
        k(ajwa.class, new ajwa(this));
        k(ajvw.class, new ajvw(this));
        k(ajwd.class, new ajwd());
        ScrollView l = l();
        if (l != null) {
            new ajwe(l);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.g = colorStateList;
            r();
            ProgressBar a2 = ((ajwc) i(ajwc.class)).a();
            if (a2 != null) {
                a2.setIndeterminateTintList(colorStateList);
                a2.setProgressBackgroundTintList(colorStateList);
            }
        }
        if (p() && !f()) {
            getRootView().setBackgroundColor(ajuu.h(getContext()).c(getContext(), ajus.CONFIG_LAYOUT_BACKGROUND_COLOR));
        }
        View g = g(R.id.sud_layout_content);
        if (g != null) {
            if (e()) {
                ajgl.t(g);
            }
            if (!(this instanceof ajvn)) {
                Context context = g.getContext();
                boolean r = ajuu.h(context).r(ajus.CONFIG_CONTENT_PADDING_TOP);
                if (e() && r && (a = (int) ajuu.h(context).a(context, ajus.CONFIG_CONTENT_PADDING_TOP)) != g.getPaddingTop()) {
                    g.setPadding(g.getPaddingStart(), a, g.getPaddingEnd(), g.getPaddingBottom());
                }
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sud_glif_land_middle_horizontal_spacing);
        if (e() && ajuu.h(getContext()).r(ajus.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING)) {
            dimensionPixelSize = (int) ajuu.h(getContext()).a(getContext(), ajus.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING);
        }
        View g2 = g(R.id.sud_landscape_header_area);
        if (g2 != null) {
            if (e() && ajuu.h(getContext()).r(ajus.CONFIG_LAYOUT_MARGIN_END)) {
                i4 = (int) ajuu.h(getContext()).a(getContext(), ajus.CONFIG_LAYOUT_MARGIN_END);
            } else {
                TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{R.attr.sudMarginEnd});
                int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                obtainStyledAttributes2.recycle();
                i4 = dimensionPixelSize2;
            }
            g2.setPadding(g2.getPaddingStart(), g2.getPaddingTop(), (dimensionPixelSize / 2) - i4, g2.getPaddingBottom());
        }
        View g3 = g(R.id.sud_landscape_content_area);
        if (g3 != null) {
            if (e() && ajuu.h(getContext()).r(ajus.CONFIG_LAYOUT_MARGIN_START)) {
                i2 = (int) ajuu.h(getContext()).a(getContext(), ajus.CONFIG_LAYOUT_MARGIN_START);
            } else {
                TypedArray obtainStyledAttributes3 = getContext().obtainStyledAttributes(new int[]{R.attr.sudMarginStart});
                int dimensionPixelSize3 = obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                obtainStyledAttributes3.recycle();
                i2 = dimensionPixelSize3;
            }
            if (g2 != null) {
                i3 = (dimensionPixelSize / 2) - i2;
            } else {
                i3 = 0;
            }
            g3.setPadding(i3, g3.getPaddingTop(), g3.getPaddingEnd(), g3.getPaddingBottom());
        }
        Context context2 = getContext();
        Bundle bundle = ajuu.i;
        if (bundle == null || bundle.isEmpty()) {
            try {
                ajuu.i = context2.getContentResolver().call(ajuu.g(), "isKeyboardFocusEnhancementEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(ajuu.a, "SetupWizard keyboard focus enhancement status unknown; return as false.");
                ajuu.i = null;
            }
        }
        Bundle bundle2 = ajuu.i;
        if (bundle2 != null && !bundle2.isEmpty() && ajuu.i.getBoolean("isKeyboardFocusEnhancementEnabled")) {
            View g4 = g(R.id.sud_header_scroll_view);
            if (g4 != null) {
                g4.setFocusable(false);
            }
            View g5 = g(R.id.sud_scroll_view);
            if (g5 != null) {
                g5.setFocusable(false);
            }
        }
        this.j = obtainStyledAttributes.getColorStateList(0);
        r();
        this.h = obtainStyledAttributes.getBoolean(1, true);
        r();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) g(R.id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        if (ajuu.q(getContext())) {
            m();
        }
        if (ajuu.q(getContext())) {
            Activity e = ajuu.e(getContext());
            ajvw ajvwVar = (ajvw) i(ajvw.class);
            if (ajvwVar != null) {
                if (ajvwVar.a() != null) {
                    ajvwVar.a().setVisibility(0);
                    ajvwVar.b().setVisibility(0);
                }
                ajeg ajegVar = new ajeg(e, 5);
                if (ajvwVar.a() != null) {
                    ajvwVar.a().setOnClickListener(ajegVar);
                }
            } else {
                k.u("FloatingBackButtonMixin button is null");
            }
        } else {
            k.q("isGlifExpressiveEnabled is false");
        }
        obtainStyledAttributes.recycle();
    }

    private final void r() {
        int i;
        Drawable colorDrawable;
        if (g(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.g;
                if (colorStateList2 != null) {
                    i = colorStateList2.getDefaultColor();
                } else {
                    i = 0;
                }
            }
            if (this.h) {
                colorDrawable = new ajvm(i);
            } else {
                colorDrawable = new ColorDrawable(i);
            }
            ((ajvg) i(ajvg.class)).a(colorDrawable);
        }
    }

    @Override // defpackage.ajue, com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            Context context = getContext();
            boolean n = ajuu.n(context);
            boolean r = hgi.w(context).r(ajuu.e(context));
            agxw agxwVar = k;
            String str = "isEmbeddedActivityOnePaneEnabled = " + n + "; isActivityEmbedded = " + r;
            if (Log.isLoggable("SetupLibrary", 2)) {
                Log.v("SetupLibrary", ((String) agxwVar.b).concat(str));
            }
            if (n && r) {
                if (o()) {
                    i = R.layout.sud_glif_expressive_embedded_template;
                } else {
                    i = R.layout.sud_glif_embedded_template;
                }
            } else if (o()) {
                i = R.layout.sud_glif_expressive_template;
            } else {
                Context context2 = getContext();
                if (Build.VERSION.SDK_INT >= 34 && ajuu.p(context2)) {
                    i = R.layout.sud_glif_template_two_pane;
                } else {
                    i = R.layout.sud_glif_template;
                }
            }
        }
        return h(layoutInflater, R.style.SudThemeGlif_Light, i);
    }

    @Override // defpackage.ajue, com.google.android.setupcompat.internal.TemplateLayout
    protected ViewGroup b(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.b(i);
    }

    public final ScrollView l() {
        View g = g(R.id.sud_scroll_view);
        if (g instanceof ScrollView) {
            return (ScrollView) g;
        }
        return null;
    }

    protected void m() {
        ScrollView l = l();
        if (l instanceof BottomScrollView) {
            ((BottomScrollView) l).a = new ajvl(this);
        }
    }

    public final void n(boolean z) {
        LinearLayout linearLayout;
        ajva ajvaVar = (ajva) i(ajva.class);
        if (ajvaVar != null && (linearLayout = ajvaVar.f) != null) {
            if (z) {
                linearLayout.setBackgroundColor(0);
                return;
            }
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.sudFooterBackgroundColor, typedValue, true);
            linearLayout.setBackgroundColor(typedValue.data);
        }
    }

    protected final boolean o() {
        if (ajuu.q(getContext()) && Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int dimension;
        super.onFinishInflate();
        ajvy ajvyVar = (ajvy) i(ajvy.class);
        if (ajki.B(ajvyVar.a)) {
            ImageView b = ajvyVar.b();
            FrameLayout a = ajvyVar.a();
            if (b != null && a != null) {
                Context context = b.getContext();
                int z = ajki.z(context);
                if (z != 0 && !ajuu.q(context) && (b.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b.getLayoutParams();
                    layoutParams2.gravity = z;
                    b.setLayoutParams(layoutParams2);
                }
                if (ajuu.h(context).r(ajus.CONFIG_ICON_SIZE)) {
                    b.getViewTreeObserver().addOnPreDrawListener(new kwe(b, 2));
                    ViewGroup.LayoutParams layoutParams3 = b.getLayoutParams();
                    layoutParams3.height = (int) ajuu.h(context).a(context, ajus.CONFIG_ICON_SIZE);
                    layoutParams3.width = -2;
                    b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    Drawable drawable = b.getDrawable();
                    if (drawable != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > intrinsicHeight + intrinsicHeight && layoutParams3.height > (dimension = (int) context.getResources().getDimension(R.dimen.sud_horizontal_icon_height))) {
                            i = layoutParams3.height - dimension;
                            layoutParams3.height = dimension;
                            layoutParams = a.getLayoutParams();
                            if (ajuu.h(context).r(ajus.CONFIG_ICON_MARGIN_TOP) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ((int) ajuu.h(context).a(context, ajus.CONFIG_ICON_MARGIN_TOP)) + i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            }
                        }
                    }
                }
                i = 0;
                layoutParams = a.getLayoutParams();
                if (ajuu.h(context).r(ajus.CONFIG_ICON_MARGIN_TOP)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, ((int) ajuu.h(context).a(context, ajus.CONFIG_ICON_MARGIN_TOP)) + i, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                }
            }
        }
        ajvx ajvxVar = (ajvx) i(ajvx.class);
        TextView textView = (TextView) ajvxVar.a.g(R.id.suc_layout_title);
        if (ajki.B(ajvxVar.a)) {
            View g = ajvxVar.a.g(R.id.sud_layout_header);
            ajgl.t(g);
            if (textView != null) {
                ajki.x(textView, new ajwf(ajus.CONFIG_HEADER_TEXT_COLOR, null, ajus.CONFIG_HEADER_TEXT_SIZE, ajus.CONFIG_HEADER_FONT_FAMILY, ajus.CONFIG_HEADER_FONT_WEIGHT, null, ajus.CONFIG_HEADER_TEXT_MARGIN_TOP, ajus.CONFIG_HEADER_TEXT_MARGIN_BOTTOM, ajki.z(textView.getContext())));
            }
            ViewGroup viewGroup = (ViewGroup) g;
            if (viewGroup != null) {
                Context context2 = viewGroup.getContext();
                viewGroup.setBackgroundColor(ajuu.h(context2).c(context2, ajus.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
                if (ajuu.h(context2).r(ajus.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM)) {
                    ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, (int) ajuu.h(context2).a(context2, ajus.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM));
                        viewGroup.setLayoutParams(layoutParams4);
                    }
                }
            }
        }
        ajvxVar.c();
        if (ajvxVar.b) {
            ajvxVar.b(textView);
        }
        ajvv ajvvVar = (ajvv) i(ajvv.class);
        TextView textView2 = (TextView) ajvvVar.a.g(R.id.sud_layout_subtitle);
        if (textView2 != null && ajki.B(ajvvVar.a)) {
            ajki.x(textView2, new ajwf(ajus.CONFIG_DESCRIPTION_TEXT_COLOR, ajus.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, ajus.CONFIG_DESCRIPTION_TEXT_SIZE, ajus.CONFIG_DESCRIPTION_FONT_FAMILY, ajus.CONFIG_DESCRIPTION_FONT_WEIGHT, ajus.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, ajus.CONFIG_DESCRIPTION_TEXT_MARGIN_TOP, ajus.CONFIG_DESCRIPTION_TEXT_MARGIN_BOTTOM, ajki.z(textView2.getContext())));
        }
        ajwc ajwcVar = (ajwc) i(ajwc.class);
        ProgressBar a2 = ajwcVar.a();
        if (ajwcVar.b && a2 != null) {
            if (((GlifLayout) ajwcVar.a).p()) {
                Context context3 = a2.getContext();
                ViewGroup.LayoutParams layoutParams5 = a2.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    int i2 = marginLayoutParams4.topMargin;
                    if (ajuu.h(context3).r(ajus.CONFIG_PROGRESS_BAR_MARGIN_TOP)) {
                        i2 = (int) ajuu.h(context3).b(context3, ajus.CONFIG_PROGRESS_BAR_MARGIN_TOP, context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_top));
                    }
                    int i3 = marginLayoutParams4.bottomMargin;
                    if (ajuu.h(context3).r(ajus.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM)) {
                        i3 = (int) ajuu.h(context3).b(context3, ajus.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM, context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                    }
                    if (i2 != marginLayoutParams4.topMargin || i3 != marginLayoutParams4.bottomMargin) {
                        marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, i2, marginLayoutParams4.rightMargin, i3);
                    }
                }
            } else {
                Context context4 = a2.getContext();
                ViewGroup.LayoutParams layoutParams6 = a2.getLayoutParams();
                if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    marginLayoutParams5.setMargins(marginLayoutParams5.leftMargin, (int) context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_top), marginLayoutParams5.rightMargin, (int) context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                }
            }
        }
        ajwb ajwbVar = (ajwb) i(ajwb.class);
        if (ajki.B(ajwbVar.a)) {
            ImageView imageView = (ImageView) ajwbVar.a.g(R.id.sud_account_avatar);
            TextView textView3 = (TextView) ajwbVar.a.g(R.id.sud_account_name);
            LinearLayout linearLayout = (LinearLayout) ajwbVar.a.g(R.id.sud_layout_profile);
            ajgl.t(ajwbVar.a.g(R.id.sud_layout_header));
            if (imageView != null && textView3 != null) {
                Context context5 = imageView.getContext();
                ViewGroup.LayoutParams layoutParams7 = imageView.getLayoutParams();
                if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7;
                    marginLayoutParams6.setMargins(marginLayoutParams6.leftMargin, marginLayoutParams6.topMargin, (int) ajuu.h(context5).a(context5, ajus.CONFIG_ACCOUNT_AVATAR_MARGIN_END), marginLayoutParams6.bottomMargin);
                }
                imageView.setMaxHeight((int) ajuu.h(context5).b(context5, ajus.CONFIG_ACCOUNT_AVATAR_SIZE, context5.getResources().getDimension(R.dimen.sud_account_avatar_max_height)));
                textView3.setTextSize(0, (int) ajuu.h(context5).b(context5, ajus.CONFIG_ACCOUNT_NAME_TEXT_SIZE, context5.getResources().getDimension(R.dimen.sud_account_name_text_size)));
                Typeface create = Typeface.create(ajuu.h(context5).j(context5, ajus.CONFIG_ACCOUNT_NAME_FONT_FAMILY), 0);
                if (create != null) {
                    textView3.setTypeface(create);
                }
                linearLayout.setGravity(ajki.z(linearLayout.getContext()));
            }
        }
        ajvw ajvwVar = (ajvw) i(ajvw.class);
        if (ajki.B(ajvwVar.a) && ajvwVar.b() != null) {
            ajgl.t(ajvwVar.b());
        }
        TextView textView4 = (TextView) g(R.id.sud_layout_description);
        if (textView4 != null) {
            if (this.i) {
                ajki.x(textView4, new ajwf(ajus.CONFIG_DESCRIPTION_TEXT_COLOR, ajus.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, ajus.CONFIG_DESCRIPTION_TEXT_SIZE, ajus.CONFIG_DESCRIPTION_FONT_FAMILY, ajus.CONFIG_DESCRIPTION_FONT_WEIGHT, ajus.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, null, null, ajki.z(textView4.getContext())));
            } else if (e()) {
                ajwf ajwfVar = new ajwf(null, null, null, null, null, null, null, null, ajki.z(textView4.getContext()));
                ajki.y(textView4, ajwfVar);
                textView4.setGravity(ajwfVar.i);
            }
        }
    }

    public final boolean p() {
        if (this.i) {
            return true;
        }
        if (e() && ajuu.u(getContext())) {
            return true;
        }
        return false;
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.h = true;
        this.i = false;
        q(null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = true;
        this.i = false;
        q(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
        this.i = false;
        q(attributeSet, i);
    }
}
