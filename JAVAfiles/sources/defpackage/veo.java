package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class veo {
    public final Optional b;
    public final armf c;
    private final vcy e;
    private final armf f;
    private final vjs g;
    private final vjs h;
    private static final xze d = xze.f("BugleNetwork", veo.class);
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/grpcproxies/GrpcProxies");

    public veo(armf armfVar, vcy vcyVar, vcy vcyVar2, Optional optional, vjs vjsVar, vjs vjsVar2, armf armfVar2, armf armfVar3) {
        this.b = optional;
        this.c = armfVar3;
        this.e = true == ((lpg) armfVar.b()).z() ? vcyVar2 : vcyVar;
        this.g = vjsVar;
        this.h = vjsVar2;
        this.f = armfVar2;
    }

    public final vcy a() {
        d.p("Getting messaging grpc for Ditto.");
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    public final vco b(aqfn aqfnVar) {
        akrh e = aktp.e("GrpcProxies#getPhoneRegistrationGrpcProxy(identity)");
        try {
            d.l("Phone channel bound registration grpc is used.");
            vjs vjsVar = (vjs) this.f.b();
            aqfnVar.getClass();
            vco vcoVar = (vco) ((wpp) vjsVar.a.b()).R(aqfnVar, vdg.a);
            e.close();
            return vcoVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final vjs c() {
        d.l("Anonymous registration grpc is used.");
        return this.g;
    }

    @Deprecated
    public final vjs d() {
        d.l("Phone registration grpc is used.");
        return this.h;
    }
}
