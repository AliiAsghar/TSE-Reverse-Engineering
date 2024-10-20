package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import defpackage.ajiv;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajiu<S extends ajiv> extends ProgressBar {
    public final ajiv a;
    public int b;
    public final int c;
    public final int d;
    public long e;
    public boolean f;
    public final int g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final gmm k;
    private final gmm l;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajiu(Context context, AttributeSet attributeSet, int i, int i2) {
        super(ajnr.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = -1L;
        this.f = false;
        this.g = 4;
        this.h = new ajir(this, 0);
        this.i = new ajir(this, 2);
        this.k = new ajis(this);
        this.l = new ajit(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = ajig.a(context2, attributeSet, ajjs.a, i, i2, new int[0]);
        this.c = a.getInt(6, -1);
        this.d = Math.min(a.getInt(4, -1), 1000);
        a.recycle();
        this.j = true;
    }

    private final ajjp h() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().a;
            }
            return null;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract ajiv a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ajjj getProgressDrawable() {
        return (ajjj) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ajjr getIndeterminateDrawable() {
        return (ajjr) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (!this.j) {
            return;
        }
        ((ajjn) getCurrentDrawable()).l(f(), false, z);
    }

    public final void e() {
        if (this.d > 0) {
            this.e = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    final boolean f() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void g(int i) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.b = i;
                this.f = true;
                if (getIndeterminateDrawable().isVisible() && ajgk.k(getContext().getContentResolver()) != brg.a) {
                    getIndeterminateDrawable().b.c();
                    return;
                } else {
                    this.k.b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.k);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.l);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.l);
        }
        if (f()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((ajjn) getCurrentDrawable()).n();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.l);
            getIndeterminateDrawable().b.e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.l);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h().e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int b;
        int b2;
        ajjp h = h();
        if (h == null) {
            return;
        }
        if (h.b() < 0) {
            b = getDefaultSize(getSuggestedMinimumWidth(), i);
        } else {
            b = h.b() + getPaddingLeft() + getPaddingRight();
        }
        if (h.b() < 0) {
            b2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            b2 = h.b() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(b, b2);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        d(z);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((ajjn) currentDrawable).n();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((ajjn) currentDrawable2).l(f(), false, false);
        }
        if ((currentDrawable2 instanceof ajjr) && f()) {
            ((ajjr) currentDrawable2).b.d();
        }
        this.f = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof ajjr) {
                ((ajjn) drawable).n();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof ajjj) {
                ajjj ajjjVar = (ajjj) drawable;
                ajjjVar.n();
                super.setProgressDrawable(ajjjVar);
                ajjjVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }
}
