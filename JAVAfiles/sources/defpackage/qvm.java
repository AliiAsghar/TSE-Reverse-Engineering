package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qvm implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qvm(int i) {
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
                return Integer.valueOf(((qwl) obj).a);
            case 1:
                snh snhVar = (snh) obj;
                snhVar.n(6);
                return snhVar;
            case 2:
                return Integer.valueOf(((ykb) obj).a());
            case 3:
                tbd tbdVar = (tbd) obj;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 59930) {
                    agnc.t("my_identity_token", intValue);
                }
                tbdVar.U(new agmg("participants.my_identity_token", 6));
                return tbdVar;
            case 4:
                qwv qwvVar = (qwv) obj;
                qwvVar.b();
                return qwvVar;
            case 5:
                qvj qvjVar = (qvj) obj;
                int i = qwd.a;
                qvjVar.b(qvn.a);
                return qvjVar;
            case 6:
                qvj qvjVar2 = (qvj) obj;
                int i2 = qwd.a;
                qvjVar2.b(qvn.a);
                return qvjVar2;
            case 7:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.r(-2);
                return tbdVar2;
            case 8:
                tbd tbdVar3 = (tbd) obj;
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 59930) {
                    agnc.t("my_identity_token", intValue2);
                }
                tbdVar3.U(new agmg("participants.my_identity_token", 5));
                return tbdVar3;
            case 9:
                tbd tbdVar4 = (tbd) obj;
                alwo alwoVar = qxb.a;
                tbdVar4.r(-2);
                return tbdVar4;
            case 10:
                tbd tbdVar5 = (tbd) obj;
                alwo alwoVar2 = qxb.a;
                tbdVar5.r(-2);
                return tbdVar5;
            case 11:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                alwo alwoVar3 = qxb.a;
                return new qxa(bindData.M(), bindData.y());
            case 12:
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                alwo alwoVar4 = qxb.a;
                return "rowId=" + bindData2.M() + " subId= " + bindData2.p() + " token=" + String.valueOf(bindData2.y());
            case 13:
                tbd tbdVar6 = (tbd) obj;
                alwo alwoVar5 = qxb.a;
                tbdVar6.r(-2);
                return tbdVar6;
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                alwo alwoVar6 = qxb.a;
                return "ParticipantId=" + ((String) entry.getKey()) + " subId=" + ((qwm) entry.getValue()).e();
            case 15:
                return Integer.valueOf(((qwm) obj).e());
            case 16:
                msh mshVar = (msh) obj;
                alwo alwoVar7 = qxb.a;
                if (((Boolean) new mss(19).get()).booleanValue()) {
                    return (String) mshVar.c().orElse(mshVar.i());
                }
                return mshVar.i();
            case 17:
                return Integer.valueOf(((ykb) obj).a());
            case 18:
                String str = (String) obj;
                AtomicBoolean atomicBoolean = qxn.a;
                if (str.startsWith("+")) {
                    return str.substring(1);
                }
                return str;
            case 19:
                return "/* " + ((String) obj) + " */";
            default:
                String str2 = (String) obj;
                return "OLD." + str2 + " <> NEW." + str2;
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
