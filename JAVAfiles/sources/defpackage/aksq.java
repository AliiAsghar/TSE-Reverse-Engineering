package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aksq implements TextWatcher {
    final /* synthetic */ TextWatcher a;
    final /* synthetic */ String b;
    final /* synthetic */ aksr c;

    public aksq(aksr aksrVar, TextWatcher textWatcher, String str) {
        this.a = textWatcher;
        this.b = str;
        this.c = aksrVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (akqj.u()) {
            this.a.afterTextChanged(editable);
            return;
        }
        akrc b = this.c.b(this.b);
        try {
            this.a.afterTextChanged(editable);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (akqj.u()) {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        akrc b = this.c.b(this.b);
        try {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (akqj.u()) {
            this.a.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        akrc b = this.c.b(this.b);
        try {
            this.a.onTextChanged(charSequence, i, i2, i3);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
