package defpackage;

import android.telephony.satellite.wrapper.CarrierRoamingNtnModeListenerWrapper2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpa implements CarrierRoamingNtnModeListenerWrapper2 {
    final /* synthetic */ wpb a;
    final /* synthetic */ ahjj b;

    public wpa(wpb wpbVar, ahjj ahjjVar) {
        this.a = wpbVar;
        this.b = ahjjVar;
    }

    public final void onCarrierRoamingNtnEligibleStateChanged(boolean z) {
        armd.i(this.a.a.b("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnEligibleStateChanged"), null);
    }

    public final void onCarrierRoamingNtnModeChanged(boolean z) {
        akrc b = this.a.a.b("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnModeChangedEvent");
        ahjj ahjjVar = this.b;
        if (!z) {
            try {
                if (((wpc) ((yav) ((ahjj) ahjjVar.a).a).p.get()).equals(wpc.b)) {
                    ((yav) ((ahjj) ahjjVar.a).a).B(4);
                    ((yav) ((ahjj) ahjjVar.a).a).y(wpc.d);
                }
            } finally {
            }
        }
        armd.i(b, null);
    }
}
