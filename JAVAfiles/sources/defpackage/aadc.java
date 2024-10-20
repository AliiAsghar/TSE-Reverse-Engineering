package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadc extends ClickableSpan {
    final /* synthetic */ rry a;

    public aadc(rry rryVar) {
        this.a = rryVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        aktp.L(new aacc(this.a), view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
