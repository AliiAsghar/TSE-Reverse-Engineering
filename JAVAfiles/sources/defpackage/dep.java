package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dep extends View implements cyz {
    public static Method a;
    public static Field b;
    public static boolean c;
    public static boolean d;
    private static final arqv g = AnonymousClass2.a;
    private static final ViewOutlineProvider h = new ViewOutlineProvider() { // from class: dep.1
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            Outline a2 = ((dep) view).e.a();
            a2.getClass();
            outline.set(a2);
        }
    };
    public final ddk e;
    public boolean f;
    private final dai i;
    private final dcq j;
    private arqv k;
    private arqg l;
    private boolean m;
    private Rect n;
    private boolean o;
    private final cks p;
    private final dde q;
    private long r;
    private boolean s;
    private int t;

    /* compiled from: PG */
    /* renamed from: dep$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqv<View, Matrix, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Matrix) obj2).set(((View) obj).getMatrix());
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final void a(View view) {
            try {
                if (!dep.c) {
                    dep.c = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        dep.a = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        dep.b = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        dep.a = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        dep.b = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = dep.a;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = dep.b;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = dep.b;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = dep.a;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                dep.d = true;
            }
        }
    }

    public dep(dai daiVar, dcq dcqVar, arqv arqvVar, arqg arqgVar) {
        super(daiVar.getContext());
        this.i = daiVar;
        this.j = dcqVar;
        this.k = arqvVar;
        this.l = arqgVar;
        this.e = new ddk();
        this.p = new cks();
        this.q = new dde(g);
        this.r = cmg.a;
        this.s = true;
        setWillNotDraw(false);
        dcqVar.addView(this);
        View.generateViewId();
    }

    private final clr n() {
        if (getClipToOutline() && !this.e.d()) {
            return this.e.b();
        }
        return null;
    }

    private final void o() {
        Rect rect;
        if (this.m) {
            Rect rect2 = this.n;
            if (rect2 == null) {
                this.n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void p(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.i.F(this, z);
        }
    }

    private final void q() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.e.a() != null) {
            viewOutlineProvider = h;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // defpackage.cyz
    public final long a(long j, boolean z) {
        if (z) {
            return this.q.b(this, j);
        }
        return this.q.a(this, j);
    }

    @Override // defpackage.cyz
    public final void b() {
        p(false);
        this.i.I();
        this.k = null;
        this.l = null;
        this.i.N(this);
        this.j.removeViewInLayout(this);
    }

    @Override // defpackage.cyz
    public final void c(ckr ckrVar, cof cofVar) {
        boolean z;
        if (getElevation() > brg.a) {
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        if (z) {
            ckrVar.i();
        }
        this.j.a(ckrVar, this, getDrawingTime());
        if (this.o) {
            ckrVar.c();
        }
    }

    @Override // defpackage.cyz
    public final void d(float[] fArr) {
        float[] g2 = this.q.g(this);
        if (g2 != null) {
            cll.d(fArr, g2);
        }
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        boolean z;
        cks cksVar = this.p;
        cjw cjwVar = cksVar.a;
        Canvas canvas2 = cjwVar.a;
        cjwVar.a = canvas;
        if (n() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            cjwVar.l();
            this.e.c(cjwVar);
            z = true;
        }
        arqv arqvVar = this.k;
        if (arqvVar != null) {
            arqvVar.a(cjwVar, null);
        }
        if (z) {
            cjwVar.j();
        }
        cksVar.a.a = canvas2;
        p(false);
    }

    @Override // defpackage.cyz
    public final void e(cjl cjlVar, boolean z) {
        if (z) {
            this.q.e(this, cjlVar);
        } else {
            this.q.d(this, cjlVar);
        }
    }

    @Override // defpackage.cyz
    public final void f(long j) {
        int a2 = dre.a(j);
        if (a2 != getLeft()) {
            offsetLeftAndRight(a2 - getLeft());
            this.q.c();
        }
        int b2 = dre.b(j);
        if (b2 != getTop()) {
            offsetTopAndBottom(b2 - getTop());
            this.q.c();
        }
    }

    @Override // defpackage.cyz
    public final void g(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (i2 == getWidth() && i == getHeight()) {
            return;
        }
        setPivotX(cmg.a(this.r) * i2);
        setPivotY(cmg.b(this.r) * i);
        q();
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i);
        o();
        this.q.c();
    }

    @Override // defpackage.cyz
    public final void h(arqv arqvVar, arqg arqgVar) {
        this.j.addView(this);
        this.q.f();
        this.m = false;
        this.o = false;
        this.r = cmg.a;
        this.k = arqvVar;
        this.l = arqgVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.s;
    }

    @Override // defpackage.cyz
    public final void i(float[] fArr) {
        cll.d(fArr, this.q.h(this));
    }

    @Override // android.view.View, defpackage.cyz
    public final void invalidate() {
        if (!this.f) {
            p(true);
            super.invalidate();
            this.i.invalidate();
        }
    }

    @Override // defpackage.cyz
    public final void j() {
        if (this.f && !d) {
            a.a(this);
            p(false);
        }
    }

    @Override // defpackage.cyz
    public final void k(cly clyVar) {
        boolean z;
        boolean z2;
        boolean z3;
        RenderEffect renderEffect;
        arqg arqgVar;
        boolean z4;
        int i = clyVar.a | this.t;
        if ((i & 4096) != 0) {
            long j = clyVar.n;
            this.r = j;
            setPivotX(cmg.a(j) * getWidth());
            setPivotY(cmg.b(this.r) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(clyVar.b);
        }
        if ((i & 2) != 0) {
            setScaleY(clyVar.c);
        }
        if ((i & 4) != 0) {
            setAlpha(clyVar.d);
        }
        if ((i & 8) != 0) {
            setTranslationX(clyVar.e);
        }
        if ((i & 16) != 0) {
            setTranslationY(clyVar.f);
        }
        if ((i & 32) != 0) {
            setElevation(clyVar.g);
        }
        if ((i & 1024) != 0) {
            setRotation(clyVar.l);
        }
        if ((i & 256) != 0) {
            setRotationX(clyVar.j);
        }
        if ((i & 512) != 0) {
            setRotationY(clyVar.k);
        }
        if ((i & 2048) != 0) {
            setCameraDistance(clyVar.m * getResources().getDisplayMetrics().densityDpi);
        }
        boolean z5 = true;
        if (n() == null) {
            z = false;
        } else {
            z = true;
        }
        boolean z6 = clyVar.p;
        if (z6 && clyVar.o != clw.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 24576) != 0) {
            if (z6 && clyVar.o == clw.a) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.m = z4;
            o();
            setClipToOutline(z2);
        }
        boolean f = this.e.f(clyVar.v, clyVar.d, z2, clyVar.g, clyVar.r);
        if (this.e.a) {
            q();
        }
        clr n = n();
        if (n == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z != z3 || (n != null && f)) {
            invalidate();
        }
        if (!this.o && getElevation() > brg.a && (arqgVar = this.l) != null) {
            arqgVar.a();
        }
        if ((i & 7963) != 0) {
            this.q.c();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if ((i & 64) != 0) {
                setOutlineAmbientShadowColor(ckw.b(clyVar.h));
            }
            if ((i & 128) != 0) {
                setOutlineSpotShadowColor(ckw.b(clyVar.i));
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (131072 & i) != 0) {
            clx clxVar = clyVar.u;
            if (clxVar != null) {
                renderEffect = clxVar.b();
            } else {
                renderEffect = null;
            }
            setRenderEffect(renderEffect);
        }
        if ((i & 32768) != 0) {
            int i2 = clyVar.q;
            if (defpackage.a.bA(i2, 1)) {
                setLayerType(2, null);
            } else if (defpackage.a.bA(i2, 2)) {
                setLayerType(0, null);
                z5 = false;
            } else {
                setLayerType(0, null);
            }
            this.s = z5;
        }
        this.t = clyVar.a;
    }

    @Override // defpackage.cyz
    public final boolean l(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.m) {
            if (intBitsToFloat >= brg.a && intBitsToFloat < getWidth() && intBitsToFloat2 >= brg.a && intBitsToFloat2 < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.e.e(j);
    }

    @Override // defpackage.cyz
    public final float[] m() {
        return this.q.h(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
