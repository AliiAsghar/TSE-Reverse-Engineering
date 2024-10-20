package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpy extends zqc {
    final /* synthetic */ zqd a;

    public zpy(zqd zqdVar) {
        this.a = zqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        zqd zqdVar = this.a;
        zqdVar.c = (zqdVar.c + 216.0f) % 360.0f;
    }
}
