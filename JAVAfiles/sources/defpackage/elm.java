package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class elm implements InputFilter {
    private final TextView a;
    private dyp b;

    public elm(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int b = ekt.c().b();
        if (b != 0) {
            if (b != 1) {
                if (b != 3) {
                    return charSequence;
                }
            } else {
                if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.a.getText()) && charSequence != null) {
                    if (i == 0) {
                        if (i2 != charSequence.length()) {
                            i = 0;
                        }
                        return ekt.c().i(charSequence, charSequence.length());
                    }
                    charSequence = charSequence.subSequence(i, i2);
                    return ekt.c().i(charSequence, charSequence.length());
                }
                return charSequence;
            }
        }
        ekt c = ekt.c();
        if (this.b == null) {
            this.b = new ell(this.a, this);
        }
        c.k(this.b);
        return charSequence;
    }
}
