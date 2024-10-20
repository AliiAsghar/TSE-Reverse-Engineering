package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ziz extends lzf {
    private boolean G = false;

    public ziz() {
        u(new zfc(this, 17));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            SimSelectionSettingsActivity simSelectionSettingsActivity = (SimSelectionSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            simSelectionSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            simSelectionSettingsActivity.w = (zas) kqjVar.d.b();
            simSelectionSettingsActivity.u = kqjVar.f;
            simSelectionSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            simSelectionSettingsActivity.s = krvVar.vt;
            simSelectionSettingsActivity.x = krvVar.hA;
            simSelectionSettingsActivity.y = krvVar.bU;
            simSelectionSettingsActivity.z = kqjVar.h;
            simSelectionSettingsActivity.A = (aksr) krvVar.at.b();
            simSelectionSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) simSelectionSettingsActivity).D = krvVar2.zb;
            ((zgv) simSelectionSettingsActivity).E = krvVar2.zh;
            simSelectionSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
