package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.agrk;
import defpackage.ajdd;
import defpackage.ajey;
import defpackage.ajez;
import defpackage.ajfa;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfd;
import defpackage.ajfe;
import defpackage.ajff;
import defpackage.ajfh;
import defpackage.ajfi;
import defpackage.ajfj;
import defpackage.ajfl;
import defpackage.ajfm;
import defpackage.brg;
import defpackage.dze;
import defpackage.fyc;
import defpackage.nw;
import defpackage.nx;
import defpackage.od;
import defpackage.oj;
import defpackage.ol;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CarouselLayoutManager extends nw implements ajey, oj {
    int a;
    int b;
    int c;
    public ajfj d;
    private final ajfb e;
    private ajff f;
    private ajfi g;
    private int h;
    private Map i;
    private ajfe j;
    private final View.OnLayoutChangeListener k;
    private int l;
    private int m;
    private int n;

    public CarouselLayoutManager() {
        ajfl ajflVar = new ajfl();
        this.e = new ajfb();
        this.h = 0;
        this.k = new fyc(this, 19);
        this.m = -1;
        this.n = 0;
        J(ajflVar);
        K(0);
    }

    private final float M(float f, float f2) {
        if (L()) {
            return f - f2;
        }
        return f + f2;
    }

    private final float N(float f, float f2) {
        if (L()) {
            return f + f2;
        }
        return f - f2;
    }

    private final float O(int i) {
        return M(W() - this.a, this.g.a * i);
    }

    private final float P(View view) {
        int centerY;
        Rect rect = new Rect();
        RecyclerView.N(view, rect);
        if (g()) {
            centerY = rect.centerX();
        } else {
            centerY = rect.centerY();
        }
        return centerY;
    }

    private static int S(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        if (i5 < i3) {
            return i3 - i2;
        }
        if (i5 > i4) {
            return i4 - i2;
        }
        return i;
    }

    private final int T() {
        if (g()) {
            return this.F;
        }
        return this.G;
    }

    private final int W() {
        return this.j.d();
    }

    private final int X(int i, ajfi ajfiVar) {
        float f = i;
        if (L()) {
            float T = T() - ajfiVar.c().a;
            float f2 = ajfiVar.a;
            return (int) ((T - (f * f2)) - (f2 / 2.0f));
        }
        return (int) (((f * ajfiVar.a) - ajfiVar.a().a) + (ajfiVar.a / 2.0f));
    }

    private final int ab(int i, ajfi ajfiVar) {
        int i2;
        int i3 = Integer.MAX_VALUE;
        for (ajfh ajfhVar : ajfiVar.c.subList(ajfiVar.d, ajfiVar.e + 1)) {
            float f = ajfiVar.a;
            float f2 = (i * f) + (f / 2.0f);
            if (L()) {
                i2 = (int) ((T() - ajfhVar.a) - f2);
            } else {
                i2 = (int) (f2 - ajfhVar.a);
            }
            int i4 = i2 - this.a;
            if (Math.abs(i3) > Math.abs(i4)) {
                i3 = i4;
            }
        }
        return i3;
    }

    private final int ad(int i, od odVar, ol olVar) {
        float f;
        if (at() != 0 && i != 0) {
            if (this.d == null) {
                bK(odVar);
            }
            if (av() > ae(this.d).b) {
                int i2 = this.a;
                int S = S(i, i2, this.b, this.c);
                this.a = i2 + S;
                bL(this.d);
                float f2 = this.g.a / 2.0f;
                float O = O(bt(aF(0)));
                Rect rect = new Rect();
                if (L()) {
                    f = this.g.c().b;
                } else {
                    f = this.g.a().b;
                }
                float f3 = Float.MAX_VALUE;
                for (int i3 = 0; i3 < at(); i3++) {
                    View aF = aF(i3);
                    float M = M(O, f2);
                    agrk bO = bO(this.g.c, M, false);
                    float bN = bN(M, bO);
                    RecyclerView.N(aF, rect);
                    bP(aF, M, bO);
                    this.j.j(aF, rect, f2, bN);
                    float abs = Math.abs(f - bN);
                    if (aF != null && abs < f3) {
                        this.m = bt(aF);
                        f3 = abs;
                    }
                    O = M(O, this.g.a);
                }
                bJ(odVar, olVar);
                return S;
            }
        }
        return 0;
    }

    private final ajfi ae(ajfj ajfjVar) {
        if (L()) {
            return ajfjVar.a();
        }
        return ajfjVar.c();
    }

    private final ajfi af(int i) {
        ajfi ajfiVar;
        Map map = this.i;
        if (map != null && (ajfiVar = (ajfi) map.get(Integer.valueOf(dze.c(i, 0, Math.max(0, av() - 1))))) != null) {
            return ajfiVar;
        }
        return this.d.a;
    }

    private final void aj(View view, int i, ajfa ajfaVar) {
        float f = this.g.a / 2.0f;
        aK(view, i);
        ajfe ajfeVar = this.j;
        float f2 = ajfaVar.c;
        ajfeVar.h(view, (int) (f2 - f), (int) (f2 + f));
        bP(view, ajfaVar.b, ajfaVar.d);
    }

    private final void al(od odVar, int i, int i2) {
        if (i >= 0 && i < av()) {
            float O = O(i);
            View c = odVar.c(i);
            bz(c);
            float M = M(O, this.g.a / 2.0f);
            agrk bO = bO(this.g.c, M, false);
            ajfa ajfaVar = new ajfa(c, M, bN(M, bO), bO);
            aj(ajfaVar.a, i2, ajfaVar);
        }
    }

    private final void ap(od odVar, ol olVar, int i) {
        float O = O(i);
        while (i < olVar.a()) {
            float M = M(O, this.g.a / 2.0f);
            agrk bO = bO(this.g.c, M, false);
            float bN = bN(M, bO);
            if (!bQ(bN, bO)) {
                O = M(O, this.g.a);
                if (!bR(bN, bO)) {
                    View c = odVar.c(i);
                    bz(c);
                    aj(c, -1, new ajfa(c, M, bN, bO));
                }
                i++;
            } else {
                return;
            }
        }
    }

    private final void aq(od odVar, int i) {
        float O = O(i);
        while (i >= 0) {
            float M = M(O, this.g.a / 2.0f);
            agrk bO = bO(this.g.c, M, false);
            float bN = bN(M, bO);
            if (!bR(bN, bO)) {
                O = N(O, this.g.a);
                if (!bQ(bN, bO)) {
                    View c = odVar.c(i);
                    bz(c);
                    aj(c, 0, new ajfa(c, M, bN, bO));
                }
                i--;
            } else {
                return;
            }
        }
    }

    private final void bJ(od odVar, ol olVar) {
        while (at() > 0) {
            View aF = aF(0);
            float P = P(aF);
            if (!bR(P, bO(this.g.c, P, true))) {
                break;
            } else {
                aZ(aF, odVar);
            }
        }
        while (at() - 1 >= 0) {
            View aF2 = aF(at() - 1);
            float P2 = P(aF2);
            if (!bQ(P2, bO(this.g.c, P2, true))) {
                break;
            } else {
                aZ(aF2, odVar);
            }
        }
        if (at() == 0) {
            aq(odVar, this.h - 1);
            ap(odVar, olVar, this.h);
        } else {
            int bt = bt(aF(0));
            int bt2 = bt(aF(at() - 1));
            aq(odVar, bt - 1);
            ap(odVar, olVar, bt2 + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03c4, code lost:
    
        if (r10 == r13) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0508, code lost:
    
        if (r8 == r11) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bK(defpackage.od r30) {
        /*
            Method dump skipped, instructions count: 1503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.bK(od):void");
    }

    private final void bL(ajfj ajfjVar) {
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            this.g = ae(ajfjVar);
        } else {
            this.g = ajfjVar.b(this.a, i2, i);
        }
        this.e.a = DesugarCollections.unmodifiableList(this.g.c);
    }

    private final void bM() {
        int av = av();
        int i = this.l;
        if (av != i && this.d != null) {
            ajfl ajflVar = (ajfl) this.f;
            if ((i < ajflVar.e && av() >= ajflVar.e) || (i >= ajflVar.e && av() < ajflVar.e)) {
                I();
            }
            this.l = av;
        }
    }

    private final float bN(float f, agrk agrkVar) {
        ajfh ajfhVar = (ajfh) agrkVar.b;
        float f2 = ajfhVar.b;
        ajfh ajfhVar2 = (ajfh) agrkVar.a;
        float a = ajdd.a(f2, ajfhVar2.b, ajfhVar.a, ajfhVar2.a, f);
        if (agrkVar.a != this.g.b() && agrkVar.b != this.g.d()) {
            return a;
        }
        ajfh ajfhVar3 = (ajfh) agrkVar.a;
        return a + ((f - ajfhVar3.a) * (1.0f - ajfhVar3.c));
    }

    private static agrk bO(List list, float f, boolean z) {
        float f2;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ajfh ajfhVar = (ajfh) list.get(i5);
            if (z) {
                f2 = ajfhVar.b;
            } else {
                f2 = ajfhVar.a;
            }
            float abs = Math.abs(f2 - f);
            if (f2 <= f && abs <= f4) {
                i = i5;
                f4 = abs;
            }
            if (f2 > f && abs <= f5) {
                i2 = i5;
                f5 = abs;
            }
            if (f2 <= f6) {
                f6 = f2;
            }
            if (f2 <= f6) {
                i3 = i5;
            }
            if (f2 > f3) {
                f3 = f2;
            }
            if (f2 > f3) {
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i3;
        }
        if (i2 == -1) {
            i2 = i4;
        }
        return new agrk((ajfh) list.get(i), (ajfh) list.get(i2));
    }

    private final void bP(View view, float f, agrk agrkVar) {
        if (!(view instanceof MaskableFrameLayout)) {
            return;
        }
        ajfh ajfhVar = (ajfh) agrkVar.b;
        ajfh ajfhVar2 = (ajfh) agrkVar.a;
        float a = ajdd.a(ajfhVar.c, ajfhVar2.c, ajfhVar.a, ajfhVar2.a, f);
        float height = view.getHeight();
        float width = view.getWidth();
        RectF f2 = this.j.f(height, width, ajdd.a(brg.a, height / 2.0f, brg.a, 1.0f, a), ajdd.a(brg.a, width / 2.0f, brg.a, 1.0f, a));
        float bN = bN(f, agrkVar);
        RectF rectF = new RectF(bN - (f2.width() / 2.0f), bN - (f2.height() / 2.0f), bN + (f2.width() / 2.0f), (f2.height() / 2.0f) + bN);
        RectF rectF2 = new RectF(r(), w(), s(), l());
        this.j.g(f2, rectF, rectF2);
        this.j.i(f2, rectF, rectF2);
        ((MaskableFrameLayout) view).a(f2);
    }

    private final boolean bQ(float f, agrk agrkVar) {
        float N = N(f, bS(f, agrkVar) / 2.0f);
        if (L()) {
            if (N < brg.a) {
                return true;
            }
            return false;
        }
        if (N > T()) {
            return true;
        }
        return false;
    }

    private final boolean bR(float f, agrk agrkVar) {
        float M = M(f, bS(f, agrkVar) / 2.0f);
        if (L()) {
            if (M > T()) {
                return true;
            }
            return false;
        }
        if (M < brg.a) {
            return true;
        }
        return false;
    }

    private static final float bS(float f, agrk agrkVar) {
        ajfh ajfhVar = (ajfh) agrkVar.b;
        float f2 = ajfhVar.d;
        ajfh ajfhVar2 = (ajfh) agrkVar.a;
        return ajdd.a(f2, ajfhVar2.d, ajfhVar.b, ajfhVar2.b, f);
    }

    @Override // defpackage.nw
    public final void A(int i, int i2) {
        bM();
    }

    @Override // defpackage.nw
    public final int C(ol olVar) {
        if (at() != 0 && this.d != null && av() > 1) {
            return (int) (this.F * (this.d.a.a / E(olVar)));
        }
        return 0;
    }

    @Override // defpackage.nw
    public final int D(ol olVar) {
        return this.a;
    }

    @Override // defpackage.nw
    public final int E(ol olVar) {
        return this.c - this.b;
    }

    @Override // defpackage.nw
    public final int F(ol olVar) {
        if (at() != 0 && this.d != null && av() > 1) {
            return (int) (this.G * (this.d.a.a / H(olVar)));
        }
        return 0;
    }

    @Override // defpackage.nw
    public final int G(ol olVar) {
        return this.a;
    }

    @Override // defpackage.nw
    public final int H(ol olVar) {
        return this.c - this.b;
    }

    public final void I() {
        this.d = null;
        bc();
    }

    public final void J(ajff ajffVar) {
        this.f = ajffVar;
        I();
    }

    public final void K(int i) {
        ajfe ajfdVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.bV(i, "invalid orientation:"));
        }
        V(null);
        ajfe ajfeVar = this.j;
        if (ajfeVar != null && i == ajfeVar.b) {
            return;
        }
        if (i != 0) {
            ajfdVar = new ajfc(this);
        } else {
            ajfdVar = new ajfd(this);
        }
        this.j = ajfdVar;
        I();
    }

    public final boolean L() {
        if (g() && aw() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oj
    public final PointF Q(int i) {
        if (this.d == null) {
            return null;
        }
        float X = X(i, af(i)) - this.a;
        if (g()) {
            return new PointF(X, brg.a);
        }
        return new PointF(brg.a, X);
    }

    @Override // defpackage.nw
    public final void Y(RecyclerView recyclerView, od odVar) {
        recyclerView.removeOnLayoutChangeListener(this.k);
    }

    @Override // defpackage.nw
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(bt(aF(0)));
            accessibilityEvent.setToIndex(bt(aF(at() - 1)));
        }
    }

    @Override // defpackage.ajey
    public final int a() {
        return this.n;
    }

    @Override // defpackage.nw
    public final void aQ(View view, Rect rect) {
        float f;
        RecyclerView.N(view, rect);
        float centerY = rect.centerY();
        if (g()) {
            centerY = rect.centerX();
        }
        float bS = bS(centerY, bO(this.g.c, centerY, true));
        boolean g = g();
        float f2 = brg.a;
        if (g) {
            f = (rect.width() - bS) / 2.0f;
        } else {
            f = 0.0f;
        }
        if (!g()) {
            f2 = (rect.height() - bS) / 2.0f;
        }
        rect.set((int) (rect.left + f), (int) (rect.top + f2), (int) (rect.right - f), (int) (rect.bottom - f2));
    }

    @Override // defpackage.nw
    public final void aT(RecyclerView recyclerView) {
        ajff ajffVar = this.f;
        Context context = recyclerView.getContext();
        float f = ajffVar.a;
        if (f <= brg.a) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ajffVar.a = f;
        float f2 = ajffVar.b;
        if (f2 <= brg.a) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ajffVar.b = f2;
        I();
        recyclerView.addOnLayoutChangeListener(this.k);
    }

    @Override // defpackage.nw
    public final void ac(int i) {
        this.m = i;
        if (this.d == null) {
            return;
        }
        this.a = X(i, af(i));
        this.h = dze.c(i, 0, Math.max(0, av() - 1));
        bL(this.d);
        bc();
    }

    @Override // defpackage.nw
    public final boolean ag() {
        return g();
    }

    @Override // defpackage.nw
    public final boolean ah() {
        if (!g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw
    public final boolean ai() {
        return true;
    }

    @Override // defpackage.nw
    public final void ar(RecyclerView recyclerView, int i) {
        ajez ajezVar = new ajez(this, recyclerView.getContext());
        ajezVar.g = i;
        bj(ajezVar);
    }

    @Override // defpackage.ajey
    public final int b() {
        return this.G;
    }

    @Override // defpackage.nw
    public final boolean bn(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int ab;
        if (this.d == null || (ab = ab(bt(view), af(bt(view)))) == 0) {
            return false;
        }
        int i = this.a;
        int ab2 = ab(bt(view), this.d.b(i + S(ab, i, r0, r1), this.b, this.c));
        if (g()) {
            recyclerView.scrollBy(ab2, 0);
            return true;
        }
        recyclerView.scrollBy(0, ab2);
        return true;
    }

    @Override // defpackage.nw
    public final void bz(View view) {
        float f;
        float f2;
        if (view instanceof MaskableFrameLayout) {
            nx nxVar = (nx) view.getLayoutParams();
            Rect rect = new Rect();
            aL(view, rect);
            int i = rect.left + rect.right;
            int i2 = rect.top + rect.bottom;
            ajfj ajfjVar = this.d;
            if (ajfjVar != null && this.j.b == 0) {
                f = ajfjVar.a.a;
            } else {
                f = nxVar.width;
            }
            ajfj ajfjVar2 = this.d;
            if (ajfjVar2 != null && this.j.b == 1) {
                f2 = ajfjVar2.a.a;
            } else {
                f2 = nxVar.height;
            }
            view.measure(au(this.F, this.D, aA() + aB() + nxVar.leftMargin + nxVar.rightMargin + i, (int) f, g()), au(this.G, this.E, aC() + az() + nxVar.topMargin + nxVar.bottomMargin + i2, (int) f2, ah()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.ajey
    public final int c() {
        return this.F;
    }

    @Override // defpackage.nw
    public final int d(int i, od odVar, ol olVar) {
        if (g()) {
            return ad(i, odVar, olVar);
        }
        return 0;
    }

    @Override // defpackage.nw
    public final int e(int i, od odVar, ol olVar) {
        if (ah()) {
            return ad(i, odVar, olVar);
        }
        return 0;
    }

    @Override // defpackage.nw
    public final nx f() {
        return new nx(-2, -2);
    }

    @Override // defpackage.ajey
    public final boolean g() {
        if (this.j.b == 0) {
            return true;
        }
        return false;
    }

    public final int i(int i) {
        return (int) (this.a - X(i, af(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0031, code lost:
    
        if (r9 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003a, code lost:
    
        if (L() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003d, code lost:
    
        if (r9 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0046, code lost:
    
        if (L() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // defpackage.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r6, int r7, defpackage.od r8, defpackage.ol r9) {
        /*
            r5 = this;
            int r9 = r5.at()
            r0 = 0
            if (r9 == 0) goto La4
            int r9 = r5.k()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r7 == r2) goto L4a
            r4 = 2
            if (r7 == r4) goto L48
            r4 = 17
            if (r7 == r4) goto L40
            r4 = 33
            if (r7 == r4) goto L3d
            r4 = 66
            if (r7 == r4) goto L34
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L31
            java.lang.String r9 = "Unknown focus request:"
            java.lang.String r7 = defpackage.a.bV(r7, r9)
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
        L2f:
            r7 = r1
            goto L4b
        L31:
            if (r9 != r2) goto L2f
            goto L48
        L34:
            if (r9 != 0) goto L2f
            boolean r7 = r5.L()
            if (r7 == 0) goto L48
            goto L4a
        L3d:
            if (r9 != r2) goto L2f
            goto L4a
        L40:
            if (r9 != 0) goto L2f
            boolean r7 = r5.L()
            if (r7 == 0) goto L4a
        L48:
            r7 = r2
            goto L4b
        L4a:
            r7 = r3
        L4b:
            if (r7 != r1) goto L4e
            return r0
        L4e:
            r9 = 0
            if (r7 != r3) goto L75
            int r6 = bt(r6)
            if (r6 != 0) goto L58
            return r0
        L58:
            android.view.View r6 = r5.aF(r9)
            int r6 = bt(r6)
            int r6 = r6 + r3
            r5.al(r8, r6, r9)
            boolean r6 = r5.L()
            if (r6 == 0) goto L70
            int r6 = r5.at()
            int r9 = r6 + (-1)
        L70:
            android.view.View r6 = r5.aF(r9)
            goto La3
        L75:
            int r6 = bt(r6)
            int r7 = r5.av()
            int r7 = r7 + r3
            if (r6 != r7) goto L81
            return r0
        L81:
            int r6 = r5.at()
            int r6 = r6 + r3
            android.view.View r6 = r5.aF(r6)
            int r6 = bt(r6)
            int r6 = r6 + r2
            r5.al(r8, r6, r3)
            boolean r6 = r5.L()
            if (r6 == 0) goto L99
            goto L9f
        L99:
            int r6 = r5.at()
            int r9 = r6 + (-1)
        L9f:
            android.view.View r6 = r5.aF(r9)
        La3:
            return r6
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.j(android.view.View, int, od, ol):android.view.View");
    }

    public final int k() {
        return this.j.b;
    }

    public final int l() {
        return this.j.a();
    }

    @Override // defpackage.nw
    public final void o(od odVar, ol olVar) {
        boolean z;
        ajfi c;
        ajfh a;
        ajfi a2;
        ajfh c2;
        float f;
        int i;
        int max;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (olVar.a() > 0 && T() > brg.a) {
            boolean L = L();
            int i9 = 1;
            if (this.d == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bK(odVar);
            }
            ajfj ajfjVar = this.d;
            boolean L2 = L();
            if (L2) {
                c = ajfjVar.a();
            } else {
                c = ajfjVar.c();
            }
            if (L2) {
                a = c.c();
            } else {
                a = c.a();
            }
            float W = W() - N(a.a, c.a / 2.0f);
            ajfj ajfjVar2 = this.d;
            boolean L3 = L();
            if (L3) {
                a2 = ajfjVar2.c();
            } else {
                a2 = ajfjVar2.a();
            }
            if (L3) {
                c2 = a2.a();
            } else {
                c2 = a2.c();
            }
            float a3 = (olVar.a() - 1) * a2.a;
            if (true != L3) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            float W2 = c2.a - W();
            if (true != L3) {
                i = 1;
            } else {
                i = -1;
            }
            int i10 = (int) (((a3 * f) - W2) + ((i * c2.d) / 2.0f));
            if (L3) {
                max = Math.min(0, i10);
            } else {
                max = Math.max(0, i10);
            }
            int i11 = (int) W;
            if (true != L) {
                i2 = i11;
            } else {
                i2 = max;
            }
            this.b = i2;
            if (true == L) {
                max = i11;
            }
            this.c = max;
            if (z) {
                this.a = i11;
                ajfj ajfjVar3 = this.d;
                int av = av();
                int i12 = this.b;
                int i13 = this.c;
                boolean L4 = L();
                float f2 = ajfjVar3.a.a;
                HashMap hashMap = new HashMap();
                int i14 = 0;
                int i15 = 0;
                while (i14 < av) {
                    if (L4) {
                        i6 = (av - i14) - 1;
                        i5 = i9;
                    } else {
                        i5 = i8;
                        i6 = i14;
                    }
                    float f3 = i6 * f2;
                    if (i9 != i5) {
                        i7 = i9;
                    } else {
                        i7 = -1;
                    }
                    if (f3 * i7 > i13 - ajfjVar3.e || i14 >= av - ajfjVar3.c.size()) {
                        hashMap.put(Integer.valueOf(i6), (ajfi) ajfjVar3.c.get(dze.c(i15, 0, r4.size() - 1)));
                        i15++;
                    }
                    i14++;
                    i8 = 0;
                    i9 = 1;
                }
                int i16 = 0;
                for (int i17 = av - 1; i17 >= 0; i17--) {
                    if (L4) {
                        i3 = (av - i17) - 1;
                        z2 = true;
                    } else {
                        i3 = i17;
                        z2 = false;
                    }
                    float f4 = i3 * f2;
                    if (true != z2) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    if (f4 * i4 < i12 + ajfjVar3.d || i17 < ajfjVar3.b.size()) {
                        hashMap.put(Integer.valueOf(i3), (ajfi) ajfjVar3.b.get(dze.c(i16, 0, r6.size() - 1)));
                        i16++;
                    }
                }
                this.i = hashMap;
                int i18 = this.m;
                if (i18 != -1) {
                    this.a = X(i18, af(i18));
                }
            }
            int i19 = this.a;
            this.a = i19 + S(0, i19, this.b, this.c);
            this.h = dze.c(this.h, 0, olVar.a());
            bL(this.d);
            aM(odVar);
            bJ(odVar, olVar);
            this.l = av();
            return;
        }
        aX(odVar);
        this.h = 0;
    }

    @Override // defpackage.nw
    public final void p(ol olVar) {
        if (at() == 0) {
            this.h = 0;
        } else {
            this.h = bt(aF(0));
        }
    }

    public final int r() {
        return this.j.b();
    }

    public final int s() {
        return this.j.c();
    }

    public final int w() {
        return this.j.e();
    }

    @Override // defpackage.nw
    public final void x(int i, int i2) {
        bM();
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new ajfb();
        this.h = 0;
        this.k = new fyc(this, 19);
        this.m = -1;
        this.n = 0;
        J(new ajfl());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajfm.a);
            this.n = obtainStyledAttributes.getInt(0, 0);
            I();
            K(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
