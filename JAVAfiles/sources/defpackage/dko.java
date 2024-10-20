package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dko implements LineHeightSpan {
    private final float a;

    public dko(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (dkq.a(fontMetricsInt) <= 0) {
            return;
        }
        fontMetricsInt.descent = (int) Math.ceil(fontMetricsInt.descent * (r4 / r3));
        fontMetricsInt.ascent = fontMetricsInt.descent - ((int) Math.ceil(this.a));
    }
}
