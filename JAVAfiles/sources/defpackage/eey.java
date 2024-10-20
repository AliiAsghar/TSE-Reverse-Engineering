package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eey implements View.OnApplyWindowInsetsListener {
    final eeu a;
    private efo b;

    public eey(View view, eeu eeuVar) {
        efo efoVar;
        efg efdVar;
        this.a = eeuVar;
        efo a = eea.a(view);
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                efdVar = new eff(a);
            } else if (Build.VERSION.SDK_INT >= 29) {
                efdVar = new efe(a);
            } else {
                efdVar = new efd(a);
            }
            efoVar = efdVar.a();
        } else {
            efoVar = null;
        }
        this.b = efoVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = efo.p(windowInsets, view);
            return eez.a(view, windowInsets);
        }
        efo p = efo.p(windowInsets, view);
        if (this.b == null) {
            this.b = eea.a(view);
        }
        if (this.b == null) {
            this.b = p;
            return eez.a(view, windowInsets);
        }
        eeu b = eez.b(view);
        if (b != null && Objects.equals(b.b, windowInsets)) {
            return eez.a(view, windowInsets);
        }
        efo efoVar = this.b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if (!p.f(i2).equals(efoVar.f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return eez.a(view, windowInsets);
        }
        efo efoVar2 = this.b;
        if ((i & 8) != 0) {
            if (p.f(8).e > efoVar2.f(8).e) {
                interpolator = eez.a;
            } else {
                interpolator = eez.b;
            }
        } else {
            interpolator = eez.c;
        }
        mka mkaVar = new mka(i, interpolator, 160L);
        mkaVar.j(brg.a);
        ValueAnimator duration = ValueAnimator.ofFloat(brg.a, 1.0f).setDuration(mkaVar.h());
        eaq f = p.f(i);
        eaq f2 = efoVar2.f(i);
        eet eetVar = new eet(eaq.d(Math.min(f.b, f2.b), Math.min(f.c, f2.c), Math.min(f.d, f2.d), Math.min(f.e, f2.e)), eaq.d(Math.max(f.b, f2.b), Math.max(f.c, f2.c), Math.max(f.d, f2.d), Math.max(f.e, f2.e)));
        eez.e(view, mkaVar, windowInsets, false);
        duration.addUpdateListener(new eev(mkaVar, p, efoVar2, i, view));
        duration.addListener(new eew(mkaVar, view));
        edk.b(view, new eex(view, mkaVar, eetVar, duration, 0));
        this.b = p;
        return eez.a(view, windowInsets);
    }
}
