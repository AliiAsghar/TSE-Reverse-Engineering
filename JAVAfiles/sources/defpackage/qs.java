package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qs {
    private static final Interpolator a = new qr(0);
    private static final Interpolator b = new qr(2);
    private int c = -1;

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int e(int i, int i2) {
        return i2 << (i * 8);
    }

    public static int f(int i, int i2) {
        return e(2, i) | e(1, i2) | e(0, i2 | i);
    }

    public final int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(RecyclerView recyclerView, oo ooVar) {
        return b(p(ooVar), recyclerView.getLayoutDirection());
    }

    public void g(Canvas canvas, RecyclerView recyclerView, oo ooVar, float f, float f2, int i, boolean z) {
        View view = ooVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(edz.a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = brg.a;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float a2 = edz.a(childAt);
                    if (a2 > f3) {
                        f3 = a2;
                    }
                }
            }
            edz.j(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract void h(oo ooVar, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(RecyclerView recyclerView, oo ooVar) {
        if ((d(recyclerView, ooVar) & 16711680) != 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return true;
    }

    public boolean k() {
        return true;
    }

    public final void l(oo ooVar) {
        View view = ooVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            edz.j(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(brg.a);
        view.setTranslationY(brg.a);
    }

    public final int m(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.c;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.c = i3;
        }
        int abs = Math.abs(i2);
        int signum = (int) Math.signum(i2);
        float f = abs / i;
        float f2 = 1.0f;
        float interpolation = b.getInterpolation(Math.min(1.0f, f));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        float f3 = signum * i3 * interpolation;
        int interpolation2 = (int) (((int) f3) * a.getInterpolation(f2));
        if (interpolation2 == 0) {
            if (i2 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public abstract boolean n(oo ooVar, oo ooVar2);

    public abstract int p(oo ooVar);

    public float a(float f) {
        return f;
    }

    public void o(oo ooVar) {
    }
}
