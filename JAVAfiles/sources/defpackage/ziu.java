package defpackage;

import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ziu extends lzf {
    private boolean G = false;

    public ziu() {
        u(new zfc(this, 14));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            RichCardsSettingsActivity richCardsSettingsActivity = (RichCardsSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            richCardsSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            richCardsSettingsActivity.w = (zas) kqjVar.d.b();
            richCardsSettingsActivity.u = kqjVar.f;
            richCardsSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            richCardsSettingsActivity.s = krvVar.vt;
            richCardsSettingsActivity.x = krvVar.hA;
            richCardsSettingsActivity.y = krvVar.bU;
            richCardsSettingsActivity.z = kqjVar.h;
            richCardsSettingsActivity.A = (aksr) krvVar.at.b();
            richCardsSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) richCardsSettingsActivity).D = krvVar2.zb;
            ((zgv) richCardsSettingsActivity).E = krvVar2.zh;
            richCardsSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
