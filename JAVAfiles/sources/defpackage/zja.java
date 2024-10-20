package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zja extends lzf {
    private boolean G = false;

    public zja() {
        u(new zfc(this, 18));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            SmartsSettingsActivity smartsSettingsActivity = (SmartsSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            smartsSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            smartsSettingsActivity.w = (zas) kqjVar.d.b();
            smartsSettingsActivity.u = kqjVar.f;
            smartsSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            smartsSettingsActivity.s = krvVar.vt;
            smartsSettingsActivity.x = krvVar.hA;
            smartsSettingsActivity.y = krvVar.bU;
            smartsSettingsActivity.z = kqjVar.h;
            smartsSettingsActivity.A = (aksr) krvVar.at.b();
            smartsSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) smartsSettingsActivity).D = krvVar2.zb;
            ((zgv) smartsSettingsActivity).E = krvVar2.zh;
            smartsSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
