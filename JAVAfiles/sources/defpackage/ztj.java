package defpackage;

import android.transition.Transition;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztj extends abba {
    final /* synthetic */ zsu a;
    final /* synthetic */ ztr b;

    public ztj(ztr ztrVar, zsu zsuVar) {
        this.a = zsuVar;
        this.b = ztrVar;
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        zsu zsuVar;
        ztr ztrVar = this.b;
        int i = ztrVar.s - 1;
        ztrVar.s = i;
        if (i == 0 && (zsuVar = this.a) != null) {
            zsuVar.a(ztrVar);
        }
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.s++;
    }
}
