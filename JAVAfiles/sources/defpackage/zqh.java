package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqh extends Drawable {
    private final String a;
    private final TextPaint b;
    private final Rect c;

    static {
        new Paint();
    }

    public zqh(String str, Typeface typeface, float f, int i) {
        TextPaint textPaint = new TextPaint();
        this.b = textPaint;
        Rect rect = new Rect();
        this.c = rect;
        this.a = str;
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f);
        textPaint.setColor(i);
        textPaint.bgColor = 0;
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        rect.setEmpty();
        textPaint.getTextBounds("a", 0, 1, rect);
        if (str != null) {
            int i2 = rect.top;
            int i3 = rect.bottom;
            textPaint.getTextBounds(str, 0, str.length(), rect);
            rect.top = i2;
            rect.bottom = i3;
        } else {
            rect.left = 0;
            rect.right = 0;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.b.getAlpha() != 0) {
            canvas.drawColor(this.b.bgColor);
            String str = this.a;
            if (str != null) {
                canvas.drawText(str, r0.centerX(), r0.centerY() + (this.c.height() / 2), this.b);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.b.bgColor != 0) {
            return -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.b.getAlpha()) {
            this.b.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
