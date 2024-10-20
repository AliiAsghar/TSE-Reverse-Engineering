package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmm extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private ajmk e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ajmm, android.view.View] */
    public ajmm(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.s;
        if (i != 0) {
            Drawable f = d.f(context, i);
            this.c = f;
            if (f != null && f.isStateful()) {
                f.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.m != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.m;
            int[] iArr = ajkb.a;
            int a = ajkb.a(colorStateList, ajkb.c);
            int[] iArr2 = ajkb.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{ajkb.d, iArr2, StateSet.NOTHING}, new int[]{a, ajkb.a(colorStateList, iArr2), ajkb.a(colorStateList, ajkb.a)});
            boolean z = tabLayout.B;
            gradientDrawable = new RippleDrawable(colorStateList2, true == z ? null : gradientDrawable, true != z ? gradientDrawable2 : null);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.d, tabLayout.e, tabLayout.f, tabLayout.g);
        setGravity(17);
        setOrientation(!tabLayout.y ? 1 : 0);
        setClickable(true);
        eek.w(this, efu.k(getContext()));
    }

    private static final void d(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new fyc(view, 20, null));
    }

    public final void a(ajmk ajmkVar) {
        if (ajmkVar != this.e) {
            this.e = ajmkVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        c();
        ajmk ajmkVar = this.e;
        boolean z = false;
        if (ajmkVar != null) {
            TabLayout tabLayout = ajmkVar.g;
            if (tabLayout != null) {
                int a = tabLayout.a();
                if (a != -1 && a == ajmkVar.d) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    public final void c() {
        Drawable drawable;
        CharSequence charSequence;
        boolean z;
        int i;
        CharSequence charSequence2;
        int i2;
        Drawable drawable2;
        int i3;
        ajmk ajmkVar = this.e;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        this.a.setTextAppearance(this.d.h);
        if (isSelected() && (i3 = this.d.j) != -1) {
            this.a.setTextAppearance(i3);
        } else {
            this.a.setTextAppearance(this.d.i);
        }
        ColorStateList colorStateList = this.d.k;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView2 = this.a;
        ImageView imageView2 = this.b;
        ajmk ajmkVar2 = this.e;
        CharSequence charSequence3 = null;
        if (ajmkVar2 != null && (drawable2 = ajmkVar2.a) != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setTintList(this.d.l);
            PorterDuff.Mode mode = this.d.o;
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        ajmk ajmkVar3 = this.e;
        if (ajmkVar3 != null) {
            charSequence = ajmkVar3.b;
        } else {
            charSequence = null;
        }
        if (imageView2 != null) {
            if (drawable != null) {
                imageView2.setImageDrawable(drawable);
                imageView2.setVisibility(0);
                setVisibility(0);
            } else {
                imageView2.setVisibility(8);
                imageView2.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !isEmpty;
        if (textView2 != null) {
            if (!isEmpty) {
                int i4 = this.e.f;
                z = true;
            } else {
                z = false;
            }
            if (true != z2) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            textView2.setText(charSequence2);
            if (true != z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z = false;
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            if (z && imageView2.getVisibility() == 0) {
                i = (int) ajgl.i(getContext(), 8);
            } else {
                i = 0;
            }
            if (this.d.y) {
                if (i != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        ajmk ajmkVar4 = this.e;
        if (ajmkVar4 != null) {
            charSequence3 = ajmkVar4.c;
        }
        if (true != z2) {
            charSequence = charSequence3;
        }
        setTooltipText(charSequence);
        d(this.b);
        d(this.a);
        if (ajmkVar != null && !TextUtils.isEmpty(ajmkVar.c)) {
            setContentDescription(ajmkVar.c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && this.c.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        efx efxVar = new efx(accessibilityNodeInfo);
        efxVar.t(efu.i(0, 1, this.e.d, 1, isSelected()));
        if (isSelected()) {
            efxVar.r(false);
            efxVar.ac(efw.a);
        }
        efxVar.K(getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.d.t;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.d.p;
            if (isSelected()) {
                TabLayout tabLayout = this.d;
                if (tabLayout.j != -1) {
                    f = tabLayout.q;
                }
            }
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView != null && imageView.getVisibility() == 0) {
                i4 = 1;
            } else {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.d.r;
                }
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (this.d.x != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.e.b();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
