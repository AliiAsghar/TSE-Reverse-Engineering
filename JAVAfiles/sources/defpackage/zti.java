package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zti extends abba {
    final /* synthetic */ zsu a;
    final /* synthetic */ ztr b;

    public zti(ztr ztrVar, zsu zsuVar) {
        this.a = zsuVar;
        this.b = ztrVar;
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ztr ztrVar = this.b;
        int i = ztrVar.s - 1;
        ztrVar.s = i;
        if (i == 0) {
            this.a.a(ztrVar);
        }
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.s++;
    }
}
