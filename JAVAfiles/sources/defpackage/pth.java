package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pth implements ptg {
    public static final alwo a = alwo.o("BugleRcsCapabilities");
    public final ptn b;
    private final anen c;
    private final anen d;

    public pth(ptn ptnVar, anen anenVar, anen anenVar2) {
        this.b = ptnVar;
        this.c = anenVar;
        this.d = anenVar2;
    }

    @Override // defpackage.ptg
    public final akul a(qei qeiVar) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "get", 43, "RcsCapabilitiesDatabaseCachingSource.java")).t("RcsCapabilitiesDatabaseCachingSource: get with chatEndpoint %s", yyb.bh(qeiVar.d));
        return aktp.ai(new mig(qeiVar, 15), this.c);
    }

    @Override // defpackage.ptg
    public final akul b(Iterable iterable) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "get", 54, "RcsCapabilitiesDatabaseCachingSource.java")).r("RcsCapabilitiesDatabaseCachingSource: reading %d chatEndpoints", alzz.aI(iterable));
        return aktp.ai(new mig(iterable, 16), this.d);
    }

    @Override // defpackage.ptg
    public final akul c(Map map) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 90, "RcsCapabilitiesDatabaseCachingSource.java")).r("RcsCapabilitiesDatabaseCachingSource: writing %d chatEndpoints", map.size());
        return aktp.ah(new nan(this, map, 6), this.d);
    }

    @Override // defpackage.ptg
    public final akul d(qei qeiVar, pto ptoVar) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 66, "RcsCapabilitiesDatabaseCachingSource.java")).D("RcsCapabilitiesDatabaseCachingSource: put with chatEndpoint %s and capabilities %s", yyb.bh(qeiVar.d), ptoVar.a().b);
        return aktp.ai(new hbd(this, qeiVar, ptoVar, 15, (byte[]) null), this.c).h(new psf(7), this.c);
    }
}
