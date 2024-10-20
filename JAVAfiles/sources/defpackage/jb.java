package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jb extends is implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, iv {
    final ng a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final ij f;
    private final ig h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private iu o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new ja(this, 0);
    private final View.OnAttachStateChangeListener l = new ib(this, 2);
    private int s = 0;

    public jb(Context context, ij ijVar, View view, int i, boolean z) {
        this.e = context;
        this.f = ijVar;
        this.i = z;
        this.h = new ig(ijVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new ng(context, i);
        ijVar.h(this, context);
    }

    @Override // defpackage.iv
    public final void c(ij ijVar, boolean z) {
        if (ijVar == this.f) {
            k();
            iu iuVar = this.o;
            if (iuVar != null) {
                iuVar.a(ijVar, z);
            }
        }
    }

    @Override // defpackage.iv
    public final void d(iu iuVar) {
        this.o = iuVar;
    }

    @Override // defpackage.iz
    public final ListView dy() {
        return this.a.e;
    }

    @Override // defpackage.iv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.iv
    public final boolean f(jc jcVar) {
        if (jcVar.hasVisibleItems()) {
            it itVar = new it(this.e, jcVar, this.c, this.i, this.k);
            itVar.e(this.o);
            itVar.d(is.w(jcVar));
            itVar.c = this.m;
            this.m = null;
            this.f.i(false);
            ng ngVar = this.a;
            int i = ngVar.g;
            int b = ngVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!itVar.g()) {
                if (itVar.a != null) {
                    itVar.f(i, b, true, true);
                }
            }
            iu iuVar = this.o;
            if (iuVar != null) {
                iuVar.b(jcVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.iv
    public final void i() {
        this.q = false;
        ig igVar = this.h;
        if (igVar != null) {
            igVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.iz
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.is
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.is
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.is
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.is
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            k();
            return true;
        }
        return false;
    }

    @Override // defpackage.is
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.is
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.is
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.iz
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (!this.p && (view = this.n) != null) {
            this.c = view;
            this.a.v(this);
            ng ngVar = this.a;
            ngVar.m = this;
            ngVar.y();
            View view2 = this.c;
            ViewTreeObserver viewTreeObserver = this.d;
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            this.d = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.b);
            }
            view2.addOnAttachStateChangeListener(this.l);
            ng ngVar2 = this.a;
            ngVar2.l = view2;
            ngVar2.j = this.s;
            if (!this.q) {
                this.r = x(this.h, this.e, this.j);
                this.q = true;
            }
            this.a.r(this.r);
            this.a.x();
            this.a.t(this.g);
            this.a.s();
            mh mhVar = this.a.e;
            mhVar.setOnKeyListener(this);
            if (this.t && this.f.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) mhVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(this.f.e);
                }
                frameLayout.setEnabled(false);
                mhVar.addHeaderView(frameLayout, null, false);
            }
            this.a.e(this.h);
            this.a.s();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.iz
    public final boolean u() {
        if (!this.p && this.a.u()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.is
    public final void j(ij ijVar) {
    }
}
