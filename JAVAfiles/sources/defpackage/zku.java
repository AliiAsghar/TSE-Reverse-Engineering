package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class zku implements akbp<Bundle, Void> {
    final /* synthetic */ zkv a;

    public zku(zkv zkvVar) {
        this.a = zkvVar;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void a(Object obj, Throwable th) {
        RcsMultiSimStatusCheckboxView b;
        Bundle bundle = (Bundle) obj;
        zkw zkwVar = this.a.aa;
        zkwVar.getClass();
        String string = bundle.getString("rcs_per_sim_provisioning_id");
        string.getClass();
        adiw adiwVar = new adiw(string);
        int i = !bundle.getBoolean("rcs_per_sim_toggle_state") ? 1 : 0;
        RcsSimStatusView l = zkwVar.h.l(adiwVar);
        if (l != null && (b = l.E().b()) != null) {
            b.f(i);
        }
        ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$3", "onFailure", (char) 522, "RcsSettingsFragmentV2Peer.java")).q("Failed to set RCS Per-Sim level");
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj;
        this.a.I.getClass();
        String string = bundle.getString("rcs_per_sim_provisioning_id");
        string.getClass();
        ((vpq) this.a.I.b()).i(new adiw(string), bundle.getBoolean("rcs_per_sim_toggle_state"));
        this.a.k();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
