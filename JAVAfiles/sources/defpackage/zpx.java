package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpx extends zqc {
    final /* synthetic */ zqd a;

    public zpx(zqd zqdVar) {
        this.a = zqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.c) {
            zqd zqdVar = this.a;
            zqdVar.b = zqdVar.b();
            this.a.b.start();
        }
    }
}
