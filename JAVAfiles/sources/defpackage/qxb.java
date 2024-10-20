package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxb {
    public static final alwo a = alwo.o("BugleDataModel");
    public static final xze b = xze.g("BugleDataModel", "SubscriptionsTracker");
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final qyd g;
    public final pkx h;
    private final armf k;
    private final armf l;
    private final omc m;
    private volatile alog n;
    public final ReentrantLock j = new ReentrantLock();
    public final tm i = new tm();

    public qxb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, qyd qydVar, omc omcVar, pkx pkxVar) {
        this.c = armfVar;
        this.d = armfVar2;
        this.k = armfVar3;
        this.e = armfVar4;
        this.l = armfVar5;
        this.f = armfVar6;
        this.g = qydVar;
        this.m = omcVar;
        this.h = pkxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alpt f() {
        alpr alprVar = new alpr();
        taz e = ParticipantsTable.e();
        e.w("SelfIdentitiesTracker#getExistingSelfSubIds");
        e.g(new qvm(13));
        alprVar.j(e.b().g());
        alpt g = alprVar.g();
        ((alwl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getExistingSelfSubIds", 961, "SubscriptionsTracker.java")).t("SelfIdentitiesTracker getExistingSelfSubIds returning %s", g);
        return g;
    }

    public static String g(ykb ykbVar) {
        return ykbVar.y();
    }

    public static boolean k(tap tapVar) {
        if (tapVar.d != -2) {
            return true;
        }
        return false;
    }

    private final qwm l(int i) {
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((agnq) this.k.b()).c("SelfParticipantsData#insertInactiveSelfParticipant", new mso(this, i, 2));
        this.j.lock();
        try {
            String M = bindData.M();
            qwm qwmVar = (qwm) this.i.get(M);
            if (qwmVar == null) {
                quo quoVar = new quo(bindData, ((msk) this.l.b()).x(bindData));
                this.i.put(M, quoVar);
                ((alwl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "putSubscriptionIfAbsent", 415, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker putSubscriptionIfAbsent adding participant=%s for subId=%s", M, quoVar.e());
                qwmVar = quoVar;
            }
            return qwmVar;
        } finally {
            this.j.unlock();
        }
    }

    public final qwm a(SelfIdentityId selfIdentityId) {
        qwm qwmVar;
        Object obj;
        this.j.lock();
        if (selfIdentityId != null) {
            try {
                qwmVar = (qwm) this.i.get(selfIdentityId.a());
            } catch (Throwable th) {
                this.j.unlock();
                throw th;
            }
        } else {
            qwmVar = null;
        }
        alwl alwlVar = (alwl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSubscriptionBySelfParticipantId", 262, "SubscriptionsTracker.java");
        if (qwmVar != null) {
            obj = Integer.valueOf(qwmVar.e());
        } else {
            obj = "(null)";
        }
        alwlVar.D("SelfIdentitiesTracker getSubscriptionBySelfParticipantId returning subId=%s for selfId=%s", obj, selfIdentityId);
        this.j.unlock();
        return qwmVar;
    }

    public final qwm b(int i) {
        qwm qwmVar;
        this.j.lock();
        try {
            int i2 = this.i.d;
            do {
                i2--;
                if (i2 >= 0) {
                    qwmVar = (qwm) this.i.g(i2);
                } else {
                    this.j.unlock();
                    ((alwl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSubscriptionBySubId", 287, "SubscriptionsTracker.java")).r("SubscriptionsTracker getSubscriptionBySubId did not find subId=%s in cache", i);
                    return null;
                }
            } while (qwmVar.e() != i);
            return qwmVar;
        } finally {
            this.j.unlock();
        }
    }

    public final qwm c(SelfIdentityId selfIdentityId) {
        akrh e = aktp.e("loadSubscriptionBySelfParticipantId");
        try {
            qwm a2 = a(selfIdentityId);
            if (a2 != null) {
                e.close();
                return a2;
            }
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionBySelfParticipantId", 306, "SubscriptionsTracker.java")).t("SubscriptionsTracker#loadSubscriptionBySelfParticipantId had cache miss for self %s. Refreshing self participants", selfIdentityId);
            j();
            qwm a3 = a(selfIdentityId);
            if (a3 == null) {
                xyo e2 = b.e();
                e2.H("Subscription does not exist.");
                e2.z("selfId", selfIdentityId);
                e2.q();
            }
            e.close();
            return a3;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final qwm d(int i) {
        qwm qwmVar;
        akrh e = aktp.e("loadSubscriptionBySubId");
        try {
            qwm b2 = b(i);
            if (b2 != null) {
                e.close();
                return b2;
            }
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionBySubId", 325, "SubscriptionsTracker.java")).r("SelfParticipantsData#loadSubscriptionBySubId miss for subId=%s", i);
            if (i != -1 && ((yjy) this.c.b()).h(i).d() == -1) {
                xyo a2 = b.a();
                a2.H("Subscription is not active.");
                a2.x("subId", i);
                a2.q();
                qwmVar = l(i);
            } else {
                j();
                qwm b3 = b(i);
                if (b3 == null) {
                    xyo e2 = b.e();
                    e2.H("Subscription is not active after refresh.");
                    e2.x("subId", i);
                    e2.q();
                    qwmVar = l(i);
                } else {
                    qwmVar = b3;
                }
            }
            e.close();
            return qwmVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog e() {
        akrh e = aktp.e("getActiveSubscriptions");
        try {
            this.j.lock();
            try {
                int i = this.i.d;
                SparseArray sparseArray = new SparseArray(i);
                for (int i2 = 0; i2 < i; i2++) {
                    qwm qwmVar = (qwm) this.i.g(i2);
                    if (qwmVar.i() && !qwmVar.j()) {
                        sparseArray.put(qwmVar.d(), qwmVar);
                    }
                }
                int size = sparseArray.size();
                alob d = alog.d(size + 1);
                qwm b2 = b(-1);
                if (b2 == null) {
                    b.q("cannot find subscription with DEFAULT_SELF_SUB_ID.");
                } else if (b2.i()) {
                    d.h(b2);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    d.h((qwm) sparseArray.valueAt(i3));
                }
                alog g = d.g();
                ((alwl) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getActiveSubscriptions", 242, "SubscriptionsTracker.java")).w("SelfIdentitiesTracker getActiveSelfIdentities found %s activeSubscriptions and is returning %s", sparseArray.size(), Collection.EL.stream(g).map(new qvm(15)).collect(alls.a));
                e.close();
                return g;
            } finally {
                this.j.unlock();
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(int i) {
        albo.T(((agnq) this.k.b()).j());
        int i2 = 1073741824;
        do {
            i2++;
        } while (f().contains(Integer.valueOf(i2)));
        tbb f = ParticipantsTable.f();
        f.aj("allocateNewVirtualSubId-participants");
        f.H(i2);
        f.G(-1);
        f.ah();
        tbd tbdVar = new tbd();
        tbdVar.q(i);
        if (f.Y(new tbc(tbdVar), "participants-buildAndUpdateForSubId") > 0) {
            tkp tkpVar = new tkp();
            tkpVar.aj("allocateNewVirtualSubId-selfParticipants");
            tkpVar.e(i2);
            tkpVar.d(-1);
            tkpVar.ah();
            tkpVar.b(i);
            xyo c = b.c();
            c.H("Successfully allocated new virtual subId.");
            c.l(i);
            c.x("virtualSubId", i2);
            c.q();
        }
    }

    public final void i(List list) {
        this.j.lock();
        try {
            this.i.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                this.i.put(bindData.M(), new quo(bindData, ((msk) this.l.b()).x(bindData)));
            }
            alwl alwlVar = (alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "bindToTrackingMap", 144, "SubscriptionsTracker.java");
            Stream map = Collection.EL.stream(this.i.entrySet()).map(new qvm(14));
            int i = alog.d;
            alwlVar.t("SubscriptionsTracker bindToTrackingMap bound participants: %s", map.collect(alls.a));
        } finally {
            this.j.unlock();
        }
    }

    @Deprecated
    public final void j() {
        final List l = ((yjy) this.c.b()).l();
        akrh e = aktp.e("refreshSelfParticipantList");
        try {
            xyo a2 = b.a();
            a2.H("refreshSelfParticipantList.");
            a2.K("count", l);
            a2.q();
            alwo alwoVar = a;
            alwl alwlVar = (alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "refreshSelfParticipantListInternal", 509, "SubscriptionsTracker.java");
            Stream map = Collection.EL.stream(l).map(new qvm(17));
            int i = alog.d;
            alwlVar.t("SubscriptionsTracker#refreshSelfParticipantList(%s)", map.collect(alls.a));
            ((agnq) this.k.b()).e("SelfParticipantsData#refreshSelfParticipantList", new Runnable() { // from class: qwy
                /* JADX WARN: Type inference failed for: r14v25, types: [msh, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v27, types: [msh, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    qxb qxbVar;
                    tkh tkhVar;
                    Object apply;
                    int e2;
                    String M;
                    Optional l2;
                    tkl tklVar;
                    tkh tkhVar2;
                    SparseArray sparseArray = new SparseArray();
                    List list = l;
                    alpt f = qxb.f();
                    Iterator it = list.iterator();
                    while (true) {
                        qxbVar = qxb.this;
                        tkhVar = null;
                        int i2 = 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        ykb ykbVar = (ykb) it.next();
                        int a3 = ykbVar.a();
                        sparseArray.put(a3, ykbVar);
                        if (a3 == ((yjy) qxbVar.c.b()).c()) {
                            sparseArray.put(-1, ykbVar);
                        }
                        String g = qxb.g(ykbVar);
                        if (TextUtils.isEmpty(g)) {
                            ((alwl) qxb.a.m().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "findSelfParticipantForSim", 695, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker findSelfParticipantForSim cannot find SelfParticipant for subId=%s because no serial number", ykbVar.a());
                        } else {
                            tko b2 = tkr.b();
                            b2.w("findSelfParticipantForSim2");
                            b2.c(new qwz(g, i2));
                            tklVar = (tkl) b2.b().n();
                            try {
                                if (!tklVar.moveToFirst()) {
                                    ((alwl) qxb.a.m().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "findSelfParticipantForSim", 711, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker findSelfParticipantForSim cannot find SelfParticipant for subId=%s because none found in db", ykbVar.a());
                                    tklVar.close();
                                } else {
                                    int a4 = ykbVar.a();
                                    while (true) {
                                        tkhVar2 = (tkh) tklVar.cK();
                                        if (tkhVar2.h() == a4) {
                                            break;
                                        } else if (!tklVar.moveToNext()) {
                                            if (tkhVar2 == null) {
                                                ((alwl) ((alwl) qxb.a.g()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "findSelfParticipantForSim", 730, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker findSelfParticipantForSim cannot find SelfParticipant for subId=%s because no Selfs have that subId", a4);
                                            }
                                        }
                                    }
                                    tklVar.close();
                                    tkhVar = tkhVar2;
                                }
                            } finally {
                            }
                        }
                        if (tkhVar == null) {
                            if (f.contains(Integer.valueOf(a3))) {
                                tko b3 = tkr.b();
                                b3.w("resolveSubIdConflict2");
                                tkq tkqVar = new tkq();
                                tkqVar.b(a3);
                                b3.k(new agpw(tkqVar));
                                tklVar = (tkl) b3.b().n();
                                try {
                                    if (!tklVar.moveToFirst()) {
                                        ((alwl) ((alwl) qxb.a.g()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "resolveSubIdConflict", 747, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker resolveSubIdConflict cannot resolve for subId=%s because no Selfs have that subId", a3);
                                    } else if (!TextUtils.isEmpty(((tkh) tklVar.cK()).l())) {
                                        qxbVar.h(a3);
                                    }
                                    tklVar.close();
                                } finally {
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int h = tkhVar.h();
                            int a5 = ykbVar.a();
                            if (h == a5) {
                                ((alwl) qxb.a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "updateSubIdForKnownSim", 772, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker updateSubIdForKnownSim no-op for SelfParticipant=%s and subId=%s because they already match", tkhVar.k(), a5);
                            } else {
                                qxbVar.h(a5);
                                xyo a6 = qxb.b.a();
                                a6.H("update subId for known SIM.");
                                a6.x("newSubId", a5);
                                a6.x("oldSubId", h);
                                a6.x("slotId", ykbVar.d());
                                a6.z("serialNumber", tkhVar.l());
                                a6.q();
                                tkp tkpVar = new tkp();
                                tkpVar.aj("SelfIdentitiesTracker#updateSubIdForKnownSim-selfParticipants");
                                tkq tkqVar2 = new tkq();
                                tkqVar2.U(new agmd("self_participants._id", 1, String.valueOf(tkhVar.k())));
                                tkpVar.g(tkqVar2);
                                tkpVar.e(a5);
                                tkpVar.ah();
                                tkpVar.a().e();
                                tkhVar.ao(7, "participant_id");
                                String str = tkhVar.h;
                                if (str != null) {
                                    tbb f2 = ParticipantsTable.f();
                                    f2.aj("SelfIdentitiesTracker#updateSubIdForKnownSim-participants");
                                    tbd tbdVar = new tbd();
                                    tbdVar.h(str);
                                    f2.L(tbdVar);
                                    f2.H(a5);
                                    f2.ah();
                                    f2.a().e();
                                    ((alwl) qxb.a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "updateSubIdForKnownSim", 812, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker#updateSubIdForKnownSim updated Participant=%s with subId=%s", str, a5);
                                } else {
                                    qxb.b.q("Skipped update because null self participantId.");
                                }
                            }
                        }
                    }
                    alpt f3 = qxb.f();
                    int size = sparseArray.size();
                    boolean z = false;
                    int i3 = 0;
                    while (i3 < size) {
                        int keyAt = sparseArray.keyAt(i3);
                        if (!f3.contains(Integer.valueOf(keyAt))) {
                            ykb ykbVar2 = (ykb) sparseArray.valueAt(i3);
                            if (qxbVar.h.a()) {
                                String g2 = qxb.g(ykbVar2);
                                if (albo.ah(g2)) {
                                    l2 = Optional.empty();
                                } else {
                                    l2 = ykbVar2.l(z);
                                }
                                qyd qydVar = qxbVar.g;
                                tap c = ParticipantsTable.c();
                                c.S(keyAt);
                                qwe g3 = ((qvq) qydVar.c.b()).g(c.d, g2, (msh) l2.orElse(tkhVar));
                                c.D(g3);
                                ParticipantsTable.BindData c2 = c.c();
                                alvw g4 = qyd.a.g();
                                g4.X(alwp.a, "BugleDataModel");
                                alvg alvgVar = (alvg) g4;
                                alvgVar.X(ydl.t, Integer.valueOf(c.d));
                                alvgVar.X(ydl.u, g2);
                                alvgVar.X(ydl.v, g3);
                                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "buildAndInsertSelf", 138, "ParticipantsColumnSetter.java")).q("set token for new self participant");
                                M = c2.M();
                            } else {
                                qyd qydVar2 = qxbVar.g;
                                tap c3 = ParticipantsTable.c();
                                c3.S(keyAt);
                                M = qydVar2.c(c3, Optional.of(new qwq(ykbVar2, 5))).M();
                            }
                            tki a7 = tkr.a();
                            a7.h(keyAt);
                            a7.d(String.valueOf(M));
                            String k = a7.c().k();
                            xyo c4 = qxb.b.c();
                            c4.H("insertSelfParticipant.");
                            c4.z("participantId", M);
                            c4.z("selfParticipantId", k);
                            c4.x("subId", keyAt);
                            c4.q();
                            ((rye) qxbVar.e.b()).a(4, 2);
                        }
                        i3++;
                        z = false;
                        tkhVar = null;
                    }
                    int[] iArr = new int[size];
                    int i4 = 0;
                    while (i4 < size) {
                        int keyAt2 = sparseArray.keyAt(i4);
                        iArr[i4] = keyAt2;
                        ykb ykbVar3 = (ykb) sparseArray.valueAt(i4);
                        int d = ykbVar3.d();
                        int b4 = ykbVar3.b();
                        String t = ykbVar3.t();
                        tbb f4 = ParticipantsTable.f();
                        f4.aj("updateSelfParticipantSubscriptionInfo-participants");
                        f4.af();
                        tbd tbdVar2 = new tbd();
                        tbdVar2.q(keyAt2);
                        f4.L(tbdVar2);
                        f4.G(d);
                        f4.I(b4);
                        f4.J(t);
                        Optional j = ykbVar3.j(true);
                        if (j.isPresent()) {
                            String k2 = j.get().k();
                            f4.F(k2);
                            f4.B(k2);
                            f4.m(j.get().F().a);
                        }
                        if (((Boolean) ((utz) rxr.b.get()).e()).booleanValue()) {
                            rxs rxsVar = (rxs) qxbVar.f.b();
                            f4.ah();
                            e2 = rxsVar.b(f4, rya.d);
                        } else if (((Boolean) ((utz) rxr.a.get()).e()).booleanValue()) {
                            rxs rxsVar2 = (rxs) qxbVar.f.b();
                            f4.ah();
                            e2 = rxsVar2.a(f4.a());
                        } else {
                            f4.ah();
                            e2 = f4.a().e();
                        }
                        SparseArray sparseArray2 = sparseArray;
                        Optional map2 = ykbVar3.l(true).map(new qvm(16));
                        tkp tkpVar2 = new tkp();
                        tkpVar2.aj("updateSelfParticipantSubscriptionInfo-selfParticipants");
                        tkq tkqVar3 = new tkq();
                        tkqVar3.b(keyAt2);
                        tkpVar2.g(tkqVar3);
                        tkpVar2.d(d);
                        tkpVar2.f(b4);
                        agnc.r(tkpVar2.a, "subscription_name", t);
                        agnc.r(tkpVar2.a, "sim_serial_number", ykbVar3.y());
                        agnc.r(tkpVar2.a, "phone_number", (String) map2.orElse(""));
                        tkpVar2.ah();
                        tkpVar2.a().e();
                        if (e2 == 1) {
                            xyo d2 = qxb.b.d();
                            d2.H("Successfully updated self participants' subscription info for");
                            d2.x("subId", keyAt2);
                            d2.q();
                            ((rye) qxbVar.e.b()).a(4, 2);
                        } else {
                            xyo e3 = qxb.b.e();
                            e3.H("Failed to update self participants' subscription info for");
                            e3.x("subId", keyAt2);
                            e3.x("updateCount", e2);
                            e3.q();
                            ((rye) qxbVar.e.b()).a(4, 3);
                        }
                        i4++;
                        sparseArray = sparseArray2;
                    }
                    tbb f5 = ParticipantsTable.f();
                    f5.aj("SelfIdentitiesTracker#clearSelfParticipantInactiveSubscriptionInfo-participants");
                    f5.af();
                    f5.M(new qwz(iArr, 0));
                    f5.G(-1);
                    f5.I(0);
                    f5.ah();
                    f5.a().e();
                    tkp tkpVar3 = new tkp();
                    tkpVar3.aj("SelfIdentitiesTracker#clearSelfParticipantInactiveSubscriptionInfo-selfParticipants");
                    tkpVar3.af();
                    apply = new qwz(iArr, 2).apply(new tkq());
                    tkpVar3.Z(new agpw((tkq) apply));
                    tkpVar3.d(-1);
                    tkpVar3.f(0);
                    tkpVar3.ah();
                    tkpVar3.a().e();
                    ((alwl) qxb.a.m().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "clearSelfParticipantInactiveSubscriptionInfo", 637, "SubscriptionsTracker.java")).t("SelfIdentitiesTracker#clearSelfParticipantInactiveSubscriptionInfo cleared out subs not in %s", iArr);
                }
            });
            if (((ansy) ((nsq) this.m).a.b()).e("bugle.enable_bimap_between_self_id_and_token")) {
                taz e2 = ParticipantsTable.e();
                e2.w("SelfIdentitiesTracker#reloadSubscriptions");
                e2.g(new qvm(10));
                tar tarVar = ParticipantsTable.c;
                e2.h(new atkn((Object) tarVar.e, false), new atkn((Object) tarVar.a, false));
                alog t = e2.b().t();
                i(t);
                this.n = (alog) Collection.EL.stream(t).filter(new qxi(1)).map(new qvm(11)).collect(alls.a);
                ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "repopulateCaches", 663, "SubscriptionsTracker.java")).t("set orderedRowIdAndTokenPairs: %s", Collection.EL.stream(t).map(new qvm(12)).collect(alls.a));
            } else {
                taz e3 = ParticipantsTable.e();
                e3.w("SelfIdentitiesTracker#reloadSubscriptions");
                e3.q();
                e3.g(new qvm(9));
                i(e3.b().t());
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
}
