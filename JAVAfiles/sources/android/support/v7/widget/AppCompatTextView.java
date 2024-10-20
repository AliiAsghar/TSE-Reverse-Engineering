package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.d;
import defpackage.ece;
import defpackage.ef;
import defpackage.efn;
import defpackage.fcp;
import defpackage.fvq;
import defpackage.ki;
import defpackage.lf;
import defpackage.lg;
import defpackage.lh;
import defpackage.li;
import defpackage.lj;
import defpackage.pr;
import defpackage.pt;
import defpackage.qn;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final ki a;
    private final lg b;
    private boolean c;
    private Typeface d;
    private Typeface e;
    private String f;
    private lh g;
    private final fcp h;
    private fvq i;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final void a(Typeface typeface) {
        this.e = typeface;
        super.setTypeface(typeface);
    }

    private final fvq b() {
        if (this.i == null) {
            this.i = new fvq((TextView) this, (byte[]) null);
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.a();
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (qn.c) {
            return super.getAutoSizeMaxTextSize();
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            return lgVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (qn.c) {
            return super.getAutoSizeMinTextSize();
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            return lgVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (qn.c) {
            return super.getAutoSizeStepGranularity();
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            return lgVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (qn.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            return lgVar.p();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (qn.c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        lg lgVar = this.b;
        if (lgVar == null) {
            return 0;
        }
        return lgVar.d();
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return efn.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return this.f;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        fcp fcpVar;
        if (Build.VERSION.SDK_INT < 28 && (fcpVar = this.h) != null) {
            return fcpVar.k();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return this.d;
    }

    final lh j() {
        lh lhVar;
        if (this.g == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                lhVar = new lj(this);
            } else if (Build.VERSION.SDK_INT >= 28) {
                lhVar = new li(this);
            } else {
                lhVar = new lh(this);
            }
            this.g = lhVar;
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lg.r(this, onCreateInputConnection, editorInfo);
        ef.h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        lg lgVar = this.b;
        if (lgVar != null && !qn.c && lgVar.o()) {
            lgVar.g();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        b().E(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (qn.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (qn.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (qn.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.m(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? d.f(context, i) : null, i2 != 0 ? d.f(context, i2) : null, i3 != 0 ? d.f(context, i3) : null, i4 != 0 ? d.f(context, i4) : null);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? d.f(context, i) : null, i2 != 0 ? d.f(context, i2) : null, i3 != 0 ? d.f(context, i3) : null, i4 != 0 ? d.f(context, i4) : null);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(efn.c(this, callback));
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(b().F(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            j().a(i);
        } else {
            efn.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        String fontVariationSettings;
        boolean fontVariationSettings2;
        Typeface typeface = this.d;
        if (this.e != getPaint().getTypeface()) {
            Log.w("AppCompatTextView", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = getPaint().getTypeface();
        }
        ece eceVar = new ece(typeface, str);
        Typeface typeface2 = (Typeface) lf.a.b(eceVar);
        if (typeface2 == null) {
            Paint paint = lf.b;
            if (paint == null) {
                paint = new Paint();
                lf.b = paint;
            }
            fontVariationSettings = paint.getFontVariationSettings();
            if (Objects.equals(fontVariationSettings, str)) {
                paint.setFontVariationSettings(null);
            }
            paint.setTypeface(typeface);
            fontVariationSettings2 = paint.setFontVariationSettings(str);
            if (fontVariationSettings2) {
                typeface2 = paint.getTypeface();
                lf.a.c(eceVar, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 != null) {
            a(typeface2);
            this.f = str;
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            j().b(i);
        } else {
            efn.e(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        efn.f(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        fcp fcpVar;
        if (Build.VERSION.SDK_INT < 28 && (fcpVar = this.h) != null) {
            fcpVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (qn.c) {
            super.setTextSize(i, f);
            return;
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.n(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        this.d = typeface;
        a(typeface);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            j().c(i, f);
        } else {
            efn.g(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        if (typeface != null && i > 0) {
            if (getContext() != null) {
                typeface = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.c = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pt.a(context);
        this.c = false;
        this.g = null;
        pr.d(this, getContext());
        ki kiVar = new ki(this);
        this.a = kiVar;
        kiVar.b(attributeSet, i);
        lg lgVar = new lg(this);
        this.b = lgVar;
        lgVar.h(attributeSet, i);
        lgVar.e();
        this.h = new fcp(this);
        b().D(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }
}
