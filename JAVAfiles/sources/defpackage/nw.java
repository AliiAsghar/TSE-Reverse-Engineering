package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nw {
    public final boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final fvq H;
    public final fvq I;
    private final qf a;
    private final qf b;
    lp t;
    public RecyclerView u;
    public ok v;
    public boolean w;
    public boolean x;
    boolean y;
    public final boolean z;

    public nw() {
        nu nuVar = new nu(this, 1);
        this.a = nuVar;
        nu nuVar2 = new nu(this, 0);
        this.b = nuVar2;
        this.H = new fvq(nuVar);
        this.I = new fvq(nuVar2);
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = true;
    }

    public static nv aD(Context context, AttributeSet attributeSet, int i, int i2) {
        nv nvVar = new nv();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gw.a, i, i2);
        nvVar.a = obtainStyledAttributes.getInt(0, 1);
        nvVar.b = obtainStyledAttributes.getInt(10, 1);
        nvVar.c = obtainStyledAttributes.getBoolean(9, false);
        nvVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return nvVar;
    }

    public static int as(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int au(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw.au(int, int, int, int, boolean):int");
    }

    public static final int bE(View view) {
        return view.getBottom() + bp(view);
    }

    public static final int bF(View view) {
        return view.getLeft() - bs(view);
    }

    public static final int bG(View view) {
        return view.getRight() + bu(view);
    }

    public static final int bH(View view) {
        return view.getTop() - bv(view);
    }

    public static boolean bl(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public static final int bp(View view) {
        return ((nx) view.getLayoutParams()).d.bottom;
    }

    public static final int bq(View view) {
        Rect rect = ((nx) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int br(View view) {
        Rect rect = ((nx) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bs(View view) {
        return ((nx) view.getLayoutParams()).d.left;
    }

    public static final int bt(View view) {
        return ((nx) view.getLayoutParams()).a();
    }

    public static final int bu(View view) {
        return ((nx) view.getLayoutParams()).d.right;
    }

    public static final int bv(View view) {
        return ((nx) view.getLayoutParams()).d.top;
    }

    public static final void bx(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((nx) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void by(View view, int i, int i2, int i3, int i4) {
        nx nxVar = (nx) view.getLayoutParams();
        Rect rect = nxVar.d;
        view.layout(i + rect.left + nxVar.leftMargin, i2 + rect.top + nxVar.topMargin, (i3 - rect.right) - nxVar.rightMargin, (i4 - rect.bottom) - nxVar.bottomMargin);
    }

    private final void c(View view, int i, boolean z) {
        oo k = RecyclerView.k(view);
        if (!z && !k.v()) {
            this.u.W.y(k);
        } else {
            this.u.W.t(k);
        }
        nx nxVar = (nx) view.getLayoutParams();
        if (!k.B() && !k.w()) {
            if (view.getParent() == this.u) {
                int c = this.t.c(view);
                if (i == -1) {
                    i = this.t.a();
                }
                if (c != -1) {
                    if (c != i) {
                        nw nwVar = this.u.m;
                        View aF = nwVar.aF(c);
                        if (aF != null) {
                            nwVar.aN(c);
                            nx nxVar2 = (nx) aF.getLayoutParams();
                            oo k2 = RecyclerView.k(aF);
                            if (k2.v()) {
                                nwVar.u.W.t(k2);
                            } else {
                                nwVar.u.W.y(k2);
                            }
                            nwVar.t.g(aF, i, nxVar2, k2.v());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c + nwVar.u.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.u.indexOfChild(view) + this.u.o());
                }
            } else {
                this.t.f(view, i, false);
                nxVar.e = true;
                ok okVar = this.v;
                if (okVar != null && okVar.k && okVar.l(view) == okVar.g) {
                    okVar.l = view;
                }
            }
        } else {
            if (k.w()) {
                k.p();
            } else {
                k.i();
            }
            this.t.g(view, i, view.getLayoutParams(), false);
        }
        if (nxVar.f) {
            k.a.invalidate();
            nxVar.f = false;
        }
    }

    public int C(ol olVar) {
        throw null;
    }

    public int D(ol olVar) {
        throw null;
    }

    public int E(ol olVar) {
        throw null;
    }

    public int F(ol olVar) {
        throw null;
    }

    public int G(ol olVar) {
        throw null;
    }

    public int H(ol olVar) {
        throw null;
    }

    public Parcelable R() {
        return null;
    }

    public View U(int i) {
        int at = at();
        for (int i2 = 0; i2 < at; i2++) {
            View aF = aF(i2);
            oo k = RecyclerView.k(aF);
            if (k != null && k.ge() == i && !k.A() && (this.u.M.g || !k.v())) {
                return aF;
            }
        }
        return null;
    }

    public void V(String str) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.x(str);
        }
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.u;
        od odVar = recyclerView.e;
        ol olVar = recyclerView.M;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.u.canScrollVertically(-1) && !this.u.canScrollHorizontally(-1) && !this.u.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            no noVar = this.u.l;
            if (noVar != null) {
                accessibilityEvent.setItemCount(noVar.b());
            }
        }
    }

    public final int aA() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int aB() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aC() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View aE(View view) {
        View n;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (n = recyclerView.n(view)) == null || this.t.k(n)) {
            return null;
        }
        return n;
    }

    public final View aF(int i) {
        lp lpVar = this.t;
        if (lpVar != null) {
            return lpVar.d(i);
        }
        return null;
    }

    public final View aG() {
        View focusedChild;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.t.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aH(View view) {
        aI(view, -1);
    }

    public final void aI(View view, int i) {
        c(view, i, true);
    }

    public final void aJ(View view) {
        aK(view, -1);
    }

    public final void aK(View view, int i) {
        c(view, i, false);
    }

    public final void aL(View view, Rect rect) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.fY(view));
        }
    }

    public final void aM(od odVar) {
        int at = at();
        while (true) {
            at--;
            if (at >= 0) {
                View aF = aF(at);
                oo k = RecyclerView.k(aF);
                if (!k.A()) {
                    if (k.t() && !k.v() && !this.u.l.a) {
                        bb(at);
                        odVar.m(k);
                    } else {
                        aN(at);
                        odVar.n(aF);
                        this.u.W.y(k);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void aN(int i) {
        aF(i);
        this.t.h(i);
    }

    public final void aO(RecyclerView recyclerView) {
        this.x = true;
        aT(recyclerView);
    }

    public final void aP(RecyclerView recyclerView, od odVar) {
        this.x = false;
        Y(recyclerView, odVar);
    }

    public void aQ(View view, Rect rect) {
        RecyclerView.N(view, rect);
    }

    public void aR(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int a = recyclerView.g.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.g.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aS(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int a = recyclerView.g.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.g.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aU(View view, efx efxVar) {
        oo k = RecyclerView.k(view);
        if (k != null && !k.v() && !this.t.k(k.a)) {
            RecyclerView recyclerView = this.u;
            n(recyclerView.e, recyclerView.M, view, efxVar);
        }
    }

    public final void aW() {
        int at = at();
        while (true) {
            at--;
            if (at >= 0) {
                this.t.j(at);
            } else {
                return;
            }
        }
    }

    public final void aX(od odVar) {
        int at = at();
        while (true) {
            at--;
            if (at >= 0) {
                if (!RecyclerView.k(aF(at)).A()) {
                    ba(at, odVar);
                }
            } else {
                return;
            }
        }
    }

    public final void aY(od odVar) {
        int size = odVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((oo) odVar.a.get(i)).a;
            oo k = RecyclerView.k(view);
            if (!k.A()) {
                k.n(false);
                if (k.x()) {
                    this.u.removeDetachedView(view, false);
                }
                nt ntVar = this.u.C;
                if (ntVar != null) {
                    ntVar.g(k);
                }
                k.n(true);
                odVar.i(view);
            }
        }
        odVar.a.clear();
        ArrayList arrayList = odVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.u.invalidate();
        }
    }

    public final void aZ(View view, od odVar) {
        lp lpVar = this.t;
        int i = lpVar.c;
        if (i != 1) {
            if (i != 2) {
                try {
                    lpVar.c = 1;
                    lpVar.d = view;
                    int V = lpVar.e.V(view);
                    if (V >= 0) {
                        if (lpVar.a.g(V)) {
                            lpVar.l(view);
                        }
                        lpVar.e.Y(V);
                    }
                    lpVar.c = 0;
                    lpVar.d = null;
                    odVar.l(view);
                    return;
                } catch (Throwable th) {
                    lpVar.c = 0;
                    lpVar.d = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void ac(int i) {
        throw null;
    }

    public boolean ag() {
        throw null;
    }

    public boolean ah() {
        throw null;
    }

    public boolean ai() {
        return this.y;
    }

    public boolean ak() {
        return false;
    }

    public boolean am() {
        return false;
    }

    public void ar(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int at() {
        lp lpVar = this.t;
        if (lpVar != null) {
            return lpVar.a();
        }
        return 0;
    }

    public final int av() {
        no noVar;
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            noVar = recyclerView.l;
        } else {
            noVar = null;
        }
        if (noVar != null) {
            return noVar.b();
        }
        return 0;
    }

    public final int aw() {
        return this.u.getLayoutDirection();
    }

    public final int ax() {
        RecyclerView recyclerView = this.u;
        int[] iArr = eek.a;
        return recyclerView.getMinimumHeight();
    }

    public final int ay() {
        RecyclerView recyclerView = this.u;
        int[] iArr = eek.a;
        return recyclerView.getMinimumWidth();
    }

    public final int az() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void bB(int i, int i2) {
        this.u.D(i, i2);
    }

    public final void bC(Runnable runnable) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    @Deprecated
    public final void bD() {
        this.y = true;
    }

    public final boolean bI(int i, Bundle bundle) {
        int i2;
        int aA;
        float f;
        if (this.u == null) {
            return false;
        }
        int i3 = this.G;
        int i4 = this.F;
        Rect rect = new Rect();
        if (this.u.getMatrix().isIdentity() && this.u.getGlobalVisibleRect(rect)) {
            i3 = rect.height();
            i4 = rect.width();
        }
        if (i != 4096) {
            if (i != 8192) {
                i2 = 0;
                aA = 0;
            } else {
                if (this.u.canScrollVertically(-1)) {
                    i2 = -((i3 - aC()) - az());
                } else {
                    i2 = 0;
                }
                if (this.u.canScrollHorizontally(-1)) {
                    aA = -((i4 - aA()) - aB());
                }
                aA = 0;
            }
        } else {
            if (this.u.canScrollVertically(1)) {
                i2 = (i3 - aC()) - az();
            } else {
                i2 = 0;
            }
            if (this.u.canScrollHorizontally(1)) {
                aA = (i4 - aA()) - aB();
            }
            aA = 0;
        }
        if (i2 == 0) {
            if (aA == 0) {
                return false;
            }
            i2 = 0;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < brg.a) {
                return false;
            }
        } else {
            f = 1.0f;
        }
        if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
            RecyclerView recyclerView = this.u;
            if (recyclerView.l == null) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192) {
                    recyclerView.ao(0);
                }
            } else {
                recyclerView.ao(r0.b() - 1);
            }
            return true;
        }
        if (Float.compare(1.0f, f) != 0 && Float.compare(brg.a, f) != 0) {
            i2 = (int) (i2 * f);
            aA = (int) (aA * f);
        }
        this.u.aH(aA, i2, null, true);
        return true;
    }

    public int bX(od odVar, ol olVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null && recyclerView.l != null && ag()) {
            return this.u.l.b();
        }
        return 1;
    }

    public int bY(od odVar, ol olVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null && recyclerView.l != null && ah()) {
            return this.u.l.b();
        }
        return 1;
    }

    public nx bZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof nx) {
            return new nx((nx) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new nx((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new nx(layoutParams);
    }

    public final void ba(int i, od odVar) {
        View aF = aF(i);
        bb(i);
        odVar.l(aF);
    }

    public final void bb(int i) {
        if (aF(i) != null) {
            this.t.j(i);
        }
    }

    public final void bc() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void bd() {
        this.w = true;
    }

    public final void be(RecyclerView recyclerView) {
        bf(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void bf(int i, int i2) {
        this.F = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.D = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.F = 0;
        }
        this.G = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.E = mode2;
        if (mode2 == 0 && !RecyclerView.a) {
            this.G = 0;
        }
    }

    public final void bg(int i, int i2) {
        RecyclerView.gg(this.u, i, i2);
    }

    public final void bh(int i, int i2) {
        int at = at();
        if (at != 0) {
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < at; i7++) {
                View aF = aF(i7);
                Rect rect = this.u.j;
                aQ(aF, rect);
                if (rect.left < i4) {
                    i4 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i5) {
                    i5 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.u.j.set(i4, i5, i3, i6);
            q(this.u.j, i, i2);
            return;
        }
        this.u.D(i, i2);
    }

    public final void bi(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.u = null;
            this.t = null;
            this.F = 0;
            this.G = 0;
        } else {
            this.u = recyclerView;
            this.t = recyclerView.g;
            this.F = recyclerView.getWidth();
            this.G = recyclerView.getHeight();
        }
        this.D = 1073741824;
        this.E = 1073741824;
    }

    public final void bj(ok okVar) {
        ok okVar2 = this.v;
        if (okVar2 != null && okVar != okVar2 && okVar2.k) {
            okVar2.o();
        }
        this.v = okVar;
        RecyclerView recyclerView = this.u;
        recyclerView.J.d();
        if (okVar.m) {
            Log.w("RecyclerView", "An instance of " + okVar.getClass().getSimpleName() + " was started more than once. Each instance of" + okVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        okVar.h = recyclerView;
        okVar.i = this;
        int i = okVar.g;
        if (i != -1) {
            RecyclerView recyclerView2 = okVar.h;
            recyclerView2.M.a = i;
            okVar.k = true;
            okVar.j = true;
            okVar.l = recyclerView2.m.U(okVar.g);
            okVar.h.J.b();
            okVar.m = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final boolean bk() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null && recyclerView.h) {
            return true;
        }
        return false;
    }

    public final boolean bm() {
        ok okVar = this.v;
        if (okVar != null && okVar.k) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if ((r5.bottom - r2) > r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r2 != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bn(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.aA()
            int r1 = r8.aC()
            int r2 = r8.F
            int r3 = r8.aB()
            int r2 = r2 - r3
            int r3 = r8.G
            int r4 = r8.az()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.aw()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Laf
        L79:
            int r13 = r8.aA()
            int r1 = r8.aC()
            int r3 = r8.F
            int r4 = r8.aB()
            int r3 = r3 - r4
            int r4 = r8.G
            int r5 = r8.az()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r5 = r8.u
            android.graphics.Rect r5 = r5.j
            r8.aQ(r11, r5)
            int r11 = r5.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r5.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r5.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r11 = r5.bottom
            int r11 = r11 - r2
            if (r11 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.am(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw.bn(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean bo(View view, int i, int i2, nx nxVar) {
        if (!view.isLayoutRequested() && this.z && bl(view.getWidth(), i, nxVar.width) && bl(view.getHeight(), i2, nxVar.height)) {
            return false;
        }
        return true;
    }

    public final void bw(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((nx) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.u != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.u.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void bz(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        Rect fY = this.u.fY(view);
        int i = fY.left + fY.right;
        int i2 = fY.top + fY.bottom;
        int au = au(this.F, this.D, aA() + aB() + nxVar.leftMargin + nxVar.rightMargin + i, nxVar.width, ag());
        int au2 = au(this.G, this.E, aC() + az() + nxVar.topMargin + nxVar.bottomMargin + i2, nxVar.height, ah());
        if (bo(view, au, au2, nxVar)) {
            view.measure(au, au2);
        }
    }

    public int d(int i, od odVar, ol olVar) {
        throw null;
    }

    public int e(int i, od odVar, ol olVar) {
        throw null;
    }

    public abstract nx f();

    public nx h(Context context, AttributeSet attributeSet) {
        return new nx(context, attributeSet);
    }

    public View j(View view, int i, od odVar, ol olVar) {
        return null;
    }

    public void m(od odVar, ol olVar, efx efxVar) {
        if (this.u.canScrollVertically(-1) || this.u.canScrollHorizontally(-1)) {
            efxVar.g(8192);
            efxVar.M(true);
            efxVar.ad();
        }
        if (this.u.canScrollVertically(1) || this.u.canScrollHorizontally(1)) {
            efxVar.g(4096);
            efxVar.M(true);
            efxVar.ad();
        }
        efxVar.s(efu.j(bY(odVar, olVar), bX(odVar, olVar), 0));
    }

    public void n(od odVar, ol olVar, View view, efx efxVar) {
        int i;
        int i2;
        if (ah()) {
            i = bt(view);
        } else {
            i = 0;
        }
        if (ag()) {
            i2 = bt(view);
        } else {
            i2 = 0;
        }
        efxVar.t(efu.i(i, 1, i2, 1, false));
    }

    public void o(od odVar, ol olVar) {
        throw null;
    }

    public void q(Rect rect, int i, int i2) {
        bg(as(i, rect.width() + aA() + aB(), ay()), as(i2, rect.height() + aC() + az(), ax()));
    }

    public boolean t(nx nxVar) {
        if (nxVar != null) {
            return true;
        }
        return false;
    }

    public boolean u(int i, Bundle bundle) {
        RecyclerView recyclerView = this.u;
        od odVar = recyclerView.e;
        ol olVar = recyclerView.M;
        return bI(i, bundle);
    }

    public boolean v() {
        return false;
    }

    public void bA() {
    }

    public void y() {
    }

    public void aT(RecyclerView recyclerView) {
    }

    public void aV(int i) {
    }

    public void aa(Parcelable parcelable) {
    }

    public void p(ol olVar) {
    }

    public void A(int i, int i2) {
    }

    public void B(int i, int i2) {
    }

    public void Y(RecyclerView recyclerView, od odVar) {
    }

    public void ao(int i, mn mnVar) {
    }

    public void x(int i, int i2) {
    }

    public void z(int i, int i2) {
    }

    public void an(int i, int i2, ol olVar, mn mnVar) {
    }
}
