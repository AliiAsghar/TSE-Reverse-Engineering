package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbp implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rbp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v99, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        veq O;
        ver a;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        switch (this.c) {
            case 0:
                return ((vbm) ((ProcessConversationUpdateAsyncAction) this.a).g.b()).b((rto) obj, (alog) this.b);
            case 1:
                trm trmVar = (trm) obj;
                aqfn aqfnVar = trmVar.a;
                String str = trmVar.b;
                ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction = (ProcessConversationUpdateAsyncAction) this.a;
                boolean z = ((lpg) processConversationUpdateAsyncAction.j.b()).z();
                Object obj2 = this.b;
                if (z) {
                    O = processConversationUpdateAsyncAction.n.P(trmVar.e);
                    O.b = str;
                    aozy createBuilder = angd.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    angd angdVar = (angd) createBuilder.b;
                    obj2.getClass();
                    angdVar.c = obj2;
                    angdVar.b = 2;
                    O.b(createBuilder.s());
                } else {
                    O = processConversationUpdateAsyncAction.n.O(aqfnVar, Optional.empty());
                    O.b = str;
                    aozy createBuilder2 = angd.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    angd angdVar2 = (angd) createBuilder2.b;
                    obj2.getClass();
                    angdVar2.c = obj2;
                    angdVar2.b = 2;
                    O.b(createBuilder2.s());
                }
                if (processConversationUpdateAsyncAction.u.z("send_push_key", false)) {
                    O.e = aqdq.USER;
                    Iterator<E> it = ((anfu) obj2).b.iterator();
                    if (it.hasNext() && ((anfr) it.next()).h) {
                        O.e = aqdq.STATUS;
                    }
                }
                ver a2 = O.a();
                if (((Optional) ((apxx) processConversationUpdateAsyncAction.h).a).isEmpty()) {
                    return aktp.af(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                }
                akul a3 = ((vgz) ((Optional) ((apxx) processConversationUpdateAsyncAction.h).a).get()).a();
                a2.l(a3);
                return a3;
            case 2:
                return ((vbm) ((ProcessConversationUpdateAsyncAction) this.a).g.b()).d((rto) obj, (alog) this.b);
            case 3:
                trm trmVar2 = (trm) obj;
                aqfn aqfnVar2 = trmVar2.a;
                String str2 = trmVar2.b;
                ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction = (ProcessMessageUpdateAsyncAction) this.a;
                boolean z2 = ((lpg) processMessageUpdateAsyncAction.l.b()).z();
                Object obj3 = this.b;
                if (z2) {
                    veq P = processMessageUpdateAsyncAction.o.P(trmVar2.e);
                    P.b = str2;
                    aozy createBuilder3 = angd.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    angd angdVar3 = (angd) createBuilder3.b;
                    angn angnVar = (angn) ((aozy) obj3).s();
                    angnVar.getClass();
                    angdVar3.c = angnVar;
                    angdVar3.b = 3;
                    P.b(createBuilder3.s());
                    a = P.a();
                } else {
                    veq O2 = processMessageUpdateAsyncAction.o.O(aqfnVar2, Optional.empty());
                    O2.b = str2;
                    aozy createBuilder4 = angd.a.createBuilder();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    angd angdVar4 = (angd) createBuilder4.b;
                    angn angnVar2 = (angn) ((aozy) obj3).s();
                    angnVar2.getClass();
                    angdVar4.c = angnVar2;
                    angdVar4.b = 3;
                    O2.b(createBuilder4.s());
                    a = O2.a();
                }
                if (((Optional) ((apxx) processMessageUpdateAsyncAction.f).a).isEmpty()) {
                    return aktp.af(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                }
                akul a4 = ((vgz) ((Optional) ((apxx) processMessageUpdateAsyncAction.f).a).get()).a();
                a.l(a4);
                return a4;
            case 4:
                trm trmVar3 = (trm) obj;
                return ((ProcessUserAlertAsyncAction) this.a).h(trmVar3.a, trmVar3.b, (anhe) this.b, Optional.of(trmVar3));
            case 5:
                qwm qwmVar = (qwm) obj;
                int e = qwmVar.e();
                Optional e2 = ((adji) ((UpdateConversationEncryptionStatusAction) this.a).c.b()).e(e);
                if (e2.isEmpty()) {
                    Object obj4 = this.b;
                    xyo c = UpdateConversationEncryptionStatusAction.a.c();
                    c.H("Self identity is not RCS enabled, skipping conversation e2ee status update");
                    c.b((ConversationIdType) obj4);
                    c.l(e);
                    c.L("subscriptionName", qwmVar.h());
                    c.q();
                }
                return e2;
            case 6:
                return ((zfh) obj).k(((qwm) this.a).e(), this.b.z());
            case 7:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                ?? r0 = this.b;
                Object obj5 = this.a;
                if (r0.ci()) {
                    return ((rjq) obj5).b.q(bindData);
                }
                return ((rjq) obj5).b.s(bindData);
            case 8:
                slc slcVar = (slc) obj;
                xze xzeVar = rul.a;
                slcVar.e(this.b);
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 9:
                smo smoVar = (smo) obj;
                xze xzeVar2 = rul.a;
                smoVar.e(this.b);
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 10:
                slc slcVar2 = (slc) obj;
                slcVar2.d(Long.parseLong((String) this.b));
                slcVar2.b((ConversationIdType) this.a);
                return slcVar2;
            case 11:
                smo smoVar2 = (smo) obj;
                smoVar2.d(Long.parseLong((String) this.b));
                smoVar2.b((ConversationIdType) this.a);
                return smoVar2;
            case 12:
                Object obj6 = this.b;
                sbm sbmVar = (sbm) obj;
                xze xzeVar3 = rul.a;
                sbmVar.b((ConversationIdType) obj6);
                qfe[] qfeVarArr = {qfe.JOINED, qfe.UNKNOWN_STATE};
                valueOf = Integer.valueOf(d.P().W().c());
                int intValue = valueOf.intValue();
                if (intValue < 58570) {
                    agnc.t("rcs_group_join_status", intValue);
                }
                Object obj7 = this.a;
                sbmVar.U(new agmf("conversation_participants.rcs_group_join_status", 3, sbm.X((Iterable) DesugarArrays.stream(qfeVarArr).map(new sal(9)).collect(Collectors.toCollection(new sbg(4)))), true));
                sbmVar.U(new agoi("conversation_participants.participant_id", 2, Long.valueOf(Long.parseLong(((SelfIdentityIdImpl) obj7).a))));
                return sbmVar;
            case 13:
                snh snhVar = (snh) obj;
                snhVar.f(lga.Y(this.a));
                snhVar.j((ConversationIdType) this.b);
                return snhVar;
            case 14:
                smo smoVar3 = (smo) obj;
                Object obj8 = this.b;
                xze xzeVar4 = rul.a;
                smoVar3.b((ConversationIdType) this.a);
                smoVar3.d(Long.parseLong((String) obj8));
                return smoVar3;
            case 15:
                slc slcVar3 = (slc) obj;
                Object obj9 = this.b;
                xze xzeVar5 = rul.a;
                slcVar3.b((ConversationIdType) this.a);
                slcVar3.d(Long.parseLong((String) obj9));
                return slcVar3;
            case 16:
                Object obj10 = this.a;
                syc sycVar = (syc) obj;
                xze xzeVar6 = rwd.a;
                sycVar.f((ConversationIdType) obj10);
                sycVar.w(3);
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 48030) {
                    agnc.t("original_message_id", intValue2);
                }
                sycVar.U(new agmd("messages.original_message_id", 1, Long.valueOf(rvc.a((MessageIdType) this.b))));
                return sycVar;
            case 17:
                syc sycVar2 = (syc) obj;
                xze xzeVar7 = rwd.a;
                sycVar2.b(new ruw(this.b, 19), new ruw(this.a, 20));
                return sycVar2;
            case 18:
                sck sckVar = (sck) obj;
                sckVar.W(new agpl(((StringBuilder) this.b).toString()));
                long epochMilli = ((ryq) this.a).c.f().toEpochMilli() - ((Long) ryq.a.e()).longValue();
                valueOf3 = Integer.valueOf(d.P().W().c());
                int intValue3 = valueOf3.intValue();
                if (intValue3 < 3010) {
                    agnc.t("timestamp", intValue3);
                }
                sckVar.U(new agoi("parts.timestamp", 7, Long.valueOf(epochMilli)));
                return sckVar;
            case 19:
                sju sjuVar = (sju) obj;
                sjuVar.U(new agme("conversation_classifications_table.conversation_id", 1, this.a));
                sjuVar.c(qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                sjuVar.b(qhx.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
                sjuVar.e((String) this.b);
                return sjuVar;
            default:
                spm spmVar = (spm) obj;
                Object obj11 = this.a;
                aozy builder = ((apag) obj11).toBuilder();
                qeq qeqVar = (qeq) obj11;
                qep qepVar = qeqVar.c;
                if (qepVar == null) {
                    qepVar = qep.a;
                }
                Object obj12 = this.b;
                spmVar.ao(14, "plaintext_attachment_name");
                String str3 = spmVar.o;
                spmVar.ao(15, "plaintext_attachment_content_type");
                ttn ttnVar = (ttn) obj12;
                qep a5 = ttnVar.a(qepVar, str3, spmVar.p);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                qeq qeqVar2 = (qeq) builder.b;
                a5.getClass();
                qeqVar2.c = a5;
                qeqVar2.b |= 1;
                if ((qeqVar.b & 2) != 0) {
                    qep qepVar2 = qeqVar.d;
                    if (qepVar2 == null) {
                        qepVar2 = qep.a;
                    }
                    spmVar.ao(16, "plaintext_thumbnail_content_type");
                    qep a6 = ttnVar.a(qepVar2, null, spmVar.q);
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    qeq qeqVar3 = (qeq) builder.b;
                    a6.getClass();
                    qeqVar3.d = a6;
                    qeqVar3.b |= 2;
                }
                return (qeq) builder.s();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ rbp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
