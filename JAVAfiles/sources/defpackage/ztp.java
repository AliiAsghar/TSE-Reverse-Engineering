package defpackage;

import android.transition.Transition;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztp extends abba {
    final /* synthetic */ float a;
    final /* synthetic */ ztq b;

    public ztp(ztq ztqVar, float f) {
        this.a = f;
        this.b = ztqVar;
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ztq ztqVar = this.b;
        ztr ztrVar = ztqVar.i;
        ztrVar.t--;
        ztqVar.h = true;
        ztrVar.u = false;
        if (this.a != ztqVar.g) {
            ztrVar.v = true;
            this.b.i.c(false);
            ztr ztrVar2 = this.b.i;
            zsu zsuVar = ztrVar2.y;
            if (zsuVar != null) {
                zsuVar.a(ztrVar2);
            }
        }
        ((alwl) ((alwl) ztr.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController$BannerCardView$1", "onTransitionEnd", 1436, "FullBannerUiController.java")).q("Banner swiped away");
    }

    @Override // defpackage.abba, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.i.t++;
    }
}
