package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.messaging.R;
import defpackage.ajgk;
import defpackage.ajig;
import defpackage.ajnj;
import defpackage.ajnr;
import defpackage.kn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TextInputEditText extends kn {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c(TextInputLayout textInputLayout) {
        if (textInputLayout != null && this.b) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout b = b();
        if (c(b) && rect != null) {
            b.getFocusedRect(this.a);
            rect.bottom = this.a.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout b = b();
        if (c(b)) {
            boolean globalVisibleRect = b.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
                return true;
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        if (b != null && b.k) {
            return b.d();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.k && super.getHint() == null && ajgk.e()) {
            setHint("");
        }
    }

    @Override // defpackage.kn, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        CharSequence charSequence;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout b = b();
            if (b != null) {
                charSequence = b.d();
            } else {
                charSequence = null;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout b = b();
        if (c(b) && rect != null) {
            this.a.set(rect.left, rect.top, rect.right, rect.bottom + (b.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.a);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = ajig.a(context, attributeSet, ajnj.b, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }
}
