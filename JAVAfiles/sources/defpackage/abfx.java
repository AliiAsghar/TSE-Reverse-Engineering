package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfx extends ClickableSpan {
    final /* synthetic */ abfw a;

    public abfx(abfw abfwVar) {
        this.a = abfwVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Context context = this.a.j;
        Uri parse = Uri.parse(context.getString(R.string.welcome_spam_learn_more_url, yhx.b(context).getLanguage()));
        Context context2 = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context2.getPackageName());
        try {
            context2.getClass();
            akto.n(context2, intent);
        } catch (ActivityNotFoundException e) {
            alwl alwlVar = (alwl) abfw.a.i();
            alwlVar.X(ydl.M, "WelcomeFragmentSpamPeer");
            ((alwl) alwlVar.g(e)).t("Activity was not found for intent, %s", intent);
        }
    }
}
