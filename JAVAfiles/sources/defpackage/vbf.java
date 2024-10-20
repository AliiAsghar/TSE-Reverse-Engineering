package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService");
    public final armf b;
    public final armf c;
    public final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public vbf(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.b = armfVar4;
        this.c = armfVar5;
        this.d = armfVar8;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [msh, java.lang.Object] */
    public final Optional a(adiv adivVar) {
        adivVar.getClass();
        Optional map = ((adji) this.e.b()).d(adivVar).map(new vbk(new uxc(this, 2), 1));
        Configuration configuration = (Configuration) arsd.k(((adje) this.f.b()).h(adivVar));
        Object obj = null;
        if (configuration == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService", "getMessagingIdentityFromRcsConfiguration", 81, "MsisdnDiscoveryService.kt")).t("RCS Configuration not found for %s", advq.SIM_ID.c(adom.n(adivVar).a));
        } else {
            Optional F = ((znj) this.g.b()).F(configuration);
            if (F.isPresent() && F.get().e().isPresent()) {
                obj = F.get();
            }
        }
        return Optional.ofNullable(map.orElse(obj));
    }
}
