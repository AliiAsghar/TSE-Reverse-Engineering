package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpi implements wns, wnx {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener");
    private final wpd b;

    public wpi(wpd wpdVar) {
        this.b = wpdVar;
    }

    private final void c() {
        alvi alviVar = a;
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 62, "SatelliteBootAndPackageReplacedListener.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executing...");
        if (yhx.h) {
            this.b.b();
            alvw d2 = alviVar.d();
            d2.X(alwp.a, "BugleSatellite");
            ((alvg) d2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 65, "SatelliteBootAndPackageReplacedListener.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executed.");
            return;
        }
        alvw d3 = alviVar.d();
        d3.X(alwp.a, "BugleSatellite");
        ((alvg) d3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 67, "SatelliteBootAndPackageReplacedListener.kt")).t("Satellite Flag disabled. Os.isAtLeastU: %s", Boolean.valueOf(yhx.h));
    }

    @Override // defpackage.wns
    public final void a() {
        alvw d = a.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "onBootComplete", 49, "SatelliteBootAndPackageReplacedListener.kt")).q("onBootComplete executing...");
        c();
    }

    @Override // defpackage.wnx
    public final void b() {
        alvw d = a.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "onPackageReplaced", 57, "SatelliteBootAndPackageReplacedListener.kt")).q("onPackageReplaced executing...");
        c();
    }
}
