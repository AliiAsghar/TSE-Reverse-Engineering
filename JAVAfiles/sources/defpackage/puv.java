package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class puv implements puu {
    public static final alwo a = alwo.o("BugleRcsCapabilities");
    public final puu b;
    private final puu c;
    private final anen d;

    public puv(puu puuVar, puu puuVar2, anen anenVar) {
        this.c = puuVar;
        this.b = puuVar2;
        this.d = anenVar;
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getBatchCapabilities", 63, "RcsCapabilitiesProviderExceptionHandler.java")).r("RcsCapabilitiesProviderExceptionHandler: start downstreamProvider.getBatchCapabilities for %d chatEndpoints", alzz.aI(iterable));
        return this.c.a(iterable).f(psx.class, new pri(this, iterable, 13), this.d);
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getCapabilities", 44, "RcsCapabilitiesProviderExceptionHandler.java")).t("RcsCapabilitiesProviderExceptionHandler: start downstreamProvider.getCapabilities for chatEndpoint %s", yyb.bh(qeiVar.d));
        return this.c.b(qeiVar).f(psx.class, new pri(this, qeiVar, 12), andi.a);
    }
}
