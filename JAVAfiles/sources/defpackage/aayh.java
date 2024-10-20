package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayh extends ClickableSpan {
    final /* synthetic */ aayi a;

    public aayh(aayi aayiVar) {
        this.a = aayiVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        ((wyp) this.a.d.b()).m(amlw.RCS_PROVISIONING_PROMPT_LEARN_MORE_CLICKED);
        try {
            ((ksm) this.a.c.b()).i(this.a.b.fe());
        } catch (ActivityNotFoundException e) {
            alwl alwlVar = (alwl) aayi.a.i();
            alwlVar.X(ydl.M, "RcsDefaultOnBottomSheetFragmentPeer");
            ((alwl) alwlVar.g(e)).q("RCS Learn More Activity was not found.");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
