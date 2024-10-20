package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdu implements agdz {
    static final /* synthetic */ artm[] a;
    public final anca b;
    public final RendererContainer c;
    public final arqg d;
    public final agdk e;
    public final arqg f;
    public final arqg g;
    public boolean h = true;
    public final Duration i;
    public final int j;
    public final int k;
    public final int l;
    public final View.OnTouchListener m;
    public final View.OnTouchListener n;
    public Instant o;
    public float p;
    public float q;
    public boolean r;
    private final View s;
    private Animator t;
    private final ViewConfiguration u;
    private final int v;
    private final arml w;
    private VelocityTracker x;
    private final arsn y;

    static {
        arrr arrrVar = new arrr(agdu.class, "isAttached", "isAttached()Z", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public agdu(anca ancaVar, RendererContainer rendererContainer, arqg arqgVar, agdk agdkVar, arqg arqgVar2, arqg arqgVar3, View view) {
        this.b = ancaVar;
        this.c = rendererContainer;
        this.d = arqgVar;
        this.e = agdkVar;
        this.f = arqgVar2;
        this.g = arqgVar3;
        this.s = view;
        Duration ofMillis = Duration.ofMillis(ViewConfiguration.getLongPressTimeout());
        ofMillis.getClass();
        this.i = ofMillis;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(rendererContainer.getContext());
        this.u = viewConfiguration;
        int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = scaledMinimumFlingVelocity;
        this.v = scaledMinimumFlingVelocity * 4;
        this.k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.l = viewConfiguration.getScaledTouchSlop();
        this.w = armd.a(new afzg(this, 18));
        this.m = new iiy(this, 3);
        this.n = new iiy(this, 4);
        this.q = -1.0f;
        this.y = new agdr(false, this);
    }

    public final VelocityTracker a() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker == null) {
            VelocityTracker obtain = VelocityTracker.obtain();
            obtain.clear();
            this.x = obtain;
            obtain.getClass();
            return obtain;
        }
        return velocityTracker;
    }

    public final void b(int i, int i2, Interpolator interpolator) {
        Animator animator = this.t;
        if (animator != null) {
            animator.cancel();
        }
        ((Number) this.f.a()).intValue();
        ((Number) this.g.a()).intValue();
        if (i != i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            ofInt.setDuration(((Number) this.w.a()).longValue());
            ofInt.setInterpolator(interpolator);
            ofInt.addUpdateListener(new ztg(this, 10));
            ofInt.addListener(new aach(this, 3));
            ofInt.start();
            this.t = ofInt;
        }
    }

    @Override // defpackage.agdz
    public final void c(int i, float f) {
        if (this.h && i == 0) {
            float abs = Math.abs(f);
            int i2 = this.v;
            int intValue = ((Number) this.e.a.a()).intValue();
            int intValue2 = ((Number) this.f.a()).intValue();
            int r = arrn.r(((Number) this.g.a()).intValue(), intValue2);
            if (abs >= i2) {
                if (f > brg.a) {
                    intValue2 = r;
                }
                b(intValue, intValue2, new DecelerateInterpolator());
            }
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, agea] */
    @Override // defpackage.agdz
    public final void d(int i) {
        ?? a2 = this.d.a();
        if (a2 != 0) {
            h(a2);
        }
    }

    public final void e() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.x = null;
        this.q = -1.0f;
    }

    public final void f(boolean z) {
        this.y.d(a[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agea] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, arqr] */
    public final void g() {
        Object obj;
        ?? a2 = this.d.a();
        if (a2 != 0) {
            aazm k = a2.k();
            if (((CopyOnWriteArraySet) k.d).remove(this) && ((CopyOnWriteArraySet) k.d).isEmpty() && (obj = k.e) != null) {
                k.b.a(obj);
                k.e = null;
            }
        }
    }

    public final void h(agea ageaVar) {
        int a2 = ageaVar.a();
        View b = ageaVar.b();
        if (b != null) {
            View view = this.s;
            if (view == null) {
                view = b;
            }
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                view.getWidth();
                b.setElevation(arrn.s(a2 >> 3, view.getHeight()));
                return;
            } else {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new agdt(view, b, a2));
                return;
            }
        }
        View view2 = this.s;
        if (view2 != null) {
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                view2.getWidth();
                view2.setTranslationY(-view2.getHeight());
                view2.setElevation(arrn.s(a2 >> 3, r1));
                return;
            }
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new agds(view2, a2, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, agea] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, agea] */
    public final boolean i(int i) {
        Integer num;
        if (i > 0) {
            ?? a2 = this.d.a();
            if (a2 != 0) {
                num = Integer.valueOf(a2.a());
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 0) {
                return false;
            }
            if (!a2.h(i)) {
                int intValue = ((Number) this.e.a.a()).intValue();
                int intValue2 = ((Number) this.f.a()).intValue();
                if (intValue <= intValue2) {
                    return false;
                }
                int i2 = intValue - i;
                agdk agdkVar = this.e;
                agdkVar.b.a(Integer.valueOf(Math.max(i2, intValue2)));
                return true;
            }
        } else {
            int intValue3 = ((Number) this.e.a.a()).intValue();
            int intValue4 = ((Number) this.g.a()).intValue();
            ?? a3 = this.d.a();
            if (a3 != 0 && a3.f()) {
                return false;
            }
            this.d.a();
            if (intValue3 >= intValue4) {
                return false;
            }
            int i3 = intValue3 - i;
            agdk agdkVar2 = this.e;
            agdkVar2.b.a(Integer.valueOf(Math.min(i3, intValue4)));
            if (this.d.a() != null) {
                ((Number) this.f.a()).intValue();
            }
        }
        return true;
    }
}
