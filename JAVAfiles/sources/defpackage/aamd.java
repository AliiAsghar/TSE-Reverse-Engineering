package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamd extends zgr {
    private boolean n = false;

    public aamd() {
        u(new zji(this, 10));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            DebugGServiceKeysActivity debugGServiceKeysActivity = (DebugGServiceKeysActivity) this;
            kqj kqjVar = (kqj) aS();
            debugGServiceKeysActivity.t = (xnv) kqjVar.b.bV.b();
            debugGServiceKeysActivity.w = (zas) kqjVar.d.b();
            debugGServiceKeysActivity.u = kqjVar.f;
            debugGServiceKeysActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
