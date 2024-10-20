package defpackage;

import android.view.View;
import android.view.animation.Animation;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaot implements Animation.AnimationListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaot(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((aawa) this.a).j = null;
                return;
            }
            for (List list : ((aaou) this.a).b.values()) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setVisibility(0);
                    }
                }
            }
            return;
        }
        for (List list2 : ((aaou) this.a).b.values()) {
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setVisibility(8);
                }
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
