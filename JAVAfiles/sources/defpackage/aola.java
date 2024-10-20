package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aola implements aqrv {
    private static final alvi a = alvi.m("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override // defpackage.aqrv
    public final aqru a(aqux aquxVar, aqrr aqrrVar, aqrs aqrsVar) {
        aokr aokrVar = (aokr) aqrrVar.f(aokq.a);
        if (aokrVar != null) {
            ((alvg) ((alvg) a.d()).h("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 30, "CredentialStrategyInterceptor.java")).t("Using CredentialStrategy: %s", aokrVar.getClass());
            return apsd.r(aqrsVar, aotl.D(new acss(aokrVar, 20))).a(aquxVar, aqrrVar);
        }
        ((alvg) ((alvg) a.d()).h("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 38, "CredentialStrategyInterceptor.java")).q("Did not set CredentialStrategy");
        return aqrsVar.a(aquxVar, aqrrVar);
    }
}
