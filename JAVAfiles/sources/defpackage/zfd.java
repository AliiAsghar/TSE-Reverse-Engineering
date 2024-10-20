package defpackage;

import com.google.android.apps.messaging.suggestions.settings.SmartActionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zfd extends lzf {
    private boolean G = false;

    public zfd() {
        u(new zfc(this, 0));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            SmartActionSettingsActivity smartActionSettingsActivity = (SmartActionSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            smartActionSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            smartActionSettingsActivity.w = (zas) kqjVar.d.b();
            smartActionSettingsActivity.u = kqjVar.f;
            smartActionSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            smartActionSettingsActivity.s = krvVar.vt;
            smartActionSettingsActivity.x = krvVar.hA;
            smartActionSettingsActivity.y = krvVar.bU;
            smartActionSettingsActivity.z = kqjVar.h;
            smartActionSettingsActivity.A = (aksr) krvVar.at.b();
            smartActionSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) smartActionSettingsActivity).D = krvVar2.zb;
            ((zgv) smartActionSettingsActivity).E = krvVar2.zh;
            smartActionSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
