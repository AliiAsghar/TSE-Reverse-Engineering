package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mz extends ok {
    protected PointF c;
    private final DisplayMetrics f;
    private float o;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    private boolean n = false;
    protected int d = 0;
    protected int e = 0;

    public mz(Context context) {
        this.f = context.getResources().getDisplayMetrics();
    }

    public static final int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                return i4 - i2;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    private static final int q(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int b(View view, int i) {
        nw nwVar = this.i;
        if (nwVar != null && nwVar.ag()) {
            nx nxVar = (nx) view.getLayoutParams();
            return h(nw.bF(view) - nxVar.leftMargin, nw.bG(view) + nxVar.rightMargin, nwVar.aA(), nwVar.F - nwVar.aB(), i);
        }
        return 0;
    }

    public int c(View view, int i) {
        nw nwVar = this.i;
        if (nwVar != null && nwVar.ah()) {
            nx nxVar = (nx) view.getLayoutParams();
            return h(nw.bH(view) - nxVar.topMargin, nw.bE(view) + nxVar.bottomMargin, nwVar.aC(), nwVar.G - nwVar.az(), i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d(int i) {
        return (int) Math.ceil(e(i) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.n) {
            this.o = a(this.f);
            this.n = true;
        }
        return (int) Math.ceil(abs * this.o);
    }

    protected int f() {
        PointF pointF = this.c;
        if (pointF == null || pointF.y == brg.a) {
            return 0;
        }
        if (this.c.y <= brg.a) {
            return -1;
        }
        return 1;
    }

    @Override // defpackage.ok
    protected final void g() {
        this.e = 0;
        this.d = 0;
        this.c = null;
    }

    @Override // defpackage.ok
    protected final void i(int i, int i2, oi oiVar) {
        if (k() == 0) {
            o();
            return;
        }
        int q = q(this.d, i);
        this.d = q;
        int q2 = q(this.e, i2);
        this.e = q2;
        if (q == 0 && q2 == 0) {
            PointF m = m(this.g);
            if (m != null && (m.x != brg.a || m.y != brg.a)) {
                p(m);
                this.c = m;
                this.d = (int) (m.x * 10000.0f);
                this.e = (int) (m.y * 10000.0f);
                int e = e(10000);
                oiVar.b((int) (this.d * 1.2f), (int) (this.e * 1.2f), (int) (e * 1.2f), this.a);
                return;
            }
            oiVar.a = this.g;
            o();
        }
    }

    @Override // defpackage.ok
    protected void j(View view, oi oiVar) {
        PointF pointF = this.c;
        int i = 0;
        if (pointF != null && pointF.x != brg.a) {
            i = this.c.x > brg.a ? 1 : -1;
        }
        int b = b(view, i);
        int c = c(view, f());
        int d = d((int) Math.sqrt((b * b) + (c * c)));
        if (d > 0) {
            oiVar.b(-b, -c, d, this.b);
        }
    }
}
