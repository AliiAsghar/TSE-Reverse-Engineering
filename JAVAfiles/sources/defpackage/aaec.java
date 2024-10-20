package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaec extends ClickableSpan {
    final /* synthetic */ aaed a;
    final /* synthetic */ Context b;

    public aaec(aaed aaedVar, Context context) {
        this.a = aaedVar;
        this.b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Intent o = ((lzv) this.a.b.b()).o(this.b);
        o.getClass();
        akto.n(this.b, o);
    }
}
