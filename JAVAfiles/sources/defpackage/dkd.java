package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkd extends dkc {
    private final CharSequence a;
    private final TextPaint b;

    public dkd(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.dkc
    public final int a(int i) {
        int textRunCursor;
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // defpackage.dkc
    public final int d(int i) {
        int textRunCursor;
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
