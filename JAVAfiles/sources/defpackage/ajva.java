package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajva implements ajvf {
    public static final agxw n = new agxw("FooterBarMixin");
    public final Context a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    public LinearLayout f;
    public ajvb g;
    public ajvb h;
    int i;
    int j;
    final int k;
    final int l;
    public final ajur m;
    private final ViewStub o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;

    public ajva(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        ajur ajurVar = new ajur();
        this.m = ajurVar;
        Context context = templateLayout.getContext();
        this.a = context;
        this.o = (ViewStub) templateLayout.g(R.id.suc_layout_footer);
        ajvc.a.clear();
        ajue ajueVar = (ajue) templateLayout;
        this.b = ajueVar.e();
        this.c = ajueVar.d();
        this.d = ajueVar.f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajuf.a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.k = dimensionPixelSize;
        this.r = obtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        this.s = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        int color = obtainStyledAttributes.getColor(16, 0);
        this.t = color;
        int color2 = obtainStyledAttributes.getColor(20, 0);
        this.u = color2;
        this.e = obtainStyledAttributes.getBoolean(0, false);
        int color3 = obtainStyledAttributes.getColor(19, 0);
        this.v = color3;
        int color4 = obtainStyledAttributes.getColor(23, 0);
        this.w = color4;
        obtainStyledAttributes.getColor(18, 0);
        obtainStyledAttributes.getColor(22, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(17, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(21, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            ajvb o = ajgk.o(resourceId2, context);
            ajgk.s("setSecondaryButton");
            j();
            if (true != ajuu.q(context)) {
                i3 = R.style.SucPartnerCustomizationButton_Secondary;
            } else {
                i3 = R.style.SucGlifMaterialButton_Secondary;
            }
            ajui ajuiVar = new ajui(i(o, i3, ajus.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR), ajus.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR, ajus.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, ajus.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, ajus.CONFIG_FOOTER_SECONDARY_BUTTON_DISABLED_TEXT_COLOR, k(o.a), ajus.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR, ajus.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START, ajus.CONFIG_FOOTER_BUTTON_TEXT_SIZE, ajus.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, ajus.CONFIG_FOOTER_BUTTON_FONT_FAMILY, ajus.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, ajus.CONFIG_FOOTER_BUTTON_TEXT_STYLE, ajus.CONFIG_FOOTER_BUTTON_RADIUS, ajus.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
            Object l = l(o, ajuiVar);
            Button button = (Button) l;
            this.q = button.getId();
            if (l instanceof ajve) {
            } else if (button instanceof FooterActionButton) {
                ((FooterActionButton) l).b = false;
            } else {
                n.s("Set the primary button style error when setting secondary button.");
            }
            this.h = o;
            c(button, color2);
            m(button, ajuiVar);
            if (ajuu.q(context)) {
                boolean z = this.h.c;
                ajvc.c(button, color4);
            }
            d();
            ajurVar.b(true, true);
        }
        if (resourceId != 0) {
            ajvb o2 = ajgk.o(resourceId, context);
            ajgk.s("setPrimaryButton");
            j();
            if (true != ajuu.q(context)) {
                i2 = R.style.SucPartnerCustomizationButton_Primary;
            } else {
                i2 = R.style.SucGlifMaterialButton_Primary;
            }
            ajui ajuiVar2 = new ajui(i(o2, i2, ajus.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR), ajus.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR, ajus.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, ajus.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, ajus.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR, k(o2.a), ajus.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR, ajus.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START, ajus.CONFIG_FOOTER_BUTTON_TEXT_SIZE, ajus.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, ajus.CONFIG_FOOTER_BUTTON_FONT_FAMILY, ajus.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, ajus.CONFIG_FOOTER_BUTTON_TEXT_STYLE, ajus.CONFIG_FOOTER_BUTTON_RADIUS, ajus.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
            Object l2 = l(o2, ajuiVar2);
            Button button2 = (Button) l2;
            this.p = button2.getId();
            if (l2 instanceof ajve) {
            } else if (button2 instanceof FooterActionButton) {
                ((FooterActionButton) l2).b = true;
            } else {
                n.s("Set the primary button style error when setting primary button.");
            }
            this.g = o2;
            c(button2, color);
            m(button2, ajuiVar2);
            if (ajuu.q(context)) {
                boolean z2 = this.g.c;
                ajvc.c(button2, color3);
            }
            d();
            ajurVar.c(true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean h(Button button, float f) {
        String charSequence = button.getText().toString();
        Paint paint = new Paint();
        paint.setTextSize(button.getTextSize());
        paint.setTypeface(button.getTypeface());
        if (f < paint.measureText(charSequence)) {
            return true;
        }
        return false;
    }

    private final int i(ajvb ajvbVar, int i, ajus ajusVar) {
        int i2 = ajvbVar.d;
        if (i2 != 0 && !this.b && !ajuu.q(this.a)) {
            i = i2;
        }
        if (this.b) {
            Context context = this.a;
            if (ajuu.h(context).c(context, ajusVar) == 0) {
                if (true != ajuu.q(this.a)) {
                    return R.style.SucPartnerCustomizationButton_Secondary;
                }
                return R.style.SucGlifMaterialButton_Secondary;
            }
            if (true != ajuu.q(this.a)) {
                return R.style.SucPartnerCustomizationButton_Primary;
            }
            return R.style.SucGlifMaterialButton_Primary;
        }
        return i;
    }

    private final LinearLayout j() {
        if (this.f == null) {
            if (this.o != null) {
                this.o.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.a, R.style.SucPartnerCustomizationButtonBar_Stackable)));
                this.o.setLayoutResource(R.layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.o.inflate();
                this.f = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(this.i, this.r, this.j, this.s);
                    if (e()) {
                        linearLayout.setGravity(8388629);
                    }
                }
                LinearLayout linearLayout2 = this.f;
                if (linearLayout2 != null && this.b) {
                    if (!this.d) {
                        Context context = this.a;
                        linearLayout2.setBackgroundColor(ajuu.h(context).c(context, ajus.CONFIG_FOOTER_BAR_BG_COLOR));
                    }
                    if (ajuu.h(this.a).r(ajus.CONFIG_FOOTER_BUTTON_PADDING_TOP)) {
                        Context context2 = this.a;
                        this.r = (int) ajuu.h(context2).a(context2, ajus.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                    }
                    if (ajuu.h(this.a).r(ajus.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM)) {
                        Context context3 = this.a;
                        this.s = (int) ajuu.h(context3).a(context3, ajus.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                    }
                    if (ajuu.h(this.a).r(ajus.CONFIG_FOOTER_BAR_PADDING_START)) {
                        Context context4 = this.a;
                        this.i = (int) ajuu.h(context4).a(context4, ajus.CONFIG_FOOTER_BAR_PADDING_START);
                    }
                    if (ajuu.h(this.a).r(ajus.CONFIG_FOOTER_BAR_PADDING_END)) {
                        Context context5 = this.a;
                        this.j = (int) ajuu.h(context5).a(context5, ajus.CONFIG_FOOTER_BAR_PADDING_END);
                    }
                    linearLayout2.setPadding(this.i, this.r, this.j, this.s);
                    if (ajuu.h(this.a).r(ajus.CONFIG_FOOTER_BAR_MIN_HEIGHT)) {
                        Context context6 = this.a;
                        int a = (int) ajuu.h(context6).a(context6, ajus.CONFIG_FOOTER_BAR_MIN_HEIGHT);
                        if (a > 0) {
                            linearLayout2.setMinimumHeight(a);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.f;
    }

    private static ajus k(int i) {
        switch (i) {
            case 1:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return ajus.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.ajvd l(defpackage.ajvb r7, defpackage.ajui r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            int r8 = r8.o
            boolean r1 = defpackage.ajuu.q(r0)
            r2 = 0
            if (r1 == 0) goto L45
            r1 = 2132083610(0x7f15039a, float:1.9807367E38)
            if (r8 != r1) goto L1e
            ajve r3 = new ajve     // Catch: java.lang.IllegalArgumentException -> L2c
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper     // Catch: java.lang.IllegalArgumentException -> L2c
            r4.<init>(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L2c
            r5 = 2130970353(0x7f0406f1, float:1.7549414E38)
            r3.<init>(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2c
            goto L59
        L1e:
            ajve r3 = new ajve     // Catch: java.lang.IllegalArgumentException -> L2c
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper     // Catch: java.lang.IllegalArgumentException -> L2c
            r4.<init>(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L2c
            r5 = 2130970354(0x7f0406f2, float:1.7549416E38)
            r3.<init>(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2c
            goto L59
        L2c:
            r3 = move-exception
            agxw r4 = defpackage.ajva.n
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Applyed invalid material theme: "
            java.lang.String r3 = r5.concat(r3)
            r4.s(r3)
            if (r8 != r1) goto L42
            r8 = 2132083612(0x7f15039c, float:1.9807371E38)
            goto L45
        L42:
            r8 = 2132083613(0x7f15039d, float:1.9807373E38)
        L45:
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r8)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r1)
            r0 = 2131624525(0x7f0e024d, float:1.8876232E38)
            r1 = 0
            android.view.View r8 = r8.inflate(r0, r1, r2)
            r3 = r8
            ajvd r3 = (defpackage.ajvd) r3
        L59:
            r8 = r3
            android.widget.Button r8 = (android.widget.Button) r8
            int r0 = android.view.View.generateViewId()
            r8.setId(r0)
            java.lang.CharSequence r0 = r7.b
            r8.setText(r0)
            r8.setOnClickListener(r7)
            r8.setVisibility(r2)
            r0 = 1
            r8.setEnabled(r0)
            boolean r0 = r3 instanceof defpackage.ajve
            if (r0 == 0) goto L7c
            r0 = r3
            ajve r0 = (defpackage.ajve) r0
            r0.k = r7
            goto L8d
        L7c:
            boolean r0 = r8 instanceof com.google.android.setupcompat.template.FooterActionButton
            if (r0 == 0) goto L86
            r0 = r3
            com.google.android.setupcompat.template.FooterActionButton r0 = (com.google.android.setupcompat.template.FooterActionButton) r0
            r0.a = r7
            goto L8d
        L86:
            agxw r7 = defpackage.ajva.n
            java.lang.String r0 = "Set the footer button error!"
            r7.s(r0)
        L8d:
            r8.getId()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajva.l(ajvb, ajui):ajvd");
    }

    private final void m(Button button, ajui ajuiVar) {
        int c;
        RippleDrawable rippleDrawable;
        int i;
        Typeface create;
        GradientDrawable gradientDrawable;
        Drawable drawable;
        Drawable drawable2;
        boolean z;
        if (this.b) {
            Context context = this.a;
            boolean z2 = this.c;
            int id = button.getId();
            int i2 = this.p;
            ajvc.a.put(Integer.valueOf(button.getId()), button.getTextColors());
            if (!z2) {
                if (button.isEnabled()) {
                    ajvc.d(context, button, ajuiVar.f);
                } else {
                    ajvc.b(context, button, ajuiVar.d);
                }
                ajus ajusVar = ajuiVar.a;
                ajus ajusVar2 = ajuiVar.b;
                ajus ajusVar3 = ajuiVar.c;
                if (Build.VERSION.SDK_INT >= 29) {
                    z = true;
                } else {
                    z = false;
                }
                ajgk.r(z, "Update button background only support on sdk Q or higher");
                int c2 = ajuu.h(context).c(context, ajusVar);
                float z3 = ajuu.h(context).z(context, ajusVar2);
                int c3 = ajuu.h(context).c(context, ajusVar3);
                int[] iArr = new int[0];
                if (c2 != 0) {
                    if (z3 <= brg.a) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
                        float f = obtainStyledAttributes.getFloat(0, 0.26f);
                        obtainStyledAttributes.recycle();
                        z3 = f;
                    }
                    if (c3 == 0) {
                        c3 = c2;
                    }
                    ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, iArr}, new int[]{ajvc.a(c3, z3), c2});
                    button.getBackground().mutate().setState(new int[0]);
                    button.refreshDrawableState();
                    button.setBackgroundTintList(colorStateList);
                }
            }
            ajus ajusVar4 = ajuiVar.f;
            ajus ajusVar5 = ajuiVar.n;
            if (z2) {
                c = button.getTextColors().getDefaultColor();
            } else {
                c = ajuu.h(context).c(context, ajusVar4);
            }
            float z4 = ajuu.h(context).z(context, ajusVar5);
            Drawable background = button.getBackground();
            if (background instanceof InsetDrawable) {
                rippleDrawable = (RippleDrawable) ((InsetDrawable) background).getDrawable();
            } else if (background instanceof RippleDrawable) {
                rippleDrawable = (RippleDrawable) background;
            } else {
                rippleDrawable = null;
            }
            if (rippleDrawable != null) {
                int a = ajvc.a(c, z4);
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, StateSet.NOTHING}, new int[]{a, a, 0});
                if (ajuu.q(context) && (button instanceof ajve)) {
                    ajve ajveVar = (ajve) button;
                    if (ajveVar.j()) {
                        ajer ajerVar = ((MaterialButton) ajveVar).b;
                        if (ajerVar.m != colorStateList2) {
                            ajerVar.m = colorStateList2;
                            if (ajerVar.a.getBackground() instanceof RippleDrawable) {
                                ((RippleDrawable) ajerVar.a.getBackground()).setColor(ajkb.b(colorStateList2));
                            }
                        }
                    }
                } else {
                    rippleDrawable.setColor(colorStateList2);
                }
            }
            ajus ajusVar6 = ajuiVar.g;
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (ajuu.h(context).r(ajusVar6) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins((int) ajuu.h(context).a(context, ajusVar6), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            float a2 = ajuu.h(context).a(context, ajuiVar.h);
            if (a2 > brg.a) {
                button.setTextSize(0, a2);
            }
            ajus ajusVar7 = ajuiVar.i;
            if (ajuu.h(context).r(ajusVar7)) {
                float a3 = ajuu.h(context).a(context, ajusVar7);
                if (a3 > brg.a) {
                    button.setMinHeight((int) a3);
                }
            }
            ajus ajusVar8 = ajuiVar.j;
            ajus ajusVar9 = ajuiVar.k;
            ajus ajusVar10 = ajuiVar.l;
            String j = ajuu.h(context).j(context, ajusVar8);
            if (ajuu.h(context).r(ajusVar10)) {
                i = ajuu.h(context).d(context, ajusVar10, 0);
            } else {
                i = 0;
            }
            if (ajuu.o(context) && ajuu.h(context).r(ajusVar9)) {
                create = Typeface.create(Typeface.create(j, i), ajuu.h(context).d(context, ajusVar9, 400), false);
            } else {
                create = Typeface.create(j, i);
            }
            if (create != null) {
                button.setTypeface(create);
            }
            float a4 = ajuu.h(context).a(context, ajuiVar.m);
            if (ajuu.q(context) && (button instanceof ajve)) {
                ajve ajveVar2 = (ajve) button;
                int i3 = (int) a4;
                if (ajveVar2.j()) {
                    ajer ajerVar2 = ((MaterialButton) ajveVar2).b;
                    if (!ajerVar2.p || ajerVar2.h != i3) {
                        ajerVar2.h = i3;
                        ajerVar2.p = true;
                        ajerVar2.d(ajerVar2.b.b(i3));
                    }
                }
            } else {
                Drawable background2 = button.getBackground();
                if (background2 instanceof InsetDrawable) {
                    gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background2).getDrawable()).getDrawable(0);
                } else if (background2 instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable2 = (RippleDrawable) background2;
                    if (rippleDrawable2.getDrawable(0) instanceof GradientDrawable) {
                        gradientDrawable = (GradientDrawable) rippleDrawable2.getDrawable(0);
                    } else {
                        gradientDrawable = (GradientDrawable) ((InsetDrawable) rippleDrawable2.getDrawable(0)).getDrawable();
                    }
                } else {
                    gradientDrawable = null;
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(a4);
                }
            }
            ajus ajusVar11 = ajuiVar.e;
            if (button != null) {
                if (ajusVar11 != null) {
                    drawable = ajuu.h(context).f(context, ajusVar11);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                if (id != i2) {
                    drawable2 = null;
                } else {
                    drawable2 = drawable;
                }
                if (id == i2) {
                    drawable = null;
                }
                button.setCompoundDrawablesRelative(drawable, null, drawable2, null);
            }
            if (!this.c) {
                ajus ajusVar12 = ajuiVar.f;
                ajus ajusVar13 = ajuiVar.d;
                if (button.isEnabled()) {
                    ajvc.d(this.a, button, ajusVar12);
                } else {
                    ajvc.b(this.a, button, ajusVar13);
                }
            }
        }
    }

    public final Button a() {
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.p);
    }

    public final Button b() {
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.q);
    }

    protected final void c(Button button, int i) {
        boolean z;
        if (!this.c && i != 0) {
            HashMap hashMap = ajvc.a;
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.f.addView(button);
        Button a = a();
        Button b = b();
        boolean z2 = true;
        int i2 = 0;
        if (a != null && a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (b == null || b.getVisibility() != 0) {
            z2 = false;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (!z && !z2) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    protected final void d() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout j = j();
        Button a = a();
        Button b = b();
        j.removeAllViews();
        int i = this.a.getResources().getConfiguration().orientation;
        if (b != null) {
            j.addView(b);
        }
        if (!e() && !ajuu.q(this.a)) {
            Context context = this.a;
            LinearLayout j2 = j();
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            j2.addView(view);
        }
        if (a != null) {
            j.addView(a);
        }
        if (a != null && (layoutParams2 = (LinearLayout.LayoutParams) a.getLayoutParams()) != null) {
            layoutParams2.width = -2;
            layoutParams2.weight = brg.a;
            a.setLayoutParams(layoutParams2);
        }
        if (b != null && (layoutParams = (LinearLayout.LayoutParams) b.getLayoutParams()) != null) {
            layoutParams.width = -2;
            layoutParams.weight = brg.a;
            b.setLayoutParams(layoutParams);
        }
        if (ajuu.q(this.a)) {
            this.f.getViewTreeObserver().addOnGlobalLayoutListener(new ajuz(this));
        }
    }

    protected final boolean e() {
        if (ajuu.h(this.a).r(ajus.CONFIG_FOOTER_BUTTON_ALIGNED_END)) {
            Context context = this.a;
            return ajuu.h(context).l(context, ajus.CONFIG_FOOTER_BUTTON_ALIGNED_END, false);
        }
        return this.e;
    }

    public final boolean f() {
        if (a() != null && a().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (b() != null && b().getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
