package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qqi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qqi(int i) {
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
        Integer valueOf2;
        switch (this.a) {
            case 0:
                return a.aZ(obj);
            case 1:
                return a.aZ(obj);
            case 2:
                return new ArrayList();
            case 3:
                return ((ParticipantsTable.BindData) obj).M();
            case 4:
                alvi alviVar = qqw.a;
                String P = ((ParticipantsTable.BindData) obj).P();
                P.getClass();
                return P;
            case 5:
                alvi alviVar2 = qqw.a;
                return albo.ag(((msh) obj).m());
            case 6:
                msh mshVar = (msh) obj;
                alvi alviVar3 = qqw.a;
                return mshVar;
            case 7:
                return qqw.y((String) obj);
            case 8:
                return alog.r((String) obj);
            case 9:
                tar tarVar = (tar) obj;
                alvi alviVar4 = qqw.a;
                return new tas[]{tarVar.a, tarVar.f, tarVar.g};
            case 10:
                qqb qqbVar = (qqb) obj;
                alvi alviVar5 = qqw.a;
                valueOf = Integer.valueOf(d.P().W().c());
                int intValue = valueOf.intValue();
                if (intValue < 10007) {
                    agnc.t("conv_type", intValue);
                }
                qqbVar.U(new agoi("conversations.conv_type", 1, 0));
                return qqbVar;
            case 11:
                qqk qqkVar = (qqk) obj;
                alvi alviVar6 = qqw.a;
                valueOf2 = Integer.valueOf(d.P().W().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 10007) {
                    agnc.t("conv_type", intValue2);
                }
                qqkVar.U(new agoi("conversations.conv_type", 1, 0));
                return qqkVar;
            case 12:
                alvi alviVar7 = qqw.a;
                return ((smr) obj).x();
            case 13:
                tar tarVar2 = (tar) obj;
                alvi alviVar8 = qqw.a;
                return new tas[]{tarVar2.a, tarVar2.f, tarVar2.g};
            case 14:
                smu smuVar = (smu) obj;
                alvi alviVar9 = qqw.a;
                return new smv[]{smuVar.a, smuVar.O, smuVar.R};
            case 15:
                utz utzVar = qrb.a;
                amqw amqwVar = ((amre) obj).d;
                if (amqwVar == null) {
                    amqwVar = amqw.a;
                }
                return amqwVar.e;
            case 16:
                return qra.a((qqo) obj);
            case 17:
                return qra.b((qqo) obj);
            case 18:
                return ((smr) obj).x();
            case 19:
                int i = qrj.b;
                return ((smr) obj).x();
            default:
                return psv.a(((pto) obj).a());
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
