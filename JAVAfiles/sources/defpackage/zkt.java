package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class zkt implements akbp<Integer, Void> {
    final /* synthetic */ zkv a;

    public zkt(zkv zkvVar) {
        this.a = zkvVar;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void a(Object obj, Throwable th) {
        ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$2", "onFailure", (char) 478, "RcsSettingsFragmentV2Peer.java")).q("Failed to set RCS Global Toggle");
        zkw zkwVar = this.a.aa;
        zkwVar.getClass();
        zkwVar.a.G(true);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        wiz b = wiz.b(((Integer) obj).intValue());
        b.getClass();
        zkv zkvVar = this.a;
        zkvVar.r.getClass();
        zkvVar.I.getClass();
        zkvVar.h.getClass();
        zkw zkwVar = zkvVar.aa;
        zkwVar.getClass();
        zkwVar.a.G(true);
        boolean equals = b.equals(wiz.TOGGLE_STATE_ENABLED);
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_enabled_rcs_from_preference", equals);
        ((vqu) this.a.r.b()).S(bundle);
        ((vpq) this.a.I.b()).h(equals);
        if (aczv.S()) {
            ((alvg) ((alvg) zkv.a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$2", "onSuccess", 469, "RcsSettingsFragmentV2Peer.java")).t("enableMoSmsNumberDiscovery %s", Boolean.valueOf(equals));
            this.a.h.f(equals);
        }
        this.a.i();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
