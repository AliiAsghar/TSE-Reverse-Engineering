package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpl implements wpj {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener");
    private final armf b;

    public wpl(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    @Override // defpackage.wpj
    public final void a(qwe qweVar) {
        qweVar.getClass();
        alvw g = a.g();
        g.X(alwp.a, "BugleSatellite");
        ((alvg) g.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "offDefaultDataSatelliteToNoConnection", 53, "SatelliteConnectionLoggerListener.kt")).t("Default data went from satellite to no connection for %s", qweVar);
    }

    @Override // defpackage.wpj
    public final void b(qwe qweVar) {
        qweVar.getClass();
        alvw g = a.g();
        g.X(alwp.a, "BugleSatellite");
        ((alvg) g.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "offDefaultDataSatelliteToTerrestrial", 49, "SatelliteConnectionLoggerListener.kt")).q("Default data is newly terrestrial");
    }

    @Override // defpackage.wpj
    public final void c(qwe qweVar) {
        qweVar.getClass();
        alvw g = a.g();
        g.X(alwp.a, "BugleSatellite");
        ((alvg) g.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onDefaultDataSatelliteEvent", 45, "SatelliteConnectionLoggerListener.kt")).q("Default data is newly satellite");
    }

    @Override // defpackage.wpj
    public final void d(qwe qweVar) {
        wfh wfhVar = (wfh) this.b.b();
        aozy createBuilder = amyb.a.createBuilder();
        createBuilder.getClass();
        amya amyaVar = amya.a;
        amyaVar.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyb amybVar = (amyb) createBuilder.b;
        amybVar.c = amyaVar;
        amybVar.b = 100;
        wfhVar.i(aktp.aK(createBuilder));
    }

    @Override // defpackage.wpj
    public final void e(qwe qweVar) {
        wfh wfhVar = (wfh) this.b.b();
        aozy createBuilder = amyb.a.createBuilder();
        createBuilder.getClass();
        amxz amxzVar = amxz.a;
        amxzVar.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyb amybVar = (amyb) createBuilder.b;
        amybVar.c = amxzVar;
        amybVar.b = 101;
        wfhVar.i(aktp.aK(createBuilder));
    }
}
