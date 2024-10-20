package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayg extends ClickableSpan {
    final /* synthetic */ aayi a;
    final /* synthetic */ Context b;

    public aayg(aayi aayiVar, Context context) {
        this.a = aayiVar;
        this.b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        ((wyp) this.a.d.b()).m(amlw.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_LEARN_MORE_CLICKED);
        Intent intent = new Intent(this.b, (Class<?>) RcsSettingsActivity.class);
        try {
            akto.n(this.b, intent);
        } catch (ActivityNotFoundException e) {
            alwl alwlVar = (alwl) aayi.a.i();
            alwlVar.X(ydl.M, "RcsDefaultOnBottomSheetFragmentPeer");
            ((alwl) alwlVar.g(e)).t("Activity was not found for intent, %s", intent);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
