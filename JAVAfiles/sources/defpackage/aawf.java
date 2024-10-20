package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawf extends ok {
    private static final alvi n = alvi.m("com/google/android/apps/messaging/ui/mediapicker/camera/carousel/CarouselSmoothScroller");
    protected PointF c;
    public CarouselRecyclerView f;
    private final float o;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    protected int d = 0;
    protected int e = 0;

    public aawf(Context context, float f) {
        this.o = f / context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final int b(int i, int i2, int i3, int i4, int i5) {
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

    private static int c(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected final int a(int i) {
        return (int) Math.ceil(Math.abs(i) * this.o);
    }

    @Override // defpackage.ok
    protected final void g() {
        this.e = 0;
        this.d = 0;
        this.c = null;
        CarouselRecyclerView carouselRecyclerView = this.f;
        if (carouselRecyclerView != null) {
            int i = carouselRecyclerView.ab;
            if (i != -1 && carouselRecyclerView.a(i) != -1) {
                carouselRecyclerView.ao(carouselRecyclerView.ab);
            }
            int i2 = carouselRecyclerView.ac;
            if (i2 != -1 && carouselRecyclerView.a(i2) != -1) {
                carouselRecyclerView.ae(carouselRecyclerView.ac);
            }
        }
    }

    @Override // defpackage.ok
    protected final void i(int i, int i2, oi oiVar) {
        if (k() == 0) {
            o();
            return;
        }
        int c = c(this.d, i);
        this.d = c;
        int c2 = c(this.e, i2);
        this.e = c2;
        if (c == 0 && c2 == 0) {
            PointF m = m(this.g);
            if (m != null && (m.x != brg.a || m.y != brg.a)) {
                p(m);
                this.c = m;
                this.d = (int) (m.x * 10000.0f);
                this.e = (int) (m.y * 10000.0f);
                int a = a(10000);
                oiVar.b((int) (this.d * 1.2f), (int) (this.e * 1.2f), (int) (a * 1.2f), this.a);
                return;
            }
            oiVar.a = this.g;
            o();
        }
    }

    @Override // defpackage.ok
    protected final void j(View view, oi oiVar) {
        int i;
        int i2;
        PointF pointF = this.c;
        int i3 = 1;
        int i4 = 0;
        if (pointF != null && pointF.x != brg.a) {
            if (this.c.x > brg.a) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        nw nwVar = this.i;
        if (nwVar != null && nwVar.ag()) {
            nx nxVar = (nx) view.getLayoutParams();
            i2 = b(nw.bF(view) - nxVar.leftMargin, nw.bG(view) + nxVar.rightMargin, nwVar.aA(), nwVar.F - nwVar.aB(), i);
        } else {
            i2 = 0;
        }
        PointF pointF2 = this.c;
        if (pointF2 != null && pointF2.y != brg.a) {
            if (this.c.y <= brg.a) {
                i3 = -1;
            }
        } else {
            i3 = 0;
        }
        nw nwVar2 = this.i;
        if (nwVar2 != null && nwVar2.ah()) {
            nx nxVar2 = (nx) view.getLayoutParams();
            i4 = b(nw.bH(view) - nxVar2.topMargin, nw.bE(view) + nxVar2.bottomMargin, nwVar2.aC(), nwVar2.G - nwVar2.az(), i3);
        }
        int ceil = (int) Math.ceil(a((int) Math.hypot(i2, i4)) / 0.3356d);
        if (ceil > 0) {
            oiVar.b(-i2, -i4, ceil, this.b);
        }
    }

    @Override // defpackage.ok
    public final PointF m(int i) {
        Object obj = this.i;
        if (obj instanceof oj) {
            return ((oj) obj).Q(i);
        }
        alvw i2 = n.i();
        i2.X(alwp.a, "LinearSmoothScroller");
        ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/ui/mediapicker/camera/carousel/CarouselSmoothScroller", "computeScrollVectorForPosition", 351, "CarouselSmoothScroller.java")).t("You should override computeScrollVectorForPosition when the LayoutManager does not implement %s", oj.class.getCanonicalName());
        return null;
    }
}
