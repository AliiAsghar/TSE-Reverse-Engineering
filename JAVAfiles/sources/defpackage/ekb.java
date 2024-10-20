package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekb extends ReplacementSpan {
    public final ejy a;
    private final Paint.FontMetricsInt b = new Paint.FontMetricsInt();
    private short c = -1;
    private float d = 1.0f;

    public ekb(ejy ejyVar) {
        d.aC(ejyVar, "metadata cannot be null");
        this.a = ejyVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        ejx.b();
        ejy ejyVar = this.a;
        Object obj = ejyVar.c.a;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) obj);
        int i6 = ejyVar.a;
        canvas.drawText((char[]) ejyVar.c.d, i6 + i6, 2, f, i4, paint);
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        paint.getFontMetricsInt(this.b);
        Paint.FontMetricsInt fontMetricsInt2 = this.b;
        this.d = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) / this.a.d();
        this.a.d();
        gku e = this.a.e();
        int a = e.a(12);
        if (a != 0) {
            s = ((ByteBuffer) e.b).getShort(a + e.a);
        } else {
            s = 0;
        }
        this.c = (short) (s * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.b.ascent;
            fontMetricsInt.descent = this.b.descent;
            fontMetricsInt.top = this.b.top;
            fontMetricsInt.bottom = this.b.bottom;
        }
        return this.c;
    }
}
