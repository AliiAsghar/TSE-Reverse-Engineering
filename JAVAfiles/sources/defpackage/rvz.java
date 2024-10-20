package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.experiments.receiver.BuglePhenotypeBroadcastReceiver;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rvz implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rvz(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor] */
    /* JADX WARN: Type inference failed for: r0v84, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [uji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object apply;
        String str;
        String str2;
        agnw d;
        agnw d2;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Object apply2;
        Object apply3;
        int i = 6;
        int i2 = 7;
        int i3 = 0;
        switch (this.d) {
            case 0:
                Iterator it = this.b.iterator();
                while (true) {
                    ?? r1 = this.c;
                    Object obj = this.a;
                    if (it.hasNext()) {
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                        tbt tbtVar = new tbt();
                        tbtVar.aj("updateMessageAndParts");
                        ContentValues r = messagePartCoreData.r();
                        tbtVar.a.clear();
                        tbtVar.a.putAll(r);
                        ((rxc) ((rwd) obj).f.b()).e(r1.z(), r1.B(), messagePartCoreData.Z(), tbtVar);
                    } else {
                        ((rwd) obj).O(r1.z(), r1.B(), r1.J());
                        return;
                    }
                }
            case 1:
                xyl.h();
                Object obj2 = this.a;
                ruq ruqVar = (ruq) this.c;
                ConversationIdType conversationIdType = (ConversationIdType) obj2;
                if (ruqVar.i(conversationIdType)) {
                    ruqVar.a(conversationIdType, true, (tqc) this.b);
                    return;
                }
                return;
            case 2:
                ?? r0 = this.c;
                Object obj3 = this.a;
                MessageIdType B = r0.B();
                lru lruVar = (lru) obj3;
                MessagePartData c = ((rtb) lruVar.b.b()).c((String) this.b);
                r0.aH(c);
                c.aM(B);
                ((rvw) lruVar.a.b()).c(c, r0.z());
                sya syaVar = new sya();
                syaVar.j(null);
                syaVar.e(r0.B());
                r0.bj(null);
                stp stpVar = new stp();
                apply = new rwb(B, 16).apply(new sts());
                stpVar.a = new agpw((sts) apply);
                stpVar.d();
                return;
            case 3:
                ?? r02 = this.c;
                Object obj4 = this.b;
                Object obj5 = this.a;
                if (r02.a() == 0) {
                    ParticipantsTable.BindData a = ((rxq) obj5).a((String) obj4);
                    if (a != null) {
                        if (!lru.g(a).f(r02)) {
                            return;
                        }
                    } else {
                        rxq.b.m("Failed to retrieve participant when updating color.");
                        return;
                    }
                }
                tbb f = ParticipantsTable.f();
                f.aj("maybeUpdateParticipantColor");
                f.M(new rxb(obj4, 10));
                r02.c(f);
                alog b = f.a().b();
                int size = b.size();
                int size2 = b.size();
                if (size != 1) {
                    str = "Failed to update participants' color.";
                } else {
                    str = "Successfully updated participants' color.";
                }
                ((rxq) obj5).m(size2, str);
                return;
            case 4:
                int i4 = rxs.a;
                taz e = ParticipantsTable.e();
                e.q();
                tbb tbbVar = (tbb) this.c;
                alog alogVar = tbbVar.a().e;
                alogVar.getClass();
                alur it2 = alogVar.iterator();
                while (it2.hasNext()) {
                    agpw agpwVar = (agpw) it2.next();
                    agpwVar.getClass();
                    e.k((tbc) agpwVar);
                }
                Object obj6 = this.b;
                e.w("validateDestinationsThenExecuteUpdate");
                alog t = e.b().t();
                t.getClass();
                ((arsb) obj6).a = t;
                tba a2 = tbbVar.a();
                if (!a2.m()) {
                    i3 = a2.e();
                }
                ((arrz) this.a).a = i3;
                return;
            case 5:
                for (ParticipantsTable.BindData bindData : this.b) {
                    Object obj7 = this.a;
                    Object obj8 = this.c;
                    String O = bindData.O();
                    O.getClass();
                    tbb f2 = ParticipantsTable.f();
                    f2.aj("updateParticipantSendDestination");
                    f2.F(bindData.P());
                    f2.M(new rxb(O, 17));
                    rxz rxzVar = (rxz) obj8;
                    int a3 = rxzVar.a(f2, (rya) obj7);
                    if (a3 == 1) {
                        ((mbl) rxzVar.m.b()).c("Bugle.Datamodel.Participant.UpdateParticipantSendDestination");
                        a3 = 1;
                    }
                    int i5 = a3;
                    rxq rxqVar = (rxq) rxzVar.f.b();
                    if (a3 != 1) {
                        str2 = "Failed to update participant's send destination.";
                    } else {
                        str2 = "Successfully updated participant's send destination.";
                    }
                    rxqVar.m(i5, str2);
                }
                return;
            case 6:
                Object obj9 = this.b;
                ssi ssiVar = (ssi) obj9;
                if (!uie.g(ssiVar.k()).isPresent()) {
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    aglz aglzVar = (aglz) obj9;
                    agnc.a(d2, "link_preview", aglzVar, new spl(d, i2), new smq(aglzVar, i));
                } else {
                    akrh e2 = aktp.e("LinkPreviewDatabaseOperations#updateLinkPreview");
                    try {
                        xyl.h();
                        ssq ssqVar = new ssq();
                        ssqVar.aj("updateLinkPreview");
                        agnc.r(ssqVar.a, "trigger_url", ((ssi) obj9).q());
                        ssqVar.a.put("expiration_time_millis", Long.valueOf(((ssi) obj9).h()));
                        agnc.r(ssqVar.a, "link_title", yta.a(((ssi) obj9).p()));
                        agnc.r(ssqVar.a, "link_description", yta.a(((ssi) obj9).m()));
                        agnc.r(ssqVar.a, "link_image_url", ((ssi) obj9).o());
                        agnc.r(ssqVar.a, "link_domain", ((ssi) obj9).n());
                        agnc.r(ssqVar.a, "link_canonical_url", ((ssi) obj9).l());
                        boolean s = ((ssi) obj9).s();
                        valueOf = Integer.valueOf(a.bp().c());
                        int intValue = valueOf.intValue();
                        valueOf2 = Integer.valueOf(a.bp().c());
                        int intValue2 = valueOf2.intValue();
                        if (intValue2 < 21010) {
                            agnc.t("link_preview_prevented", intValue2);
                        }
                        if (intValue >= 21010) {
                            ssqVar.a.put("link_preview_prevented", Boolean.valueOf(s));
                        }
                        boolean r2 = ((ssi) obj9).r();
                        valueOf3 = Integer.valueOf(a.bp().c());
                        int intValue3 = valueOf3.intValue();
                        valueOf4 = Integer.valueOf(a.bp().c());
                        int intValue4 = valueOf4.intValue();
                        if (intValue4 < 22020) {
                            agnc.t("link_preview_failed", intValue4);
                        }
                        if (intValue3 >= 22020) {
                            ssqVar.a.put("link_preview_failed", Boolean.valueOf(r2));
                        }
                        apply2 = new ryu(obj9, i3).apply(new ssr());
                        ssqVar.Z(new agpw((ssr) apply2));
                        ssqVar.a().e();
                        e2.close();
                    } catch (Throwable th) {
                        try {
                            e2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                ((uhj) ((uie) this.a).a.b()).j((ConversationIdType) this.c, ssiVar.k(), "link_preview");
                return;
            case 7:
                Object obj10 = this.a;
                Object obj11 = this.b;
                Object obj12 = this.c;
                try {
                    ((Method) obj11).setAccessible(true);
                    ((Method) obj11).invoke(OnDeviceDatabaseUpgradeHandler.m194$$Nest$fgetcustomUpgradeSteps(((rzu) obj12).a), obj10);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    throw new rzp("exception running upgrade step ".concat(String.valueOf(((Method) obj11).getName())), e3);
                }
            case 8:
                ((tsp) this.a).j((ConversationIdType) this.c, (uax) this.b);
                return;
            case 9:
                ConversationIdType z = this.c.z();
                Object obj13 = this.a;
                if (!z.equals(obj13)) {
                    tzn tznVar = (tzn) this.b;
                    MessageCoreData l = ((rwd) tznVar.e.b()).l((ConversationIdType) obj13);
                    if (l != null && rvx.e(l.j())) {
                        if (((nzt) tznVar.l.b()).a()) {
                            tznVar.j(l, shs.q);
                        }
                        ((uzo) tznVar.f.b()).a(l.B());
                        return;
                    }
                    return;
                }
                return;
            case 10:
                Object obj14 = this.a;
                Object obj15 = this.b;
                Object obj16 = this.c;
                if (obj15 != null) {
                    alvw m = uci.b.m();
                    m.X(alwp.a, "BugleDatabase");
                    ((alwl) m.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "notifyChangeAfterCommit", 1030, "DatabaseInterfaceImpl.java")).D("%s notifying change after commit. uri %s", obj15, obj16);
                }
                akrh e4 = aktp.e("DatabaseWrapperImpl#notifyChangeAfterCommit");
                try {
                    ((uci) obj14).j.getContentResolver().notifyChange((Uri) obj16, null);
                    e4.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        e4.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 11:
                uci uciVar = (uci) this.c;
                uciVar.w();
                ((AtomicReference) this.b).set(true);
                boolean e5 = agnc.c.e();
                Object obj17 = this.a;
                if (e5) {
                    uciVar.p(new uei(uciVar, uciVar.f, (agni) obj17));
                    uciVar.k().beginTransaction();
                    return;
                } else {
                    uciVar.k().beginTransaction();
                    uciVar.p(new uei(uciVar, uciVar.f, (agni) obj17));
                    return;
                }
            case 12:
                ((udk) this.a).f((ude) this.c, (Throwable) this.b);
                return;
            case 13:
                ((udk) this.a).f((ude) this.c, (Throwable) this.b);
                return;
            case 14:
                Context context = ((uhj) this.b).b;
                context.getContentResolver().notifyChange(upb.j(context, (ConversationIdType) this.c, (MessageIdType) this.a, new String[0]), null);
                return;
            case 15:
                try {
                    this.b.e(((Uri) this.c).toString(), (Uri) this.a);
                    return;
                } catch (RuntimeException e6) {
                    ujd.a.r("Error while calling #onSuccess", e6);
                    return;
                }
            case 16:
                xyo c2 = ukh.a.c();
                c2.H("cleaning up verified sms data");
                ?? r3 = this.a;
                c2.L("sender id", r3);
                c2.q();
                xyo c3 = ukh.a.c();
                c3.H("Cleaning participant");
                c3.q();
                ukh ukhVar = (ukh) this.c;
                ParticipantsTable.BindData c4 = ((rxq) ukhVar.d.b()).c((String) r3);
                if (c4 == null) {
                    xyo c5 = ukh.a.c();
                    c5.H("Attempted to cleanup verified sms data for sender but could not find participant");
                    c5.z("sender id", r3);
                    c5.q();
                    return;
                }
                Object obj18 = this.b;
                tbb f3 = ParticipantsTable.f();
                f3.aj("sanitizeVerifiedSmsDataForSender-participants");
                f3.M(new uje(c4, i));
                f3.v(tqr.VERIFICATION_NA);
                f3.E();
                f3.p();
                f3.r();
                f3.a().e();
                xyo c6 = ukh.a.c();
                c6.H("Cleaning all messages from sender");
                c6.q();
                sya syaVar2 = new sya();
                syaVar2.aj("sanitizeVerifiedSmsDataForSender-messages");
                syaVar2.P(new uje(c4, i2));
                syaVar2.M(tqr.VERIFICATION_NA);
                syaVar2.a().e();
                xyo a4 = ukh.a.a();
                a4.H("Cleaning VerifiedSmsSendersTable for Verified SMS for ".concat(String.valueOf((Object) r3)));
                a4.q();
                tpn tpnVar = new tpn();
                tpnVar.f("sanitizeVerifiedSmsDataForSender");
                tpnVar.b(new uje(r3, 8));
                tpnVar.d();
                xyo a5 = ukh.a.a();
                a5.H("Cleaning VerifiedSmsBrandsTable for Verified SMS for ".concat(String.valueOf(obj18)));
                a5.q();
                tpc tpcVar = new tpc();
                tpcVar.f("sanitizeVerifiedSmsDataForSender");
                apply3 = new uje(obj18, 9).apply(new tph());
                tpcVar.a = new agpw((tph) apply3);
                tpcVar.d();
                ((rtz) ukhVar.e.b()).P(c4.M());
                return;
            case 17:
                xyo d3 = unj.a.d();
                d3.H("setFutureResult");
                upr uprVar = (upr) this.b;
                d3.y("rowId", uprVar.k());
                Object obj19 = this.a;
                d3.z("result", obj19);
                d3.q();
                unj unjVar = (unj) this.c;
                unjVar.b.h(new rxa(11), null, new ung(unjVar.a(uprVar), obj19, i3));
                return;
            case 18:
                Object obj20 = this.a;
                arjs arjsVar = (arjs) obj20;
                arjsVar.g("PWQ Execution State:");
                ucz h = arjsVar.h();
                try {
                    for (Map.Entry entry : ((unj) this.c).c.entrySet()) {
                        Object obj21 = this.b;
                        if (obj21 == null || ((Pattern) obj21).matcher(((uni) entry.getValue()).a).matches()) {
                            ((arjs) obj20).g(String.valueOf(entry.getKey()) + " ==> " + String.valueOf(entry.getValue()));
                        }
                    }
                    h.close();
                    return;
                } catch (Throwable th5) {
                    try {
                        h.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 19:
                urb urbVar = new urb();
                ContentValues contentValues = urbVar.a;
                Object obj22 = this.a;
                contentValues.put("workmanager_id", rvg.b(Optional.of(obj22)));
                urc urcVar = new urc();
                String str3 = (String) this.c;
                urcVar.b(str3);
                if (!urbVar.ae(new agpw(urcVar), "work_queue_work_manager_ids-buildAndUpdateForQueue") && arwi.A(this.b)) {
                    throw new unc(str3, (UUID) obj22);
                }
                return;
            default:
                String stringExtra = ((Intent) this.a).getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                boolean equals = "com.google.android.ims.library".equals(stringExtra);
                Object obj23 = this.b;
                if (equals) {
                    alwl alwlVar = (alwl) BuglePhenotypeBroadcastReceiver.a.g();
                    alwlVar.X(uuj.a, stringExtra);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "doInBackgroundAsync", 82, "BuglePhenotypeBroadcastReceiver.java")).q("onReceive for cslib package");
                    utt uttVar = (utt) ((BuglePhenotypeBroadcastReceiver) obj23).b.b();
                    ((ylk) ((xyt) uttVar.c.b()).a()).a(stringExtra, new uts(akto.a(new raw(uttVar, stringExtra, 20)), 0));
                    return;
                }
                if (uvl.i((Context) this.c).equals(stringExtra)) {
                    alwl alwlVar2 = (alwl) BuglePhenotypeBroadcastReceiver.a.g();
                    alwlVar2.X(uuj.a, stringExtra);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "doInBackgroundAsync", 91, "BuglePhenotypeBroadcastReceiver.java")).q("onReceive for bugle package");
                    ((utt) ((BuglePhenotypeBroadcastReceiver) obj23).b.b()).e();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rvz(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rvz(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rvz(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rvz(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ rvz(Object obj, Object obj2, Object obj3, int i, boolean[] zArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }
}
