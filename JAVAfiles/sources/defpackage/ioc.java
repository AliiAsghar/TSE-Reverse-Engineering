package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioc {
    public View a;
    public View b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public final alhr g;
    public final xjo h;
    private final Activity i;
    private int j;
    private float k;

    public ioc(Activity activity, aabr aabrVar, xjo xjoVar) {
        activity.getClass();
        aabrVar.getClass();
        xjoVar.getClass();
        this.i = activity;
        this.h = xjoVar;
        this.d = true;
        this.e = this.k;
        this.f = 1.0f;
        alhr x = uuh.x(223336947, "enable_set_toolbar_visibility_by_alpha");
        x.getClass();
        this.g = x;
    }

    private final void e(boolean z, float f, float f2, boolean z2) {
        View view = this.b;
        int i = 8;
        boolean z3 = false;
        if (view != null) {
            this.h.c(z);
            view.setTranslationY(f);
            view.setAlpha(f2);
            if (((Boolean) ((utz) this.g.get()).e()).booleanValue()) {
                if (true == z2) {
                    i = 0;
                }
                view.setVisibility(i);
            }
            if (f2 == 1.0f) {
                z3 = true;
            }
            c(z3);
        } else {
            View view2 = this.a;
            if (view2 != null) {
                this.h.c(z);
                view2.setTranslationY(f);
                view2.setAlpha(f2);
                if (((Boolean) ((utz) this.g.get()).e()).booleanValue()) {
                    if (true == z2) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                }
            }
        }
        this.c = z;
        this.e = f;
        this.f = f2;
        this.d = z2;
    }

    public final void a() {
        if (this.a == null) {
            View findViewById = this.i.findViewById(R.id.toolbar);
            if (findViewById != null) {
                if (findViewById.getMeasuredHeight() == 0) {
                    if (findViewById.getWidth() > 0 && findViewById.getHeight() > 0) {
                        findViewById.getWidth();
                        findViewById.getHeight();
                        a();
                    } else {
                        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ztb(findViewById, this, 1));
                    }
                } else {
                    this.a = findViewById;
                }
            }
            View view = this.a;
            if (view != null) {
                this.j = view.getMeasuredHeight() + abbu.d(this.i);
                this.k = view.getTranslationY();
            }
            View findViewById2 = this.i.findViewById(R.id.appBarLayout);
            if (findViewById2 != null) {
                this.b = findViewById2;
                this.j = findViewById2.getMeasuredHeight();
                this.k = findViewById2.getTranslationY();
            }
        }
    }

    public final void b() {
        e(false, this.k, 1.0f, true);
    }

    public final void c(boolean z) {
        if (this.b != null) {
            if (z) {
                this.i.getWindow().setStatusBarColor(0);
            } else {
                Activity activity = this.i;
                activity.getWindow().setStatusBarColor(ahnz.f(activity, android.R.attr.statusBarColor, "ToolbarController"));
            }
        }
    }

    public final void d(int i) {
        boolean z;
        a();
        View view = this.b;
        if (view == null) {
            view = this.a;
        }
        if (view != null) {
            int i2 = this.j;
            if (i < i2) {
                float q = arrn.q(i / i2, brg.a, 1.0f);
                int i3 = i - this.j;
                if (q > brg.a) {
                    z = true;
                } else {
                    z = false;
                }
                e(true, i3, q, z);
                return;
            }
            b();
        }
    }
}
