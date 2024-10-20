package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxy implements Runnable {
    final /* synthetic */ AspectRatioFrameLayout a;
    private boolean b;

    public fxy(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.a = aspectRatioFrameLayout;
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            this.a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b = false;
    }
}
