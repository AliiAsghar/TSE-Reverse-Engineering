package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbl extends Drawable implements Drawable.Callback, Animatable {
    private Matrix A;
    private Matrix B;
    private int C;
    private grn D;
    public hbb a;
    public final hhx b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public hek f;
    public String g;
    public String h;
    public boolean i;
    public hfx j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private boolean p;
    private final Matrix q;
    private Bitmap r;
    private Canvas s;
    private Rect t;
    private RectF u;
    private Paint v;
    private Rect w;
    private Rect x;
    private RectF y;
    private RectF z;

    public hbl() {
        hhx hhxVar = new hhx();
        this.b = hhxVar;
        this.c = true;
        this.d = false;
        this.n = 1;
        this.e = new ArrayList();
        qu quVar = new qu(this, 8);
        this.o = quVar;
        this.p = true;
        this.k = 255;
        this.C = 1;
        this.l = false;
        this.q = new Matrix();
        this.m = false;
        hhxVar.addUpdateListener(quVar);
    }

    private final void u() {
        hbb hbbVar = this.a;
        if (hbbVar == null) {
            return;
        }
        int i = hhb.a;
        Rect rect = hbbVar.h;
        hfx hfxVar = new hfx(this, new hfz(Collections.emptyList(), hbbVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new hfd(null, null, null, null, null, null, null, null, null), 0, 0, 0, brg.a, brg.a, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null), hbbVar.g, hbbVar);
        this.j = hfxVar;
        hfxVar.j = this.p;
    }

    private final void v() {
        hbb hbbVar = this.a;
        if (hbbVar == null) {
            return;
        }
        int i = this.C - 1;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = hbbVar.l;
        int i3 = hbbVar.m;
        boolean z2 = false;
        if (i != 1 && (i == 2 || ((z && i2 < 28) || i3 > 4))) {
            z2 = true;
        }
        this.l = z2;
    }

    private final boolean w() {
        if (!this.c && !this.d) {
            return false;
        }
        return true;
    }

    private static final void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.l) {
            k(canvas, this.j);
        } else {
            hfx hfxVar = this.j;
            hbb hbbVar = this.a;
            if (hfxVar != null && hbbVar != null) {
                this.q.reset();
                if (!getBounds().isEmpty()) {
                    this.q.preScale(r2.width() / hbbVar.h.width(), r2.height() / hbbVar.h.height());
                    this.q.preTranslate(r2.left, r2.top);
                }
                hfxVar.b(canvas, this.q, this.k);
            }
        }
        this.m = false;
        hav.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(final heo heoVar, final Object obj, final hig higVar) {
        hfx hfxVar = this.j;
        if (hfxVar == null) {
            this.e.add(new hbk() { // from class: hbg
                @Override // defpackage.hbk
                public final void a() {
                    hbl.this.f(heoVar, obj, higVar);
                }
            });
            return;
        }
        if (heoVar == heo.a) {
            hfxVar.a(obj, higVar);
        } else {
            hep hepVar = heoVar.b;
            if (hepVar != null) {
                hepVar.a(obj, higVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.j.e(heoVar, 0, arrayList, new heo(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((heo) arrayList.get(i)).b.a(obj, higVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == hbq.E) {
            o(c());
        }
    }

    public final void g() {
        hhx hhxVar = this.b;
        if (hhxVar.k) {
            hhxVar.cancel();
            if (!isVisible()) {
                this.n = 1;
            }
        }
        this.a = null;
        this.j = null;
        this.f = null;
        hhx hhxVar2 = this.b;
        hhxVar2.j = null;
        hhxVar2.h = -2.1474836E9f;
        hhxVar2.i = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        hbb hbbVar = this.a;
        if (hbbVar == null) {
            return -1;
        }
        return hbbVar.h.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        hbb hbbVar = this.a;
        if (hbbVar == null) {
            return -1;
        }
        return hbbVar.h.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (this.a != null) {
                u();
            }
        }
    }

    public final void i() {
        this.e.clear();
        hhx hhxVar = this.b;
        hhxVar.h();
        Iterator it = hhxVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(hhxVar);
        }
        if (!isVisible()) {
            this.n = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (!this.m) {
            this.m = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return q();
    }

    public final void j() {
        float e;
        float a;
        int i = 0;
        if (this.j == null) {
            this.e.add(new hbh(this, i));
            return;
        }
        v();
        if (w() || e() == 0) {
            if (isVisible()) {
                hhx hhxVar = this.b;
                hhxVar.k = true;
                Set set = hhxVar.a;
                boolean m = hhxVar.m();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ex$$ExternalSyntheticApiModelOutline1.m((Animator.AnimatorListener) it.next(), hhxVar, m);
                }
                if (hhxVar.m()) {
                    e = hhxVar.d();
                } else {
                    e = hhxVar.e();
                }
                hhxVar.k((int) e);
                hhxVar.d = 0L;
                hhxVar.g = 0;
                hhxVar.g();
                this.n = 1;
            } else {
                this.n = 2;
            }
        }
        if (!w()) {
            if (d() < brg.a) {
                a = b();
            } else {
                a = a();
            }
            n((int) a);
            this.b.f();
            if (!isVisible()) {
                this.n = 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        if (((android.view.ViewGroup) r3).getClipChildren() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r9, defpackage.hfx r10) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbl.k(android.graphics.Canvas, hfx):void");
    }

    public final void l() {
        float a;
        int i = 1;
        if (this.j == null) {
            this.e.add(new hbh(this, i));
            return;
        }
        v();
        if (w() || e() == 0) {
            if (isVisible()) {
                hhx hhxVar = this.b;
                hhxVar.k = true;
                hhxVar.g();
                hhxVar.d = 0L;
                if (hhxVar.m() && hhxVar.f == hhxVar.e()) {
                    hhxVar.k(hhxVar.d());
                } else if (!hhxVar.m() && hhxVar.f == hhxVar.d()) {
                    hhxVar.k(hhxVar.e());
                }
                Iterator it = hhxVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(hhxVar);
                }
                this.n = 1;
            } else {
                this.n = 3;
            }
        }
        if (!w()) {
            if (d() < brg.a) {
                a = b();
            } else {
                a = a();
            }
            n((int) a);
            this.b.f();
            if (!isVisible()) {
                this.n = 1;
            }
        }
    }

    public final void m(boolean z) {
        if (z != this.p) {
            this.p = z;
            hfx hfxVar = this.j;
            if (hfxVar != null) {
                hfxVar.j = z;
            }
            invalidateSelf();
        }
    }

    public final void n(final int i) {
        if (this.a == null) {
            this.e.add(new hbk() { // from class: hbj
                @Override // defpackage.hbk
                public final void a() {
                    hbl.this.n(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void o(final float f) {
        hbb hbbVar = this.a;
        if (hbbVar == null) {
            this.e.add(new hbk() { // from class: hbi
                @Override // defpackage.hbk
                public final void a() {
                    hbl.this.o(f);
                }
            });
            return;
        }
        hhx hhxVar = this.b;
        float f2 = hbbVar.i;
        float f3 = hbbVar.j;
        PointF pointF = hhy.a;
        hhxVar.k(f2 + (f * (f3 - f2)));
        hav.a();
    }

    public final void p(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean q() {
        hhx hhxVar = this.b;
        if (hhxVar == null) {
            return false;
        }
        return hhxVar.k;
    }

    public final boolean r(hbb hbbVar) {
        if (this.a == hbbVar) {
            return false;
        }
        this.m = true;
        g();
        this.a = hbbVar;
        u();
        hhx hhxVar = this.b;
        hbb hbbVar2 = hhxVar.j;
        hhxVar.j = hbbVar;
        if (hbbVar2 == null) {
            hhxVar.l(Math.max(hhxVar.h, hbbVar.i), Math.min(hhxVar.i, hbbVar.j));
        } else {
            hhxVar.l((int) hbbVar.i, (int) hbbVar.j);
        }
        float f = hhxVar.f;
        hhxVar.f = brg.a;
        hhxVar.e = brg.a;
        hhxVar.k((int) f);
        hhxVar.b();
        o(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.e).iterator();
        while (it.hasNext()) {
            hbk hbkVar = (hbk) it.next();
            if (hbkVar != null) {
                hbkVar.a();
            }
            it.remove();
        }
        this.e.clear();
        gvf gvfVar = hbbVar.n;
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void s(int i) {
        this.C = i;
        v();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        hhw.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.n;
            if (i == 2) {
                j();
            } else if (i == 3) {
                l();
            }
        } else if (this.b.k) {
            i();
            this.n = 3;
        } else if (isVisible) {
            this.n = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        this.b.f();
        if (!isVisible()) {
            this.n = 1;
        }
    }

    public final grn t() {
        if (getCallback() == null) {
            return null;
        }
        if (this.D == null) {
            grn grnVar = new grn(getCallback());
            this.D = grnVar;
            String str = this.h;
            if (str != null) {
                grnVar.e = str;
            }
        }
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
