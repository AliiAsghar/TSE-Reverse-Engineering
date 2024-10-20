package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyp extends AnimatorListenerAdapter {
    final /* synthetic */ fyj a;
    final /* synthetic */ fyu b;

    public fyp(fyu fyuVar, fyj fyjVar) {
        this.a = fyjVar;
        this.b = fyuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.k(2);
        fyu fyuVar = this.b;
        if (fyuVar.u) {
            this.a.post(fyuVar.o);
            this.b.u = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k(3);
    }
}
