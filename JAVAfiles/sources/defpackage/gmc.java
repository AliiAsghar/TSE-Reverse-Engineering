package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class gmc extends gmb {
    private static boolean a = true;
    private static boolean b = true;

    @Override // defpackage.gmb
    public void e(View view, Matrix matrix) {
        if (!a) {
            return;
        }
        try {
            view.transformMatrixToGlobal(matrix);
        } catch (NoSuchMethodError unused) {
            a = false;
        }
    }

    @Override // defpackage.gmb
    public void f(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }
}
