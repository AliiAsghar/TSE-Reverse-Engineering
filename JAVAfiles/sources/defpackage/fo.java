package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fo extends fa implements LayoutInflater.Factory2, ih {
    private static final vl O = new vl();
    private static final int[] P = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    public fm E;
    public boolean F;
    boolean G;
    public Configuration H;
    public int I;
    public boolean J;
    public int K;
    public Rect L;
    public Rect M;
    private CharSequence Q;
    private fn R;
    private TextView S;
    private boolean T;
    private boolean U;
    private boolean V;
    private fm[] W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private boolean ab;
    private fj ac;
    private fj ad;
    private boolean af;
    private AppCompatViewInflater ag;
    private OnBackInvokedDispatcher ah;
    private OnBackInvokedCallback ai;
    private fn aj;
    public final Object j;
    final Context k;
    public Window l;
    public fg m;
    final ey n;
    public en o;
    public MenuInflater p;
    public lu q;
    hm r;
    public ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public boolean w;
    ViewGroup x;
    public View y;
    boolean z;
    public efu N = null;
    public boolean v = true;
    private final Runnable ae = new bo(this, 8, null);

    public fo(Context context, Window window, ey eyVar, Object obj) {
        ex exVar = null;
        this.Z = -100;
        this.k = context;
        this.n = eyVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ex) {
                        exVar = (ex) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (exVar != null) {
                this.Z = ((fo) exVar.k()).Z;
            }
        }
        if (this.Z == -100) {
            vl vlVar = O;
            Integer num = (Integer) vlVar.get(this.j.getClass().getName());
            if (num != null) {
                this.Z = num.intValue();
                vlVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            T(window);
        }
        km.f();
    }

    private final fj R(Context context) {
        if (this.ad == null) {
            this.ad = new fh(this, context);
        }
        return this.ad;
    }

    private final fj S(Context context) {
        if (this.ac == null) {
            if (kkc.d == null) {
                Context applicationContext = context.getApplicationContext();
                kkc.d = new kkc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ac = new fk(this, kkc.d);
        }
        return this.ac;
    }

    private final void T(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof fg)) {
                fg fgVar = new fg(this, callback);
                this.m = fgVar;
                window.setCallback(fgVar);
                ktk z = ktk.z(this.k, null, P);
                Drawable q = z.q(0);
                if (q != null) {
                    window.setBackgroundDrawable(q);
                }
                z.t();
                this.l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.ah == null) {
                    Object obj = this.j;
                    if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                        onBackInvokedDispatcher = ((Activity) this.j).getOnBackInvokedDispatcher();
                        this.ah = onBackInvokedDispatcher;
                    } else {
                        this.ah = null;
                    }
                    H();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private final void U() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                T(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void V(int i2) {
        this.K = (1 << i2) | this.K;
        if (!this.J) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ae;
            int[] iArr = eek.a;
            decorView.postOnAnimation(runnable);
            this.J = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014c, code lost:
    
        if (r13.f != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W(defpackage.fm r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.W(fm, android.view.KeyEvent):void");
    }

    private final void X() {
        if (!this.w) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final void Y(boolean z) {
        Q(z, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(ij ijVar) {
        if (this.V) {
            return;
        }
        this.V = true;
        this.q.b();
        Window.Callback w = w();
        if (w != null && !this.G) {
            w.onPanelClosed(108, ijVar);
        }
        this.V = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(fm fmVar, boolean z) {
        ViewGroup viewGroup;
        lu luVar;
        if (z && fmVar.a == 0 && (luVar = this.q) != null && luVar.t()) {
            A(fmVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && fmVar.m && (viewGroup = fmVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                z(fmVar.a, fmVar, null);
            }
        }
        fmVar.k = false;
        fmVar.l = false;
        fmVar.m = false;
        fmVar.f = null;
        fmVar.n = true;
        if (this.E == fmVar) {
            this.E = null;
        }
        if (fmVar.a == 0) {
            H();
        }
    }

    public final void C(int i2) {
        fm O2 = O(i2);
        if (O2.h != null) {
            Bundle bundle = new Bundle();
            O2.h.o(bundle);
            if (bundle.size() > 0) {
                O2.p = bundle;
            }
            O2.h.s();
            O2.h.clear();
        }
        O2.o = true;
        O2.n = true;
        if ((i2 == 108 || i2 == 0) && this.q != null) {
            fm O3 = O(0);
            O3.k = false;
            L(O3, null);
        }
    }

    public final void D() {
        efu efuVar = this.N;
        if (efuVar != null) {
            efuVar.d();
        }
    }

    public final void E() {
        ViewGroup viewGroup;
        Context context;
        if (!this.w) {
            TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(gc.k);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    q(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    q(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    q(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    q(10);
                }
                this.C = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                U();
                this.l.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.k);
                if (!this.D) {
                    if (this.C) {
                        viewGroup = (ViewGroup) from.inflate(com.google.android.apps.messaging.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.A = false;
                        this.z = false;
                    } else if (this.z) {
                        TypedValue typedValue = new TypedValue();
                        this.k.getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new so(this.k, typedValue.resourceId);
                        } else {
                            context = this.k;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.google.android.apps.messaging.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        lu luVar = (lu) viewGroup.findViewById(com.google.android.apps.messaging.R.id.decor_content_parent);
                        this.q = luVar;
                        luVar.o(w());
                        if (this.A) {
                            this.q.d(109);
                        }
                        if (this.T) {
                            this.q.d(2);
                        }
                        if (this.U) {
                            this.q.d(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.B ? (ViewGroup) from.inflate(com.google.android.apps.messaging.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.google.android.apps.messaging.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    edz.k(viewGroup, new fb(this));
                    if (this.q == null) {
                        this.S = (TextView) viewGroup.findViewById(com.google.android.apps.messaging.R.id.title);
                    }
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.apps.messaging.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.l.setContentView(viewGroup);
                    contentFrameLayout.i = new qdq(this, null);
                    this.x = viewGroup;
                    CharSequence y = y();
                    if (!TextUtils.isEmpty(y)) {
                        lu luVar2 = this.q;
                        if (luVar2 != null) {
                            luVar2.p(y);
                        } else {
                            en enVar = this.o;
                            if (enVar != null) {
                                enVar.setWindowTitle(y);
                            } else {
                                TextView textView = this.S;
                                if (textView != null) {
                                    textView.setText(y);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.x.findViewById(R.id.content);
                    View decorView = this.l.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.k.obtainStyledAttributes(gc.k);
                    if (contentFrameLayout2.b == null) {
                        contentFrameLayout2.b = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
                    if (contentFrameLayout2.c == null) {
                        contentFrameLayout2.c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
                    if (obtainStyledAttributes2.hasValue(122)) {
                        if (contentFrameLayout2.d == null) {
                            contentFrameLayout2.d = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        if (contentFrameLayout2.e == null) {
                            contentFrameLayout2.e = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        if (contentFrameLayout2.f == null) {
                            contentFrameLayout2.f = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        if (contentFrameLayout2.g == null) {
                            contentFrameLayout2.g = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.w = true;
                    fm O2 = O(0);
                    if (!this.G && O2.h == null) {
                        V(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.z + ", windowActionBarOverlay: " + this.A + ", android:windowIsFloating: " + this.C + ", windowActionModeOverlay: " + this.B + ", windowNoTitle: " + this.D + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void F() {
        E();
        if (this.z && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new gb((Activity) obj, this.A);
            } else if (obj instanceof Dialog) {
                this.o = new gb((Dialog) obj);
            }
            en enVar = this.o;
            if (enVar != null) {
                enVar.setDefaultDisplayHomeAsUpEnabled(this.af);
            }
        }
    }

    @Override // defpackage.ih
    public final void G(ij ijVar) {
        lu luVar = this.q;
        if (luVar != null && luVar.q() && (!ViewConfiguration.get(this.k).hasPermanentMenuKey() || this.q.s())) {
            Window.Callback w = w();
            if (this.q.t()) {
                this.q.r();
                if (!this.G) {
                    w.onPanelClosed(108, O(0).h);
                    return;
                }
                return;
            }
            if (w != null && !this.G) {
                if (this.J && (1 & this.K) != 0) {
                    this.l.getDecorView().removeCallbacks(this.ae);
                    this.ae.run();
                }
                fm O2 = O(0);
                ij ijVar2 = O2.h;
                if (ijVar2 != null && !O2.o && w.onPreparePanel(0, O2.g, ijVar2)) {
                    w.onMenuOpened(108, O2.h);
                    this.q.v();
                    return;
                }
                return;
            }
            return;
        }
        fm O3 = O(0);
        O3.n = true;
        B(O3, false);
        W(O3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ah != null && (O(0).m || this.r != null)) {
                if (this.ai == null) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = this.ah;
                    pw pwVar = new pw(this, 1);
                    onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, pwVar);
                    this.ai = pwVar;
                    return;
                }
                return;
            }
            OnBackInvokedCallback onBackInvokedCallback = this.ai;
            if (onBackInvokedCallback != null) {
                this.ah.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                this.ai = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.I(android.view.KeyEvent):boolean");
    }

    public final boolean J() {
        boolean z = this.X;
        this.X = false;
        fm O2 = O(0);
        if (O2.m) {
            if (!z) {
                B(O2, true);
            }
            return true;
        }
        hm hmVar = this.r;
        if (hmVar != null) {
            hmVar.f();
            return true;
        }
        en b = b();
        if (b == null || !b.collapseActionView()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ih
    public final boolean K(ij ijVar, MenuItem menuItem) {
        fm v;
        Window.Callback w = w();
        if (w != null && !this.G && (v = v(ijVar.a())) != null) {
            return w.onMenuItemSelected(v.a, menuItem);
        }
        return false;
    }

    public final boolean L(fm fmVar, KeyEvent keyEvent) {
        boolean z;
        lu luVar;
        lu luVar2;
        Resources.Theme theme;
        int i2;
        boolean z2;
        lu luVar3;
        lu luVar4;
        if (this.G) {
            return false;
        }
        if (fmVar.k) {
            return true;
        }
        fm fmVar2 = this.E;
        if (fmVar2 != null && fmVar2 != fmVar) {
            B(fmVar2, false);
        }
        Window.Callback w = w();
        if (w != null) {
            fmVar.g = w.onCreatePanelView(fmVar.a);
        }
        int i3 = fmVar.a;
        if (i3 != 0 && i3 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (luVar4 = this.q) != null) {
            luVar4.n();
        }
        if (fmVar.g == null && (!z || !(this.o instanceof fv))) {
            ij ijVar = fmVar.h;
            if (ijVar == null || fmVar.o) {
                if (ijVar == null) {
                    Context context = this.k;
                    int i4 = fmVar.a;
                    if ((i4 == 0 || i4 == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            so soVar = new so(context, 0);
                            soVar.getTheme().setTo(theme);
                            context = soVar;
                        }
                    }
                    ij ijVar2 = new ij(context);
                    ijVar2.b = this;
                    fmVar.a(ijVar2);
                    if (fmVar.h == null) {
                        return false;
                    }
                }
                if (z && (luVar2 = this.q) != null) {
                    if (this.aj == null) {
                        this.aj = new fn(this, 1);
                    }
                    luVar2.m(fmVar.h, this.aj);
                }
                fmVar.h.s();
                if (!w.onCreatePanelMenu(fmVar.a, fmVar.h)) {
                    fmVar.a(null);
                    if (z && (luVar = this.q) != null) {
                        luVar.m(null, this.aj);
                    }
                    return false;
                }
                fmVar.o = false;
            }
            fmVar.h.s();
            Bundle bundle = fmVar.p;
            if (bundle != null) {
                fmVar.h.n(bundle);
                fmVar.p = null;
            }
            if (!w.onPreparePanel(0, fmVar.g, fmVar.h)) {
                if (z && (luVar3 = this.q) != null) {
                    luVar3.m(null, this.aj);
                }
                fmVar.h.r();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            fmVar.h.setQwertyMode(z2);
            fmVar.h.r();
        }
        fmVar.k = true;
        fmVar.l = false;
        this.E = fmVar;
        return true;
    }

    public final boolean M() {
        ViewGroup viewGroup;
        if (this.w && (viewGroup = this.x) != null && viewGroup.isLaidOut()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d9, code lost:
    
        if (r10.equals("Spinner") != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N(java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.N(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final fm O(int i2) {
        fm[] fmVarArr = this.W;
        if (fmVarArr == null || fmVarArr.length <= i2) {
            fm[] fmVarArr2 = new fm[i2 + 1];
            if (fmVarArr != null) {
                System.arraycopy(fmVarArr, 0, fmVarArr2, 0, fmVarArr.length);
            }
            this.W = fmVarArr2;
            fmVarArr = fmVarArr2;
        }
        fm fmVar = fmVarArr[i2];
        if (fmVar == null) {
            fm fmVar2 = new fm(i2);
            fmVarArr[i2] = fmVar2;
            return fmVar2;
        }
        return fmVar;
    }

    public final boolean P(fm fmVar, int i2, KeyEvent keyEvent) {
        ij ijVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!fmVar.k && !L(fmVar, keyEvent)) || (ijVar = fmVar.h) == null) {
            return false;
        }
        return ijVar.performShortcut(i2, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0163, code lost:
    
        if (r5 == false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.Q(boolean, boolean):void");
    }

    @Override // defpackage.fa
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.fa
    public final en b() {
        F();
        return this.o;
    }

    @Override // defpackage.fa
    public final View c(int i2) {
        E();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.fa
    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        ((ViewGroup) this.x.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.fa
    public final void e() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof fo)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.fa
    public final void f() {
        if (this.o != null && !b().invalidateOptionsMenu()) {
            V(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.fa.g
            monitor-enter(r0)
            defpackage.fa.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.J
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ae
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.G = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.j
            vl r1 = defpackage.fo.O
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5c
        L4d:
            java.lang.Object r0 = r3.j
            vl r1 = defpackage.fo.O
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5c:
            en r0 = r3.o
            if (r0 == 0) goto L63
            r0.onDestroy()
        L63:
            fj r0 = r3.ac
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            fj r0 = r3.ad
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.g():void");
    }

    @Override // defpackage.fa
    public final void h() {
        en b = b();
        if (b != null) {
            b.setShowHideAnimationEnabled(false);
        }
    }

    @Override // defpackage.fa
    public final void j(int i2) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.fa
    public final void k(View view) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.fa
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.fa
    public final void m(CharSequence charSequence) {
        this.Q = charSequence;
        lu luVar = this.q;
        if (luVar == null) {
            en enVar = this.o;
            if (enVar != null) {
                enVar.setWindowTitle(charSequence);
                return;
            }
            TextView textView = this.S;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        luVar.p(charSequence);
    }

    @Override // defpackage.fa
    public final void o() {
        Y(true);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return N(str, context, attributeSet);
    }

    @Override // defpackage.fa
    public final void p() {
        String str;
        this.F = true;
        Y(false);
        U();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                str = dxt.w((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                en enVar = this.o;
                if (enVar == null) {
                    this.af = true;
                } else {
                    enVar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized (fa.g) {
                fa.i(this);
                fa.f.add(new WeakReference(this));
            }
        }
        this.H = new Configuration(this.k.getResources().getConfiguration());
        this.Y = true;
    }

    @Override // defpackage.fa
    public final void q(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.D && i2 == 108) {
            return;
        }
        if (this.z && i2 == 1) {
            this.z = false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 5) {
                    if (i2 != 10) {
                        if (i2 != 108) {
                            if (i2 != 109) {
                                this.l.requestFeature(i2);
                                return;
                            } else {
                                X();
                                this.A = true;
                                return;
                            }
                        }
                        X();
                        this.z = true;
                        return;
                    }
                    X();
                    this.B = true;
                    return;
                }
                X();
                this.U = true;
                return;
            }
            X();
            this.T = true;
            return;
        }
        X();
        this.D = true;
    }

    public final int r() {
        int i2 = this.Z;
        if (i2 != -100) {
            return i2;
        }
        return fa.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int s(Context context, int i2) {
        Location location;
        long j;
        boolean z;
        boolean z2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        if (((fh) R(context)).a.isPowerSaveMode()) {
                            return 2;
                        }
                        return 1;
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                kkc kkcVar = ((fk) S(context)).b;
                long j2 = ((fx) kkcVar.a).b;
                Object obj = kkcVar.a;
                if (j2 > System.currentTimeMillis()) {
                    z2 = ((fx) obj).a;
                } else {
                    Location location2 = null;
                    if (dyi.c((Context) kkcVar.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        location = kkcVar.K("network");
                    } else {
                        location = null;
                    }
                    if (dyi.c((Context) kkcVar.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location2 = kkcVar.K("gps");
                    }
                    if (location2 == null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                        location = location2;
                    }
                    if (location != null) {
                        Object obj2 = kkcVar.a;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (fw.a == null) {
                            fw.a = new fw();
                        }
                        fw fwVar = fw.a;
                        fwVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        fwVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        int i3 = fwVar.d;
                        long j3 = fwVar.c;
                        long j4 = fwVar.b;
                        fwVar.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = fwVar.c;
                        if (j3 != -1 && j4 != -1) {
                            if (currentTimeMillis <= j4) {
                                if (currentTimeMillis > j3) {
                                    j5 = j4;
                                } else {
                                    j5 = j3;
                                }
                            }
                            j = j5 + 60000;
                        } else {
                            j = currentTimeMillis + 43200000;
                        }
                        if (1 != i3) {
                            z = false;
                        } else {
                            z = true;
                        }
                        fx fxVar = (fx) obj2;
                        fxVar.a = z;
                        fxVar.b = j;
                        z2 = ((fx) obj).a;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            return 2;
                        }
                        return 1;
                    }
                }
                if (z2) {
                    return 2;
                }
                return 1;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context t() {
        Context context;
        en b = b();
        if (b != null) {
            context = b.getThemedContext();
        } else {
            context = null;
        }
        if (context == null) {
            return this.k;
        }
        return context;
    }

    public final Configuration u(Context context, int i2, ebi ebiVar, Configuration configuration, boolean z) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i3 = 32;
            }
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = brg.a;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (ebiVar != null) {
            d.h(configuration2, ebiVar);
        }
        return configuration2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fm v(Menu menu) {
        int i2;
        fm[] fmVarArr = this.W;
        if (fmVarArr != null) {
            i2 = fmVarArr.length;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            fm fmVar = fmVarArr[i3];
            if (fmVar != null && fmVar.h == menu) {
                return fmVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback w() {
        return this.l.getCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ebi x(Context context) {
        ebi ebiVar;
        ebi b;
        Locale f;
        if (Build.VERSION.SDK_INT >= 33 || (ebiVar = fa.c) == null) {
            return null;
        }
        ebi g = d.g(context.getApplicationContext().getResources().getConfiguration());
        if (ebiVar.g()) {
            b = ebi.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i2 = 0; i2 < ebiVar.a() + g.a(); i2++) {
                if (i2 < ebiVar.a()) {
                    f = ebiVar.f(i2);
                } else {
                    f = g.f(i2 - ebiVar.a());
                }
                if (f != null) {
                    linkedHashSet.add(f);
                }
            }
            b = ebi.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        if (b.g()) {
            return g;
        }
        return b;
    }

    public final CharSequence y() {
        Object obj = this.j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(int i2, fm fmVar, Menu menu) {
        if (menu == null) {
            menu = fmVar.h;
        }
        if (fmVar.m && !this.G) {
            fg fgVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                fgVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                fgVar.b = false;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return N(str, context, attributeSet);
    }
}
