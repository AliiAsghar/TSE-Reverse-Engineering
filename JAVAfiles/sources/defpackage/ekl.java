package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekl implements TextWatcher {
    private final EditText b;
    private dyl e;
    public int a = Integer.MAX_VALUE;
    private int c = 0;
    private int d = 0;

    public ekl(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.b.isInEditMode()) {
            int i = this.c;
            int i2 = this.d;
            if (i2 > 0) {
                int a = ejx.b().a();
                if (a != 0) {
                    if (a != 1) {
                        if (a != 3) {
                            return;
                        }
                    } else {
                        ejx.b().d(editable, i, i + i2, this.a, 0);
                        return;
                    }
                }
                ejx b = ejx.b();
                if (this.e == null) {
                    this.e = new ekk(this.b, 0);
                }
                b.i(this.e);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c = i;
        if (i2 > i3) {
            i3 = 0;
        }
        this.d = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
