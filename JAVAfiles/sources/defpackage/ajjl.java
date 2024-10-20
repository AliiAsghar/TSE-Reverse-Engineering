package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjl extends AnimatorListenerAdapter {
    final /* synthetic */ ajjn a;

    public ajjl(ajjn ajjnVar) {
        this.a = ajjnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ajjn ajjnVar = this.a;
        List list = ajjnVar.k;
        if (list != null && !ajjnVar.l) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((gmm) it.next()).b(ajjnVar);
            }
        }
    }
}
