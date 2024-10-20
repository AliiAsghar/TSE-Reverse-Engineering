package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adji {
    public static final alvi a = alvi.m("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl");
    public final armf b;
    public final armf c;
    public final arpi d;
    public final ReentrantReadWriteLock e;
    public final AtomicBoolean f;
    public final List g;
    public final znj h;
    private final armf i;
    private final armf j;
    private final armf k;

    public adji(znj znjVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, arwe arweVar, arpi arpiVar) {
        znjVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        this.h = znjVar;
        this.b = armfVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.k = armfVar4;
        this.c = armfVar5;
        this.d = arpiVar;
        this.e = new ReentrantReadWriteLock();
        this.f = new AtomicBoolean(false);
        this.g = new ArrayList();
    }

    public static final String p(adjf adjfVar) {
        String str;
        String c = advq.SIM_ID.c(adom.n(adjfVar.a).a);
        adit aditVar = adjfVar.b;
        advq advqVar = advq.PHONE_NUMBER;
        if (aditVar != null) {
            str = aditVar.a;
        } else {
            str = null;
        }
        return "{\n      ProvisioningId: " + c + ",\n      Phone Number: " + advqVar.c(str) + ",\n      SubscriptionId: " + adjfVar.c + "\n    }";
    }

    private final adjf q(adit aditVar) {
        return r(new aaji(aditVar, 7));
    }

    private final adjf r(arqr arqrVar) {
        Object obj;
        Iterator it = this.g.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Boolean) arqrVar.a(obj)).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (adjf) obj;
    }

    private final adjf s(int i) {
        return r(new iim(i, 11));
    }

    private final void t(int i, adix adixVar, adit aditVar) {
        Integer num;
        if (!((acwy) this.j.b()).a()) {
            return;
        }
        wyp wypVar = (wyp) this.k.b();
        if (adixVar != null) {
            num = Integer.valueOf(adixVar.a);
        } else {
            num = null;
        }
        wypVar.t(i, num, aditVar, o());
    }

    public final /* synthetic */ adit a(int i) {
        return (adit) arsd.k(e(i));
    }

    public final adjf b(adiv adivVar) {
        return r(new aaji(adivVar, 8));
    }

    public final alvg c(alvg alvgVar) {
        if (((acwx) this.i.b()).a()) {
            alvgVar.Z(alwk.FULL);
        }
        return alvgVar;
    }

    public final Optional d(adiv adivVar) {
        adit aditVar;
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForRcsProvisioningIdOptional", 127, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getPhoneNumberForRcsProvisioningIdOptional: accessing uninitialized provisioning identities.");
            }
            adjf b = b(adivVar);
            if (b != null) {
                aditVar = b.b;
            } else {
                aditVar = null;
            }
            if (aditVar == null) {
                alvw g = a.g();
                g.X(alwp.a, "BugleRcs");
                alvg alvgVar = (alvg) g;
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForRcsProvisioningIdOptional", 136, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No phone number found for a given provisioning id.");
            }
            return Optional.ofNullable(aditVar);
        } finally {
            readLock.unlock();
        }
    }

    public final Optional e(int i) {
        Object obj;
        adit aditVar;
        Optional ofNullable;
        Object obj2;
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i2).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdOptional", 255, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getPhoneNumberForSubscriptionIdOptional: accessing uninitialized provisioning identities.");
            }
            adit aditVar2 = null;
            if (((acxj) this.b.b()).a()) {
                adjf s = s(i);
                if (s != null) {
                    aditVar2 = s.b;
                } else {
                    alvi alviVar = a;
                    alvw i3 = alviVar.i();
                    i3.X(alwp.a, "BugleRcs");
                    ((alvg) i3.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternal-0jkzt_0", 322, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("phone number null, checking subscription exists in same subscription group.");
                    adjf r = r(new mgc(this, i, 6));
                    if (r != null) {
                        aditVar2 = r.b;
                    } else {
                        alvw i4 = alviVar.i();
                        i4.X(alwp.a, "BugleRcs");
                        alvg c = c((alvg) i4);
                        c.X(ydl.t, Integer.valueOf(i));
                        ((alvg) c.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternal-0jkzt_0", 335, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No RCS phone number found for subscription id.");
                        l();
                    }
                }
                t(14, new adix(i), aditVar2);
                return Optional.ofNullable(aditVar2);
            }
            Iterator it = this.g.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (a.bA(((adjf) obj).c, i)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            adjf adjfVar = (adjf) obj;
            if (adjfVar != null) {
                aditVar = adjfVar.b;
            } else {
                aditVar = null;
            }
            if (aditVar == null) {
                alvw d = a.d();
                d.X(alwp.a, "BugleRcs");
                ((alvg) d.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternalLegacy-0jkzt_0", 299, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("phone number null, checking subscription exists in same subscription group.");
                l();
                Iterator it2 = this.g.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (this.h.aa(((adjf) obj2).c, i)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                adjf adjfVar2 = (adjf) obj2;
                if (adjfVar2 != null) {
                    aditVar2 = adjfVar2.b;
                }
                ofNullable = Optional.ofNullable(aditVar2);
            } else {
                ofNullable = Optional.ofNullable(aditVar);
            }
            t(14, new adix(i), (adit) arsd.k(ofNullable));
            return ofNullable;
        } finally {
            readLock.unlock();
        }
    }

    public final Optional f(adit aditVar) {
        adiv adivVar;
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getRcsProvisioningIdForPhoneNumberOptional", 164, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getRcsProvisioningIdForPhoneNumberOptional: accessing uninitialized provisioning identities.");
            }
            adjf q = q(aditVar);
            adiv adivVar2 = null;
            if (q != null) {
                adivVar = q.a;
            } else {
                adivVar = null;
            }
            if (adivVar == null && ((acxj) this.b.b()).a()) {
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleRcs");
                alvg c = c((alvg) i2);
                c.X(ydl.D, aditVar.a);
                ((alvg) c.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findProvisioningIdByPhoneNumber", 180, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No RCS provisioning id found for given phone number.");
                l();
            } else {
                adivVar2 = adivVar;
            }
            return Optional.ofNullable(adivVar2);
        } finally {
            readLock.unlock();
        }
    }

    public final Optional g(int i) {
        adiv adivVar;
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i2).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "logIfMapNotInitialized", 577, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("Accessing uninitialized provisioning identities.");
            }
            adjf s = s(i);
            if (s == null) {
                alvw i3 = a.i();
                i3.X(alwp.a, "BugleRcs");
                alvg alvgVar = (alvg) i3;
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getRcsProvisioningIdForSubscriptionIdOptional", 99, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No rcs provisioning id found for a given sub id.");
            }
            if (s != null) {
                adivVar = s.a;
            } else {
                adivVar = null;
            }
            return Optional.ofNullable(adivVar);
        } finally {
            readLock.unlock();
        }
    }

    public final Optional h(adit aditVar) {
        adix adixVar;
        aditVar.getClass();
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getSubscriptionIdForPhoneNumberOptional", 361, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getSubscriptionIdForPhoneNumberOptional: accessing uninitialized provisioning identities.");
            }
            adjf q = q(aditVar);
            if (q != null) {
                adixVar = new adix(q.c);
            } else {
                adixVar = null;
            }
            if (adixVar == null && ((acxj) this.b.b()).a()) {
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleRcs");
                alvg c = c((alvg) i2);
                c.X(ydl.D, aditVar.a);
                ((alvg) c.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findSubscriptionIdByPhoneNumber-QfiLYjE", 377, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription id found for MSISDN.");
                l();
            }
            t(13, adixVar, aditVar);
            return Optional.ofNullable(adixVar);
        } finally {
            readLock.unlock();
        }
    }

    public final Set i() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailablePhoneNumbersSync", 422, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailablePhoneNumbers: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adit aditVar = ((adjf) it.next()).b;
                if (aditVar != null) {
                    arrayList.add(aditVar);
                }
            }
            Set aE = aqjn.aE(arrayList);
            if (aE.isEmpty()) {
                alvw g = a.g();
                g.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) g).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailablePhoneNumbersSync", 426, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No phone numbers available.");
            }
            return aE;
        } finally {
            readLock.unlock();
        }
    }

    public final Set j() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                alvg c = c((alvg) i);
                c.V(1, TimeUnit.MINUTES);
                ((alvg) c.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableProvisioningIdsSync", 447, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailableProvisioningIds: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((adjf) it.next()).a);
            }
            return aqjn.aE(arrayList);
        } finally {
            readLock.unlock();
        }
    }

    public final Set k() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            if (!this.f.get()) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) i).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableSubscriptionIdsSync", 467, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailableSubscriptionIds: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new adix(((adjf) it.next()).c));
            }
            Set aE = aqjn.aE(arrayList);
            if (aE.isEmpty()) {
                alvw g = a.g();
                g.X(alwp.a, "BugleRcs");
                ((alvg) c((alvg) g).h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableSubscriptionIdsSync", 471, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription ids.");
            }
            return aE;
        } finally {
            readLock.unlock();
        }
    }

    public final void l() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            alvw d = a.d();
            d.X(alwp.a, "BugleRcs");
            ((alvg) d.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "logDebugIdentityMappingInfos", 532, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Identity mapping for debugging: %s", aqjn.aK(this.g, "\n", null, null, new aams(18), 30));
        } finally {
            readLock.unlock();
        }
    }

    public final void m(adiv adivVar, adit aditVar, int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i2 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            adjf adjfVar = new adjf(adivVar, aditVar, i);
            alvw d = a.d();
            d.X(alwp.a, "BugleRcs");
            ((alvg) d.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "putIdentifierMappingValues", 486, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Adding identity mapping {%s}", p(adjfVar));
            Collection.EL.removeIf(this.g, new zko(new aaji(adivVar, 9), 7));
            this.g.add(adjfVar);
            l();
            this.f.set(true);
        } finally {
            while (i3 < i2) {
                readLock.lock();
                i3++;
            }
            writeLock.unlock();
        }
    }

    public final boolean n() {
        ReentrantReadWriteLock.ReadLock readLock = this.e.readLock();
        readLock.lock();
        try {
            return this.g.isEmpty();
        } finally {
            readLock.unlock();
        }
    }

    @armg
    public final boolean o() {
        return this.f.get();
    }
}
