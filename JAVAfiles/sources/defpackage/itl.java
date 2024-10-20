package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class itl implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ itl(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, mnk] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v92, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v11, types: [hk] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v20, types: [jpm] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, mce] */
    /* JADX WARN: Type inference failed for: r2v6, types: [hk] */
    /* JADX WARN: Type inference failed for: r2v62, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [qya] */
    /* JADX WARN: Type inference failed for: r3v108, types: [xqc] */
    /* JADX WARN: Type inference failed for: r3v109, types: [xqc] */
    /* JADX WARN: Type inference failed for: r3v5, types: [itm] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Object, mce] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v63, types: [mnl] */
    /* JADX WARN: Type inference failed for: r3v65, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [hk] */
    /* JADX WARN: Type inference failed for: r6v14, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        agnw d;
        agnw d2;
        lwp lwpVar;
        Object apply;
        Integer valueOf;
        Object apply2;
        Object apply3;
        agnw d3;
        agnw d4;
        int i;
        String R;
        int i2 = 5;
        int i3 = 18;
        int i4 = 16;
        int i5 = 17;
        int i6 = 15;
        int i7 = 2;
        Map map = null;
        boolean z = true;
        ?? r11 = 0;
        int d5 = 0;
        switch (this.d) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                Object obj3 = this.c;
                akrh e = aktp.e("MessageListWindowManager::refreshStatusOfMessages::mainThread");
                try {
                    ((itm) obj).f.e();
                    while (true) {
                        ?? r5 = ((itm) obj).f;
                        if (r11 < r5.g) {
                            rry rryVar = (rry) r5.d(r11);
                            if (((rvf) obj3).k() && ((rvf) obj3).equals(rryVar.v())) {
                                xzb.c("BugleDataModel", a.cr(obj3, "refreshStatusOfMessages, rcsMessageId="));
                                rryVar.Z();
                                ((itm) obj).f.i(r11, rryVar);
                            } else if (!((MessageIdType) obj2).b() && ((MessageIdType) obj2).equals(rryVar.u())) {
                                xzb.c("BugleDataModel", a.cr(obj2, "refreshStatusOfMessages, messageId="));
                                rryVar.Z();
                                ((itm) obj).f.i(r11, rryVar);
                            } else {
                                r11++;
                            }
                        }
                    }
                    ((itm) obj).f.f();
                    e.close();
                    return;
                } finally {
                    try {
                        e.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            case 1:
                ((itm) this.a).n(this.b, this.c);
                return;
            case 2:
                Object obj4 = this.c;
                Object obj5 = this.a;
                Object obj6 = this.b;
                akrc b = ((aksr) ((jbp) obj6).d).b("MessageListFragmentPeer#onPreDraw");
                try {
                    akrh e2 = aktp.e("MessageListStartupTracker#onReady");
                    try {
                        ((mgv) ((jbp) obj6).e.b()).f(mgv.w);
                        if (((jbp) obj6).c) {
                            armd.i(e2, null);
                        } else {
                            jbo jboVar = (jbo) ((eoy) ((jbp) obj6).f).a(jbo.class);
                            jboVar.b = true;
                            jboVar.a((ajwt) obj4, (Activity) obj5);
                            armd.i(e2, null);
                        }
                        armd.i(b, null);
                        return;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        armd.i(b, th2);
                        throw th3;
                    }
                }
            case 3:
                sph sphVar = new sph();
                sphVar.aj("ConversationDraftPersistence.updateSync");
                this.b.a(sphVar);
                ?? r2 = (jpm) this.a;
                ConversationIdType b2 = ruy.b(r2.b.b());
                spi spiVar = new spi();
                spiVar.b(b2);
                if (!sphVar.ae(new agpw(spiVar), "drafts-buildAndUpdateForConversationId")) {
                    ?? r0 = this.c;
                    if (agnc.c.c()) {
                        r2.a(r0).h(4);
                        return;
                    }
                    spa a = r2.a(r0);
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    agnc.a(d2, "drafts", a, new spl(d, 1), new rbc(i5));
                    return;
                }
                return;
            case 4:
                final ldy ldyVar = (ldy) this.a;
                rtz rtzVar = (rtz) ldyVar.g.b();
                final ?? r14 = this.b;
                final boolean c = tvu.c(rtzVar.c(r14.z()));
                ConversationIdType z2 = r14.z();
                akrh e3 = aktp.e("MessageDatabaseOperations#hasSentMessage");
                try {
                    xyl.h();
                    sxy d6 = MessagesTable.d();
                    d6.w("hasSentMessage");
                    d6.g(new rwb(z2, i2));
                    final boolean K = d6.b().K();
                    e3.close();
                    if (((Boolean) ldy.a.e()).booleanValue()) {
                        return;
                    }
                    if (ldyVar.e.isEmpty()) {
                        ldy.b.l("Received message or sender is null, skip logging links.");
                        return;
                    }
                    final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) this.c;
                    final boolean z3 = !TextUtils.isEmpty(bindData.N());
                    final int u = rxn.u(bindData);
                    String am = r14.am();
                    if (TextUtils.isEmpty(am)) {
                        ldy.b.l("Received message text is empty, skip logging links.");
                        return;
                    } else {
                        albo.bR(((uza) ldyVar.e.get()).b(SpannableString.valueOf(am), null), qjc.a(new ydv(new Consumer() { // from class: ldw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void q(Object obj7) {
                                aluq listIterator = ((alor) ((Pair) obj7).second).values().listIterator();
                                while (listIterator.hasNext()) {
                                    uyz uyzVar = (uyz) listIterator.next();
                                    if (uyzVar == uyz.WEB_URL) {
                                        aozy createBuilder = amem.a.createBuilder();
                                        if (!createBuilder.b.isMutable()) {
                                            createBuilder.u();
                                        }
                                        apag apagVar = createBuilder.b;
                                        amem amemVar = (amem) apagVar;
                                        int i8 = 4;
                                        amemVar.c = aqas.f(4);
                                        amemVar.b |= 1;
                                        if (!apagVar.isMutable()) {
                                            createBuilder.u();
                                        }
                                        int i9 = u;
                                        apag apagVar2 = createBuilder.b;
                                        amem amemVar2 = (amem) apagVar2;
                                        amemVar2.d = i9 - 1;
                                        amemVar2.b |= 2;
                                        if (!apagVar2.isMutable()) {
                                            createBuilder.u();
                                        }
                                        boolean z4 = z3;
                                        MessageCoreData messageCoreData = r14;
                                        ldy ldyVar2 = ldy.this;
                                        amem amemVar3 = (amem) createBuilder.b;
                                        amemVar3.b |= 4;
                                        amemVar3.e = z4;
                                        ldyVar2.c.D(messageCoreData, (amem) createBuilder.s());
                                        if (uyzVar == uyz.WEB_URL) {
                                            boolean T = bindData.T();
                                            if (((Boolean) utw.w.e()).booleanValue()) {
                                                boolean z5 = K;
                                                if (c) {
                                                    if (!T) {
                                                        if (!z5) {
                                                            i8 = 6;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                    }
                                                } else if (T) {
                                                    i8 = 3;
                                                } else if (!z5) {
                                                    i8 = 5;
                                                } else {
                                                    i8 = 1;
                                                }
                                                ldyVar2.d.e("Bugle.Share.WebLink.Received", i8);
                                            }
                                        }
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new ldx(r11), 0)), ldyVar.h);
                        return;
                    }
                } finally {
                }
            case 5:
                lgc lgcVar = luz.g;
                tin tinVar = new tin();
                lwq lwqVar = (lwq) this.a;
                if (lwqVar.c == 2) {
                    lwpVar = (lwp) lwqVar.d;
                } else {
                    lwpVar = lwp.a;
                }
                if (lwpVar == null) {
                    tinVar.a.putNull("backup_database_metadata");
                } else {
                    tinVar.a.put("backup_database_metadata", lwpVar.toByteArray());
                }
                Object obj7 = this.b;
                tinVar.b(Optional.of(this.c));
                tlb b3 = tiy.b();
                b3.j(((tie) obj7).h());
                b3.g(lwqVar);
                b3.h(tja.a);
                b3.i(tiz.a);
                b3.f();
                return;
            case 6:
                Object obj8 = this.c;
                tim a2 = tip.a();
                a2.c(new lut(obj8, 6));
                if (((tie) ((tij) a2.b().n()).cO()) != null) {
                    luz luzVar = (luz) this.a;
                    int longValue = (int) ((Number) luzVar.f.b()).longValue();
                    tim a3 = tip.a();
                    a3.q();
                    apply = new lcw(i6).apply(tip.d);
                    tih[] tihVarArr = {(tih) apply};
                    valueOf = Integer.valueOf(a.bp().c());
                    int intValue = valueOf.intValue();
                    if (((Integer) tip.b.getOrDefault(tihVarArr[0].toString(), -1)).intValue() > intValue) {
                        agnc.t("columnReference.toString()", intValue);
                    }
                    a3.m(tihVarArr);
                    a3.c(new lcw(i4));
                    a3.z((String) DesugarArrays.stream(new atkn[]{new atkn(tip.d.i, false)}).map(new tgn(i7)).collect(Collectors.joining(", ")));
                    a3.u(longValue - 1);
                    til b4 = a3.b();
                    tik tikVar = new tik();
                    apply2 = new lut(b4, r11).apply(new tio());
                    tikVar.a = new agpw((tio) apply2);
                    tikVar.e();
                    tikVar.d();
                    tin tinVar2 = new tin();
                    Instant f = luzVar.c.f();
                    if (f == null) {
                        tinVar2.a.putNull("finish_time");
                    } else {
                        tinVar2.a.put("finish_time", Long.valueOf(uzz.k(f)));
                    }
                    tinVar2.c((lwr) this.b);
                    tinVar2.d(luzVar.c.f());
                    tinVar2.b(Optional.of(obj8));
                    return;
                }
                throw new IllegalArgumentException(a.cc(obj8, "restore execution with sessionId [", "] does not exist"));
            case 7:
                Object obj9 = this.c;
                lpg lpgVar = (lpg) this.a;
                String str = (String) obj9;
                lpgVar.a.b(str);
                this.b.run();
                lpgVar.a.n(str);
                return;
            case 8:
                amgu amguVar = (amgu) ((aozy) this.c).s();
                ?? r02 = this.b;
                Object obj10 = this.a;
                atok aF = r02.aF();
                if (aF != null) {
                    map = (Map) ((mic) obj10).m.remove(aF.b);
                }
                if (map == null) {
                    alvw i8 = mic.l.i();
                    i8.X(alwp.a, "BugleUsageStatistics");
                    ((alvg) ((alvg) i8).h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logMessageSendInitiatedEvents", 1054, "UsageStatisticsImpl.java")).q("No send button click recorded, skipping logging CHAT_MESSAGE_SEND_INITIATED.");
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    amgl amglVar = (amgl) amguVar.toBuilder();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar2 = (amgu) amglVar.b;
                    amguVar2.h = 28;
                    amguVar2.b |= 2;
                    amgj amgjVar = (amgj) entry.getKey();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar3 = (amgu) amglVar.b;
                    amguVar3.m = amgjVar.w;
                    amguVar3.b |= 64;
                    try {
                        mar a4 = ((mic) obj10).J.a();
                        a4.e(amrs.ACTIVE_USER_SEND_MESSAGE);
                        a4.g((mbh) entry.getValue());
                        amfq amfqVar = (amfq) amfr.a.createBuilder();
                        amfp amfpVar = amfp.BUGLE_MESSAGE;
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar = (amfr) amfqVar.b;
                        amfrVar.i = amfpVar.dg;
                        amfrVar.b |= 1;
                        amgu amguVar4 = (amgu) amglVar.s();
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar2 = (amfr) amfqVar.b;
                        amguVar4.getClass();
                        amfrVar2.k = amguVar4;
                        amfrVar2.b |= 4;
                        a4.b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                    } catch (Exception e4) {
                        alvw i9 = mic.l.i();
                        i9.X(alwp.a, "BugleUsageStatistics");
                        ((alvg) ((alvg) ((alvg) i9).g(e4)).h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logMessageSendInitiatedEvents", (char) 1076, "UsageStatisticsImpl.java")).q("Failed to send logs to Clearcut");
                    }
                    amgu amguVar5 = (amgu) amglVar.b;
                    long j = amguVar5.n;
                    int aL = akec.aL(amguVar5.h);
                    if (aL == 0) {
                        aL = 1;
                    }
                    lgb.y(j, aL, (mbh) entry.getValue());
                }
                return;
            case 9:
                ?? r03 = this.b;
                ?? r22 = this.a;
                mnl.f(r22, r03);
                ?? r3 = (mnl) this.c;
                r3.c(r22, r3.a(r03));
                return;
            case 10:
                String string = ((Context) ((lhm) this.b).k).getString(R.string.from_label);
                StringBuilder sb = (StringBuilder) this.c;
                sb.append(string);
                sb.append(((mjl) this.a).c().j());
                sb.append('\n');
                return;
            case 11:
                alvw g = UncaughtExceptionReceiver.c.g();
                g.X(alwp.a, "Bugle");
                ?? r04 = this.c;
                Throwable th4 = (Throwable) r04;
                ((alvg) ((alvg) ((alvg) g).g(th4)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "reportUncaughtException", '\'', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: throwing exception to UncaughtExceptionReceiver");
                Object obj11 = this.a;
                ?? intent = new Intent((Context) obj11, (Class<?>) UncaughtExceptionReceiver.class);
                intent.putExtra("throwable", r04);
                try {
                    ((Context) obj11).sendBroadcast(intent);
                } catch (Throwable th5) {
                    alvw h = UncaughtExceptionReceiver.c.h();
                    h.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) h).g(th5)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "reportUncaughtException", '/', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: unable to reportUncaughtException due to exception while sending broadcast");
                }
                ((ngr) obj11).d((Thread) this.b, th4);
                return;
            case 12:
                sgf sgfVar = new sgf();
                sgfVar.aj("logBusinessConversationResponseIfApplicable");
                pqz pqzVar = pqz.REPLIED_BY_USER;
                if (pqzVar == null) {
                    sgfVar.a.putNull("chatbot_directory_conversation_state");
                } else {
                    sgfVar.a.put("chatbot_directory_conversation_state", Integer.valueOf(pqzVar.a()));
                }
                apply3 = new nfc(this.b, i4).apply(new sgg());
                sgfVar.Z(new agpw((sgg) apply3));
                if (sgfVar.a().e() > 0) {
                    ((psi) this.a).i(5, (String) this.c);
                    return;
                }
                return;
            case 13:
                Object obj12 = this.c;
                Object obj13 = this.b;
                Object obj14 = this.a;
                try {
                    sxe c2 = sgh.c();
                    c2.j((ConversationIdType) obj13);
                    c2.i(pqz.CREATED);
                    sga h2 = c2.h();
                    d3 = agnc.d("$primary");
                    d4 = agnc.d("$primary");
                    long a5 = agnc.a(d4, "business_conversations_metadata", h2, new ryu(d3, i3), new rug(h2, i6));
                    Long.valueOf(a5).getClass();
                    if (a5 != -1) {
                        ((psi) obj14).i(4, (String) obj12);
                        return;
                    }
                    return;
                } catch (SQLiteException unused) {
                    xyo e5 = psi.a.e();
                    e5.H("Conversation was deleted before business metadata could be created");
                    e5.b((ConversationIdType) obj13);
                    e5.q();
                    return;
                }
            case 14:
                qmn qmnVar = (qmn) this.a;
                qmnVar.j.g(this.c);
                qmo qmoVar = (qmo) this.b;
                if (qmoVar.c == qmoVar.d) {
                    ((alwl) qmn.a.e()).q("Scheduling incremental contacts sync");
                    ((uof) qmnVar.l.a.b()).a(upk.a("incremental_contacts_import", aozo.a));
                    return;
                }
                return;
            case 15:
                int i10 = qoa.d;
                Object obj15 = this.a;
                obj15.getClass();
                akrh e6 = aktp.e("ContactsSyncDataService#deleteContacts");
                try {
                    Object e7 = qlb.l.e();
                    e7.getClass();
                    boolean booleanValue = ((Boolean) e7).booleanValue();
                    ?? r4 = this.c;
                    int i11 = 8;
                    if (booleanValue) {
                        Object e8 = qlb.m.e();
                        e8.getClass();
                        for (List list : aqjn.aj(r4, ((Number) e8).intValue())) {
                            sji sjiVar = new sji();
                            sjiVar.f("deleteContactsBlocking");
                            sjiVar.b(new qcr(list, 7));
                            d5 += sjiVar.d();
                        }
                    } else {
                        sji sjiVar2 = new sji();
                        sjiVar2.f("deleteContactsBlocking");
                        sjiVar2.b(new qcr(r4, i11));
                        d5 = sjiVar2.d();
                    }
                    armd.i(e6, null);
                    int size = r4.size() - d5;
                    if (size > 0) {
                        ((mbl) ((qoa) obj15).b.b()).e("Bugle.Contacts.Sync.DeletedNotFound.Count", size);
                    }
                    ((qoa) obj15).a.m(new qlf(new qin(this.b, 8), i11));
                    return;
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } finally {
                    }
                }
            case 16:
                Object obj16 = this.a;
                ?? r05 = this.c;
                Object obj17 = this.b;
                try {
                    r05.run();
                    return;
                } finally {
                    qxv qxvVar = (qxv) obj17;
                    if (qxvVar.c.decrementAndGet() < 0) {
                        z = false;
                    }
                    albo.T(z);
                    qxvVar.d.c((qxu) obj16);
                }
            case 17:
                ((SendReportAction) this.b).j(((qzw) this.a).p.c((MessageIdType) this.c));
                return;
            case 18:
                ?? r06 = this.c;
                Object obj18 = this.a;
                Object obj19 = this.b;
                if (r06.cg()) {
                    ResumeRcsFileTransferAction resumeRcsFileTransferAction = (ResumeRcsFileTransferAction) obj19;
                    if (((peh) resumeRcsFileTransferAction.i.b()).a()) {
                        resumeRcsFileTransferAction.g.d(r06, 4, ((qep) obj18).f);
                        return;
                    }
                }
                ((ResumeRcsFileTransferAction) obj19).g.d(r06, 3, ((qep) obj18).f);
                return;
            case 19:
                Object obj20 = this.c;
                obj20.getClass();
                sng sngVar = new sng();
                sngVar.ag();
                sngVar.aj("refreshParticipantCountForRcsGroup#setCount");
                snh snhVar = new snh();
                snhVar.j((ConversationIdType) obj20);
                sngVar.W(snhVar);
                Object obj21 = this.a;
                Object obj22 = this.b;
                akrh e9 = aktp.e("ConversationDatabaseOperationsImpl#getParticipantCount_1_dsdrGroupsFlag");
                try {
                    if (!((okf) ((rul) obj22).j.b()).a()) {
                        sbl a6 = sbn.a();
                        a6.w("refreshParticipantCountForRcsGroup#setCount#inner");
                        a6.c(new rbp(obj20, obj21, 12, false ? 1 : 0));
                        i = a6.b().i();
                    } else {
                        sbq sbqVar = new sbq(sbs.a);
                        sbqVar.w("refreshParticipantCountForRcsGroup#setCount#inner");
                        sbqVar.c(new rsc(obj20, 14));
                        alog t = sbqVar.b().t();
                        alpr alprVar = new alpr();
                        Collection.EL.stream(t).forEach(new rgd(alprVar, 20));
                        alpt g2 = alprVar.g();
                        taz e10 = ParticipantsTable.e();
                        e10.g(new rsc(g2, i6));
                        i = ((alsx) t).c - (e10.b().K() ? 1 : 0);
                    }
                    e9.close();
                    sngVar.B(i);
                    sngVar.a().e();
                    return;
                } finally {
                }
            default:
                xze xzeVar = rul.a;
                snf e11 = sni.e();
                e11.w("updateParticipantIdList1");
                Object obj23 = this.a;
                e11.h(new rsc(obj23, i5));
                e11.f(new rub(11));
                smr smrVar = (smr) ((sna) e11.b().n()).cO();
                if (smrVar != null && (R = smrVar.R()) != null) {
                    Object obj24 = this.c;
                    Object obj25 = this.b;
                    TreeSet treeSet = new TreeSet(Arrays.asList(R.split(",")));
                    albo.y(treeSet.remove(obj25));
                    treeSet.add(obj24);
                    String I = d.I(treeSet);
                    sng sngVar2 = new sng();
                    sngVar2.aj("updateParticipantIdList2");
                    sngVar2.X(new rsc(obj23, i3));
                    sngVar2.D(I);
                    if (sngVar2.a().e() == 0) {
                        alwl alwlVar = (alwl) rul.b.h();
                        alwlVar.Z(alwk.LARGE);
                        alwlVar.X(ydl.o, ((ConversationIdType) obj23).toString());
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateParticipantIdList", 1998, "ConversationDatabaseOperationsImpl.java")).q("Failed to update PARTICIPANT_ID_LIST in conversation table.");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ itl(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ itl(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ itl(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ itl(StringBuilder sb, lhm lhmVar, mje mjeVar, int i) {
        this.d = i;
        this.c = sb;
        this.b = lhmVar;
        this.a = mjeVar;
    }
}
