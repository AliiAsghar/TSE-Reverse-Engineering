package com.google.android.libraries.view.zoomableimage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import defpackage.aawi;
import defpackage.aawt;
import defpackage.ahjj;
import defpackage.ajcz;
import defpackage.ajda;
import defpackage.ajdb;
import defpackage.ajdc;
import defpackage.aktp;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ZoomableImageView extends AppCompatImageView {
    public final float a;
    public final float b;
    public final float c;
    public final Matrix d;
    public final Matrix e;
    public View.OnClickListener f;
    public Insets g;
    public Path h;
    public float i;
    public ajdc j;
    public AnimatorSet k;
    public AnimatorSet l;
    public ahjj m;
    private final long n;
    private final long o;
    private final GestureDetector p;
    private final ScaleGestureDetector q;
    private final Matrix r;
    private Size s;
    private RectF t;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class FlingAnimationHelper {
        public FlingAnimationHelper() {
        }

        public void setMatrixTranslateX(float f) {
            ZoomableImageView.this.e.postTranslate(f - new ajdc(ZoomableImageView.this.e).a, brg.a);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.b(zoomableImageView.e);
            ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
            zoomableImageView2.setImageMatrix(zoomableImageView2.e);
        }

        public void setMatrixTranslateY(float f) {
            ZoomableImageView.this.e.postTranslate(brg.a, f - new ajdc(ZoomableImageView.this.e).b);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.b(zoomableImageView.e);
            ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
            zoomableImageView2.setImageMatrix(zoomableImageView2.e);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class ZoomWithAnimationHelper {
        public final PointF a = new PointF();

        public ZoomWithAnimationHelper() {
        }

        public void setMatrixScale(float f) {
            float f2 = f / new ajdc(ZoomableImageView.this.e).c;
            PointF pointF = this.a;
            ZoomableImageView.this.e.postScale(f2, f2, pointF.x, pointF.y);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.setImageMatrix(zoomableImageView.e);
        }
    }

    public ZoomableImageView(Context context) {
        this(context, null);
    }

    private final RectF h(Matrix matrix) {
        ajdc ajdcVar = new ajdc(matrix);
        float f = ajdcVar.a;
        return new RectF(f, ajdcVar.b, (ajdcVar.c * this.s.getWidth()) + f, ajdcVar.b + (ajdcVar.c * this.s.getHeight()));
    }

    private final void i() {
        if (getWidth() != 0 && getHeight() != 0 && getDrawable() != null) {
            Size size = new Size(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            this.s = size;
            if (size.getWidth() != 0 && this.s.getHeight() != 0) {
                float width = getWidth();
                float width2 = this.s.getWidth();
                float height = getHeight();
                float height2 = this.s.getHeight();
                Matrix matrix = this.e;
                float min = Math.min(width / width2, height / height2);
                matrix.setScale(min, min);
                b(this.e);
                this.r.set(this.e);
                this.d.set(this.r);
                c();
                this.t = new RectF(getDrawable().copyBounds());
                this.j = new ajdc(this.r);
                ahjj ahjjVar = this.m;
                if (ahjjVar != null) {
                    aawi aawiVar = new aawi(a());
                    View view = ((aawt) ahjjVar.a).g.Q;
                    view.getClass();
                    aktp.L(aawiVar, view);
                }
            }
        }
    }

    private final void j(Matrix matrix, long j) {
        PointF pointF;
        b(matrix);
        Matrix matrix2 = this.e;
        RectF h = h(matrix2);
        RectF h2 = h(matrix);
        if (new ajdc(matrix2).equals(new ajdc(matrix))) {
            pointF = new PointF(h.centerX(), h.centerY());
        } else {
            pointF = new PointF(((h.left * h2.right) - (h.right * h2.left)) / (((h.left - h.right) + h2.right) - h2.left), ((h.top * h2.bottom) - (h.bottom * h2.top)) / (((h.top - h.bottom) + h2.bottom) - h2.top));
        }
        ajdc ajdcVar = new ajdc(this.e);
        ajdc ajdcVar2 = new ajdc(matrix);
        ZoomWithAnimationHelper zoomWithAnimationHelper = new ZoomWithAnimationHelper();
        zoomWithAnimationHelper.a.set(pointF);
        if (g()) {
            this.k.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.k = animatorSet;
        animatorSet.play(ObjectAnimator.ofFloat(zoomWithAnimationHelper, "matrixScale", ajdcVar.c, ajdcVar2.c));
        this.k.setDuration(j);
        this.k.setInterpolator(new DecelerateInterpolator());
        this.k.start();
    }

    private static final float k(float f, float f2, int i, int i2) {
        float f3 = i2 - (f2 * i);
        if (f3 >= brg.a) {
            f3 /= 2.0f;
        } else if (f >= f3) {
            if (f > brg.a) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
        }
        return f3 - f;
    }

    public final Rect a() {
        if (getDrawable() == null) {
            return new Rect();
        }
        RectF rectF = new RectF();
        this.d.mapRect(rectF, this.t);
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public final void b(Matrix matrix) {
        ajdc ajdcVar = new ajdc(matrix);
        matrix.postTranslate(k(ajdcVar.a, ajdcVar.c, this.s.getWidth(), getWidth()), k(ajdcVar.b, ajdcVar.c, this.s.getHeight(), getHeight()));
    }

    public final void c() {
        int i;
        int i2;
        int i3;
        int i4;
        int width = getWidth();
        i = this.g.left;
        int i5 = width - i;
        i2 = this.g.right;
        int i6 = i5 - i2;
        int height = getHeight();
        i3 = this.g.top;
        int i7 = height - i3;
        i4 = this.g.bottom;
        int i8 = i7 - i4;
        if (i6 > 0 && i8 > 0 && getDrawable() != null && this.s.getWidth() != 0 && this.s.getHeight() != 0) {
            float width2 = this.s.getWidth();
            float height2 = this.s.getHeight();
            Matrix matrix = this.r;
            float min = Math.min(i6 / width2, i8 / height2);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.setScale(min, min);
            b(matrix2);
            this.d.set(matrix2);
            j(this.d, this.o);
        }
    }

    public final void d() {
        RectF rectF = new RectF();
        this.e.mapRect(rectF, this.t);
        this.h.reset();
        Path path = this.h;
        float f = this.i;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public final void e(Matrix matrix) {
        j(matrix, this.n);
    }

    public final boolean f() {
        ajdc ajdcVar = this.j;
        if (ajdcVar != null) {
            if (ajdcVar.c < new ajdc(this.e).c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g() {
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null && animatorSet.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i > brg.a) {
            canvas.clipPath(this.h);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(f());
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.l.cancel();
        }
        return super.onTouchEvent(motionEvent) | this.p.onTouchEvent(motionEvent) | this.q.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (getDrawable() != null) {
            i();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (getDrawable() != null) {
            i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        if (this.i > brg.a) {
            d();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        if (getDrawable() == null) {
            i();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Insets insets;
        this.r = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = null;
        this.s = new Size(0, 0);
        this.t = new RectF();
        insets = Insets.NONE;
        this.g = insets;
        this.h = new Path();
        setScaleType(ImageView.ScaleType.MATRIX);
        setClickable(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ajcz.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getFloat(4, 5.0f);
            this.n = obtainStyledAttributes.getInt(3, 300);
            this.o = obtainStyledAttributes.getInt(2, 165);
            this.b = obtainStyledAttributes.getFloat(0, 0.5f);
            this.c = obtainStyledAttributes.getFloat(1, -0.002f);
            obtainStyledAttributes.recycle();
            this.p = new GestureDetector(context, new ajda(this));
            this.q = new ScaleGestureDetector(context, new ajdb(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
