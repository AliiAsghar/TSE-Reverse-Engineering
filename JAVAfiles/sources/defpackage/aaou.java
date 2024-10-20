package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaou implements emx {
    public aaov a;
    public final Map b = new HashMap();
    private final cg c;
    private int d;
    private Animation e;
    private Animation f;

    public aaou(cg cgVar) {
        this.c = cgVar;
        ((aaxa) cgVar).a.c(this);
    }

    private final void c(int i) {
        View decorView;
        if (this.c.Q != null && (decorView = a().getWindow().getDecorView()) != null) {
            decorView.setSystemUiVisibility(i);
        }
    }

    public final cj a() {
        return this.c.fe();
    }

    public final void b(boolean z, boolean z2) {
        Animation animation;
        if (!z) {
            c(1792);
        } else {
            c(3846);
        }
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    View view = (View) it2.next();
                    int i = 0;
                    if (!z2) {
                        if (true == z) {
                            i = 8;
                        }
                        view.setVisibility(i);
                    } else {
                        if (true != z) {
                            i = 4;
                        }
                        view.setVisibility(i);
                        view.requestLayout();
                        if (!z) {
                            animation = this.e;
                        } else {
                            animation = this.f;
                        }
                        view.startAnimation(animation);
                    }
                }
            }
        }
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        aaov aaovVar = (aaov) new eoy(a()).a(aaov.class);
        this.a = aaovVar;
        aaovVar.c.d(this.c, new aaos(this, 0));
        this.d = a().getWindow().getDecorView().getSystemUiVisibility();
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        Map.EL.replaceAll(this.b, new mle(13));
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        boolean z;
        aaov aaovVar = this.a;
        if (aaovVar.b && aaovVar.a) {
            z = true;
        } else {
            z = false;
        }
        b(z, false);
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        cj a = a();
        if (this.e == null) {
            this.e = AnimationUtils.loadAnimation(a, R.anim.fullscreen_fade_in);
            this.f = AnimationUtils.loadAnimation(a, R.anim.fullscreen_fade_out);
            this.e.setAnimationListener(new aaot(this, 1));
            this.f.setAnimationListener(new aaot(this, 0));
        }
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        a().getWindow().getDecorView().setSystemUiVisibility(this.d);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }
}
