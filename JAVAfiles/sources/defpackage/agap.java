package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agap implements agak, agar {
    static final /* synthetic */ artm[] a;
    public final Activity b;
    public final arwe c;
    public WeakReference d;
    public arxm e;
    public final Set f;
    public boolean g;
    public int h;
    public int i;
    public final agbv j;
    private final agau k;
    private final afke l;
    private final InputMethodManager m;
    private WeakReference n;
    private final arsn o;
    private final arsn p;
    private int q;
    private final arml r;
    private final ahcn s;

    static {
        arrr arrrVar = new arrr(agap.class, "detectionState", "getDetectionState()Lcom/google/android/libraries/compose/ui/keyboard/KeyboardManagerImpl$Companion$DetectionState;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar, new arrr(agap.class, "keyboardState", "getKeyboardState()Lcom/google/android/libraries/compose/ui/keyboard/KeyboardState;", 0)};
    }

    public agap(Activity activity, agau agauVar, agbv agbvVar, afke afkeVar, arwe arweVar, Optional optional) {
        activity.getClass();
        afkeVar.getClass();
        arweVar.getClass();
        this.b = activity;
        this.k = agauVar;
        this.j = agbvVar;
        this.l = afkeVar;
        this.c = arweVar;
        Object systemService = activity.getSystemService("input_method");
        systemService.getClass();
        this.m = (InputMethodManager) systemService;
        this.f = new LinkedHashSet();
        this.o = new agan(agam.a, this);
        this.p = new agao(agaq.d, this);
        this.s = new ahcn(new zay((Object) activity, 7, (byte[][]) null), new afyq(this, 7));
        this.q = o();
        this.h = -1;
        this.i = -1;
        this.r = armd.a(new afzg(optional, 7));
    }

    static /* synthetic */ void q(agap agapVar, agaq agaqVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            agaqVar = agapVar.r();
        }
        if ((i2 & 2) != 0) {
            i = agapVar.q;
        }
        if (agaqVar == agaq.a && i >= 0) {
            if (afzv.e(agapVar.b)) {
                agapVar.h = i;
            } else {
                agapVar.i = i;
            }
        }
        if (agaqVar != agaq.d) {
            agapVar.g = true;
        }
    }

    private final agaq r() {
        return (agaq) this.p.c(a[1]);
    }

    private final void s(afwv afwvVar) {
        this.o.d(a[0], afwvVar);
    }

    @Override // defpackage.agak
    public final int a() {
        int i;
        if (afzv.e(this.b)) {
            i = this.h;
        } else {
            i = this.i;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return ((Number) this.s.c()).intValue();
    }

    @Override // defpackage.agak
    public final int b() {
        return c(r());
    }

    @Override // defpackage.agak
    public final int c(agaq agaqVar) {
        agaqVar.getClass();
        agaq agaqVar2 = agaq.a;
        int ordinal = agaqVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                return 0;
            }
            throw new armm();
        }
        return this.q;
    }

    @Override // defpackage.agak
    public final agaq d() {
        return r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = r4.getWindowInsetsController();
     */
    @Override // defpackage.agak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            r4.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L2d
            android.app.Activity r0 = r3.b
            boolean r0 = defpackage.afzv.h(r0)
            if (r0 != 0) goto L2d
            android.view.WindowInsetsController r0 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r0 == 0) goto L2d
            int r1 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m()
            defpackage.anf$$ExternalSyntheticApiModelOutline0.m$1(r0, r1)
            arml r0 = r3.r
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            goto L37
        L2d:
            android.view.inputmethod.InputMethodManager r0 = r3.m
            android.os.IBinder r1 = r4.getWindowToken()
            r2 = 0
            r0.hideSoftInputFromWindow(r1, r2)
        L37:
            if (r5 == 0) goto L42
            boolean r5 = r4.hasFocus()
            if (r5 == 0) goto L42
            r4.clearFocus()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agap.e(android.view.View, boolean):void");
    }

    @Override // defpackage.agak
    public final void f(View view, boolean z) {
        WeakReference weakReference;
        WindowInsetsController windowInsetsController;
        view.getClass();
        if (z) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.d = weakReference;
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (Build.VERSION.SDK_INT <= 32) {
                this.m.isActive(view);
            }
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.show(anf$$ExternalSyntheticApiModelOutline0.m());
                return;
            }
        }
        this.m.showSoftInput(view, 0);
    }

    @Override // defpackage.agak
    public final void g() {
        a();
    }

    @Override // defpackage.agak
    public final boolean h() {
        return this.k.c();
    }

    @Override // defpackage.agak
    public final void i() {
        View currentFocus = this.b.getCurrentFocus();
        if (currentFocus != null) {
            this.n = new WeakReference(currentFocus);
        } else {
            currentFocus = this.b.getWindow().getDecorView().getRootView();
        }
        this.m.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // defpackage.agak
    public final void j() {
        View rootView;
        WeakReference weakReference = this.n;
        if (weakReference == null || (rootView = (View) weakReference.get()) == null) {
            rootView = this.b.getWindow().getDecorView().getRootView();
        }
        this.n = null;
        this.m.showSoftInput(rootView, 0);
    }

    @Override // defpackage.agak
    public final void k(agar agarVar) {
        agarVar.getClass();
        if (this.f.isEmpty()) {
            this.g = false;
            this.l.d("KeyboardManagerImpl#attach", new afzg(this, 6));
            s(new agal(this.k));
        }
        this.f.add(agarVar);
    }

    @Override // defpackage.agar
    public final void l(int i) {
        p(i);
        q(this, null, i, 1);
        this.j.l(i);
    }

    @Override // defpackage.agar
    public final void m(agaq agaqVar) {
        agaqVar.getClass();
        this.p.d(a[1], agaqVar);
        q(this, agaqVar, 0, 2);
        this.j.m(agaqVar);
    }

    @Override // defpackage.agak
    public final void n(agar agarVar) {
        agarVar.getClass();
        if (this.f.remove(agarVar) && this.f.isEmpty()) {
            arxm arxmVar = this.e;
            if (arxmVar != null) {
                arxmVar.v(null);
            }
            this.e = null;
            s(agam.a);
        }
    }

    public final int o() {
        return this.b.getResources().getDimensionPixelSize(R.dimen.keyboard_height_fallback);
    }

    public final void p(int i) {
        if (this.q != i) {
            this.q = i;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((agar) it.next()).l(i);
            }
        }
    }
}
