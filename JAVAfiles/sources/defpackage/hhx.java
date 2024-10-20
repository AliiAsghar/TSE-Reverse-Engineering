package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhx extends hhu implements Choreographer.FrameCallback {
    public hbb j;
    public float c = 1.0f;
    private boolean m = false;
    public long d = 0;
    public float e = brg.a;
    public float f = brg.a;
    public int g = 0;
    public float h = -2.1474836E9f;
    public float i = 2.1474836E9f;
    public boolean k = false;
    public boolean l = false;

    public final float c() {
        hbb hbbVar = this.j;
        if (hbbVar == null) {
            return brg.a;
        }
        float f = this.f;
        float f2 = hbbVar.i;
        return (f - f2) / (hbbVar.j - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(m());
        h();
    }

    public final float d() {
        hbb hbbVar = this.j;
        if (hbbVar == null) {
            return brg.a;
        }
        float f = this.i;
        if (f == 2.1474836E9f) {
            return hbbVar.j;
        }
        return f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        float e;
        float d;
        g();
        hbb hbbVar = this.j;
        if (hbbVar != null && this.k) {
            long j2 = this.d;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float abs = (1.0E9f / hbbVar.k) / Math.abs(this.c);
            float f = this.e;
            float f2 = ((float) j3) / abs;
            if (m()) {
                f2 = -f2;
            }
            float f3 = f + f2;
            float e2 = e();
            float d2 = d();
            PointF pointF = hhy.a;
            if (f3 >= e2 && f3 <= d2) {
                z = true;
            } else {
                z = false;
            }
            float f4 = this.e;
            float a = hhy.a(f3, e(), d());
            this.e = a;
            if (this.l) {
                a = (float) Math.floor(a);
            }
            this.f = a;
            this.d = j;
            if (!this.l || this.e != f4) {
                b();
            }
            if (!z) {
                if (getRepeatCount() != -1 && this.g >= getRepeatCount()) {
                    if (this.c < brg.a) {
                        d = e();
                    } else {
                        d = d();
                    }
                    this.e = d;
                    this.f = d;
                    h();
                    a(m());
                } else {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.g++;
                    if (getRepeatMode() == 2) {
                        this.m = !this.m;
                        j();
                    } else {
                        if (m()) {
                            e = d();
                        } else {
                            e = e();
                        }
                        this.e = e;
                        this.f = e;
                    }
                    this.d = j;
                }
            }
            if (this.j != null) {
                float f5 = this.f;
                float f6 = this.h;
                if (f5 < f6 || f5 > this.i) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f6), Float.valueOf(this.i), Float.valueOf(this.f)));
                }
            }
            hav.a();
        }
    }

    public final float e() {
        hbb hbbVar = this.j;
        if (hbbVar == null) {
            return brg.a;
        }
        float f = this.h;
        if (f == -2.1474836E9f) {
            return hbbVar.i;
        }
        return f;
    }

    public final void f() {
        h();
        a(m());
    }

    public final void g() {
        if (this.k) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float e;
        if (this.j == null) {
            return brg.a;
        }
        if (m()) {
            f = d();
            e = this.f;
        } else {
            f = this.f;
            e = e();
        }
        return (f - e) / (d() - e());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.j == null) {
            return 0L;
        }
        return r0.a();
    }

    public final void h() {
        i(true);
    }

    protected final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.k;
    }

    public final void j() {
        this.c = -this.c;
    }

    public final void k(float f) {
        if (this.e == f) {
            return;
        }
        float a = hhy.a(f, e(), d());
        this.e = a;
        if (this.l) {
            a = (float) Math.floor(a);
        }
        this.f = a;
        this.d = 0L;
        b();
    }

    public final void l(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            hbb hbbVar = this.j;
            if (hbbVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = hbbVar.i;
            }
            if (hbbVar == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = hbbVar.j;
            }
            float a = hhy.a(f, f3, f4);
            float a2 = hhy.a(f2, f3, f4);
            if (a == this.h && a2 == this.i) {
                return;
            }
            this.h = a;
            this.i = a2;
            k((int) hhy.a(this.f, a, a2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public final boolean m() {
        if (this.c < brg.a) {
            return true;
        }
        return false;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.m) {
            this.m = false;
            j();
        }
    }
}
