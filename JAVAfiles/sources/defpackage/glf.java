package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glf extends gmj {
    public glf() {
    }

    private static float L(glw glwVar, float f) {
        Float f2;
        if (glwVar != null && (f2 = (Float) glwVar.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    private final Animator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        gma.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) gma.b, f2);
        gle gleVar = new gle(view);
        ofFloat.addListener(gleVar);
        i().B(gleVar);
        return ofFloat;
    }

    @Override // defpackage.gmj, defpackage.glm
    public final void c(glw glwVar) {
        gmj.K(glwVar);
        Float f = (Float) glwVar.b.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (glwVar.b.getVisibility() == 0) {
                f = Float.valueOf(gma.a(glwVar.b));
            } else {
                f = Float.valueOf(brg.a);
            }
        }
        glwVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.gmj
    public final Animator e(View view, glw glwVar) {
        gmb gmbVar = gma.a;
        return M(view, L(glwVar, brg.a), 1.0f);
    }

    @Override // defpackage.gmj
    public final Animator f(View view, glw glwVar, glw glwVar2) {
        gmb gmbVar = gma.a;
        Animator M = M(view, L(glwVar, 1.0f), brg.a);
        if (M == null) {
            gma.c(view, L(glwVar2, 1.0f));
        }
        return M;
    }

    public glf(int i) {
        this.v = i;
    }
}
