package defpackage;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfy extends ClickableSpan {
    final /* synthetic */ abfw a;

    public abfy(abfw abfwVar) {
        this.a = abfwVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Intent n = ((lzv) this.a.h.b()).n(this.a.j);
        n.getClass();
        akto.n(this.a.j, n);
    }
}
