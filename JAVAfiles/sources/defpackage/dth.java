package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dth extends czt {
    private static final arqr j = AnonymousClass2.a;
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public dtm d;
    public drk e;
    public final byn f;
    public final byn g;
    public final cas h;
    public final int[] i;
    private arqg k;
    private dtn l;
    private final dtj m;
    private drg n;
    private final float o;
    private final Rect p;
    private final cfc q;
    private Object r;
    private final byn s;
    private boolean t;

    /* compiled from: PG */
    /* renamed from: dth$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<dth, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dth dthVar = (dth) obj;
            if (dthVar.isAttachedToWindow()) {
                dthVar.m();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dth$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            dth.this.b((bwj) obj, a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dth$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cti a = dth.this.a();
            if (a == null || !a.r()) {
                a = null;
            }
            boolean z = false;
            if (a != null && dth.this.c() != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: dth$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<arqg<? extends arnb>, arnb> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            Looper looper;
            final arqg arqgVar = (arqg) obj;
            Handler handler = dth.this.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                arqgVar.a();
            } else {
                Handler handler2 = dth.this.getHandler();
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: dti
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
    /* renamed from: dth$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<arnb> {
        final /* synthetic */ arsa a;
        final /* synthetic */ dth b;
        final /* synthetic */ drg c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(arsa arsaVar, dth dthVar, drg drgVar, long j, long j2) {
            super(0);
            this.a = arsaVar;
            this.b = dthVar;
            this.c = drgVar;
            this.d = j;
            this.e = j2;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            dth dthVar = this.b;
            this.a.a = dthVar.d.a(this.c, this.d, dthVar.e, this.e);
            return arnb.a;
        }
    }

    public dth(arqg arqgVar, dtn dtnVar, View view, dqv dqvVar, dtm dtmVar, UUID uuid, dtj dtjVar) {
        super(view.getContext(), null, 0, 6, null);
        this.k = arqgVar;
        this.l = dtnVar;
        this.a = view;
        this.m = dtjVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.b = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = dsu.a(this.l, d.aM(view));
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.c = layoutParams;
        this.d = dtmVar;
        this.e = drk.a;
        this.f = new byu(null, cav.a);
        this.g = new byu(null, cav.a);
        this.h = new bxd(new AnonymousClass4(), null);
        this.o = 8.0f;
        this.p = new Rect();
        this.q = new cfc(new AnonymousClass5());
        setId(android.R.id.content);
        dyx.d(this, dyx.c(view));
        dyy.o(this, dyy.n(view));
        gvf.bm(this, gvf.bl(view));
        Objects.toString(uuid);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:".concat(String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(dqvVar.em(8.0f));
        setOutlineProvider(new ViewOutlineProvider() { // from class: dth.1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(brg.a);
            }
        });
        this.s = new byu(dtc.a, cav.a);
        this.i = new int[2];
    }

    public final cti a() {
        return (cti) this.g.a();
    }

    @Override // defpackage.czt
    public final void b(bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(-857613600);
        if (i4 == 0) {
            if (true != c.I(this)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c.L()) {
            c.v();
        } else {
            ((arqv) this.s.a()).a(c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(i);
        }
    }

    public final dri c() {
        return (dri) this.f.a();
    }

    @Override // defpackage.czt
    protected final boolean d() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.l.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                arqg arqgVar = this.k;
                if (arqgVar != null) {
                    arqgVar.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.czt
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.c.width = childAt.getMeasuredWidth();
        this.c.height = childAt.getMeasuredHeight();
        this.m.c(this.b, this, this.c);
    }

    @Override // defpackage.czt
    public final void h(int i, int i2) {
        super.h(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    public final void k(bwr bwrVar, arqv arqvVar) {
        super.i(bwrVar);
        this.s.h(arqvVar);
        this.t = true;
    }

    public final void l() {
        cti a = a();
        if (a != null) {
            if (true != a.r()) {
                a = null;
            }
            if (a != null) {
                long g = a.g();
                long b = ctj.b(a);
                drg a2 = drh.a((Math.round(Float.intBitsToFloat((int) (b >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L), g);
                if (!d.F(a2, this.n)) {
                    this.n = a2;
                    m();
                }
            }
        }
    }

    public final void m() {
        dri c;
        drg drgVar = this.n;
        if (drgVar != null && (c = c()) != null) {
            Rect rect = this.p;
            this.m.a(this.a, rect);
            drg drgVar2 = new drg(rect.left, rect.top, rect.right, rect.bottom);
            long b = drgVar2.b();
            long a = drgVar2.a();
            arsa arsaVar = new arsa();
            arsaVar.a = 0L;
            long j2 = (b << 32) | (a & 4294967295L);
            this.q.c(this, j, new AnonymousClass6(arsaVar, this, drgVar, j2, c.a));
            this.c.x = dre.a(arsaVar.a);
            this.c.y = dre.b(arsaVar.a);
            if (this.l.e) {
                this.m.b(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
            this.m.c(this.b, this, this.c);
        }
    }

    public final void n(arqg arqgVar, dtn dtnVar, drk drkVar) {
        int i;
        this.k = arqgVar;
        if (!d.F(this.l, dtnVar)) {
            this.l = dtnVar;
            this.c.flags = dsu.a(dtnVar, d.aM(this.a));
            this.m.c(this.b, this, this.c);
        }
        drk drkVar2 = drk.a;
        int ordinal = drkVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new armm();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.czt, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r3 = this;
            super.onAttachedToWindow()
            cfc r0 = r3.q
            r0.d()
            dtn r0 = r3.l
            boolean r0 = r0.c
            if (r0 == 0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L15
            goto L36
        L15:
            java.lang.Object r0 = r3.r
            if (r0 != 0) goto L22
            arqg r0 = r3.k
            dta r1 = new dta
            r1.<init>()
            r3.r = r1
        L22:
            java.lang.Object r0 = r3.r
            boolean r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m120m(r0)
            if (r1 == 0) goto L36
            android.window.OnBackInvokedDispatcher r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r3)
            if (r1 == 0) goto L36
            r2 = 1000000(0xf4240, float:1.401298E-39)
            defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r1, r2, r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dth.onAttachedToWindow():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDetachedFromWindow() {
        /*
            r2 = this;
            super.onDetachedFromWindow()
            cfc r0 = r2.q
            r0.e()
            cfc r0 = r2.q
            r0.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L24
            java.lang.Object r0 = r2.r
            boolean r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m120m(r0)
            if (r1 == 0) goto L24
            android.window.OnBackInvokedDispatcher r1 = defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r2)
            if (r1 == 0) goto L24
            defpackage.bo$$ExternalSyntheticApiModelOutline0.m(r1, r0)
        L24:
            r0 = 0
            r2.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dth.onDetachedFromWindow():void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < brg.a || motionEvent.getX() >= getWidth() || motionEvent.getY() < brg.a || motionEvent.getY() >= getHeight())) {
            arqg arqgVar = this.k;
            if (arqgVar != null) {
                arqgVar.a();
                return true;
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            arqg arqgVar2 = this.k;
            if (arqgVar2 != null) {
                arqgVar2.a();
                return true;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}
