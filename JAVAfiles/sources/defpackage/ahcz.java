package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcz implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    private static final alvi i = alvi.m("com/google/android/libraries/logging/ve/ViewNode");
    public final View a;
    public final ahcq b;
    public ViewGroup d;
    public final ahfi f;
    public final adwq h;
    private ahcq j;
    private final ViewTreeObserver.OnDrawListener o;
    private boolean k = false;
    public boolean c = false;
    private boolean l = false;
    public ahcq e = null;
    private int p = 2;
    private final Rect m = new Rect();
    public Runnable g = null;
    private boolean n = false;

    public ahcz(View view, ahcq ahcqVar) {
        apae checkIsLite;
        Object c;
        this.a = view;
        this.b = ahcqVar;
        this.h = ahcqVar.g;
        apaa apaaVar = ahcqVar.f;
        apae apaeVar = ahfh.a;
        apab apabVar = (apab) apaaVar.b;
        checkIsLite = apag.checkIsLite(apaeVar);
        apabVar.b(checkIsLite);
        Object l = apabVar.l.l(checkIsLite.d);
        if (l == null) {
            c = checkIsLite.b;
        } else {
            c = checkIsLite.c(l);
        }
        ahfi ahfiVar = (ahfi) c;
        this.f = ahfiVar;
        int R = a.R(ahfiVar.b);
        if (R != 0 && R == 3) {
            this.o = new ViewTreeObserver.OnDrawListener() { // from class: ahcy
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    ahcz ahczVar = ahcz.this;
                    if (ahczVar.d.isDirty() && ahczVar.g == null) {
                        ahczVar.g = new agqd(ahczVar, 12);
                        aiut.d(ahczVar.g, ahczVar.f.c);
                    }
                }
            };
        } else {
            this.o = null;
        }
    }

    public static View a(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    public static View b(ahcq ahcqVar) {
        ahcz ahczVar = ahcqVar.e;
        if (ahczVar instanceof ahcz) {
            return ahczVar.a;
        }
        return null;
    }

    public static ahcq c(View view) {
        return (ahcq) view.getTag(com.google.android.apps.messaging.R.id.ve_tag);
    }

    public static boolean h(View view) {
        if (view.getId() == 16908290) {
            return true;
        }
        return false;
    }

    private static String k(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(view.getClass().getSimpleName()).concat("#ResourceNotFoundException");
            }
        }
        return view.getClass().getSimpleName() + "#" + String.valueOf(view.getTag());
    }

    private final void l() {
        Runnable runnable = this.g;
        if (runnable != null) {
            aiut.f(runnable);
            this.g = null;
        }
    }

    private final void m() {
        int R;
        l();
        int R2 = a.R(this.f.b);
        if (R2 != 0 && R2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.o);
        }
        if (this.d == null || ((R = a.R(this.f.b)) != 0 && R == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.d = null;
        }
    }

    private final void n() {
        boolean isTemporarilyDetached;
        int R;
        albo.T(this.k);
        if (this.l) {
            ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(R.id.content);
            viewGroup.getClass();
            this.d = viewGroup;
        } else {
            this.d = (ViewGroup) this.a.getParent();
        }
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        } else if (Log.isLoggable("GIL", 3)) {
            isTemporarilyDetached = this.a.isTemporarilyDetached();
            if (!isTemporarilyDetached) {
                Log.d("GIL", "Unexpected null parent: ".concat(String.valueOf(String.valueOf(this.b))));
            }
        }
        if (this.d == null || ((R = a.R(this.f.b)) != 0 && R == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int R2 = a.R(this.f.b);
        if (R2 != 0 && R2 == 3) {
            this.a.getViewTreeObserver().addOnDrawListener(this.o);
        }
    }

    private static void o(View view, ahdh ahdhVar) {
        ahcq c = c(view);
        if (c != null) {
            ahcz ahczVar = c.e;
            if (ahczVar instanceof ahcz) {
                ahcq ahcqVar = ahczVar.j;
                if (ahczVar.l) {
                    return;
                }
            }
            ahdhVar.b(c);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                o(viewGroup.getChildAt(i2), ahdhVar);
            }
        }
    }

    public final ahcq d() {
        if (!g() && !this.l) {
            ahcq ahcqVar = this.e;
            if (ahcqVar != null) {
                return ahcqVar;
            }
            for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
                View view = (View) parent;
                ahcq c = c(view);
                if (c != null) {
                    if (this.k) {
                        this.e = c;
                    }
                    return c;
                }
                if (h(view)) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Set, java.lang.Object] */
    public final void e() {
        Runnable runnable;
        l();
        int j = j();
        int i2 = this.p;
        if (j != i2) {
            this.p = j;
            if (this.c) {
                adwq adwqVar = this.h;
                ahcq ahcqVar = this.b;
                if (!adwqVar.a.isEmpty()) {
                    if (Log.isLoggable("GIL", 2)) {
                        String valueOf = String.valueOf(ahcqVar);
                        String ap = akec.ap(i2);
                        if (i2 != 0) {
                            Log.v("GIL", "Visibility: " + valueOf + "; " + ap + " -> " + akec.ap(j));
                        } else {
                            throw null;
                        }
                    }
                    for (ahjj ahjjVar : adwqVar.a) {
                        long c = ((ahdj) ahjjVar.a).g.c();
                        if (c != -1) {
                            apaa apaaVar = ahcqVar.f;
                            long j2 = c * 1000;
                            if (!apaaVar.b.isMutable()) {
                                apaaVar.u();
                            }
                            ahcw ahcwVar = (ahcw) apaaVar.b;
                            ahcw ahcwVar2 = ahcw.a;
                            ahcwVar.b |= 4;
                            ahcwVar.f = j2;
                        }
                        if (((ahdj) ahjjVar.a).c.c(ahcqVar, j)) {
                            ((ahdj) ahjjVar.a).b();
                        }
                    }
                }
            }
            if (this.d != null && Log.isLoggable("GIL", 2)) {
                Log.v("GIL", String.format(Locale.US, "Visibility: %s v=%s\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", this.b, k(this.a), Integer.valueOf(this.d.getScrollX()), Integer.valueOf(this.d.getScrollY()), Integer.valueOf(this.d.getWidth() + this.d.getScrollX()), Integer.valueOf(this.d.getHeight() + this.d.getScrollY()), Integer.valueOf(this.a.getLeft()), Integer.valueOf(this.a.getTop()), Integer.valueOf(this.a.getRight()), Integer.valueOf(this.a.getBottom())));
                runnable = null;
                this.g = runnable;
            }
        }
        runnable = null;
        this.g = runnable;
    }

    public final void f(ahdh ahdhVar) {
        View view = this.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                o(viewGroup.getChildAt(i2), ahdhVar);
            }
        }
    }

    public final boolean g() {
        if (!h(this.a) && !this.l) {
            return false;
        }
        return true;
    }

    public final void i(boolean z) {
        if (this.l != z) {
            boolean z2 = true;
            albo.T(true);
            if (z && h(this.a)) {
                z2 = false;
            }
            d.s(z2);
            ((alvg) ((alvg) i.g()).h("com/google/android/libraries/logging/ve/ViewNode", "setIsolated", 152, "ViewNode.java")).t("setIsolated %s", this.a);
            if (this.k) {
                m();
            }
            this.l = z;
            if (this.k) {
                n();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r8.a.getBottom() < r8.m.bottom) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            r8 = this;
            android.view.View r0 = r8.a
            int r0 = r0.getVisibility()
            r1 = 2
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r8.l
            if (r0 == 0) goto L18
            android.view.View r0 = r8.a
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            ahfi r0 = r8.f
            int r0 = r0.b
            int r0 = defpackage.a.R(r0)
            r2 = 1
            if (r0 != 0) goto L25
            goto Ld6
        L25:
            if (r0 == r2) goto Ld6
            android.view.ViewGroup r0 = r8.d
            if (r0 != 0) goto L2c
            return r1
        L2c:
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getScrollX()
            android.view.ViewGroup r4 = r8.d
            int r4 = r4.getScrollY()
            android.view.ViewGroup r5 = r8.d
            int r5 = r5.getWidth()
            android.view.ViewGroup r6 = r8.d
            int r6 = r6.getScrollX()
            int r5 = r5 + r6
            android.view.ViewGroup r6 = r8.d
            int r6 = r6.getHeight()
            android.view.ViewGroup r7 = r8.d
            int r7 = r7.getScrollY()
            int r6 = r6 + r7
            r3.set(r0, r4, r5, r6)
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getLeft()
            int r3 = r3.left
            if (r0 > r3) goto L85
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getTop()
            int r3 = r3.top
            if (r0 > r3) goto L85
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getRight()
            int r3 = r3.right
            if (r0 < r3) goto L85
            android.view.View r0 = r8.a
            android.graphics.Rect r3 = r8.m
            int r0 = r0.getBottom()
            int r3 = r3.bottom
            if (r0 >= r3) goto Ld6
        L85:
            android.graphics.Rect r0 = r8.m
            android.view.View r3 = r8.a
            int r4 = r3.getLeft()
            int r5 = r3.getTop()
            int r6 = r3.getRight()
            int r3 = r3.getBottom()
            boolean r0 = r0.intersect(r4, r5, r6, r3)
            if (r0 == 0) goto Ld5
            android.graphics.Rect r0 = r8.m
            java.lang.String r3 = "V="
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "GIL"
            android.util.Log.d(r3, r0)
            android.graphics.Rect r0 = r8.m
            int r3 = r0.width()
            int r0 = r0.height()
            int r3 = r3 * r0
            android.view.View r0 = r8.a
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            int r4 = r4 * r0
            ahfi r0 = r8.f
            int r3 = r3 * 100
            int r3 = r3 / r4
            ahfg r0 = r0.d
            if (r0 != 0) goto Ld1
            ahfg r0 = defpackage.ahfg.a
        Ld1:
            int r0 = r0.b
            if (r3 >= r0) goto Ld6
        Ld5:
            return r1
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahcz.j():int");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        boolean z2;
        int R = a.R(this.f.b);
        if (R != 0 && R == 2) {
            if (this.n && view == this.d) {
                this.n = false;
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", String.format(Locale.US, "LayoutChange: %s (Skipped)", this.b));
                    return;
                }
                return;
            }
            View view2 = this.a;
            if (view == view2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (view == view2) {
                this.n = true;
            } else {
                this.n = false;
            }
            if (this.d == null) {
                albo.T(!z2);
                ViewGroup viewGroup = (ViewGroup) this.a.getParent();
                this.d = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
            }
        } else if (view == this.a) {
            if (this.d == null) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            ViewGroup viewGroup2 = (ViewGroup) this.a.getParent();
            this.d = viewGroup2;
            viewGroup2.addOnLayoutChangeListener(this);
            this.a.removeOnLayoutChangeListener(this);
        }
        if (Log.isLoggable("GIL", 2)) {
            if (this.d == null) {
                Throwable th = new Throwable();
                th.fillInStackTrace();
                Locale locale = Locale.US;
                ahcq ahcqVar = this.b;
                View view3 = this.a;
                Log.w("GIL", String.format(locale, "You have a bug in your layout code. %s Expected [%s] Got [%s] Parent [%s]", ahcqVar, view3, view, view3.getParent()), th);
                return;
            }
            ahcq ahcqVar2 = this.b;
            Locale locale2 = Locale.US;
            String k = k(this.a);
            if (view == this.d) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            Log.v("GIL", String.format(locale2, "LayoutChange: %s v=%s p=%d d=%d lr=%d pd=%d plr=%d\tl=%d,%d t=%d,%d r=%d,%d b=%d,%d\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", ahcqVar2, k, Integer.valueOf(i10), Integer.valueOf(this.a.isDirty() ? 1 : 0), Integer.valueOf(this.a.isLayoutRequested() ? 1 : 0), Integer.valueOf(view.isDirty() ? 1 : 0), Integer.valueOf(view.isLayoutRequested() ? 1 : 0), Integer.valueOf(i6), Integer.valueOf(i2), Integer.valueOf(i7), Integer.valueOf(i3), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i5), Integer.valueOf(this.d.getScrollX()), Integer.valueOf(this.d.getScrollY()), Integer.valueOf(this.d.getWidth() + this.d.getScrollX()), Integer.valueOf(this.d.getHeight() + this.d.getScrollY()), Integer.valueOf(this.a.getLeft()), Integer.valueOf(this.a.getTop()), Integer.valueOf(this.a.getRight()), Integer.valueOf(this.a.getBottom())));
        }
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((alvg) ((alvg) i.g()).h("com/google/android/libraries/logging/ve/ViewNode", "onViewAttachedToWindow", 389, "ViewNode.java")).D("onViewAttachedToWindow self=%s, view=%s", this.a, view);
        albo.T(!this.k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Attached View had no parent: ".concat(String.valueOf(k(view))));
        }
        this.k = true;
        n();
        if (this.k && !this.c) {
            this.c = true;
            this.h.g(this.b);
        }
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((alvg) ((alvg) i.g()).h("com/google/android/libraries/logging/ve/ViewNode", "onViewDetachedFromWindow", 405, "ViewNode.java")).D("onViewDetachedToWindow self=%s, view=%s", this.a, view);
        albo.T(this.k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Detached View had no parent: ".concat(String.valueOf(k(view))));
        }
        this.k = false;
        m();
        if (this.c) {
            this.c = false;
            this.h.h(this.b);
            this.e = null;
        }
    }
}
