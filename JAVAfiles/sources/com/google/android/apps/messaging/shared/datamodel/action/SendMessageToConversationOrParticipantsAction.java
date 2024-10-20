package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.ancr;
import defpackage.anen;
import defpackage.armf;
import defpackage.qpk;
import defpackage.rbs;
import defpackage.rbw;
import defpackage.rfw;
import defpackage.rga;
import defpackage.rgc;
import defpackage.riv;
import defpackage.rsv;
import defpackage.rtb;
import defpackage.ryg;
import defpackage.tqx;
import defpackage.wyt;
import defpackage.xnv;
import defpackage.yyb;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendMessageToConversationOrParticipantsAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final riv c;
    public final ryg d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final wyt h;
    public final xnv i;
    public final tqx j;
    public final agnq k;
    public final rsv l;
    public final rtb m;
    public final anen n;
    public final anen o;
    public final armf p;
    public final armf q;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(2);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgc NV();

        riv cP();
    }

    public SendMessageToConversationOrParticipantsAction(Parcel parcel, ryg rygVar, armf armfVar, armf armfVar2, armf armfVar3, wyt wytVar, xnv xnvVar, tqx tqxVar, agnq agnqVar, rsv rsvVar, rtb rtbVar, anen anenVar, anen anenVar2, armf armfVar4, armf armfVar5, armf armfVar6) {
        super(parcel, amdy.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = rygVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = wytVar;
        this.i = xnvVar;
        this.j = tqxVar;
        this.k = agnqVar;
        this.l = rsvVar;
        this.m = rtbVar;
        this.n = anenVar;
        this.o = anenVar2;
        this.b = armfVar5;
        this.p = armfVar4;
        this.q = armfVar6;
        this.c = ((a) yyb.aL(a.class)).cP();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SendMessageToConversationOrParticipantsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        throw new IllegalStateException("SendMessageToConversationOrParticipantsAction#executeAction called without an implementation. Only executeActionAsync should be called.");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendMessageToConversationOrParticipants.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        return aktp.aj(new ancr() { // from class: rgb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                akul h;
                akul i;
                SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = SendMessageToConversationOrParticipantsAction.this;
                long epochMilli = sendMessageToConversationOrParticipantsAction.i.f().toEpochMilli();
                rhl rhlVar = sendMessageToConversationOrParticipantsAction.u;
                boolean z = rhlVar.z("use_cloud_sync", false);
                ConversationIdType b = ruy.b(rhlVar.l("conversation_id"));
                byte[] bArr = null;
                if (b.b()) {
                    alog B = ((rtz) sendMessageToConversationOrParticipantsAction.e.b()).B(alog.n(sendMessageToConversationOrParticipantsAction.u.m("participants_list")));
                    if (z) {
                        b = (ConversationIdType) sendMessageToConversationOrParticipantsAction.k.c("SendMessageToConversationOrParticipantsAction#getConversationId", new ndb(sendMessageToConversationOrParticipantsAction, B, 13, bArr));
                    } else if (((Boolean) qpf.a.e()).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        int size = B.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String O = ((ParticipantsTable.BindData) B.get(i2)).O();
                            if (O != null) {
                                arrayList.add(O);
                            }
                        }
                        alog n = alog.n(arrayList);
                        ruu a2 = ruv.a();
                        a2.j(B);
                        a2.f(false);
                        a2.s(new xhv());
                        a2.e(false);
                        b = ((qpj) sendMessageToConversationOrParticipantsAction.b.b()).d(n, new lpn(a2.a(), 16)).x();
                        if (b.b()) {
                            b = ruy.a;
                        }
                    } else {
                        long d = sendMessageToConversationOrParticipantsAction.h.d(B);
                        if (d < 0) {
                            alvw i3 = SendMessageToConversationOrParticipantsAction.a.i();
                            i3.X(alwp.a, "Bugle");
                            alvg alvgVar = (alvg) i3;
                            alvgVar.X(ydl.D, rxn.n(B).toString());
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "getConversationId", 639, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't create a threadId in SMS db for the numbers.");
                            b = ruy.a;
                        } else {
                            b = ((rtz) sendMessageToConversationOrParticipantsAction.e.b()).ao(d, tqc.UNARCHIVED, B);
                        }
                    }
                }
                ConversationIdType conversationIdType = b;
                if (conversationIdType.b()) {
                    alvw i4 = SendMessageToConversationOrParticipantsAction.a.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 451, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't find a conversation id.");
                    return aktp.ag(null);
                }
                rto z2 = ((uac) sendMessageToConversationOrParticipantsAction.p.b()).z(conversationIdType);
                if (z2 == null) {
                    alvw i5 = SendMessageToConversationOrParticipantsAction.a.i();
                    i5.X(alwp.a, "Bugle");
                    alvg alvgVar2 = (alvg) i5;
                    alvgVar2.X(ydl.p, conversationIdType);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 461, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't find conversation item data.");
                    return aktp.ag(null);
                }
                qwm e = sendMessageToConversationOrParticipantsAction.d.e(z2.f());
                if (e != null && !e.j()) {
                    h = aktp.ag(Optional.of(e.g()));
                } else {
                    h = ((nfx) sendMessageToConversationOrParticipantsAction.q.b()).d().h(new qyv(17), sendMessageToConversationOrParticipantsAction.o);
                }
                akul akulVar = h;
                rhl rhlVar2 = sendMessageToConversationOrParticipantsAction.u;
                String l = rhlVar2.l("message_text");
                String l2 = rhlVar2.l("message_attachment_type");
                if (l2 == null) {
                    i = akulVar.i(new rgt(sendMessageToConversationOrParticipantsAction, z, conversationIdType, l, 1), sendMessageToConversationOrParticipantsAction.o);
                } else if (gh.e(l2)) {
                    i = akulVar.i(new qbt((Object) sendMessageToConversationOrParticipantsAction, (Object) conversationIdType, (Object) l, 8, (byte[]) null), sendMessageToConversationOrParticipantsAction.o);
                } else {
                    throw new IllegalArgumentException(a.bW(l2, "Attachment type ", " is not supported."));
                }
                akul akulVar2 = i;
                return aktp.an(akulVar, akulVar2).h(new rfz(sendMessageToConversationOrParticipantsAction, akulVar, akulVar2, z2, epochMilli, 0), sendMessageToConversationOrParticipantsAction.n);
            }
        }, this.n);
    }

    public final akul h(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i, String str, List list) {
        return aktp.ai(new qpk(this, conversationIdType, 5), this.n).i(new rga(this, conversationIdType, str, list, i, selfIdentityId, 0), this.n);
    }

    public final Optional j(Optional optional) {
        return optional.map(new rbw(this.d, 9)).map(new rbs(15));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SendMessageToConversationOrParticipantsAction(ryg rygVar, armf armfVar, armf armfVar2, armf armfVar3, wyt wytVar, xnv xnvVar, tqx tqxVar, agnq agnqVar, rsv rsvVar, rtb rtbVar, anen anenVar, anen anenVar2, armf armfVar4, armf armfVar5, armf armfVar6, ConversationIdType conversationIdType, Uri uri, long j, String str) {
        super(amdy.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = rygVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = wytVar;
        this.i = xnvVar;
        this.j = tqxVar;
        this.k = agnqVar;
        this.l = rsvVar;
        this.m = rtbVar;
        this.n = anenVar;
        this.o = anenVar2;
        this.b = armfVar4;
        this.p = armfVar5;
        this.q = armfVar6;
        this.c = ((a) yyb.aL(a.class)).cP();
        this.u.v("conversation_id", conversationIdType.a());
        this.u.t("message_attachment_uri", uri);
        this.u.s("message_attachment_duration", j);
        this.u.v("message_attachment_type", str);
        this.u.p("use_cloud_sync", false);
        this.u.p("initiated_by_secondary_device", true);
    }

    public SendMessageToConversationOrParticipantsAction(ryg rygVar, armf armfVar, armf armfVar2, armf armfVar3, wyt wytVar, xnv xnvVar, tqx tqxVar, agnq agnqVar, rsv rsvVar, rtb rtbVar, anen anenVar, anen anenVar2, armf armfVar4, armf armfVar5, armf armfVar6, ConversationIdType conversationIdType, String str) {
        this(rygVar, armfVar, armfVar2, armfVar3, wytVar, xnvVar, tqxVar, agnqVar, rsvVar, rtbVar, anenVar, anenVar2, armfVar4, armfVar5, armfVar6, str);
        this.u.v("conversation_id", conversationIdType.a());
    }

    public SendMessageToConversationOrParticipantsAction(ryg rygVar, armf armfVar, armf armfVar2, armf armfVar3, wyt wytVar, xnv xnvVar, tqx tqxVar, agnq agnqVar, rsv rsvVar, rtb rtbVar, anen anenVar, anen anenVar2, armf armfVar4, armf armfVar5, armf armfVar6, String str) {
        super(amdy.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = rygVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = wytVar;
        this.i = xnvVar;
        this.j = tqxVar;
        this.k = agnqVar;
        this.l = rsvVar;
        this.m = rtbVar;
        this.n = anenVar;
        this.o = anenVar2;
        this.b = armfVar4;
        this.p = armfVar5;
        this.q = armfVar6;
        this.c = ((a) yyb.aL(a.class)).cP();
        this.u.v("message_text", str);
        this.u.p("use_cloud_sync", false);
        this.u.p("initiated_by_secondary_device", true);
    }

    public SendMessageToConversationOrParticipantsAction(ryg rygVar, armf armfVar, armf armfVar2, armf armfVar3, wyt wytVar, xnv xnvVar, tqx tqxVar, agnq agnqVar, rsv rsvVar, rtb rtbVar, anen anenVar, anen anenVar2, armf armfVar4, armf armfVar5, armf armfVar6, ArrayList arrayList, String str) {
        this(rygVar, armfVar, armfVar2, armfVar3, wytVar, xnvVar, tqxVar, agnqVar, rsvVar, rtbVar, anenVar, anenVar2, armfVar4, armfVar5, armfVar6, str);
        this.u.u("participants_list", arrayList);
    }
}
