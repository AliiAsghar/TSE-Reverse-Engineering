package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbx {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator");
    public final armf a;
    private final ryg c;
    private final adji d;
    private final adae e;

    public qbx(adji adjiVar, armf armfVar, adae adaeVar, ryg rygVar) {
        this.d = adjiVar;
        this.a = armfVar;
        this.e = adaeVar;
        this.c = rygVar;
    }

    public static final Optional c(qbs qbsVar) {
        if (!qbsVar.h.isEmpty()) {
            Optional optional = qbsVar.h;
            if (!((apag) optional.get()).equals(qbsVar.j)) {
                alvw d = b.d();
                d.X(alwp.a, "BugleGroupManagement");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.p, qbsVar.a);
                alvgVar.X(ydl.I, qbsVar.f);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 111, "GroupSelfMsisdnUpdateCalculator.java")).q("Mismatch between RCS group self MSISDN column and current active RCS MSISDN.");
                return Optional.of(qbsVar.j);
            }
            return Optional.empty();
        }
        alvw d2 = b.d();
        d2.X(alwp.a, "BugleGroupManagement");
        alvg alvgVar2 = (alvg) d2;
        alvgVar2.X(ydl.p, qbsVar.a);
        alvgVar2.X(ydl.I, qbsVar.f);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 95, "GroupSelfMsisdnUpdateCalculator.java")).q("Invalid RCS group self MSISDN column found for incoming group notification.");
        return Optional.of(qbsVar.j);
    }

    private final alog d() {
        Stream map = Collection.EL.stream(this.d.i()).map(new ptm(this, 16));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    public final Optional a(java.util.Collection collection, qbs qbsVar) {
        Optional ofNullable = Optional.ofNullable(this.c.e(qbsVar.k));
        boolean z = false;
        if (ofNullable.isPresent() && Collection.EL.stream(this.d.k()).map(new qbb(11)).anyMatch(new ncc(ofNullable, 13))) {
            z = true;
        }
        Optional map = ofNullable.map(new qbb(12));
        adji adjiVar = this.d;
        adjiVar.getClass();
        Optional map2 = map.flatMap(new ptm(adjiVar, 17)).map(new qbb(13));
        psq psqVar = (psq) this.a.b();
        psqVar.getClass();
        Optional map3 = map2.map(new ptm(psqVar, 18));
        collection.getClass();
        boolean isPresent = map3.filter(new ncc(collection, 12)).isPresent();
        if (z && isPresent) {
            alvw d = b.d();
            d.X(alwp.a, "BugleGroupManagement");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.p, qbsVar.a);
            alvgVar.X(ydl.I, qbsVar.f);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 206, "GroupSelfMsisdnUpdateCalculator.java")).q("Current subscription still valid, not updating");
            return Optional.empty();
        }
        Optional findFirst = Collection.EL.stream(d()).filter(new ncc(collection, 12)).findFirst();
        if (findFirst.isEmpty()) {
            alvw d2 = b.d();
            d2.X(alwp.a, "BugleGroupManagement");
            alvg alvgVar2 = (alvg) d2;
            alvgVar2.X(ydl.p, qbsVar.a);
            alvgVar2.X(ydl.I, qbsVar.f);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 221, "GroupSelfMsisdnUpdateCalculator.java")).q("Current subscription invalid and no other subscription available, not updating");
            return Optional.empty();
        }
        Optional map4 = this.d.h(this.e.d(((qei) findFirst.get()).d)).map(new qbb(11));
        ryg rygVar = this.c;
        rygVar.getClass();
        Optional map5 = map4.map(new ptm(rygVar, 19));
        if (map5.isEmpty()) {
            alvw i = b.i();
            i.X(alwp.a, "BugleGroupManagement");
            alvg alvgVar3 = (alvg) i;
            alvgVar3.X(ydl.p, qbsVar.a);
            alvgVar3.X(ydl.I, qbsVar.f);
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 239, "GroupSelfMsisdnUpdateCalculator.java")).q("Cannot find subscription for other identity in the group, not updating");
            return Optional.empty();
        }
        alvw g = b.g();
        g.X(alwp.a, "BugleGroupManagement");
        alvg alvgVar4 = (alvg) g;
        alvgVar4.X(ydl.p, qbsVar.a);
        alvgVar4.X(ydl.I, qbsVar.f);
        alvgVar4.X(ydl.t, Integer.valueOf(((qwm) map5.get()).e()));
        ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 249, "GroupSelfMsisdnUpdateCalculator.java")).q("Updating current subscription in group");
        return map5;
    }

    public final Optional b(java.util.Collection collection, qbs qbsVar) {
        Stream stream = Collection.EL.stream(d());
        collection.getClass();
        alpt alptVar = (alpt) stream.filter(new ncc(collection, 12)).collect(alls.b);
        alptVar.getClass();
        if (((Boolean) qbsVar.h.map(new ptm(alptVar, 15)).orElse(false)).booleanValue()) {
            alvw d = b.d();
            d.X(alwp.a, "BugleGroupManagement");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.p, qbsVar.a);
            alvgVar.X(ydl.I, qbsVar.f);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 152, "GroupSelfMsisdnUpdateCalculator.java")).q("Self still active in group, not changing rcs group self MSISDN.");
            return Optional.empty();
        }
        Optional findFirst = Collection.EL.stream(alptVar).findFirst();
        alvw g = b.g();
        g.X(alwp.a, "BugleGroupManagement");
        alvg alvgVar2 = (alvg) g;
        alvgVar2.X(ydl.p, qbsVar.a);
        alvgVar2.X(ydl.I, qbsVar.f);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 162, "GroupSelfMsisdnUpdateCalculator.java")).t("Self not active in group, other exists: %s.", Boolean.valueOf(findFirst.isPresent()));
        return findFirst;
    }
}
