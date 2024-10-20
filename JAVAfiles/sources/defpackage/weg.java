package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class weg implements apxw {
    public static aqrs a(Context context, aneo aneoVar) {
        String str;
        if (true != adwi.i(context)) {
            str = "com.google.android.ims";
        } else {
            str = "com.google.android.apps.messaging";
        }
        aqwn c = aqwn.c(str, "com.google.android.ims.messaging.MessagingEngineEndpointService");
        xyo a = wef.a.a();
        a.H("Providing channel for component address: ");
        a.H(c);
        a.q();
        aqwq q = aqwq.q(c, context);
        q.s(aneoVar);
        q.e(aneoVar);
        q.h(aneoVar);
        q.t(aode.V(context, alpt.r("com.google.android.apps.messaging", "com.google.android.ims")));
        q.f(60L, TimeUnit.SECONDS);
        return q.a();
    }

    public static wcj c(aqrs aqrsVar) {
        xyo a = wef.a.a();
        a.H("Providing future stub for channel: ");
        a.H(aqrsVar);
        a.q();
        return (wcj) wcj.g(new wci(0), aqrsVar);
    }

    public static wej d(anen anenVar, Object obj, waw wawVar) {
        return new wej(anenVar, (wei) obj, wawVar);
    }

    public static amnn e() {
        amnn amnnVar = amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS;
        amnnVar.getClass();
        return amnnVar;
    }

    public static Set f(armf armfVar, nwg nwgVar) {
        alpt alptVar;
        if (xyp.k()) {
            alptVar = altg.a;
        } else if (nwgVar.a()) {
            alptVar = new altx((wpp) armfVar.b());
        } else {
            alptVar = altg.a;
        }
        alptVar.getClass();
        return alptVar;
    }

    public static aknt g() {
        akns a = aknt.a();
        a.a = "CurrentVersion";
        a.c(lzm.a);
        return a.a();
    }

    public static agmh[] h() {
        return (agmh[]) ScheduledSendTable.d.c;
    }

    public static agns i() {
        return new agnf(ScheduledSendTable.c, "scheduled_send", new tpd(7));
    }

    public static ContactsService j(wui wuiVar) {
        return wuiVar.a();
    }

    public static EventService k(wui wuiVar) {
        return wuiVar.b();
    }

    public static ImsConnectionTrackerService l(wui wuiVar) {
        return wuiVar.d();
    }

    public static LocationSharingService m(wui wuiVar) {
        return wuiVar.e();
    }

    public static RcsMessagingService n(wui wuiVar) {
        return wuiVar.f();
    }

    public static akcy o(armf armfVar, ahiy ahiyVar) {
        return new akdf(new lpn(armfVar, 20), ahiyVar);
    }

    public static akcy p(armf armfVar, ahiy ahiyVar) {
        return new akdf(new wkb(armfVar, 1), ahiyVar);
    }

    public static akcy q(armf armfVar, ahiy ahiyVar) {
        return new akdf(new wkb(armfVar, 0), ahiyVar);
    }

    public static akcy r(armf armfVar, ahiy ahiyVar) {
        return new akdf(new wkb(armfVar, 2), ahiyVar);
    }

    public static akcy s(armf armfVar, ahiy ahiyVar) {
        return new akdf(new wkb(armfVar, 4), ahiyVar);
    }

    public static aiwu t(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static wpp u(Object obj) {
        return new wpp((wnb) obj);
    }

    public static wez v(admt admtVar, znj znjVar, qvv qvvVar, qvr qvrVar, arwe arweVar) {
        armf armfVar = admtVar.b;
        alog r = alog.r(znjVar);
        anen anenVar = (anen) armfVar.b();
        anenVar.getClass();
        anen anenVar2 = (anen) admtVar.c.b();
        anenVar2.getClass();
        Set set = (Set) admtVar.d.b();
        set.getClass();
        Set set2 = (Set) admtVar.e.b();
        set2.getClass();
        Set set3 = (Set) admtVar.f.b();
        set3.getClass();
        Optional optional = (Optional) admtVar.g.b();
        optional.getClass();
        r.getClass();
        adji adjiVar = (adji) admtVar.h.b();
        adjiVar.getClass();
        adtl adtlVar = (adtl) admtVar.i.b();
        adtlVar.getClass();
        wwn wwnVar = (wwn) admtVar.l.b();
        wwnVar.getClass();
        adwu adwuVar = (adwu) admtVar.m.b();
        adwuVar.getClass();
        wyp wypVar = (wyp) admtVar.o.b();
        wypVar.getClass();
        Set set4 = (Set) admtVar.v.b();
        set4.getClass();
        qvv qvvVar2 = (qvv) admtVar.w.b();
        qvvVar2.getClass();
        arwe arweVar2 = (arwe) admtVar.x.b();
        arweVar2.getClass();
        qvr qvrVar2 = (qvr) admtVar.y.b();
        qvrVar2.getClass();
        armf armfVar2 = admtVar.z;
        armf armfVar3 = admtVar.A;
        armf armfVar4 = admtVar.B;
        armf armfVar5 = admtVar.C;
        armf armfVar6 = admtVar.p;
        armf armfVar7 = admtVar.q;
        armf armfVar8 = admtVar.r;
        armf armfVar9 = admtVar.s;
        armf armfVar10 = admtVar.t;
        armf armfVar11 = admtVar.u;
        armf armfVar12 = admtVar.n;
        adms admsVar = new adms(admtVar.a, anenVar, anenVar2, set, set2, set3, optional, r, adjiVar, adtlVar, admtVar.j, admtVar.k, wwnVar, adwuVar, armfVar12, wypVar, armfVar6, armfVar7, armfVar8, armfVar9, armfVar10, armfVar11, set4, qvvVar2, arweVar2, qvrVar2, armfVar2, armfVar3, armfVar4, armfVar5);
        arweVar.getClass();
        qvvVar.getClass();
        qvrVar.getClass();
        return new wez(admsVar, qvvVar, qvrVar);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
