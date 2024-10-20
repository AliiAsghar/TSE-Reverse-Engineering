package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mmq implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v96, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r15v98, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        int i = 6;
        int i2 = 5;
        boolean z = true;
        boolean z2 = true;
        z = true;
        boolean z3 = false;
        switch (this.c) {
            case 0:
                qeg qegVar = ((qeo) obj).c;
                if (qegVar == null) {
                    qegVar = qeg.a;
                }
                qef qefVar = qef.OK;
                qef b = qef.b(qegVar.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                Object obj2 = this.b;
                if (!qefVar.equals(b)) {
                    qef qefVar2 = qef.PENDING;
                    qef b2 = qef.b(qegVar.c);
                    if (b2 == null) {
                        b2 = qef.UNKNOWN_STATUS;
                    }
                    if (!qefVar2.equals(b2)) {
                        Object obj3 = this.a;
                        ((alwl) ((alwl) mmw.b.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "createConversationWithChatApi", 850, "BugleLegacyConversationCreator.java")).q("Error creating RCS group with ChatAPI.");
                        alwl alwlVar = (alwl) mmw.b.g();
                        ConversationIdType conversationIdType = (ConversationIdType) obj2;
                        alwlVar.X(ydl.o, conversationIdType.toString());
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "createConversationWithChatApi", 853, "BugleLegacyConversationCreator.java")).q("Disabling the conversation due to chat api failure to create group.");
                        sng sngVar = new sng();
                        sngVar.aj("getOrCreateConversation");
                        sngVar.v(5);
                        sngVar.e(conversationIdType);
                        ((mmw) obj3).k.d(conversationIdType);
                    }
                }
                return obj2;
            case 1:
                ((mho) ((mlv) this.b).d.b()).aD(((BugleConversationId) this.a).a, 6);
                return null;
            case 2:
                ((lqn) ((mok) this.a).c.b()).o(3, ((alog) this.b).size());
                return null;
            case 3:
                if (((miz) obj) != null) {
                    qiu.h(((ncv) ((mui) this.b).o.b()).b(((CoreBugleMessageId) this.a).a, amfd.MANUAL_RETRY_FORCES_FALLBACK));
                }
                return null;
            case 4:
                MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) obj;
                if (messageUsageStatisticsData != null) {
                    ((mkp) ((mui) this.b).i.b()).e(this.a.c(), messageUsageStatisticsData);
                }
                return null;
            case 5:
                mwb mwbVar = (mwb) this.a;
                mwbVar.i(false);
                mwbVar.j(((kor) obj).v());
                ((mwf) this.b).g(mjq.SIMPLE, mwbVar);
                return mwbVar.a();
            case 6:
                mwb mwbVar2 = (mwb) this.a;
                mwbVar2.e(mjq.SATELLITE);
                mwbVar2.d = 2;
                mwbVar2.d(0);
                mwbVar2.i(false);
                mwbVar2.j(r15.a);
                mwbVar2.m(Integer.MAX_VALUE);
                mwbVar2.a = new mwm(((mwk) obj).a);
                return mwbVar2.a();
            case 7:
                Stream stream = Collection.EL.stream(((alor) this.b).entrySet());
                Object obj4 = this.a;
                alor alorVar = (alor) stream.collect(alls.a(new mvp(obj4, 4), new mva(15)));
                Stream map = Collection.EL.stream((alog) obj).filter(new rhq(obj4, alorVar, z ? 1 : 0)).map(new mvp(alorVar, i2));
                int i3 = alog.d;
                return (alog) map.collect(alls.a);
            case 8:
                upm upmVar = (upm) obj;
                if (upmVar != null && upmVar.a) {
                    Object obj5 = this.b;
                    maq maqVar = (maq) ((prk) this.a).o.b.b();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.RBM_EVENT;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = amtg.a.createBuilder();
                    aozy createBuilder2 = amsw.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    prl prlVar = (prl) obj5;
                    int i4 = prlVar.c;
                    amsw amswVar = (amsw) createBuilder2.b;
                    amswVar.c = i4 - 1;
                    amswVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    String str = prlVar.a;
                    amtg amtgVar = (amtg) createBuilder.b;
                    amsw amswVar2 = (amsw) createBuilder2.s();
                    amswVar2.getClass();
                    amtgVar.d = amswVar2;
                    amtgVar.c = 5;
                    String a = psi.a(str);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amtg amtgVar2 = (amtg) createBuilder.b;
                    a.getClass();
                    amtgVar2.b = 1 | amtgVar2.b;
                    amtgVar2.e = a;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amtg amtgVar3 = (amtg) createBuilder.s();
                    amtgVar3.getClass();
                    amfrVar2.az = amtgVar3;
                    amfrVar2.e |= 2048;
                    maqVar.j(amfqVar);
                }
                return upmVar;
            case 9:
                Uri uri = (Uri) obj;
                xyo c = prk.a.c();
                c.H("Download finished for ".concat((String) this.a));
                c.z("url", this.b);
                c.q();
                return uri;
            case 10:
                pro proVar = (pro) obj;
                boolean equals = Objects.equals(prq.b.e(), "2");
                Object obj6 = this.b;
                Object obj7 = this.a;
                if ((equals && ((prq) obj7).k.a()) || ((prq) obj7).m.b.contains(obj6)) {
                    ((prq) obj7).l.put(obj6, proVar);
                }
                return proVar;
            case 11:
                qeg qegVar2 = ((qgx) obj).c;
                if (qegVar2 == null) {
                    qegVar2 = qeg.a;
                }
                qef qefVar3 = qef.PENDING;
                qef b3 = qef.b(qegVar2.c);
                if (b3 == null) {
                    b3 = qef.UNKNOWN_STATUS;
                }
                if (!qefVar3.equals(b3)) {
                    Object obj8 = this.b;
                    qax qaxVar = (qax) this.a;
                    String str2 = (String) obj8;
                    qaxVar.a(str2, qegVar2);
                    qaxVar.d.f(str2, qegVar2);
                }
                return qegVar2;
            case 12:
                qbs qbsVar = (qbs) obj;
                alvw m = qbp.a.m();
                m.X(ydl.o, qbsVar.a.toString());
                m.X(ydl.I, qbsVar.f);
                ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/EndpointMetadataProcessor", "process", 56, "EndpointMetadataProcessor.java")).q("Updating the RCS conference URI");
                sng sngVar2 = new sng();
                sngVar2.aj("EndpointMetadataProcessor#process");
                qei qeiVar = ((qet) this.a).c;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                Object obj9 = this.b;
                sngVar2.I(qeiVar.d);
                sngVar2.e((ConversationIdType) obj9);
                return upm.b();
            case 13:
                ConversationIdType conversationIdType2 = (ConversationIdType) obj;
                if (conversationIdType2 != null) {
                    Object obj10 = this.b;
                    qcb qcbVar = (qcb) this.a;
                    if (qcbVar.g((qez) obj10)) {
                        rtz rtzVar = (rtz) qcbVar.h.b();
                        sng sngVar3 = new sng();
                        sngVar3.w(vvh.j);
                        sngVar3.h(tqc.ARCHIVED);
                        rtzVar.U(conversationIdType2, sngVar3);
                    }
                }
                return conversationIdType2;
            case 14:
                aqdu aqduVar = (aqdu) obj;
                if (aqduVar != null) {
                    ver.n((vcc) ((jat) this.a).e, aqduVar, (aqfn) this.b);
                }
                return null;
            case 15:
                nej nejVar = (nej) ((qdi) this.a).f.b();
                qgj qgjVar = (qgj) this.b;
                qgr qgrVar = qgjVar.g;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                nejVar.c(qgrVar, rve.a(qgjVar.e));
                return pwh.SUCCESS;
            case 16:
                Object obj11 = this.a;
                return (Optional) ((agnq) ((qqw) obj11).e.b()).c("BugleCompatibleConversationMatcher#findConversation.txn", new mri(obj11, this.b, (Integer) obj, 20));
            case 17:
                return ((qqw) this.a).v((String) this.b, ((Integer) obj).intValue());
            case 18:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj12 = this.a;
                Object obj13 = this.b;
                if (booleanValue) {
                    xyo d = GenericWorkerQueueAction.d.d();
                    d.H("Deleting processed workitem for ");
                    srd srdVar = (srd) obj13;
                    d.H(srdVar.p());
                    d.H(" - ");
                    d.F(srdVar.k());
                    d.H(" in generic worker queue.");
                    d.q();
                    String o = srdVar.o();
                    akrh e = aktp.e("WorkerDatabaseOperations#deleteGenericWorkerQueue");
                    try {
                        xyl.h();
                        if (TextUtils.isEmpty(o)) {
                            e.close();
                        } else {
                            srh srhVar = new srh();
                            srhVar.f("deleteGenericWorkerQueue");
                            srhVar.b(new uje(o, 11));
                            if (srhVar.d() <= 0) {
                                z2 = false;
                            }
                            e.close();
                            z3 = z2;
                        }
                        return Boolean.valueOf(z3);
                    } catch (Throwable th) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                xyo c2 = GenericWorkerQueueAction.d.c();
                c2.H("Re-enqueue work item");
                srd srdVar2 = (srd) obj13;
                c2.z("ItemId", srdVar2.p());
                c2.x("table type", srdVar2.k());
                c2.x("retry count", srdVar2.l());
                c2.x("worker type", srdVar2.m());
                c2.q();
                GenericWorkerQueueAction genericWorkerQueueAction = (GenericWorkerQueueAction) obj12;
                String o2 = srdVar2.o();
                int l = srdVar2.l();
                long epochMilli = genericWorkerQueueAction.n.f().toEpochMilli();
                long max = Math.max(epochMilli, Math.round(Math.pow(2.0d, l) * 1000.0d) + epochMilli);
                int c3 = riw.c();
                akrh e2 = aktp.e("WorkerDatabaseOperations#reEnqueueWorkItemAndIncreaseRetryCount");
                try {
                    xyl.h();
                    if (TextUtils.isEmpty(o2)) {
                        e2.close();
                        z = false;
                    } else {
                        srk srkVar = new srk();
                        srkVar.aj("reEnqueueWorkItemAndIncreaseRetryCount");
                        srkVar.aa("retry_count", new agpk("$V + 1", new Object[]{srm.d.e}));
                        srkVar.c(false);
                        valueOf = Integer.valueOf(a.bp().c());
                        int intValue = valueOf.intValue();
                        valueOf2 = Integer.valueOf(a.bp().c());
                        int intValue2 = valueOf2.intValue();
                        if (intValue2 < 34000) {
                            agnc.t("next_execute_timestamp", intValue2);
                        }
                        if (intValue >= 34000) {
                            srkVar.a.put("next_execute_timestamp", Long.valueOf(max));
                        }
                        srkVar.d(new rbe(o2, c3, i2));
                        int e3 = srkVar.a().e();
                        if (e3 <= 0) {
                            ukq.a.l(a.cp(o2, "reEnqueue did not update: "));
                            srh srhVar2 = new srh();
                            srhVar2.f("reEnqueueWorkItemAndIncreaseRetryCount");
                            srhVar2.b(new rbe(o2, c3, i));
                            e3 = srhVar2.d();
                            if (e3 <= 0) {
                                ukq.a.l(a.cp(o2, "reEnqueue did not delete max retried work item: "));
                                e2.close();
                            }
                        }
                        if (e3 <= 0) {
                            z = false;
                        }
                        e2.close();
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th3) {
                    try {
                        e2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 19:
                ?? r15 = this.b;
                qzt qztVar = (qzt) this.a;
                return new qzu(r15, qztVar.b, qztVar.c, qztVar.d);
            default:
                ?? r152 = this.b;
                qzu qzuVar = (qzu) this.a;
                return new qzv(r152, qzuVar.b, qzuVar.c, qzuVar.d);
        }
    }

    public /* synthetic */ mmq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
