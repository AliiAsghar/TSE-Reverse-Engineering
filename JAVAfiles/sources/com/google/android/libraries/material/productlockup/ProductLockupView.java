package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.ahih;
import defpackage.ahii;
import defpackage.ahij;
import defpackage.d;
import defpackage.eek;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ProductLockupView extends ViewGroup {
    private static final Pattern d = Pattern.compile(String.format(" %1$s|%1$s ", "Google"));
    private static final int[] e = {1};
    private static final int[] f = {2};
    private static final int[] g = {1, 2};
    private static Typeface h;
    final ImageView a;
    final TextView b;
    ahii c;
    private final ahii i;
    private final ahii j;
    private Drawable k;
    private int l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;

    public ProductLockupView(Context context) {
        this(context, null);
    }

    private final int a() {
        if (this.m.isEmpty()) {
            return 0;
        }
        return Math.max(this.b.getPaint().getFontMetricsInt().top + this.b.getBaseline(), 0);
    }

    private final int b(ahii ahiiVar) {
        float f2;
        if (true != this.o) {
            f2 = 0.15f;
        } else {
            f2 = 1.0f;
        }
        return Math.round(ahiiVar.e * f2);
    }

    private final void c(View view, int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr = eek.a;
        boolean z = false;
        if (getLayoutDirection() == 1 && !this.n) {
            z = true;
        }
        if (z) {
            i5 = getMeasuredWidth() - i3;
        } else {
            i5 = i;
        }
        if (z) {
            i3 = getMeasuredWidth() - i;
        }
        view.layout(i5, i2, i3, i4);
    }

    private final void d() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.d, 1073741824));
    }

    private final void e() {
        this.b.setTextSize(0, this.c.a);
        TextView textView = this.b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        textView.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final void f(int i) {
        ahii ahiiVar;
        if (i != -1) {
            if (i != 0 && i != 1) {
                if (i == 2) {
                    ahiiVar = this.j;
                } else {
                    throw new IllegalStateException(a.bV(i, "Unrecognized sizingMode: "));
                }
            } else {
                ahiiVar = this.i;
            }
        } else {
            ahiiVar = null;
        }
        this.c = ahiiVar;
    }

    private final boolean g(int i, boolean z) {
        int i2;
        if (z) {
            ahii ahiiVar = this.c;
            i2 = ahiiVar.c + b(ahiiVar);
        } else {
            i2 = 0;
        }
        e();
        if (i2 + this.b.getMeasuredWidth() > i) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 0;
        if (this.a.getVisibility() != 8) {
            if (this.b.getVisibility() != 8 && !this.p) {
                i5 = this.b.getMeasuredWidth() + b(this.c);
            } else {
                i5 = 0;
            }
            int a = a() + this.c.b;
            c(this.a, i5, a, i5 + this.a.getMeasuredWidth(), a + this.a.getMeasuredHeight());
        }
        if (this.b.getVisibility() != 8) {
            if (this.a.getVisibility() != 8 && this.p) {
                i6 = b(this.c) + this.a.getMeasuredWidth();
            }
            int i7 = i6;
            int measuredWidth = i7 + this.b.getMeasuredWidth();
            TextView textView = this.b;
            c(textView, i7, 0, measuredWidth, textView.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int[] iArr;
        boolean z;
        ImageView imageView = this.a;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        imageView.setVisibility(0);
        this.b.setVisibility(0);
        this.p = this.m.startsWith("Google");
        boolean endsWith = this.m.endsWith("Google");
        int i4 = this.l;
        boolean z2 = true;
        if (i4 != -1) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        iArr = f;
                    } else {
                        throw new IllegalStateException(a.bV(i4, "Unrecognized sizingMode: "));
                    }
                } else {
                    iArr = e;
                }
            } else {
                iArr = g;
            }
        } else {
            iArr = null;
        }
        if (this.p || endsWith) {
            for (int i5 : iArr) {
                f(i5);
                if (g(size, true)) {
                    d();
                    e();
                    break;
                }
            }
        }
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                f(iArr[i6]);
                if (g(size, false)) {
                    e();
                    this.a.setVisibility(8);
                    break;
                }
                i6++;
            } else {
                f(1);
                this.p = true;
                d();
                this.b.setVisibility(8);
                break;
            }
        }
        if (this.a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.b.getVisibility() != 0) {
            z2 = false;
        }
        if (z) {
            i3 = this.a.getMeasuredWidth();
        }
        if (z2) {
            i3 += this.b.getMeasuredWidth();
        }
        if (z && z2) {
            i3 += b(this.c);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.a.getMeasuredHeight() + this.c.b + a(), this.b.getMeasuredHeight()), 1073741824));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        ahih ahihVar = (ahih) parcelable;
        super.onRestoreInstanceState(ahihVar.getSuperState());
        this.m = ahihVar.a;
        this.o = ahihVar.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ahih ahihVar = new ahih(super.onSaveInstanceState());
        ahihVar.a = this.m;
        ahihVar.b = this.o;
        return ahihVar;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    public ProductLockupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        int i2;
        if (h == null) {
            h = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.i = new ahii(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.j = new ahii(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.getClass();
        this.a = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        textView.getClass();
        this.b = textView;
        textView.setTypeface(h);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahij.a, i, R.style.Widget_GoogleMaterial_ProductLockupView);
        if (obtainStyledAttributes.hasValue(2)) {
            this.k = obtainStyledAttributes.getDrawable(2);
        } else {
            this.k = d.f(context, R.drawable.googlelogo_standard_color_74x24);
        }
        int i3 = obtainStyledAttributes.getInt(1, 0);
        this.l = i3;
        f(i3);
        textView.setTextColor(obtainStyledAttributes.getColor(4, 0));
        String string = obtainStyledAttributes.getString(0);
        String trim = (string == null ? "" : string).trim();
        this.m = trim;
        this.o = d.matcher(trim).find();
        this.n = TextUtils.isEmpty(string) || Charset.forName(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET).newEncoder().canEncode(string);
        if (this.m.startsWith("Google")) {
            str = this.m.substring(6).trim();
        } else if (this.m.endsWith("Google")) {
            str = this.m.substring(0, r7.length() - 6).trim();
        } else {
            str = this.m;
        }
        textView.setText(str);
        setContentDescription(this.m.isEmpty() ? "Google" : this.m);
        requestLayout();
        int i4 = obtainStyledAttributes.getInt(3, 0);
        if (i4 == 0) {
            imageView.setImageDrawable(this.k);
        } else {
            if (i4 == 1) {
                i2 = R.color.google_black;
            } else if (i4 == 2) {
                i2 = R.color.google_white;
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException(a.bV(i4, "Unrecognized logoColor: "));
                }
                i2 = R.color.google_grey700;
            }
            Drawable mutate = this.k.mutate();
            mutate.setTint(getContext().getColor(i2));
            imageView.setImageDrawable(mutate);
        }
        obtainStyledAttributes.recycle();
    }
}
