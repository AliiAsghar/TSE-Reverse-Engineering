package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.MonthDay;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldg implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldg(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                lcy lcyVar = (lcy) obj;
                lcyVar.W(lga.u(((lcq) this.a).c));
                return lcyVar;
            case 1:
                lcy lcyVar2 = (lcy) obj;
                Object obj2 = this.a;
                lcyVar2.b(new ldg(obj2, i2), new ldg(obj2, i), new ldg(obj2, 3));
                return lcyVar2;
            case 2:
                lcq lcqVar = (lcq) this.a;
                lcy lcyVar3 = (lcy) obj;
                lcyVar3.W(lga.t(lcqVar.c));
                lcyVar3.o(lcqVar.a);
                return lcyVar3;
            case 3:
                lcq lcqVar2 = (lcq) this.a;
                lcy lcyVar4 = (lcy) obj;
                lcyVar4.W(lga.t(lcqVar2.c));
                lcyVar4.n(lcqVar2.a);
                lcyVar4.h(lcqVar2.b.a);
                return lcyVar4;
            case 4:
                lcy lcyVar5 = (lcy) obj;
                lcyVar5.o(((lcq) this.a).a);
                return lcyVar5;
            case 5:
                lcq lcqVar3 = (lcq) this.a;
                lcy lcyVar6 = (lcy) obj;
                lcyVar6.n(lcqVar3.a);
                lcyVar6.h(lcqVar3.b.a);
                return lcyVar6;
            case 6:
                lcy lcyVar7 = (lcy) obj;
                lcyVar7.W(lga.u(((lcq) this.a).c));
                return lcyVar7;
            case 7:
                lcy lcyVar8 = (lcy) obj;
                lcyVar8.W(lga.v(((lcq) this.a).c));
                return lcyVar8;
            case 8:
                lcq lcqVar4 = (lcq) this.a;
                lcy lcyVar9 = (lcy) obj;
                lcyVar9.W(lga.t(lcqVar4.c));
                lcyVar9.q(lcqVar4.a);
                return lcyVar9;
            case 9:
                lcy lcyVar10 = (lcy) obj;
                lcyVar10.p(((lcq) this.a).a);
                return lcyVar10;
            case 10:
                lcq lcqVar5 = (lcq) this.a;
                lcy lcyVar11 = (lcy) obj;
                lcyVar11.n(lcqVar5.a);
                lcyVar11.j(lcqVar5.b.a);
                return lcyVar11;
            case 11:
                lcy lcyVar12 = (lcy) obj;
                Object obj3 = this.a;
                lcyVar12.b(new ldg(obj3, 9), new ldg(obj3, 10));
                return lcyVar12;
            case 12:
                lcy lcyVar13 = (lcy) obj;
                lcyVar13.W(lga.v(((lcq) this.a).c));
                return lcyVar13;
            case 13:
                lcy lcyVar14 = (lcy) obj;
                Object obj4 = this.a;
                lcyVar14.b(new ldg(obj4, 7), new ldg(obj4, 8));
                return lcyVar14;
            case 14:
                sco scoVar = (sco) obj;
                scoVar.b((ConversationIdType) this.a);
                return scoVar;
            case 15:
                sju sjuVar = (sju) obj;
                sjuVar.c(qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                alob alobVar = new alob();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
                }
                sjuVar.U(new agmf("conversation_classifications_table.conversation_id", 4, sju.X(alobVar.g()), true));
                return sjuVar;
            case 16:
                sju sjuVar2 = (sju) obj;
                sjuVar2.d((ConversationIdType) this.a);
                sjuVar2.c(qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                return sjuVar2;
            case 17:
                sju sjuVar3 = (sju) obj;
                sjuVar3.c(qhy.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                sjuVar3.e(((MonthDay) this.a).toString());
                return sjuVar3;
            case 18:
                return this.a.a(obj);
            case 19:
                return ((lse) this.a).a((adpo) obj);
            default:
                tbu tbuVar = (tbu) obj;
                tbuVar.getClass();
                tbuVar.f(String.valueOf(((sfr) this.a).h()));
                return tbuVar;
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
