package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcb implements dca {
    private final float[] a;
    private final int[] b = new int[2];

    public dcb(float[] fArr) {
        this.a = fArr;
    }

    private final void b(float[] fArr, float f, float f2) {
        dbh.b(fArr, f, f2, this.a);
    }

    private final void c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.b);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            ckb.b(this.a, matrix);
            dbh.a(fArr, this.a);
        }
    }

    @Override // defpackage.dca
    public final void a(View view, float[] fArr) {
        cll.c(fArr);
        c(view, fArr);
    }
}
