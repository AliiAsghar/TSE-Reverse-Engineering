package defpackage;

import com.google.android.apps.messaging.ui.PermissionCheckActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zgj extends zgr {
    private boolean n = false;

    public zgj() {
        u(new zfc(this, 4));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            PermissionCheckActivity permissionCheckActivity = (PermissionCheckActivity) this;
            kqj kqjVar = (kqj) aS();
            permissionCheckActivity.t = (xnv) kqjVar.b.bV.b();
            permissionCheckActivity.w = (zas) kqjVar.d.b();
            permissionCheckActivity.u = kqjVar.f;
            permissionCheckActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
