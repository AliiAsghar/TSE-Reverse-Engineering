package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elr implements TextWatcher {
    public final EditText a;
    public boolean b = true;
    public dyp c;
    private int d;
    private int e;

    public elr(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ekt.c().d(editableText);
            d.w(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.a.isInEditMode() && this.b && ekt.g()) {
            int i = this.d;
            int i2 = this.e;
            if (i2 > 0) {
                int b = ekt.c().b();
                if (b != 0) {
                    if (b != 1) {
                        if (b != 3) {
                            return;
                        }
                    } else {
                        ekt.c().j(editable, i, i2 + i, 0);
                        return;
                    }
                }
                ekt c = ekt.c();
                if (this.c == null) {
                    this.c = new elq(this.a);
                }
                c.k(this.c);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = i;
        this.e = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
