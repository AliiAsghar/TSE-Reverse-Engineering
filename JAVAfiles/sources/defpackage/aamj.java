package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugPrefsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamj extends zgr {
    private boolean n = false;

    public aamj() {
        u(new zji(this, 13));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            DebugPrefsActivity debugPrefsActivity = (DebugPrefsActivity) this;
            kqj kqjVar = (kqj) aS();
            debugPrefsActivity.t = (xnv) kqjVar.b.bV.b();
            debugPrefsActivity.w = (zas) kqjVar.d.b();
            debugPrefsActivity.u = kqjVar.f;
            debugPrefsActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
