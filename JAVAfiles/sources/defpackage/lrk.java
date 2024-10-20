package defpackage;

import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lrk extends zgu {
    private boolean C = false;

    public lrk() {
        u(new ew((ex) this, 18));
    }

    @Override // defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.C) {
            this.C = true;
            IdentityDetailsActivity identityDetailsActivity = (IdentityDetailsActivity) this;
            kqj kqjVar = (kqj) aS();
            identityDetailsActivity.t = (xnv) kqjVar.b.bV.b();
            identityDetailsActivity.w = (zas) kqjVar.d.b();
            identityDetailsActivity.u = kqjVar.f;
            identityDetailsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            identityDetailsActivity.s = krvVar.vt;
            identityDetailsActivity.x = krvVar.hA;
            identityDetailsActivity.y = krvVar.bU;
            identityDetailsActivity.z = kqjVar.h;
            identityDetailsActivity.A = (aksr) krvVar.at.b();
            identityDetailsActivity.B = kqjVar.d;
        }
    }
}
