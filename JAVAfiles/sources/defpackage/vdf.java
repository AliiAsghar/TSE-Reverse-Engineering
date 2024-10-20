package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdf {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory");
    private final armf b;

    public vdf(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    public final vcq a(adit aditVar) {
        vcq a2;
        akrh e = aktp.e("PhoneChannelConfigurationFactory#create");
        try {
            Optional j = ((adje) this.b.b()).j(aditVar);
            if (j.isEmpty()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleTachygram");
                ((alvg) i.h("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory", "createInSpan", 32, "PhoneChannelConfigurationFactory.kt")).q("Configuration is empty for msisdn, using default P/H channel config");
            }
            Optional flatMap = j.flatMap(new vbk(vde.a, 18));
            flatMap.getClass();
            String str = (String) arsd.k(flatMap);
            if (str != null && !arsd.M(str)) {
                utz utzVar = vcq.a;
                a2 = vcp.a(str);
                armd.i(e, null);
                return a2;
            }
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleTachygram");
            ((alvg) i2.h("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory", "createInSpan", 36, "PhoneChannelConfigurationFactory.kt")).q("Tachyon URL is empty for msisdn, using default P/H channel config");
            Object e2 = vcq.a.e();
            e2.getClass();
            a2 = vcp.a((String) e2);
            armd.i(e, null);
            return a2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }
}
