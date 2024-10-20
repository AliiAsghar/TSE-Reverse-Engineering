package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqd extends Drawable {
    public static final int[] a = {Color.rgb(66, 133, 244), Color.rgb(216, 68, 55), Color.rgb(244, 132, 0), Color.rgb(15, 157, 88)};
    private static final RectF j = new RectF();
    private static final Rect k = new Rect();
    private static final LinearInterpolator l = new LinearInterpolator();
    private static final Interpolator m = yai.b;
    private static final ArgbEvaluator n = new ArgbEvaluator();
    public AnimatorSet b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    private final ValueAnimator o;
    private final ValueAnimator p;
    private final ValueAnimator q;
    private final ValueAnimator r;
    private final ValueAnimator s;
    private final ValueAnimator t;
    private final Paint u;
    private int v;
    private final int w;
    private final float x;

    public zqd(float f, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat.addUpdateListener(new qu(this, 15));
        ofFloat.addListener(new zpy(this));
        ofFloat.setDuration(1332L);
        LinearInterpolator linearInterpolator = l;
        ofFloat.setInterpolator(linearInterpolator);
        this.o = ofFloat;
        ArgbEvaluator argbEvaluator = n;
        int[] iArr = a;
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, Integer.valueOf(iArr[this.h]), Integer.valueOf(iArr[a()]));
        ofObject.addUpdateListener(new qu(this, 16));
        ofObject.addListener(new zpz(this, ofObject));
        ofObject.setStartDelay(999L);
        ofObject.setDuration(333L);
        ofObject.setInterpolator(linearInterpolator);
        this.i = iArr[this.h];
        this.r = ofObject;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat2.addUpdateListener(new qu(this, 17));
        ofFloat2.setDuration(666L);
        Interpolator interpolator = m;
        ofFloat2.setInterpolator(interpolator);
        this.p = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat3.addUpdateListener(new qu(this, 18));
        ofFloat3.setStartDelay(666L);
        ofFloat3.setDuration(666L);
        ofFloat3.setInterpolator(interpolator);
        ofFloat3.addListener(new zqa(this));
        this.q = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat4.addUpdateListener(new qu(this, 19));
        ofFloat4.addListener(new zqb(this));
        ofFloat4.setDuration(1000L);
        ofFloat4.setInterpolator(linearInterpolator);
        this.s = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.0f, brg.a);
        ofFloat5.addUpdateListener(new qu(this, 14));
        ofFloat5.addListener(new zpw(this));
        ofFloat5.setDuration(1000L);
        ofFloat5.setInterpolator(linearInterpolator);
        this.t = ofFloat5;
        this.b = b();
        Paint paint = new Paint();
        this.u = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        this.v = 255;
        setVisible(false, false);
        c();
        this.w = i;
        this.x = f;
    }

    public final int a() {
        int i = this.h + 1;
        int length = a.length;
        return i & 3;
    }

    public final AnimatorSet b() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.o, this.p, this.q, this.r);
        animatorSet.addListener(new zpx(this));
        return animatorSet;
    }

    public final void c() {
        this.b.cancel();
        this.s.cancel();
        this.t.cancel();
        this.e = brg.a;
        this.f = brg.a;
        this.d = brg.a;
        this.c = brg.a;
        this.h = 0;
        int[] iArr = a;
        int i = iArr[0];
        this.i = i;
        this.r.setObjectValues(Integer.valueOf(i), Integer.valueOf(iArr[a()]));
        this.g = 1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        if (!getBounds().isEmpty()) {
            if (isVisible() || this.t.isRunning()) {
                if (this.x == -1.0f) {
                    rect = getBounds();
                } else {
                    Rect bounds = getBounds();
                    int centerX = bounds.centerX();
                    int centerY = bounds.centerY();
                    Rect rect2 = k;
                    rect2.left = centerX - (getIntrinsicWidth() / 2);
                    rect2.right = centerX + (getIntrinsicWidth() / 2);
                    rect2.top = centerY - (getIntrinsicHeight() / 2);
                    rect2.bottom = centerY + (getIntrinsicHeight() / 2);
                    rect = rect2;
                }
                int i = this.w;
                float f = this.g;
                float f2 = i;
                float f3 = f2 * f;
                this.u.setColor(this.i);
                this.u.setAlpha((int) (this.v * f));
                this.u.setStrokeWidth(f3);
                RectF rectF = j;
                rectF.set(rect);
                float f4 = f2 - (f3 / 2.0f);
                rectF.inset(f4, f4);
                float width = rectF.width() / 2.0f;
                canvas.drawArc(rectF, (r0 + (this.c + (this.d * 286.0f))) - 90.0f, Math.max(Math.abs((this.e * 290.0f) - (this.f * 290.0f)), (float) (((width - f3) * 3.141592653589793d) / (f3 * 180.0f))), false, this.u);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.x;
        if (f != -1.0f) {
            return (int) (f + f);
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.x;
        if (f != -1.0f) {
            return (int) (f + f);
        }
        return super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.v) {
            this.v = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.u.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            return false;
        }
        if (z) {
            if (this.t.isRunning()) {
                this.t.cancel();
            }
            if (z2) {
                this.s.start();
                return true;
            }
            this.g = 1.0f;
            this.b.start();
            return true;
        }
        if (this.s.isRunning()) {
            this.s.cancel();
        }
        if (z2) {
            this.t.start();
            return true;
        }
        c();
        return true;
    }
}
