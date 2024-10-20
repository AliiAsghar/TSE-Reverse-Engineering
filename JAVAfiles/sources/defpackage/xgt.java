package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarDate;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xgt implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xgt(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        switch (this.b) {
            case 0:
                tbu tbuVar = (tbu) obj;
                alvi alviVar = xgw.a;
                tbuVar.i(this.a.B());
                return tbuVar;
            case 1:
                syc sycVar = (syc) obj;
                alvi alviVar2 = xgw.a;
                sycVar.f(((sna) this.a).C());
                return sycVar;
            case 2:
                tbu tbuVar2 = (tbu) obj;
                alvi alviVar3 = xgw.a;
                tbuVar2.i(this.a.B());
                return tbuVar2;
            case 3:
                tbu tbuVar3 = (tbu) obj;
                alvi alviVar4 = xgw.a;
                tbuVar3.f(this.a.Z());
                return tbuVar3;
            case 4:
                tbu tbuVar4 = (tbu) obj;
                alvi alviVar5 = xgw.a;
                tbuVar4.f(this.a.Z());
                return tbuVar4;
            case 5:
                syc sycVar2 = (syc) obj;
                alvi alviVar6 = xgw.a;
                sycVar2.i(((sxt) this.a).E());
                return sycVar2;
            case 6:
                tbu tbuVar5 = (tbu) obj;
                alvi alviVar7 = xgw.a;
                tbuVar5.i(this.a.B());
                return tbuVar5;
            case 7:
                syc sycVar3 = (syc) obj;
                alvi alviVar8 = xgw.a;
                sycVar3.i(((sxt) this.a).E());
                return sycVar3;
            case 8:
                tbu tbuVar6 = (tbu) obj;
                alvi alviVar9 = xgw.a;
                tbuVar6.i(((sxt) this.a).E());
                return tbuVar6;
            case 9:
                uqa uqaVar = (uqa) obj;
                String[] strArr = {"ReverseTelephonySync-", "IncrementalReverseSyncWorkItemHandler-"};
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 41030) {
                    agnc.t("queue", intValue);
                }
                Object obj2 = this.a;
                uqaVar.U(new agmf("work_queue.queue", 3, uqa.Z(strArr), false));
                Date from = DesugarDate.from(((xhd) obj2).d.f());
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 46070) {
                    agnc.t("minimum_start_time", intValue2);
                }
                uqaVar.U(new agmd("work_queue.minimum_start_time", 8, Long.valueOf(rva.a(from))));
                return uqaVar;
            case 10:
                tbu tbuVar7 = (tbu) obj;
                xze xzeVar = xiu.a;
                tbuVar7.i(((wyc) this.a).d);
                return tbuVar7;
            case 11:
                syc sycVar4 = (syc) obj;
                sycVar4.W(new agpl((String) this.a));
                return sycVar4;
            case 12:
                syc sycVar5 = (syc) obj;
                sycVar5.W(new agpl((String) this.a));
                return sycVar5;
            case 13:
                aozy aozyVar = (aozy) obj;
                utz utzVar = xjc.a;
                aozyVar.aM(this.a);
                return aozyVar;
            case 14:
                tbu tbuVar8 = (tbu) obj;
                xze xzeVar2 = xng.a;
                tbuVar8.f((String) this.a);
                return tbuVar8;
            case 15:
                tbu tbuVar9 = (tbu) obj;
                xze xzeVar3 = xng.a;
                tbuVar9.g(((alob) this.a).g());
                return tbuVar9;
            case 16:
                tbu tbuVar10 = (tbu) obj;
                xze xzeVar4 = xng.a;
                tbuVar10.f(((tbn) this.a).Q());
                return tbuVar10;
            case 17:
                tbu tbuVar11 = (tbu) obj;
                int i = xnh.a;
                Object obj3 = this.a;
                tbuVar11.e((ConversationIdType) obj3);
                sxy d = MessagesTable.d();
                int i2 = 18;
                d.e(new xgv(i2));
                d.g(new xgt(obj3, i2));
                tbuVar11.j(d.b());
                return tbuVar11;
            case 18:
                syc sycVar6 = (syc) obj;
                int i3 = xnh.a;
                sycVar6.f((ConversationIdType) this.a);
                return sycVar6;
            case 19:
                xpe xpeVar = (xpe) obj;
                alwo alwoVar = xoi.a;
                xpeVar.c((String) this.a);
                return xpeVar;
            default:
                xpe xpeVar2 = (xpe) obj;
                alwo alwoVar2 = xom.a;
                xpeVar2.c((String) this.a);
                return xpeVar2;
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
