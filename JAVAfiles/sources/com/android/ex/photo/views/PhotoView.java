package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.messaging.R;
import defpackage.brg;
import defpackage.gtq;
import defpackage.hik;
import defpackage.hil;
import defpackage.him;
import defpackage.ryg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhotoView extends View implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    private static int d;
    private static boolean e;
    private static Paint f;
    private static Paint g;
    public final Matrix a;
    public hik b;
    public final RectF c;
    private final int h;
    private ScaleGestureDetector i;
    private View.OnClickListener j;
    private him k;
    private hil l;
    private final RectF m;
    private final float[] n;
    private boolean o;
    private float p;
    private float q;
    private boolean r;
    private ryg s;

    public PhotoView(Context context) {
        super(context);
        this.a = new Matrix();
        new Matrix();
        this.h = -1;
        new Rect();
        this.m = new RectF();
        new RectF();
        this.c = new RectF();
        this.n = new float[9];
        e();
    }

    private final void e() {
        Context context = getContext();
        if (!e) {
            e = true;
            Resources resources = context.getApplicationContext().getResources();
            resources.getDimensionPixelSize(R.dimen.photo_crop_width);
            Paint paint = new Paint();
            f = paint;
            paint.setAntiAlias(true);
            f.setColor(resources.getColor(R.color.photo_crop_dim_color));
            f.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            g = paint2;
            paint2.setAntiAlias(true);
            g.setColor(resources.getColor(R.color.photo_crop_highlight_color));
            g.setStyle(Paint.Style.STROKE);
            g.setStrokeWidth(resources.getDimension(R.dimen.photo_crop_stroke_width));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            d = scaledTouchSlop * scaledTouchSlop;
        }
        this.s = new ryg(context, this, null);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.i = scaleGestureDetector;
        this.r = scaleGestureDetector.isQuickScaleEnabled();
        this.b = new hik(this);
        this.k = new him(this);
        this.l = new hil(this);
    }

    private final void f() {
        this.o = false;
    }

    public final float a() {
        this.a.getValues(this.n);
        return this.n[0];
    }

    public final int b(float f2, float f3) {
        float max;
        float max2;
        boolean z;
        boolean z2;
        this.c.set(this.m);
        this.a.mapRect(this.c);
        float width = getWidth();
        RectF rectF = this.c;
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = f5 - f4;
        float f7 = width + brg.a;
        if (f6 < f7) {
            max = ((f7 - (f5 + f4)) / 2.0f) + brg.a;
        } else {
            max = Math.max(width - f5, Math.min(-f4, f2));
        }
        float height = getHeight();
        RectF rectF2 = this.c;
        float f8 = rectF2.top;
        float f9 = rectF2.bottom;
        float f10 = f9 - f8;
        float f11 = height + brg.a;
        if (f10 < f11) {
            max2 = ((f11 - (f9 + f8)) / 2.0f) + brg.a;
        } else {
            max2 = Math.max(height - f9, Math.min(-f8, f3));
        }
        this.a.postTranslate(max, max2);
        invalidate();
        if (max == f2) {
            z = true;
        } else {
            z = false;
        }
        if (max2 == f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public final void c(float f2, float f3, float f4) {
        this.a.postRotate(brg.a, getWidth() / 2, getHeight() / 2);
        float min = Math.min(Math.max(f2, brg.a), brg.a);
        float a = a();
        if (min > brg.a && a <= brg.a) {
            postDelayed(new gtq(this, 5, null), 600L);
        }
        float f5 = min / a;
        this.a.postScale(f5, f5, f3, f4);
        this.a.postRotate(brg.a, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    public final void d() {
        float f2;
        this.c.set(this.m);
        this.a.mapRect(this.c);
        float width = getWidth();
        RectF rectF = this.c;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = f4 - f3;
        float f6 = brg.a;
        float f7 = width + brg.a;
        if (f5 < f7) {
            f2 = ((f7 - (f4 + f3)) / 2.0f) + brg.a;
        } else if (f3 > brg.a) {
            f2 = -f3;
        } else if (f4 < width) {
            f2 = width - f4;
        } else {
            f2 = 0.0f;
        }
        float height = getHeight();
        RectF rectF2 = this.c;
        float f8 = rectF2.top;
        float f9 = rectF2.bottom;
        float f10 = f9 - f8;
        float f11 = height + brg.a;
        if (f10 < f11) {
            f6 = brg.a + ((f11 - (f9 + f8)) / 2.0f);
        } else if (f8 > brg.a) {
            f6 = -f8;
        } else if (f9 < height) {
            f6 = height - f9;
        }
        if (Math.abs(f2) <= 20.0f && Math.abs(f6) <= 20.0f) {
            this.a.postTranslate(f2, f6);
            invalidate();
            return;
        }
        hil hilVar = this.l;
        if (hilVar.e) {
            return;
        }
        hilVar.d = -1L;
        hilVar.b = f2;
        hilVar.c = f6;
        hilVar.f = false;
        hilVar.e = true;
        hilVar.a.postDelayed(hilVar, 250L);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == null) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.o = true;
        if (!this.r) {
            f();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.r && this.o) {
                    float x = motionEvent.getX() - this.p;
                    int y = (int) (motionEvent.getY() - this.q);
                    int i = (int) x;
                    if ((i * i) + (y * y) > d) {
                        this.o = false;
                        return false;
                    }
                }
            } else if (this.r) {
                f();
                return false;
            }
        } else if (this.r) {
            this.p = motionEvent.getX();
            this.q = motionEvent.getY();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getWidth();
        getHeight();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.h != -1) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.h);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.c;
        if (rectF != null) {
            rectF.contains(x, y);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.i;
        if (scaleGestureDetector != null && this.s != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            this.s.q(motionEvent);
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                boolean z = this.k.a;
                d();
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != null && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Matrix();
        new Matrix();
        this.h = -1;
        new Rect();
        this.m = new RectF();
        new RectF();
        this.c = new RectF();
        this.n = new float[9];
        e();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Matrix();
        new Matrix();
        this.h = -1;
        new Rect();
        this.m = new RectF();
        new RectF();
        this.c = new RectF();
        this.n = new float[9];
        e();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
