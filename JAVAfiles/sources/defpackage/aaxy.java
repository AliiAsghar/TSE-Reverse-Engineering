package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxy extends ClickableSpan {
    final /* synthetic */ aaxz a;

    public aaxy(aaxz aaxzVar) {
        this.a = aaxzVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.l();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "https://www.gstatic.com/policies/termssummary/rcs.pdf?hl=%1$s", yhx.b(this.a.i.c).getLanguage())));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            akto.n(context, intent);
        } catch (ActivityNotFoundException unused) {
            aaxz.c.q("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}
