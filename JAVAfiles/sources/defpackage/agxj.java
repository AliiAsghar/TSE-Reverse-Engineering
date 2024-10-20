package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxj {
    private static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/renderer/UnicodeRenderableChecker");
    private final Bitmap b;
    private final TextPaint c;

    public agxj() {
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setTextSize(10.0f);
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.descent();
        textPaint.ascent();
        Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        this.b = createBitmap;
        new Canvas(createBitmap);
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/renderer/UnicodeRenderableChecker", "hasGlyph", 63, "UnicodeRenderableChecker.java")).q("Empty value");
            return false;
        }
        return this.c.hasGlyph(str);
    }
}
