package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajbv extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ ajbw b;

    public ajbv(ajbw ajbwVar, String str) {
        this.a = str;
        this.b = ajbwVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.aG(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}
