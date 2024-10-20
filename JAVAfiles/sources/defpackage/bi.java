package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bi extends ds {
    public final bj a;

    public bi(bj bjVar) {
        bjVar.getClass();
        this.a = bjVar;
    }

    @Override // defpackage.ds
    public final void a(ViewGroup viewGroup) {
        du duVar = this.a.a;
        View view = duVar.a.Q;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        this.a.a.f(this);
        if (da.Y(2)) {
            Log.v("FragmentManager", a.cc(duVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.ds
    public final void b(ViewGroup viewGroup) {
        Object obj;
        if (this.a.b()) {
            this.a.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        bj bjVar = this.a;
        du duVar = bjVar.a;
        View view = duVar.a.Q;
        context.getClass();
        fdx a = bjVar.a(context);
        if (a != null && (obj = a.b) != null) {
            if (duVar.h != 1) {
                view.startAnimation((Animation) obj);
                this.a.a.f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            ck ckVar = new ck((Animation) obj, viewGroup, view);
            ckVar.setAnimationListener(new bh(duVar, viewGroup, view, this));
            view.startAnimation(ckVar);
            if (da.Y(2)) {
                Log.v("FragmentManager", a.cc(duVar, "Animation from operation ", " has started."));
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
