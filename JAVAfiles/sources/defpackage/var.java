package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class var implements vau {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever");
    public final armf a;
    private final anen e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    private final HashSet g = new HashSet();

    public var(armf armfVar, anen anenVar) {
        this.a = armfVar;
        this.e = anenVar;
    }

    private final synchronized boolean h(String str) {
        return this.g.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // defpackage.vau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alor a(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.var.a(java.lang.String):alor");
    }

    @Override // defpackage.vau
    public final alor b(String str) {
        aoui d2 = d(str);
        alok alokVar = new alok();
        alokVar.h("upi_policy_id", d2.b);
        return alokVar.b();
    }

    @Override // defpackage.vau
    public final aouh c(String str) {
        if (str.isEmpty()) {
            alvw i = d.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i;
            alvgVar.Z(alwk.FULL);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getRcsOnboardingFlags", 88, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: simId is missing, return default rcs onboarding flags.");
            return b;
        }
        aouh aouhVar = (aouh) e(vaq.a(str, aoty.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS)).map(new uzd(19)).orElse(b);
        if (aouhVar.equals(b)) {
            alvw g = d.g();
            g.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) g;
            alvgVar2.Z(alwk.MEDIUM);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getRcsOnboardingFlags", 101, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot retrieve rcs onboarding flags in configuration right now, return default flags instead.");
        }
        return aouhVar;
    }

    @Override // defpackage.vau
    public final aoui d(String str) {
        if (str.isEmpty()) {
            return c;
        }
        return (aoui) e(vaq.a(str, aoty.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS)).map(new uzd(20)).orElse(c);
    }

    @Override // defpackage.vau
    public final Optional e(vaq vaqVar) {
        String b = vaqVar.b();
        if (((Optional) this.a.b()).isEmpty()) {
            alvw i = d.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 148, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Could not access MobileConfigurationApi");
            return Optional.empty();
        }
        if (!this.f.containsKey(b)) {
            if (aiut.g()) {
                if (h(b)) {
                    aktp.ah(new ung(this, b, 7), this.e).k(qiu.b(), andi.a);
                }
            } else if (h(b)) {
                Optional a = ((aegz) ((Optional) this.a.b()).get()).a(b);
                if (a.isPresent()) {
                    g(b, (aotw) a.get());
                } else {
                    alvw i2 = d.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 187, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot find configuration from the current mobileConfigurationDataId");
                }
                f(b);
            } else {
                alvw i3 = d.i();
                i3.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) i3;
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 193, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot access SSOT for the same mobileConfigurationDataId that currrently being accessed by another thread");
            }
        }
        if (this.f.containsKey(b)) {
            return Optional.ofNullable((aotw) this.f.get(b));
        }
        if (aiut.g()) {
            alvw i4 = d.i();
            i4.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) i4;
            alvgVar2.Z(alwk.FULL);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 206, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: config is not cached when running on main thread.");
        } else {
            alvw i5 = d.i();
            i5.X(alwp.a, "Bugle");
            alvg alvgVar3 = (alvg) i5;
            alvgVar3.Z(alwk.FULL);
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 209, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: config is not cached when running on background thread.");
        }
        return Optional.empty();
    }

    public final synchronized void f(String str) {
        if (!this.g.remove(str)) {
            alvw h = d.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "removeFromSynchronizationHashSet", 232, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: The mobileConfigurationDataId was not present in the object used for synchronization");
        }
    }

    public final void g(String str, aotw aotwVar) {
        this.f.put(str, aotwVar);
    }
}
