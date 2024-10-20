package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ri implements OnBackAnimationCallback {
    final /* synthetic */ arqr a;
    final /* synthetic */ arqr b;
    final /* synthetic */ arqg c;
    final /* synthetic */ arqg d;

    public ri(arqr arqrVar, arqr arqrVar2, arqg arqgVar, arqg arqgVar2) {
        this.a = arqrVar;
        this.b = arqrVar2;
        this.c = arqgVar;
        this.d = arqgVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.a(new qz(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.a(new qz(backEvent));
    }
}
