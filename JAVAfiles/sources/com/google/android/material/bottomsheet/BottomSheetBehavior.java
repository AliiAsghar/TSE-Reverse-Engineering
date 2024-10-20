package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.ajdd;
import defpackage.ajdy;
import defpackage.ajea;
import defpackage.ajeb;
import defpackage.ajec;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajen;
import defpackage.ajil;
import defpackage.ajim;
import defpackage.ajiq;
import defpackage.ajki;
import defpackage.ajkm;
import defpackage.ajkr;
import defpackage.ajlk;
import defpackage.brg;
import defpackage.dxt;
import defpackage.dxv;
import defpackage.edz;
import defpackage.eek;
import defpackage.efw;
import defpackage.ehj;
import defpackage.ehk;
import defpackage.emq;
import defpackage.qz;
import defpackage.wob;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends dxt<V> implements ajim {
    public WeakReference A;
    public WeakReference B;
    public final ArrayList C;
    public int D;
    public boolean E;
    final SparseIntArray F;
    ajil G;
    private int H;
    private float I;
    private boolean J;
    private int K;
    private int L;
    private ColorStateList M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private ajkr S;
    private boolean T;
    private final ajef U;
    private ValueAnimator V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private final float ab;
    private int ac;
    private VelocityTracker ad;
    private int ae;
    private Map af;
    private final ehj ag;
    public int b;
    public int c;
    public ajkm d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    int n;
    public int o;
    public int p;
    float q;
    public int r;
    float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public ehk x;
    int y;
    public int z;

    public BottomSheetBehavior() {
        this.H = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new ajef(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.W = true;
        this.w = 4;
        this.ab = 0.1f;
        this.C = new ArrayList();
        this.ae = -1;
        this.F = new SparseIntArray();
        this.ag = new ajea(this);
    }

    public static BottomSheetBehavior N(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof dxv) {
            dxt dxtVar = ((dxv) layoutParams).a;
            if (dxtVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) dxtVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private final float ad() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.d != null && (weakReference = this.A) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.A.get();
            if (an() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float u = this.d.u();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                float ap = ap(u, roundedCorner);
                float v = this.d.v();
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                return Math.max(ap, ap(v, roundedCorner2));
            }
            return brg.a;
        }
        return brg.a;
    }

    private final int ae() {
        int i;
        if (this.J) {
            return Math.min(Math.max(this.K, this.z - ((this.y * 9) / 16)), this.ac) + this.l;
        }
        if (!this.P && !this.f && (i = this.e) > 0) {
            return Math.max(this.c, i + this.L);
        }
        return this.c + this.l;
    }

    private final int af(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return this.p;
                }
                return this.z;
            }
            return this.r;
        }
        return L();
    }

    private final void ag() {
        int ae = ae();
        if (this.a) {
            this.r = Math.max(this.z - ae, this.o);
        } else {
            this.r = this.z - ae;
        }
    }

    private final void ah() {
        this.p = (int) (this.z * (1.0f - this.q));
    }

    private final void ai(View view, efw efwVar, int i) {
        eek.u(view, efwVar, new ajeb(this, i));
    }

    private final void aj() {
        this.D = -1;
        this.ae = -1;
        VelocityTracker velocityTracker = this.ad;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ad = null;
        }
    }

    private final void ak() {
        View view;
        int i;
        boolean z;
        WeakReference weakReference = this.A;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            eek.l(view, 524288);
            eek.l(view, 262144);
            eek.l(view, 1048576);
            int i2 = this.F.get(0, -1);
            if (i2 != -1) {
                eek.l(view, i2);
                this.F.delete(0);
            }
            int i3 = 6;
            if (!this.a && this.w != 6) {
                SparseIntArray sparseIntArray = this.F;
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                ajeb ajebVar = new ajeb(this, 6);
                List h = eek.h(view);
                int i4 = 0;
                while (true) {
                    if (i4 < h.size()) {
                        if (TextUtils.equals(string, ((efw) h.get(i4)).b())) {
                            i = ((efw) h.get(i4)).a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = -1;
                        for (int i6 = 0; i6 < 32 && i5 == -1; i6++) {
                            i5 = eek.a[i6];
                            boolean z2 = true;
                            for (int i7 = 0; i7 < h.size(); i7++) {
                                if (((efw) h.get(i7)).a() != i5) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (true != z2) {
                                i5 = -1;
                            }
                        }
                        i = i5;
                    }
                }
                if (i != -1) {
                    eek.i(view, new efw(null, i, string, ajebVar, null));
                }
                sparseIntArray.put(0, i);
            }
            if (this.t && this.w != 5) {
                ai(view, efw.h, 5);
            }
            int i8 = this.w;
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 == 6) {
                        ai(view, efw.g, 4);
                        ai(view, efw.f, 3);
                        return;
                    }
                    return;
                }
                if (true == this.a) {
                    i3 = 3;
                }
                ai(view, efw.f, i3);
                return;
            }
            if (true == this.a) {
                i3 = 4;
            }
            ai(view, efw.g, i3);
        }
    }

    private final void al(int i, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        if (i != 2) {
            if (this.w == 3 && (this.R || an())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.T != z2 && this.d != null) {
                this.T = z2;
                float f = 1.0f;
                if (z && (valueAnimator = this.V) != null) {
                    if (valueAnimator.isRunning()) {
                        this.V.reverse();
                        return;
                    }
                    float f2 = this.d.o.k;
                    if (z2) {
                        f = ad();
                    }
                    this.V.setFloatValues(f2, f);
                    this.V.start();
                    return;
                }
                ValueAnimator valueAnimator2 = this.V;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.V.cancel();
                }
                ajkm ajkmVar = this.d;
                if (this.T) {
                    f = ad();
                }
                ajkmVar.K(f);
            }
        }
    }

    private final void am(boolean z) {
        WeakReference weakReference = this.A;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.af == null) {
                        this.af = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.A.get() && z) {
                        this.af.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.af = null;
                }
            }
        }
    }

    private final boolean an() {
        WeakReference weakReference = this.A;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.A.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean ao() {
        if (this.x == null) {
            return false;
        }
        if (!this.v && this.w != 1) {
            return false;
        }
        return true;
    }

    private static final float ap(float f, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f2 = radius;
            if (f2 > brg.a && f > brg.a) {
                return f2 / f;
            }
        }
        return brg.a;
    }

    private static final int aq(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public final int L() {
        int i;
        if (this.a) {
            return this.o;
        }
        int i2 = this.n;
        if (this.Q) {
            i = 0;
        } else {
            i = this.m;
        }
        return Math.max(i2, i);
    }

    final View M(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (edz.n(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View M = M(viewGroup.getChildAt(i));
                if (M != null) {
                    return M;
                }
            }
        }
        return null;
    }

    public final void O(ajec ajecVar) {
        if (!this.C.contains(ajecVar)) {
            this.C.add(ajecVar);
        }
    }

    @Override // defpackage.ajim
    public final void P() {
        ajil ajilVar = this.G;
        if (ajilVar != null) {
            if (ajilVar.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            qz qzVar = ajilVar.f;
            ajilVar.f = null;
            if (qzVar != null) {
                Animator a = ajilVar.a();
                a.setDuration(ajilVar.e);
                a.start();
            }
        }
    }

    public final void Q(int i) {
        View view = (View) this.A.get();
        if (view != null && !this.C.isEmpty()) {
            int i2 = this.r;
            if (i <= i2 && i2 != L()) {
                L();
            }
            for (int i3 = 0; i3 < this.C.size(); i3++) {
                ((ajec) this.C.get(i3)).c(view);
            }
        }
    }

    @Override // defpackage.ajim
    public final void R() {
        ajil ajilVar = this.G;
        if (ajilVar == null) {
            return;
        }
        qz qzVar = ajilVar.f;
        ajilVar.f = null;
        int i = 4;
        if (qzVar != null && Build.VERSION.SDK_INT >= 34) {
            if (this.t) {
                ajil ajilVar2 = this.G;
                ajdy ajdyVar = new ajdy(this);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ajilVar2.b, (Property<View, Float>) View.TRANSLATION_Y, ajilVar2.b.getHeight() * ajilVar2.b.getScaleY());
                ofFloat.setInterpolator(new emq());
                ofFloat.setDuration(ajdd.b(ajilVar2.c, ajilVar2.d, qzVar.a));
                ofFloat.addListener(new ajiq(ajilVar2));
                ofFloat.addListener(ajdyVar);
                ofFloat.start();
                return;
            }
            Animator a = this.G.a();
            a.setDuration(ajdd.b(r2.c, r2.d, qzVar.a));
            a.start();
            V(4);
            return;
        }
        if (true == this.t) {
            i = 5;
        }
        V(i);
    }

    public final void S(int i) {
        if (i >= 0) {
            this.n = i;
            al(this.w, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final void T(boolean z) {
        if (this.t != z) {
            this.t = z;
            if (!z && this.w == 5) {
                V(4);
            }
            ak();
        }
    }

    public final void U(int i) {
        if (i == -1) {
            if (!this.J) {
                this.J = true;
            } else {
                return;
            }
        } else {
            if (!this.J && this.c == i) {
                return;
            }
            this.J = false;
            this.c = Math.max(0, i);
        }
        ac();
    }

    public final void V(int i) {
        int i2;
        if (!this.t && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        if (i == 6 && this.a && af(6) <= this.o) {
            i2 = 3;
        } else {
            i2 = i;
        }
        WeakReference weakReference = this.A;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.A.get();
            wob wobVar = new wob((BottomSheetBehavior) this, view, i2, 12);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(wobVar);
                return;
            } else {
                wobVar.run();
                return;
            }
        }
        W(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r8 == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(int r8) {
        /*
            r7 = this;
            int r0 = r7.w
            if (r0 != r8) goto L5
            goto L54
        L5:
            r7.w = r8
            r0 = 6
            r1 = 3
            r2 = 5
            r3 = 4
            if (r8 == r3) goto L18
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            boolean r4 = r7.t
            if (r4 == 0) goto L18
            if (r8 != r2) goto L18
            r8 = r2
        L18:
            java.lang.ref.WeakReference r4 = r7.A
            if (r4 == 0) goto L54
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L54
            r5 = 0
            r6 = 1
            if (r8 != r1) goto L2c
            r7.am(r6)
            goto L38
        L2c:
            if (r8 == r0) goto L33
            if (r8 == r2) goto L33
            if (r8 != r3) goto L38
            goto L34
        L33:
            r3 = r8
        L34:
            r7.am(r5)
            r8 = r3
        L38:
            r7.al(r8, r6)
        L3b:
            java.util.ArrayList r0 = r7.C
            int r0 = r0.size()
            if (r5 >= r0) goto L51
            java.util.ArrayList r0 = r7.C
            java.lang.Object r0 = r0.get(r5)
            ajec r0 = (defpackage.ajec) r0
            r0.b(r4, r8)
            int r5 = r5 + 1
            goto L3b
        L51:
            r7.ak()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.W(int):void");
    }

    @Override // defpackage.ajim
    public final void X(qz qzVar) {
        ajil ajilVar = this.G;
        if (ajilVar == null) {
            return;
        }
        ajilVar.f = qzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.i(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.af(r4)
            ehk r1 = r2.x
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3f
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3f
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3f
            r3 = 0
            r1.d = r3
            goto L3f
        L31:
            r3 = 2
            r2.W(r3)
            r3 = 1
            r2.al(r4, r3)
            ajef r3 = r2.U
            r3.a(r4)
            return
        L3f:
            r2.W(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.Y(android.view.View, int, boolean):void");
    }

    @Override // defpackage.ajim
    public final void Z(qz qzVar) {
        ajil ajilVar = this.G;
        if (ajilVar != null) {
            if (ajilVar.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            qz qzVar2 = ajilVar.f;
            ajilVar.f = qzVar;
            if (qzVar2 != null) {
                ajilVar.b(qzVar.a);
            }
        }
    }

    @Override // defpackage.dxt
    public final void a(dxv dxvVar) {
        this.A = null;
        this.x = null;
        this.G = null;
    }

    public final boolean aa() {
        if (this.t) {
            return true;
        }
        return false;
    }

    public final boolean ab(View view, float f) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * this.ab)) - this.r) / ae() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void ac() {
        View view;
        if (this.A != null) {
            ag();
            if (this.w == 4 && (view = (View) this.A.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.dxt
    public final void b() {
        this.A = null;
        this.x = null;
        this.G = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.p) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (java.lang.Math.abs(r3 - r2.o) < java.lang.Math.abs(r3 - r2.r)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.r)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.r)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        if (java.lang.Math.abs(r3 - r2.p) < java.lang.Math.abs(r3 - r2.r)) goto L20;
     */
    @Override // defpackage.dxt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.L()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.W(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.B
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.aa
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.Z
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.p
            if (r3 <= r6) goto Lb0
        L32:
            r0 = r5
            goto Lb0
        L35:
            boolean r3 = r2.t
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.ad
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.I
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ad
            int r6 = r2.D
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.ab(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.Z
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.o
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.p
            if (r3 >= r1) goto L84
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = r6
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.p
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.Y(r4, r0, r3)
            r2.aa = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.dxt
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        ehk ehkVar;
        if (view.isShown() && this.v) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                aj();
                actionMasked = 0;
            }
            if (this.ad == null) {
                this.ad = VelocityTracker.obtain();
            }
            this.ad.addMovement(motionEvent);
            View view3 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.E = false;
                    this.D = -1;
                    if (this.Y) {
                        this.Y = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.ae = (int) motionEvent.getY();
                if (this.w != 2) {
                    WeakReference weakReference = this.B;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.k(view2, x, this.ae)) {
                        this.D = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.E = true;
                    }
                }
                if (this.D == -1 && !coordinatorLayout.k(view, x, this.ae)) {
                    z = true;
                } else {
                    z = false;
                }
                this.Y = z;
            }
            if (!this.Y && (ehkVar = this.x) != null && ehkVar.j(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.B;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked == 2 && view3 != null && !this.Y && this.w != 1 && !coordinatorLayout.k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.x != null && (i = this.ae) != -1) {
                if (Math.abs(i - motionEvent.getY()) > this.x.b) {
                    return true;
                }
            }
            return false;
        }
        this.Y = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    @Override // defpackage.dxt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.dxt
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.w == 1 && actionMasked == 0) {
            return true;
        }
        if (ao()) {
            this.x.e(motionEvent);
        }
        if (actionMasked == 0) {
            aj();
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (ao() && actionMasked == 2 && !this.Y) {
            float abs = Math.abs(this.ae - motionEvent.getY());
            ehk ehkVar = this.x;
            if (abs > ehkVar.b) {
                ehkVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        if (this.Y) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dxt
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(aq(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.N, marginLayoutParams.width), aq(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.O, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.dxt
    public final boolean l(View view) {
        WeakReference weakReference = this.B;
        if (weakReference == null || view != weakReference.get() || this.w == 3 || this.X) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r2 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        if (r2 == false) goto L36;
     */
    @Override // defpackage.dxt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int[] r9, int r10) {
        /*
            r4 = this;
            r5 = 1
            if (r10 != r5) goto L5
            goto La2
        L5:
            java.lang.ref.WeakReference r10 = r4.B
            if (r10 == 0) goto L10
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            goto L11
        L10:
            r10 = 0
        L11:
            if (r7 != r10) goto La2
            int r0 = r6.getTop()
            int r1 = r0 - r8
            if (r8 <= 0) goto L53
            boolean r2 = r4.aa
            if (r2 != 0) goto L2b
            boolean r2 = r4.W
            if (r2 != 0) goto L2b
            if (r7 != r10) goto L2b
            boolean r7 = r7.canScrollVertically(r5)
            if (r7 != 0) goto L67
        L2b:
            int r7 = r4.L()
            if (r1 >= r7) goto L43
            int r7 = r4.L()
            int r0 = r0 - r7
            r9[r5] = r0
            int[] r7 = defpackage.eek.a
            int r7 = -r0
            r6.offsetTopAndBottom(r7)
            r7 = 3
            r4.W(r7)
            goto L94
        L43:
            boolean r7 = r4.v
            if (r7 == 0) goto La2
            r9[r5] = r8
            int r7 = -r8
            int[] r9 = defpackage.eek.a
            r6.offsetTopAndBottom(r7)
            r4.W(r5)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r2 = -1
            boolean r2 = r7.canScrollVertically(r2)
            boolean r3 = r4.aa
            if (r3 != 0) goto L6a
            boolean r3 = r4.W
            if (r3 != 0) goto L6a
            if (r7 != r10) goto L6a
            if (r2 != 0) goto L67
            goto L6c
        L67:
            r4.X = r5
            return
        L6a:
            if (r2 != 0) goto L94
        L6c:
            int r7 = r4.r
            if (r1 <= r7) goto L85
            boolean r10 = r4.aa()
            if (r10 == 0) goto L77
            goto L85
        L77:
            int r0 = r0 - r7
            r9[r5] = r0
            int[] r7 = defpackage.eek.a
            int r7 = -r0
            r6.offsetTopAndBottom(r7)
            r7 = 4
            r4.W(r7)
            goto L94
        L85:
            boolean r7 = r4.v
            if (r7 == 0) goto La2
            r9[r5] = r8
            int r7 = -r8
            int[] r9 = defpackage.eek.a
            r6.offsetTopAndBottom(r7)
            r4.W(r5)
        L94:
            int r6 = r6.getTop()
            r4.Q(r6)
            r4.Z = r8
            r4.aa = r5
            r5 = 0
            r4.X = r5
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.n(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.dxt
    public final void p(View view, Parcelable parcelable) {
        ajee ajeeVar = (ajee) parcelable;
        int i = this.H;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = ajeeVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = ajeeVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.t = ajeeVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.u = ajeeVar.g;
            }
        }
        int i3 = ajeeVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.w = i2;
    }

    @Override // defpackage.dxt
    public final Parcelable q(View view) {
        return new ajee(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.dxt
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.Z = 0;
        this.aa = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new ajef(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.W = true;
        this.w = 4;
        this.ab = 0.1f;
        this.C = new ArrayList();
        this.ae = -1;
        this.F = new SparseIntArray();
        this.ag = new ajea(this);
        this.L = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajen.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.M = ajki.e(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.S = new ajkr(ajkr.h(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.S != null) {
            ajkm ajkmVar = new ajkm(this.S);
            this.d = ajkmVar;
            ajkmVar.G(context);
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.d.J(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.d.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(ad(), 1.0f);
        this.V = ofFloat;
        ofFloat.setDuration(500L);
        this.V.addUpdateListener(new ajlk(this, 1));
        this.s = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.N = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.O = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && peekValue.data == -1) {
            U(peekValue.data);
        } else {
            U(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        T(obtainStyledAttributes.getBoolean(9, false));
        this.P = obtainStyledAttributes.getBoolean(14, false);
        boolean z = obtainStyledAttributes.getBoolean(7, true);
        if (this.a != z) {
            this.a = z;
            if (this.A != null) {
                ag();
            }
            W((this.a && this.w == 6) ? 3 : this.w);
            al(this.w, true);
            ak();
        }
        this.u = obtainStyledAttributes.getBoolean(13, false);
        this.v = obtainStyledAttributes.getBoolean(4, true);
        this.W = obtainStyledAttributes.getBoolean(5, true);
        this.H = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > brg.a && f < 1.0f) {
            this.q = f;
            if (this.A != null) {
                ah();
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                S(peekValue2.data);
            } else {
                S(obtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = obtainStyledAttributes.getInt(12, 500);
            this.f = obtainStyledAttributes.getBoolean(18, false);
            this.g = obtainStyledAttributes.getBoolean(19, false);
            this.h = obtainStyledAttributes.getBoolean(20, false);
            this.Q = obtainStyledAttributes.getBoolean(21, true);
            this.i = obtainStyledAttributes.getBoolean(15, false);
            this.j = obtainStyledAttributes.getBoolean(16, false);
            this.k = obtainStyledAttributes.getBoolean(17, false);
            this.R = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.I = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.dxt
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
