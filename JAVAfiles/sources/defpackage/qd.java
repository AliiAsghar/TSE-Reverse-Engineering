package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qd {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    public jq g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public qd(Toolbar toolbar, boolean z) {
        boolean z2;
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.d = toolbar.o;
        this.l = toolbar.p;
        if (this.d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.k = z2;
        this.j = toolbar.e();
        ktk A = ktk.A(toolbar.getContext(), null, gc.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = A.p(15);
        if (z) {
            CharSequence r = A.r(27);
            if (!TextUtils.isEmpty(r)) {
                l(r);
            }
            CharSequence r2 = A.r(25);
            if (!TextUtils.isEmpty(r2)) {
                this.l = r2;
                if ((this.b & 8) != 0) {
                    toolbar.u(r2);
                }
            }
            Drawable p = A.p(20);
            if (p != null) {
                f(p);
            }
            Drawable p2 = A.p(17);
            if (p2 != null) {
                this.h = p2;
                w();
            }
            if (this.j == null && (drawable = this.o) != null) {
                k(drawable);
            }
            e(A.k(10, 0));
            int n = A.n(9, 0);
            if (n != 0) {
                d(LayoutInflater.from(toolbar.getContext()).inflate(n, (ViewGroup) toolbar, false));
                e(this.b | 16);
            }
            int m = A.m(13, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = m;
                toolbar.setLayoutParams(layoutParams);
            }
            int i2 = A.i(7, -1);
            int i3 = A.i(3, -1);
            if (i2 >= 0 || i3 >= 0) {
                int max = Math.max(i2, 0);
                int max2 = Math.max(i3, 0);
                toolbar.k();
                toolbar.n.a(max, max2);
            }
            int n2 = A.n(28, 0);
            if (n2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = n2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, n2);
                }
            }
            int n3 = A.n(26, 0);
            if (n3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = n3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, n3);
                }
            }
            int n4 = A.n(22, 0);
            if (n4 != 0) {
                toolbar.t(n4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        A.t();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                h(this.n);
            }
        }
        this.m = toolbar.h();
        toolbar.s(new qb(this));
    }

    private final void t(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.v(charSequence);
            if (this.k) {
                eek.o(this.a.getRootView(), charSequence);
            }
        }
    }

    private final void u() {
        CharSequence charSequence;
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.m)) {
                Toolbar toolbar = this.a;
                int i = this.n;
                if (i != 0) {
                    charSequence = toolbar.getContext().getText(i);
                } else {
                    charSequence = null;
                }
                toolbar.p(charSequence);
                return;
            }
            this.a.p(this.m);
        }
    }

    private final void v() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.j;
            if (drawable == null) {
                drawable = this.o;
            }
            toolbar.r(drawable);
            return;
        }
        this.a.r(null);
    }

    private final void w() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) != 0) {
            if ((i & 1) == 0 || (drawable = this.i) == null) {
                drawable = this.h;
            }
        } else {
            drawable = null;
        }
        this.a.o(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.e();
        }
    }

    public final void d(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public final void e(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    u();
                }
                v();
            }
            if ((i2 & 3) != 0) {
                w();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.v(this.d);
                    this.a.u(this.l);
                } else {
                    this.a.v(null);
                    this.a.u(null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.c) != null) {
                if ((i & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public final void f(Drawable drawable) {
        this.i = drawable;
        w();
    }

    public final void g() {
        this.f = true;
    }

    public final void h(int i) {
        String string;
        if (i == 0) {
            string = null;
        } else {
            string = a().getString(i);
        }
        i(string);
    }

    public final void i(CharSequence charSequence) {
        this.m = charSequence;
        u();
    }

    public final void j(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = d.f(a(), i);
        } else {
            drawable = null;
        }
        k(drawable);
    }

    public final void k(Drawable drawable) {
        this.j = drawable;
        v();
    }

    public final void l(CharSequence charSequence) {
        this.k = true;
        t(charSequence);
    }

    public final void m(int i) {
        this.a.setVisibility(i);
    }

    public final void n(CharSequence charSequence) {
        if (!this.k) {
            t(charSequence);
        }
    }

    public final boolean o() {
        return this.a.y();
    }

    public final boolean p() {
        jq jqVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null && (jqVar = actionMenuView.c) != null && jqVar.l()) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        return this.a.z();
    }

    public final boolean r() {
        return this.a.A();
    }

    public final efu s(int i, long j) {
        float f;
        if (i == 0) {
            f = 1.0f;
        } else {
            f = brg.a;
        }
        efu v = eek.v(this.a);
        v.e(f);
        v.f(j);
        v.g(new qc(this, i));
        return v;
    }
}
