package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztm extends abba {
    final /* synthetic */ ztr a;

    public ztm(ztr ztrVar) {
        this.a = ztrVar;
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ztr ztrVar = this.a;
        ztrVar.r--;
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.r++;
    }
}
