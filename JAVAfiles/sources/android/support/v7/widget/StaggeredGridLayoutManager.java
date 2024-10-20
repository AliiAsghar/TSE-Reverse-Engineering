package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.brg;
import defpackage.efu;
import defpackage.efx;
import defpackage.enn;
import defpackage.ms;
import defpackage.mz;
import defpackage.nl;
import defpackage.nq;
import defpackage.nv;
import defpackage.nw;
import defpackage.nx;
import defpackage.od;
import defpackage.oj;
import defpackage.ol;
import defpackage.ou;
import defpackage.pj;
import defpackage.pk;
import defpackage.pm;
import defpackage.pn;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends nw implements oj {
    private final boolean J;
    private int[] K;
    private final Runnable L;
    pn[] a;
    public nl b;
    nl c;
    public boolean d;
    boolean e;
    public int f;
    public int g;
    public int h;
    public pm i;
    final enn j;
    private int k;
    private int l;
    private int m;
    private final ms n;
    private BitSet o;
    private boolean p;
    private boolean q;
    private final Rect r;
    private final pj s;

    public StaggeredGridLayoutManager(int i) {
        this.k = -1;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.j = new enn();
        this.h = 2;
        this.r = new Rect();
        this.s = new pj(this);
        this.J = true;
        this.L = new ou(this, 3);
        this.l = 1;
        J(i);
        this.n = new ms();
        ab();
    }

    private final int N(int i) {
        boolean z;
        if (at() == 0) {
            if (!this.e) {
                return -1;
            }
            return 1;
        }
        if (i >= c()) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.e) {
            return -1;
        }
        return 1;
    }

    private final int O(ol olVar) {
        if (at() == 0) {
            return 0;
        }
        return nq.q(olVar, this.b, r(!this.J), l(!this.J), this, this.J);
    }

    private final int P(ol olVar) {
        if (at() == 0) {
            return 0;
        }
        return nq.r(olVar, this.b, r(!this.J), l(!this.J), this, this.J, this.e);
    }

    private final int S(ol olVar) {
        if (at() == 0) {
            return 0;
        }
        return nq.s(olVar, this.b, r(!this.J), l(!this.J), this, this.J);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int T(defpackage.od r20, defpackage.ms r21, defpackage.ol r22) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.T(od, ms, ol):int");
    }

    private final int W(int i) {
        int d = this.a[0].d(i);
        for (int i2 = 1; i2 < this.k; i2++) {
            int d2 = this.a[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final int X(int i) {
        int f = this.a[0].f(i);
        for (int i2 = 1; i2 < this.k; i2++) {
            int f2 = this.a[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private final void ab() {
        this.b = nl.p(this, this.l);
        this.c = nl.p(this, 1 - this.l);
    }

    private final void ad(od odVar, ol olVar, boolean z) {
        int f;
        int i;
        int W = W(Integer.MIN_VALUE);
        if (W != Integer.MIN_VALUE && (f = this.b.f() - W) > 0) {
            int i2 = -k(-f, odVar, olVar);
            if (z && (i = f - i2) > 0) {
                this.b.n(i);
            }
        }
    }

    private final void ae(od odVar, ol olVar, boolean z) {
        int j;
        int X = X(Integer.MAX_VALUE);
        if (X != Integer.MAX_VALUE && (j = X - this.b.j()) > 0) {
            int k = j - k(j, odVar, olVar);
            if (z && k > 0) {
                this.b.n(-k);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void af(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.af(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x03d1, code lost:
    
        if (L() != false) goto L233;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aj(defpackage.od r12, defpackage.ol r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.aj(od, ol, boolean):void");
    }

    private final void al(od odVar, ms msVar) {
        int min;
        int min2;
        if (msVar.a && !msVar.i) {
            if (msVar.b == 0) {
                if (msVar.e == -1) {
                    ap(odVar, msVar.g);
                    return;
                } else {
                    aq(odVar, msVar.f);
                    return;
                }
            }
            int i = 1;
            if (msVar.e == -1) {
                int i2 = msVar.f;
                int f = this.a[0].f(i2);
                while (i < this.k) {
                    int f2 = this.a[i].f(i2);
                    if (f2 > f) {
                        f = f2;
                    }
                    i++;
                }
                int i3 = i2 - f;
                if (i3 < 0) {
                    min2 = msVar.g;
                } else {
                    min2 = msVar.g - Math.min(i3, msVar.b);
                }
                ap(odVar, min2);
                return;
            }
            int i4 = msVar.g;
            int d = this.a[0].d(i4);
            while (i < this.k) {
                int d2 = this.a[i].d(i4);
                if (d2 < d) {
                    d = d2;
                }
                i++;
            }
            int i5 = d - msVar.g;
            if (i5 < 0) {
                min = msVar.f;
            } else {
                min = Math.min(i5, msVar.b) + msVar.f;
            }
            aq(odVar, min);
        }
    }

    private final void ap(od odVar, int i) {
        int at = at();
        while (true) {
            at--;
            if (at >= 0) {
                View aF = aF(at);
                if (this.b.d(aF) >= i && this.b.m(aF) >= i) {
                    pk pkVar = (pk) aF.getLayoutParams();
                    boolean z = pkVar.b;
                    if (pkVar.a.a.size() != 1) {
                        pn pnVar = pkVar.a;
                        int size = pnVar.a.size();
                        View view = (View) pnVar.a.remove(size - 1);
                        pk n = pn.n(view);
                        n.a = null;
                        if (n.c() || n.b()) {
                            pnVar.d -= pnVar.f.b.b(view);
                        }
                        if (size == 1) {
                            pnVar.b = Integer.MIN_VALUE;
                        }
                        pnVar.c = Integer.MIN_VALUE;
                        aZ(aF, odVar);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void aq(od odVar, int i) {
        while (at() > 0) {
            View aF = aF(0);
            if (this.b.a(aF) <= i && this.b.l(aF) <= i) {
                pk pkVar = (pk) aF.getLayoutParams();
                boolean z = pkVar.b;
                if (pkVar.a.a.size() != 1) {
                    pn pnVar = pkVar.a;
                    View view = (View) pnVar.a.remove(0);
                    pk n = pn.n(view);
                    n.a = null;
                    if (pnVar.a.size() == 0) {
                        pnVar.c = Integer.MIN_VALUE;
                    }
                    if (n.c() || n.b()) {
                        pnVar.d -= pnVar.f.b.b(view);
                    }
                    pnVar.b = Integer.MIN_VALUE;
                    aZ(aF, odVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void bJ() {
        boolean z;
        if (this.l != 1 && M()) {
            z = !this.d;
        } else {
            z = this.d;
        }
        this.e = z;
    }

    private final void bK(int i) {
        boolean z;
        ms msVar = this.n;
        msVar.e = i;
        boolean z2 = this.e;
        int i2 = 1;
        if (i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (z2 != z) {
            i2 = -1;
        }
        msVar.d = i2;
    }

    private final void bL(int i, ol olVar) {
        int i2;
        int i3;
        int i4;
        boolean z;
        ms msVar = this.n;
        boolean z2 = false;
        msVar.b = 0;
        msVar.c = i;
        if (bm() && (i4 = olVar.a) != -1) {
            boolean z3 = this.e;
            if (i4 >= i) {
                z = false;
            } else {
                z = true;
            }
            if (z3 == z) {
                i2 = this.b.k();
                i3 = 0;
            } else {
                i3 = this.b.k();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (bk()) {
            this.n.f = this.b.j() - i3;
            this.n.g = this.b.f() + i2;
        } else {
            this.n.g = this.b.e() + i2;
            this.n.f = -i3;
        }
        ms msVar2 = this.n;
        msVar2.h = false;
        msVar2.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z2 = true;
        }
        msVar2.i = z2;
    }

    private final void bM(pn pnVar, int i, int i2) {
        int i3 = pnVar.d;
        if (i == -1) {
            if (pnVar.e() + i3 <= i2) {
                this.o.set(pnVar.e, false);
            }
        } else if (pnVar.c() - i3 >= i2) {
            this.o.set(pnVar.e, false);
        }
    }

    private final boolean bN(int i) {
        boolean z;
        boolean z2;
        int i2 = this.l;
        if (i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (i2 == 0) {
            if (z == this.e) {
                return false;
            }
            return true;
        }
        if (z != this.e) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != M()) {
            return false;
        }
        return true;
    }

    private final void bO(View view, int i, int i2) {
        aL(view, this.r);
        pk pkVar = (pk) view.getLayoutParams();
        int bP = bP(i, pkVar.leftMargin + this.r.left, pkVar.rightMargin + this.r.right);
        int bP2 = bP(i2, pkVar.topMargin + this.r.top, pkVar.bottomMargin + this.r.bottom);
        if (bo(view, bP, bP2, pkVar)) {
            view.measure(bP, bP2);
        }
    }

    private static final int bP(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 != 0) {
                i2 = 0;
            }
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                mode = 1073741824;
            }
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // defpackage.nw
    public final void A(int i, int i2) {
        af(i, i2, 2);
    }

    @Override // defpackage.nw
    public final void B(int i, int i2) {
        af(i, i2, 4);
    }

    @Override // defpackage.nw
    public final int C(ol olVar) {
        return O(olVar);
    }

    @Override // defpackage.nw
    public final int D(ol olVar) {
        return P(olVar);
    }

    @Override // defpackage.nw
    public final int E(ol olVar) {
        return S(olVar);
    }

    @Override // defpackage.nw
    public final int F(ol olVar) {
        return O(olVar);
    }

    @Override // defpackage.nw
    public final int G(ol olVar) {
        return P(olVar);
    }

    @Override // defpackage.nw
    public final int H(ol olVar) {
        return S(olVar);
    }

    public final void I(boolean z) {
        V(null);
        pm pmVar = this.i;
        if (pmVar != null && pmVar.h != z) {
            pmVar.h = z;
        }
        this.d = z;
        bc();
    }

    public final void J(int i) {
        V(null);
        if (i != this.k) {
            this.j.b();
            bc();
            this.k = i;
            this.o = new BitSet(i);
            this.a = new pn[this.k];
            for (int i2 = 0; i2 < this.k; i2++) {
                this.a[i2] = new pn(this, i2);
            }
            bc();
        }
    }

    final void K(int i) {
        this.m = i / this.k;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean L() {
        int c;
        if (at() != 0 && this.h != 0 && this.x) {
            if (this.e) {
                c = i();
                c();
            } else {
                c = c();
                i();
            }
            if (c == 0 && s() != null) {
                this.j.b();
                bd();
                bc();
                return true;
            }
            return false;
        }
        return false;
    }

    final boolean M() {
        if (aw() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oj
    public final PointF Q(int i) {
        int N = N(i);
        PointF pointF = new PointF();
        if (N == 0) {
            return null;
        }
        float f = N;
        if (this.l == 0) {
            pointF.x = f;
            pointF.y = brg.a;
        } else {
            pointF.x = brg.a;
            pointF.y = f;
        }
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.nw
    public final Parcelable R() {
        int c;
        View r;
        int f;
        int j;
        Object obj;
        pm pmVar = this.i;
        if (pmVar != null) {
            return new pm(pmVar);
        }
        pm pmVar2 = new pm();
        pmVar2.h = this.d;
        pmVar2.i = this.p;
        pmVar2.j = this.q;
        enn ennVar = this.j;
        if (ennVar != null && (obj = ennVar.b) != null) {
            pmVar2.f = (int[]) obj;
            pmVar2.e = pmVar2.f.length;
            pmVar2.g = ennVar.a;
        } else {
            pmVar2.e = 0;
        }
        int i = -1;
        if (at() > 0) {
            if (this.p) {
                c = i();
            } else {
                c = c();
            }
            pmVar2.a = c;
            if (this.e) {
                r = l(true);
            } else {
                r = r(true);
            }
            if (r != null) {
                i = bt(r);
            }
            pmVar2.b = i;
            int i2 = this.k;
            pmVar2.c = i2;
            pmVar2.d = new int[i2];
            for (int i3 = 0; i3 < this.k; i3++) {
                if (this.p) {
                    f = this.a[i3].d(Integer.MIN_VALUE);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.f();
                        f -= j;
                        pmVar2.d[i3] = f;
                    } else {
                        pmVar2.d[i3] = f;
                    }
                } else {
                    f = this.a[i3].f(Integer.MIN_VALUE);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.j();
                        f -= j;
                        pmVar2.d[i3] = f;
                    } else {
                        pmVar2.d[i3] = f;
                    }
                }
            }
        } else {
            pmVar2.a = -1;
            pmVar2.b = -1;
            pmVar2.c = 0;
        }
        return pmVar2;
    }

    @Override // defpackage.nw
    public final void V(String str) {
        if (this.i == null) {
            super.V(str);
        }
    }

    @Override // defpackage.nw
    public final void Y(RecyclerView recyclerView, od odVar) {
        bC(this.L);
        for (int i = 0; i < this.k; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.nw
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (at() > 0) {
            View r = r(false);
            View l = l(false);
            if (r != null && l != null) {
                int bt = bt(r);
                int bt2 = bt(l);
                if (bt < bt2) {
                    accessibilityEvent.setFromIndex(bt);
                    accessibilityEvent.setToIndex(bt2);
                } else {
                    accessibilityEvent.setFromIndex(bt2);
                    accessibilityEvent.setToIndex(bt);
                }
            }
        }
    }

    @Override // defpackage.nw
    public final void aR(int i) {
        super.aR(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.nw
    public final void aS(int i) {
        super.aS(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.nw
    public final void aV(int i) {
        if (i == 0) {
            L();
        }
    }

    @Override // defpackage.nw
    public final void aa(Parcelable parcelable) {
        if (parcelable instanceof pm) {
            pm pmVar = (pm) parcelable;
            this.i = pmVar;
            if (this.f != -1) {
                pmVar.a();
                this.i.b();
            }
            bc();
        }
    }

    @Override // defpackage.nw
    public final void ac(int i) {
        pm pmVar = this.i;
        if (pmVar != null && pmVar.a != i) {
            pmVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        bc();
    }

    @Override // defpackage.nw
    public final boolean ag() {
        if (this.l == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean ah() {
        if (this.l == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean ai() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean ak() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r5.length < r4.k) goto L13;
     */
    @Override // defpackage.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void an(int r5, int r6, defpackage.ol r7, defpackage.mn r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.l
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.at()
            if (r6 == 0) goto L7a
            if (r5 != 0) goto Lf
            goto L7a
        Lf:
            r4.w(r5, r7)
            int[] r5 = r4.K
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.k
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.k
            int[] r5 = new int[r5]
            r4.K = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.k
            if (r5 >= r1) goto L54
            ms r1 = r4.n
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3a
            int r1 = r1.f
            pn[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            goto L48
        L3a:
            pn[] r2 = r4.a
            r2 = r2[r5]
            int r1 = r1.g
            int r1 = r2.d(r1)
            ms r2 = r4.n
            int r2 = r2.g
        L48:
            int r1 = r1 - r2
            if (r1 < 0) goto L51
            int[] r2 = r4.K
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.K
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L7a
            ms r5 = r4.n
            boolean r5 = r5.a(r7)
            if (r5 == 0) goto L7a
            ms r5 = r4.n
            int r5 = r5.c
            int[] r1 = r4.K
            r1 = r1[r6]
            r8.a(r5, r1)
            ms r5 = r4.n
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.an(int, int, ol, mn):void");
    }

    @Override // defpackage.nw
    public final void ar(RecyclerView recyclerView, int i) {
        mz mzVar = new mz(recyclerView.getContext());
        mzVar.g = i;
        bj(mzVar);
    }

    @Override // defpackage.nw
    public final void bA() {
        this.j.b();
        for (int i = 0; i < this.k; i++) {
            this.a[i].j();
        }
    }

    @Override // defpackage.nw
    public final int bX(od odVar, ol olVar) {
        if (this.l == 1) {
            return Math.min(this.k, olVar.a());
        }
        return -1;
    }

    @Override // defpackage.nw
    public final int bY(od odVar, ol olVar) {
        if (this.l == 0) {
            return Math.min(this.k, olVar.a());
        }
        return -1;
    }

    @Override // defpackage.nw
    public final nx bZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new pk((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new pk(layoutParams);
    }

    final int c() {
        if (at() == 0) {
            return 0;
        }
        return bt(aF(0));
    }

    @Override // defpackage.nw
    public final int d(int i, od odVar, ol olVar) {
        return k(i, odVar, olVar);
    }

    @Override // defpackage.nw
    public final int e(int i, od odVar, ol olVar) {
        return k(i, odVar, olVar);
    }

    @Override // defpackage.nw
    public final nx f() {
        if (this.l == 0) {
            return new pk(-2, -1);
        }
        return new pk(-1, -2);
    }

    @Override // defpackage.nw
    public final nx h(Context context, AttributeSet attributeSet) {
        return new pk(context, attributeSet);
    }

    final int i() {
        int at = at();
        if (at == 0) {
            return 0;
        }
        return bt(aF(at - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0039, code lost:
    
        if (r8.l == 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x003e, code lost:
    
        if (r8.l == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x004b, code lost:
    
        if (M() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0058, code lost:
    
        if (M() == false) goto L41;
     */
    @Override // defpackage.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r9, int r10, defpackage.od r11, defpackage.ol r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.j(android.view.View, int, od, ol):android.view.View");
    }

    final int k(int i, od odVar, ol olVar) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        w(i, olVar);
        int T = T(odVar, this.n, olVar);
        if (this.n.b >= T) {
            if (i < 0) {
                i = -T;
            } else {
                i = T;
            }
        }
        this.b.n(-i);
        this.p = this.e;
        ms msVar = this.n;
        msVar.b = 0;
        al(odVar, msVar);
        return i;
    }

    final View l(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        View view = null;
        for (int at = at() - 1; at >= 0; at--) {
            View aF = aF(at);
            int d = this.b.d(aF);
            int a = this.b.a(aF);
            if (a > j && d < f) {
                if (a > f && z) {
                    if (view == null) {
                        view = aF;
                    }
                } else {
                    return aF;
                }
            }
        }
        return view;
    }

    @Override // defpackage.nw
    public final void m(od odVar, ol olVar, efx efxVar) {
        super.m(odVar, olVar, efxVar);
        efxVar.q("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.nw
    public final void n(od odVar, ol olVar, View view, efx efxVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof pk)) {
            super.aU(view, efxVar);
            return;
        }
        pk pkVar = (pk) layoutParams;
        if (this.l == 0) {
            int d = pkVar.d();
            boolean z = pkVar.b;
            efxVar.t(efu.i(d, 1, -1, -1, false));
        } else {
            int d2 = pkVar.d();
            boolean z2 = pkVar.b;
            efxVar.t(efu.i(-1, -1, d2, 1, false));
        }
    }

    @Override // defpackage.nw
    public final void o(od odVar, ol olVar) {
        aj(odVar, olVar, true);
    }

    @Override // defpackage.nw
    public final void p(ol olVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.i = null;
        this.s.a();
    }

    @Override // defpackage.nw
    public final void q(Rect rect, int i, int i2) {
        int as;
        int as2;
        int aA = aA() + aB();
        int aC = aC() + az();
        if (this.l == 1) {
            as2 = as(i2, rect.height() + aC, ax());
            as = as(i, (this.m * this.k) + aA, ay());
        } else {
            as = as(i, rect.width() + aA, ay());
            as2 = as(i2, (this.m * this.k) + aC, ax());
        }
        bg(as, as2);
    }

    final View r(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        int at = at();
        View view = null;
        for (int i = 0; i < at; i++) {
            View aF = aF(i);
            int d = this.b.d(aF);
            if (this.b.a(aF) > j && d < f) {
                if (d < j && z) {
                    if (view == null) {
                        view = aF;
                    }
                } else {
                    return aF;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View s() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.s():android.view.View");
    }

    @Override // defpackage.nw
    public final boolean t(nx nxVar) {
        return nxVar instanceof pk;
    }

    @Override // defpackage.nw
    public final boolean v() {
        if (this.i == null) {
            return true;
        }
        return false;
    }

    final void w(int i, ol olVar) {
        int c;
        int i2;
        if (i > 0) {
            c = i();
            i2 = 1;
        } else {
            c = c();
            i2 = -1;
        }
        this.n.a = true;
        bL(c, olVar);
        bK(i2);
        ms msVar = this.n;
        msVar.c = c + msVar.d;
        msVar.b = Math.abs(i);
    }

    @Override // defpackage.nw
    public final void x(int i, int i2) {
        af(i, i2, 1);
    }

    @Override // defpackage.nw
    public final void y() {
        this.j.b();
        bc();
    }

    @Override // defpackage.nw
    public final void z(int i, int i2) {
        af(i, i2, 8);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -1;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.j = new enn();
        this.h = 2;
        this.r = new Rect();
        this.s = new pj(this);
        this.J = true;
        this.L = new ou(this, 3);
        nv aD = aD(context, attributeSet, i, i2);
        int i3 = aD.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        V(null);
        if (i3 != this.l) {
            this.l = i3;
            nl nlVar = this.b;
            this.b = this.c;
            this.c = nlVar;
            bc();
        }
        J(aD.b);
        I(aD.c);
        this.n = new ms();
        ab();
    }
}
