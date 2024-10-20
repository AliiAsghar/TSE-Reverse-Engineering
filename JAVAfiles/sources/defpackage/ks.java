package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ks extends RadioButton implements egv {
    private final kl a;
    private final ki b;
    private final lg c;
    private fvq d;

    public ks(Context context) {
        this(context, null);
    }

    private final fvq c() {
        if (this.d == null) {
            this.d = new fvq((TextView) this, (byte[]) null);
        }
        return this.d;
    }

    @Override // defpackage.egv
    public final void a(PorterDuff.Mode mode) {
        throw null;
    }

    @Override // defpackage.egv
    public final void b() {
        throw null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c().E(z);
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(d.f(getContext(), i));
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

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(c().F(inputFilterArr));
    }

    public ks(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        kl klVar = this.a;
        if (klVar != null) {
            klVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(Context context, AttributeSet attributeSet, byte[] bArr) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        pt.a(context);
        pr.d(this, getContext());
        kl klVar = new kl(this);
        this.a = klVar;
        klVar.b(attributeSet, R.attr.radioButtonStyle);
        ki kiVar = new ki(this);
        this.b = kiVar;
        kiVar.b(attributeSet, R.attr.radioButtonStyle);
        lg lgVar = new lg(this);
        this.c = lgVar;
        lgVar.h(attributeSet, R.attr.radioButtonStyle);
        c().D(attributeSet, R.attr.radioButtonStyle);
    }
}
