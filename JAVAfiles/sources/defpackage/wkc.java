package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkc implements adje {
    private static final alwo a = alwo.o("BugleRcsProvisioning");
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider");
    private final armf c;
    private final armf d;
    private final adji e;
    private final armf f;

    public wkc(armf armfVar, armf armfVar2, armf armfVar3, adji adjiVar) {
        this.f = armfVar2;
        this.c = armfVar;
        this.d = armfVar3;
        this.e = adjiVar;
    }

    @Override // defpackage.adje
    public final Optional h(adiv adivVar) {
        return i(adom.n(adivVar).a);
    }

    @Override // defpackage.adje
    public final Optional i(String str) {
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 109, "CachedRcsConfigurationProvider.java")).t("CachedRcsConfiguration getConfiguration for simId:[%s]", advq.SIM_ID.c(str));
        Optional optional = (Optional) ((wkd) this.c.b()).get(str);
        if (((oki) this.f.b()).a()) {
            if (optional == null) {
                alvw i = b.i();
                i.X(alwp.a, "BugleRcsProvisioning");
                alvg alvgVar = (alvg) i;
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 115, "CachedRcsConfigurationProvider.java")).q("Failed to get RCS configuration from the cached provider, configuration is null.");
            } else if (optional.isEmpty()) {
                alvw i2 = b.i();
                i2.X(alwp.a, "BugleRcsProvisioning");
                alvg alvgVar2 = (alvg) i2;
                alvgVar2.Z(alwk.FULL);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 118, "CachedRcsConfigurationProvider.java")).q("Failed to get RCS configuration from the cached provider, configuration is empty.");
            }
        }
        optional.getClass();
        return optional;
    }

    @Override // defpackage.adje
    public final Optional j(adit aditVar) {
        return this.e.f(aditVar).flatMap(new vxg(this, 20));
    }

    @Override // defpackage.adje
    public final Optional k(int i) {
        return this.e.g(i).flatMap(new vxg(this, 20));
    }

    @Override // defpackage.adje
    public final Optional l() {
        return i(((adtn) this.d.b()).l());
    }
}
