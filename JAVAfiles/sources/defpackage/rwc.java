package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rwc implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rwc(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        int i = 0;
        switch (this.a) {
            case 0:
                xze xzeVar = rwd.a;
                return new tbi[]{((tbh) obj).b};
            case 1:
                return ((MessageCoreData) obj).B();
            case 2:
                sxo sxoVar = (sxo) obj;
                xze xzeVar2 = rwd.a;
                return new sxp[]{sxoVar.a, sxoVar.i, sxoVar.j};
            case 3:
                xze xzeVar3 = rwd.a;
                return ((sxo) obj).a;
            case 4:
                syc sycVar = (syc) obj;
                xze xzeVar4 = rwd.a;
                sycVar.R();
                return sycVar;
            case 5:
                syc sycVar2 = (syc) obj;
                xze xzeVar5 = rwd.a;
                sycVar2.N();
                return sycVar2;
            case 6:
                syc sycVar3 = (syc) obj;
                xze xzeVar6 = rwd.a;
                sycVar3.O(qkv.a);
                return sycVar3;
            case 7:
                syc sycVar4 = (syc) obj;
                xze xzeVar7 = rwd.a;
                sycVar4.M(242);
                return sycVar4;
            case 8:
                syc sycVar5 = (syc) obj;
                xze xzeVar8 = rwd.a;
                sycVar5.R();
                return sycVar5;
            case 9:
                syc sycVar6 = (syc) obj;
                xze xzeVar9 = rwd.a;
                sycVar6.N();
                return sycVar6;
            case 10:
                syc sycVar7 = (syc) obj;
                xze xzeVar10 = rwd.a;
                sycVar7.O(qkv.a);
                return sycVar7;
            case 11:
                syc sycVar8 = (syc) obj;
                xze xzeVar11 = rwd.a;
                sycVar8.R();
                return sycVar8;
            case 12:
                int i2 = rww.a;
                return ((tbh) obj).b;
            case 13:
                int i3 = rww.a;
                return ((tbh) obj).b;
            case 14:
                tbu tbuVar = (tbu) obj;
                int i4 = rww.a;
                tbuVar.b(new rwc(15), new rwc(16));
                return tbuVar;
            case 15:
                tbu tbuVar2 = (tbu) obj;
                int i5 = rww.a;
                tbuVar2.l();
                return tbuVar2;
            case 16:
                tbu tbuVar3 = (tbu) obj;
                int i6 = rww.a;
                tql tqlVar = tql.SUCCEEDED;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 4020) {
                    agnc.t("processing_status", intValue);
                }
                if (tqlVar != null) {
                    i = tqlVar.ordinal();
                }
                tbuVar3.U(new agoi("parts.processing_status", 2, Integer.valueOf(i)));
                return tbuVar3;
            case 17:
                tbu tbuVar4 = (tbu) obj;
                tbuVar4.d("image/%");
                return tbuVar4;
            case 18:
                tbu tbuVar5 = (tbu) obj;
                tbuVar5.d("video/%");
                return tbuVar5;
            case 19:
                tbu tbuVar6 = (tbu) obj;
                tbuVar6.c("application/vnd.gsma.rcspushlocation+xml");
                return tbuVar6;
            default:
                tbu tbuVar7 = (tbu) obj;
                tbuVar7.b(new rwc(17), new rwc(18), new rwc(19));
                tbuVar7.U(new agoi("parts.width", 1, -1));
                return tbuVar7;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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
