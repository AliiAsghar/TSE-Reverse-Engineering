package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxa extends ClickableSpan {
    final /* synthetic */ kxb a;

    public kxa(kxb kxbVar) {
        this.a = kxbVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        try {
            ((ksm) this.a.c.b()).i(this.a.b.fe());
        } catch (ActivityNotFoundException e) {
            alwl alwlVar = (alwl) kxb.a.i();
            alwlVar.X(ydl.M, "GroupUpgradeBottomSheetFragmentPeer");
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
