package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gb extends en implements jj {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    ga f;
    hm g;
    hl h;
    public int i;
    public boolean j;
    boolean k;
    public boolean l;
    public hv m;
    boolean n;
    final eer o;
    final eer p;
    qd q;
    final qdq r;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;

    public gb(Activity activity, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.i = 0;
        this.j = true;
        this.z = true;
        this.o = new fy(this);
        this.p = new fz(this);
        this.r = new qdq(this, null);
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (!z && !z2) {
            return true;
        }
        return false;
    }

    private final void e(View view) {
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.apps.messaging.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((gb) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    edx.c(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(com.google.android.apps.messaging.R.id.action_bar);
        if (findViewById instanceof Toolbar) {
            this.q = ((Toolbar) findViewById).B();
            this.d = (ActionBarContextView) view.findViewById(com.google.android.apps.messaging.R.id.action_context_bar);
            ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.apps.messaging.R.id.action_bar_container);
            this.c = actionBarContainer;
            qd qdVar = this.q;
            if (qdVar != null && this.d != null && actionBarContainer != null) {
                this.a = qdVar.a();
                if ((this.q.b & 4) != 0) {
                    this.v = true;
                }
                Context context = this.a;
                int i2 = context.getApplicationInfo().targetSdkVersion;
                ef.k(context);
                f();
                TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, gc.a, com.google.android.apps.messaging.R.attr.actionBarStyle, 0);
                if (obtainStyledAttributes.getBoolean(14, false)) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                    if (actionBarOverlayLayout2.d) {
                        this.n = true;
                        actionBarOverlayLayout2.l(true);
                    } else {
                        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    }
                }
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
                if (dimensionPixelSize != 0) {
                    setElevation(dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                return;
            }
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        if (findViewById != null) {
            str = findViewById.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    private final void f() {
        this.q.a.requestLayout();
        this.b.e = false;
    }

    public final void a(boolean z) {
        efu s2;
        efu g;
        long j;
        if (z) {
            if (!this.y) {
                this.y = true;
                c(false);
            }
        } else if (this.y) {
            this.y = false;
            c(false);
        }
        if (this.c.isLaidOut()) {
            if (z) {
                g = this.q.s(4, 100L);
                s2 = this.d.g(0, 200L);
            } else {
                s2 = this.q.s(0, 200L);
                g = this.d.g(8, 100L);
            }
            hv hvVar = new hv();
            hvVar.a.add(g);
            View view = (View) ((WeakReference) g.a).get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) ((WeakReference) s2.a).get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            hvVar.a.add(s2);
            hvVar.b();
            return;
        }
        if (z) {
            this.q.m(4);
            this.d.setVisibility(0);
        } else {
            this.q.m(0);
            this.d.setVisibility(8);
        }
    }

    public final void b(int i, int i2) {
        qd qdVar = this.q;
        int i3 = qdVar.b;
        if ((i2 & 4) != 0) {
            this.v = true;
        }
        qdVar.e((i & i2) | ((~i2) & i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r6) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb.c(boolean):void");
    }

    @Override // defpackage.en
    public final boolean collapseActionView() {
        qd qdVar = this.q;
        if (qdVar != null && qdVar.o()) {
            qdVar.b();
            return true;
        }
        return false;
    }

    @Override // defpackage.en
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z != this.w) {
            this.w = z;
            int size = this.x.size();
            for (int i = 0; i < size; i++) {
                ((em) this.x.get(i)).a();
            }
        }
    }

    @Override // defpackage.en
    public final View getCustomView() {
        return this.q.c;
    }

    @Override // defpackage.en
    public final int getDisplayOptions() {
        return this.q.b;
    }

    @Override // defpackage.en
    public final Context getThemedContext() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.u = new ContextThemeWrapper(this.a, i);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    @Override // defpackage.en
    public final void hide() {
        if (!this.k) {
            this.k = true;
            c(false);
        }
    }

    @Override // defpackage.en
    public final boolean isShowing() {
        int height = this.c.getHeight();
        if (!this.z) {
            return false;
        }
        if (height != 0 && this.b.a() >= height) {
            return false;
        }
        return true;
    }

    @Override // defpackage.en
    public final void onConfigurationChanged(Configuration configuration) {
        ef.k(this.a);
        f();
    }

    @Override // defpackage.en
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        int i2;
        ga gaVar = this.f;
        if (gaVar == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        ij ijVar = gaVar.a;
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        ijVar.setQwertyMode(z);
        return ijVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.en
    public final void setBackgroundDrawable(Drawable drawable) {
        ActionBarContainer actionBarContainer = this.c;
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.b);
        }
        actionBarContainer.b = drawable;
        drawable.setCallback(actionBarContainer);
        boolean z = false;
        if (actionBarContainer.a != null) {
            drawable.setBounds(0, 0, actionBarContainer.getMeasuredWidth(), actionBarContainer.getMeasuredHeight());
        }
        if (!actionBarContainer.e ? !(actionBarContainer.b != null || actionBarContainer.c != null) : actionBarContainer.d == null) {
            z = true;
        }
        actionBarContainer.setWillNotDraw(z);
        actionBarContainer.invalidate();
        actionBarContainer.invalidateOutline();
    }

    @Override // defpackage.en
    public final void setCustomView(int i) {
        this.q.d(LayoutInflater.from(getThemedContext()).inflate(i, (ViewGroup) this.q.a, false));
    }

    @Override // defpackage.en
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (!this.v) {
            setDisplayHomeAsUpEnabled(z);
        }
    }

    @Override // defpackage.en
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 4;
        }
        b(i, 4);
    }

    @Override // defpackage.en
    public final void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.v = true;
        }
        this.q.e(i);
    }

    @Override // defpackage.en
    public final void setDisplayShowCustomEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 16;
        }
        b(i, 16);
    }

    @Override // defpackage.en
    public final void setDisplayShowHomeEnabled(boolean z) {
        b(2, 2);
    }

    @Override // defpackage.en
    public final void setDisplayShowTitleEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 8;
        }
        b(i, 8);
    }

    @Override // defpackage.en
    public final void setElevation(float f) {
        edz.j(this.c, f);
    }

    @Override // defpackage.en
    public final void setHomeActionContentDescription(int i) {
        this.q.h(com.google.android.apps.messaging.R.string.action_back);
    }

    @Override // defpackage.en
    public final void setHomeAsUpIndicator(int i) {
        this.q.j(i);
    }

    @Override // defpackage.en
    public final void setLogo(Drawable drawable) {
        this.q.f(null);
    }

    @Override // defpackage.en
    public final void setShowHideAnimationEnabled(boolean z) {
        hv hvVar;
        this.A = z;
        if (!z && (hvVar = this.m) != null) {
            hvVar.a();
        }
    }

    @Override // defpackage.en
    public final void setTitle(int i) {
        setTitle(this.a.getString(i));
    }

    @Override // defpackage.en
    public final void setWindowTitle(CharSequence charSequence) {
        this.q.n(charSequence);
    }

    @Override // defpackage.en
    public final void show() {
        if (this.k) {
            this.k = false;
            c(false);
        }
    }

    @Override // defpackage.en
    public final hm startActionMode(hl hlVar) {
        ga gaVar = this.f;
        if (gaVar != null) {
            gaVar.f();
        }
        this.b.l(false);
        this.d.i();
        ga gaVar2 = new ga(this, this.d.getContext(), hlVar);
        gaVar2.a.s();
        try {
            if (gaVar2.b.c(gaVar2, gaVar2.a)) {
                this.f = gaVar2;
                gaVar2.g();
                this.d.h(gaVar2);
                a(true);
                return gaVar2;
            }
            return null;
        } finally {
            gaVar2.a.r();
        }
    }

    @Override // defpackage.en
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.q.i(charSequence);
    }

    @Override // defpackage.en
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.q.k(drawable);
    }

    @Override // defpackage.en
    public final void setTitle(CharSequence charSequence) {
        this.q.l(charSequence);
    }

    @Override // defpackage.en
    public final void setCustomView(View view, el elVar) {
        view.setLayoutParams(elVar);
        this.q.d(view);
    }

    public gb(Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.i = 0;
        this.j = true;
        this.z = true;
        this.o = new fy(this);
        this.p = new fz(this);
        this.r = new qdq(this, null);
        e(dialog.getWindow().getDecorView());
    }
}
