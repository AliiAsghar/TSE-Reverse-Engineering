package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamh extends zgr {
    private boolean n = false;

    public aamh() {
        u(new zji(this, 12));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            DebugMobileConfigurationActivity debugMobileConfigurationActivity = (DebugMobileConfigurationActivity) this;
            kqj kqjVar = (kqj) aS();
            debugMobileConfigurationActivity.t = (xnv) kqjVar.b.bV.b();
            debugMobileConfigurationActivity.w = (zas) kqjVar.d.b();
            debugMobileConfigurationActivity.u = kqjVar.f;
            debugMobileConfigurationActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
