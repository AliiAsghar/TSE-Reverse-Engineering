package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizo extends ecl {
    final /* synthetic */ EditText a;
    final /* synthetic */ TextView b;

    public aizo(EditText editText, TextView textView) {
        this.a = editText;
        this.b = textView;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        String str;
        String str2;
        super.c(view, efxVar);
        String str3 = "";
        if (this.a.getText() == null) {
            str = "";
        } else {
            str = this.a.getText().toString();
        }
        EditText editText = this.a;
        TextView textView = this.b;
        if (editText.getHint() == null) {
            str2 = "";
        } else {
            str2 = editText.getHint().toString();
        }
        if (textView.getText() != null) {
            str3 = textView.getText().toString();
        }
        CharSequence co = a.co(str3, str2, " ");
        efxVar.B(co);
        efxVar.N(str.isEmpty());
        if (str.isEmpty()) {
            efxVar.Q(co);
        } else {
            efxVar.Q(str);
        }
    }
}
