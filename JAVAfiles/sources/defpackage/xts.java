package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xts {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public xts(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
    }

    public final Map a() {
        Iterator it;
        adix adixVar;
        adix adixVar2;
        xts xtsVar = this;
        aros arosVar = new aros();
        akrh e = aktp.e("SimRegistrationInfoProvider#get#buildMap");
        try {
            Set<adiv> p = ((adjc) xtsVar.b.b()).p();
            p.getClass();
            ArrayList arrayList = new ArrayList(aqjn.J(p, 10));
            for (adiv adivVar : p) {
                adivVar.getClass();
                arrayList.add(adom.n(adivVar));
            }
            alvw g = a.g();
            g.X(alwp.a, "BugleTransport");
            alvg alvgVar = (alvg) g.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 40, "SimRegistrationInfoProvider.kt");
            ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(yyb.bh(((adiw) it2.next()).a));
            }
            alvgVar.t("Retrieved RCS available simIds: %s", arrayList2);
            if (!((okr) xtsVar.e.b()).a() && arrayList.size() > 1) {
                throw new IllegalStateException("More than one SIM available for RCS even though enableMultiSimRcs is false.");
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                adiw adiwVar = (adiw) it3.next();
                Configuration configuration = (Configuration) arsd.k(((adje) xtsVar.c.b()).h(adiwVar));
                if (configuration == null) {
                    alvw i = a.i();
                    i.X(alwp.a, "BugleTransport");
                    ((alvg) i.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 55, "SimRegistrationInfoProvider.kt")).t("No configuration found for SIM with simId %s", yyb.bh(adiwVar.a));
                } else {
                    adji adjiVar = (adji) xtsVar.d.b();
                    adiwVar.getClass();
                    ReentrantReadWriteLock.ReadLock readLock = adjiVar.e.readLock();
                    readLock.lock();
                    try {
                        if (!adjiVar.f.get()) {
                            alvw i2 = adji.a.i();
                            i2.X(alwp.a, "BugleRcs");
                            it = it3;
                            ((alvg) adjiVar.c((alvg) i2).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getSubscriptionIdForRcsProvisioningIdOptional", 209, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getSubscriptionIdForRcsProvisioningIdOptional: accessing uninitialized provisioning identities.");
                        } else {
                            it = it3;
                        }
                        adjf b = adjiVar.b(adiwVar);
                        if (b != null) {
                            adixVar = new adix(b.c);
                        } else {
                            adixVar = null;
                        }
                        if (adixVar == null && ((acxj) adjiVar.b.b()).a()) {
                            alvw i3 = adji.a.i();
                            i3.X(alwp.a, "BugleRcs");
                            ((alvg) adjiVar.c((alvg) i3).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findSubscriptionIdByProvisioningId-QfiLYjE", 224, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription id found for RCS provisioning id.");
                            adjiVar.l();
                            adixVar2 = null;
                        } else {
                            adixVar2 = adixVar;
                        }
                        Optional ofNullable = Optional.ofNullable(adixVar2);
                        readLock.unlock();
                        adix adixVar3 = (adix) arsd.k(ofNullable);
                        if (adixVar3 == null) {
                            alvw i4 = a.i();
                            i4.X(alwp.a, "BugleTransport");
                            ((alvg) i4.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 68, "SimRegistrationInfoProvider.kt")).t("No subscription id found for SIM with simId %s", yyb.bh(adiwVar.a));
                        } else {
                            arosVar.put(adiwVar, new xtq(configuration, adixVar3.a));
                        }
                        xtsVar = this;
                        it3 = it;
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                }
            }
            armd.i(e, null);
            return arosVar.e();
        } finally {
        }
    }
}
