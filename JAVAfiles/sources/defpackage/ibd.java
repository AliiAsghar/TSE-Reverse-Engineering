package defpackage;

import com.google.android.apps.messaging.analytics.consent.LoggingConsentSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ibd extends lzf {
    private boolean G = false;

    public ibd() {
        u(new ew((ex) this, 3));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            LoggingConsentSettingsActivity loggingConsentSettingsActivity = (LoggingConsentSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            loggingConsentSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            loggingConsentSettingsActivity.w = (zas) kqjVar.d.b();
            loggingConsentSettingsActivity.u = kqjVar.f;
            loggingConsentSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            loggingConsentSettingsActivity.s = krvVar.vt;
            loggingConsentSettingsActivity.x = krvVar.hA;
            loggingConsentSettingsActivity.y = krvVar.bU;
            loggingConsentSettingsActivity.z = kqjVar.h;
            loggingConsentSettingsActivity.A = (aksr) krvVar.at.b();
            loggingConsentSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) loggingConsentSettingsActivity).D = krvVar2.zb;
            ((zgv) loggingConsentSettingsActivity).E = krvVar2.zh;
            loggingConsentSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
