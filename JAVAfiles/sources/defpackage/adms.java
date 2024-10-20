package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adms implements adje, adjc, admu {
    public static final advp a = new advp("RcsProvisioningManager");
    private final qvv A;
    private final arwe B;
    private final armf C;
    public final armf c;
    public final anen d;
    public final adji e;
    public final wwn f;
    public final adwu g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final qvr l;
    public final adtl m;
    public final wyp n;
    private final List q;
    private final anen r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;
    public final advd b = new advd();
    private final advd o = new advd();
    private final AtomicBoolean p = new AtomicBoolean();

    public adms(armf armfVar, anen anenVar, anen anenVar2, Set set, Set set2, Set set3, Optional optional, List list, adji adjiVar, adtl adtlVar, armf armfVar2, armf armfVar3, wwn wwnVar, adwu adwuVar, armf armfVar4, wyp wypVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, Set set4, qvv qvvVar, arwe arweVar, qvr qvrVar, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        this.c = armfVar;
        this.q = list;
        this.d = anenVar;
        this.r = anenVar2;
        this.e = adjiVar;
        this.m = adtlVar;
        this.s = armfVar2;
        this.t = armfVar3;
        this.f = wwnVar;
        this.g = adwuVar;
        this.u = armfVar4;
        this.n = wypVar;
        this.h = armfVar5;
        this.v = armfVar6;
        this.w = armfVar7;
        this.i = armfVar9;
        this.k = armfVar8;
        this.x = armfVar10;
        this.A = qvvVar;
        this.B = arweVar;
        this.l = qvrVar;
        this.C = armfVar11;
        this.j = armfVar12;
        this.y = armfVar13;
        this.z = armfVar14;
        optional.ifPresent(new abid(this, anenVar, 10, null));
        Iterator it = set.iterator();
        while (true) {
            int i = 3;
            if (!it.hasNext()) {
                break;
            }
            admp admpVar = new admp((adjd) it.next(), Optional.empty(), new admk(this, i));
            advd advdVar = this.b;
            ajqh a2 = advc.a(admpVar, anenVar);
            a2.i(false);
            a2.h(admpVar.a);
            a2.a = new admk(admpVar, 6);
            advdVar.a(a2.g());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            H(Optional.empty(), (adjb) it2.next(), anenVar);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            adiu adiuVar = (adiu) it3.next();
            afxz afxzVar = new afxz(adiuVar, adjiVar, this.n, this.u, this.h, new admk(this, 9));
            adlz adlzVar = new adlz(afxzVar, 2);
            advd advdVar2 = this.o;
            ajqh a3 = advc.a(adlzVar, anenVar);
            a3.i(false);
            a3.h(adiuVar);
            a3.a = new adkk(7);
            advdVar2.a(a3.g());
            adlz adlzVar2 = new adlz(afxzVar, 3);
            advd advdVar3 = this.b;
            ajqh a4 = advc.a(adlzVar2, anenVar);
            a4.i(false);
            a4.h(adiuVar);
            a4.a = new adkk(17);
            advdVar3.a(a4.g());
        }
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            riw riwVar = (riw) it4.next();
            admr admrVar = new admr(new admk(this, 4), new admk(this, 5), this.f, this.n);
            advd advdVar4 = this.o;
            ajqh a5 = advc.a(admrVar, anenVar);
            a5.i(false);
            a5.h(riwVar);
            a5.a = new adkk(11);
            advdVar4.a(a5.g());
        }
    }

    private final void H(Optional optional, adjb adjbVar, Executor executor) {
        admn admnVar = new admn(adjbVar, optional);
        ajqh a2 = advc.a(admnVar, executor);
        a2.i(false);
        a2.h(adjbVar);
        a2.a = new admk(admnVar, 7);
        this.o.a(a2.g());
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [arwe, java.lang.Object] */
    private final void I(Optional optional, adiv adivVar) {
        wxb wxbVar = (wxb) this.f.j(adom.n(adivVar)).orElse(null);
        if (wxbVar == null) {
            advr.r(a, "No SimSubscriptionInfo for sim with id: %s", advq.SIM_ID.c(adom.n(adivVar)));
            if (((Boolean) this.v.b()).booleanValue()) {
                wyp wypVar = this.n;
                qjh.l(wypVar.a, null, new uog(wypVar, adivVar, (arpe) null, 9), 3);
                return;
            }
            return;
        }
        int i = 4;
        if (((Boolean) this.v.b()).booleanValue()) {
            if (optional.isEmpty()) {
                advr.l(a, "Configuration is empty: %s for simId: %s", Boolean.valueOf(optional.isEmpty()), advq.SIM_ID.c(adom.n(adivVar)));
                this.n.u(6, adivVar);
            } else if (optional.filter(new addf(16)).isPresent()) {
                advr.r(a, "Configuration is invalid for simId: %s", advq.SIM_ID.c(adom.n(adivVar)));
                this.n.u(9, adivVar);
            } else {
                Optional flatMap = optional.flatMap(new admk(this, i));
                if (!this.g.b(wxbVar.d) && flatMap.isEmpty()) {
                    advr.r(a, "Phone number not present in configuration and simId: %s", advq.SIM_ID.c(adom.n(adivVar)));
                    this.n.u(8, adivVar);
                }
            }
        } else {
            advr.l(a, "Configuration is empty: %s for simId: %s", Boolean.valueOf(optional.isEmpty()), advq.SIM_ID.c(adom.n(adivVar)));
        }
        if (((Boolean) this.z.b()).booleanValue() && optional.isEmpty()) {
            return;
        }
        optional.filter(new addf(15)).flatMap(new admk(this, i)).ifPresentOrElse(new aakk(this, adivVar, wxbVar, 7), new adub((Object) this, (Object) adivVar, (Object) wxbVar, 1, (byte[]) null));
    }

    private final void J(int i) {
        if (((Boolean) this.x.b()).booleanValue()) {
            qiu.h(this.d.submit(akto.k(new ijt(this, i, 12))));
        }
    }

    private final void K(int i) {
        akul c;
        c = qjh.c(this.B, arpj.a, arwf.a, new uxn(this.A, i, (arpe) null, 1));
        qiu.f(c.i(new mhp(this, i, 5), this.r), "Failed to log provisioning apis comparison event for subId");
    }

    private final void L(adit aditVar) {
        akul c;
        aozy createBuilder = qei.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = aditVar.a;
        apag apagVar = createBuilder.b;
        qei qeiVar = (qei) apagVar;
        qeiVar.b |= 2;
        qeiVar.d = str;
        qeh qehVar = qeh.PHONE;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qvv qvvVar = this.A;
        qei qeiVar2 = (qei) createBuilder.b;
        qeiVar2.c = qehVar.e;
        qeiVar2.b |= 1;
        qei qeiVar3 = (qei) createBuilder.s();
        arwe arweVar = this.B;
        qeiVar3.getClass();
        c = qjh.c(arweVar, arpj.a, arwf.a, new qsk(qvvVar, qeiVar3, (arpe) null, 8, (byte[]) null));
        qiu.f(c.i(new yui(this, aditVar, 17, null), this.r), "Failed to log provisioning apis comparison event for phone number");
    }

    public final Set A() {
        armf armfVar = this.u;
        boolean g = aiut.g();
        if (((Boolean) armfVar.b()).booleanValue()) {
            qiu.h(this.d.submit(akto.k(new admm(this, g, 0))));
        }
        return this.e.i();
    }

    public final void B(wxb wxbVar) {
        akrh e = aktp.e("RcsProvisioningManager#addAvailabilityToIdentityMapForSim");
        try {
            adiw adiwVar = new adiw(wxbVar.c);
            Optional n = n(wxbVar.c);
            advp advpVar = a;
            advr.l(advpVar, "qualifiedProvisioningEngineAdapter is present: %s", Boolean.valueOf(n.isPresent()));
            adjl adjlVar = (adjl) n.map(new admk(adiwVar, 10)).orElse(null);
            advr.l(advpVar, "getAvailabilityForRcsProvisioningIdSync: %s", adjlVar);
            if (adjlVar == null) {
                advr.l(advpVar, "Cannot get provisioning adapter for simId: %s", wxbVar.c);
            } else {
                r(adiwVar.a, adjlVar);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized void C() {
        akrh e;
        akrh e2 = aktp.e("RcsProvisioningManager#doPopulateRcsAvailableIdentityMapIfEmpty");
        try {
            if (!this.e.n()) {
                advr.l(a, "Identity mapping not empty. Backfill not required.", new Object[0]);
                this.e.l();
            } else if (this.p.get()) {
                advr.l(a, "Skipping backfill of identity mapping.", new Object[0]);
            } else {
                advp advpVar = a;
                advr.l(advpVar, "Calculating availability", new Object[0]);
                if (((Boolean) this.t.b()).booleanValue()) {
                    e = aktp.e("RcsProvisioningManager#addAvailabilityToIdentityMapForAllSims");
                    try {
                        advr.l(advpVar, "Computing availability for all sims.", new Object[0]);
                        Iterator it = this.f.p().iterator();
                        while (it.hasNext()) {
                            B((wxb) it.next());
                        }
                        e.close();
                    } finally {
                    }
                } else {
                    e = aktp.e("RcsProvisioningManager#addAvailabilityToIdentityMapForDefaultSim");
                    try {
                        advr.l(advpVar, "Computing availability for default call sim.", new Object[0]);
                        this.f.h(wwm.a).ifPresentOrElse(new adlr(this, 7), new zth(13));
                        e.close();
                    } finally {
                    }
                }
                this.e.l();
                this.p.set(true);
            }
            e2.close();
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D() {
        return this.p.get();
    }

    public final Optional E(int i) {
        return this.f.g(i, false).map(new adkk(14));
    }

    public final akul F(int i, int i2, boolean z) {
        this.n.t(i, Integer.valueOf(i2), null, z);
        return aktp.ag(null);
    }

    public final akul G(int i, adit aditVar, boolean z) {
        this.n.t(i, null, aditVar, z);
        return aktp.ag(null);
    }

    @Override // defpackage.adjc
    public final adjl a(adit aditVar) {
        if (((Boolean) this.C.b()).booleanValue()) {
            L(aditVar);
        }
        if (((Boolean) this.u.b()).booleanValue()) {
            qiu.h(this.d.submit(akto.k(new aakf(this, aditVar, 12))));
        }
        return (adjl) this.e.f(aditVar).map(new adkk(13)).map(new admk(this, 8)).orElse(new adjl(amwt.DISABLED_SIM_ABSENT));
    }

    @Override // defpackage.adjc
    public final adjl b(String str) {
        Optional n = n(str);
        if (n.isEmpty()) {
            return new adjl(amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
        }
        return ((znj) n.get()).af(str);
    }

    @Override // defpackage.adjc
    @Deprecated
    public final adjl c() {
        return b(((adtn) this.c.b()).l());
    }

    @Override // defpackage.adjc
    public final adjl d(int i) {
        adjl m;
        akrh e = aktp.e("RcsProvisioningManager#getCachedRcsAvailabilityForSubId");
        try {
            if (((Boolean) this.C.b()).booleanValue()) {
                K(i);
            }
            J(i);
            if (i < 0) {
                advr.l(a, "getCachedRcsAvailabilityForSubId called with an invalid sub id: %s", Integer.valueOf(i));
                m = new adjl(amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
            } else {
                m = m(i);
            }
            e.close();
            return m;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adjc
    public final akul e(final int i) {
        anen anenVar;
        akrh e = aktp.e("RcsProvisioningManager#getRcsAvailabilityForSubIdAsync");
        try {
            if (((Boolean) this.C.b()).booleanValue()) {
                K(i);
            }
            akul g = akul.g(g());
            algk algkVar = new algk() { // from class: adml
                @Override // defpackage.algk
                public final Object apply(Object obj) {
                    adms admsVar = adms.this;
                    boolean booleanValue = ((Boolean) admsVar.j.b()).booleanValue();
                    int i2 = i;
                    if (booleanValue) {
                        int i3 = 0;
                        if (i2 < 0) {
                            advr.r(adms.a, "getRcsAvailabilityForSubId called with an invalid sub id: %s", Integer.valueOf(i2));
                            return new adjl(amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
                        }
                        Optional map = admsVar.f.i(i2).map(new adkk(4)).map(new adkk(5));
                        if (map.isEmpty()) {
                            advr.r(adms.a, "getSimIdFromSubId for subId: %s retuned no mapping.", Integer.valueOf(i2));
                        }
                        return (adjl) map.map(new adkk(6)).map(new admk(admsVar, i3)).orElse(new adjl(amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION));
                    }
                    return admsVar.d(i2);
                }
            };
            if (((Boolean) this.j.b()).booleanValue()) {
                anenVar = this.d;
            } else {
                anenVar = this.r;
            }
            akul h = g.h(algkVar, anenVar);
            e.b(h);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adjc
    public final akul f() {
        akrh e = aktp.e("RcsProvisioningManager#getRcsAvailablePhoneNumbersAsync");
        try {
            akul h = akul.g(g()).h(new adhe(this, 9), this.r);
            e.b(h);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adjc
    public final ListenableFuture g() {
        if (!this.e.n()) {
            advr.l(a, "Identity mapping not empty. Backfill not required.", new Object[0]);
            this.e.l();
            return aneh.a;
        }
        if (this.p.get()) {
            advr.l(a, "Skipping backfill of identity mapping.", new Object[0]);
            return aneh.a;
        }
        advr.l(a, "Scheduling identity mapping backfill.", new Object[0]);
        return this.d.submit(akto.k(new aaze(this, 6)));
    }

    @Override // defpackage.adje
    public final Optional h(adiv adivVar) {
        return i(adom.n(adivVar).a);
    }

    @Override // defpackage.adje
    public final Optional i(String str) {
        Optional ag;
        akrh e = aktp.e("RcsProvisioningManager#getConfiguration");
        try {
            Optional n = n(str);
            if (n.isEmpty()) {
                ag = Optional.empty();
            } else {
                ag = ((znj) n.get()).ag(str);
            }
            e.close();
            return ag;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adje
    public final Optional j(adit aditVar) {
        akrh e = aktp.e("RcsProvisioningManager#getConfigurationByPhoneNumber");
        try {
            Optional map = this.e.f(aditVar).map(new aaky(this, 20));
            if (((Boolean) this.u.b()).booleanValue()) {
                qiu.h(this.d.submit(akto.k(new xqt(this, aditVar, map, 13))));
            }
            if (((Boolean) this.C.b()).booleanValue()) {
                L(aditVar);
            }
            e.close();
            return map;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adje
    public final Optional k(int i) {
        akrh e = aktp.e("RcsProvisioningManager#getConfigurationBySubscriptionId");
        try {
            if (((Boolean) this.C.b()).booleanValue()) {
                K(i);
            }
            Optional flatMap = this.e.g(i).flatMap(new admk(this, 1));
            e.close();
            return flatMap;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adje
    @Deprecated
    public final Optional l() {
        return i(((adtn) this.c.b()).l());
    }

    public final adjl m(int i) {
        return (adjl) x(i).map(new adkk(6)).map(new admk(this, 0)).orElse(new adjl(amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional n(String str) {
        alur it = ((alog) this.q).iterator();
        if (it.hasNext()) {
            return Optional.of((znj) it.next());
        }
        advr.r(a, "ProvisioningEngineAdapter not found for SIM %s", advq.SIM_ID.c(str));
        return Optional.empty();
    }

    @Override // defpackage.adjc
    public final Set o() {
        akrh e = aktp.e("RcsProvisioningManager#getRcsAvailablePhoneNumbers");
        try {
            if (((Boolean) this.w.b()).booleanValue() && !D() && !aiut.g() && this.e.i().isEmpty()) {
                C();
            }
            Set A = A();
            e.close();
            return A;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adjc
    public final Set p() {
        if (((Boolean) this.u.b()).booleanValue()) {
            if (((Boolean) this.h.b()).booleanValue()) {
                qiu.h(this.d.submit(akto.k(new aaze(this, 7))));
            } else {
                this.n.v(2, this.e.j(), null);
            }
        }
        if (((Boolean) this.w.b()).booleanValue() && !D() && !aiut.g() && this.e.j().isEmpty()) {
            C();
        }
        adji adjiVar = this.e;
        armf armfVar = this.t;
        Set j = adjiVar.j();
        if (!((Boolean) armfVar.b()).booleanValue() && j.size() > 1) {
            advr.r(a, "DSDR is disabled and multiple sims RCS available, returning only the default SIM.", new Object[0]);
            return (Set) Collection.EL.stream(j).filter(new zko(this, 9)).collect(alls.b);
        }
        return j;
    }

    @Override // defpackage.adjc
    public final void q(String str, adjb adjbVar, Executor executor) {
        H(Optional.of(str), adjbVar, executor);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [arwe, java.lang.Object] */
    @Override // defpackage.admu
    public final void r(String str, adjl adjlVar) {
        int i;
        advp advpVar = a;
        int i2 = 0;
        advr.l(advpVar, "Receive onRcsAvailabilityUpdate, SIM = %s, availability = %s", advq.SIM_ID.c(str), adjlVar);
        if (adjlVar.c()) {
            adiw adiwVar = new adiw(str);
            Optional h = h(adiwVar);
            if (h.isEmpty()) {
                advr.r(advpVar, "onRcsAvailabilityUpdate: Configuration is empty for SIM = %s", advq.SIM_ID.c(str));
            }
            I(h, adiwVar);
        } else {
            if (((Boolean) this.y.b()).booleanValue()) {
                wyp wypVar = this.n;
                adiw adiwVar2 = new adiw(str);
                amwt amwtVar = adjlVar.a;
                amwtVar.getClass();
                mmz mmzVar = new mmz(wypVar, adiwVar2, amwtVar, (arpe) null, 16);
                arpj arpjVar = arpj.a;
                arwf arwfVar = arwf.a;
                arwfVar.getClass();
                qjh.f(wypVar.a, qix.a, arpjVar, arwfVar, mmzVar);
            }
            adji adjiVar = this.e;
            adiw adiwVar3 = new adiw(str);
            ReentrantReadWriteLock reentrantReadWriteLock = adjiVar.e;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                alvw d = adji.a.d();
                d.X(alwp.a, "BugleRcs");
                ((alvg) d.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "removeIdentifierMapping", 511, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Removing identity mapping {ProvisioningId: %s}", advq.SIM_ID.c(adom.n(adiwVar3).a));
                Collection.EL.removeIf(adjiVar.g, new zko(new aaji(adiwVar3, 10), 8));
                adjiVar.l();
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        this.o.b(new admo(str, adjlVar));
    }

    @Override // defpackage.admu
    public final void s(String str, Optional optional) {
        advp advpVar = a;
        advr.l(advpVar, "Receive onRcsConfigurationUpdate, SIM = %s, configuration = %s", advq.SIM_ID.c(str), optional.map(new adkk(16)).orElse("<empty>"));
        if (optional.isEmpty()) {
            advr.r(advpVar, "onRcsConfigurationUpdate: Configuration is empty for SIM = %s", advq.SIM_ID.c(str));
        }
        I(optional, new adiw(str));
        this.b.b(new admq(str, optional));
    }

    @Override // defpackage.adjc
    public final void t(adjb adjbVar) {
        this.o.d(adjbVar);
    }

    @Override // defpackage.adjc
    public final boolean u(adit aditVar) {
        return o().contains(aditVar);
    }

    @Override // defpackage.adjc
    public final boolean v(String str) {
        try {
            return u(((adae) this.s.b()).d(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.adjc
    public final boolean w(int i) {
        akrh e = aktp.e("RcsProvisioningManager#isRcsAvailableForSubId");
        try {
            J(i);
            boolean z = false;
            byte b = 0;
            if (i < 0) {
                advr.l(a, "isRcsAvailableForSubId called with an invalid sub id: %s", Integer.valueOf(i));
            } else {
                int i2 = 6;
                if (((Boolean) this.u.b()).booleanValue()) {
                    x(i).ifPresentOrElse(new adlr(this, i2), new adhp(this, 9));
                }
                z = ((amwt) x(i).map(new adkk(i2)).map(new admk(this, b == true ? 1 : 0)).map(new adkk(10)).orElse(amwt.BUGLE_LOADING_AVAILABILITY_EXCEPTION)).equals(amwt.AVAILABLE);
            }
            e.close();
            return z;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional x(int i) {
        return this.f.g(i, true).map(new adkk(13));
    }

    public final Optional y(String str) {
        return i(str).flatMap(new admk(this, 4)).map(new adkk(12));
    }

    public final Map z(Set set) {
        return (Map) Collection.EL.stream(set).collect(Collectors.toMap(new adkk(8), new admk(this, 2), new mcb(13), new addh(3)));
    }
}
