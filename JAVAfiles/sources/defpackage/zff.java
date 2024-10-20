package defpackage;

import com.google.android.apps.messaging.suggestions.settings.SpotlightsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zff extends lzf {
    private boolean G = false;

    public zff() {
        u(new zfc(this, 2));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            SpotlightsSettingsActivity spotlightsSettingsActivity = (SpotlightsSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            spotlightsSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            spotlightsSettingsActivity.w = (zas) kqjVar.d.b();
            spotlightsSettingsActivity.u = kqjVar.f;
            spotlightsSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            spotlightsSettingsActivity.s = krvVar.vt;
            spotlightsSettingsActivity.x = krvVar.hA;
            spotlightsSettingsActivity.y = krvVar.bU;
            spotlightsSettingsActivity.z = kqjVar.h;
            spotlightsSettingsActivity.A = (aksr) krvVar.at.b();
            spotlightsSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) spotlightsSettingsActivity).D = krvVar2.zb;
            ((zgv) spotlightsSettingsActivity).E = krvVar2.zh;
            spotlightsSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
