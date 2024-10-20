package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class it {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final ij e;
    private final boolean f;
    private final int g;
    private boolean h;
    private iu i;
    private is j;
    private final PopupWindow.OnDismissListener k;

    public it(Context context, ij ijVar, View view, boolean z) {
        this(context, ijVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final is a() {
        is jbVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                jbVar = new id(this.d, this.a, this.g, this.f);
            } else {
                jbVar = new jb(this.d, this.e, this.a, this.g, this.f);
            }
            jbVar.j(this.e);
            jbVar.p(this.k);
            jbVar.l(this.a);
            jbVar.d(this.i);
            jbVar.m(this.h);
            jbVar.n(this.b);
            this.j = jbVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        is isVar = this.j;
        if (isVar != null) {
            isVar.m(z);
        }
    }

    public final void e(iu iuVar) {
        this.i = iuVar;
        is isVar = this.j;
        if (isVar != null) {
            isVar.d(iuVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        is a = a();
        a.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.o(i);
            a.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            a.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        a.s();
    }

    public final boolean g() {
        is isVar = this.j;
        if (isVar != null && isVar.u()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }

    public it(Context context, ij ijVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new afpq(this, 1);
        this.d = context;
        this.e = ijVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
