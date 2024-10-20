package defpackage;

import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zir extends lzf {
    private boolean G = false;

    public zir() {
        u(new zfc(this, 12));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            PerSubscriptionSettingsActivity perSubscriptionSettingsActivity = (PerSubscriptionSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            perSubscriptionSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            perSubscriptionSettingsActivity.w = (zas) kqjVar.d.b();
            perSubscriptionSettingsActivity.u = kqjVar.f;
            perSubscriptionSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            perSubscriptionSettingsActivity.s = krvVar.vt;
            perSubscriptionSettingsActivity.x = krvVar.hA;
            perSubscriptionSettingsActivity.y = krvVar.bU;
            perSubscriptionSettingsActivity.z = kqjVar.h;
            perSubscriptionSettingsActivity.A = (aksr) krvVar.at.b();
            perSubscriptionSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) perSubscriptionSettingsActivity).D = krvVar2.zb;
            ((zgv) perSubscriptionSettingsActivity).E = krvVar2.zh;
            perSubscriptionSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
