package defpackage;

import android.content.Context;
import android.telephony.satellite.wrapper.SatelliteManagerWrapper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpb {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl");
    public final aksr a;
    private final Context c;
    private final anen d;

    public wpb(Context context, anen anenVar, aksr aksrVar) {
        context.getClass();
        anenVar.getClass();
        aksrVar.getClass();
        this.c = context;
        this.d = anenVar;
        this.a = aksrVar;
    }

    public final void a() {
        if (!yhx.h) {
            alvw g = b.g();
            g.X(alwp.a, "BugleSatellite");
            ((alvg) g.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", 88, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return;
        }
        try {
            SatelliteManagerWrapper.getInstance(this.c).requestEnabled(true, false, false, this.d, new vrw(12));
        } catch (ClassCastException e) {
            alvw d = b.d();
            d.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", 107, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged");
        } catch (LinkageError e2) {
            alvw d2 = b.d();
            d2.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d2).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", 105, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged");
        }
    }

    public final boolean b(int i) {
        if (!yhx.h) {
            alvw d = b.d();
            d.X(alwp.a, "BugleSatellite");
            ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 34, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return false;
        }
        try {
            return SatelliteManagerWrapper.getInstance(this.c).isUsingNonTerrestrialNetwork(i);
        } catch (LinkageError e) {
            alvw d2 = b.d();
            d2.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 40, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork");
            return false;
        }
    }

    public final void c(int i, ahjj ahjjVar) {
        if (!yhx.h) {
            alvw g = b.g();
            g.X(alwp.a, "BugleSatellite");
            ((alvg) g.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 50, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return;
        }
        try {
            SatelliteManagerWrapper.getInstance(this.c).registerForCarrierRoamingNtnModeChanged(i, this.d, new wpa(this, ahjjVar));
        } catch (ClassCastException e) {
            alvw d = b.d();
            d.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 82, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged");
        } catch (LinkageError e2) {
            alvw d2 = b.d();
            d2.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d2).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 80, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged");
        }
    }
}
