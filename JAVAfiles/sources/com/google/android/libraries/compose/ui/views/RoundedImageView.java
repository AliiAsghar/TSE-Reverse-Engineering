package com.google.android.libraries.compose.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.messaging.R;
import defpackage.afri;
import defpackage.agfs;
import defpackage.agft;
import defpackage.agfu;
import defpackage.agfv;
import defpackage.agfw;
import defpackage.arro;
import defpackage.arrr;
import defpackage.arsc;
import defpackage.arsn;
import defpackage.artm;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RoundedImageView extends AppCompatImageView {
    static final /* synthetic */ artm[] a;
    public float b;
    private final arsn c;
    private RectF d;
    private final Path e;
    private final Paint f;
    private int g;

    static {
        arrr arrrVar = new arrr(RoundedImageView.class, "aspectRatio", "getAspectRatio()Lcom/google/android/libraries/compose/media/AspectRatio;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context) {
        super(context);
        context.getClass();
        this.c = new agfu(this);
        this.e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
    }

    private final void c(AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, agfs.a, 0, 0);
        Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(1, brg.a));
        if (valueOf.floatValue() > brg.a) {
            z = true;
        } else {
            z = false;
        }
        Boolean.valueOf(z).getClass();
        afri afriVar = null;
        if (true != z) {
            valueOf = null;
        }
        if (valueOf != null) {
            afriVar = new afri(valueOf.floatValue());
        }
        b(afriVar);
        this.b = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.g = obtainStyledAttributes.getColor(3, getContext().getColor(R.color.rounded_image_view_default_background_fill));
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.f.setColor(this.g);
    }

    public final void b(afri afriVar) {
        this.c.d(a[0], afriVar);
    }

    @Override // android.view.View
    public final ViewOutlineProvider getOutlineProvider() {
        return new agft(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        RectF rectF = this.d;
        RectF rectF2 = null;
        if (rectF == null) {
            arro.b("dimensionsRect");
            rectF = null;
        }
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, this.f);
        this.e.reset();
        Path path = this.e;
        RectF rectF3 = this.d;
        if (rectF3 == null) {
            arro.b("dimensionsRect");
        } else {
            rectF2 = rectF3;
        }
        float f2 = this.b;
        path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
        canvas.clipPath(this.e);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        afri afriVar = (afri) this.c.c(a[0]);
        if (afriVar != null) {
            if (size > 0 && size2 > 0) {
                int a2 = afriVar.a(size);
                if (a2 <= size2) {
                    size2 = a2;
                } else {
                    size = afriVar.b(size2);
                }
            } else if (size > 0) {
                size2 = afriVar.a(size);
            } else if (size2 > 0) {
                size = afriVar.b(size2);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        RectF rectF = this.d;
        if (rectF == null) {
            this.d = new RectF(brg.a, brg.a, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.d;
        if (rectF2 == null) {
            arro.b("dimensionsRect");
            rectF2 = null;
        }
        rectF2.bottom = getMeasuredHeight();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.d;
        float f = i;
        float f2 = i2;
        if (rectF == null) {
            this.d = new RectF(brg.a, brg.a, f, f2);
            return;
        }
        rectF.right = f;
        RectF rectF2 = this.d;
        if (rectF2 == null) {
            arro.b("dimensionsRect");
            rectF2 = null;
        }
        rectF2.bottom = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = new agfv(this);
        this.e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        if (attributeSet != null) {
            c(attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = new agfw(this);
        this.e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        if (attributeSet != null) {
            c(attributeSet);
        }
    }
}
