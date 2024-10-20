package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajjn extends Drawable implements Animatable {
    private static final Property a = new ajjm(Float.class);
    private ValueAnimator b;
    private ValueAnimator c;
    private float e;
    final Context i;
    final ajiv j;
    public List k;
    public boolean l;
    public int n;
    private final float d = -1.0f;
    final Paint m = new Paint();
    final ajgk o = new ajgk();

    public ajjn(Context context, ajiv ajivVar) {
        this.i = context;
        this.j = ajivVar;
        setAlpha(255);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        valueAnimatorArr[0].end();
        this.l = z;
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4;
        boolean c;
        if (this.b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ajjn, Float>) a, brg.a, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(500L);
            this.b.setInterpolator(ajdd.b);
            ValueAnimator valueAnimator3 = this.b;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator3;
            valueAnimator3.addListener(new ajjk(this));
        }
        if (this.c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<ajjn, Float>) a, 1.0f, brg.a);
            this.c = ofFloat2;
            ofFloat2.setDuration(500L);
            this.c.setInterpolator(ajdd.b);
            ValueAnimator valueAnimator4 = this.c;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator4;
            valueAnimator4.addListener(new ajjl(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.b;
        } else {
            valueAnimator = this.c;
        }
        if (z) {
            valueAnimator2 = this.c;
        } else {
            valueAnimator2 = this.b;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                boolean z5 = this.l;
                this.l = true;
                valueAnimator2.cancel();
                this.l = z5;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                a(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        if (z && !super.setVisible(true, false)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            c = this.j.d();
        } else {
            c = this.j.c();
        }
        if (!c) {
            a(valueAnimator);
            return z4;
        }
        if (!z2 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float f() {
        if (!this.j.d() && !this.j.c()) {
            return 1.0f;
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float g() {
        int i;
        float f = this.d;
        if (f > brg.a) {
            return f;
        }
        boolean z = this instanceof ajjj;
        if (!this.j.b(z) || this.j.k == 0) {
            return brg.a;
        }
        float k = ajgk.k(this.i.getContentResolver());
        if (k <= brg.a) {
            return brg.a;
        }
        if (z) {
            i = this.j.h;
        } else {
            i = this.j.i;
        }
        int i2 = (int) (((i * 1000.0f) / this.j.k) * k);
        float currentTimeMillis = ((float) (System.currentTimeMillis() % i2)) / i2;
        if (currentTimeMillis < brg.a) {
            return (currentTimeMillis % 1.0f) + 1.0f;
        }
        return currentTimeMillis;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(gmm gmmVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (!this.k.contains(gmmVar)) {
            this.k.add(gmmVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (!k() && !j()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean l(boolean z, boolean z2, boolean z3) {
        float k = ajgk.k(this.i.getContentResolver());
        boolean z4 = false;
        if (z3 && k > brg.a) {
            z4 = true;
        }
        return e(z, z2, z4);
    }

    public final void n() {
        l(false, false, false);
    }

    public final void o(gmm gmmVar) {
        List list = this.k;
        if (list != null && list.contains(gmmVar)) {
            this.k.remove(gmmVar);
            if (this.k.isEmpty()) {
                this.k = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return l(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
