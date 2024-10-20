package com.android.ex.chips;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CircularImageView extends ImageView {
    private final Matrix a;
    private final RectF b;
    private final RectF c;
    private final Paint d;
    private final Paint e;

    public CircularImageView(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable instanceof StateListDrawable) {
            if (((StateListDrawable) drawable).getCurrent() != null) {
                bitmapDrawable = (BitmapDrawable) drawable.getCurrent();
            } else {
                bitmapDrawable = null;
            }
        } else {
            bitmapDrawable = (BitmapDrawable) drawable;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            this.b.set(brg.a, brg.a, bitmap.getWidth(), bitmap.getHeight());
            this.c.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            RectF rectF = this.b;
            RectF rectF2 = this.c;
            BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.a.reset();
            this.a.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            bitmapShader.setLocalMatrix(this.a);
            this.d.setShader(bitmapShader);
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, this.d);
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), (rectF2.width() / 2.0f) - 0.5f, this.e);
        }
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Matrix();
        this.b = new RectF();
        this.c = new RectF();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
    }
}
