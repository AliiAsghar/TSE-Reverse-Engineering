package defpackage;

import android.transition.Transition;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztk extends abba {
    final /* synthetic */ zsu a;
    final /* synthetic */ ztr b;

    public ztk(ztr ztrVar, zsu zsuVar) {
        this.a = zsuVar;
        this.b = ztrVar;
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        r2.t--;
        ztr.n(this.b);
        ztr ztrVar = this.b;
        if (ztrVar.s == 0) {
            this.a.a(ztrVar);
        }
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.t++;
    }
}
