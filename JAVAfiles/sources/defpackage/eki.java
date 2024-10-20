package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eki implements InputFilter {
    private final TextView a;
    private dyl b;

    public eki(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int a = ejx.b().a();
        if (a != 0) {
            if (a != 1) {
                if (a != 3) {
                    return charSequence;
                }
            } else {
                if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.a.getText()) && charSequence != null) {
                    if (i == 0) {
                        if (i2 != charSequence.length()) {
                            i = 0;
                        }
                        return ejx.b().h(charSequence, charSequence.length());
                    }
                    charSequence = charSequence.subSequence(i, i2);
                    return ejx.b().h(charSequence, charSequence.length());
                }
                return charSequence;
            }
        }
        ejx b = ejx.b();
        if (this.b == null) {
            this.b = new ekk(this.a, 1);
        }
        b.i(this.b);
        return charSequence;
    }
}
