package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybs implements wpj {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterListener");
    private final wfh b;

    public ybs(wfh wfhVar) {
        this.b = wfhVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    private final void f(ybt ybtVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleSatellite");
        ((alvg) g.h("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterListener", "queueWorkInPWQ", 56, "SatelliteNetworkStateUpdaterListener.kt")).t("PWQ schedule work with params: %s .. ", ybtVar);
        ((uof) this.b.a.b()).a(upk.a("satellite_network_state_updater", ybtVar));
    }

    @Override // defpackage.wpj
    public final void a(qwe qweVar) {
        qweVar.getClass();
    }

    @Override // defpackage.wpj
    public final void b(qwe qweVar) {
        qweVar.getClass();
    }

    @Override // defpackage.wpj
    public final void c(qwe qweVar) {
        qweVar.getClass();
    }

    @Override // defpackage.wpj
    public final void d(qwe qweVar) {
        aozy createBuilder = ybt.a.createBuilder();
        String b = qweVar.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ybt ybtVar = (ybt) createBuilder.b;
        b.getClass();
        ybtVar.b = b;
        apag s = createBuilder.s();
        s.getClass();
        f((ybt) s);
    }

    @Override // defpackage.wpj
    public final void e(qwe qweVar) {
        aozy createBuilder = ybt.a.createBuilder();
        String b = qweVar.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ybt ybtVar = (ybt) createBuilder.b;
        b.getClass();
        ybtVar.b = b;
        apag s = createBuilder.s();
        s.getClass();
        f((ybt) s);
    }
}
