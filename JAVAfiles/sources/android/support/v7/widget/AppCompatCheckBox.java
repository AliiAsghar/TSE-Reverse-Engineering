package android.support.v7.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.d;
import defpackage.egv;
import defpackage.fvq;
import defpackage.ki;
import defpackage.kl;
import defpackage.lg;
import defpackage.pr;
import defpackage.pt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements egv {
    private final kl a;
    private final ki b;
    private final lg c;
    private fvq d;

    public AppCompatCheckBox(Context context) {
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
        kl klVar = this.a;
        if (klVar != null) {
            klVar.a = mode;
            klVar.c = true;
            klVar.a();
        }
    }

    @Override // defpackage.egv
    public final void b() {
        kl klVar = this.a;
        if (klVar != null) {
            klVar.b = true;
            klVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.b;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.b;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.f(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.c;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        kl klVar = this.a;
        if (klVar != null) {
            klVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pt.a(context);
        pr.d(this, getContext());
        kl klVar = new kl(this);
        this.a = klVar;
        klVar.b(attributeSet, i);
        ki kiVar = new ki(this);
        this.b = kiVar;
        kiVar.b(attributeSet, i);
        lg lgVar = new lg(this);
        this.c = lgVar;
        lgVar.h(attributeSet, i);
        c().D(attributeSet, i);
    }
}
