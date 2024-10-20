package defpackage;

import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lrs extends lzf {
    private boolean G = false;

    public lrs() {
        u(new ew((ex) this, 19));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            privacySettingsActivity.t = (xnv) kqjVar.b.bV.b();
            privacySettingsActivity.w = (zas) kqjVar.d.b();
            privacySettingsActivity.u = kqjVar.f;
            privacySettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            privacySettingsActivity.s = krvVar.vt;
            privacySettingsActivity.x = krvVar.hA;
            privacySettingsActivity.y = krvVar.bU;
            privacySettingsActivity.z = kqjVar.h;
            privacySettingsActivity.A = (aksr) krvVar.at.b();
            privacySettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) privacySettingsActivity).D = krvVar2.zb;
            ((zgv) privacySettingsActivity).E = krvVar2.zh;
            privacySettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
