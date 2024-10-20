package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kk extends CheckedTextView {
    private final ki a;
    private final lg b;
    private final apvo c;
    private fvq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        pt.a(context);
        pr.d(this, getContext());
        lg lgVar = new lg(this);
        this.b = lgVar;
        lgVar.h(attributeSet, R.attr.checkedTextViewStyle);
        lgVar.e();
        ki kiVar = new ki(this);
        this.a = kiVar;
        kiVar.b(attributeSet, R.attr.checkedTextViewStyle);
        apvo apvoVar = new apvo(this);
        this.c = apvoVar;
        apvoVar.e(attributeSet);
        a().D(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final fvq a() {
        if (this.d == null) {
            this.d = new fvq((TextView) this, (byte[]) null);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.a();
        }
        apvo apvoVar = this.c;
        if (apvoVar != null) {
            apvoVar.d();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return efn.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ef.h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().E(z);
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(d.f(getContext(), i));
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
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(efn.c(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        apvo apvoVar = this.c;
        if (apvoVar != null) {
            if (apvoVar.a) {
                apvoVar.a = false;
            } else {
                apvoVar.a = true;
                apvoVar.d();
            }
        }
    }
}
