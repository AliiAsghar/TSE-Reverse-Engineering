package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alls;
import defpackage.alog;
import defpackage.alsx;
import defpackage.alwk;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.alzz;
import defpackage.amdy;
import defpackage.amgj;
import defpackage.amwh;
import defpackage.andi;
import defpackage.aqjn;
import defpackage.armf;
import defpackage.arpj;
import defpackage.arwf;
import defpackage.assc;
import defpackage.atok;
import defpackage.jbh;
import defpackage.lcg;
import defpackage.lga;
import defpackage.lqn;
import defpackage.msh;
import defpackage.msk;
import defpackage.ndi;
import defpackage.oop;
import defpackage.orj;
import defpackage.prf;
import defpackage.qdx;
import defpackage.qjh;
import defpackage.qxi;
import defpackage.qyv;
import defpackage.qyy;
import defpackage.qza;
import defpackage.raa;
import defpackage.rae;
import defpackage.raf;
import defpackage.rap;
import defpackage.rat;
import defpackage.rfy;
import defpackage.riv;
import defpackage.riw;
import defpackage.rsv;
import defpackage.rto;
import defpackage.rus;
import defpackage.ruy;
import defpackage.tqc;
import defpackage.utz;
import defpackage.viq;
import defpackage.wno;
import defpackage.xyl;
import defpackage.ywz;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InsertNewMessageAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final armf c;
    public final agnq d;
    public final msk e;
    public final armf f;
    public final rae g;
    public final armf h;
    public final armf i;
    public final armf j;
    private final viq k;
    private final armf l;
    public static final alwo a = alwo.o("BugleDataModel");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(20);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        riv cP();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public InsertNewMessageAction(armf armfVar, armf armfVar2, agnq agnqVar, msk mskVar, viq viqVar, armf armfVar3, armf armfVar4, rae raeVar, armf armfVar5, armf armfVar6, armf armfVar7, int i, alog alogVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, amgj amgjVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, atok atokVar) {
        super(amdy.INSERT_NEW_MESSAGE_ACTION);
        if (alogVar.isEmpty() && conversationIdType.b()) {
            xyl.c("InsertNewMessageAction: Can't have empty messaging identities and empty conversation id");
        }
        if (TextUtils.isEmpty(str) && (arrayList == null || arrayList.isEmpty())) {
            xyl.c("InsertNewMessageAction: Can't have empty message and no attachments");
        }
        this.b = armfVar;
        this.c = armfVar2;
        this.d = agnqVar;
        this.e = mskVar;
        this.k = viqVar;
        this.f = armfVar3;
        this.h = armfVar4;
        this.g = raeVar;
        this.i = armfVar5;
        this.j = armfVar6;
        this.l = armfVar7;
        this.u.r("sub_id", i);
        boolean a2 = ((oop) raeVar.i.b()).a();
        if (a2) {
            this.u.u("messaging_identities", new ArrayList((Collection) Collection.EL.stream(alogVar).map(new qza(10)).collect(alls.a)));
        }
        i("recipients", (String) Collection.EL.stream(alogVar).map(new lcg(a2, 4)).filter(new qxi(3)).collect(Collectors.joining(",")));
        i("message_text", str);
        i("subject_text", str2);
        i("self_id", lga.Y(selfIdentityId));
        i("conversation_id", conversationIdType.a());
        this.u.p("require_mms", z);
        this.u.p("has_rbm_bot_recipient", z2);
        this.u.r("message_source", amgjVar.w);
        if (arrayList != null) {
            this.u.u("message_parts", arrayList);
        }
        this.u.t("secondary_device", deviceData);
        this.u.p("should_refresh_notification", z3);
        this.u.p("update_draft", false);
        this.u.s("sent_realtime", 0L);
        this.u.p("from_notification", z4);
        if (atokVar != null) {
            this.u.q("trace_id", atokVar.toByteArray());
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("InsertNewMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InsertNewMessage.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [psw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        InsertNewMessageAction insertNewMessageAction;
        rat ratVar;
        int b;
        int b2;
        amgj amgjVar;
        List asList;
        SelfIdentityId selfIdentityId;
        alog aZ;
        List list;
        MessageCoreData g;
        akul akulVar;
        List asList2;
        akul c;
        akul akulVar2;
        try {
            ratVar = (rat) this.i.b();
            MessageCoreData messageCoreData = (MessageCoreData) this.u.h("message");
            akul ag = aktp.ag(messageCoreData);
            ConversationIdType b3 = ruy.b(this.u.l("conversation_id"));
            b = this.u.b("sub_id", -1);
            b2 = this.u.b("locked_default_sms_sub_id", -1);
            amgj b4 = amgj.b(this.u.a("message_source"));
            if (messageCoreData == null) {
                try {
                    akrh e = aktp.e("InsertNewMessageAction#createMessage");
                    try {
                        MessageCoreData messageCoreData2 = null;
                        amgjVar = b4;
                        if (this.g.a.a()) {
                            String l = this.u.l("recipients");
                            String l2 = this.u.l("message_text");
                            String l3 = this.u.l("subject_text");
                            SelfIdentityId W = lga.W(this.u.l("self_id"));
                            boolean y = this.u.y("require_mms");
                            boolean y2 = this.u.y("has_rbm_bot_recipient");
                            ArrayList m = this.u.m("message_parts");
                            if (this.u.A("trace_id") == null) {
                                asList2 = null;
                            } else {
                                asList2 = Arrays.asList(assc.a(this.u.A("trace_id")));
                            }
                            c = qjh.c(ratVar.K, arpj.a, arwf.a, new rap(ratVar, b, l, l2, l3, W, b3, y, y2, m, asList2, this.u.m("messaging_identities"), null));
                            akulVar = c.h(new qyv(3), andi.a);
                        } else {
                            String l4 = this.u.l("recipients");
                            String l5 = this.u.l("message_text");
                            String l6 = this.u.l("subject_text");
                            SelfIdentityId W2 = lga.W(this.u.l("self_id"));
                            boolean y3 = this.u.y("require_mms");
                            boolean y4 = this.u.y("has_rbm_bot_recipient");
                            ArrayList m2 = this.u.m("message_parts");
                            if (this.u.A("trace_id") == null) {
                                asList = null;
                            } else {
                                asList = Arrays.asList(assc.a(this.u.A("trace_id")));
                            }
                            ArrayList m3 = this.u.m("messaging_identities");
                            Object e2 = ((utz) jbh.a.get()).e();
                            e2.getClass();
                            if (((Boolean) e2).booleanValue()) {
                                ((alwl) rat.b.g()).J("InsertNewMessageProcessor::createMessageSync params selfId=%s, subId=%s for conversationId=%s", W2, Integer.valueOf(b), b3);
                            }
                            SelfIdentityId g2 = ratVar.j.f(b).g();
                            if (W2 == null) {
                                Object e3 = ((utz) jbh.a.get()).e();
                                e3.getClass();
                                if (((Boolean) e3).booleanValue()) {
                                    ((alwl) rat.b.g()).J("InsertNewMessageProcessor::createMessageSync switched to selfId=%s to match subId=%s for conversationId=%s", g2, Integer.valueOf(b), b3);
                                }
                                selfIdentityId = g2;
                            } else {
                                selfIdentityId = W2;
                            }
                            if (b3.b()) {
                                if (l4 == null) {
                                    l4 = "";
                                }
                                b3 = ratVar.b(l4, b, m3);
                                if (b3.b()) {
                                    ((alwl) rat.b.i()).q("Failed to retrieve conversation Id from message data");
                                    akulVar = aktp.ag(messageCoreData2);
                                }
                            }
                            Object e4 = ((utz) raf.a.get()).e();
                            e4.getClass();
                            if (((Boolean) e4).booleanValue()) {
                                ratVar.j(b3, selfIdentityId, g2, b);
                            }
                            if (((oop) ratVar.R.b()).a()) {
                                Object c2 = ((ndi) ratVar.F.b()).d(new BugleConversationId(b3)).c();
                                c2.getClass();
                                Iterable iterable = (Iterable) c2;
                                ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
                                Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResolvedRecipient) it.next()).f());
                                }
                                aZ = alzz.aZ(arrayList);
                            } else {
                                ArrayList b5 = ((rus) ratVar.e.b()).b(b3, true);
                                ArrayList arrayList2 = new ArrayList(aqjn.J(b5, 10));
                                Iterator it2 = b5.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(ratVar.z.r((String) it2.next()));
                                }
                                aZ = alzz.aZ(arrayList2);
                            }
                            alog alogVar = aZ;
                            if (((orj) ratVar.J.b()).a() && alogVar.size() == 1 && ((msh) aqjn.ag(alogVar)).B()) {
                                messageCoreData2 = ratVar.w.v(b3, selfIdentityId, l5);
                            } else if (ratVar.q.isPresent() && ((ywz) ratVar.q.get()).a()) {
                                messageCoreData2 = ratVar.w.c(null, b3, ((SelfIdentityIdImpl) selfIdentityId).a, selfIdentityId, l5, "", 0L, ratVar.r.f().toEpochMilli(), true, true, 3, null);
                            } else {
                                rsv rsvVar = ratVar.k;
                                if (m2 == null) {
                                    list = alsx.a;
                                } else {
                                    list = m2;
                                }
                                List list2 = list;
                                SelfIdentityId selfIdentityId2 = selfIdentityId;
                                int a2 = rsvVar.a(b3, alogVar, l6, l5, list2, b, y3, y4);
                                if (a2 != 0) {
                                    if (a2 != 1) {
                                        if (a2 != 3) {
                                            xyl.c(defpackage.a.bV(a2, "invalid message type "));
                                            g = ratVar.w.g(b3, selfIdentityId2, l5);
                                        } else {
                                            g = ratVar.a(l5, selfIdentityId2, b, b3);
                                        }
                                    } else {
                                        g = ratVar.w.f(b3, selfIdentityId2, l5, l6, false);
                                    }
                                } else {
                                    g = ratVar.w.g(b3, selfIdentityId2, l5);
                                }
                                if (m2 != null) {
                                    Iterator it3 = m2.iterator();
                                    while (it3.hasNext()) {
                                        g.aH((MessagePartCoreData) it3.next());
                                    }
                                }
                                riw.f(g, asList);
                                messageCoreData2 = g;
                            }
                            akulVar = aktp.ag(messageCoreData2);
                        }
                        e.b(akulVar);
                        e.close();
                        akulVar2 = akulVar;
                    } finally {
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    insertNewMessageAction = this;
                    insertNewMessageAction.h(e);
                    throw e;
                }
            } else {
                amgjVar = b4;
                akulVar2 = ag;
            }
            insertNewMessageAction = this;
        } catch (RuntimeException e6) {
            e = e6;
            insertNewMessageAction = this;
        }
        try {
            return akulVar2.i(new wno(this, b, b2, amgjVar, ratVar, 1), insertNewMessageAction.g.c).f(RuntimeException.class, new prf(insertNewMessageAction, 16), insertNewMessageAction.g.b);
        } catch (RuntimeException e7) {
            e = e7;
            insertNewMessageAction.h(e);
            throw e;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    public final alhr g(MessageCoreData messageCoreData, rto rtoVar) {
        akrh e = aktp.e("InsertNewMessageAction::getParticipantIdentities");
        try {
            alhr D = albo.D(new raa(this, messageCoreData, rtoVar, 0));
            e.close();
            return D;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(Exception exc) {
        if (this.u.y("from_notification")) {
            this.k.g(amwh.MESSAGE_TYPE_UNKNOWN, 5, viq.c(exc), Optional.of(true));
        }
    }

    protected final void i(String str, String str2) {
        if (str2 != null) {
            this.u.v(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [armf, java.lang.Object] */
    public final void j(MessageCoreData messageCoreData, rto rtoVar, int i, int i2, boolean z, alhr alhrVar) {
        if (rtoVar.E()) {
            if (!messageCoreData.cn()) {
                alwl alwlVar = (alwl) a.i();
                alwlVar.Z(alwk.MEDIUM);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "startEarlySend", 682, "InsertNewMessageAction.java")).t("InsertNewMessageAction: encryption different between conversation and draft message; draftId = %s", messageCoreData.aE());
            }
            messageCoreData.bn();
        }
        akrh e = aktp.e("InsertNewMessageAction::buildMessageIdentityProtos");
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) alhrVar.get()).iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                arrayList.add(lqn.n((msh) it.next()));
                it = it2;
            }
            e.close();
            if (messageCoreData.E().i()) {
                messageCoreData.bR(((qdx) this.g.f.b()).a());
            }
            akrh e2 = aktp.e("InsertNewMessageAction::createSendMessageAction");
            try {
                akrh e3 = aktp.e("InsertNewMessageAction::createSendMessageAction::create");
                try {
                    Action a2 = ((rfy) this.l.b()).a();
                    e3.close();
                    a2.u.p("is_early_send", true);
                    a2.u.s("rcs_session_id", rtoVar.e());
                    a2.u.t("message", messageCoreData);
                    a2.u.r("sub_id", i);
                    a2.u.u("remote_messaging_identities", arrayList);
                    a2.u.p("is_rbm_conversation", this.u.y("has_rbm_bot_recipient"));
                    a2.u.p("is_rcs_group", rtoVar.S());
                    a2.u.t("secondary_device", this.u.h("secondary_device"));
                    a2.u.t("message_usage_stats_data", this.u.h("message_usage_stats_data"));
                    a2.u.r("message_source", this.u.a("message_source"));
                    a2.u.s("sent_realtime", this.u.d("sent_realtime"));
                    a2.u.r("locked_default_sms_sub_id", i2);
                    a2.u.p("update_draft", this.u.y("update_draft"));
                    a2.u.v("archive", this.u.l("archive"));
                    a2.u.p("should_refresh_notification", this.u.y("should_refresh_notification"));
                    a2.u.p("from_notification", this.u.y("from_notification"));
                    a2.u.p("ui_has_been_notified", z);
                    e2.close();
                    e2 = aktp.e("InsertNewMessageAction::startSendMessageActionForEarlySend");
                    try {
                        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "startEarlySend", 716, "InsertNewMessageAction.java")).q("InsertNewMessageAction: Starting early send");
                        ((SendMessageAction) a2).j();
                        e2.close();
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
                e.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InsertNewMessageAction(armf armfVar, armf armfVar2, agnq agnqVar, msk mskVar, viq viqVar, armf armfVar3, armf armfVar4, rae raeVar, armf armfVar5, armf armfVar6, armf armfVar7, Parcel parcel) {
        super(parcel, amdy.INSERT_NEW_MESSAGE_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = agnqVar;
        this.e = mskVar;
        this.k = viqVar;
        this.f = armfVar3;
        this.h = armfVar4;
        this.g = raeVar;
        this.i = armfVar5;
        this.j = armfVar6;
        this.l = armfVar7;
    }

    public InsertNewMessageAction(armf armfVar, armf armfVar2, agnq agnqVar, msk mskVar, viq viqVar, armf armfVar3, armf armfVar4, rae raeVar, armf armfVar5, armf armfVar6, armf armfVar7, MessageCoreData messageCoreData, boolean z, amgj amgjVar, tqc tqcVar, int i, Optional optional, long j, boolean z2) {
        super(amdy.INSERT_NEW_MESSAGE_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = agnqVar;
        this.e = mskVar;
        this.k = viqVar;
        this.f = armfVar3;
        this.h = armfVar4;
        this.g = raeVar;
        this.i = armfVar5;
        this.j = armfVar6;
        this.l = armfVar7;
        this.u.t("message", messageCoreData);
        this.u.p("update_draft", z);
        if (amgjVar != null) {
            this.u.r("message_source", amgjVar.w);
        }
        if (tqcVar != null) {
            this.u.v("archive", tqcVar.name());
        }
        this.u.r("sub_id", i);
        if (optional.isPresent()) {
            this.u.r("locked_default_sms_sub_id", ((Integer) optional.get()).intValue());
        }
        this.u.s("sent_realtime", j);
        if (messageCoreData.y() != null) {
            this.u.t("message_usage_stats_data", messageCoreData.y());
        }
        this.u.p("from_notification", false);
        this.u.p("should_refresh_notification", z2);
    }
}
