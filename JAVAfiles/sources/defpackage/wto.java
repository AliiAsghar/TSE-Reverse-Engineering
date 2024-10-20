package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wto implements DisplayManager.DisplayListener {
    final /* synthetic */ wtp a;
    final /* synthetic */ arqg b;

    public wto(wtp wtpVar, arqg arqgVar) {
        this.a = wtpVar;
        this.b = arqgVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        akrc b = ((aksr) this.a.d.b()).b("ScreenDetectionHelper.onDisplayAdded");
        try {
            this.b.a();
            armd.i(b, null);
        } finally {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        akrc b = ((aksr) this.a.d.b()).b("ScreenDetectionHelper.onDisplayChanged");
        try {
            this.b.a();
            armd.i(b, null);
        } finally {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        akrc b = ((aksr) this.a.d.b()).b("ScreenDetectionHelper.onDisplayRemoved");
        try {
            this.b.a();
            armd.i(b, null);
        } finally {
        }
    }
}
