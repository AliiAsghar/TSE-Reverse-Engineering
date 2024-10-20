package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ok {
    public RecyclerView h;
    public nw i;
    public boolean j;
    public boolean k;
    public View l;
    public boolean m;
    public int g = -1;
    private final oi a = new oi();

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void p(PointF pointF) {
        float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    protected abstract void g();

    protected abstract void i(int i, int i2, oi oiVar);

    protected abstract void j(View view, oi oiVar);

    public final int k() {
        return this.h.m.at();
    }

    public final int l(View view) {
        return this.h.fW(view);
    }

    public PointF m(int i) {
        Object obj = this.i;
        if (obj instanceof oj) {
            return ((oj) obj).Q(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(oj.class.getCanonicalName())));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i, int i2) {
        PointF m;
        RecyclerView recyclerView = this.h;
        if (this.g == -1 || recyclerView == null) {
            o();
        }
        if (this.j && this.l == null && this.i != null && (m = m(this.g)) != null && (m.x != brg.a || m.y != brg.a)) {
            recyclerView.ad((int) Math.signum(m.x), (int) Math.signum(m.y), null);
        }
        this.j = false;
        View view = this.l;
        if (view != null) {
            if (l(view) == this.g) {
                View view2 = this.l;
                ol olVar = recyclerView.M;
                j(view2, this.a);
                this.a.a(recyclerView);
                o();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.l = null;
            }
        }
        if (this.k) {
            ol olVar2 = recyclerView.M;
            i(i, i2, this.a);
            oi oiVar = this.a;
            int i3 = oiVar.a;
            oiVar.a(recyclerView);
            if (i3 >= 0 && this.k) {
                this.j = true;
                recyclerView.J.b();
            }
        }
    }

    public final void o() {
        if (!this.k) {
            return;
        }
        this.k = false;
        g();
        this.h.M.a = -1;
        this.l = null;
        this.g = -1;
        this.j = false;
        nw nwVar = this.i;
        if (nwVar.v == this) {
            nwVar.v = null;
        }
        this.i = null;
        this.h = null;
    }
}
