package defpackage;

import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwe implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kwe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((ImageView) this.a).getViewTreeObserver().removeOnPreDrawListener(this);
                if (d.r() && ((ImageView) this.a).getDrawable() != null && !(((ImageView) this.a).getDrawable() instanceof VectorDrawable) && !(((ImageView) this.a).getDrawable() instanceof gmz) && (Build.TYPE.equals("userdebug") || Build.TYPE.equals("eng"))) {
                    Log.w("HeaderAreaStyler", "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(String.valueOf(((ImageView) this.a).getContext().getPackageName())));
                }
                return true;
            }
            ((CoordinatorLayout) this.a).d(0);
            return true;
        }
        return ((kvw) this.a).aC;
    }
}
