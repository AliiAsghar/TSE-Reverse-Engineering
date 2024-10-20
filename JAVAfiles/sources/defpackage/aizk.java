package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizk extends ClickableSpan {
    final /* synthetic */ aizn a;

    public aizk(aizn aiznVar) {
        this.a = aiznVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
