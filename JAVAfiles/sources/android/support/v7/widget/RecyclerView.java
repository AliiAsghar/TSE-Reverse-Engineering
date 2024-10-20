package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a;
import defpackage.bo;
import defpackage.brg;
import defpackage.ecw;
import defpackage.ecx;
import defpackage.edc;
import defpackage.edd;
import defpackage.eec;
import defpackage.eef;
import defpackage.eek;
import defpackage.een;
import defpackage.ego;
import defpackage.egr;
import defpackage.fvq;
import defpackage.gw;
import defpackage.kg;
import defpackage.lp;
import defpackage.mk;
import defpackage.mn;
import defpackage.mo;
import defpackage.ni;
import defpackage.no;
import defpackage.nq;
import defpackage.ns;
import defpackage.nt;
import defpackage.nw;
import defpackage.nx;
import defpackage.ny;
import defpackage.nz;
import defpackage.oa;
import defpackage.ob;
import defpackage.oc;
import defpackage.od;
import defpackage.of;
import defpackage.oh;
import defpackage.ok;
import defpackage.ol;
import defpackage.om;
import defpackage.on;
import defpackage.oo;
import defpackage.oq;
import defpackage.pg;
import defpackage.qdq;
import defpackage.qg;
import defpackage.qr;
import defpackage.vl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements edc {
    public static final /* synthetic */ int aa = 0;
    private static final Class[] ad;
    public static final Interpolator c;
    static final om d;
    public EdgeEffect A;
    public EdgeEffect B;
    public nt C;
    public int D;
    public int E;
    public nz F;
    public final int G;
    public float H;
    public float I;
    public final on J;
    public mo K;
    public mn L;
    public final ol M;
    public boolean N;
    public boolean O;
    public boolean P;
    public oq Q;
    public final int[] R;
    final List S;
    boolean T;
    ecw U;
    public ni V;
    public final fvq W;
    private final int[] aA;
    private final int[] aB;
    private Runnable aC;
    private boolean aD;
    private int aE;
    private int aF;
    private final ecx aG;
    private nq aH;
    private qdq aI;
    private final qdq aJ;
    private final float ae;
    private final of af;
    private final Rect ag;
    private final ArrayList ah;
    private oa ai;
    private int aj;
    private boolean ak;
    private int al;
    private final AccessibilityManager am;
    private int an;
    private int ao;
    private int ap;
    private VelocityTracker aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private final int av;
    private boolean aw;
    private List ax;
    private final int[] ay;
    private edd az;
    public final od e;
    public oh f;
    public lp g;
    public boolean h;
    public final Runnable i;
    public final Rect j;
    public final RectF k;
    public no l;
    public nw m;
    public final List n;
    public final ArrayList o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public List v;
    public boolean w;
    boolean x;
    public EdgeEffect y;
    public EdgeEffect z;
    private static final int[] ab = {R.attr.nestedScrollingEnabled};
    private static final float ac = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        ad = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new qr(1);
        d = new om();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void N(View view, Rect rect) {
        nx nxVar = (nx) view.getLayoutParams();
        Rect rect2 = nxVar.d;
        rect.set((view.getLeft() - rect2.left) - nxVar.leftMargin, (view.getTop() - rect2.top) - nxVar.topMargin, view.getRight() + rect2.right + nxVar.rightMargin, view.getBottom() + rect2.bottom + nxVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.y;
        float f2 = brg.a;
        if (edgeEffect != null && eef.d(edgeEffect) != brg.a) {
            if (canScrollHorizontally(-1)) {
                this.y.onRelease();
            } else {
                float f3 = -eef.e(this.y, -width, 1.0f - height);
                if (eef.d(this.y) == brg.a) {
                    this.y.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.A;
            if (edgeEffect2 != null && eef.d(edgeEffect2) != brg.a) {
                if (canScrollHorizontally(1)) {
                    this.A.onRelease();
                } else {
                    float e = eef.e(this.A, width, height);
                    if (eef.d(this.A) == brg.a) {
                        this.A.onRelease();
                    }
                    f2 = e;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    public static final int aB(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && eef.d(edgeEffect) != brg.a) {
            int round = Math.round(((-i2) / 4.0f) * eef.e(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i < 0 && edgeEffect2 != null && eef.d(edgeEffect2) != brg.a) {
            float f = i2;
            int round2 = Math.round((f / 4.0f) * eef.e(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
        return i;
    }

    public static final long aC() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int aN(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.z;
        float f2 = brg.a;
        if (edgeEffect != null && eef.d(edgeEffect) != brg.a) {
            if (canScrollVertically(-1)) {
                this.z.onRelease();
            } else {
                float f3 = -eef.e(this.z, -height, width);
                if (eef.d(this.z) == brg.a) {
                    this.z.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.B;
            if (edgeEffect2 != null && eef.d(edgeEffect2) != brg.a) {
                if (canScrollVertically(1)) {
                    this.B.onRelease();
                } else {
                    float e = eef.e(this.B, height, 1.0f - width);
                    if (eef.d(this.B) == brg.a) {
                        this.B.onRelease();
                    }
                    f2 = e;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    private final edd aO() {
        if (this.az == null) {
            this.az = new edd(this);
        }
        return this.az;
    }

    private final void aP() {
        aY();
        al(0);
    }

    private final void aQ() {
        View view;
        long j;
        int a2;
        qg qgVar;
        View n;
        boolean z = true;
        this.M.b(1);
        M(this.M);
        this.M.i = false;
        ap();
        this.W.x();
        T();
        aU();
        oo ooVar = null;
        if (this.aw && hasFocus() && this.l != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (n = n(view)) != null) {
            ooVar = j(n);
        }
        if (ooVar == null) {
            aX();
        } else {
            ol olVar = this.M;
            if (this.l.a) {
                j = ooVar.e;
            } else {
                j = -1;
            }
            olVar.m = j;
            if (this.w) {
                a2 = -1;
            } else if (ooVar.v()) {
                a2 = ooVar.d;
            } else {
                a2 = ooVar.a();
            }
            olVar.l = a2;
            ol olVar2 = this.M;
            View view2 = ooVar.a;
            int id = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id = view2.getId();
                }
            }
            olVar2.n = id;
        }
        ol olVar3 = this.M;
        if (!olVar3.j || !this.O) {
            z = false;
        }
        olVar3.h = z;
        this.O = false;
        this.N = false;
        olVar3.g = olVar3.k;
        olVar3.e = this.l.b();
        aS(this.ay);
        if (this.M.j) {
            int a3 = this.g.a();
            for (int i = 0; i < a3; i++) {
                oo k = k(this.g.d(i));
                if (!k.A() && (!k.t() || this.l.a)) {
                    this.W.w(k, this.C.d(this.M, k, nt.a(k), k.gf()));
                    if (this.M.h && k.y() && !k.v() && !k.A() && !k.t()) {
                        this.W.u(f(k), k);
                    }
                }
            }
        }
        if (this.M.k) {
            int b2 = this.g.b();
            for (int i2 = 0; i2 < b2; i2++) {
                oo k2 = k(this.g.e(i2));
                if (!k2.A() && k2.d == -1) {
                    k2.d = k2.c;
                }
            }
            ol olVar4 = this.M;
            boolean z2 = olVar4.f;
            olVar4.f = false;
            this.m.o(this.e, olVar4);
            this.M.f = z2;
            for (int i3 = 0; i3 < this.g.a(); i3++) {
                oo k3 = k(this.g.d(i3));
                if (!k3.A() && ((qgVar = (qg) ((vl) this.W.b).get(k3)) == null || (qgVar.b & 4) == 0)) {
                    int a4 = nt.a(k3);
                    boolean q = k3.q(8192);
                    if (!q) {
                        a4 |= 4096;
                    }
                    ns d2 = this.C.d(this.M, k3, a4, k3.gf());
                    if (q) {
                        Z(k3, d2);
                    } else {
                        fvq fvqVar = this.W;
                        qg qgVar2 = (qg) ((vl) fvqVar.b).get(k3);
                        if (qgVar2 == null) {
                            Object obj = fvqVar.b;
                            qgVar2 = qg.a();
                            ((vl) obj).put(k3, qgVar2);
                        }
                        qgVar2.b |= 2;
                        qgVar2.c = d2;
                    }
                }
            }
            z();
        } else {
            z();
        }
        U();
        aq(false);
        this.M.d = 2;
    }

    private final void aR() {
        boolean z;
        ap();
        T();
        this.M.b(6);
        this.V.e();
        int b2 = this.l.b();
        ol olVar = this.M;
        olVar.e = b2;
        olVar.c = 0;
        if (this.f != null && this.l.B()) {
            Parcelable parcelable = this.f.a;
            if (parcelable != null) {
                this.m.aa(parcelable);
            }
            this.f = null;
        }
        ol olVar2 = this.M;
        olVar2.g = false;
        this.m.o(this.e, olVar2);
        ol olVar3 = this.M;
        olVar3.f = false;
        if (olVar3.j && this.C != null) {
            z = true;
        } else {
            z = false;
        }
        olVar3.j = z;
        olVar3.d = 4;
        U();
        aq(false);
    }

    private final void aS(int[] iArr) {
        int a2 = this.g.a();
        if (a2 != 0) {
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < a2; i3++) {
                oo k = k(this.g.d(i3));
                if (!k.A()) {
                    int ge = k.ge();
                    if (ge < i2) {
                        i2 = ge;
                    }
                    if (ge > i) {
                        i = ge;
                    }
                }
            }
            iArr[0] = i2;
            iArr[1] = i;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    private final void aT(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ap) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.ap = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.at = x;
            this.ar = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.au = y;
            this.as = y;
        }
    }

    private final void aU() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.w) {
            this.V.j();
            if (this.x) {
                this.m.y();
            }
        }
        if (bc()) {
            this.V.g();
        } else {
            this.V.e();
        }
        boolean z4 = true;
        if (!this.N && !this.O) {
            z = false;
        } else {
            z = true;
        }
        ol olVar = this.M;
        if (this.r && this.C != null && (((z3 = this.w) || z || this.m.w) && (!z3 || this.l.a))) {
            z2 = true;
        } else {
            z2 = false;
        }
        olVar.j = z2;
        if (!z2 || !z || this.w || !bc()) {
            z4 = false;
        }
        olVar.k = z4;
    }

    private final void aV() {
        boolean z;
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.y.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.z;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.B.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private final void aW(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof nx) {
            nx nxVar = (nx) layoutParams;
            if (!nxVar.e) {
                Rect rect = nxVar.d;
                this.j.left -= rect.left;
                this.j.right += rect.right;
                this.j.top -= rect.top;
                this.j.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        } else {
            view2 = null;
        }
        nw nwVar = this.m;
        Rect rect2 = this.j;
        boolean z2 = !this.r;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        nwVar.bn(this, view, rect2, z2, z);
    }

    private final void aX() {
        ol olVar = this.M;
        olVar.m = -1L;
        olVar.l = -1;
        olVar.n = -1;
    }

    private final void aY() {
        VelocityTracker velocityTracker = this.aq;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        ar(0);
        aV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aZ(int i) {
        boolean ag = this.m.ag();
        int i2 = ag;
        if (this.m.ah()) {
            i2 = (ag ? 1 : 0) | 2;
        }
        aI(i2, i);
    }

    private final void ba() {
        ok okVar;
        this.J.d();
        nw nwVar = this.m;
        if (nwVar != null && (okVar = nwVar.v) != null) {
            okVar.o();
        }
    }

    private final boolean bb(MotionEvent motionEvent) {
        ArrayList arrayList = this.ah;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oa oaVar = (oa) this.ah.get(i);
            if (oaVar.k(this, motionEvent) && action != 3) {
                this.ai = oaVar;
                return true;
            }
        }
        return false;
    }

    private final boolean bc() {
        if (this.C != null && this.m.v()) {
            return true;
        }
        return false;
    }

    private final boolean bd(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float d2 = eef.d(edgeEffect) * i2;
        double log = Math.log((Math.abs(-i) * 0.35f) / (this.ae * 0.015f));
        double d3 = ac;
        if (((float) (this.ae * 0.015f * Math.exp((d3 / ((-1.0d) + d3)) * log))) < d2) {
            return true;
        }
        return false;
    }

    private final void be(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(nw.class);
                    try {
                        constructor = asSubclass.getConstructor(ad);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(a.cf(trim, attributeSet, ": Error creating LayoutManager "), e2);
                        }
                    }
                    constructor.setAccessible(true);
                    aj((nw) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(a.cf(trim, attributeSet, ": Class is not a LayoutManager "), e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(a.cf(trim, attributeSet, ": Unable to find LayoutManager "), e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(a.cf(trim, attributeSet, ": Cannot access non-public constructor "), e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(a.cf(trim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(a.cf(trim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
                }
            }
        }
    }

    public static oo k(View view) {
        if (view == null) {
            return null;
        }
        return ((nx) view.getLayoutParams()).c;
    }

    public static RecyclerView l(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView l = l(viewGroup.getChildAt(i));
                if (l != null) {
                    return l;
                }
            }
            return null;
        }
        return null;
    }

    public static void y(oo ooVar) {
        WeakReference weakReference = ooVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != ooVar.a) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            ooVar.b = null;
        }
    }

    public final void A() {
        List list = this.ax;
        if (list != null) {
            list.clear();
        }
    }

    public final void B(int i, int i2) {
        EdgeEffect edgeEffect = this.y;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.y.onRelease();
            z = this.y.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.z.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void D(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = eek.a;
        setMeasuredDimension(nw.as(i, paddingLeft, getMinimumWidth()), nw.as(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f2, code lost:
    
        if (r16.g.k(getFocusedChild()) != false) goto L370;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void F() {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.F():void");
    }

    public final void G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aO().g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void H(int i, int i2) {
        this.ao++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.ax;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((nq) this.ax.get(size)).dG(this, i, i2);
                }
            }
        }
        this.ao--;
    }

    public final void I() {
        if (this.B != null) {
            return;
        }
        EdgeEffect n = this.aH.n(this);
        this.B = n;
        if (this.h) {
            n.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            n.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void J() {
        if (this.y != null) {
            return;
        }
        EdgeEffect n = this.aH.n(this);
        this.y = n;
        if (this.h) {
            n.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            n.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void K() {
        if (this.A != null) {
            return;
        }
        EdgeEffect n = this.aH.n(this);
        this.A = n;
        if (this.h) {
            n.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            n.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void L() {
        if (this.z != null) {
            return;
        }
        EdgeEffect n = this.aH.n(this);
        this.z = n;
        if (this.h) {
            n.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            n.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void M(ol olVar) {
        if (this.D == 2) {
            OverScroller overScroller = this.J.a;
            olVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            olVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            olVar.o = 0;
            olVar.p = 0;
        }
    }

    final void O() {
        this.B = null;
        this.z = null;
        this.A = null;
        this.y = null;
    }

    public final void P() {
        if (this.o.size() == 0) {
            return;
        }
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.V("Cannot invalidate item decorations during a scroll or layout");
        }
        R();
        requestLayout();
    }

    public final void Q(int i) {
        if (this.m == null) {
            return;
        }
        al(2);
        this.m.ac(i);
        awakenScrollBars();
    }

    final void R() {
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            ((nx) this.g.e(i).getLayoutParams()).e = true;
        }
        od odVar = this.e;
        int size = odVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            nx nxVar = (nx) ((oo) odVar.c.get(i2)).a.getLayoutParams();
            if (nxVar != null) {
                nxVar.e = true;
            }
        }
    }

    public final void S(int i, int i2, boolean z) {
        int i3;
        int b2 = this.g.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= b2) {
                break;
            }
            oo k = k(this.g.e(i4));
            if (k != null && !k.A()) {
                int i5 = k.c;
                if (i5 >= i3) {
                    k.k(-i2, z);
                    this.M.f = true;
                } else if (i5 >= i) {
                    k.f(8);
                    k.k(-i2, z);
                    k.c = i - 1;
                    this.M.f = true;
                }
            }
            i4++;
        }
        od odVar = this.e;
        int size = odVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                oo ooVar = (oo) odVar.c.get(size);
                if (ooVar != null) {
                    int i6 = ooVar.c;
                    if (i6 >= i3) {
                        ooVar.k(-i2, z);
                    } else if (i6 >= i) {
                        ooVar.f(8);
                        odVar.k(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void T() {
        this.an++;
    }

    final void U() {
        V(true);
    }

    public final void V(boolean z) {
        int i;
        int i2 = this.an - 1;
        this.an = i2;
        if (i2 <= 0) {
            this.an = 0;
            if (z) {
                int i3 = this.al;
                this.al = 0;
                if (i3 != 0 && ay()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.S.size() - 1; size >= 0; size--) {
                    oo ooVar = (oo) this.S.get(size);
                    if (ooVar.a.getParent() == this && !ooVar.A() && (i = ooVar.p) != -1) {
                        ooVar.a.setImportantForAccessibility(i);
                        ooVar.p = -1;
                    }
                }
                this.S.clear();
            }
        }
    }

    public final void X() {
        if (!this.P && this.p) {
            Runnable runnable = this.aC;
            int[] iArr = eek.a;
            postOnAnimation(runnable);
            this.P = true;
        }
    }

    public final void Y(boolean z) {
        this.x = z | this.x;
        this.w = true;
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            oo k = k(this.g.e(i));
            if (k != null && !k.A()) {
                k.f(6);
            }
        }
        R();
        od odVar = this.e;
        int size = odVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            oo ooVar = (oo) odVar.c.get(i2);
            if (ooVar != null) {
                ooVar.f(6);
                ooVar.e(null);
            }
        }
        no noVar = odVar.h.l;
        if (noVar != null && noVar.a) {
            return;
        }
        odVar.j();
    }

    public final void Z(oo ooVar, ns nsVar) {
        ooVar.m(0, 8192);
        if (this.M.h && ooVar.y() && !ooVar.v() && !ooVar.A()) {
            this.W.u(f(ooVar), ooVar);
        }
        this.W.w(ooVar, nsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:
    
        if (r3 == defpackage.brg.a) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean aA(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aA(int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r13 != 0) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aD(int r12, int r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            nw r0 = r11.m
            if (r0 != 0) goto Lc
            java.lang.String r12 = "RecyclerView"
            java.lang.String r13 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r12, r13)
            return
        Lc:
            boolean r1 = r11.t
            if (r1 == 0) goto L11
            return
        L11:
            int[] r1 = r11.R
            r2 = 0
            r1[r2] = r2
            r3 = 1
            r1[r3] = r2
            boolean r0 = r0.ag()
            nw r1 = r11.m
            boolean r1 = r1.ah()
            if (r1 == 0) goto L28
            r4 = r0 | 2
            goto L29
        L28:
            r4 = r0
        L29:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r14 != 0) goto L34
            int r6 = r11.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r5
            goto L38
        L34:
            float r6 = r14.getY()
        L38:
            if (r14 != 0) goto L41
            int r7 = r11.getWidth()
            float r7 = (float) r7
            float r7 = r7 / r5
            goto L45
        L41:
            float r7 = r14.getX()
        L45:
            int r5 = r11.a(r12, r6)
            int r12 = r12 - r5
            int r5 = r11.aN(r13, r7)
            int r13 = r13 - r5
            r11.aI(r4, r3)
            if (r3 == r0) goto L56
            r6 = r2
            goto L57
        L56:
            r6 = r12
        L57:
            if (r3 == r1) goto L5b
            r7 = r2
            goto L5c
        L5b:
            r7 = r13
        L5c:
            int[] r8 = r11.R
            int[] r9 = r11.aA
            r10 = 1
            r5 = r11
            boolean r4 = r5.au(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L70
            int[] r4 = r11.R
            r5 = r4[r2]
            int r12 = r12 - r5
            r4 = r4[r3]
            int r13 = r13 - r4
        L70:
            if (r3 == r0) goto L74
            r0 = r2
            goto L75
        L74:
            r0 = r12
        L75:
            if (r3 == r1) goto L79
            r1 = r2
            goto L7a
        L79:
            r1 = r13
        L7a:
            r11.aA(r0, r1, r14, r3)
            mo r14 = r11.K
            if (r14 == 0) goto L8a
            if (r12 != 0) goto L86
            if (r13 == 0) goto L8a
            goto L87
        L86:
            r2 = r12
        L87:
            r14.a(r11, r2, r13)
        L8a:
            r11.ar(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aD(int, int, android.view.MotionEvent):void");
    }

    public final void aE(oo ooVar, int i) {
        if (az()) {
            ooVar.p = i;
            this.S.add(ooVar);
        } else {
            ooVar.a.setImportantForAccessibility(i);
        }
    }

    public final void aF() {
        this.q = true;
    }

    public final void aG(int i, int i2, Interpolator interpolator) {
        aH(i, i2, interpolator, false);
    }

    public final void aH(int i, int i2, Interpolator interpolator, boolean z) {
        nw nwVar = this.m;
        if (nwVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.t) {
            int i3 = 0;
            if (true != nwVar.ag()) {
                i = 0;
            }
            if (true != this.m.ah()) {
                i2 = 0;
            }
            if (i == 0) {
                if (i2 != 0) {
                    i = 0;
                } else {
                    return;
                }
            }
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                aI(i3, 1);
            }
            this.J.c(i, i2, Integer.MIN_VALUE, interpolator);
        }
    }

    public final void aI(int i, int i2) {
        aO().i(i, i2);
    }

    public final void aJ(nq nqVar) {
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.V("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(nqVar);
        R();
        requestLayout();
    }

    public final void aK(nq nqVar) {
        boolean z;
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.V("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(nqVar);
        if (this.o.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        R();
        requestLayout();
    }

    public final void aL(nq nqVar) {
        if (this.ax == null) {
            this.ax = new ArrayList();
        }
        this.ax.add(nqVar);
    }

    public final void aM(nq nqVar) {
        List list = this.ax;
        if (list != null) {
            list.remove(nqVar);
        }
    }

    public final void aa() {
        nt ntVar = this.C;
        if (ntVar != null) {
            ntVar.h();
        }
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.aX(this.e);
            this.m.aY(this.e);
        }
        this.e.e();
    }

    public final void ab(int i) {
        int fX = fX();
        if (i >= 0 && i < fX) {
            int fX2 = fX();
            if (i < fX2) {
                aK((nq) this.o.get(i));
                return;
            }
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + fX2);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + fX);
    }

    public final void ac(oa oaVar) {
        this.ah.remove(oaVar);
        if (this.ai == oaVar) {
            this.ai = null;
        }
    }

    public final void ad(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        oo ooVar;
        ap();
        T();
        Trace.beginSection("RV Scroll");
        M(this.M);
        if (i != 0) {
            i3 = this.m.d(i, this.e, this.M);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.m.e(i2, this.e, this.M);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        int a2 = this.g.a();
        for (int i5 = 0; i5 < a2; i5++) {
            View d2 = this.g.d(i5);
            oo j = j(d2);
            if (j != null && (ooVar = j.i) != null) {
                int left = d2.getLeft();
                int top = d2.getTop();
                View view = ooVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U();
        aq(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public void ae(int i) {
        if (this.t) {
            return;
        }
        as();
        nw nwVar = this.m;
        if (nwVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nwVar.ac(i);
            awakenScrollBars();
        }
    }

    public final void af(oq oqVar) {
        this.Q = oqVar;
        eek.n(this, oqVar);
    }

    public void ag(no noVar) {
        suppressLayout(false);
        no noVar2 = this.l;
        if (noVar2 != null) {
            noVar2.E(this.af);
            this.l.gK(this);
        }
        aa();
        this.V.j();
        no noVar3 = this.l;
        this.l = noVar;
        if (noVar != null) {
            noVar.D(this.af);
            noVar.gJ(this);
        }
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.bA();
        }
        od odVar = this.e;
        no noVar4 = this.l;
        odVar.e();
        odVar.h(noVar3, true);
        oc b2 = odVar.b();
        if (noVar3 != null) {
            b2.d();
        }
        if (b2.b == 0) {
            for (int i = 0; i < b2.a.size(); i++) {
                ob obVar = (ob) b2.a.valueAt(i);
                ArrayList arrayList = obVar.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ego.b(((oo) arrayList.get(i2)).a);
                }
                obVar.a.clear();
            }
        }
        if (noVar4 != null) {
            b2.c();
        }
        odVar.f();
        this.M.f = true;
        Y(false);
        requestLayout();
    }

    public final void ah(nt ntVar) {
        nt ntVar2 = this.C;
        if (ntVar2 != null) {
            ntVar2.h();
            this.C.d = null;
        }
        this.C = ntVar;
        if (ntVar != null) {
            ntVar.d = this.aI;
        }
    }

    public final void ai(int i) {
        od odVar = this.e;
        odVar.e = i;
        odVar.p();
    }

    public void aj(nw nwVar) {
        if (nwVar == this.m) {
            return;
        }
        as();
        if (this.m != null) {
            nt ntVar = this.C;
            if (ntVar != null) {
                ntVar.h();
            }
            this.m.aX(this.e);
            this.m.aY(this.e);
            this.e.e();
            if (this.p) {
                this.m.aP(this, this.e);
            }
            this.m.bi(null);
            this.m = null;
        } else {
            this.e.e();
        }
        lp lpVar = this.g;
        lpVar.a.d();
        int size = lpVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lpVar.e.X((View) lpVar.b.get(size));
            lpVar.b.remove(size);
        }
        qdq qdqVar = lpVar.e;
        int U = qdqVar.U();
        for (int i = 0; i < U; i++) {
            View W = qdqVar.W(i);
            ((RecyclerView) qdqVar.a).fg(W);
            W.clearAnimation();
        }
        ((RecyclerView) qdqVar.a).removeAllViews();
        this.m = nwVar;
        if (nwVar != null) {
            if (nwVar.u == null) {
                this.m.bi(this);
                if (this.p) {
                    this.m.aO(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + nwVar + " is already attached to a RecyclerView:" + nwVar.u.o());
            }
        }
        this.e.p();
        requestLayout();
    }

    public final void ak(oc ocVar) {
        od odVar = this.e;
        odVar.g(odVar.h.l);
        oc ocVar2 = odVar.g;
        if (ocVar2 != null) {
            ocVar2.d();
        }
        odVar.g = ocVar;
        oc ocVar3 = odVar.g;
        if (ocVar3 != null && odVar.h.l != null) {
            ocVar3.c();
        }
        odVar.f();
    }

    public final void al(int i) {
        if (i != this.D) {
            this.D = i;
            if (i != 2) {
                ba();
            }
            nw nwVar = this.m;
            if (nwVar != null) {
                nwVar.aV(i);
            }
            W(i);
            List list = this.ax;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((nq) this.ax.get(size)).t(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void am(int i, int i2) {
        an(i, i2, null);
    }

    public void an(int i, int i2, Interpolator interpolator) {
        aG(i, i2, null);
    }

    public void ao(int i) {
        if (this.t) {
            return;
        }
        nw nwVar = this.m;
        if (nwVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nwVar.ar(this, i);
        }
    }

    public final void ap() {
        int i = this.aj + 1;
        this.aj = i;
        if (i == 1 && !this.t) {
            this.s = false;
        }
    }

    public final void aq(boolean z) {
        int i = this.aj;
        if (i <= 0) {
            this.aj = 1;
            i = 1;
        }
        if (!z && !this.t) {
            this.s = false;
        }
        if (i == 1) {
            if (z && this.s && !this.t && this.m != null && this.l != null) {
                F();
            }
            if (!this.t) {
                this.s = false;
            }
        }
        this.aj--;
    }

    public final void ar(int i) {
        aO().b(i);
    }

    public final void as() {
        al(0);
        ba();
    }

    public final boolean au(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aO().e(i, i2, iArr, iArr2, i3);
    }

    public final boolean av(int i, int i2) {
        return aw(i, i2, this.G, this.av);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aw(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aw(int, int, int, int):boolean");
    }

    public final boolean ax() {
        if (this.r && !this.w && !this.V.l()) {
            return false;
        }
        return true;
    }

    public final boolean ay() {
        AccessibilityManager accessibilityManager = this.am;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean az() {
        if (this.an > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof nx) && this.m.t((nx) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        nw nwVar = this.m;
        if (nwVar != null && nwVar.ag()) {
            return this.m.C(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        nw nwVar = this.m;
        if (nwVar != null && nwVar.ag()) {
            return this.m.D(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        nw nwVar = this.m;
        if (nwVar != null && nwVar.ag()) {
            return this.m.E(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        nw nwVar = this.m;
        if (nwVar != null && nwVar.ah()) {
            return this.m.F(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        nw nwVar = this.m;
        if (nwVar != null && nwVar.ah()) {
            return this.m.G(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        nw nwVar = this.m;
        if (nwVar != null && nwVar.ah()) {
            return this.m.H(this.M);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        nw nwVar = this.m;
        int i = 0;
        if (nwVar == null) {
            return false;
        }
        if (nwVar.ah()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 92 && keyCode != 93) {
                if (keyCode == 122 || keyCode == 123) {
                    boolean ak = nwVar.ak();
                    if (keyCode == 122) {
                        if (ak) {
                            i = this.l.b();
                        }
                    } else if (!ak) {
                        i = this.l.b();
                    }
                    ao(i);
                    return true;
                }
            } else {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    aG(0, measuredHeight, null);
                } else {
                    aG(0, -measuredHeight, null);
                }
                return true;
            }
        } else if (nwVar.ag()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 92 && keyCode2 != 93) {
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean ak2 = nwVar.ak();
                    if (keyCode2 == 122) {
                        if (ak2) {
                            i = this.l.b();
                        }
                    } else if (!ak2) {
                        i = this.l.b();
                    }
                    ao(i);
                    return true;
                }
            } else {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    aG(measuredWidth, 0, null);
                } else {
                    aG(-measuredWidth, 0, null);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aO().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aO().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aO().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aO().f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.o.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((nq) this.o.get(i3)).l(canvas, this);
        }
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.h) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, brg.a);
            EdgeEffect edgeEffect2 = this.y;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.z;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.A;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.h) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.A;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.B;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.B;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (!z && (this.C == null || this.o.size() <= 0 || !this.C.p())) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final long f(oo ooVar) {
        if (this.l.a) {
            return ooVar.e;
        }
        return ooVar.c;
    }

    public final int fU(oo ooVar) {
        if (ooVar.q(524) || !ooVar.s()) {
            return -1;
        }
        ni niVar = this.V;
        int i = ooVar.c;
        int size = ((ArrayList) niVar.e).size();
        for (int i2 = 0; i2 < size; i2++) {
            kg kgVar = (kg) ((ArrayList) niVar.e).get(i2);
            int i3 = kgVar.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = kgVar.b;
                        if (i4 == i) {
                            i = kgVar.d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (kgVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = kgVar.b;
                    if (i5 <= i) {
                        int i6 = kgVar.d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (kgVar.b <= i) {
                i += kgVar.d;
            }
        }
        return i;
    }

    public final int fV(View view) {
        oo k = k(view);
        if (k != null) {
            return k.a();
        }
        return -1;
    }

    public final int fW(View view) {
        oo k = k(view);
        if (k != null) {
            return k.ge();
        }
        return -1;
    }

    public final int fX() {
        return this.o.size();
    }

    public final Rect fY(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        if (!nxVar.e) {
            return nxVar.d;
        }
        if (this.M.g && (nxVar.b() || nxVar.c.t())) {
            return nxVar.d;
        }
        Rect rect = nxVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.j.set(0, 0, 0, 0);
            ((nq) this.o.get(i)).a(this.j, view, this, this.M);
            rect.left += this.j.left;
            rect.top += this.j.top;
            rect.right += this.j.right;
            rect.bottom += this.j.bottom;
        }
        nxVar.e = false;
        return rect;
    }

    public final void ff() {
        if (this.r && !this.w) {
            if (this.V.l()) {
                if (this.V.k(4) && !this.V.k(11)) {
                    Trace.beginSection("RV PartialInvalidate");
                    ap();
                    T();
                    this.V.g();
                    if (!this.s) {
                        int a2 = this.g.a();
                        int i = 0;
                        while (true) {
                            if (i < a2) {
                                oo k = k(this.g.d(i));
                                if (k != null && !k.A() && k.y()) {
                                    F();
                                    break;
                                }
                                i++;
                            } else {
                                this.V.d();
                                break;
                            }
                        }
                    }
                    aq(true);
                    U();
                    Trace.endSection();
                    return;
                }
                if (this.V.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    F();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        F();
        Trace.endSection();
    }

    public final void fg(View view) {
        oo k = k(view);
        no noVar = this.l;
        if (noVar != null && k != null) {
            noVar.j(k);
        }
        List list = this.v;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((ny) this.v.get(size)).d(view);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0061, code lost:
    
        if (r3.findNextFocus(r13, r14, r0) == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r3.findNextFocus(r13, r14, r0) != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        ff();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (n(r14) != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        ap();
        r13.m.j(r14, r15, r13.e, r13.M);
        aq(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r13.j.right <= r13.ag.left) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r13.j.left >= r13.ag.right) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        if (r13.j.bottom <= r13.ag.top) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0177, code lost:
    
        if (r13.j.top >= r13.ag.bottom) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
    
        if (r2 > 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ae, code lost:
    
        if (r10 > 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b1, code lost:
    
        if (r2 < 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
    
        if (r10 < 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bc, code lost:
    
        if ((r10 * r3) <= 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c4, code lost:
    
        if ((r10 * r3) >= 0) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        nw nwVar = this.m;
        if (nwVar != null) {
            return nwVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        nw nwVar = this.m;
        if (nwVar != null) {
            return nwVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.h;
    }

    public final void gh(oo ooVar) {
        View view = ooVar.a;
        ViewParent parent = view.getParent();
        this.e.o(j(view));
        if (ooVar.x()) {
            this.g.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.g.f(view, -1, true);
            return;
        }
        lp lpVar = this.g;
        int V = lpVar.e.V(view);
        if (V >= 0) {
            lpVar.a.e(V);
            lpVar.i(view);
        } else {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
    }

    public final oo h(int i) {
        oo ooVar = null;
        if (this.w) {
            return null;
        }
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            oo k = k(this.g.e(i2));
            if (k != null && !k.v() && fU(k) == i) {
                if (this.g.k(k.a)) {
                    ooVar = k;
                } else {
                    return k;
                }
            }
        }
        return ooVar;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aO().h(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oo i(int r6, boolean r7) {
        /*
            r5 = this;
            lp r0 = r5.g
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto L3a
            lp r3 = r5.g
            android.view.View r3 = r3.e(r1)
            oo r3 = k(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 != r6) goto L37
            goto L2a
        L23:
            int r4 = r3.ge()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            lp r2 = r5.g
            android.view.View r4 = r3.a
            boolean r2 = r2.k(r4)
            if (r2 == 0) goto L36
            r2 = r3
            goto L37
        L36:
            return r3
        L37:
            int r1 = r1 + 1
            goto L8
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.i(int, boolean):oo");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.t;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aO().a;
    }

    public final oo j(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException(a.cd(this, view, "View ", " is not a direct child of "));
        }
        return k(view);
    }

    public final View m(float f, float f2) {
        int a2 = this.g.a();
        while (true) {
            a2--;
            if (a2 >= 0) {
                View d2 = this.g.d(a2);
                float translationX = d2.getTranslationX();
                float translationY = d2.getTranslationY();
                if (f >= d2.getLeft() + translationX && f <= d2.getRight() + translationX && f2 >= d2.getTop() + translationY && f2 <= d2.getBottom() + translationY) {
                    return d2;
                }
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.n(android.view.View):android.view.View");
    }

    public final String o() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.an = 0;
        boolean z = true;
        this.p = true;
        if (!this.r || isLayoutRequested()) {
            z = false;
        }
        this.r = z;
        this.e.f();
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.aO(this);
        }
        this.P = false;
        if (b) {
            mo moVar = (mo) mo.a.get();
            this.K = moVar;
            if (moVar == null) {
                this.K = new mo();
                int[] iArr = eek.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                mo moVar2 = this.K;
                moVar2.e = 1.0E9f / f;
                mo.a.set(moVar2);
            }
            this.K.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        mo moVar;
        super.onDetachedFromWindow();
        nt ntVar = this.C;
        if (ntVar != null) {
            ntVar.h();
        }
        as();
        this.p = false;
        nw nwVar = this.m;
        if (nwVar != null) {
            nwVar.aP(this, this.e);
        }
        this.S.clear();
        removeCallbacks(this.aC);
        do {
        } while (qg.a.a() != null);
        od odVar = this.e;
        for (int i = 0; i < odVar.c.size(); i++) {
            ego.b(((oo) odVar.c.get(i)).a);
        }
        odVar.g(odVar.h.l);
        Iterator a2 = new een(this, 1).a();
        while (a2.hasNext()) {
            ego.c((View) a2.next()).C();
        }
        if (b && (moVar = this.K) != null) {
            moVar.c.remove(this);
            this.K = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            ((nq) this.o.get(i)).b(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            nw r0 = r10.m
            r1 = 0
            if (r0 != 0) goto L7
            goto La2
        L7:
            boolean r0 = r10.t
            if (r0 != 0) goto La2
            int r0 = r11.getAction()
            r2 = 8
            if (r0 != r2) goto La2
            int r0 = r11.getSource()
            r0 = r0 & 2
            r2 = 26
            r3 = 0
            if (r0 == 0) goto L40
            nw r0 = r10.m
            boolean r0 = r0.ah()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r11.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r3
        L2f:
            nw r4 = r10.m
            boolean r4 = r4.ag()
            if (r4 == 0) goto L3d
            r3 = 10
            float r3 = r11.getAxisValue(r3)
        L3d:
            r4 = r1
            r5 = r4
            goto L67
        L40:
            int r0 = r11.getSource()
            r4 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r4
            if (r0 == 0) goto L6b
            float r0 = r11.getAxisValue(r2)
            nw r4 = r10.m
            boolean r4 = r4.ah()
            if (r4 == 0) goto L57
            float r0 = -r0
            goto L64
        L57:
            nw r4 = r10.m
            boolean r4 = r4.ag()
            if (r4 == 0) goto L63
            r9 = r3
            r3 = r0
            r0 = r9
            goto L64
        L63:
            r0 = r3
        L64:
            boolean r4 = r10.T
            r5 = r2
        L67:
            r9 = r3
            r3 = r0
            r0 = r9
            goto L6e
        L6b:
            r4 = r1
            r5 = r4
            r0 = r3
        L6e:
            float r6 = r10.I
            float r3 = r3 * r6
            float r6 = r10.H
            float r0 = r0 * r6
            int r0 = (int) r0
            int r3 = (int) r3
            if (r4 == 0) goto L96
            on r6 = r10.J
            android.widget.OverScroller r6 = r6.a
            int r7 = r6.getFinalY()
            int r8 = r6.getCurrY()
            int r7 = r7 - r8
            int r3 = r3 + r7
            int r7 = r6.getFinalX()
            int r6 = r6.getCurrX()
            int r7 = r7 - r6
            int r0 = r0 + r7
            r6 = 0
            r7 = 1
            r10.aH(r0, r3, r6, r7)
            goto L99
        L96:
            r10.aD(r0, r3, r11)
        L99:
            if (r5 == 0) goto La2
            if (r4 != 0) goto La2
            ecw r0 = r10.U
            r0.a(r11, r2)
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        if (r0 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0191, code lost:
    
        if (r9.D != 2) goto L173;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        F();
        Trace.endSection();
        this.r = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        nw nwVar = this.m;
        if (nwVar == null) {
            D(i, i2);
            return;
        }
        boolean z = false;
        if (nwVar.ai()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m.bB(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aD = z;
            if (!z && this.l != null) {
                if (this.M.d == 1) {
                    aQ();
                }
                this.m.bf(i, i2);
                this.M.i = true;
                aR();
                this.m.bh(i, i2);
                if (this.m.am()) {
                    this.m.bf(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.M.i = true;
                    aR();
                    this.m.bh(i, i2);
                }
                this.aE = getMeasuredWidth();
                this.aF = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.q) {
            nwVar.bB(i, i2);
            return;
        }
        if (this.u) {
            ap();
            T();
            aU();
            U();
            ol olVar = this.M;
            if (olVar.k) {
                olVar.g = true;
            } else {
                this.V.e();
                this.M.g = false;
            }
            this.u = false;
            aq(false);
        } else if (this.M.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        no noVar = this.l;
        if (noVar != null) {
            this.M.e = noVar.b();
        } else {
            this.M.e = 0;
        }
        ap();
        this.m.bB(i, i2);
        aq(false);
        this.M.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (az()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oh ohVar = (oh) parcelable;
        this.f = ohVar;
        super.onRestoreInstanceState(ohVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        oh ohVar = new oh(super.onSaveInstanceState());
        oh ohVar2 = this.f;
        if (ohVar2 != null) {
            ohVar.a = ohVar2.a;
        } else {
            nw nwVar = this.m;
            if (nwVar != null) {
                parcelable = nwVar.R();
            } else {
                parcelable = null;
            }
            ohVar.a = parcelable;
        }
        return ohVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        if (r0 != 0) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        oo k = k(view);
        if (k != null) {
            if (k.x()) {
                k.j();
            } else if (!k.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + k + o());
            }
        }
        view.clearAnimation();
        fg(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.bm() && !az() && view2 != null) {
            aW(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.bn(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.ah.size();
        for (int i = 0; i < size; i++) {
            ((oa) this.ah.get(i)).d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.aj == 0 && !this.t) {
            super.requestLayout();
        } else {
            this.s = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        nw nwVar = this.m;
        if (nwVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.t) {
            boolean ag = nwVar.ag();
            boolean ah = this.m.ah();
            if (!ag) {
                if (ah) {
                    ah = true;
                } else {
                    return;
                }
            }
            if (true != ag) {
                i = 0;
            }
            if (true != ah) {
                i2 = 0;
            }
            aA(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (az()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.al |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.h) {
            O();
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.r) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aO().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aO().i(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aO().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.t) {
            x("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.t = false;
                if (this.s && this.m != null && this.l != null) {
                    requestLayout();
                }
                this.s = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, brg.a, brg.a, 0));
            this.t = true;
            this.ak = true;
            as();
        }
    }

    public final void v(ny nyVar) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(nyVar);
    }

    public final void w(oa oaVar) {
        this.ah.add(oaVar);
    }

    public final void x(String str) {
        if (az()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(o()));
            }
            throw new IllegalStateException(str);
        }
        if (this.ao > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(o())));
        }
    }

    final void z() {
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            oo k = k(this.g.e(i));
            if (!k.A()) {
                k.g();
            }
        }
        od odVar = this.e;
        int size = odVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((oo) odVar.c.get(i2)).g();
        }
        int size2 = odVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((oo) odVar.a.get(i3)).g();
        }
        ArrayList arrayList = odVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((oo) odVar.b.get(i4)).g();
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float scaledHorizontalScrollFactor;
        float scaledVerticalScrollFactor;
        this.af = new of(this);
        this.e = new od(this);
        this.W = new fvq((byte[]) null, (byte[]) null);
        this.i = new bo(this, 19, null);
        this.j = new Rect();
        this.ag = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.ah = new ArrayList();
        this.aj = 0;
        this.w = false;
        this.x = false;
        this.an = 0;
        this.ao = 0;
        this.aH = d;
        this.C = new pg(null);
        this.D = 0;
        this.ap = -1;
        this.H = Float.MIN_VALUE;
        this.I = Float.MIN_VALUE;
        this.aw = true;
        this.J = new on(this);
        this.L = b ? new mn() : null;
        this.M = new ol();
        this.N = false;
        this.O = false;
        this.aI = new qdq(this, null);
        this.P = false;
        this.ay = new int[2];
        this.aA = new int[2];
        this.aB = new int[2];
        this.R = new int[2];
        this.S = new ArrayList();
        this.aC = new bo(this, 20, null);
        this.aE = 0;
        this.aF = 0;
        this.aJ = new qdq(this, null);
        egr egrVar = new egr(this, 1);
        this.aG = egrVar;
        this.U = new ecw(getContext(), egrVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.E = viewConfiguration.getScaledTouchSlop();
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.H = scaledHorizontalScrollFactor;
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.I = scaledVerticalScrollFactor;
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.av = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ae = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.C.d = this.aI;
        this.V = new ni(new qdq(this, null));
        this.g = new lp(new qdq(this, null));
        if (eec.a(this) == 0) {
            eec.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.am = (AccessibilityManager) getContext().getSystemService("accessibility");
        af(new oq(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gw.a, i, 0);
        eek.m(this, context, gw.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                new mk(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(o()));
            }
        }
        obtainStyledAttributes.recycle();
        this.T = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        be(context, string, attributeSet, i);
        int[] iArr = ab;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        eek.m(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.google.android.apps.messaging.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        nw nwVar = this.m;
        if (nwVar != null) {
            return nwVar.bZ(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    public void W(int i) {
    }
}
