package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajio implements OnBackAnimationCallback {
    final /* synthetic */ ajim a;
    final /* synthetic */ ajip b;

    public ajio(ajip ajipVar, ajim ajimVar) {
        this.a = ajimVar;
        this.b = ajipVar;
    }

    public final void onBackCancelled() {
        if (!this.b.d()) {
            return;
        }
        this.a.P();
    }

    public final void onBackInvoked() {
        this.a.R();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (!this.b.d()) {
            return;
        }
        this.a.Z(new qz(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (!this.b.d()) {
            return;
        }
        this.a.X(new qz(backEvent));
    }
}
