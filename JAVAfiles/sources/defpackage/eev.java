package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eev implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ efo a;
    final /* synthetic */ efo b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ mka e;

    public eev(mka mkaVar, efo efoVar, efo efoVar2, int i, View view) {
        this.e = mkaVar;
        this.a = efoVar;
        this.b = efoVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        efg efdVar;
        this.e.j(valueAnimator.getAnimatedFraction());
        float g = this.e.g();
        Interpolator interpolator = eez.a;
        int i = Build.VERSION.SDK_INT;
        efo efoVar = this.a;
        if (i >= 30) {
            efdVar = new eff(efoVar);
        } else if (Build.VERSION.SDK_INT >= 29) {
            efdVar = new efe(efoVar);
        } else {
            efdVar = new efd(efoVar);
        }
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((this.c & i2) == 0) {
                efdVar.g(i2, efoVar.f(i2));
            } else {
                efo efoVar2 = this.b;
                eaq f = efoVar.f(i2);
                eaq f2 = efoVar2.f(i2);
                float f3 = 1.0f - g;
                efdVar.g(i2, efo.i(f, (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d), (int) (((f.e - f2.e) * f3) + 0.5d)));
            }
        }
        eez.c(this.d, efdVar.a(), Collections.singletonList(this.e));
    }
}
