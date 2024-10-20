package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import defpackage.ces;
import defpackage.cga;
import defpackage.cgq;
import defpackage.cqx;
import defpackage.cxn;
import defpackage.cyd;
import defpackage.dlh;
import defpackage.dli;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dai extends ViewGroup implements czb, cqm, emx {
    public static Class a;
    public static Method b;
    public arqr A;
    public final dol B;
    public final ddz C;
    public final dlh.a D;
    public final cpm E;
    public final cpq F;
    public final cvv G;
    public final dec H;
    public MotionEvent I;
    public long J;
    public final der K;
    public final AnonymousClass15 L;
    public boolean M;
    public final dgk N;
    public final dhq O;
    public final cqz P;
    public int Q;
    private long R;
    private final boolean S;
    private final byn T;
    private final dgs U;
    private final EmptySemanticsElement V;
    private final cga W;
    private final byn aA;
    private final cbh aB;
    private final Runnable aC;
    private final arqg aD;
    private final dca aE;
    private boolean aF;
    private final cga aa;
    private final cks ab;
    private final List ac;
    private List ad;
    private boolean ae;
    private boolean af;
    private final cqn ag;
    private final crg ah;
    private boolean ai;
    private dbz aj;
    private dqs ak;
    private boolean al;
    private long am;
    private final int[] an;
    private final float[] ao;
    private long ap;
    private boolean aq;
    private long ar;
    private final cas as;
    private final ViewTreeObserver.OnGlobalLayoutListener at;
    private final ViewTreeObserver.OnScrollChangedListener au;
    private final ViewTreeObserver.OnTouchModeChangeListener av;
    private final don aw;
    private final AtomicReference ax;
    private final byn ay;
    private int az;
    public final cxp c;
    public final cin d;
    public arpi e;
    public final AndroidDragAndDropManager f;
    public final det g;
    public final deo h;
    public final cxn i;
    public final dhg j;
    public final das k;
    public final cgq l;
    public final dac m;
    public final clc n;
    public final cgo o;
    public arqr p;
    public final cgj q;
    public final dad r;
    public final cze s;
    public boolean t;
    public dcq u;
    public final cyd v;
    public final float[] w;
    public final float[] x;
    public boolean y;
    public final byn z;

    /* compiled from: PG */
    /* renamed from: dai$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Configuration, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$10, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass10 extends arrp implements arqr<FocusTargetNode, Boolean> {
        final /* synthetic */ arsb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(arsb arsbVar) {
            super(1);
            this.a = arsbVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.a = (FocusTargetNode) obj;
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$11, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass11 extends arrp implements arqr<cps, Boolean> {
        public AnonymousClass11() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cib cibVar;
            Rect rect;
            int i;
            KeyEvent keyEvent = ((cps) obj).a;
            long b = cpt.b(keyEvent);
            boolean z = true;
            if (defpackage.a.bB(b, cpr.g)) {
                if (true != keyEvent.isShiftPressed()) {
                    i = 1;
                } else {
                    i = 2;
                }
                cibVar = new cib(i);
            } else if (defpackage.a.bB(b, cpr.e)) {
                cibVar = new cib(4);
            } else if (defpackage.a.bB(b, cpr.d)) {
                cibVar = new cib(3);
            } else if (!defpackage.a.bB(b, cpr.b) && !defpackage.a.bB(b, cpr.k)) {
                if (!defpackage.a.bB(b, cpr.c) && !defpackage.a.bB(b, cpr.l)) {
                    if (!defpackage.a.bB(b, cpr.f) && !defpackage.a.bB(b, cpr.h) && !defpackage.a.bB(b, cpr.m)) {
                        if (!defpackage.a.bB(b, cpr.a) && !defpackage.a.bB(b, cpr.j)) {
                            cibVar = null;
                        } else {
                            cibVar = new cib(8);
                        }
                    } else {
                        cibVar = new cib(7);
                    }
                } else {
                    cibVar = new cib(6);
                }
            } else {
                cibVar = new cib(5);
            }
            if (cibVar != null && defpackage.a.bA(cpt.a(keyEvent), 2)) {
                dai daiVar = dai.this;
                cjp B = daiVar.B();
                Boolean e = daiVar.d.e(cibVar.a, B, new dal(cibVar));
                if (e == null || e.booleanValue()) {
                    return true;
                }
                int i2 = cibVar.a;
                if (!cip.a(i2)) {
                    return false;
                }
                Integer d = cih.d(i2);
                if (d != null) {
                    int intValue = d.intValue();
                    if (B != null) {
                        rect = clv.a(B);
                    } else {
                        rect = null;
                    }
                    if (rect != null) {
                        dai daiVar2 = dai.this;
                        View view = daiVar2;
                        loop0: while (true) {
                            if (view != null) {
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = daiVar2.getRootView();
                                rootView.getClass();
                                view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                                if (view != null) {
                                    if (!d.F(view, daiVar2)) {
                                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                            if (parent == daiVar2) {
                                                break;
                                            }
                                        }
                                        break loop0;
                                    }
                                    break;
                                }
                            } else {
                                view = null;
                                break;
                            }
                        }
                        if (true == d.F(view, dai.this)) {
                            view = null;
                        }
                        if (view != null && cih.e(view, Integer.valueOf(intValue), rect)) {
                            return true;
                        }
                        if (!dai.this.d.g(false, false, cibVar.a)) {
                            return true;
                        }
                        Boolean e2 = dai.this.d.e(cibVar.a, null, new dak(cibVar));
                        if (e2 != null) {
                            z = e2.booleanValue();
                        }
                        return Boolean.valueOf(z);
                    }
                    throw new IllegalStateException("Invalid rect");
                }
                throw new IllegalStateException("Invalid focus direction");
            }
            return false;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$13, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass13 extends arrp implements arqr<FocusTargetNode, Boolean> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(int i) {
            super(1);
            this.a = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean z;
            Boolean c = cjd.c((FocusTargetNode) obj, this.a);
            if (c != null) {
                z = c.booleanValue();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$14, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass14 extends arrp implements arqg<arnb> {
        public AnonymousClass14() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            int actionMasked;
            MotionEvent motionEvent = dai.this.I;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                dai.this.J = SystemClock.uptimeMillis();
                dai daiVar = dai.this;
                daiVar.post(daiVar.L);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$16, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass16 extends arrp implements arqr<csf, Boolean> {
        public static final AnonymousClass16 a = new AnonymousClass16();

        public AnonymousClass16() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return false;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$17, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass17 extends arrp implements arqr<arqg<? extends arnb>, arnb> {
        public AnonymousClass17() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            Looper looper;
            final arqg arqgVar = (arqg) obj;
            Handler handler = dai.this.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                arqgVar.a();
            } else {
                Handler handler2 = dai.this.getHandler();
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: dan
                        @Override // java.lang.Runnable
                        public final void run() {
                            arqg.this.a();
                        }
                    });
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dai$18, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass18 extends arps {
        /* synthetic */ Object a;
        int c;

        public AnonymousClass18(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return dai.this.n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dai$19, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass19 extends arrp implements arqr<arwe, dbq> {
        public AnonymousClass19() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dai daiVar = dai.this;
            return new dbq(daiVar, daiVar.B, (arwe) obj);
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$2, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass2 extends arrm implements arqg<dfr> {
        public AnonymousClass2(Object obj) {
            super(0, obj, dbh.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        
            r0 = r1.getContentCaptureSession();
         */
        @Override // defpackage.arqg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a() {
            /*
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                java.lang.Object r1 = r3.e
                android.view.View r1 = (android.view.View) r1
                r2 = 30
                if (r0 < r2) goto Le
                r0 = 1
                defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r1, r0)
            Le:
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r0 < r2) goto L21
                android.view.contentcapture.ContentCaptureSession r0 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r1)
                if (r0 != 0) goto L1b
                goto L21
            L1b:
                dfr r2 = new dfr
                r2.<init>(r0, r1)
                return r2
            L21:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dai.AnonymousClass2.a():java.lang.Object");
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$20, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass20 extends arrp implements arqg<b> {
        public AnonymousClass20() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return (b) dai.this.z.a();
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<Boolean> {
        final /* synthetic */ KeyEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(KeyEvent keyEvent) {
            super(0);
            this.b = keyEvent;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Boolean.valueOf(dai.super.dispatchKeyEvent(this.b));
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$4, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass4 extends arrm implements arqr<arqg<? extends arnb>, arnb> {
        public AnonymousClass4(Object obj) {
            super(1, obj, dai.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((dai) this.e).x((arqg) obj);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$5, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass5 extends arrm implements arqv<cib, cjp, Boolean> {
        public AnonymousClass5(Object obj) {
            super(2, obj, dai.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Boolean.valueOf(((dai) this.e).M((cib) obj, (cjp) obj2));
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$6, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass6 extends arrm implements arqr<cib, Boolean> {
        public AnonymousClass6(Object obj) {
            super(1, obj, dai.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            Rect rect;
            View findNextFocusFromRect;
            int i = ((cib) obj).a;
            boolean bA = defpackage.a.bA(i, 7);
            dai daiVar = (dai) this.e;
            boolean z = false;
            if (!bA && !defpackage.a.bA(i, 8)) {
                Integer d = cih.d(i);
                if (d != null) {
                    int intValue = d.intValue();
                    cjp B = daiVar.B();
                    if (B != null) {
                        rect = clv.a(B);
                    } else {
                        rect = null;
                    }
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    if (rect == null) {
                        findNextFocusFromRect = focusFinder.findNextFocus(daiVar, daiVar.findFocus(), intValue);
                    } else {
                        findNextFocusFromRect = focusFinder.findNextFocusFromRect(daiVar, rect, intValue);
                    }
                    if (findNextFocusFromRect != null) {
                        z = cih.e(findNextFocusFromRect, Integer.valueOf(intValue), rect);
                    }
                } else {
                    throw new IllegalStateException("Invalid focus direction");
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$7, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass7 extends arrm implements arqg<arnb> {
        public AnonymousClass7(Object obj) {
            super(0, obj, dai.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            ((dai) this.e).G();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dai$8, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass8 extends arrm implements arqg<cjp> {
        public AnonymousClass8(Object obj) {
            super(0, obj, dai.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return ((dai) this.e).B();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final boolean a() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (dai.a == null) {
                    dai.a = Class.forName("android.os.SystemProperties");
                    Class cls = dai.a;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    dai.b = method;
                }
                Method method2 = dai.b;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", false);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        public final enm a;
        public final gjz b;

        public b(enm enmVar, gjz gjzVar) {
            this.a = enmVar;
            this.b = gjzVar;
        }
    }

    /* JADX WARN: Type inference failed for: r13v12, types: [dai$15] */
    public dai(Context context, arpi arpiVar) {
        super(context);
        int i;
        dca dccVar;
        this.R = 9205357640488583168L;
        this.S = true;
        this.c = new cxp(0 == true ? 1 : 0);
        this.T = new byu(dqr.a(context), bzr.a);
        dgs dgsVar = new dgs();
        this.U = dgsVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dgsVar);
        this.V = emptySemanticsElement;
        FocusOwnerImpl focusOwnerImpl = new FocusOwnerImpl(new AnonymousClass4(this), new AnonymousClass5(this), new AnonymousClass6(this), new AnonymousClass7(this), new AnonymousClass8(this), new arrq(this) { // from class: dai.9
            @Override // defpackage.arrq
            public final Object b() {
                return ((dai) this.e).m();
            }
        });
        this.d = focusOwnerImpl;
        this.e = arpiVar;
        AndroidDragAndDropManager androidDragAndDropManager = new AndroidDragAndDropManager();
        this.f = androidDragAndDropManager;
        this.g = new det();
        cga a2 = cpu.a(cga.e, new AnonymousClass11());
        this.W = a2;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(AnonymousClass16.a);
        this.aa = rotaryInputElement;
        this.ab = new cks();
        dby dbyVar = new dby(ViewConfiguration.get(context));
        this.h = dbyVar;
        cxn cxnVar = new cxn(false, 3, 0 == true ? 1 : 0);
        cxnVar.g(cvg.a);
        cxnVar.ae(l());
        cxnVar.af(dbyVar);
        cxnVar.h(cfz.a(emptySemanticsElement, rotaryInputElement).a(a2).a(focusOwnerImpl.f).a(androidDragAndDropManager.c));
        this.i = cxnVar;
        this.j = new dhg(cxnVar, dgsVar);
        das dasVar = new das(this);
        this.k = dasVar;
        cgq cgqVar = new cgq(this, new AnonymousClass2(this));
        this.l = cgqVar;
        this.m = new dac(context);
        this.n = new cjy(this);
        cgo cgoVar = new cgo();
        this.o = cgoVar;
        this.ac = new ArrayList();
        this.ag = new cqn();
        this.ah = new crg(cxnVar);
        this.p = AnonymousClass1.a;
        this.q = new cgj(this, cgoVar);
        new cgk(this);
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.r = new dad((ClipboardManager) systemService);
        this.s = new cze(new AnonymousClass17());
        this.v = new cyd(cxnVar);
        this.am = 9223372034707292159L;
        this.an = new int[]{0, 0};
        float[] e = cll.e();
        this.ao = e;
        this.w = cll.e();
        this.x = cll.e();
        this.ap = -1L;
        this.ar = 9187343241974906880L;
        this.y = true;
        this.z = new byu(null, cav.a);
        this.as = new bxd(new AnonymousClass20(), null);
        this.at = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: dae
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                dai.this.K();
            }
        };
        this.au = new ViewTreeObserver.OnScrollChangedListener() { // from class: daf
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                dai.this.K();
            }
        };
        this.av = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: dag
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                int i2 = 1;
                if (true != z) {
                    i2 = 2;
                }
                dai.this.F.b(i2);
            }
        };
        don donVar = new don(this, this);
        this.aw = donVar;
        dol dolVar = new dol(donVar);
        this.B = dolVar;
        this.ax = new AtomicReference(null);
        this.C = new dcj(dolVar);
        this.D = new dbp();
        this.ay = new byu(dlm.a(context), bzr.a);
        this.az = aa(context.getResources().getConfiguration());
        drk c = cih.c(context.getResources().getConfiguration().getLayoutDirection());
        this.aA = new byu(c == null ? drk.a : c, cav.a);
        this.E = new cpn(this);
        if (true != isInTouchMode()) {
            i = 2;
        } else {
            i = 1;
        }
        this.F = new cpq(i);
        this.G = new cvv(this);
        this.H = new dbs(this);
        this.K = new der();
        this.aB = new cbh(new arqg[16]);
        this.L = new Runnable() { // from class: dai.15
            @Override // java.lang.Runnable
            public final void run() {
                dai.this.removeCallbacks(this);
                MotionEvent motionEvent = dai.this.I;
                if (motionEvent != null) {
                    int toolType = motionEvent.getToolType(0);
                    int actionMasked = motionEvent.getActionMasked();
                    if (toolType == 3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i2 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i2 = 2;
                    }
                    dai daiVar = dai.this;
                    daiVar.J(motionEvent, i2, daiVar.J, false);
                }
            }
        };
        this.aC = new Runnable() { // from class: dah
            @Override // java.lang.Runnable
            public final void run() {
                dai daiVar = dai.this;
                daiVar.M = false;
                MotionEvent motionEvent = daiVar.I;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    daiVar.A(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
            }
        };
        this.aD = new AnonymousClass14();
        if (Build.VERSION.SDK_INT < 29) {
            dccVar = new dcb(e);
        } else {
            dccVar = new dcc();
        }
        this.aE = dccVar;
        addOnAttachStateChangeListener(cgqVar);
        setWillNotDraw(false);
        setFocusable(true);
        dbg.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        eek.n(this, dasVar);
        setOnDragListener(androidDragAndDropManager);
        cxnVar.F(this);
        if (Build.VERSION.SDK_INT >= 29) {
            dbb.a.a(this);
        }
        this.N = Build.VERSION.SDK_INT >= 31 ? new dgk() : null;
        this.O = new dhq();
        this.P = new cqz() { // from class: dai.12
            private cqx b;

            {
                int i2 = cqx.b;
                this.b = cqx.a.a;
            }

            @Override // defpackage.cqz
            public final void a(cqx cqxVar) {
                if (cqxVar == null) {
                    int i2 = cqx.b;
                    cqxVar = cqx.a.a;
                }
                this.b = cqxVar;
                dbf.a.a(dai.this, this.b);
            }
        };
    }

    private final int Q(MotionEvent motionEvent) {
        boolean z;
        int i;
        float f;
        long j;
        int actionMasked;
        removeCallbacks(this.L);
        try {
            this.ap = AnimationUtils.currentAnimationTimeMillis();
            W();
            float[] fArr = this.w;
            float x = motionEvent.getX();
            long a2 = cll.a(fArr, (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (Float.floatToRawIntBits(x) << 32));
            this.ar = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (a2 >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (a2 & 4294967295L))) & 4294967295L);
            boolean z2 = true;
            this.aq = true;
            q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.I;
                if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (motionEvent2 != null && ab(motionEvent, motionEvent2)) {
                    if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                        if (motionEvent2.getActionMasked() != 10 && z) {
                            J(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                    this.ah.b();
                }
                int toolType = motionEvent.getToolType(0);
                if (!z && toolType == 3 && actionMasked2 != 3 && actionMasked2 != 9 && Y(motionEvent)) {
                    J(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.I;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.I;
                    if (motionEvent4 != null) {
                        i = motionEvent4.getPointerId(0);
                    } else {
                        i = -1;
                    }
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (i >= 0) {
                            this.ag.b(i);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.I;
                        float f2 = Float.NaN;
                        if (motionEvent5 != null) {
                            f = motionEvent5.getX();
                        } else {
                            f = Float.NaN;
                        }
                        MotionEvent motionEvent6 = this.I;
                        if (motionEvent6 != null) {
                            f2 = motionEvent6.getY();
                        }
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (f == x2 && f2 == y) {
                            z2 = false;
                        }
                        MotionEvent motionEvent7 = this.I;
                        if (motionEvent7 != null) {
                            j = motionEvent7.getEventTime();
                        } else {
                            j = -1;
                        }
                        long eventTime = motionEvent.getEventTime();
                        if (z2 || j != eventTime) {
                            if (i >= 0) {
                                this.ag.b(i);
                            }
                            this.ah.a.a();
                        }
                    }
                }
                this.I = MotionEvent.obtainNoHistory(motionEvent);
                return A(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.aq = false;
        }
    }

    private final View R(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (d.F(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View R = R(i, viewGroup.getChildAt(i2));
                    if (R != null) {
                        return R;
                    }
                }
            }
        }
        return null;
    }

    private final void S(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof dai) {
                ((dai) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                S((ViewGroup) childAt);
            }
        }
    }

    private final void T() {
        if (this.af) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.af = false;
        }
    }

    private final void U(cxn cxnVar) {
        cxnVar.O();
        cbh o = cxnVar.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                U((cxn) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    private final void V(cxn cxnVar) {
        int i = 0;
        this.v.j(cxnVar, false);
        cbh o = cxnVar.o();
        int i2 = o.b;
        if (i2 > 0) {
            Object[] objArr = o.a;
            do {
                V((cxn) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    private final void W() {
        this.aE.a(this, this.w);
        ddc.a(this.w, this.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(cxn cxnVar) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (cxnVar != null) {
                while (cxnVar != null && cxnVar.r() == cxn.c.a) {
                    if (!this.al) {
                        cxn t = cxnVar.t();
                        if (t == null) {
                            break;
                        }
                        long j = t.x().d;
                        if (dqs.j(j) && dqs.i(j)) {
                            break;
                        }
                    }
                    cxnVar = cxnVar.t();
                }
                if (cxnVar == this.i) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    private final boolean Y(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x >= brg.a && x <= getWidth() && y >= brg.a && y <= getHeight()) {
            return true;
        }
        return false;
    }

    private final boolean Z(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.I) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    private static final int aa(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            return i;
        }
        return 0;
    }

    private static final boolean ab(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private static final boolean ac(MotionEvent motionEvent) {
        boolean z;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) < 2139095040) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) < 2139095040 && (Build.VERSION.SDK_INT < 29 || ddh.a.a(motionEvent, i))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private static final long ad(int i, int i2) {
        return i2 | (i << 32);
    }

    private static final long ae(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return ad(size, size);
                }
                throw new IllegalStateException();
            }
            return ad(0, Integer.MAX_VALUE);
        }
        return ad(0, size);
    }

    public final int A(MotionEvent motionEvent) {
        int i = 0;
        if (this.aF) {
            this.aF = false;
            this.g.b(motionEvent.getMetaState());
        }
        cre a2 = this.ag.a(motionEvent, this);
        if (a2 != null) {
            List list = a2.a;
            int size = list.size() - 1;
            Object obj = null;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    Object obj2 = list.get(size);
                    if (((crf) obj2).e) {
                        obj = obj2;
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            crf crfVar = (crf) obj;
            if (crfVar != null) {
                this.R = crfVar.d;
            }
            i = this.ah.a(a2, this, Y(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i & 1) == 0) {
                this.ag.b(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return i;
            }
        } else {
            this.ah.b();
        }
        return i;
    }

    public final cjp B() {
        if (isFocused()) {
            return this.d.d();
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return cih.b(findFocus, this);
    }

    public final b C() {
        return (b) this.as.a();
    }

    public final dbz D() {
        if (this.aj == null) {
            dbz dbzVar = new dbz(getContext());
            this.aj = dbzVar;
            addView(dbzVar);
            requestLayout();
        }
        dbz dbzVar2 = this.aj;
        dbzVar2.getClass();
        return dbzVar2;
    }

    public final void E(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int e;
        if (d.F(str, this.k.t)) {
            int e2 = this.k.C.e(i);
            if (e2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, e2);
                return;
            }
            return;
        }
        if (d.F(str, this.k.u) && (e = this.k.D.e(i)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, e);
        }
    }

    public final void F(cyz cyzVar, boolean z) {
        if (!z) {
            if (!this.ae) {
                this.ac.remove(cyzVar);
                List list = this.ad;
                if (list != null) {
                    list.remove(cyzVar);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.ae) {
            this.ac.add(cyzVar);
            return;
        }
        List list2 = this.ad;
        if (list2 == null) {
            list2 = new ArrayList();
            this.ad = list2;
        }
        list2.add(cyzVar);
    }

    public final void G() {
        if (!isFocused() && !hasFocus()) {
            return;
        }
        super.clearFocus();
    }

    public final void H() {
        if (!this.aq) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.ap) {
                this.ap = currentAnimationTimeMillis;
                W();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.an);
                int[] iArr = this.an;
                float f = iArr[0];
                float f2 = iArr[1];
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.an;
                float f3 = iArr2[0];
                float f4 = iArr2[1];
                this.ar = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f2 - f4) & 4294967295L);
            }
        }
    }

    public final void I() {
        this.ai = true;
    }

    public final void J(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i8 >= i4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            float f = pointerCoords.x;
            float f2 = pointerCoords.y;
            long b2 = b((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (b2 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (b2 & 4294967295L));
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        cre a2 = this.ag.a(obtain, this);
        a2.getClass();
        this.ah.a(a2, this, true);
        obtain.recycle();
    }

    public final void K() {
        getLocationOnScreen(this.an);
        long j = this.am;
        int a2 = dre.a(j);
        int b2 = dre.b(j);
        int[] iArr = this.an;
        boolean z = false;
        int i = iArr[0];
        if (a2 != i || b2 != iArr[1]) {
            this.am = (i << 32) | (iArr[1] & 4294967295L);
            if (a2 != Integer.MAX_VALUE && b2 != Integer.MAX_VALUE) {
                this.i.x.r.q();
                z = true;
            }
        }
        this.v.b(z);
    }

    public final boolean M(cib cibVar, cjp cjpVar) {
        Rect rect;
        Integer d;
        if (!isFocused() && !hasFocus()) {
            int i = 130;
            if (cibVar != null && (d = cih.d(cibVar.a)) != null) {
                i = d.intValue();
            }
            if (cjpVar != null) {
                rect = clv.a(cjpVar);
            } else {
                rect = null;
            }
            return super.requestFocus(i, rect);
        }
        return true;
    }

    public final void N(cyz cyzVar) {
        if (this.u != null) {
            Method method = dep.a;
        }
        der derVar = this.K;
        derVar.a();
        derVar.a.n(new WeakReference(cyzVar, derVar.b));
    }

    @Override // defpackage.cqm
    public final void a(float[] fArr) {
        H();
        cll.d(fArr, this.w);
        dbh.b(fArr, Float.intBitsToFloat((int) (this.ar >> 32)), Float.intBitsToFloat((int) (this.ar & 4294967295L)), this.ao);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        cgj cgjVar = this.q;
        if (cgjVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue m374m = ex$$ExternalSyntheticApiModelOutline1.m374m(sparseArray.get(keyAt));
                isText = m374m.isText();
                if (!isText) {
                    isDate = m374m.isDate();
                    if (!isDate) {
                        isList = m374m.isList();
                        if (!isList) {
                            isToggle = m374m.isToggle();
                            if (isToggle) {
                                throw new armn("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                            }
                        } else {
                            throw new armn("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                    } else {
                        throw new armn("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                } else {
                    textValue = m374m.getTextValue();
                    textValue.toString();
                    if (((cgn) cgjVar.b.a.get(Integer.valueOf(keyAt))) != null) {
                        throw null;
                    }
                }
            }
        }
    }

    @Override // defpackage.crs
    public final long b(long j) {
        H();
        long a2 = cll.a(this.w, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (a2 >> 32)) + Float.intBitsToFloat((int) (this.ar >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a2 & 4294967295L)) + Float.intBitsToFloat((int) (this.ar & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // defpackage.crs
    public final long c(long j) {
        H();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.ar >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.ar & 4294967295L));
        return cll.a(this.x, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.k.B(false, i, this.R);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.k.B(true, i, this.R);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            U(this.i);
        }
        cza.b(this);
        ces.a.c();
        this.ae = true;
        cks cksVar = this.ab;
        cjw cjwVar = cksVar.a;
        Canvas canvas2 = cjwVar.a;
        cjwVar.a = canvas;
        this.i.K(cjwVar, null);
        cksVar.a.a = canvas2;
        if (!this.ac.isEmpty()) {
            int size = this.ac.size();
            for (int i = 0; i < size; i++) {
                ((cyz) this.ac.get(i)).j();
            }
        }
        if (dep.d) {
            int save = canvas.save();
            canvas.clipRect(brg.a, brg.a, brg.a, brg.a);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.ac.clear();
        this.ae = false;
        List list = this.ad;
        if (list != null) {
            this.ac.addAll(list);
            list.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [cbh] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [cbh] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [cbh] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [cbh] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r14v14, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r14v15, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r14v16, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r14v17, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [cbh] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [cbh] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        float scaledVerticalScrollFactor;
        float scaledHorizontalScrollFactor;
        csd csdVar;
        int size;
        cyk cykVar;
        cwr cwrVar;
        cyk cykVar2;
        if (this.M) {
            removeCallbacks(this.aC);
            if (motionEvent.getActionMasked() == 8) {
                this.M = false;
            } else {
                this.aC.run();
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            if (!ac(motionEvent) && isAttachedToWindow()) {
                if (motionEvent.isFromSource(4194304)) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    float f = -motionEvent.getAxisValue(26);
                    getContext();
                    scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
                    getContext();
                    scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
                    csf csfVar = new csf(f * scaledVerticalScrollFactor, f * scaledHorizontalScrollFactor, motionEvent.getEventTime(), motionEvent.getDeviceId());
                    FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.d;
                    if (!focusOwnerImpl.d.b()) {
                        FocusTargetNode a2 = cje.a(focusOwnerImpl.c);
                        if (a2 != null) {
                            cga.c cVar = a2.p;
                            if (cVar.z) {
                                cxn e = cwp.e(a2);
                                loop0: while (true) {
                                    if (e != null) {
                                        if ((e.w.e.r & 16384) != 0) {
                                            while (cVar != null) {
                                                if ((cVar.q & 16384) != 0) {
                                                    ?? r7 = 0;
                                                    cwrVar = cVar;
                                                    while (cwrVar != 0) {
                                                        if (cwrVar instanceof csd) {
                                                            break loop0;
                                                        }
                                                        if ((cwrVar.q & 16384) != 0 && (cwrVar instanceof cwr)) {
                                                            cga.c cVar2 = cwrVar.B;
                                                            int i = 0;
                                                            cwrVar = cwrVar;
                                                            r7 = r7;
                                                            while (cVar2 != null) {
                                                                if ((cVar2.q & 16384) != 0) {
                                                                    i++;
                                                                    r7 = r7;
                                                                    if (i == 1) {
                                                                        cwrVar = cVar2;
                                                                    } else {
                                                                        if (r7 == 0) {
                                                                            r7 = new cbh(new cga.c[16]);
                                                                        }
                                                                        if (cwrVar != 0) {
                                                                            r7.n(cwrVar);
                                                                        }
                                                                        r7.n(cVar2);
                                                                        cwrVar = 0;
                                                                    }
                                                                }
                                                                cVar2 = cVar2.t;
                                                                cwrVar = cwrVar;
                                                                r7 = r7;
                                                            }
                                                            if (i != 1) {
                                                            }
                                                        }
                                                        cwrVar = cwp.a(r7);
                                                    }
                                                }
                                                cVar = cVar.s;
                                            }
                                        }
                                        e = e.t();
                                        if (e != null && (cykVar2 = e.w) != null) {
                                            cVar = cykVar2.d;
                                        } else {
                                            cVar = null;
                                        }
                                    } else {
                                        cwrVar = 0;
                                        break;
                                    }
                                }
                                csdVar = (csd) cwrVar;
                            } else {
                                throw new IllegalStateException("visitAncestors called on an unattached node");
                            }
                        } else {
                            csdVar = null;
                        }
                        if (csdVar == null) {
                            return false;
                        }
                        if (csdVar.A().z) {
                            cga.c cVar3 = csdVar.A().s;
                            cxn e2 = cwp.e(csdVar);
                            ArrayList arrayList = null;
                            while (e2 != null) {
                                if ((e2.w.e.r & 16384) != 0) {
                                    while (cVar3 != null) {
                                        if ((cVar3.q & 16384) != 0) {
                                            cga.c cVar4 = cVar3;
                                            cbh cbhVar = null;
                                            while (cVar4 != null) {
                                                if (cVar4 instanceof csd) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(cVar4);
                                                } else if ((cVar4.q & 16384) != 0 && (cVar4 instanceof cwr)) {
                                                    int i2 = 0;
                                                    for (cga.c cVar5 = ((cwr) cVar4).B; cVar5 != null; cVar5 = cVar5.t) {
                                                        if ((cVar5.q & 16384) != 0) {
                                                            i2++;
                                                            if (i2 == 1) {
                                                                cVar4 = cVar5;
                                                            } else {
                                                                if (cbhVar == null) {
                                                                    cbhVar = new cbh(new cga.c[16]);
                                                                }
                                                                if (cVar4 != null) {
                                                                    cbhVar.n(cVar4);
                                                                }
                                                                cbhVar.n(cVar5);
                                                                cVar4 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i2 != 1) {
                                                    }
                                                }
                                                cVar4 = cwp.a(cbhVar);
                                            }
                                        }
                                        cVar3 = cVar3.s;
                                    }
                                }
                                e2 = e2.t();
                                if (e2 != null && (cykVar = e2.w) != null) {
                                    cVar3 = cykVar.d;
                                } else {
                                    cVar3 = null;
                                }
                            }
                            if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i3 = size - 1;
                                    ((csd) arrayList.get(size)).b();
                                    if (i3 < 0) {
                                        break;
                                    }
                                    size = i3;
                                }
                            }
                            cwr A = csdVar.A();
                            ?? r0 = 0;
                            while (A != 0) {
                                if (A instanceof csd) {
                                } else if ((A.q & 16384) != 0 && (A instanceof cwr)) {
                                    cga.c cVar6 = A.B;
                                    int i4 = 0;
                                    r0 = r0;
                                    A = A;
                                    while (cVar6 != null) {
                                        if ((cVar6.q & 16384) != 0) {
                                            i4++;
                                            r0 = r0;
                                            if (i4 == 1) {
                                                A = cVar6;
                                            } else {
                                                if (r0 == 0) {
                                                    r0 = new cbh(new cga.c[16]);
                                                }
                                                if (A != 0) {
                                                    r0.n(A);
                                                }
                                                r0.n(cVar6);
                                                A = 0;
                                            }
                                        }
                                        cVar6 = cVar6.t;
                                        r0 = r0;
                                        A = A;
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                A = cwp.a(r0);
                            }
                            cwr A2 = csdVar.A();
                            ?? r02 = 0;
                            while (A2 != 0) {
                                if (A2 instanceof csd) {
                                    ((csd) A2).a(csfVar);
                                } else if ((A2.q & 16384) != 0 && (A2 instanceof cwr)) {
                                    cga.c cVar7 = A2.B;
                                    int i5 = 0;
                                    r02 = r02;
                                    A2 = A2;
                                    while (cVar7 != null) {
                                        if ((cVar7.q & 16384) != 0) {
                                            i5++;
                                            r02 = r02;
                                            if (i5 == 1) {
                                                A2 = cVar7;
                                            } else {
                                                if (r02 == 0) {
                                                    r02 = new cbh(new cga.c[16]);
                                                }
                                                if (A2 != 0) {
                                                    r02.n(A2);
                                                }
                                                r02.n(cVar7);
                                                A2 = 0;
                                            }
                                        }
                                        cVar7 = cVar7.t;
                                        r02 = r02;
                                        A2 = A2;
                                    }
                                    if (i5 != 1) {
                                    }
                                }
                                A2 = cwp.a(r02);
                            }
                            if (arrayList == null) {
                                return false;
                            }
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ((csd) arrayList.get(i6)).a(csfVar);
                            }
                            return false;
                        }
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
                }
                if ((Q(motionEvent) & 1) == 0) {
                    return false;
                }
                return true;
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.M) {
            removeCallbacks(this.aC);
            this.aC.run();
        }
        if (!ac(motionEvent) && isAttachedToWindow()) {
            das dasVar = this.k;
            if (dasVar.F()) {
                int action = motionEvent.getAction();
                int i = Integer.MIN_VALUE;
                if (action != 7 && action != 9) {
                    if (action == 10) {
                        if (dasVar.c != Integer.MIN_VALUE) {
                            dasVar.A(Integer.MIN_VALUE);
                        } else {
                            dasVar.b.D().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    cza.b(dasVar.b);
                    cxa cxaVar = new cxa();
                    cxn cxnVar = dasVar.b.i;
                    long floatToRawIntBits = Float.floatToRawIntBits(x);
                    long floatToRawIntBits2 = Float.floatToRawIntBits(y);
                    arqg arqgVar = cxn.b;
                    cxnVar.ar((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), cxaVar, true);
                    int z = aqjn.z(cxaVar);
                    while (true) {
                        if (z < 0) {
                            break;
                        }
                        cxn e = cwp.e(cxaVar.get(z));
                        if (((drx) dasVar.b.D().b.get(e)) != null) {
                            break;
                        }
                        if (e.w.j(8)) {
                            int m = dasVar.m(e.d);
                            dhe b2 = dhf.b(e, false);
                            if (ddx.g(b2)) {
                                dgy e2 = b2.e();
                                dhn dhnVar = dhh.a;
                                if (!e2.d(dhh.w)) {
                                    i = m;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        z--;
                    }
                    dasVar.b.D().dispatchGenericMotionEvent(motionEvent);
                    dasVar.A(i);
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && Y(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.I;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.I = MotionEvent.obtainNoHistory(motionEvent);
                    this.M = true;
                    postDelayed(this.aC, 8L);
                    return false;
                }
            } else if (!Z(motionEvent)) {
                return false;
            }
            if ((Q(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            this.g.b(keyEvent.getMetaState());
            if (this.d.f(keyEvent, cim.a) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }
        return this.d.f(keyEvent, new AnonymousClass3(keyEvent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [cbh] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [cbh] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        cpy cpyVar;
        int size;
        cyk cykVar;
        cwr cwrVar;
        cyk cykVar2;
        if (isFocused()) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.d;
            if (focusOwnerImpl.d.b()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                FocusTargetNode a2 = cje.a(focusOwnerImpl.c);
                if (a2 != null) {
                    cga.c cVar = a2.p;
                    if (cVar.z) {
                        cxn e = cwp.e(a2);
                        loop0: while (true) {
                            if (e != null) {
                                if ((e.w.e.r & 131072) != 0) {
                                    while (cVar != null) {
                                        if ((cVar.q & 131072) != 0) {
                                            ?? r9 = 0;
                                            cwrVar = cVar;
                                            while (cwrVar != 0) {
                                                if (cwrVar instanceof cpy) {
                                                    break loop0;
                                                }
                                                if ((cwrVar.q & 131072) != 0 && (cwrVar instanceof cwr)) {
                                                    cga.c cVar2 = cwrVar.B;
                                                    int i = 0;
                                                    cwrVar = cwrVar;
                                                    r9 = r9;
                                                    while (cVar2 != null) {
                                                        if ((cVar2.q & 131072) != 0) {
                                                            i++;
                                                            r9 = r9;
                                                            if (i == 1) {
                                                                cwrVar = cVar2;
                                                            } else {
                                                                if (r9 == 0) {
                                                                    r9 = new cbh(new cga.c[16]);
                                                                }
                                                                if (cwrVar != 0) {
                                                                    r9.n(cwrVar);
                                                                }
                                                                r9.n(cVar2);
                                                                cwrVar = 0;
                                                            }
                                                        }
                                                        cVar2 = cVar2.t;
                                                        cwrVar = cwrVar;
                                                        r9 = r9;
                                                    }
                                                    if (i != 1) {
                                                    }
                                                }
                                                cwrVar = cwp.a(r9);
                                            }
                                        }
                                        cVar = cVar.s;
                                    }
                                }
                                e = e.t();
                                if (e != null && (cykVar2 = e.w) != null) {
                                    cVar = cykVar2.d;
                                } else {
                                    cVar = null;
                                }
                            } else {
                                cwrVar = 0;
                                break;
                            }
                        }
                        cpyVar = (cpy) cwrVar;
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                } else {
                    cpyVar = null;
                }
                if (cpyVar != null) {
                    if (cpyVar.A().z) {
                        cga.c cVar3 = cpyVar.A().s;
                        cxn e2 = cwp.e(cpyVar);
                        ArrayList arrayList = null;
                        while (e2 != null) {
                            if ((e2.w.e.r & 131072) != 0) {
                                while (cVar3 != null) {
                                    if ((cVar3.q & 131072) != 0) {
                                        cga.c cVar4 = cVar3;
                                        cbh cbhVar = null;
                                        while (cVar4 != null) {
                                            if (cVar4 instanceof cpy) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(cVar4);
                                            } else if ((cVar4.q & 131072) != 0 && (cVar4 instanceof cwr)) {
                                                int i2 = 0;
                                                for (cga.c cVar5 = ((cwr) cVar4).B; cVar5 != null; cVar5 = cVar5.t) {
                                                    if ((cVar5.q & 131072) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            cVar4 = cVar5;
                                                        } else {
                                                            if (cbhVar == null) {
                                                                cbhVar = new cbh(new cga.c[16]);
                                                            }
                                                            if (cVar4 != null) {
                                                                cbhVar.n(cVar4);
                                                            }
                                                            cbhVar.n(cVar5);
                                                            cVar4 = null;
                                                        }
                                                    }
                                                }
                                                if (i2 != 1) {
                                                }
                                            }
                                            cVar4 = cwp.a(cbhVar);
                                        }
                                    }
                                    cVar3 = cVar3.s;
                                }
                            }
                            e2 = e2.t();
                            if (e2 != null && (cykVar = e2.w) != null) {
                                cVar3 = cykVar.d;
                            } else {
                                cVar3 = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i3 = size - 1;
                                if (((cpy) arrayList.get(size)).b()) {
                                    break;
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size = i3;
                            }
                        }
                        cwr A = cpyVar.A();
                        ?? r3 = 0;
                        while (true) {
                            if (A != 0) {
                                if (A instanceof cpy) {
                                    if (((cpy) A).b()) {
                                        break;
                                    }
                                } else if ((A.q & 131072) != 0 && (A instanceof cwr)) {
                                    cga.c cVar6 = A.B;
                                    int i4 = 0;
                                    A = A;
                                    r3 = r3;
                                    while (cVar6 != null) {
                                        if ((cVar6.q & 131072) != 0) {
                                            i4++;
                                            r3 = r3;
                                            if (i4 == 1) {
                                                A = cVar6;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new cbh(new cga.c[16]);
                                                }
                                                if (A != 0) {
                                                    r3.n(A);
                                                }
                                                r3.n(cVar6);
                                                A = 0;
                                            }
                                        }
                                        cVar6 = cVar6.t;
                                        A = A;
                                        r3 = r3;
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                A = cwp.a(r3);
                            } else {
                                cwr A2 = cpyVar.A();
                                ?? r32 = 0;
                                while (true) {
                                    if (A2 != 0) {
                                        if (A2 instanceof cpy) {
                                            if (((cpy) A2).a()) {
                                                break;
                                            }
                                        } else if ((A2.q & 131072) != 0 && (A2 instanceof cwr)) {
                                            cga.c cVar7 = A2.B;
                                            int i5 = 0;
                                            A2 = A2;
                                            r32 = r32;
                                            while (cVar7 != null) {
                                                if ((cVar7.q & 131072) != 0) {
                                                    i5++;
                                                    r32 = r32;
                                                    if (i5 == 1) {
                                                        A2 = cVar7;
                                                    } else {
                                                        if (r32 == 0) {
                                                            r32 = new cbh(new cga.c[16]);
                                                        }
                                                        if (A2 != 0) {
                                                            r32.n(A2);
                                                        }
                                                        r32.n(cVar7);
                                                        A2 = 0;
                                                    }
                                                }
                                                cVar7 = cVar7.t;
                                                A2 = A2;
                                                r32 = r32;
                                            }
                                            if (i5 != 1) {
                                            }
                                        }
                                        A2 = cwp.a(r32);
                                    } else if (arrayList != null) {
                                        int size2 = arrayList.size();
                                        for (int i6 = 0; i6 < size2; i6++) {
                                            if (((cpy) arrayList.get(i6)).a()) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            dba.a.a(viewStructure, this);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.M) {
            removeCallbacks(this.aC);
            MotionEvent motionEvent2 = this.I;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && !ab(motionEvent, motionEvent2)) {
                this.M = false;
            } else {
                this.aC.run();
            }
        }
        if (ac(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !Z(motionEvent))) {
            return false;
        }
        int Q = Q(motionEvent);
        if ((Q & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((Q & 1) == 0) {
            return false;
        }
        return true;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = R(i, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        cjp b2;
        int i2;
        if (view != null && !this.v.c) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
            if (view == this) {
                b2 = this.d.d();
                if (b2 == null) {
                    b2 = cih.b(view, this);
                }
            } else {
                b2 = cih.b(view, this);
            }
            cib a2 = cih.a(i);
            if (a2 != null) {
                i2 = a2.a;
            } else {
                i2 = 6;
            }
            arsb arsbVar = new arsb();
            if (this.d.e(i2, b2, new AnonymousClass10(arsbVar)) != null) {
                Object obj = arsbVar.a;
                if (obj == null) {
                    if (findNextFocus == null) {
                        return view;
                    }
                } else {
                    if (findNextFocus == null) {
                        return this;
                    }
                    if (cip.a(i2)) {
                        return super.focusSearch(view, i);
                    }
                    if (cjh.c(cje.c((FocusTargetNode) obj), cih.b(findNextFocus, this), b2, i2)) {
                        return this;
                    }
                }
                return findNextFocus;
            }
            return view;
        }
        return super.focusSearch(view, i);
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        this.t = a.a();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        arnb arnbVar;
        cjp B = B();
        if (B != null) {
            rect.left = Math.round(B.b);
            rect.top = Math.round(B.c);
            rect.right = Math.round(B.d);
            rect.bottom = Math.round(B.e);
            arnbVar = arnb.a;
        } else {
            arnbVar = null;
        }
        if (arnbVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.czb
    public final cze j() {
        return this.s;
    }

    @Override // defpackage.czb
    public final dli.a k() {
        return (dli.a) this.ay.a();
    }

    @Override // defpackage.czb
    public final dqv l() {
        return (dqv) this.T.a();
    }

    @Override // defpackage.czb
    public final drk m() {
        return (drk) this.aA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.czb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.arqv r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dai.AnonymousClass18
            if (r0 == 0) goto L13
            r0 = r6
            dai$18 r0 = (defpackage.dai.AnonymousClass18) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dai$18 r0 = new dai$18
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.aqil.P(r6)
            goto L42
        L2f:
            defpackage.aqil.P(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.ax
            dai$19 r2 = new dai$19
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = defpackage.cgg.b(r6, r2, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            armj r5 = new armj
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dai.n(arqv, arpe):java.lang.Object");
    }

    @Override // defpackage.czb
    public final void o(cxn cxnVar, boolean z) {
        this.v.e(cxnVar, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        enh N;
        enm enmVar;
        super.onAttachedToWindow();
        this.g.c(hasWindowFocus());
        V(this.i);
        U(this.i);
        this.s.a.d();
        cgj cgjVar = this.q;
        if (cgjVar != null) {
            cgjVar.c.registerCallback(cgl.a);
        }
        enm c = dyx.c(this);
        gjz bl = gvf.bl(this);
        b C = C();
        enh enhVar = null;
        if (C == null || (c != null && bl != null && (c != (enmVar = C.a) || bl != enmVar))) {
            if (c != null) {
                if (bl != null) {
                    if (C != null && (N = C.a.N()) != null) {
                        N.d(this);
                    }
                    c.N().c(this);
                    b bVar = new b(c, bl);
                    this.z.h(bVar);
                    arqr arqrVar = this.A;
                    if (arqrVar != null) {
                        arqrVar.a(bVar);
                    }
                    this.A = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        cpq cpqVar = this.F;
        int i = 1;
        if (true != isInTouchMode()) {
            i = 2;
        }
        cpqVar.b(i);
        b C2 = C();
        if (C2 != null) {
            enhVar = C2.a.N();
        }
        if (enhVar != null) {
            enhVar.c(this);
            enhVar.c(this.l);
            getViewTreeObserver().addOnGlobalLayoutListener(this.at);
            getViewTreeObserver().addOnScrollChangedListener(this.au);
            getViewTreeObserver().addOnTouchModeChangeListener(this.av);
            if (Build.VERSION.SDK_INT >= 31) {
                dbe.a.b(this);
                return;
            }
            return;
        }
        csg.a("No lifecycle owner exists");
        throw new armj();
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        dbq dbqVar = (dbq) cgg.a(this.ax);
        if (dbqVar == null) {
            return this.aw.c;
        }
        dcz dczVar = (dcz) cgg.a(dbqVar.c);
        if (dczVar != null && !dczVar.e) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T.h(dqr.a(getContext()));
        if (aa(configuration) != this.az) {
            this.az = aa(configuration);
            this.ay.h(dlm.a(getContext()));
        }
        this.p.a(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r12.b != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bc A[Catch: all -> 0x03fd, TryCatch #0 {all -> 0x03fd, blocks: (B:98:0x01ad, B:100:0x01bc, B:103:0x01fb, B:105:0x0207, B:106:0x0244, B:109:0x029f, B:111:0x02a5, B:113:0x02ad, B:115:0x02bc, B:116:0x02c3, B:118:0x02cb, B:120:0x02d3, B:121:0x02f3, B:122:0x02da, B:124:0x02e0, B:125:0x02e7, B:127:0x02ed, B:128:0x02fd, B:130:0x0317, B:132:0x0320, B:134:0x0328, B:135:0x0388, B:137:0x038e, B:138:0x0395, B:140:0x03d5, B:141:0x03e0, B:144:0x03db, B:145:0x0385, B:146:0x024e, B:148:0x0254, B:149:0x025c, B:152:0x0264, B:155:0x026c, B:158:0x0276, B:161:0x0280, B:164:0x028a, B:167:0x0295, B:170:0x03ed, B:171:0x03f4, B:172:0x020c, B:173:0x021b, B:175:0x0221, B:177:0x022d, B:179:0x01c3, B:182:0x01cb, B:185:0x01d3, B:188:0x01db, B:191:0x01e3, B:194:0x01eb, B:197:0x01f3, B:200:0x03f5, B:201:0x03fc), top: B:97:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb A[Catch: all -> 0x03fd, TryCatch #0 {all -> 0x03fd, blocks: (B:98:0x01ad, B:100:0x01bc, B:103:0x01fb, B:105:0x0207, B:106:0x0244, B:109:0x029f, B:111:0x02a5, B:113:0x02ad, B:115:0x02bc, B:116:0x02c3, B:118:0x02cb, B:120:0x02d3, B:121:0x02f3, B:122:0x02da, B:124:0x02e0, B:125:0x02e7, B:127:0x02ed, B:128:0x02fd, B:130:0x0317, B:132:0x0320, B:134:0x0328, B:135:0x0388, B:137:0x038e, B:138:0x0395, B:140:0x03d5, B:141:0x03e0, B:144:0x03db, B:145:0x0385, B:146:0x024e, B:148:0x0254, B:149:0x025c, B:152:0x0264, B:155:0x026c, B:158:0x0276, B:161:0x0280, B:164:0x028a, B:167:0x0295, B:170:0x03ed, B:171:0x03f4, B:172:0x020c, B:173:0x021b, B:175:0x0221, B:177:0x022d, B:179:0x01c3, B:182:0x01cb, B:185:0x01d3, B:188:0x01db, B:191:0x01e3, B:194:0x01eb, B:197:0x01f3, B:200:0x03f5, B:201:0x03fc), top: B:97:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0317 A[Catch: all -> 0x03fd, TryCatch #0 {all -> 0x03fd, blocks: (B:98:0x01ad, B:100:0x01bc, B:103:0x01fb, B:105:0x0207, B:106:0x0244, B:109:0x029f, B:111:0x02a5, B:113:0x02ad, B:115:0x02bc, B:116:0x02c3, B:118:0x02cb, B:120:0x02d3, B:121:0x02f3, B:122:0x02da, B:124:0x02e0, B:125:0x02e7, B:127:0x02ed, B:128:0x02fd, B:130:0x0317, B:132:0x0320, B:134:0x0328, B:135:0x0388, B:137:0x038e, B:138:0x0395, B:140:0x03d5, B:141:0x03e0, B:144:0x03db, B:145:0x0385, B:146:0x024e, B:148:0x0254, B:149:0x025c, B:152:0x0264, B:155:0x026c, B:158:0x0276, B:161:0x0280, B:164:0x028a, B:167:0x0295, B:170:0x03ed, B:171:0x03f4, B:172:0x020c, B:173:0x021b, B:175:0x0221, B:177:0x022d, B:179:0x01c3, B:182:0x01cb, B:185:0x01d3, B:188:0x01db, B:191:0x01e3, B:194:0x01eb, B:197:0x01f3, B:200:0x03f5, B:201:0x03fc), top: B:97:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038e A[Catch: all -> 0x03fd, TryCatch #0 {all -> 0x03fd, blocks: (B:98:0x01ad, B:100:0x01bc, B:103:0x01fb, B:105:0x0207, B:106:0x0244, B:109:0x029f, B:111:0x02a5, B:113:0x02ad, B:115:0x02bc, B:116:0x02c3, B:118:0x02cb, B:120:0x02d3, B:121:0x02f3, B:122:0x02da, B:124:0x02e0, B:125:0x02e7, B:127:0x02ed, B:128:0x02fd, B:130:0x0317, B:132:0x0320, B:134:0x0328, B:135:0x0388, B:137:0x038e, B:138:0x0395, B:140:0x03d5, B:141:0x03e0, B:144:0x03db, B:145:0x0385, B:146:0x024e, B:148:0x0254, B:149:0x025c, B:152:0x0264, B:155:0x026c, B:158:0x0276, B:161:0x0280, B:164:0x028a, B:167:0x0295, B:170:0x03ed, B:171:0x03f4, B:172:0x020c, B:173:0x021b, B:175:0x0221, B:177:0x022d, B:179:0x01c3, B:182:0x01cb, B:185:0x01d3, B:188:0x01db, B:191:0x01e3, B:194:0x01eb, B:197:0x01f3, B:200:0x03f5, B:201:0x03fc), top: B:97:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d5 A[Catch: all -> 0x03fd, TryCatch #0 {all -> 0x03fd, blocks: (B:98:0x01ad, B:100:0x01bc, B:103:0x01fb, B:105:0x0207, B:106:0x0244, B:109:0x029f, B:111:0x02a5, B:113:0x02ad, B:115:0x02bc, B:116:0x02c3, B:118:0x02cb, B:120:0x02d3, B:121:0x02f3, B:122:0x02da, B:124:0x02e0, B:125:0x02e7, B:127:0x02ed, B:128:0x02fd, B:130:0x0317, B:132:0x0320, B:134:0x0328, B:135:0x0388, B:137:0x038e, B:138:0x0395, B:140:0x03d5, B:141:0x03e0, B:144:0x03db, B:145:0x0385, B:146:0x024e, B:148:0x0254, B:149:0x025c, B:152:0x0264, B:155:0x026c, B:158:0x0276, B:161:0x0280, B:164:0x028a, B:167:0x0295, B:170:0x03ed, B:171:0x03f4, B:172:0x020c, B:173:0x021b, B:175:0x0221, B:177:0x022d, B:179:0x01c3, B:182:0x01cb, B:185:0x01d3, B:188:0x01db, B:191:0x01e3, B:194:0x01eb, B:197:0x01f3, B:200:0x03f5, B:201:0x03fc), top: B:97:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03db A[Catch: all -> 0x03fd, TryCatch #0 {all -> 0x03fd, blocks: (B:98:0x01ad, B:100:0x01bc, B:103:0x01fb, B:105:0x0207, B:106:0x0244, B:109:0x029f, B:111:0x02a5, B:113:0x02ad, B:115:0x02bc, B:116:0x02c3, B:118:0x02cb, B:120:0x02d3, B:121:0x02f3, B:122:0x02da, B:124:0x02e0, B:125:0x02e7, B:127:0x02ed, B:128:0x02fd, B:130:0x0317, B:132:0x0320, B:134:0x0328, B:135:0x0388, B:137:0x038e, B:138:0x0395, B:140:0x03d5, B:141:0x03e0, B:144:0x03db, B:145:0x0385, B:146:0x024e, B:148:0x0254, B:149:0x025c, B:152:0x0264, B:155:0x026c, B:158:0x0276, B:161:0x0280, B:164:0x028a, B:167:0x0295, B:170:0x03ed, B:171:0x03f4, B:172:0x020c, B:173:0x021b, B:175:0x0221, B:177:0x022d, B:179:0x01c3, B:182:0x01cb, B:185:0x01d3, B:188:0x01db, B:191:0x01e3, B:194:0x01eb, B:197:0x01f3, B:200:0x03f5, B:201:0x03fc), top: B:97:0x01ad }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r20) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dai.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        dhe dheVar;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j : jArr) {
            cgq cgqVar = this.l;
            ddw ddwVar = (ddw) cgqVar.a().a((int) j);
            if (ddwVar != null && (dheVar = ddwVar.a) != null) {
                dai daiVar = cgqVar.a;
                int i = dheVar.e;
                autofillId = daiVar.getAutofillId();
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(autofillId, i);
                dhn dhnVar = dhh.a;
                List list = (List) dgz.a(dheVar.c, dhh.x);
                if (list != null) {
                    forText = TranslationRequestValue.forText(new dhv(dru.d(list, "\n", null, 62)));
                    builder.setValue("android:text", forText);
                    build = builder.build();
                    consumer.q(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        enh enhVar;
        super.onDetachedFromWindow();
        cze czeVar = this.s;
        czeVar.a.e();
        czeVar.a.a();
        b C = C();
        if (C != null) {
            enhVar = C.a.N();
        } else {
            enhVar = null;
        }
        if (enhVar != null) {
            enhVar.d(this.l);
            enhVar.d(this);
            cgj cgjVar = this.q;
            if (cgjVar != null) {
                cgjVar.c.unregisterCallback(cgl.a);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.at);
            getViewTreeObserver().removeOnScrollChangedListener(this.au);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.av);
            if (Build.VERSION.SDK_INT >= 31) {
                dbe.a.a(this);
                return;
            }
            return;
        }
        csg.a("No lifecycle owner exists");
        throw new armj();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.O.a();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            cin cinVar = this.d;
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) cinVar;
            cjc cjcVar = focusOwnerImpl.e;
            if (!cjcVar.b) {
                try {
                    cjcVar.b();
                    cjd.f(((FocusOwnerImpl) cinVar).c, true);
                    return;
                } finally {
                    cjcVar.d();
                }
            }
            cjd.f(focusOwnerImpl.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.ap = 0L;
        this.v.i(this.aD);
        this.ak = null;
        K();
        if (this.aj != null) {
            D().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0054, code lost:
    
        if (defpackage.a.bB(r3.a, r9) == false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dai.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        cgj cgjVar;
        AutofillId autofillId;
        if (viewStructure != null && (cgjVar = this.q) != null) {
            int addChildCount = viewStructure.addChildCount(cgjVar.b.a.size());
            for (Map.Entry entry : cgjVar.b.a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                ViewStructure newChild = viewStructure.newChild(addChildCount);
                if (newChild != null) {
                    autofillId = viewStructure.getAutofillId();
                    autofillId.getClass();
                    newChild.setAutofillId(autofillId, intValue);
                    newChild.setId(intValue, cgjVar.a.getContext().getPackageName(), null, null);
                    newChild.setAutofillType(1);
                    throw null;
                }
                addChildCount++;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.S) {
            drk c = cih.c(i);
            if (c == null) {
                c = drk.a;
            }
            this.aA.h(c);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        dgk dgkVar;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (dgkVar = this.N) != null) {
            dhg dhgVar = this.j;
            arpi arpiVar = this.e;
            cbh cbhVar = new cbh(new dgl[16]);
            dgm.b(dhgVar.a(), 0, new dgh(cbhVar));
            cbhVar.j(new kdw(new arqr[]{dgi.a, dgj.a}, 14));
            int i = cbhVar.b;
            if (i == 0) {
                obj = null;
            } else {
                obj = cbhVar.a[i - 1];
            }
            dgl dglVar = (dgl) obj;
            if (dglVar != null) {
                dgc dgcVar = new dgc(dglVar.a, dglVar.c, arwi.e(arpiVar), dgkVar);
                cti ctiVar = dglVar.d;
                drg drgVar = dglVar.c;
                cjp d = ctj.d(ctiVar);
                long d2 = drgVar.d();
                ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, clv.b(drh.b(d)), new Point(dre.a(d2), dre.b(d2)), dgcVar);
                scrollCaptureTarget.setScrollBounds(clv.b(dglVar.c));
                consumer.q(scrollCaptureTarget);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(final LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        final cgq cgqVar = this.l;
        if (d.F(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            cgq.b.a(cgqVar, longSparseArray);
        } else {
            cgqVar.a.post(new Runnable() { // from class: cgr
                @Override // java.lang.Runnable
                public final void run() {
                    cgq.b.a(cgq.this, longSparseArray);
                }
            });
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean a2;
        this.g.c(z);
        this.aF = true;
        super.onWindowFocusChanged(z);
        if (z && this.t != (a2 = a.a())) {
            this.t = a2;
            U(this.i);
        }
    }

    @Override // defpackage.czb
    public final void p() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.Q == 0) {
                dbc.a.a(this, true);
            }
            this.Q++;
        }
    }

    @Override // defpackage.czb
    public final void q(boolean z) {
        arqg arqgVar;
        if (!this.v.h() && this.v.e.a.b == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                arqgVar = this.aD;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            arqgVar = null;
        }
        if (this.v.i(arqgVar)) {
            requestLayout();
        }
        cyd.k(this.v);
        T();
        Trace.endSection();
    }

    @Override // defpackage.czb
    public final void r(cxn cxnVar, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            cyd cydVar = this.v;
            if (!cxnVar.C) {
                if (d.F(cxnVar, cydVar.a)) {
                    csg.b("measureAndLayout called on root");
                }
                if (!cydVar.a.am()) {
                    csg.b("performMeasureAndLayout called with unattached root");
                }
                if (!cydVar.a.ew()) {
                    csg.b("performMeasureAndLayout called with unplaced root");
                }
                if (cydVar.c) {
                    csg.b("performMeasureAndLayout called during measure layout");
                }
                if (cydVar.h != null) {
                    cydVar.c = true;
                    cydVar.d = false;
                    try {
                        cydVar.b.e(cxnVar);
                        if ((cyd.l(cxnVar, new dqs(j)) || cxnVar.aj()) && d.F(cxnVar.A(), true)) {
                            cxnVar.R();
                        }
                        cydVar.d(cxnVar);
                        cyd.m(cxnVar, new dqs(j));
                        if (cxnVar.ai() && cxnVar.ew()) {
                            cxnVar.Z();
                            cydVar.e.b(cxnVar);
                        }
                        cydVar.c();
                        cydVar.c = false;
                        cydVar.d = false;
                        cxy cxyVar = cydVar.i;
                    } catch (Throwable th) {
                        cydVar.c = false;
                        cydVar.d = false;
                        throw th;
                    }
                }
                cydVar.a();
            }
            if (!this.v.h()) {
                cyd.k(this.v);
                T();
            }
            this.O.a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        cjp cjpVar;
        if (!isFocused()) {
            if (this.d.c().a()) {
                return super.requestFocus(i, rect);
            }
            cib a2 = cih.a(i);
            if (a2 != null) {
                i2 = a2.a;
            } else {
                i2 = 7;
            }
            cin cinVar = this.d;
            if (rect != null) {
                cjpVar = clv.d(rect);
            } else {
                cjpVar = null;
            }
            Boolean e = cinVar.e(i2, cjpVar, new AnonymousClass13(i2));
            if (e != null) {
                return e.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:23:0x0057, B:25:0x0071, B:28:0x0087, B:30:0x0095, B:32:0x00a1, B:34:0x00a7, B:36:0x00b7, B:44:0x00ca, B:46:0x00dd, B:48:0x00e5, B:51:0x00fa, B:68:0x012f, B:70:0x0147, B:72:0x014d, B:74:0x015a, B:76:0x0152, B:86:0x016a), top: B:22:0x0057 }] */
    @Override // defpackage.czb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dai.s():void");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.czb
    public final void t(cxn cxnVar) {
        das dasVar = this.k;
        dasVar.r = true;
        if (dasVar.D()) {
            dasVar.u(cxnVar);
        }
        cgq cgqVar = this.l;
        cgqVar.c = true;
        if (cgqVar.m()) {
            cgqVar.c(cxnVar);
        }
    }

    @Override // defpackage.czb
    public final void u(cxn cxnVar, boolean z, boolean z2, boolean z3) {
        cxn t;
        cxn t2;
        if (z) {
            cyd cydVar = this.v;
            if (cxnVar.k == null) {
                csg.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            cxn.a q = cxnVar.q();
            cxn.a aVar = cxn.a.a;
            int ordinal = q.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!cxnVar.ak() || z2) {
                                cxnVar.T();
                                cxnVar.U();
                                if (!cxnVar.C) {
                                    if ((!d.F(cxnVar.A(), true) && !cyd.o(cxnVar)) || ((t = cxnVar.t()) != null && t.ak())) {
                                        if ((cxnVar.ew() || cyd.n(cxnVar)) && ((t2 = cxnVar.t()) == null || !t2.al())) {
                                            cydVar.b.a(cxnVar, false);
                                        }
                                    } else {
                                        cydVar.b.a(cxnVar, true);
                                    }
                                    if (!cydVar.d && z3) {
                                        X(cxnVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new armm();
                    }
                } else {
                    return;
                }
            }
            cydVar.g.n(new cyd.a(cxnVar, true, z2));
            cxy cxyVar = cydVar.i;
            return;
        }
        if (this.v.j(cxnVar, z2) && z3) {
            X(cxnVar);
        }
    }

    @Override // defpackage.czb
    public final void v(cxn cxnVar, boolean z, boolean z2) {
        if (z) {
            cyd cydVar = this.v;
            cxn.a q = cxnVar.q();
            cxn.a aVar = cxn.a.a;
            int ordinal = q.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new armm();
                            }
                        }
                    }
                }
                cxy cxyVar = cydVar.i;
                return;
            }
            if ((!cxnVar.ak() && !cxnVar.aj()) || z2) {
                cxnVar.x.f();
                cxnVar.S();
                if (!cxnVar.C) {
                    cxn t = cxnVar.t();
                    if (d.F(cxnVar.A(), true) && ((t == null || !t.ak()) && (t == null || !t.aj()))) {
                        cydVar.b.a(cxnVar, true);
                    } else if (cxnVar.ew() && ((t == null || !t.ai()) && (t == null || !t.al()))) {
                        cydVar.b.a(cxnVar, false);
                    }
                    if (!cydVar.d) {
                        X(null);
                        return;
                    }
                    return;
                }
                return;
            }
            cxy cxyVar2 = cydVar.i;
            return;
        }
        cyd cydVar2 = this.v;
        cxn.a q2 = cxnVar.q();
        cxn.a aVar2 = cxn.a.a;
        int ordinal2 = q2.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
            if (ordinal2 == 4) {
                if (!z2 && cxnVar.ew() == cxnVar.an() && (cxnVar.al() || cxnVar.ai())) {
                    cxy cxyVar3 = cydVar2.i;
                    return;
                }
                cxnVar.S();
                if (!cxnVar.C && cxnVar.an()) {
                    cxn t2 = cxnVar.t();
                    if ((t2 == null || !t2.ai()) && (t2 == null || !t2.al())) {
                        cydVar2.b.a(cxnVar, false);
                    }
                    if (!cydVar2.d) {
                        X(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new armm();
        }
        cxy cxyVar4 = cydVar2.i;
    }

    @Override // defpackage.czb
    public final void w() {
        das dasVar = this.k;
        dasVar.r = true;
        if (dasVar.D() && !dasVar.w) {
            dasVar.w = true;
            dasVar.h.post(dasVar.x);
        }
        cgq cgqVar = this.l;
        cgqVar.c = true;
        if (cgqVar.m() && !cgqVar.f) {
            cgqVar.f = true;
            cgqVar.d.post(cgqVar.g);
        }
    }

    @Override // defpackage.czb
    public final void x(arqg arqgVar) {
        if (!this.aB.l(arqgVar)) {
            this.aB.n(arqgVar);
        }
    }

    @Override // defpackage.czb
    public final void y(cxn cxnVar) {
        this.v.e.b(cxnVar);
        X(null);
    }

    @Override // defpackage.czb
    public final void z() {
        this.af = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
