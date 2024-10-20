package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajni extends ajnc {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public ajni(ajnb ajnbVar, int i) {
        super(ajnbVar);
        this.b = R.drawable.design_password_eye;
        this.c = new ajeg(this, 4);
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.ajnc
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.ajnc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ajnc
    public final View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.ajnc
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.ajnc
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.ajnc
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ajnc
    public final boolean s() {
        return true;
    }

    @Override // defpackage.ajnc
    public final boolean t() {
        if (!k()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ajnc
    public final void y() {
        x();
    }
}
