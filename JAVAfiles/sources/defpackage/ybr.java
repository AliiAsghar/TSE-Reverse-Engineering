package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybr extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterHandler");
    public final xyt b;
    public final ybx c;
    private final arwe d;

    public ybr(arwe arweVar, ybx ybxVar, xyt xytVar) {
        arweVar.getClass();
        xytVar.getClass();
        this.d = arweVar;
        this.c = ybxVar;
        this.b = xytVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(5);
        a2.c(unv.WAKELOCK);
        a2.g(gry.LINEAR);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SatelliteNetworkStateUpdaterHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        ybt ybtVar = (ybt) apbtVar;
        ybtVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new jsf(ybtVar, this, unsVar, (arpe) null, 4));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = ybt.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
