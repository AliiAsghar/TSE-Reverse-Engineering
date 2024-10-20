package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zje extends lzf {
    private boolean G = false;

    public zje() {
        u(new zfc(this, 20));
    }

    @Override // defpackage.lzi, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            SwipeActionSettingsActivity swipeActionSettingsActivity = (SwipeActionSettingsActivity) this;
            kqj kqjVar = (kqj) aS();
            swipeActionSettingsActivity.t = (xnv) kqjVar.b.bV.b();
            swipeActionSettingsActivity.w = (zas) kqjVar.d.b();
            swipeActionSettingsActivity.u = kqjVar.f;
            swipeActionSettingsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            swipeActionSettingsActivity.s = krvVar.vt;
            swipeActionSettingsActivity.x = krvVar.hA;
            swipeActionSettingsActivity.y = krvVar.bU;
            swipeActionSettingsActivity.z = kqjVar.h;
            swipeActionSettingsActivity.A = (aksr) krvVar.at.b();
            swipeActionSettingsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) swipeActionSettingsActivity).D = krvVar2.zb;
            ((zgv) swipeActionSettingsActivity).E = krvVar2.zh;
            swipeActionSettingsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
