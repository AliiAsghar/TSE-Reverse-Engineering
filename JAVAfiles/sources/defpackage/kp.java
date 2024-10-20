package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kp extends MultiAutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final ki b;
    private final lg c;
    private final fdx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        pt.a(context);
        pr.d(this, getContext());
        ktk A = ktk.A(getContext(), attributeSet, a, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle, 0);
        if (A.v(0)) {
            setDropDownBackgroundDrawable(A.p(0));
        }
        A.t();
        ki kiVar = new ki(this);
        this.b = kiVar;
        kiVar.b(attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        lg lgVar = new lg(this);
        this.c = lgVar;
        lgVar.h(attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        lgVar.e();
        fdx fdxVar = new fdx(this);
        this.d = fdxVar;
        fdxVar.d(attributeSet, com.google.android.apps.messaging.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (fdx.e(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener f = fdx.f(keyListener);
            if (f != keyListener) {
                super.setKeyListener(f);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ki kiVar = this.b;
        if (kiVar != null) {
            kiVar.a();
        }
        lg lgVar = this.c;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ef.h(onCreateInputConnection, editorInfo, this);
        return this.d.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.b;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.b;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.c;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.c;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(d.f(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(fdx.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lg lgVar = this.c;
        if (lgVar != null) {
            lgVar.i(context, i);
        }
    }
}
