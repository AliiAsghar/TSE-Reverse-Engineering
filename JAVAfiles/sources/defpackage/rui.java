package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rui implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rui(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [ajoa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, wul] */
    @Override // java.lang.Runnable
    public final void run() {
        Object apply;
        Optional empty;
        agnw d;
        agnw d2;
        Object apply2;
        int i = 16;
        switch (this.b) {
            case 0:
                xyl.h();
                sfm sfmVar = new sfm(sfp.a);
                sfmVar.w("getAddContactBannerDataByConversationId");
                Object obj = this.a;
                apply = new ruf(obj, 2).apply(new sfo());
                sfmVar.k(new agpw((sfo) apply));
                sfj sfjVar = (sfj) sfmVar.b().n();
                try {
                    if (sfjVar.moveToNext()) {
                        empty = Optional.of((sff) sfjVar.cK());
                        sfjVar.close();
                    } else {
                        sfjVar.close();
                        empty = Optional.empty();
                    }
                    if (empty.isPresent()) {
                        sfn sfnVar = new sfn();
                        sfnVar.aj("updateConversationAddContactBannerStatus");
                        sfnVar.a.put("banner_status", (Integer) 2);
                        sfnVar.ah();
                        apply2 = new ruf(obj, 15).apply(new sfo());
                        sfnVar.Z(new agpw((sfo) apply2));
                        sfnVar.a().e();
                        return;
                    }
                    int i2 = seo.a;
                    sfg sfgVar = new sfg();
                    sfgVar.c((ConversationIdType) obj);
                    sfgVar.b(2);
                    sff a = sfgVar.a();
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    agnc.a(d2, "add_contact_banner", a, new ryu(d, i), new rug(a, 13));
                    return;
                } catch (Throwable th) {
                    try {
                        sfjVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                snf e = sni.e();
                e.w("rebuildConversationAvatars");
                e.q();
                e.e(new rub(14));
                sna snaVar = (sna) e.b().n();
                Object obj2 = this.a;
                while (snaVar.moveToNext()) {
                    try {
                        ((rul) obj2).T(snaVar.C(), null, snaVar.c(), false);
                    } catch (Throwable th3) {
                        try {
                            snaVar.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                snaVar.close();
                return;
            case 2:
                for (rxk rxkVar : (Set) ((apxx) ((uie) this.a).a).a) {
                    akrh a2 = rxkVar.a();
                    try {
                        rxkVar.b();
                        armd.i(a2, null);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            armd.i(a2, th5);
                            throw th6;
                        }
                    }
                }
                return;
            case 3:
                for (rxj rxjVar : (Set) ((ibi) ((rxz) this.a).i.b()).a.b()) {
                    akrh a3 = rxjVar.a();
                    try {
                        rxjVar.c();
                        if (a3 != null) {
                            a3.close();
                        }
                    } catch (Throwable th7) {
                        if (a3 != null) {
                            try {
                                a3.close();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                        }
                        throw th7;
                    }
                }
                return;
            case 4:
                for (rxl rxlVar : (Set) ((ibi) ((rxz) this.a).h.b()).a.b()) {
                    akrh a4 = rxlVar.a();
                    try {
                        rxlVar.c();
                        if (a4 != null) {
                            a4.close();
                        }
                    } catch (Throwable th9) {
                        if (a4 != null) {
                            try {
                                a4.close();
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                            }
                        }
                        throw th9;
                    }
                }
                return;
            case 5:
                CustomUpgradeSteps.lambda$potentiallyInvalidateRcsSessionIdsForRcsGroups$1(this.a);
                return;
            case 6:
                ((tth) this.a).d();
                return;
            case 7:
                if (ttd.a()) {
                    ?? r0 = this.a;
                    tth tthVar = (tth) r0;
                    tthVar.b.b();
                    ((wui) tthVar.c.b()).n(r0);
                    tthVar.d();
                    return;
                }
                return;
            case 8:
                ((mbl) ((uac) this.a).b.b()).c("Bugle.Etouffee.Help.Center.Link.Click.Count");
                return;
            case 9:
                ubl ublVar = (ubl) this.a;
                yjz yjzVar = (yjz) ublVar.h.b();
                ubj ubjVar = new ubj(ublVar);
                yjzVar.l.addOnSubscriptionsChangedListener(ubjVar);
                if (yjzVar.k == null) {
                    yjzVar.k = new ArrayList();
                }
                yjzVar.k.add(ubjVar);
                return;
            case 10:
                ((uci) this.a).k().close();
                return;
            case 11:
                alvi alviVar = uci.a;
                Iterator it = ((List) ((Pair) this.a).second).iterator();
                while (it.hasNext()) {
                    ((aiim) it.next()).k();
                }
                return;
            case 12:
                ((uci) this.a).p(new udq());
                return;
            case 13:
                ((ueb) this.a).A();
                return;
            case 14:
                Object obj3 = this.a;
                ((uhj) obj3).f.q(aktp.ag(null), trq.a);
                return;
            case 15:
                ((uof) ((lpg) ((uhj) this.a).d.b()).a.b()).a(upk.b("update_unread_counter", umw.a, new uta(null, "update_unread_counter_dedupe", null, null, null, null)));
                return;
            case 16:
                xyo e2 = ujk.a.e();
                e2.H("message not found");
                e2.c((MessageIdType) this.a);
                e2.q();
                return;
            case 17:
                xyo a5 = ukh.a.a();
                a5.H("Cancelling pending Verified SMS work.");
                a5.q();
                ukh ukhVar = (ukh) this.a;
                gvf.ar(ukhVar.b).a("verified_sms_work_manager_tag");
                gvf.ar(ukhVar.b).b("verified_sms_request_verified_senders_unique_work_name");
                gvf.ar(ukhVar.b).b("verified_sms_key_rotation_unique_work_name");
                xyo a6 = ukh.a.a();
                a6.H("Cleaning ParticipantsTable for Verified SMS.");
                a6.q();
                tbb f = ParticipantsTable.f();
                f.aj("cancelWorkAndClearVerificationData-participants");
                f.M(new uid(9));
                f.v(tqr.VERIFICATION_NA);
                f.E();
                f.p();
                f.r();
                f.a().e();
                xyo a7 = ukh.a.a();
                a7.H("Cleaning MessagesTable for Verified SMS.");
                a7.q();
                sya syaVar = new sya();
                syaVar.aj("cancelWorkAndClearVerificationData-messages");
                syaVar.P(new uid(10));
                syaVar.M(tqr.VERIFICATION_NA);
                syaVar.af();
                syaVar.a().e();
                xyo a8 = ukh.a.a();
                a8.H("Cleaning VerifiedSmsSendersTable for Verified SMS.");
                a8.q();
                tpn tpnVar = new tpn();
                tpnVar.e();
                tpnVar.f("cancelWorkAndClearVerificationData#verifiedsmssends#delete");
                tpnVar.d();
                xyo a9 = ukh.a.a();
                a9.H("Cleaning VerifiedSmsBrandsTable for Verified SMS.");
                a9.q();
                tpc tpcVar = new tpc();
                tpcVar.e();
                tpcVar.f("cancelWorkAndClearVerificationData#verifiedsmsbrands#delete");
                tpcVar.d();
                ((rtz) ukhVar.e.b()).N();
                ukhVar.h.b();
                ukhVar.h.a();
                ukhVar.h.c();
                ukhVar.j.k(false);
                xyo c = ukh.a.c();
                c.H("Verified SMS data cleaned up");
                c.q();
                return;
            case 18:
                Object obj4 = this.a;
                try {
                    boolean g = ((ulj) obj4).c.g();
                    qif qifVar = ((ulj) obj4).c;
                    aiut.b();
                    boolean z = ((qid) qifVar.b.get().l()).k;
                    if (g && !z) {
                        ulj.a.l("Performing back fill for the user");
                        qif qifVar2 = ((ulj) obj4).c;
                        aiut.b();
                        qifVar2.b.get().m(new qda(12));
                        qifVar2.e();
                        ((ulj) obj4).c.f(qic.ENABLED);
                        ((ulj) obj4).d.c("Bugle.Cms.Backfill.Success.Counts");
                        return;
                    }
                    ulj.a.l("Skip back fill for the user");
                    return;
                } catch (apba e3) {
                    throw new IllegalStateException(e3);
                }
            case 19:
                sng sngVar = new sng();
                sngVar.aj("processPendingWorkItemAsync-conversations1");
                sngVar.af();
                sngVar.N(-1L);
                sngVar.a().e();
                sng sngVar2 = new sng();
                sngVar2.aj("processPendingWorkItemAsync-conversations2");
                sngVar2.af();
                sngVar2.v(4);
                sngVar2.X(new uid(i));
                sngVar2.a().e();
                ((ulu) this.a).c.f("ClearSessionIdsAction");
                return;
            default:
                Object obj5 = this.a;
                obj5.getClass();
                uqy uqyVar = new uqy();
                uqyVar.f("removeQueueAssociation");
                uqyVar.b(new uol(obj5, 8));
                uqyVar.d();
                return;
        }
    }
}
