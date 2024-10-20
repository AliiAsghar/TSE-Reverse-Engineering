package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import defpackage.ahmn;
import defpackage.aksa;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.brg;
import defpackage.rra;
import defpackage.rrb;
import defpackage.ufl;
import defpackage.ufq;
import defpackage.ufs;
import defpackage.uft;
import defpackage.ufu;
import defpackage.ufx;
import defpackage.uga;
import defpackage.ugi;
import defpackage.wuo;
import defpackage.xtz;
import defpackage.xud;
import defpackage.xuf;
import defpackage.xuk;
import defpackage.xvj;
import defpackage.xzw;
import defpackage.yai;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class AsyncImageView extends xud {
    private static final alvi h = alvi.m("com/google/android/apps/messaging/shared/ui/AsyncImageView");
    public final rrb a;
    public ufu b;
    public ufs c;
    public xtz d;
    public yai e;
    public uga f;
    public ahmn g;
    private final boolean i;
    private final boolean j;
    private final Drawable k;
    private final Runnable l;
    private boolean m;
    private final int n;
    private int o;
    private boolean p;

    public AsyncImageView(Context context) {
        super(context);
        this.l = new wuo(this, 11);
        this.m = false;
        this.a = new rrb();
        this.k = null;
        this.i = true;
        this.j = false;
        this.n = 0;
        this.o = 0;
    }

    private final void h() {
        this.m = false;
        invalidate();
    }

    @Override // com.google.android.apps.messaging.shared.ui.RoundedImageView
    protected final void a() {
        Throwable th;
        if (!this.m && this.a.g() && getDrawable() != null) {
            boolean z = true;
            this.m = true;
            ufx k = ((rra) this.a.a()).k();
            if (k instanceof ugi) {
                ufu ufuVar = this.b;
                if (!(ufuVar instanceof ufq) && !(ufuVar instanceof ufl) && (th = ((ugi) k).m) != null) {
                    int dimension = (int) getResources().getDimension(R.dimen.async_image_view_slop);
                    if (getMeasuredWidth() <= 0 || getDrawable().getIntrinsicWidth() <= getMeasuredWidth() + dimension) {
                        z = false;
                    }
                    if ((getMeasuredHeight() > 0 && getDrawable().getIntrinsicHeight() > getMeasuredHeight() + dimension) || z) {
                        alvw d = h.d();
                        d.X(alwp.a, "BugleDataModel");
                        ((alvg) ((alvg) ((alvg) d).g(th)).h("com/google/android/apps/messaging/shared/ui/AsyncImageView", "logIfTooLarge", 388, "AsyncImageView.java")).K("loaded image at %dx%d instead of %dx%d", Integer.valueOf(getDrawable().getIntrinsicWidth()), Integer.valueOf(getDrawable().getIntrinsicHeight()), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
                    }
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = getDrawable();
        if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            frameSequenceDrawable.stop();
            frameSequenceDrawable.destroy();
        }
        ufu ufuVar = this.b;
        if (ufuVar != null) {
            ufuVar.q();
            this.b = null;
        }
        setImageDrawable(null);
        setBackground(null);
    }

    public final void c(ufu ufuVar, boolean z) {
        b();
        xzw.a.removeCallbacks(this.l);
        if (ufuVar == null) {
            h();
            return;
        }
        try {
            Drawable f = ufuVar.f(getResources());
            this.b = ufuVar;
            ufuVar.p();
            setImageDrawable(f);
            if (f instanceof FrameSequenceDrawable) {
                ((FrameSequenceDrawable) f).start();
            }
            if (getVisibility() == 0 && !z && !this.p) {
                if (this.j) {
                    setVisibility(4);
                    Interpolator interpolator = yai.b;
                    if (yai.o(this, 0, null)) {
                        yai.l(this, 0, 100L, interpolator, null, new xuk(getContext()));
                    }
                } else if (this.i) {
                    setAlpha(brg.a);
                    animate().alpha(1.0f).start();
                }
            }
            h();
        } catch (uft e) {
            alvw h2 = h.h();
            h2.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) ((alvg) h2).g(e)).h("com/google/android/apps/messaging/shared/ui/AsyncImageView", "setImage", (char) 257, "AsyncImageView.java")).q("Set image attempted with unsupported image type.");
            h();
        }
    }

    public final void d(ufs ufsVar) {
        int i;
        if (ufsVar != null && this.a.g() && TextUtils.equals(((rra) this.a.a()).m(), ufsVar.g())) {
            return;
        }
        if (this.a.g()) {
            e();
        }
        xtz xtzVar = this.d;
        if (xtzVar != null) {
            xtzVar.c();
        }
        xtz xtzVar2 = new xtz(this);
        f();
        clearAnimation();
        setAlpha(1.0f);
        if (ufsVar != null && !TextUtils.isEmpty(ufsVar.g())) {
            if (!TextUtils.isEmpty(ufsVar.g()) && this.k != null) {
                if (ufsVar.e != -1 && ufsVar.f != -1) {
                    int i2 = 0;
                    ColorDrawable colorDrawable = new ColorDrawable(0);
                    int i3 = ufsVar.e;
                    int i4 = ufsVar.f;
                    int i5 = xvj.a;
                    int intrinsicWidth = colorDrawable.getIntrinsicWidth();
                    int intrinsicHeight = colorDrawable.getIntrinsicHeight();
                    if (intrinsicWidth >= 0 && intrinsicWidth <= i3) {
                        i = (i3 - intrinsicWidth) / 2;
                    } else {
                        i = 0;
                    }
                    if (intrinsicHeight >= 0 && intrinsicHeight <= i4) {
                        i2 = (i4 - intrinsicHeight) / 2;
                    }
                    int i6 = i2;
                    setImageDrawable(new xvj(colorDrawable, i, i6, i, i6, i3, i4));
                }
                setBackground(this.k);
            }
            rra e = ufsVar.e(getContext(), xtzVar2);
            this.a.c(e);
            this.f.b(e);
        }
        this.d = xtzVar2;
    }

    public final void e() {
        if (this.a.g()) {
            this.a.f();
        }
    }

    public final void f() {
        c(null, false);
    }

    public final void g() {
        this.p = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        ufs ufsVar;
        aksa m = this.g.m("AsyncImageView#onAttachedToWindow");
        try {
            super.onAttachedToWindow();
            xzw.a.removeCallbacks(this.l);
            if (this.i) {
                setAlpha(1.0f);
            }
            if (!this.a.g() && (ufsVar = this.c) != null) {
                d(ufsVar);
            }
            this.c = null;
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xzw.a.postDelayed(this.l, 100L);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.z = i;
        super.setBackgroundColor(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setSelected(boolean z) {
        if (z != isSelected()) {
            float f = 1.0f;
            if (z && this.o == 0) {
                int i = this.n;
                if (i != 0) {
                    if (getWidth() <= 0) {
                        f = 0.86f;
                    } else {
                        float f2 = i;
                        f = (getWidth() - (f2 + f2)) / getWidth();
                    }
                }
                this.e.m(this, f);
                this.o = 1;
            } else if (!z) {
                this.e.m(this, 1.0f);
                this.o = 0;
            }
        }
        super.setSelected(z);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new wuo(this, 11);
        this.m = false;
        this.a = new rrb();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xuf.a, 0, 0);
        this.i = obtainStyledAttributes.getBoolean(0, true);
        this.j = obtainStyledAttributes.getBoolean(2, false);
        this.k = obtainStyledAttributes.getDrawable(1);
        this.n = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.o = 0;
        obtainStyledAttributes.recycle();
    }
}
