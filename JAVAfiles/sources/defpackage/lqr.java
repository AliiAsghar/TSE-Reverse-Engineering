package defpackage;

import com.google.android.apps.messaging.penpal.settings.GeminiSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lqr extends lzf {
    private boolean G = false;

    public lqr() {
        u(new ew((ex) this, 16));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            GeminiSettingsActivity geminiSettingsActivity = (GeminiSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            geminiSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            geminiSettingsActivity.w = (zas) kqjVar.d.b();
            geminiSettingsActivity.u = kqjVar.f;
            geminiSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            geminiSettingsActivity.s = krvVar.vt;
            geminiSettingsActivity.x = krvVar.hA;
            geminiSettingsActivity.y = krvVar.bU;
            geminiSettingsActivity.z = kqjVar.h;
            geminiSettingsActivity.A = (aksr) krvVar.at.b();
            geminiSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) geminiSettingsActivity).D = krvVar2.zb;
            ((zgv) geminiSettingsActivity).E = krvVar2.zh;
            geminiSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
