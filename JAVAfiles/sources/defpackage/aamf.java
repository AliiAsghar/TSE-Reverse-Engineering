package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugMmsConfigActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamf extends zgr {
    private boolean n = false;

    public aamf() {
        u(new zji(this, 11));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            DebugMmsConfigActivity debugMmsConfigActivity = (DebugMmsConfigActivity) this;
            kqj kqjVar = (kqj) aS();
            debugMmsConfigActivity.t = (xnv) kqjVar.b.bV.b();
            debugMmsConfigActivity.w = (zas) kqjVar.d.b();
            debugMmsConfigActivity.u = kqjVar.f;
            debugMmsConfigActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
