package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zjc extends lzf {
    private boolean G = false;

    public zjc() {
        u(new zfc(this, 19));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            SpamSettingsActivity spamSettingsActivity = (SpamSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            spamSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            spamSettingsActivity.w = (zas) kqjVar.d.b();
            spamSettingsActivity.u = kqjVar.f;
            spamSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            spamSettingsActivity.s = krvVar.vt;
            spamSettingsActivity.x = krvVar.hA;
            spamSettingsActivity.y = krvVar.bU;
            spamSettingsActivity.z = kqjVar.h;
            spamSettingsActivity.A = (aksr) krvVar.at.b();
            spamSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) spamSettingsActivity).D = krvVar2.zb;
            ((zgv) spamSettingsActivity).E = krvVar2.zh;
            spamSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
