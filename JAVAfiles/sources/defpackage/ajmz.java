package defpackage;

import android.text.Editable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmz extends ajif {
    final /* synthetic */ ajnb a;

    public ajmz(ajnb ajnbVar) {
        this.a = ajnbVar;
    }

    @Override // defpackage.ajif, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.ajif, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
