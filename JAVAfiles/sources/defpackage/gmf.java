package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmf extends gme {
    @Override // defpackage.gmb
    public final float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.gmd, defpackage.gmb
    public final void b(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.gmb
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.gme, defpackage.gmb
    public final void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.gmc, defpackage.gmb
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.gmc, defpackage.gmb
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
