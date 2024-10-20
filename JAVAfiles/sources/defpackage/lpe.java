package defpackage;

import com.google.android.apps.messaging.notifications.settings.NotificationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lpe extends lzf {
    private boolean G = false;

    public lpe() {
        u(new ew((ex) this, 15));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            notificationSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            notificationSettingsActivity.w = (zas) kqjVar.d.b();
            notificationSettingsActivity.u = kqjVar.f;
            notificationSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            notificationSettingsActivity.s = krvVar.vt;
            notificationSettingsActivity.x = krvVar.hA;
            notificationSettingsActivity.y = krvVar.bU;
            notificationSettingsActivity.z = kqjVar.h;
            notificationSettingsActivity.A = (aksr) krvVar.at.b();
            notificationSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) notificationSettingsActivity).D = krvVar2.zb;
            ((zgv) notificationSettingsActivity).E = krvVar2.zh;
            notificationSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
