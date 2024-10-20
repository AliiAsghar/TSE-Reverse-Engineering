package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rub implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rub(int i) {
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
        switch (this.a) {
            case 0:
                return ((sku) obj).l();
            case 1:
                return ((smh) obj).l();
            case 2:
                syc sycVar = (syc) obj;
                xze xzeVar = rul.a;
                sycVar.A(false);
                return sycVar;
            case 3:
                sry sryVar = (sry) obj;
                xze xzeVar2 = rul.a;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 58700) {
                    agnc.t("read", intValue);
                }
                sryVar.U(new agoi("lighter_conversations_table.read", 1, 0));
                return sryVar;
            case 4:
                snh snhVar = (snh) obj;
                xze xzeVar3 = rul.a;
                snhVar.o();
                return snhVar;
            case 5:
                syc sycVar2 = (syc) obj;
                xze xzeVar4 = rul.a;
                sycVar2.A(false);
                return sycVar2;
            case 6:
                snh snhVar2 = (snh) obj;
                xze xzeVar5 = rul.a;
                snhVar2.o();
                return snhVar2;
            case 7:
                xze xzeVar6 = rul.a;
                return String.valueOf(((ParticipantsTable.BindData) obj).M());
            case 8:
                return ((ParticipantsTable.BindData) obj).P();
            case 9:
                return ((ParticipantsTable.BindData) obj).O();
            case 10:
                xze xzeVar7 = rul.a;
                return new smv[]{((smu) obj).a};
            case 11:
                xze xzeVar8 = rul.a;
                return ((smu) obj).J;
            case 12:
                xze xzeVar9 = rul.a;
                return ((tde) obj).i;
            case 13:
                ConversationIdType conversationIdType = ((rut) obj).a;
                xze xzeVar10 = rul.a;
                return Boolean.valueOf(conversationIdType.b());
            case 14:
                smu smuVar = (smu) obj;
                xze xzeVar11 = rul.a;
                return new smv[]{smuVar.a, smuVar.O};
            case 15:
                sxo sxoVar = (sxo) obj;
                xze xzeVar12 = rul.a;
                return new sxp[]{sxoVar.i, sxoVar.k};
            case 16:
                xze xzeVar13 = rul.a;
                return ((tar) obj).a;
            case 17:
                xze xzeVar14 = rul.a;
                return ((smr) obj).A();
            case 18:
                smr smrVar = (smr) obj;
                xze xzeVar15 = rul.a;
                return new rty(smrVar.h(), smrVar.ac());
            case 19:
                xze xzeVar16 = rul.a;
                return ((smr) obj).G();
            default:
                xze xzeVar17 = rul.a;
                return ((jat) obj).e;
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
