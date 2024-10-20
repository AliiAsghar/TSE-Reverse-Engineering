package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajln implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            if (baseTransientBottomBar.l() && baseTransientBottomBar.j.getVisibility() == 0) {
                if (baseTransientBottomBar.j.c == 1) {
                    ValueAnimator c = baseTransientBottomBar.c(1.0f, brg.a);
                    c.setDuration(baseTransientBottomBar.d);
                    c.addListener(new ajlj(baseTransientBottomBar, i2));
                    c.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar.b());
                    valueAnimator.setInterpolator(baseTransientBottomBar.f);
                    valueAnimator.setDuration(baseTransientBottomBar.e);
                    valueAnimator.addListener(new ajlm(baseTransientBottomBar, i2));
                    valueAnimator.addUpdateListener(new ajlk(baseTransientBottomBar, 4));
                    valueAnimator.start();
                }
            } else {
                baseTransientBottomBar.o();
            }
            return true;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
        if (baseTransientBottomBar2.j.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.j.getLayoutParams();
            if (layoutParams instanceof dxv) {
                dxv dxvVar = (dxv) layoutParams;
                BaseTransientBottomBar.Behavior behavior = new BaseTransientBottomBar.Behavior();
                behavior.g.a = baseTransientBottomBar2.u;
                behavior.f = new asqc(baseTransientBottomBar2, null);
                dxvVar.b(behavior);
                if (baseTransientBottomBar2.d() == null) {
                    dxvVar.g = 80;
                }
            }
            ajlt ajltVar = baseTransientBottomBar2.j;
            ViewGroup viewGroup = baseTransientBottomBar2.h;
            ajltVar.g = true;
            viewGroup.addView(ajltVar);
            ajltVar.g = false;
            baseTransientBottomBar2.h();
            baseTransientBottomBar2.j.setVisibility(4);
        }
        if (baseTransientBottomBar2.j.isLaidOut()) {
            baseTransientBottomBar2.j();
        } else {
            baseTransientBottomBar2.r = true;
        }
        return true;
    }
}
