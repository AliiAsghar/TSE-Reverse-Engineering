package defpackage;

import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zis extends lzf {
    private boolean G = false;

    public zis() {
        u(new zfc(this, 13));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            RcsSettingsActivity rcsSettingsActivity = (RcsSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            rcsSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            rcsSettingsActivity.w = (zas) kqjVar.d.b();
            rcsSettingsActivity.u = kqjVar.f;
            rcsSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            rcsSettingsActivity.s = krvVar.vt;
            rcsSettingsActivity.x = krvVar.hA;
            rcsSettingsActivity.y = krvVar.bU;
            rcsSettingsActivity.z = kqjVar.h;
            rcsSettingsActivity.A = (aksr) krvVar.at.b();
            rcsSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) rcsSettingsActivity).D = krvVar2.zb;
            ((zgv) rcsSettingsActivity).E = krvVar2.zh;
            rcsSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
