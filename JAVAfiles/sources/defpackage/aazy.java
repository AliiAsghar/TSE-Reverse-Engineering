package defpackage;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazy extends PhoneNumberFormattingTextWatcher {
    final /* synthetic */ aazt a;

    public aazy(aazt aaztVar) {
        this.a = aaztVar;
    }

    @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.a.a().setEnabled(!r2.h().isEmpty());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazy(aazt aaztVar, String str) {
        super(str);
        this.a = aaztVar;
    }
}
