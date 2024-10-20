package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pus implements puu {
    public static final alwo a = alwo.o("BugleRcsCapabilities");
    public final puu b;
    public final pvo c;
    public final anen d;
    public final lgg e;
    private final puu f;

    public pus(puu puuVar, puu puuVar2, lgg lggVar, anen anenVar, pvo pvoVar) {
        this.b = puuVar2;
        this.f = puuVar;
        this.e = lggVar;
        this.d = anenVar;
        this.c = pvoVar;
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getBatchCapabilities", 172, "RcsCapabilitiesBackgroundUpdater.java")).r("RcsCapabilitiesBackgroundUpdater: start getBatchCapabilities for %d chatEndpoints", alzz.aI(iterable));
        akul a2 = this.f.a(iterable);
        qiu.e(a2.i(new prf(this, 3), this.d).e(psx.class, new psf(12), andi.a));
        return a2;
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 84, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: start getCapabilities with chatEndpoint %s ", yyb.bh(qeiVar.d));
        akul b = this.f.b(qeiVar);
        qiu.e(b.i(new pri(this, qeiVar, 11), this.d).e(psx.class, new puy(qeiVar, 1), andi.a));
        return b;
    }
}
