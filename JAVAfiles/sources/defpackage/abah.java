package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abah extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ abai b;

    public abah(abai abaiVar, Context context) {
        this.a = context;
        this.b = abaiVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        akto.n(this.a, ((lzv) this.b.e.b()).o(this.a));
    }
}
