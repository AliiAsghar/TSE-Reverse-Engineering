package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpy extends CharacterStyle implements UpdateAppearance {
    private final cnz a;

    public dpy(cnz cnzVar) {
        this.a = cnzVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            cnz cnzVar = this.a;
            if (d.F(cnzVar, coc.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (cnzVar instanceof cod) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((cod) this.a).a);
                textPaint.setStrokeMiter(((cod) this.a).b);
                int i = ((cod) this.a).d;
                if (a.bA(i, 0)) {
                    join = Paint.Join.MITER;
                } else if (a.bA(i, 1)) {
                    join = Paint.Join.ROUND;
                } else if (a.bA(i, 2)) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = ((cod) this.a).c;
                if (a.bA(i2, 0)) {
                    cap = Paint.Cap.BUTT;
                } else if (a.bA(i2, 1)) {
                    cap = Paint.Cap.ROUND;
                } else if (a.bA(i2, 2)) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
            }
        }
    }
}
