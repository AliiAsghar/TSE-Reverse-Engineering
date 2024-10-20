package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpj {
    public static final void a(TextPaint textPaint, float f) {
        if (!Float.isNaN(f)) {
            if (f < brg.a) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            textPaint.setAlpha(Math.round(f * 255.0f));
        }
    }
}
