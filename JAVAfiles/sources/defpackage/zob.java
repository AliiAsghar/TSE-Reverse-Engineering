package defpackage;

import com.google.android.apps.messaging.ui.appsettings.verifiedsms.VerifiedSmsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zob extends lzf {
    private boolean G = false;

    public zob() {
        u(new zji(this, 2));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            VerifiedSmsSettingsActivity verifiedSmsSettingsActivity = (VerifiedSmsSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            verifiedSmsSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            verifiedSmsSettingsActivity.w = (zas) kqjVar.d.b();
            verifiedSmsSettingsActivity.u = kqjVar.f;
            verifiedSmsSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            verifiedSmsSettingsActivity.s = krvVar.vt;
            verifiedSmsSettingsActivity.x = krvVar.hA;
            verifiedSmsSettingsActivity.y = krvVar.bU;
            verifiedSmsSettingsActivity.z = kqjVar.h;
            verifiedSmsSettingsActivity.A = (aksr) krvVar.at.b();
            verifiedSmsSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) verifiedSmsSettingsActivity).D = krvVar2.zb;
            ((zgv) verifiedSmsSettingsActivity).E = krvVar2.zh;
            verifiedSmsSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
