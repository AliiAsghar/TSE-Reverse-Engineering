package defpackage;

import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zim extends lzf {
    private boolean G = false;

    public zim() {
        u(new zfc(this, 9));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            ApplicationSettingsActivity applicationSettingsActivity = (ApplicationSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            applicationSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            applicationSettingsActivity.w = (zas) kqjVar.d.b();
            applicationSettingsActivity.u = kqjVar.f;
            applicationSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            applicationSettingsActivity.s = krvVar.vt;
            applicationSettingsActivity.x = krvVar.hA;
            applicationSettingsActivity.y = krvVar.bU;
            applicationSettingsActivity.z = kqjVar.h;
            applicationSettingsActivity.A = (aksr) krvVar.at.b();
            applicationSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) applicationSettingsActivity).D = krvVar2.zb;
            ((zgv) applicationSettingsActivity).E = krvVar2.zh;
            applicationSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
