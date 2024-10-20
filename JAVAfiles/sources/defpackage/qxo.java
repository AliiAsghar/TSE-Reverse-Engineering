package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxo implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qxo(int i) {
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
        switch (this.a) {
            case 0:
                return "OLD.".concat(String.valueOf(qxq.c((String) obj)));
            case 1:
                return "NEW.".concat(String.valueOf(qxq.c((String) obj)));
            case 2:
                return "NEW.".concat(String.valueOf(qxq.c((String) obj)));
            case 3:
                return "OLD.".concat(String.valueOf(qxq.c((String) obj)));
            case 4:
                String str = qxq.a;
                return (agnn) ((Map.Entry) obj).getValue();
            case 5:
                return qxq.c((String) obj);
            case 6:
                String str2 = (String) obj;
                String str3 = qxq.a;
                if (str2.equals("_id")) {
                    return "participant_id";
                }
                return str2;
            case 7:
                String str4 = (String) obj;
                String str5 = qxq.a;
                if (str4.equals("participant_id")) {
                    return "_id";
                }
                return str4;
            case 8:
                return qxq.c((String) obj);
            case 9:
                return "NEW.".concat(String.valueOf((String) obj));
            case 10:
                return "OLD.".concat(String.valueOf((String) obj));
            case 11:
                tbd tbdVar = (tbd) obj;
                tbdVar.b(new qxo(13), new qxo(14), new qxo(15), new qxo(16), new qxo(17), new qxo(18));
                return tbdVar;
            case 12:
                return (String) ((alhr) obj).get();
            case 13:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.U(new agmg("participants.normalized_destination", 5));
                return tbdVar2;
            case 14:
                tbd tbdVar3 = (tbd) obj;
                tbdVar3.l("");
                return tbdVar3;
            case 15:
                tbd tbdVar4 = (tbd) obj;
                tbdVar4.U(new agmg("participants.send_destination", 5));
                return tbdVar4;
            case 16:
                tbd tbdVar5 = (tbd) obj;
                tbdVar5.U(new agmd("participants.send_destination", 1, ""));
                return tbdVar5;
            case 17:
                tbd tbdVar6 = (tbd) obj;
                tbdVar6.U(new agmg("participants.display_destination", 5));
                return tbdVar6;
            case 18:
                tbd tbdVar7 = (tbd) obj;
                tbdVar7.U(new agmd("participants.display_destination", 1, ""));
                return tbdVar7;
            case 19:
                return ((ParticipantsTable.BindData) obj).A();
            default:
                return ((uie) obj).a;
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
