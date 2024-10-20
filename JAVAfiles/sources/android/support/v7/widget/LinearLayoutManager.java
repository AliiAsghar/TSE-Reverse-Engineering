package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.brg;
import defpackage.efw;
import defpackage.efx;
import defpackage.mn;
import defpackage.mv;
import defpackage.mw;
import defpackage.mx;
import defpackage.my;
import defpackage.mz;
import defpackage.nl;
import defpackage.no;
import defpackage.nq;
import defpackage.nv;
import defpackage.nw;
import defpackage.nx;
import defpackage.od;
import defpackage.oj;
import defpackage.ol;
import defpackage.oo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends nw implements oj {
    private mx a;
    private boolean b;
    private boolean c;
    private final mw d;
    private int e;
    private int[] f;
    public int k;
    public nl l;
    public boolean m;
    public boolean n;
    public boolean o;
    int p;
    int q;
    my r;
    final mv s;

    public LinearLayoutManager() {
        this(1);
    }

    private final int bJ(ol olVar) {
        if (at() == 0) {
            return 0;
        }
        X();
        return nq.s(olVar, this.l, aq(!this.c), ap(!this.c), this, this.c);
    }

    private final int bK(int i, od odVar, ol olVar, boolean z) {
        int f;
        int f2 = this.l.f() - i;
        if (f2 > 0) {
            int i2 = -P(-f2, odVar, olVar);
            int i3 = i + i2;
            if (z && (f = this.l.f() - i3) > 0) {
                this.l.n(f);
                return f + i2;
            }
            return i2;
        }
        return 0;
    }

    private final int bL(int i, od odVar, ol olVar, boolean z) {
        int j;
        int j2 = i - this.l.j();
        if (j2 > 0) {
            int i2 = -P(j2, odVar, olVar);
            int i3 = i + i2;
            if (z && (j = i3 - this.l.j()) > 0) {
                this.l.n(-j);
                return i2 - j;
            }
            return i2;
        }
        return 0;
    }

    private final View bM() {
        return S(0, at());
    }

    private final View bN() {
        return S(at() - 1, -1);
    }

    private final View bO() {
        int at;
        if (this.n) {
            at = 0;
        } else {
            at = at() - 1;
        }
        return aF(at);
    }

    private final View bP() {
        int i;
        if (this.n) {
            i = at() - 1;
        } else {
            i = 0;
        }
        return aF(i);
    }

    private final void bQ(od odVar, mx mxVar) {
        if (mxVar.a && !mxVar.m) {
            int i = mxVar.g;
            int i2 = mxVar.i;
            if (mxVar.f == -1) {
                int at = at();
                if (i >= 0) {
                    int e = (this.l.e() - i) + i2;
                    if (this.n) {
                        for (int i3 = 0; i3 < at; i3++) {
                            View aF = aF(i3);
                            if (this.l.d(aF) < e || this.l.m(aF) < e) {
                                bR(odVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = at - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View aF2 = aF(i5);
                        if (this.l.d(aF2) < e || this.l.m(aF2) < e) {
                            bR(odVar, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i >= 0) {
                int i6 = i - i2;
                int at2 = at();
                if (this.n) {
                    int i7 = at2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View aF3 = aF(i8);
                        if (this.l.a(aF3) > i6 || this.l.l(aF3) > i6) {
                            bR(odVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < at2; i9++) {
                    View aF4 = aF(i9);
                    if (this.l.a(aF4) > i6 || this.l.l(aF4) > i6) {
                        bR(odVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    private final void bR(od odVar, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    ba(i, odVar);
                    i--;
                }
            } else {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        ba(i2, odVar);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void bS(int i, int i2, boolean z, ol olVar) {
        int i3;
        int j;
        this.a.m = al();
        this.a.f = i;
        int[] iArr = this.f;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        W(olVar, iArr);
        int max = Math.max(0, this.f[0]);
        int max2 = Math.max(0, this.f[1]);
        if (i == 1) {
            i3 = max2;
        } else {
            i3 = max;
        }
        mx mxVar = this.a;
        mxVar.h = i3;
        if (i != 1) {
            max = max2;
        }
        mxVar.i = max;
        if (i == 1) {
            mxVar.h = i3 + this.l.g();
            View bO = bO();
            mx mxVar2 = this.a;
            if (true == this.n) {
                i4 = -1;
            }
            mxVar2.e = i4;
            int bt = bt(bO);
            mx mxVar3 = this.a;
            mxVar2.d = bt + mxVar3.e;
            mxVar3.b = this.l.a(bO);
            j = this.l.a(bO) - this.l.f();
        } else {
            View bP = bP();
            this.a.h += this.l.j();
            mx mxVar4 = this.a;
            if (true != this.n) {
                i4 = -1;
            }
            mxVar4.e = i4;
            int bt2 = bt(bP);
            mx mxVar5 = this.a;
            mxVar4.d = bt2 + mxVar5.e;
            mxVar5.b = this.l.d(bP);
            j = (-this.l.d(bP)) + this.l.j();
        }
        mx mxVar6 = this.a;
        mxVar6.c = i2;
        if (z) {
            mxVar6.c = i2 - j;
        }
        mxVar6.g = j;
    }

    private final void bT(mv mvVar) {
        bU(mvVar.b, mvVar.c);
    }

    private final void bU(int i, int i2) {
        int i3;
        this.a.c = this.l.f() - i2;
        mx mxVar = this.a;
        if (true != this.n) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        mxVar.e = i3;
        mxVar.d = i;
        mxVar.f = 1;
        mxVar.b = i2;
        mxVar.g = Integer.MIN_VALUE;
    }

    private final void bV(mv mvVar) {
        bW(mvVar.b, mvVar.c);
    }

    private final void bW(int i, int i2) {
        this.a.c = i2 - this.l.j();
        mx mxVar = this.a;
        mxVar.d = i;
        int i3 = 1;
        if (true != this.n) {
            i3 = -1;
        }
        mxVar.e = i3;
        mxVar.f = -1;
        mxVar.b = i2;
        mxVar.g = Integer.MIN_VALUE;
    }

    private final int c(ol olVar) {
        if (at() == 0) {
            return 0;
        }
        X();
        return nq.q(olVar, this.l, aq(!this.c), ap(!this.c), this, this.c);
    }

    private final int r(ol olVar) {
        if (at() == 0) {
            return 0;
        }
        X();
        return nq.r(olVar, this.l, aq(!this.c), ap(!this.c), this, this.c, this.n);
    }

    @Override // defpackage.nw
    public final int C(ol olVar) {
        return c(olVar);
    }

    @Override // defpackage.nw
    public final int D(ol olVar) {
        return r(olVar);
    }

    @Override // defpackage.nw
    public final int E(ol olVar) {
        return bJ(olVar);
    }

    @Override // defpackage.nw
    public final int F(ol olVar) {
        return c(olVar);
    }

    @Override // defpackage.nw
    public final int G(ol olVar) {
        return r(olVar);
    }

    @Override // defpackage.nw
    public final int H(ol olVar) {
        return bJ(olVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I(int r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 == r1) goto L36
            r2 = 2
            if (r6 == r2) goto L29
            r2 = 17
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r2) goto L22
            r2 = 33
            if (r6 == r2) goto L23
            r0 = 66
            if (r6 == r0) goto L21
            r0 = 130(0x82, float:1.82E-43)
            if (r6 == r0) goto L1b
            return r4
        L1b:
            int r6 = r5.k
            if (r6 != r1) goto L20
            return r1
        L20:
            return r4
        L21:
            r0 = r1
        L22:
            r1 = r3
        L23:
            int r6 = r5.k
            if (r6 != r1) goto L28
            return r0
        L28:
            return r4
        L29:
            int r6 = r5.k
            if (r6 != r1) goto L2e
            return r1
        L2e:
            boolean r6 = r5.aj()
            if (r6 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            int r6 = r5.k
            if (r6 != r1) goto L3b
            return r0
        L3b:
            boolean r6 = r5.aj()
            if (r6 == 0) goto L42
            return r1
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.I(int):int");
    }

    final int J(od odVar, mx mxVar, ol olVar, boolean z) {
        int i = mxVar.c;
        int i2 = mxVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                mxVar.g = i2 + i;
            }
            bQ(odVar, mxVar);
        }
        int i3 = mxVar.c + mxVar.h;
        mw mwVar = this.d;
        while (true) {
            if ((!mxVar.m && i3 <= 0) || !mxVar.d(olVar)) {
                break;
            }
            mwVar.a = 0;
            mwVar.b = false;
            mwVar.c = false;
            mwVar.d = false;
            k(odVar, olVar, mxVar, mwVar);
            if (!mwVar.b) {
                int i4 = mxVar.b;
                int i5 = mwVar.a;
                mxVar.b = i4 + (mxVar.f * i5);
                if (!mwVar.c || mxVar.l != null || !olVar.g) {
                    mxVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = mxVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    mxVar.g = i7;
                    int i8 = mxVar.c;
                    if (i8 < 0) {
                        mxVar.g = i7 + i8;
                    }
                    bQ(odVar, mxVar);
                }
                if (z && mwVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - mxVar.c;
    }

    public final int K() {
        View T = T(0, at(), true, false);
        if (T == null) {
            return -1;
        }
        return bt(T);
    }

    public final int L() {
        View T = T(0, at(), false, true);
        if (T == null) {
            return -1;
        }
        return bt(T);
    }

    public final int M() {
        View T = T(at() - 1, -1, true, false);
        if (T == null) {
            return -1;
        }
        return bt(T);
    }

    public final int N() {
        View T = T(at() - 1, -1, false, true);
        if (T == null) {
            return -1;
        }
        return bt(T);
    }

    @Deprecated
    protected int O(ol olVar) {
        if (olVar.a != -1) {
            return this.l.k();
        }
        return 0;
    }

    final int P(int i, od odVar, ol olVar) {
        int i2;
        if (at() != 0 && i != 0) {
            X();
            this.a.a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            bS(i2, abs, true, olVar);
            mx mxVar = this.a;
            int J = mxVar.g + J(odVar, mxVar, olVar, false);
            if (J >= 0) {
                if (abs > J) {
                    i = i2 * J;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.oj
    public final PointF Q(int i) {
        if (at() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < bt(aF(0))) {
            z = true;
        }
        if (z != this.n) {
            i2 = -1;
        }
        float f = i2;
        if (this.k == 0) {
            return new PointF(f, brg.a);
        }
        return new PointF(brg.a, f);
    }

    @Override // defpackage.nw
    public final Parcelable R() {
        my myVar = this.r;
        if (myVar != null) {
            return new my(myVar);
        }
        my myVar2 = new my();
        if (at() > 0) {
            X();
            boolean z = this.b ^ this.n;
            myVar2.c = z;
            if (z) {
                View bO = bO();
                myVar2.b = this.l.f() - this.l.a(bO);
                myVar2.a = bt(bO);
            } else {
                View bP = bP();
                myVar2.a = bt(bP);
                myVar2.b = this.l.d(bP) - this.l.j();
            }
        } else {
            myVar2.a();
        }
        return myVar2;
    }

    final View S(int i, int i2) {
        int i3;
        int i4;
        X();
        if (i2 <= i && i2 >= i) {
            return aF(i);
        }
        int d = this.l.d(aF(i));
        int j = this.l.j();
        if (d < j) {
            i3 = 16388;
        } else {
            i3 = 4097;
        }
        if (d < j) {
            i4 = 16644;
        } else {
            i4 = 4161;
        }
        if (this.k == 0) {
            return this.H.B(i, i2, i4, i3);
        }
        return this.I.B(i, i2, i4, i3);
    }

    final View T(int i, int i2, boolean z, boolean z2) {
        int i3;
        X();
        int i4 = this.k;
        int i5 = 320;
        if (true != z) {
            i3 = 320;
        } else {
            i3 = 24579;
        }
        if (true != z2) {
            i5 = 0;
        }
        if (i4 == 0) {
            return this.H.B(i, i2, i3, i5);
        }
        return this.I.B(i, i2, i3, i5);
    }

    @Override // defpackage.nw
    public final View U(int i) {
        int at = at();
        if (at == 0) {
            return null;
        }
        int bt = i - bt(aF(0));
        if (bt >= 0 && bt < at) {
            View aF = aF(bt);
            if (bt(aF) == i) {
                return aF;
            }
        }
        return super.U(i);
    }

    @Override // defpackage.nw
    public final void V(String str) {
        if (this.r == null) {
            super.V(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(ol olVar, int[] iArr) {
        int i;
        int O = O(olVar);
        int i2 = this.a.f;
        if (i2 == -1) {
            i = 0;
        } else {
            i = O;
        }
        if (i2 != -1) {
            O = 0;
        }
        iArr[0] = O;
        iArr[1] = i;
    }

    public final void X() {
        if (this.a == null) {
            this.a = new mx();
        }
    }

    @Override // defpackage.nw
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(N());
        }
    }

    @Override // defpackage.nw
    public final void aa(Parcelable parcelable) {
        if (parcelable instanceof my) {
            my myVar = (my) parcelable;
            this.r = myVar;
            if (this.p != -1) {
                myVar.a();
            }
            bc();
        }
    }

    public final void ab() {
        boolean z;
        if (this.k != 1 && aj()) {
            z = !this.m;
        } else {
            z = this.m;
        }
        this.n = z;
    }

    @Override // defpackage.nw
    public final void ac(int i) {
        this.p = i;
        this.q = Integer.MIN_VALUE;
        my myVar = this.r;
        if (myVar != null) {
            myVar.a();
        }
        bc();
    }

    public final void ad(int i, int i2) {
        this.p = i;
        this.q = i2;
        my myVar = this.r;
        if (myVar != null) {
            myVar.a();
        }
        bc();
    }

    public final void ae(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.bV(i, "invalid orientation:"));
        }
        V(null);
        if (i == this.k && this.l != null) {
            return;
        }
        nl p = nl.p(this, i);
        this.l = p;
        this.s.a = p;
        this.k = i;
        bc();
    }

    public final void af(boolean z) {
        V(null);
        if (z == this.m) {
            return;
        }
        this.m = z;
        bc();
    }

    @Override // defpackage.nw
    public boolean ag() {
        if (this.k == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public boolean ah() {
        if (this.k == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean ai() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aj() {
        if (aw() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean ak() {
        return this.m;
    }

    final boolean al() {
        if (this.l.h() == 0 && this.l.e() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean am() {
        if (this.E != 1073741824 && this.D != 1073741824) {
            int at = at();
            for (int i = 0; i < at; i++) {
                ViewGroup.LayoutParams layoutParams = aF(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nw
    public final void an(int i, int i2, ol olVar, mn mnVar) {
        int i3;
        if (1 == this.k) {
            i = i2;
        }
        if (at() != 0 && i != 0) {
            X();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            bS(i3, Math.abs(i), true, olVar);
            w(olVar, this.a, mnVar);
        }
    }

    @Override // defpackage.nw
    public final void ao(int i, mn mnVar) {
        boolean z;
        int i2;
        my myVar = this.r;
        int i3 = -1;
        if (myVar != null && myVar.b()) {
            z = myVar.c;
            i2 = myVar.a;
        } else {
            ab();
            z = this.n;
            i2 = this.p;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (true != z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.e && i2 >= 0 && i2 < i; i4++) {
            mnVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ap(boolean z) {
        if (this.n) {
            return T(0, at(), z, true);
        }
        return T(at() - 1, -1, z, true);
    }

    final View aq(boolean z) {
        if (this.n) {
            return T(at() - 1, -1, z, true);
        }
        return T(0, at(), z, true);
    }

    @Override // defpackage.nw
    public void ar(RecyclerView recyclerView, int i) {
        mz mzVar = new mz(recyclerView.getContext());
        mzVar.g = i;
        bj(mzVar);
    }

    @Override // defpackage.nw
    public int d(int i, od odVar, ol olVar) {
        if (this.k == 1) {
            return 0;
        }
        return P(i, odVar, olVar);
    }

    @Override // defpackage.nw
    public int e(int i, od odVar, ol olVar) {
        if (this.k == 0) {
            return 0;
        }
        return P(i, odVar, olVar);
    }

    @Override // defpackage.nw
    public nx f() {
        return new nx(-2, -2);
    }

    public View i(od odVar, ol olVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        X();
        int at = at();
        if (z2) {
            i = -1;
            i3 = at() - 1;
            i2 = -1;
        } else {
            i = at;
            i2 = 1;
            i3 = 0;
        }
        int a = olVar.a();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i) {
            View aF = aF(i3);
            int bt = bt(aF);
            int d = this.l.d(aF);
            int a2 = this.l.a(aF);
            if (bt >= 0 && bt < a) {
                if (((nx) aF.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = aF;
                    }
                } else {
                    if (a2 <= j && d < j) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (d >= f && a2 > f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return aF;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = aF;
                        }
                        view2 = aF;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = aF;
                        }
                        view2 = aF;
                    }
                }
            }
            i3 += i2;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // defpackage.nw
    public View j(View view, int i, od odVar, ol olVar) {
        int I;
        View bN;
        View bO;
        View bM;
        ab();
        if (at() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        X();
        bS(I, (int) (this.l.k() * 0.33333334f), false, olVar);
        mx mxVar = this.a;
        mxVar.g = Integer.MIN_VALUE;
        mxVar.a = false;
        J(odVar, mxVar, olVar, true);
        if (I == -1) {
            if (this.n) {
                bM = bN();
            } else {
                bM = bM();
            }
            bN = bM;
            I = -1;
        } else if (this.n) {
            bN = bM();
        } else {
            bN = bN();
        }
        if (I == -1) {
            bO = bP();
        } else {
            bO = bO();
        }
        if (bO.hasFocusable()) {
            if (bN == null) {
                return null;
            }
            return bO;
        }
        return bN;
    }

    public void k(od odVar, ol olVar, mx mxVar, mw mwVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View a = mxVar.a(odVar);
        if (a == null) {
            mwVar.b = true;
            return;
        }
        nx nxVar = (nx) a.getLayoutParams();
        if (mxVar.l == null) {
            boolean z3 = this.n;
            if (mxVar.f != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z3 == z2) {
                aJ(a);
            } else {
                aK(a, 0);
            }
        } else {
            boolean z4 = this.n;
            if (mxVar.f != -1) {
                z = false;
            } else {
                z = true;
            }
            if (z4 == z) {
                aH(a);
            } else {
                aI(a, 0);
            }
        }
        bz(a);
        mwVar.a = this.l.b(a);
        if (this.k == 1) {
            if (aj()) {
                i4 = this.F - aB();
                i = i4 - this.l.c(a);
            } else {
                i = aA();
                i4 = this.l.c(a) + i;
            }
            if (mxVar.f == -1) {
                i2 = mxVar.b;
                i3 = i2 - mwVar.a;
            } else {
                i3 = mxVar.b;
                i2 = mwVar.a + i3;
            }
        } else {
            int aC = aC();
            int c = this.l.c(a) + aC;
            if (mxVar.f == -1) {
                int i5 = mxVar.b;
                int i6 = i5 - mwVar.a;
                i4 = i5;
                i2 = c;
                i = i6;
                i3 = aC;
            } else {
                int i7 = mxVar.b;
                int i8 = mwVar.a + i7;
                i = i7;
                i2 = c;
                i3 = aC;
                i4 = i8;
            }
        }
        by(a, i, i3, i4, i2);
        if (nxVar.c() || nxVar.b()) {
            mwVar.c = true;
        }
        mwVar.d = a.hasFocusable();
    }

    @Override // defpackage.nw
    public void m(od odVar, ol olVar, efx efxVar) {
        super.m(odVar, olVar, efxVar);
        no noVar = this.u.l;
        if (noVar != null && noVar.b() > 0) {
            efxVar.h(efw.i);
        }
    }

    @Override // defpackage.nw
    public void o(od odVar, ol olVar) {
        View i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int d;
        int i3;
        int i4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        int bK;
        int i8;
        View U;
        int d2;
        int i9;
        int i10 = -1;
        if ((this.r == null && this.p == -1) || olVar.a() != 0) {
            my myVar = this.r;
            if (myVar != null && myVar.b()) {
                this.p = myVar.a;
            }
            X();
            this.a.a = false;
            ab();
            View aG = aG();
            mv mvVar = this.s;
            if (mvVar.e && this.p == -1 && this.r == null) {
                if (aG != null && (this.l.d(aG) >= this.l.f() || this.l.a(aG) <= this.l.j())) {
                    this.s.c(aG, bt(aG));
                }
            } else {
                mvVar.d();
                mv mvVar2 = this.s;
                mvVar2.d = this.n ^ this.o;
                if (!olVar.g && (i2 = this.p) != -1) {
                    if (i2 >= 0 && i2 < olVar.a()) {
                        int i11 = this.p;
                        mvVar2.b = i11;
                        my myVar2 = this.r;
                        if (myVar2 != null && myVar2.b()) {
                            boolean z6 = myVar2.c;
                            mvVar2.d = z6;
                            if (z6) {
                                mvVar2.c = this.l.f() - this.r.b;
                            } else {
                                mvVar2.c = this.l.j() + this.r.b;
                            }
                        } else if (this.q == Integer.MIN_VALUE) {
                            View U2 = U(i11);
                            if (U2 != null) {
                                if (this.l.b(U2) > this.l.k()) {
                                    mvVar2.a();
                                } else if (this.l.d(U2) - this.l.j() < 0) {
                                    mvVar2.c = this.l.j();
                                    mvVar2.d = false;
                                } else if (this.l.f() - this.l.a(U2) < 0) {
                                    mvVar2.c = this.l.f();
                                    mvVar2.d = true;
                                } else {
                                    if (mvVar2.d) {
                                        d = this.l.a(U2) + this.l.o();
                                    } else {
                                        d = this.l.d(U2);
                                    }
                                    mvVar2.c = d;
                                }
                            } else {
                                if (at() > 0) {
                                    if (this.p >= bt(aF(0))) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3 == this.n) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    mvVar2.d = z4;
                                }
                                mvVar2.a();
                            }
                        } else {
                            boolean z7 = this.n;
                            mvVar2.d = z7;
                            if (z7) {
                                mvVar2.c = this.l.f() - this.q;
                            } else {
                                mvVar2.c = this.l.j() + this.q;
                            }
                        }
                        this.s.e = true;
                    } else {
                        this.p = -1;
                        this.q = Integer.MIN_VALUE;
                    }
                }
                if (at() != 0) {
                    View aG2 = aG();
                    if (aG2 != null) {
                        nx nxVar = (nx) aG2.getLayoutParams();
                        if (!nxVar.c() && nxVar.a() >= 0 && nxVar.a() < olVar.a()) {
                            mvVar2.c(aG2, bt(aG2));
                            this.s.e = true;
                        }
                    }
                    boolean z8 = this.b;
                    boolean z9 = this.o;
                    if (z8 == z9 && (i = i(odVar, olVar, mvVar2.d, z9)) != null) {
                        mvVar2.b(i, bt(i));
                        if (!olVar.g && v()) {
                            int d3 = this.l.d(i);
                            int a = this.l.a(i);
                            int j = this.l.j();
                            int f = this.l.f();
                            if (a <= j && d3 < j) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d3 >= f && a > f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z || z2) {
                                if (true == mvVar2.d) {
                                    j = f;
                                }
                                mvVar2.c = j;
                            }
                        }
                        this.s.e = true;
                    }
                }
                mvVar2.a();
                mvVar2.b = this.o ? olVar.a() - 1 : 0;
                this.s.e = true;
            }
            mx mxVar = this.a;
            if (mxVar.k >= 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            mxVar.f = i3;
            int[] iArr = this.f;
            iArr[0] = 0;
            iArr[1] = 0;
            W(olVar, iArr);
            int max = Math.max(0, this.f[0]) + this.l.j();
            int max2 = Math.max(0, this.f[1]) + this.l.g();
            if (olVar.g && (i8 = this.p) != -1 && this.q != Integer.MIN_VALUE && (U = U(i8)) != null) {
                if (this.n) {
                    i9 = this.l.f() - this.l.a(U);
                    d2 = this.q;
                } else {
                    d2 = this.l.d(U) - this.l.j();
                    i9 = this.q;
                }
                int i12 = i9 - d2;
                if (i12 > 0) {
                    max += i12;
                } else {
                    max2 -= i12;
                }
            }
            mv mvVar3 = this.s;
            if (!mvVar3.d ? true != this.n : true == this.n) {
                i10 = 1;
            }
            l(odVar, olVar, mvVar3, i10);
            aM(odVar);
            this.a.m = al();
            mx mxVar2 = this.a;
            mxVar2.j = olVar.g;
            mxVar2.i = 0;
            mv mvVar4 = this.s;
            if (mvVar4.d) {
                bV(mvVar4);
                mx mxVar3 = this.a;
                mxVar3.h = max;
                J(odVar, mxVar3, olVar, false);
                mx mxVar4 = this.a;
                i5 = mxVar4.b;
                int i13 = mxVar4.d;
                int i14 = mxVar4.c;
                if (i14 > 0) {
                    max2 += i14;
                }
                bT(this.s);
                mx mxVar5 = this.a;
                mxVar5.h = max2;
                mxVar5.d += mxVar5.e;
                J(odVar, mxVar5, olVar, false);
                mx mxVar6 = this.a;
                i4 = mxVar6.b;
                int i15 = mxVar6.c;
                if (i15 > 0) {
                    bW(i13, i5);
                    mx mxVar7 = this.a;
                    mxVar7.h = i15;
                    J(odVar, mxVar7, olVar, false);
                    i5 = this.a.b;
                }
            } else {
                bT(mvVar4);
                mx mxVar8 = this.a;
                mxVar8.h = max2;
                J(odVar, mxVar8, olVar, false);
                mx mxVar9 = this.a;
                i4 = mxVar9.b;
                int i16 = mxVar9.d;
                int i17 = mxVar9.c;
                if (i17 > 0) {
                    max += i17;
                }
                bV(this.s);
                mx mxVar10 = this.a;
                mxVar10.h = max;
                mxVar10.d += mxVar10.e;
                J(odVar, mxVar10, olVar, false);
                mx mxVar11 = this.a;
                i5 = mxVar11.b;
                int i18 = mxVar11.c;
                if (i18 > 0) {
                    bU(i16, i4);
                    mx mxVar12 = this.a;
                    mxVar12.h = i18;
                    J(odVar, mxVar12, olVar, false);
                    i4 = this.a.b;
                }
            }
            if (at() > 0) {
                if (this.n ^ this.o) {
                    int bK2 = bK(i4, odVar, olVar, true);
                    i6 = i5 + bK2;
                    i7 = i4 + bK2;
                    bK = bL(i6, odVar, olVar, false);
                } else {
                    int bL = bL(i5, odVar, olVar, true);
                    i6 = i5 + bL;
                    i7 = i4 + bL;
                    bK = bK(i7, odVar, olVar, false);
                }
                i5 = i6 + bK;
                i4 = i7 + bK;
            }
            if (olVar.k && at() != 0 && !olVar.g && v()) {
                List list = odVar.d;
                int size = list.size();
                int bt = bt(aF(0));
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    oo ooVar = (oo) list.get(i21);
                    if (!ooVar.v()) {
                        if (ooVar.ge() >= bt) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5 != this.n) {
                            i19 += this.l.b(ooVar.a);
                        } else {
                            i20 += this.l.b(ooVar.a);
                        }
                    }
                }
                this.a.l = list;
                if (i19 > 0) {
                    bW(bt(bP()), i5);
                    mx mxVar13 = this.a;
                    mxVar13.h = i19;
                    mxVar13.c = 0;
                    mxVar13.b();
                    J(odVar, this.a, olVar, false);
                }
                if (i20 > 0) {
                    bU(bt(bO()), i4);
                    mx mxVar14 = this.a;
                    mxVar14.h = i20;
                    mxVar14.c = 0;
                    mxVar14.b();
                    J(odVar, this.a, olVar, false);
                }
                this.a.l = null;
            }
            if (!olVar.g) {
                nl nlVar = this.l;
                nlVar.b = nlVar.k();
            } else {
                this.s.d();
            }
            this.b = this.o;
            return;
        }
        aX(odVar);
    }

    @Override // defpackage.nw
    public void p(ol olVar) {
        this.r = null;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.s.d();
    }

    public void s(boolean z) {
        V(null);
        if (this.o == z) {
            return;
        }
        this.o = z;
        bc();
    }

    @Override // defpackage.nw
    public boolean u(int i, Bundle bundle) {
        int min;
        if (super.u(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.u;
                min = Math.min(i2, bY(recyclerView.e, recyclerView.M) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.u;
                min = Math.min(i3, bX(recyclerView2.e, recyclerView2.M) - 1);
            }
            if (min >= 0) {
                ad(min, 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nw
    public boolean v() {
        if (this.r == null && this.b == this.o) {
            return true;
        }
        return false;
    }

    public void w(ol olVar, mx mxVar, mn mnVar) {
        int i = mxVar.d;
        if (i >= 0 && i < olVar.a()) {
            mnVar.a(i, Math.max(0, mxVar.g));
        }
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new mv();
        this.d = new mw();
        this.e = 2;
        this.f = new int[2];
        ae(i);
        af(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new mv();
        this.d = new mw();
        this.e = 2;
        this.f = new int[2];
        nv aD = aD(context, attributeSet, i, i2);
        ae(aD.a);
        af(aD.c);
        s(aD.d);
    }

    @Override // defpackage.nw
    public void Y(RecyclerView recyclerView, od odVar) {
    }

    public void l(od odVar, ol olVar, mv mvVar, int i) {
    }
}
