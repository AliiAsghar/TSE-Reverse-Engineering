package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eku implements ekv {
    public eli a;

    public eku(eli eliVar) {
        this.a = eliVar;
    }

    @Override // defpackage.ekv
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.ekv
    public final boolean b(CharSequence charSequence, int i, int i2, elg elgVar) {
        Spannable spannableString;
        if ((elgVar.b & 4) <= 0) {
            if (this.a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.a = new eli(spannableString);
            }
            this.a.setSpan(new ela(elgVar), i, i2, 33);
        }
        return true;
    }
}
