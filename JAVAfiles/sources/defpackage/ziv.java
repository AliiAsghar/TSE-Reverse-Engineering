package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ziv extends zgu {
    private boolean C = false;

    public ziv() {
        u(new zfc(this, 15));
    }

    @Override // defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.C) {
            this.C = true;
            SettingsActivity settingsActivity = (SettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            settingsActivity.t = (xnv) kqjVar.b.bV.b();
            settingsActivity.w = (zas) kqjVar.d.b();
            settingsActivity.u = kqjVar.f;
            settingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            settingsActivity.s = krvVar.vt;
            settingsActivity.x = krvVar.hA;
            settingsActivity.y = krvVar.bU;
            settingsActivity.z = kqjVar.h;
            settingsActivity.A = (aksr) krvVar.at.b();
            settingsActivity.B = kqjVar.d;
        }
    }
}
