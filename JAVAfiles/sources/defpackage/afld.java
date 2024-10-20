package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afld implements aflk {
    public final EditText a;
    public final List b = new ArrayList();
    public TextWatcher c;

    public afld(EditText editText) {
        this.a = editText;
    }

    @Override // defpackage.aflb
    public final void b(CharSequence charSequence) {
        Editable text = this.a.getText();
        text.getClass();
        if (text.length() > 0) {
            c("\n");
        }
        c(charSequence);
    }

    @Override // defpackage.aflb
    public final void c(CharSequence charSequence) {
        this.a.getText().append(charSequence);
        this.a.setSelection(this.a.getText().length());
    }

    @Override // defpackage.aflb
    public final void d() {
        this.a.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // defpackage.aflb
    public final void e() {
        throw null;
    }

    @Override // defpackage.aflb
    public final void f(afnr afnrVar) {
        SpannableString spannableString = new SpannableString(afnrVar.b.a());
        spannableString.setSpan(new afla(afnrVar), 0, spannableString.length(), 256);
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        editText.getText().replace(selectionStart, editText.getSelectionEnd(), spannableString);
        int length = selectionStart + spannableString.length();
        aflm aflmVar = new aflm(length, length);
        int i = aflmVar.a;
        int length2 = this.a.length();
        this.a.setSelection(arrn.s(i, length2), arrn.s(aflmVar.b, length2));
    }

    @Override // defpackage.aflb
    public final void h(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setSelection(this.a.getText().length());
    }

    @Override // defpackage.aflb
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String a() {
        return this.a.getText().toString();
    }

    @Override // defpackage.aflk
    public final void j(aflj afljVar) {
        throw null;
    }

    @Override // defpackage.aflk
    public final void k(aflj afljVar) {
        throw null;
    }

    @Override // defpackage.aflb
    public final /* synthetic */ void g() {
    }
}
