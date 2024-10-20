package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pul implements puu {
    public static final alwo a = alwo.o("BugleRcsCapabilities");
    public final ptg b;
    public final puu c;
    public final pvo d;
    public final Executor e;

    public pul(ptg ptgVar, puu puuVar, pvo pvoVar, Executor executor) {
        this.b = ptgVar;
        this.c = puuVar;
        this.d = pvoVar;
        this.e = executor;
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilities", 107, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: start getBatchCapabilities for %d chatEndpoints", alzz.aI(iterable));
        return this.b.b(iterable).i(new pri(this, iterable, 9), this.e);
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilities", 54, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: start getCapabilities for chatEndpoint %s", yyb.bh(qeiVar.d));
        return this.b.a(qeiVar).i(new pri(this, qeiVar, 7), this.e);
    }
}
