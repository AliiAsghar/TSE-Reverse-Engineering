package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmz extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(ConversationId conversationId, mmy mmyVar, mna mnaVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = conversationId;
        this.b = mmyVar;
        this.c = mnaVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                return null;
            case 3:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((mmz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v81, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, rwt] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r3v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v100, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v157, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z = false;
        int i = 5;
        switch (this.d) {
            case 0:
                aqil.P(obj);
                int ordinal = ((mmy) this.b).ordinal();
                ConversationIdType conversationIdType = ((BugleConversationId) this.a).a;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        lpg.y(conversationIdType);
                    } else {
                        throw new IllegalArgumentException("Parental approval status=" + this.b + " is not supported");
                    }
                } else {
                    lpg.x(conversationIdType);
                }
                return arnb.a;
            case 1:
                aqil.P(obj);
                alvw g = lwh.a.g();
                g.X(alwp.a, "BugleBackup");
                ((alvg) g.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$completeRestore$2$1", "invokeSuspend", 236, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt")).w("Requested restore completed: workflowVersion: [%s] sessionId: [%s]", 5, this.c);
                ((lxa) ((lwh) this.a).c.b()).b((UUID) this.c, 5);
                ((lxa) ((lwh) this.a).c.b()).e((UUID) this.c);
                ((lxa) ((lwh) this.a).c.b()).d((UUID) this.c, (lwr) this.b);
                return arnb.a;
            case 2:
                aqil.P(obj);
                ((qxr) ((mpu) this.b).c.b()).o(ruy.b(this.a.b()), (psk) this.c, true);
                return null;
            case 3:
                aqil.P(obj);
                Object obj2 = this.c;
                Object obj3 = this.a;
                akrh e = aktp.e("FileProcessingDatabaseOperations#updateFileTransferEntryWithHttpRequestResult-file");
                try {
                    qep qepVar = ((qeq) obj2).c;
                    if (qepVar == null) {
                        qepVar = qep.a;
                    }
                    qepVar.getClass();
                    pzy.k((pyz) obj3, qepVar, qam.a);
                    armd.i(e, null);
                    qep qepVar2 = ((qeq) this.c).d;
                    if (qepVar2 == null) {
                        qepVar2 = qep.a;
                    }
                    qepVar2.getClass();
                    if (!qepVar2.equals(qep.a)) {
                        Object obj4 = this.a;
                        e = aktp.e("FileProcessingDatabaseOperations#updateFileTransferEntryWithHttpRequestResult-thumbnail");
                        try {
                            pzy.k((pyz) obj4, qepVar2, qam.b);
                            armd.i(e, null);
                        } finally {
                        }
                    }
                    return arnb.a;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 4:
                aqil.P(obj);
                for (Object obj5 : this.c) {
                    obj5.getClass();
                    Object obj6 = this.a;
                    alwo alwoVar = qnn.a;
                    ((qnn) obj6).g.l((qog) obj5);
                }
                if (((qoj) this.b).c.size() > 0 || ((qoj) this.b).d.size() > 0) {
                    Object obj7 = this.a;
                    alwo alwoVar2 = qnn.a;
                    ((qnn) obj7).f.e((qoj) this.b);
                    ((alwl) qnn.a.g()).q("Enqueued empty contacts for ContactRecipientDeletedSync");
                }
                return arnb.a;
            case 5:
                aqil.P(obj);
                if (this.b == qsn.b) {
                    Object obj8 = this.c;
                    xze xzeVar = xca.a;
                    if (!msx.g((String) obj8)) {
                        throw new IllegalArgumentException("BOT address is not an email address.");
                    }
                }
                if (this.b == qsn.a && !((yjr) ((qsm) this.a).d.b()).A((String) this.c)) {
                    throw new IllegalArgumentException("Phone address is not normalized");
                }
                return arnb.a;
            case 6:
                aqil.P(obj);
                ConversationIdType x = ((smr) this.b).x();
                x.getClass();
                smm smmVar = new smm(smp.a);
                smmVar.w("CachingGroupManager#subscribeConversationToParticipantsChange");
                smmVar.e(new qsb(x, i));
                smmVar.b().E(new qtk((qtl) this.a, (xwb) this.c));
                return ((rtz) ((qtl) this.a).d.b()).aq(((smr) this.b).x());
            case 7:
                aqil.P(obj);
                ((qva) this.a).a.d(this.c);
                ?? r9 = this.b;
                ArrayList arrayList = new ArrayList(aqjn.J(r9, 10));
                Iterator it = r9.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qvo) it.next()).c);
                }
                ((qva) this.a).a.c(arrayList);
                return arnb.a;
            case 8:
                aqil.P(obj);
                xze xzeVar2 = rcr.a;
                ((rcr) this.b).h.d((byte[]) this.c, (gj) this.a);
                return arnb.a;
            case 9:
                aqil.P(obj);
                Object obj9 = this.b;
                obj9.getClass();
                return ((reb) this.a).k.B((xaz) obj9, (String) this.c).orElse(null);
            case 10:
                aqil.P(obj);
                ((reb) this.b).K.d((byte[]) this.c, (gj) this.a);
                return arnb.a;
            case 11:
                aqil.P(obj);
                xze xzeVar3 = reb.a;
                return ((reb) this.c).k.ae((Context) this.a, (gj) this.b);
            case 12:
                aqil.P(obj);
                return ibi.k((ConversationIdType) this.c, (qhy) this.a);
            case 13:
                aqil.P(obj);
                Object obj10 = this.c;
                obj10.getClass();
                rur rurVar = (rur) this.b;
                List K = ((rtz) rurVar.b.b()).K((ConversationIdType) obj10);
                if (K.isEmpty()) {
                    alvw i2 = rur.a.i();
                    i2.X(alwp.a, "BugleConversation");
                    alvg alvgVar = (alvg) i2;
                    alvgVar.X(ydl.p, obj10);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "isParticipantInGroupRcsConversationBlocking", 78, "ConversationParticipantsProviderImpl.kt")).q("The conversation does not contain any participants.");
                } else {
                    alog w = rurVar.c.w(K);
                    w.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    alur it2 = w.iterator();
                    while (it2.hasNext()) {
                        Optional e2 = ((msh) it2.next()).e();
                        e2.getClass();
                        qei qeiVar = (qei) arsd.k(e2);
                        if (qeiVar != null) {
                            arrayList2.add(qeiVar);
                        }
                    }
                    z = arrayList2.contains(this.a);
                }
                return Boolean.valueOf(z);
            case 14:
                aqil.P(obj);
                this.c.b(this.a, (MessageIdType) this.b);
                return arnb.a;
            case 15:
                aqil.P(obj);
                return Boolean.valueOf(((vcb) ((tsl) this.b).e.b()).k(aqjn.e(this.a), (alpu) this.c, new tgn(11)));
            case 16:
                aqil.P(obj);
                aozy createBuilder = amxn.a.createBuilder();
                createBuilder.getClass();
                aktp.aW(21, createBuilder);
                aozy createBuilder2 = amxl.a.createBuilder();
                createBuilder2.getClass();
                amxm I = ((wyp) this.a).I(this.b, null, null);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                amxl amxlVar = (amxl) apagVar;
                amxlVar.c = I;
                amxlVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                Object obj11 = this.c;
                amxl amxlVar2 = (amxl) createBuilder2.b;
                amxlVar2.d = ((amwt) obj11).E;
                amxlVar2.b |= 2;
                apag s = createBuilder2.s();
                s.getClass();
                amxl amxlVar3 = (amxl) s;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amxn amxnVar = (amxn) createBuilder.b;
                amxnVar.p = amxlVar3;
                amxnVar.b |= 2048;
                ((wyp) this.a).q(aktp.aU(createBuilder));
                return arnb.a;
            case 17:
                aqil.P(obj);
                aozy createBuilder3 = amly.a.createBuilder();
                createBuilder3.getClass();
                akec.ay(amlx.PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO, createBuilder3);
                akec.ax((amlw) this.b, createBuilder3);
                akec.aw(((acnu) ((wyp) this.a).e.b()).a(new adiw((String) this.c)), createBuilder3);
                ((wyp) this.a).l(akec.av(createBuilder3));
                return arnb.a;
            case 18:
                aqil.P(obj);
                aozy createBuilder4 = amly.a.createBuilder();
                createBuilder4.getClass();
                akec.ay(amlx.PROVISIONING_UI_TYPE_WELCOME_MESSAGE, createBuilder4);
                akec.ax((amlw) this.b, createBuilder4);
                akec.aw(((acnu) ((wyp) this.a).e.b()).a(new adiw((String) this.c)), createBuilder4);
                ((wyp) this.a).l(akec.av(createBuilder4));
                return arnb.a;
            case 19:
                aqil.P(obj);
                mar a = ((mbb) ((wpp) this.a).b.b()).a();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfqVar.getClass();
                alzz.n(amfp.TYCHO_GRPC_EVENT, amfqVar);
                aozy createBuilder5 = amym.a.createBuilder();
                createBuilder5.getClass();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                Object obj12 = this.c;
                Object obj13 = this.a;
                Object obj14 = this.b;
                amym amymVar = (amym) createBuilder5.b;
                amymVar.d = obj14;
                amymVar.c = 2;
                amva a2 = ((acnu) ((wpp) obj13).a.b()).a(new adiw((String) obj12));
                a2.getClass();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                amym amymVar2 = (amym) createBuilder5.b;
                amymVar2.e = a2;
                amymVar2.b |= 1;
                apag s2 = createBuilder5.s();
                s2.getClass();
                amym amymVar3 = (amym) s2;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.bL = amymVar3;
                amfrVar.h |= 536870912;
                a.b((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_TYCHO_GRPC_EVENTS);
                return arnb.a;
            default:
                aqil.P(obj);
                rwd rwdVar = (rwd) ((wqu) this.c).c.b();
                ?? r0 = this.a;
                ConversationIdType z2 = r0.z();
                MessageIdType B = r0.B();
                sya syaVar = new sya();
                syaVar.aj("updateDatagramId");
                syaVar.C((ruz) this.b);
                rwdVar.O(z2, B, syaVar);
                alvw g2 = wqu.a.g();
                g2.X(alwp.a, "BugleEmergencySOS");
                alvg alvgVar2 = (alvg) g2;
                alvgVar2.X(ydl.b, this.a.B());
                alvgVar2.X(ydl.S, this.a.A());
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/SatelliteApiSender$updateDatagramId$2$1", "invokeSuspend", 144, "SatelliteApiSender.kt")).q("Successfully updated outgoing message datagramId.");
                return vqh.a(-1, 0).a();
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, rwt] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.d) {
            case 0:
                return new mmz((ConversationId) this.a, (mmy) this.b, (mna) this.c, arpeVar, 0);
            case 1:
                Object obj2 = this.a;
                return new mmz((lwh) obj2, (UUID) this.c, (lwr) this.b, arpeVar, 1);
            case 2:
                return new mmz((mpu) this.b, (ConversationId) this.a, (psk) this.c, arpeVar, 2);
            case 3:
                Object obj3 = this.c;
                return new mmz((qeq) obj3, (pzy) this.b, (pyz) this.a, arpeVar, 3);
            case 4:
                return new mmz((List) this.c, (qnn) this.a, (qoj) this.b, arpeVar, 4);
            case 5:
                Object obj4 = this.b;
                return new mmz((qsn) obj4, (String) this.c, (qsm) this.a, arpeVar, 5);
            case 6:
                Object obj5 = this.a;
                return new mmz((qtl) obj5, (xwb) this.c, (smr) this.b, arpeVar, 6);
            case 7:
                return new mmz((qva) this.a, (List) this.c, (List) this.b, arpeVar, 7);
            case 8:
                Object obj6 = this.b;
                return new mmz((rcr) obj6, (byte[]) this.c, (gt) this.a, arpeVar, 8);
            case 9:
                Object obj7 = this.a;
                return new mmz((reb) obj7, (xaz) this.b, (String) this.c, arpeVar, 9);
            case 10:
                Object obj8 = this.b;
                return new mmz((reb) obj8, (byte[]) this.c, (gj) this.a, arpeVar, 10);
            case 11:
                Object obj9 = this.c;
                return new mmz((reb) obj9, (Context) this.a, (gj) this.b, arpeVar, 11);
            case 12:
                Object obj10 = this.b;
                return new mmz((ibi) obj10, (ConversationIdType) this.c, (qhy) this.a, arpeVar, 12);
            case 13:
                Object obj11 = this.b;
                return new mmz((rur) obj11, (ConversationIdType) this.c, (qei) this.a, arpeVar, 13);
            case 14:
                return new mmz((rwt) this.c, (MessageCoreData) this.a, (MessageIdType) this.b, arpeVar, 14);
            case 15:
                Object obj12 = this.b;
                return new mmz((tsl) obj12, (qei) this.a, (alpu) this.c, arpeVar, 15);
            case 16:
                return new mmz((wyp) this.a, (adiv) this.b, (amwt) this.c, arpeVar, 16);
            case 17:
                Object obj13 = this.a;
                return new mmz((wyp) obj13, (amlw) this.b, (String) this.c, arpeVar, 17);
            case 18:
                Object obj14 = this.a;
                return new mmz((wyp) obj14, (amlw) this.b, (String) this.c, arpeVar, 18, null);
            case 19:
                Object obj15 = this.a;
                return new mmz((wpp) obj15, (amyn) this.b, (String) this.c, arpeVar, 19);
            default:
                return new mmz((wqu) this.c, (MessageCoreData) this.a, (ruz) this.b, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(ibi ibiVar, ConversationIdType conversationIdType, qhy qhyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = ibiVar;
        this.c = conversationIdType;
        this.a = qhyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(List list, qnn qnnVar, qoj qojVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = list;
        this.a = qnnVar;
        this.b = qojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(lwh lwhVar, UUID uuid, lwr lwrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = lwhVar;
        this.c = uuid;
        this.b = lwrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(mpu mpuVar, ConversationId conversationId, psk pskVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = mpuVar;
        this.a = conversationId;
        this.c = pskVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(qeq qeqVar, pzy pzyVar, pyz pyzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qeqVar;
        this.b = pzyVar;
        this.a = pyzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(qsn qsnVar, String str, qsm qsmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = qsnVar;
        this.c = str;
        this.a = qsmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(qtl qtlVar, xwb xwbVar, smr smrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = qtlVar;
        this.c = xwbVar;
        this.b = smrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(qva qvaVar, List list, List list2, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = qvaVar;
        this.c = list;
        this.b = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(rcr rcrVar, byte[] bArr, gt gtVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = rcrVar;
        this.c = bArr;
        this.a = gtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(reb rebVar, Context context, gj gjVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = rebVar;
        this.a = context;
        this.b = gjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(reb rebVar, xaz xazVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = rebVar;
        this.b = xazVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(reb rebVar, byte[] bArr, gj gjVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = rebVar;
        this.c = bArr;
        this.a = gjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(rur rurVar, ConversationIdType conversationIdType, qei qeiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = rurVar;
        this.c = conversationIdType;
        this.a = qeiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(rwt rwtVar, MessageCoreData messageCoreData, MessageIdType messageIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = rwtVar;
        this.a = messageCoreData;
        this.b = messageIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(tsl tslVar, qei qeiVar, alpu alpuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = tslVar;
        this.a = qeiVar;
        this.c = alpuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(wpp wppVar, amyn amynVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = wppVar;
        this.b = amynVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(wqu wquVar, MessageCoreData messageCoreData, ruz ruzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = wquVar;
        this.a = messageCoreData;
        this.b = ruzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(wyp wypVar, adiv adivVar, amwt amwtVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = wypVar;
        this.b = adivVar;
        this.c = amwtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(wyp wypVar, amlw amlwVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.a = wypVar;
        this.b = amlwVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmz(wyp wypVar, amlw amlwVar, String str, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.a = wypVar;
        this.b = amlwVar;
        this.c = str;
    }
}
