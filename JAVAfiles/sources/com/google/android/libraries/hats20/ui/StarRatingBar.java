package com.google.android.libraries.hats20.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.RatingView;
import defpackage.agrs;
import defpackage.agsd;
import defpackage.aocn;
import defpackage.aoij;
import defpackage.gmz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class StarRatingBar extends View {
    public int a;
    public aoij b;
    private AccessibilityManager c;
    private Bitmap d;
    private Bitmap e;
    private Paint f;
    private int g;

    public StarRatingBar(Context context) {
        super(context);
        this.a = 11;
        b(context);
    }

    private final float a() {
        return (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.d.getWidth()) / (this.a - 1);
    }

    private final void b(Context context) {
        this.c = (AccessibilityManager) context.getSystemService("accessibility");
        this.d = d(context, R.drawable.ic_star_grey600_24dp);
        this.e = d(context, R.drawable.ic_star_border_grey600_24dp);
        Paint paint = new Paint(5);
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    private final void c(int i) {
        if (i > 0 && i <= this.a && i != this.g) {
            this.g = i;
            invalidate();
            aoij aoijVar = this.b;
            if (aoijVar != null) {
                int i2 = this.g;
                ((RatingView) aoijVar.a).a((View) aoijVar.b, i2, ((aocn) aoijVar.c).b);
                agsd agsdVar = ((RatingView) aoijVar.a).a;
                if (agsdVar != null) {
                    agsdVar.a(i2);
                }
            }
            if (this.c.isEnabled()) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private static final Bitmap d(Context context, int i) {
        gmz b = gmz.b(context.getResources(), i, null);
        Bitmap createBitmap = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        b.draw(canvas);
        return createBitmap;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            for (int i = 0; i < this.a; i++) {
                if (i < this.g) {
                    bitmap = this.d;
                } else {
                    bitmap = this.e;
                }
                canvas.drawBitmap(bitmap, getPaddingLeft() + (i * a()), getPaddingTop(), this.f);
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 21) {
            c(this.g - 1);
            return true;
        }
        if (i == 22) {
            c(this.g + 1);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize((this.a * this.d.getWidth()) + getPaddingLeft() + getPaddingRight(), i), resolveSize(this.d.getHeight() + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        agrs agrsVar = (agrs) parcelable;
        super.onRestoreInstanceState(agrsVar.getSuperState());
        this.a = agrsVar.a;
        this.g = agrsVar.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        agrs agrsVar = new agrs(super.onSaveInstanceState());
        agrsVar.a = this.a;
        agrsVar.b = this.g;
        return agrsVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 2) {
            return false;
        }
        float x = motionEvent.getX();
        motionEvent.getY();
        float a = a();
        float paddingLeft = getPaddingLeft() + (this.d.getWidth() / 2.0f) + (a / 2.0f);
        int i = 1;
        while (paddingLeft < x && i < this.a) {
            paddingLeft += a;
            i++;
        }
        c(i);
        return true;
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 11;
        b(context);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 11;
        b(context);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 11;
        b(context);
    }
}
