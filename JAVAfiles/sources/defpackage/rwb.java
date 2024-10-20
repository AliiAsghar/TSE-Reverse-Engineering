package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rwb implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rwb(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                syc sycVar = (syc) obj;
                xze xzeVar = rwd.a;
                sycVar.i((MessageIdType) this.a);
                sycVar.w(3);
                sycVar.M(1);
                return sycVar;
            case 1:
                syc sycVar2 = (syc) obj;
                xze xzeVar2 = rwd.a;
                sycVar2.f((ConversationIdType) this.a);
                sycVar2.A(false);
                return sycVar2;
            case 2:
                MessageCoreData a = ((tqx) ((rwd) this.a).e.b()).a();
                a.aI((MessagesTable.BindData) obj);
                return a;
            case 3:
                syc sycVar3 = (syc) obj;
                xze xzeVar3 = rwd.a;
                Object obj2 = this.a;
                ((agps) obj2).aj("updateAndReturnUpdatedMessages#update");
                Stream map = Collection.EL.stream(((sya) obj2).a().b()).map(new rvy(i));
                int i2 = alog.d;
                sycVar3.m((Iterable) map.collect(alls.a));
                return sycVar3;
            case 4:
                MessageCoreData a2 = ((tqx) ((rwd) this.a).e.b()).a();
                a2.aI((MessagesTable.BindData) obj);
                return a2;
            case 5:
                syc sycVar4 = (syc) obj;
                xze xzeVar4 = rwd.a;
                sycVar4.f((ConversationIdType) this.a);
                sycVar4.O(qkv.c);
                return sycVar4;
            case 6:
                tbu tbuVar = (tbu) obj;
                xze xzeVar5 = rwd.a;
                tbuVar.e((ConversationIdType) this.a);
                tbuVar.c("application/x-end-of-emergency-proto");
                return tbuVar;
            case 7:
                syc sycVar5 = (syc) obj;
                xze xzeVar6 = rwd.a;
                sycVar5.f((ConversationIdType) this.a);
                return sycVar5;
            case 8:
                tbu tbuVar2 = (tbu) obj;
                xze xzeVar7 = rwd.a;
                tbuVar2.i((MessageIdType) this.a);
                return tbuVar2;
            case 9:
                syc sycVar6 = (syc) obj;
                xze xzeVar8 = rwd.a;
                sycVar6.f((ConversationIdType) this.a);
                return sycVar6;
            case 10:
                syc sycVar7 = (syc) obj;
                xze xzeVar9 = rwd.a;
                sycVar7.f((ConversationIdType) this.a);
                sycVar7.Q(100, 115);
                return sycVar7;
            case 11:
                syc sycVar8 = (syc) obj;
                xze xzeVar10 = rwd.a;
                sycVar8.i((MessageIdType) this.a);
                return sycVar8;
            case 12:
                rry rryVar = (rry) ((rtn) obj);
                ((rvu) ((rwe) this.a).b.b()).a(rryVar);
                return rryVar;
            case 13:
                swj swjVar = (swj) obj;
                swjVar.b((MessageIdType) this.a);
                return swjVar;
            case 14:
                swj swjVar2 = (swj) obj;
                swjVar2.b((MessageIdType) this.a);
                return swjVar2;
            case 15:
                suh suhVar = (suh) obj;
                suhVar.U(new agmd("message_destinations.message_send_receive_attempt_id", 1, uzz.h((UUID) this.a)));
                return suhVar;
            case 16:
                sts stsVar = (sts) obj;
                stsVar.getClass();
                stsVar.U(new agmd("message_captions.message_id", 1, Long.valueOf(rvc.a((MessageIdType) this.a))));
                return stsVar;
            case 17:
                return ((rtb) ((rxc) this.a).a.b()).g((PartsTable.BindData) obj);
            case 18:
                tbu tbuVar3 = (tbu) obj;
                tbuVar3.f((String) this.a);
                return tbuVar3;
            case 19:
                tbu tbuVar4 = (tbu) obj;
                tbuVar4.i(this.a.B());
                return tbuVar4;
            default:
                return ((rtb) ((rxc) this.a).a.b()).g((PartsTable.BindData) obj);
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
