package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bl extends ds {
    public final bj a;
    private AnimatorSet b;

    public bl(bj bjVar) {
        bjVar.getClass();
        this.a = bjVar;
    }

    @Override // defpackage.ds
    public final void a(ViewGroup viewGroup) {
        String str;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        du duVar = this.a.a;
        if (!duVar.d) {
            animatorSet.end();
        } else {
            animatorSet.reverse();
        }
        if (da.Y(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(duVar);
            sb.append(" has been canceled");
            if (true != duVar.d) {
                str = ".";
            } else {
                str = " with seeking.";
            }
            sb.append(str);
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.ds
    public final void b(ViewGroup viewGroup) {
        du duVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            duVar.f(this);
            return;
        }
        animatorSet.start();
        if (da.Y(2)) {
            Log.v("FragmentManager", a.cc(duVar, "Animator from operation ", " has started."));
        }
    }

    @Override // defpackage.ds
    public final void c(ViewGroup viewGroup) {
        Object obj;
        boolean z;
        if (!this.a.b()) {
            Context context = viewGroup.getContext();
            bj bjVar = this.a;
            context.getClass();
            fdx a = bjVar.a(context);
            if (a != null) {
                obj = a.a;
            } else {
                obj = null;
            }
            this.b = (AnimatorSet) obj;
            du duVar = this.a.a;
            if (duVar.h == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            View view = duVar.a.Q;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.b;
            if (animatorSet != null) {
                animatorSet.addListener(new bk(viewGroup, view, z2, duVar, this));
            }
            AnimatorSet animatorSet2 = this.b;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    @Override // defpackage.ds
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ds
    public final void e(qz qzVar) {
        long totalDuration;
        du duVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            duVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && duVar.a.t) {
            if (da.Y(2)) {
                Objects.toString(duVar);
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(duVar.toString()));
            }
            totalDuration = animatorSet.getTotalDuration();
            long j = qzVar.a * ((float) totalDuration);
            if (j == 0) {
                j = 1;
            }
            if (j == totalDuration) {
                j = (-1) + totalDuration;
            }
            if (da.Y(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + duVar);
            }
            animatorSet.setCurrentPlayTime(j);
        }
    }
}
