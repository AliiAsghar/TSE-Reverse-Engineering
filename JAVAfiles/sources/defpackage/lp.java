package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lp {
    public View d;
    public final qdq e;
    public int c = 0;
    public final lo a = new lo();
    public final List b = new ArrayList();

    public lp(qdq qdqVar) {
        this.e = qdqVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int U = this.e.U();
        int i2 = i;
        while (i2 < U) {
            int a = i - (i2 - this.a.a(i2));
            if (a == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a;
        }
        return -1;
    }

    public final int a() {
        return this.e.U() - this.b.size();
    }

    public final int b() {
        return this.e.U();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        int V = this.e.V(view);
        if (V == -1 || this.a.f(V)) {
            return -1;
        }
        return V - this.a.a(V);
    }

    public final View d(int i) {
        return this.e.W(m(i));
    }

    public final View e(int i) {
        return this.e.W(i);
    }

    public final void f(View view, int i, boolean z) {
        int m;
        if (i < 0) {
            m = this.e.U();
        } else {
            m = m(0);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        qdq qdqVar = this.e;
        ((RecyclerView) qdqVar.a).addView(view, m);
        oo k = RecyclerView.k(view);
        RecyclerView recyclerView = (RecyclerView) qdqVar.a;
        no noVar = recyclerView.l;
        if (noVar != null && k != null) {
            noVar.gH(k);
        }
        List list = recyclerView.v;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((ny) recyclerView.v.get(size)).c(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m;
        if (i < 0) {
            m = this.e.U();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        qdq qdqVar = this.e;
        oo k = RecyclerView.k(view);
        if (k != null) {
            if (!k.x() && !k.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + k + ((RecyclerView) qdqVar.a).o());
            }
            k.j();
        }
        ((RecyclerView) qdqVar.a).attachViewToParent(view, m, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        lo loVar = this.a;
        int m = m(i);
        loVar.g(m);
        qdq qdqVar = this.e;
        View W = qdqVar.W(m);
        if (W != null) {
            oo k = RecyclerView.k(W);
            if (k != null) {
                if (k.x() && !k.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + k + ((RecyclerView) qdqVar.a).o());
                }
                k.f(256);
            }
        } else {
            int i2 = RecyclerView.aa;
        }
        ((RecyclerView) qdqVar.a).detachViewFromParent(m);
    }

    public final void i(View view) {
        this.b.add(view);
        oo k = RecyclerView.k(view);
        if (k != null) {
            qdq qdqVar = this.e;
            int i = k.p;
            if (i != -1) {
                k.o = i;
            } else {
                k.o = k.a.getImportantForAccessibility();
            }
            ((RecyclerView) qdqVar.a).aE(k, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        int i2 = this.c;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    int m = m(i);
                    View W = this.e.W(m);
                    if (W != null) {
                        this.c = 1;
                        this.d = W;
                        if (this.a.g(m)) {
                            l(W);
                        }
                        this.e.Y(m);
                    }
                    return;
                } finally {
                    this.c = 0;
                    this.d = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.X(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
