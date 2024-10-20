package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kj extends Button {
    public final ki a;
    private final lg b;
    private fvq c;

    public kj(Context context) {
        this(context, null);
    }

    private final fvq a() {
        if (this.c == null) {
            this.c = new fvq((TextView) this, (byte[]) null);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        lg lgVar = this.b;
        if (lgVar != null && !qn.c && lgVar.o()) {
            lgVar.g();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().E(z);
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(efn.c(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().F(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.i(context, i);
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

    public kj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pt.a(context);
        pr.d(this, getContext());
        ki kiVar = new ki(this);
        this.a = kiVar;
        kiVar.b(attributeSet, i);
        lg lgVar = new lg(this);
        this.b = lgVar;
        lgVar.h(attributeSet, i);
        lgVar.e();
        a().D(attributeSet, i);
    }
}
