package defpackage;

import android.transition.Transition;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztl extends abba {
    final /* synthetic */ ztr a;

    public ztl(ztr ztrVar) {
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
