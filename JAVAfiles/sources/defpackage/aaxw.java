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
public final class aaxw extends ClickableSpan {
    final /* synthetic */ aaxz a;

    public aaxw(aaxz aaxzVar) {
        this.a = aaxzVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        aaxz aaxzVar = this.a;
        int i = aaxzVar.r - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("There is no 'Privacy Policy' UMA metric for the Legal FYI UI.");
                    }
                    throw new IllegalStateException("There is no 'Privacy Policy' UMA metric for the PhoneNumberInput UI.");
                }
                str = "Bugle.Welcome.PrivacyPolicy.Clicked";
            } else {
                str = "Bugle.FastTrack.Settings.Dialog.Privacy.Clicked";
            }
        } else {
            str = "Bugle.FastTrack.ConversationList.Prompt.Privacy.Clicked";
        }
        aaxzVar.e.c(str);
        ((mho) aaxzVar.h.b()).S(amlw.RCS_PROVISIONING_PROMPT_PRIVACY_AND_POLICY_CLICKED, aaxzVar.g);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.a.i.a()));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            akto.n(context, intent);
        } catch (ActivityNotFoundException unused) {
            aaxz.c.q("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}
