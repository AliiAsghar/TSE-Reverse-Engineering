package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rsc implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rsc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mre, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                tbd tbdVar = (tbd) obj;
                tbdVar.i(this.a);
                return tbdVar;
            case 1:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.i(this.a);
                return tbdVar2;
            case 2:
                syc sycVar = (syc) obj;
                int i = rsj.b;
                sycVar.i(((lua) this.a).b);
                return sycVar;
            case 3:
                return this.a.b((qei) obj);
            case 4:
                String str = (String) obj;
                Object obj2 = this.a;
                try {
                    return Optional.of(((psq) ((MessageData) obj2).h.b()).c(str));
                } catch (psr e) {
                    alwl alwlVar = (alwl) ((alwl) MessageData.a.i()).g(e);
                    alwlVar.X(ydl.a, ((MessageData) obj2).j.a.a());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "getReceivingMsisdnMessagingIdentityInternal", 2333, "MessageData.java")).q("Failed to retrieve the receiving rcs msisdn");
                    return Optional.empty();
                }
            case 5:
                syc sycVar2 = (syc) obj;
                smv[] smvVarArr = rtk.a;
                sycVar2.i((MessageIdType) this.a);
                return sycVar2;
            case 6:
                syc sycVar3 = (syc) obj;
                smv[] smvVarArr2 = rtk.a;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 59340) {
                    agnc.t("msisdn_receiving_rcs_message", intValue);
                }
                sycVar3.U(new agmf("messages.msisdn_receiving_rcs_message", 3, syc.X(this.a), false));
                return sycVar3;
            case 7:
                syc sycVar4 = (syc) obj;
                smv[] smvVarArr3 = rtk.a;
                sycVar4.G(this.a);
                return sycVar4;
            case 8:
                syc sycVar5 = (syc) obj;
                smv[] smvVarArr4 = rtk.a;
                sycVar5.f((ConversationIdType) this.a);
                return sycVar5;
            case 9:
                smo smoVar = (smo) obj;
                xze xzeVar = rul.a;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 10:
                snh snhVar = (snh) obj;
                xze xzeVar2 = rul.a;
                snhVar.l(this.a);
                return snhVar;
            case 11:
                smo smoVar2 = (smo) obj;
                smoVar2.d(Long.parseLong((String) this.a));
                return smoVar2;
            case 12:
                slc slcVar = (slc) obj;
                slcVar.d(Long.parseLong((String) this.a));
                return slcVar;
            case 13:
                sbm sbmVar = (sbm) obj;
                xze xzeVar3 = rul.a;
                sbmVar.b((ConversationIdType) this.a);
                return sbmVar;
            case 14:
                sbr sbrVar = (sbr) obj;
                xze xzeVar4 = rul.a;
                sbrVar.b((ConversationIdType) this.a);
                sbrVar.U(new agmf("conversation_to_participants.rcs_group_join_status", 3, sbr.X((Iterable) DesugarArrays.stream(new qfe[]{qfe.JOINED, qfe.UNKNOWN_STATE}).map(new sal(10)).collect(Collectors.toCollection(new sbg(7)))), true));
                return sbrVar;
            case 15:
                tbd tbdVar3 = (tbd) obj;
                xze xzeVar5 = rul.a;
                tbdVar3.r(-2);
                tbdVar3.m(this.a);
                return tbdVar3;
            case 16:
                xze xzeVar6 = rul.a;
                return ((qqq) this.a).a((String) obj).b;
            case 17:
                snh snhVar2 = (snh) obj;
                xze xzeVar7 = rul.a;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 18:
                snh snhVar3 = (snh) obj;
                xze xzeVar8 = rul.a;
                snhVar3.j((ConversationIdType) this.a);
                return snhVar3;
            case 19:
                tdm tdmVar = (tdm) obj;
                tdmVar.U(new agoi("profiles_table.participant_id", 1, Long.valueOf(Long.parseLong((String) this.a))));
                return tdmVar;
            default:
                return ((msk) ((rul) this.a).i.b()).s((ParticipantsTable.BindData) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
}
