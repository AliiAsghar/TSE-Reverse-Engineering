package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rpf implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rpf(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v32, types: [wfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, agpj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                sfy sfyVar = (sfy) obj;
                sfyVar.e(((rpo) this.a).b);
                return sfyVar;
            case 1:
                sfy sfyVar2 = (sfy) obj;
                sfyVar2.e(((rpo) this.a).b);
                return sfyVar2;
            case 2:
                sfy sfyVar3 = (sfy) obj;
                rpo rpoVar = rpk.a;
                sfyVar3.f((String) this.a);
                sfyVar3.c(0L);
                return sfyVar3;
            case 3:
                sfy sfyVar4 = (sfy) obj;
                rpo rpoVar2 = rpk.a;
                sfyVar4.f(((rpo) this.a).a);
                return sfyVar4;
            case 4:
                sfy sfyVar5 = (sfy) obj;
                rpo rpoVar3 = rpk.a;
                sfyVar5.f(((rpo) this.a).a);
                sfyVar5.c(1L);
                return sfyVar5;
            case 5:
                sfy sfyVar6 = (sfy) obj;
                sfyVar6.c(1L);
                sfyVar6.f(((rpm) this.a).a.d());
                return sfyVar6;
            case 6:
                sfy sfyVar7 = (sfy) obj;
                sfyVar7.c(0L);
                sfyVar7.f(((rpm) this.a).a.d());
                return sfyVar7;
            case 7:
                sfy sfyVar8 = (sfy) obj;
                sfyVar8.c(1L);
                sfyVar8.f(((rpm) this.a).a.d());
                return sfyVar8;
            case 8:
                tjh tjhVar = (tjh) obj;
                Object obj2 = this.a;
                obj2.getClass();
                tjhVar.b((tjj) obj2);
                return tjhVar;
            case 9:
                return this.a.d(((Integer) obj).intValue());
            case 10:
                Object obj3 = this.a;
                return ((msk) ((rru) obj3).a.b()).t(albo.ag((String) obj), ((rto) obj3).H());
            case 11:
                tbd tbdVar = (tbd) obj;
                tbdVar.h(albo.ag(lga.Y(((rry) this.a).s())));
                return tbdVar;
            case 12:
                sbh sbhVar = (sbh) obj;
                sbhVar.e(this.a);
                sbhVar.U(new agoi("messages.seen", 1, 0));
                return sbhVar;
            case 13:
                sbh sbhVar2 = (sbh) obj;
                sbhVar2.b((MessageIdType) this.a);
                return sbhVar2;
            case 14:
                sbh sbhVar3 = (sbh) obj;
                sbhVar3.U(new agmd("conversations._id", 1, Long.valueOf(ruy.a((ConversationIdType) this.a))));
                return sbhVar3;
            case 15:
                String str = (String) obj;
                if (qta.r()) {
                    return str;
                }
                return ((rrz) this.a).a.z(str);
            case 16:
                slc slcVar = (slc) obj;
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 17:
                smo smoVar = (smo) obj;
                smoVar.U(new agme("conversation_to_participants.participant_id", 4, this.a));
                return smoVar;
            case 18:
                smo smoVar2 = (smo) obj;
                smoVar2.b((ConversationIdType) this.a);
                return smoVar2;
            case 19:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.i(this.a);
                return tbdVar2;
            default:
                tbd tbdVar3 = (tbd) obj;
                tbdVar3.i(this.a);
                return tbdVar3;
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
