package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adgy implements adeu {
    final /* synthetic */ adgz a;

    public adgy(adgz adgzVar) {
        this.a = adgzVar;
    }

    @Override // defpackage.adeu
    public final void onConnectivityChange(Context context, int i) {
        NetworkInfo networkInfo;
        try {
            networkInfo = adwp.f(context).d();
        } catch (adwk e) {
            advr.s(e, "Can't get active network info. Missing permissions.", new Object[0]);
            networkInfo = null;
        }
        advr.d(this.a.a, "RegistrationEngine received connectivity change event. state=%d, NetworkInfo=%s", Integer.valueOf(i), networkInfo);
        adhw adhwVar = this.a.c;
        if (adhwVar != null) {
            Message c = adhwVar.c(4, i, -1, networkInfo);
            acyr acyrVar = adhwVar.b;
            if (acyrVar != null) {
                acyrVar.sendMessage(c);
            }
        }
    }

    @Override // defpackage.adeu
    public final boolean shouldTriggerOnCapabilitiesChanged() {
        return true;
    }
}
