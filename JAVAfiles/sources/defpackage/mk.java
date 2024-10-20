package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mk extends nq implements oa {
    private static final int[] r = {R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final nq E;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    public final ValueAnimator p;
    public int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public mk(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.D = new bo(this, 14, null);
        mi miVar = new mi(this);
        this.E = miVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new mj(this));
        ofFloat.addUpdateListener(new qu(this, 1));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aK(this);
                this.l.ac(this);
                this.l.aM(miVar);
                W();
            }
            this.l = recyclerView;
            if (recyclerView != null) {
                recyclerView.aJ(this);
                this.l.w(this);
                this.l.aL(miVar);
            }
        }
    }

    private final void W() {
        this.l.removeCallbacks(this.D);
    }

    private final void X(int i) {
        W();
        this.l.postDelayed(this.D, i);
    }

    private final boolean Y() {
        if (this.l.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private static final int Z(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.o != 0) {
            if (motionEvent.getAction() == 0) {
                boolean j = j(motionEvent.getX(), motionEvent.getY());
                boolean i = i(motionEvent.getX(), motionEvent.getY());
                if (!j) {
                    if (!i) {
                        return;
                    }
                } else if (!i) {
                    this.A = 2;
                    this.f = (int) motionEvent.getY();
                    g(2);
                    return;
                }
                this.A = 1;
                this.i = (int) motionEvent.getX();
                g(2);
                return;
            }
            if (motionEvent.getAction() == 1 && this.o == 2) {
                this.f = brg.a;
                this.i = brg.a;
                g(1);
                this.A = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.o == 2) {
                h();
                if (this.A == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.C;
                    int i2 = this.t;
                    iArr[0] = i2;
                    int i3 = this.j - i2;
                    iArr[1] = i3;
                    float max = Math.max(i2, Math.min(i3, x));
                    if (Math.abs(this.h - max) >= 2.0f) {
                        int Z = Z(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                        if (Z != 0) {
                            this.l.scrollBy(Z, 0);
                        }
                        this.i = max;
                    }
                }
                if (this.A == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.B;
                    int i4 = this.t;
                    iArr2[0] = i4;
                    int i5 = this.k - i4;
                    iArr2[1] = i5;
                    float max2 = Math.max(i4, Math.min(i5, y));
                    if (Math.abs(this.e - max2) >= 2.0f) {
                        int Z2 = Z(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                        if (Z2 != 0) {
                            this.l.scrollBy(0, Z2);
                        }
                        this.f = max2;
                    }
                }
            }
        }
    }

    public final void f() {
        this.l.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            W();
        }
        if (i == 0) {
            f();
        } else {
            h();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            X(1200);
        } else if (i == 1) {
            X(1500);
        }
        this.o = i;
    }

    public final void h() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.p.setDuration(500L);
        this.p.setStartDelay(0L);
        this.p.start();
    }

    final boolean i(float f, float f2) {
        if (f2 >= this.k - this.y) {
            int i = this.h;
            int i2 = this.g / 2;
            if (f >= i - i2 && f <= i + i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    final boolean j(float f, float f2) {
        if (Y()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        if (f2 >= i - i2 && f2 <= i + i2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i == 1) {
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            boolean i2 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!j) {
                if (!i2) {
                    return false;
                }
            } else if (!i2) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
                g(2);
                return true;
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            g(2);
            return true;
        }
        if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nq
    public final void l(Canvas canvas, RecyclerView recyclerView) {
        if (this.j == this.l.getWidth() && this.k == this.l.getHeight()) {
            if (this.q != 0) {
                if (this.m) {
                    int i = this.j;
                    int i2 = this.u;
                    int i3 = i - i2;
                    int i4 = this.e;
                    int i5 = this.d;
                    int i6 = i4 - (i5 / 2);
                    this.b.setBounds(0, 0, i2, i5);
                    this.c.setBounds(0, 0, this.v, this.k);
                    float f = i6;
                    float f2 = -i6;
                    if (Y()) {
                        this.c.draw(canvas);
                        canvas.translate(this.u, f);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-this.u, f2);
                    } else {
                        canvas.translate(i3, brg.a);
                        this.c.draw(canvas);
                        canvas.translate(brg.a, f);
                        this.b.draw(canvas);
                        canvas.translate(-i3, f2);
                    }
                }
                if (this.n) {
                    int i7 = this.k;
                    int i8 = this.y;
                    int i9 = this.h;
                    int i10 = this.g;
                    this.w.setBounds(0, 0, i10, i8);
                    this.x.setBounds(0, 0, this.j, this.z);
                    canvas.translate(brg.a, i7 - i8);
                    this.x.draw(canvas);
                    canvas.translate(i9 - (i10 / 2), brg.a);
                    this.w.draw(canvas);
                    canvas.translate(-r3, -r8);
                    return;
                }
                return;
            }
            return;
        }
        this.j = this.l.getWidth();
        this.k = this.l.getHeight();
        g(0);
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
    }
}
