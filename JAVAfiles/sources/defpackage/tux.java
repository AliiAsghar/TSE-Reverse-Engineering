package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tux implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ tux(Object obj, Object obj2, int i) {
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.c) {
            case 0:
                tce tceVar = (tce) obj;
                tceVar.f(tva.a((qei) this.a, (String) this.b));
                tceVar.c(tqn.WAITING_IDENTITY_VERIFICATION, tqn.WAITING_PRIOR_MESSAGE);
                return tceVar;
            case 1:
                tce tceVar2 = (tce) obj;
                tceVar2.f(tva.a((qei) this.a, (String) this.b));
                tceVar2.b(tqn.WAITING_IDENTITY_VERIFICATION);
                return tceVar2;
            case 2:
                tce tceVar3 = (tce) obj;
                tceVar3.f(tva.a((qei) this.a, (String) this.b));
                tceVar3.b(tqn.WAITING_IDENTITY_VERIFICATION);
                return tceVar3;
            case 3:
                tce tceVar4 = (tce) obj;
                tceVar4.f(tva.a((qei) this.a, (String) this.b));
                tceVar4.c(tqn.WAITING_PRIOR_MESSAGE, tqn.WAITING_IDENTITY_VERIFICATION);
                return tceVar4;
            case 4:
                tce tceVar5 = (tce) obj;
                tceVar5.f(tvb.j((String) this.b, (qei) this.a));
                return tceVar5;
            case 5:
                syc sycVar = (syc) obj;
                alog alogVar = tyo.a;
                sycVar.f((ConversationIdType) this.a);
                sycVar.w(3);
                sycVar.O(this.b);
                sycVar.y(2);
                return sycVar;
            case 6:
                tez tezVar = (tez) obj;
                tezVar.b((MessageIdType) this.a);
                tezVar.c(Long.parseLong((String) this.b));
                return tezVar;
            case 7:
                tbu tbuVar = (tbu) obj;
                tbuVar.k((Uri) this.a);
                tbuVar.n((Uri) this.b);
                return tbuVar;
            case 8:
                tbu tbuVar2 = (tbu) obj;
                tbuVar2.k((Uri) this.a);
                tbuVar2.n((Uri) this.b);
                return tbuVar2;
            case 9:
                tbu tbuVar3 = (tbu) obj;
                tbuVar3.i((MessageIdType) this.a);
                tbuVar3.n(Uri.parse((String) this.b));
                return tbuVar3;
            case 10:
                tbu tbuVar4 = (tbu) obj;
                alvi alviVar = ulw.a;
                tbuVar4.e((ConversationIdType) this.a);
                tbuVar4.p();
                tbuVar4.j(this.b);
                return tbuVar4;
            case 11:
                uqa uqaVar = (uqa) obj;
                uqaVar.d((String) this.b);
                Date date = new Date(((urr) this.a).i.f().toEpochMilli());
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 46070) {
                    agnc.t("minimum_start_time", intValue);
                }
                uqaVar.U(new agmd("work_queue.minimum_start_time", 10, Long.valueOf(rva.a(date))));
                return uqaVar;
            case 12:
                sqo sqoVar = (sqo) obj;
                sqoVar.b((MessageIdType) this.a);
                sqoVar.d((tqg) this.b);
                return sqoVar;
            case 13:
                sqo sqoVar2 = (sqo) obj;
                sqoVar2.b((MessageIdType) this.a);
                sqoVar2.d((tqg) this.b);
                return sqoVar2;
            case 14:
                sqo sqoVar3 = (sqo) obj;
                sqoVar3.c(this.b);
                sqoVar3.d((tqg) this.a);
                return sqoVar3;
            default:
                sqo sqoVar4 = (sqo) obj;
                sqoVar4.c(this.b);
                sqoVar4.d((tqg) this.a);
                return sqoVar4;
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ tux(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
