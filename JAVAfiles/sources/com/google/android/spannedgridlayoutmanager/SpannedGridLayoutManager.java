package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.afhq;
import defpackage.ahbx;
import defpackage.ajwn;
import defpackage.ajwo;
import defpackage.ajwp;
import defpackage.ajwq;
import defpackage.ajwr;
import defpackage.appq;
import defpackage.apuv;
import defpackage.nj;
import defpackage.nk;
import defpackage.nl;
import defpackage.nw;
import defpackage.nx;
import defpackage.od;
import defpackage.ol;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SpannedGridLayoutManager extends nw {
    private boolean J;
    private final appq K;
    public ajwr a;
    int[] b;
    public int c;
    public int d;
    public int e;
    int f;
    final ArrayList g;
    final ArrayList h;
    final ArrayList i;
    final ArrayList j;
    nl k;
    nl l;
    public afhq m;
    public apuv n;
    private int o;
    private boolean p;
    private final Rect q;
    private final ajwq r;
    private int s;

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int[] iArr;
        this.f = 0;
        this.q = new Rect();
        float[] fArr = null;
        this.K = new appq((byte[]) null);
        this.r = new ajwq(this);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahbx.a, i, i2);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId != -1) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = obtainTypedArray.getDimensionPixelSize(i4, 0);
            }
            obtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId2 != -1) {
            TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
            fArr = new float[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                fArr[i5] = obtainTypedArray2.getFloat(i5, 1.0f);
            }
            obtainTypedArray2.recycle();
        }
        this.n = new apuv(i3, fArr, iArr);
        int i6 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        O(i6);
        bD();
    }

    private final int L() {
        int[] iArr = this.b;
        return iArr[this.n.a] - iArr[0];
    }

    private final ajwq M(int i, int i2, boolean z) {
        int i3;
        ajwq ajwqVar = this.r;
        ajwqVar.d = i;
        ajwqVar.e = i2;
        ajwqVar.f = z;
        ajwqVar.g = false;
        if (z) {
            i3 = this.o;
        } else {
            i3 = this.e;
        }
        ajwqVar.c = i3;
        ajwqVar.h = false;
        return ajwqVar;
    }

    private final void N(ajwq ajwqVar) {
        int i;
        int intValue;
        boolean z;
        int i2;
        boolean z2 = true;
        boolean z3 = true;
        while (true) {
            if (ajwqVar.e > 0 || ajwqVar.h) {
                if (!ajwqVar.f || ajwqVar.i.d < ajwqVar.b.a() - 1) {
                    if ((ajwqVar.f || ajwqVar.i.c > 0) && z3) {
                        appq appqVar = this.K;
                        appqVar.b = 0;
                        appqVar.a = z2;
                        int a = this.a.a(ajwqVar.c);
                        int b = this.a.b(ajwqVar.c);
                        int i3 = b - a;
                        int d = this.a.d(a);
                        int i4 = 0;
                        for (int i5 = a; i5 <= b; i5++) {
                            i4 = Math.max(i4, (this.a.d(i5) - d) + this.a.e(i5).b);
                        }
                        int i6 = i3 + 1;
                        X(this.g, i6);
                        X(this.i, i6);
                        X(this.h, i6);
                        X(this.j, i4 + 1);
                        View[] viewArr = new View[i6];
                        int i7 = 0;
                        while (i7 < i6) {
                            int i8 = i7 + a;
                            View c = ajwqVar.a.c(i8);
                            ajwp ajwpVar = (ajwp) c.getLayoutParams();
                            if (appqVar.a && !ajwpVar.c()) {
                                z = z2;
                            } else {
                                z = false;
                            }
                            appqVar.a = z;
                            ajwo e = this.a.e(i8);
                            viewArr[i7] = c;
                            int[] iArr = this.b;
                            int i9 = e.c;
                            int i10 = iArr[e.d + i9] - iArr[i9];
                            if (this.s == 1) {
                                i2 = ajwpVar.height;
                            } else {
                                i2 = ajwpVar.width;
                            }
                            int i11 = i7;
                            P(c, ajwpVar, i10, i2, 0);
                            this.h.set(i11, Integer.valueOf(this.k.b(c)));
                            this.g.set(i11, 0);
                            this.i.set(i11, Integer.valueOf(e.b));
                            i7 = i11 + 1;
                            i6 = i6;
                            viewArr = viewArr;
                            i4 = i4;
                            i3 = i3;
                            z2 = true;
                        }
                        View[] viewArr2 = viewArr;
                        boolean z4 = z2;
                        int i12 = i3;
                        int i13 = i6;
                        int i14 = i4;
                        for (int i15 = 0; i15 < i14; i15++) {
                            this.j.set(i15, null);
                        }
                        for (int i16 = 0; i16 < i14; i16++) {
                            int i17 = -1;
                            int i18 = -1;
                            for (int i19 = 0; i19 < i13; i19++) {
                                ajwo e2 = this.a.e(i19 + a);
                                Integer num = (Integer) this.i.get(i19);
                                if (num.intValue() > 0) {
                                    int intValue2 = ((Integer) this.h.get(i19)).intValue() / num.intValue();
                                    int i20 = e2.b;
                                    int i21 = i17;
                                    int i22 = 0;
                                    while (i22 < i20) {
                                        int i23 = i20;
                                        int i24 = (e2.a + i22) - d;
                                        ajwo ajwoVar = e2;
                                        if (this.j.get(i24) == null && intValue2 > i18) {
                                            i21 = i24;
                                            i18 = intValue2;
                                        }
                                        i22++;
                                        i20 = i23;
                                        e2 = ajwoVar;
                                    }
                                    i17 = i21;
                                }
                            }
                            this.j.set(i17, Integer.valueOf(i18));
                            int i25 = i17 + d;
                            for (int i26 = 0; i26 < i13; i26++) {
                                ajwo e3 = this.a.e(i26 + a);
                                int i27 = e3.a;
                                if (i27 <= i25 && i27 + e3.b > i25) {
                                    this.i.set(i26, Integer.valueOf(((Integer) r4.get(i26)).intValue() - 1));
                                    ArrayList arrayList = this.h;
                                    arrayList.set(i26, Integer.valueOf(Math.max(0, ((Integer) arrayList.get(i26)).intValue() - i18)));
                                    ArrayList arrayList2 = this.g;
                                    arrayList2.set(i26, Integer.valueOf(((Integer) arrayList2.get(i26)).intValue() + i18));
                                }
                            }
                        }
                        if (ajwqVar.f) {
                            int i28 = ajwqVar.d;
                            int i29 = 0;
                            while (i29 < i14) {
                                int intValue3 = ((Integer) this.j.get(i29)).intValue() + i28;
                                this.j.set(i29, Integer.valueOf(i28));
                                i29++;
                                i28 = intValue3;
                            }
                            this.j.set(i14, Integer.valueOf(i28));
                            for (int i30 = 0; i30 < i13; i30++) {
                                ajwo e4 = this.a.e(i30 + a);
                                int intValue4 = ((Integer) this.j.get(e4.a - d)).intValue();
                                View view = viewArr2[i30];
                                if (ajwqVar.g) {
                                    aH(view);
                                } else {
                                    aJ(view);
                                }
                                J(e4, view, ((Integer) this.g.get(i30)).intValue(), intValue4, true);
                            }
                            i = ((Integer) this.j.get(i14)).intValue();
                            intValue = ajwqVar.d;
                        } else {
                            int i31 = ajwqVar.d;
                            int i32 = i14;
                            while (i32 > 0) {
                                this.j.set(i32, Integer.valueOf(i31));
                                i32--;
                                i31 -= ((Integer) this.j.get(i32)).intValue();
                            }
                            this.j.set(0, Integer.valueOf(i31));
                            for (int i33 = i12; i33 >= 0; i33--) {
                                ajwo e5 = this.a.e(i33 + a);
                                int intValue5 = ((Integer) this.j.get((e5.a + e5.b) - d)).intValue();
                                View view2 = viewArr2[i33];
                                if (ajwqVar.g) {
                                    aI(view2, 0);
                                } else {
                                    aK(view2, 0);
                                }
                                J(e5, view2, ((Integer) this.g.get(i33)).intValue(), intValue5, false);
                            }
                            i = ajwqVar.d;
                            intValue = ((Integer) this.j.get(0)).intValue();
                        }
                        appqVar.b = i - intValue;
                        if (!ajwqVar.g) {
                            if (a < this.c) {
                                this.c = a;
                                this.e = this.a.d(a);
                            }
                            if (b > this.d) {
                                this.d = b;
                                this.o = this.a.d(b);
                            }
                        }
                        appq appqVar2 = this.K;
                        if (appqVar2.a) {
                            ajwqVar.e -= appqVar2.b;
                        }
                        int i34 = appqVar2.b;
                        if (ajwqVar.f) {
                            ajwqVar.d += i34;
                        } else {
                            ajwqVar.d -= i34;
                        }
                        z3 = ajwqVar.a();
                        z2 = z4;
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

    private final void O(int i) {
        this.s = i;
        if (i == 1) {
            this.k = new nk(this);
            this.l = new nj(this);
        } else {
            this.k = new nj(this);
            this.l = new nk(this);
        }
    }

    private final void P(View view, ajwp ajwpVar, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.s == 1) {
            i5 = au(i, 1073741824, 0, ajwpVar.width, false);
            i4 = au(this.G, i3, 0, i2, true);
        } else {
            int au = au(i, 1073741824, 0, ajwpVar.height, false);
            int au2 = au(this.F, i3, 0, i2, true);
            i4 = au;
            i5 = au2;
        }
        aL(view, this.q);
        view.measure(ab(i5, ajwpVar.leftMargin + this.q.left, ajwpVar.rightMargin + this.q.right), ab(i4, ajwpVar.topMargin + this.q.top, ajwpVar.bottomMargin + this.q.bottom));
    }

    private final void Q(int i, od odVar) {
        int a = this.a.a(i);
        int b = this.a.b(i);
        for (int i2 = b; i2 >= a; i2--) {
            ba(i2 - this.c, odVar);
        }
        if (i == this.e) {
            int i3 = b + 1;
            this.c = i3;
            this.e = this.a.d(i3);
        }
        if (i == this.o) {
            int i4 = a - 1;
            this.d = i4;
            this.o = this.a.d(i4);
        }
    }

    private final void S() {
        int a = this.a.a(this.e);
        this.c = a;
        this.o = this.e;
        this.d = a;
    }

    private final void T(od odVar, ol olVar) {
        ajwq ajwqVar = this.r;
        ajwqVar.a = odVar;
        ajwqVar.b = olVar;
    }

    private final boolean W() {
        if (at() == 0) {
            return false;
        }
        if (this.k.d(aF(this.a.a(this.e) - this.c)) >= this.k.j()) {
            return false;
        }
        return true;
    }

    private static final void X(ArrayList arrayList, int i) {
        arrayList.ensureCapacity(i);
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(null);
        }
    }

    private static final int ab(int i, int i2, int i3) {
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
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    @Override // defpackage.nw
    public final int C(ol olVar) {
        if (this.s == 1) {
            return l();
        }
        return c();
    }

    @Override // defpackage.nw
    public final int D(ol olVar) {
        if (this.s == 1) {
            return r();
        }
        return i();
    }

    @Override // defpackage.nw
    public final int E(ol olVar) {
        if (this.s == 1) {
            return s();
        }
        return k();
    }

    @Override // defpackage.nw
    public final int F(ol olVar) {
        if (this.s == 1) {
            return c();
        }
        return l();
    }

    @Override // defpackage.nw
    public final int G(ol olVar) {
        if (this.s == 1) {
            return i();
        }
        return r();
    }

    @Override // defpackage.nw
    public final int H(ol olVar) {
        if (this.s == 1) {
            return k();
        }
        return s();
    }

    final int I(int i) {
        if (at() != 0 && i != 0) {
            int s = s();
            if (i < 0) {
                int i2 = this.f;
                if (i + i2 < 0) {
                    i = -i2;
                    this.f += i;
                    this.l.n(-i);
                    return i;
                }
            }
            if (i > 0) {
                int i3 = this.f;
                if (i + i3 > s) {
                    i = s - i3;
                }
            }
            this.f += i;
            this.l.n(-i);
            return i;
        }
        return 0;
    }

    final void J(ajwo ajwoVar, View view, int i, int i2, boolean z) {
        int i3;
        ajwp ajwpVar = (ajwp) view.getLayoutParams();
        int[] iArr = this.b;
        int i4 = ajwoVar.c;
        P(view, ajwpVar, iArr[ajwoVar.d + i4] - iArr[i4], i, 1073741824);
        int i5 = this.b[ajwoVar.c] - this.f;
        int c = this.k.c(view) + i5;
        if (z) {
            i3 = this.k.b(view) + i2;
        } else {
            i3 = i2;
            i2 -= this.k.b(view);
        }
        if (this.s == 1) {
            if (aw() == 1) {
                int i6 = this.b[r2.length - 1];
                bx(view, i6 - (c + ajwpVar.getMarginEnd()), i2 + ajwpVar.topMargin, i6 - (i5 + ajwpVar.getMarginEnd()), i3 + ajwpVar.topMargin);
            } else {
                bx(view, i5 + ajwpVar.getMarginStart(), i2 + ajwpVar.topMargin, c + ajwpVar.getMarginStart(), i3 + ajwpVar.topMargin);
            }
        } else {
            bx(view, i2 + ajwpVar.getMarginStart(), i5 - ajwpVar.bottomMargin, i3 + ajwpVar.getMarginStart(), c - ajwpVar.bottomMargin);
        }
        ajwpVar.a = ajwoVar.d;
        ajwpVar.b = ajwoVar.b;
    }

    final boolean K() {
        if (at() > 0 && L() > this.l.k()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final View U(int i) {
        int i2 = this.c;
        if (i >= i2 && i <= this.d) {
            return aF(i - i2);
        }
        return null;
    }

    @Override // defpackage.nw
    public final void ac(int i) {
        if (i >= av()) {
            i = av() - 1;
        }
        this.e = this.a.d(i);
        S();
        this.p = true;
        aW();
        bc();
    }

    @Override // defpackage.nw
    public boolean ag() {
        if (this.s != 1) {
            return true;
        }
        return K();
    }

    @Override // defpackage.nw
    public final boolean ah() {
        if (this.s == 1) {
            return true;
        }
        return K();
    }

    @Override // defpackage.nw
    public final void ar(RecyclerView recyclerView, int i) {
        if (i >= av()) {
            i = av() - 1;
        }
        ajwn ajwnVar = new ajwn(this, recyclerView.getContext());
        ajwnVar.g = i;
        bj(ajwnVar);
    }

    @Override // defpackage.nw
    public final void bA() {
        aW();
        this.a = null;
        this.c = 0;
        this.e = 0;
        this.d = 0;
        this.o = 0;
        this.p = false;
        this.f = 0;
    }

    @Override // defpackage.nw
    public final nx bZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ajwp((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ajwp(layoutParams);
    }

    final int c() {
        int i = 0;
        if (this.J && W()) {
            int i2 = this.e;
            i = (this.a.b(i2) - this.a.a(i2)) + 1;
        }
        return at() - i;
    }

    @Override // defpackage.nw
    public final int d(int i, od odVar, ol olVar) {
        if (this.s == 1) {
            return I(i);
        }
        return w(i, odVar, olVar);
    }

    @Override // defpackage.nw
    public final int e(int i, od odVar, ol olVar) {
        if (this.s == 1) {
            return w(i, odVar, olVar);
        }
        return I(i);
    }

    @Override // defpackage.nw
    public final nx f() {
        return new ajwp();
    }

    @Override // defpackage.nw
    public final nx h(Context context, AttributeSet attributeSet) {
        return new ajwp(context, attributeSet);
    }

    final int i() {
        if (at() == 0) {
            return 0;
        }
        if (this.J && W()) {
            int c = this.a.c(this.e);
            if (this.a.f(c)) {
                return this.a.a(c);
            }
        }
        return this.c;
    }

    final int k() {
        ajwr ajwrVar = this.a;
        if (ajwrVar == null) {
            return 0;
        }
        return ajwrVar.a;
    }

    final int l() {
        return this.l.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    @Override // defpackage.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.od r11, defpackage.ol r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.o(od, ol):void");
    }

    final int r() {
        if (at() == 0) {
            return 0;
        }
        return this.f;
    }

    final int s() {
        if (at() == 0) {
            return 0;
        }
        return L() - this.l.k();
    }

    @Override // defpackage.nw
    public final boolean t(nx nxVar) {
        return nxVar instanceof ajwp;
    }

    @Override // defpackage.nw
    public final boolean v() {
        return true;
    }

    final int w(int i, od odVar, ol olVar) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        T(odVar, olVar);
        int d = this.k.d(aF(0));
        if (i < 0) {
            if (this.e == 0) {
                i = Math.max(i, -(this.k.j() - d));
            }
            int i2 = d - i;
            if (i2 > 0) {
                ajwq M = M(d, i2, false);
                if (M.a()) {
                    N(M);
                    i = Math.max(i, M.e + i);
                }
            }
            int d2 = this.k.d(aF(this.a.a(this.o) - this.c));
            while (d2 - i > this.k.k()) {
                Q(this.o, odVar);
                d2 = this.k.d(aF(this.a.a(this.o) - this.c));
            }
        } else {
            int a = this.k.a(aF(at() - 1));
            if (this.d == av() - 1) {
                i = Math.min(i, Math.max(a - this.k.f(), 0));
            }
            int i3 = a - i;
            if (i3 < this.k.k()) {
                ajwq M2 = M(this.k.a(aF(at() - 1)), this.k.k() - i3, true);
                if (M2.a()) {
                    N(M2);
                    i = Math.min(i, i - M2.e);
                }
            }
            int a2 = this.k.a(aF(this.a.b(this.e) - this.c));
            while (a2 - i < 0) {
                Q(this.e, odVar);
                a2 = this.k.a(aF(this.a.b(this.e) - this.c));
            }
        }
        this.k.n(-i);
        return i;
    }

    public SpannedGridLayoutManager(afhq afhqVar, boolean z) {
        this.f = 0;
        this.q = new Rect();
        this.K = new appq((byte[]) null);
        this.r = new ajwq(this);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.m = afhqVar;
        this.n = new apuv();
        bD();
        O(1);
        this.J = z;
    }
}
