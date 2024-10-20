package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wtn implements DisplayManager.DisplayListener {
    final /* synthetic */ arqg a;

    public wtn(arqg arqgVar) {
        this.a = arqgVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        this.a.a();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        this.a.a();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        this.a.a();
    }
}
