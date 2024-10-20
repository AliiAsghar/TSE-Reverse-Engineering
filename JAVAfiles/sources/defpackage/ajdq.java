package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajdq extends ajds {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public ajdq() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public float L(View view) {
        throw null;
    }

    public int M(View view) {
        throw null;
    }

    public abstract View N(List list);

    public final int P(View view) {
        if (this.d == 0) {
            return 0;
        }
        float L = L(view);
        int i = this.d;
        return dze.c((int) (L * i), 0, i);
    }

    public boolean R() {
        return false;
    }

    @Override // defpackage.ajds
    protected final void gT(CoordinatorLayout coordinatorLayout, View view, int i) {
        View N = N(coordinatorLayout.a(view));
        if (N != null) {
            dxv dxvVar = (dxv) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + dxvVar.leftMargin, N.getBottom() + dxvVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dxvVar.rightMargin, ((coordinatorLayout.getHeight() + N.getBottom()) - coordinatorLayout.getPaddingBottom()) - dxvVar.bottomMargin);
            efo efoVar = coordinatorLayout.e;
            if (efoVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += efoVar.b();
                rect.right -= efoVar.c();
            }
            Rect rect2 = this.b;
            int i2 = dxvVar.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int P = P(N);
            view.layout(rect2.left, rect2.top - P, rect2.right, rect2.bottom - P);
            this.c = rect2.top - N.getBottom();
            return;
        }
        coordinatorLayout.j(view, i);
        this.c = 0;
    }

    public ajdq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
