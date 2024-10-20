package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aej {
    public static final float a(EdgeEffect edgeEffect) {
        float distance;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return brg.a;
            }
        }
        return brg.a;
    }

    public static final void b(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final float c(EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return brg.a;
            }
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final void d(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof aeq) {
            aeq aeqVar = (aeq) edgeEffect;
            float f2 = aeqVar.b + f;
            aeqVar.b = f2;
            if (Math.abs(f2) > aeqVar.a) {
                aeqVar.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static final float e(EdgeEffect edgeEffect, float f, float f2, dqv dqvVar) {
        float f3 = aek.a;
        double ec = dqvVar.ec() * 386.0878f * 160.0f * 0.84f;
        if (((float) (aek.a * ec * Math.exp((aek.b / aek.c) * Math.log((Math.abs(f) * 0.35f) / (aek.a * ec))))) <= a(edgeEffect) * f2) {
            b(edgeEffect, arsk.g(f));
            return f;
        }
        return brg.a;
    }
}
