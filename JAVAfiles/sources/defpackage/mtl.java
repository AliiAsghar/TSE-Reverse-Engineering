package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mtl implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mtl(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [pna, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                syc sycVar = (syc) obj;
                sycVar.l(this.a);
                return sycVar;
            case 1:
                syc sycVar2 = (syc) obj;
                akip.c(sycVar2, (BugleConversationId) this.a);
                return sycVar2;
            case 2:
                syc sycVar3 = (syc) obj;
                sycVar3.f(((BugleConversationId) this.a).a);
                sycVar3.A(true);
                return sycVar3;
            case 3:
                syc sycVar4 = (syc) obj;
                sycVar4.getClass();
                akip.c(sycVar4, (BugleConversationId) ((adlx) this.a).f);
                return sycVar4;
            case 4:
                syc sycVar5 = (syc) obj;
                sycVar5.i((MessageIdType) this.a);
                return sycVar5;
            case 5:
                return new CoreBugleMessageId((MessageIdType) this.a, Long.parseLong(((PartsTable.BindData) obj).z()));
            case 6:
                tbu tbuVar = (tbu) obj;
                ?? r0 = this.a;
                if (!mui.F(r0).equals("-1")) {
                    tbuVar.i(mui.B(r0));
                    tbuVar.f(mui.F(r0));
                } else {
                    tbuVar.i(mui.B(r0));
                }
                return tbuVar;
            case 7:
                return ((mjf) obj).a(this.a);
            case 8:
                sxo sxoVar = (sxo) obj;
                int i = muw.f;
                if (this.a.a()) {
                    return new sxp[]{sxoVar.a, sxoVar.n, sxoVar.k, sxoVar.G, sxoVar.b};
                }
                return new sxp[]{sxoVar.a, sxoVar.n, sxoVar.k, sxoVar.b};
            case 9:
                int i2 = muw.f;
                return ((mjf) obj).a(this.a);
            case 10:
                int i3 = muw.f;
                return ((mjf) obj).a(this.a);
            case 11:
                arqv arqvVar = mvg.a.e;
                mts mtsVar = (mts) this.a;
                Object a = arqvVar.a((syc) obj, Long.valueOf(mtsVar.a));
                ((agpx) a).U(new agoi("messages._id", 9, Long.valueOf(mtsVar.b)));
                return a;
            case 12:
                return mvg.a.d.a((syc) obj, Long.valueOf(((mts) this.a).a));
            case 13:
                arqv arqvVar2 = mvg.a.e;
                mts mtsVar2 = (mts) this.a;
                Object a2 = arqvVar2.a((syc) obj, Long.valueOf(mtsVar2.a));
                ((syc) a2).n(mtsVar2.b);
                return a2;
            case 14:
                arqv arqvVar3 = mvg.a.e;
                mts mtsVar3 = (mts) this.a;
                Object a3 = arqvVar3.a((syc) obj, Long.valueOf(mtsVar3.a));
                ((syc) a3).i(new MessageIdType(mtsVar3.b));
                ((agpx) a3).W(new agpk("$V{J:parts} <= $V", new Object[]{PartsTable.d.a, Long.valueOf(mtsVar3.c)}));
                return a3;
            case 15:
                return mvg.a.d.a((syc) obj, Long.valueOf(((mts) this.a).a));
            case 16:
                arqv arqvVar4 = mvg.a.e;
                mts mtsVar4 = (mts) this.a;
                Object a4 = arqvVar4.a((syc) obj, Long.valueOf(mtsVar4.a));
                ((agpx) a4).U(new agoi("messages._id", 10, Long.valueOf(mtsVar4.b)));
                return a4;
            case 17:
                return mvg.a.f.a((syc) obj, Long.valueOf(((mts) this.a).a));
            case 18:
                arqv arqvVar5 = mvg.a.e;
                mts mtsVar5 = (mts) this.a;
                Object a5 = arqvVar5.a((syc) obj, Long.valueOf(mtsVar5.a));
                ((syc) a5).k(mtsVar5.b);
                return a5;
            case 19:
                arqv arqvVar6 = mvg.a.e;
                mts mtsVar6 = (mts) this.a;
                Object a6 = arqvVar6.a((syc) obj, Long.valueOf(mtsVar6.a));
                ((syc) a6).i(new MessageIdType(mtsVar6.b));
                ((agpx) a6).W(new agpk("$V{J:parts} >= $V", new Object[]{PartsTable.d.a, Long.valueOf(mtsVar6.c)}));
                return a6;
            default:
                return mvg.a.f.a((syc) obj, Long.valueOf(((mts) this.a).a));
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
