package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyg implements Animation.AnimationListener {
    private final arqr a;
    private final arqr b;
    private final arqr c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public afyg() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afyg.<init>():void");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.b.a(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
        this.c.a(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        this.a.a(animation);
    }

    public /* synthetic */ afyg(arqr arqrVar, arqr arqrVar2, int i) {
        arqrVar = (i & 1) != 0 ? afob.k : arqrVar;
        arqrVar2 = (i & 2) != 0 ? afob.l : arqrVar2;
        afob afobVar = afob.m;
        arqrVar.getClass();
        arqrVar2.getClass();
        this.a = arqrVar;
        this.b = arqrVar2;
        this.c = afobVar;
    }
}
