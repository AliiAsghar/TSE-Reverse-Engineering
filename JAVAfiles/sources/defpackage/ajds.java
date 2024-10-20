package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajds<V extends View> extends dxt<V> {
    private int a;
    private aozh b;

    public ajds() {
        this.a = 0;
    }

    public final int X() {
        aozh aozhVar = this.b;
        if (aozhVar != null) {
            return aozhVar.a;
        }
        return 0;
    }

    public final boolean Y(int i) {
        aozh aozhVar = this.b;
        if (aozhVar != null) {
            return aozhVar.R(i);
        }
        this.a = i;
        return false;
    }

    @Override // defpackage.dxt
    public boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        gT(coordinatorLayout, view, i);
        if (this.b == null) {
            this.b = new aozh(view);
        }
        aozh aozhVar = this.b;
        aozhVar.c = ((View) aozhVar.d).getTop();
        aozhVar.b = ((View) aozhVar.d).getLeft();
        this.b.Q();
        int i2 = this.a;
        if (i2 != 0) {
            this.b.R(i2);
            this.a = 0;
            return true;
        }
        return true;
    }

    protected void gT(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    public ajds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
