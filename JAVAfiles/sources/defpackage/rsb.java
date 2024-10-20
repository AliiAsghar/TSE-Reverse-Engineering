package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rsb implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rsb(int i) {
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
        Object e;
        Object obj2;
        switch (this.a) {
            case 0:
                return ((tar) obj).a;
            case 1:
                return ((ifq) obj).c;
            case 2:
                tbd tbdVar = (tbd) obj;
                tbdVar.r(-2);
                return tbdVar;
            case 3:
                tde tdeVar = (tde) obj;
                return new tdf[]{(tdf) tdeVar.i, (tdf) tdeVar.g, (tdf) tdeVar.h};
            case 4:
                tde tdeVar2 = (tde) obj;
                return new tdf[]{(tdf) tdeVar2.i, (tdf) tdeVar2.g, (tdf) tdeVar2.h};
            case 5:
                return ((ifq) obj).c;
            case 6:
                return ((jat) obj).e;
            case 7:
                return ((amjy) obj).name();
            case 8:
                return new xwb((String) obj);
            case 9:
                e = ((msh) obj).e();
                return e;
            case 10:
                return ((msh) obj).F().a;
            case 11:
                syc sycVar = (syc) obj;
                smv[] smvVarArr = rtk.a;
                sycVar.u(tqp.UNKNOWN);
                sycVar.r(1);
                return sycVar;
            case 12:
                syc sycVar2 = (syc) obj;
                smv[] smvVarArr2 = rtk.a;
                sycVar2.v(tqp.UNKNOWN);
                sycVar2.r(2);
                return sycVar2;
            case 13:
                syc sycVar3 = (syc) obj;
                smv[] smvVarArr3 = rtk.a;
                sycVar3.u(tqp.NOT_SENT);
                return sycVar3;
            case 14:
                syc sycVar4 = (syc) obj;
                smv[] smvVarArr4 = rtk.a;
                sycVar4.v(tqp.NOT_SENT);
                return sycVar4;
            case 15:
                obj2 = ((qei) obj).d;
                return obj2;
            case 16:
                xze xzeVar = rul.a;
                return ((ifq) obj).c;
            case 17:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                xze xzeVar2 = rul.a;
                return bindData;
            case 18:
                xze xzeVar3 = rul.a;
                return new rux(qfe.JOINED);
            case 19:
                return ((smr) obj).x();
            default:
                smr smrVar = (smr) obj;
                xze xzeVar4 = rul.a;
                return smrVar;
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
