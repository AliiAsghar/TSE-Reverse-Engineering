package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class id extends is implements View.OnKeyListener, PopupWindow.OnDismissListener, iv {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private iu y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new ja(this, 1);
    private final View.OnAttachStateChangeListener m = new ib(this, 0);
    private final ne n = new ic(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public id(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        if (this.q.getLayoutDirection() != 1) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(defpackage.ij r17) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id.z(ij):void");
    }

    @Override // defpackage.iv
    public final void c(ij ijVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ijVar == ((apuv) this.b.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.b.size()) {
                ((ij) ((apuv) this.b.get(i2)).b).i(false);
            }
            apuv apuvVar = (apuv) this.b.remove(i);
            ((ij) apuvVar.b).m(this);
            if (this.f) {
                ((ng) apuvVar.c).q.setExitTransition(null);
                ((nd) apuvVar.c).q.setAnimationStyle(0);
            }
            ((nd) apuvVar.c).k();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.r = ((apuv) this.b.get(size2 - 1)).a;
            } else {
                this.r = y();
            }
            if (size2 == 0) {
                k();
                iu iuVar = this.y;
                if (iuVar != null) {
                    iuVar.a(ijVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.m);
                this.z.onDismiss();
                return;
            }
            if (z) {
                ((ij) ((apuv) this.b.get(0)).b).i(false);
            }
        }
    }

    @Override // defpackage.iv
    public final void d(iu iuVar) {
        this.y = iuVar;
    }

    @Override // defpackage.iz
    public final ListView dy() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((apuv) this.b.get(r0.size() - 1)).C();
    }

    @Override // defpackage.iv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.iv
    public final boolean f(jc jcVar) {
        for (apuv apuvVar : this.b) {
            if (jcVar == apuvVar.b) {
                apuvVar.C().requestFocus();
                return true;
            }
        }
        if (jcVar.hasVisibleItems()) {
            j(jcVar);
            iu iuVar = this.y;
            if (iuVar != null) {
                iuVar.b(jcVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.iv
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((apuv) it.next()).C().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.is
    public final void j(ij ijVar) {
        ijVar.h(this, this.h);
        if (u()) {
            z(ijVar);
        } else {
            this.l.add(ijVar);
        }
    }

    @Override // defpackage.iz
    public final void k() {
        int size = this.b.size();
        if (size > 0) {
            apuv[] apuvVarArr = (apuv[]) this.b.toArray(new apuv[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    apuv apuvVar = apuvVarArr[size];
                    if (((nd) apuvVar.c).u()) {
                        ((nd) apuvVar.c).k();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.is
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.is
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.is
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.is
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        apuv apuvVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                apuvVar = (apuv) this.b.get(i);
                if (!((nd) apuvVar.c).u()) {
                    break;
                } else {
                    i++;
                }
            } else {
                apuvVar = null;
                break;
            }
        }
        if (apuvVar != null) {
            ((ij) apuvVar.b).i(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.is
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.is
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.iz
    public final void s() {
        if (!u()) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                z((ij) it.next());
            }
            this.l.clear();
            View view = this.q;
            this.d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    @Override // defpackage.is
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.iz
    public final boolean u() {
        if (this.b.size() <= 0 || !((nd) ((apuv) this.b.get(0)).c).u()) {
            return false;
        }
        return true;
    }
}
