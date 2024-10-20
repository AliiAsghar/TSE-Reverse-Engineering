package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajji extends ejr {
    @Override // defpackage.ejr
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = ajjj.h;
        return ((ajjj) obj).b() * 10000.0f;
    }

    @Override // defpackage.ejr
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        ajjj ajjjVar = (ajjj) obj;
        int i = ajjj.h;
        ajjjVar.d(f / 10000.0f);
        if (ajjjVar.j.b(true)) {
            if (ajjjVar.d == null) {
                ajjjVar.f = ajgk.l(ajjjVar.i, R.attr.motionEasingStandardInterpolator, ajdd.a);
                ajjjVar.g = ajgk.l(ajjjVar.i, R.attr.motionEasingEmphasizedAccelerateInterpolator, ajdd.a);
                ajjjVar.d = new ValueAnimator();
                ajjjVar.d.setDuration(500L);
                ajjjVar.d.setFloatValues(brg.a, 1.0f);
                ajjjVar.d.setInterpolator(null);
                ajjjVar.d.addUpdateListener(new ztg(ajjjVar, 13));
            }
            float a = ajjjVar.a((int) f);
            if (a != ajjjVar.c) {
                if (ajjjVar.d.isRunning()) {
                    ajjjVar.d.cancel();
                }
                ajjjVar.c = a;
                if (a == 1.0f) {
                    ajjjVar.e = ajjjVar.f;
                    ajjjVar.d.start();
                    return;
                } else {
                    ajjjVar.e = ajjjVar.g;
                    ajjjVar.d.reverse();
                    return;
                }
            }
            if (!ajjjVar.d.isRunning()) {
                ajjjVar.c(a);
            }
        }
    }
}
