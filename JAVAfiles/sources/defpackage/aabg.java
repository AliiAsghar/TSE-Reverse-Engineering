package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aabg extends ClickableSpan {
    final /* synthetic */ aabi a;

    public aabg(aabi aabiVar) {
        this.a = aabiVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        aabi aabiVar = this.a;
        aabiVar.ai.e(aabiVar.fe(), "Messenger_main");
    }
}
