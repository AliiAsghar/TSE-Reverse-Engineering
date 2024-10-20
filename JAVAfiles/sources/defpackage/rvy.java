package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rvy implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rvy(int i) {
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
        Object obj2;
        switch (this.a) {
            case 0:
                syc sycVar = (syc) obj;
                xze xzeVar = rwd.a;
                sycVar.N();
                return sycVar;
            case 1:
                return ((MessagesTable.BindData) obj).A();
            case 2:
                syc sycVar2 = (syc) obj;
                xze xzeVar2 = rwd.a;
                sycVar2.Q(1, 22);
                sycVar2.S(qkv.b);
                return sycVar2;
            case 3:
                syc sycVar3 = (syc) obj;
                xze xzeVar3 = rwd.a;
                sycVar3.Q(BasePaymentResult.ERROR_REQUEST_FAILED, 253);
                return sycVar3;
            case 4:
                xze xzeVar4 = rwd.a;
                return new sxp[]{((sxo) obj).R};
            case 5:
                tar tarVar = (tar) obj;
                xze xzeVar5 = rwd.a;
                return new tas[]{tarVar.a, tarVar.f, tarVar.g, tarVar.z, tarVar.h, tarVar.t, tarVar.s, tarVar.u, tarVar.o, tarVar.m, tarVar.n, tarVar.r};
            case 6:
                tar tarVar2 = (tar) obj;
                xze xzeVar6 = rwd.a;
                return new tas[]{tarVar2.a, tarVar2.f, tarVar2.g, tarVar2.z, tarVar2.h, tarVar2.t, tarVar2.s, tarVar2.u, tarVar2.o, tarVar2.Q, tarVar2.m, tarVar2.n, tarVar2.r};
            case 7:
                zai zaiVar = (zai) obj;
                xze xzeVar7 = rwd.a;
                return new tog[]{(tog) zaiVar.b, (tog) zaiVar.c, (tog) zaiVar.e};
            case 8:
                syc sycVar4 = (syc) obj;
                xze xzeVar8 = rwd.a;
                sycVar4.U(new agoi("messages.message_protocol", 2, 3));
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 41040) {
                    agnc.t("rcs_message_id_with_text_type", intValue);
                }
                sycVar4.U(new agmg("messages.rcs_message_id_with_text_type", 6));
                sycVar4.M(15);
                return sycVar4;
            case 9:
                obj2 = ((qei) obj).d;
                return obj2;
            case 10:
                xze xzeVar9 = rwd.a;
                return ((smu) obj).y;
            case 11:
                snh snhVar = (snh) obj;
                xze xzeVar10 = rwd.a;
                snhVar.U(new agme("conversations._id", 1, MessagesTable.c.b));
                return snhVar;
            case 12:
                sxo sxoVar = (sxo) obj;
                xze xzeVar11 = rwd.a;
                return new sxp[]{sxoVar.a, sxoVar.b, sxoVar.o};
            case 13:
                smu smuVar = (smu) obj;
                xze xzeVar12 = rwd.a;
                return new smv[]{smuVar.b, smuVar.c};
            case 14:
                syc sycVar5 = (syc) obj;
                xze xzeVar13 = rwd.a;
                sycVar5.K();
                return sycVar5;
            case 15:
                syc sycVar6 = (syc) obj;
                xze xzeVar14 = rwd.a;
                sycVar6.A(false);
                return sycVar6;
            case 16:
                syc sycVar7 = (syc) obj;
                xze xzeVar15 = rwd.a;
                sycVar7.R();
                return sycVar7;
            case 17:
                syc sycVar8 = (syc) obj;
                xze xzeVar16 = rwd.a;
                sycVar8.R();
                return sycVar8;
            case 18:
                syc sycVar9 = (syc) obj;
                xze xzeVar17 = rwd.a;
                sycVar9.N();
                return sycVar9;
            case 19:
                return ((MessageCoreData) obj).z();
            default:
                syc sycVar10 = (syc) obj;
                xze xzeVar18 = rwd.a;
                sycVar10.N();
                return sycVar10;
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
