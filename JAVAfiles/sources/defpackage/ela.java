package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ela extends ReplacementSpan {
    public final elg a;
    private TextPaint e;
    private final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public short b = -1;
    private float d = 1.0f;

    public ela(elg elgVar) {
        d.aC(elgVar, "rasterizer cannot be null");
        this.a = elgVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            int length = characterStyleArr.length;
            if (length != 0) {
                if (length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.b, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        ekt.c();
        elg elgVar = this.a;
        float f2 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        Object obj = elgVar.c.c;
        Typeface typeface = paint2.getTypeface();
        paint2.setTypeface((Typeface) obj);
        int i6 = elgVar.a;
        canvas.drawText((char[]) elgVar.c.b, i6 + i6, 2, f, f2, paint2);
        paint2.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        paint.getFontMetricsInt(this.c);
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        this.d = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) / this.a.d();
        this.a.d();
        fjl f = this.a.f();
        int x = f.x(12);
        if (x != 0) {
            s = ((ByteBuffer) f.c).getShort(x + f.b);
        } else {
            s = 0;
        }
        this.b = (short) (s * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.c.ascent;
            fontMetricsInt.descent = this.c.descent;
            fontMetricsInt.top = this.c.top;
            fontMetricsInt.bottom = this.c.bottom;
        }
        return this.b;
    }
}
