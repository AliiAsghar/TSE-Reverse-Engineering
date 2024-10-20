package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abab extends URLSpan {
    public abab(String str) {
        super(str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
