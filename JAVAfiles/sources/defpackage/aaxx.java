package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxx extends ClickableSpan {
    final /* synthetic */ aaxz a;

    public aaxx(aaxz aaxzVar) {
        this.a = aaxzVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.l();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format((String) aaxz.a.e(), yhx.b(this.a.d).getLanguage())));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            akto.n(context, intent);
        } catch (ActivityNotFoundException unused) {
            aaxz.c.q("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}
