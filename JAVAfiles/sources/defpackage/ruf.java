package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ruf implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ruf(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, agpj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                tbd tbdVar = (tbd) obj;
                xze xzeVar = rul.a;
                tbdVar.h(r0.a());
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 2000) {
                    agnc.t("sim_slot_id", intValue);
                }
                tbdVar.U(new agoi("participants.sim_slot_id", 2, -1));
                return tbdVar;
            case 1:
                smo smoVar = (smo) obj;
                smoVar.d(Long.parseLong((String) this.a));
                return smoVar;
            case 2:
                sfo sfoVar = (sfo) obj;
                xze xzeVar2 = rul.a;
                sfoVar.b((ConversationIdType) this.a);
                return sfoVar;
            case 3:
                tbd tbdVar2 = (tbd) obj;
                xze xzeVar3 = rul.a;
                smm smmVar = new smm(smp.a);
                smmVar.d(new rsb(16));
                smmVar.e(new rsc(this.a, 9));
                tbdVar2.i(smmVar.b());
                return tbdVar2;
            case 4:
                tbd tbdVar3 = (tbd) obj;
                xze xzeVar4 = rul.a;
                sla a = sld.a();
                a.d(new rub(20));
                a.f(new ruf(this.a, 6));
                tbdVar3.i(a.b());
                return tbdVar3;
            case 5:
                tbd tbdVar4 = (tbd) obj;
                xze xzeVar5 = rul.a;
                tbdVar4.r(-2);
                tbdVar4.m(this.a);
                return tbdVar4;
            case 6:
                slc slcVar = (slc) obj;
                xze xzeVar6 = rul.a;
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 7:
                slc slcVar2 = (slc) obj;
                slcVar2.d(Long.parseLong((String) this.a));
                return slcVar2;
            case 8:
                snh snhVar = (snh) obj;
                xze xzeVar7 = rul.a;
                snhVar.u((String) this.a);
                return snhVar;
            case 9:
                snh snhVar2 = (snh) obj;
                xze xzeVar8 = rul.a;
                snhVar2.y((xhv) this.a);
                return snhVar2;
            case 10:
                smo smoVar2 = (smo) obj;
                xze xzeVar9 = rul.a;
                smoVar2.U(new agme("conversation_to_participants.conversation_id", 3, this.a));
                return smoVar2;
            case 11:
                tbd tbdVar5 = (tbd) obj;
                xze xzeVar10 = rul.a;
                tbdVar5.i(this.a);
                return tbdVar5;
            case 12:
                slc slcVar3 = (slc) obj;
                xze xzeVar11 = rul.a;
                slcVar3.U(new agme("conversation_participants.conversation_id", 3, this.a));
                return slcVar3;
            case 13:
                tbd tbdVar6 = (tbd) obj;
                xze xzeVar12 = rul.a;
                tbdVar6.i(this.a);
                return tbdVar6;
            case 14:
                sbr sbrVar = (sbr) obj;
                xze xzeVar13 = rul.a;
                sbrVar.b((ConversationIdType) this.a);
                return sbrVar;
            case 15:
                sfo sfoVar2 = (sfo) obj;
                xze xzeVar14 = rul.a;
                sfoVar2.b((ConversationIdType) this.a);
                return sfoVar2;
            case 16:
                xze xzeVar15 = rul.a;
                return ((qqq) this.a).a((String) obj).b;
            case 17:
                return ((psq) this.a).c((String) obj);
            case 18:
                syc sycVar = (syc) obj;
                sycVar.f((ConversationIdType) this.a);
                return sycVar;
            case 19:
                tbu tbuVar = (tbu) obj;
                tbuVar.e((ConversationIdType) this.a);
                return tbuVar;
            default:
                snh snhVar3 = (snh) obj;
                snhVar3.j((ConversationIdType) this.a);
                return snhVar3;
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
