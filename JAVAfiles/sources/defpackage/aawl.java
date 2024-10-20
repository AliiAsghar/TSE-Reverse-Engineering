package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aawl extends zgr {
    private boolean n = false;

    public aawl() {
        u(new zji(this, 20));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            MediaViewerActivity mediaViewerActivity = (MediaViewerActivity) this;
            kqj kqjVar = (kqj) aS();
            mediaViewerActivity.t = (xnv) kqjVar.b.bV.b();
            mediaViewerActivity.w = (zas) kqjVar.d.b();
            mediaViewerActivity.u = kqjVar.f;
            mediaViewerActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
