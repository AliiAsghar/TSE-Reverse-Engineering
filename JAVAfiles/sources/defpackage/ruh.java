package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ruh implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ruh(int i) {
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
        Object obj2;
        switch (this.a) {
            case 0:
                smr smrVar = (smr) obj;
                xze xzeVar = rul.a;
                return smrVar;
            case 1:
                xze xzeVar2 = rul.a;
                return Boolean.valueOf(((smr) obj).ad());
            case 2:
                xze xzeVar3 = rul.a;
                return ((smu) obj).a;
            case 3:
                xze xzeVar4 = rul.a;
                return ((smu) obj).a;
            case 4:
                xze xzeVar5 = rul.a;
                return ((smu) obj).a;
            case 5:
                xze xzeVar6 = rul.a;
                return ((smu) obj).a;
            case 6:
                xze xzeVar7 = rul.a;
                return ((smu) obj).a;
            case 7:
                xze xzeVar8 = rul.a;
                return ((ifq) obj).c;
            case 8:
                xze xzeVar9 = rul.a;
                return ((jat) obj).e;
            case 9:
                xze xzeVar10 = rul.a;
                return ((smr) obj).C();
            case 10:
                return Integer.valueOf(((vst) obj).c);
            case 11:
                obj2 = ((qei) obj).d;
                return obj2;
            case 12:
                xze xzeVar11 = rul.a;
                return String.valueOf(((ParticipantsTable.BindData) obj).M());
            case 13:
                xze xzeVar12 = rul.a;
                return ((smu) obj).a;
            case 14:
                sxo sxoVar = (sxo) obj;
                return new sxp[]{sxoVar.a, sxoVar.i, sxoVar.c};
            case 15:
                return ((smu) obj).f;
            case 16:
                sxo sxoVar2 = (sxo) obj;
                return new sxp[]{sxoVar2.a, sxoVar2.i, sxoVar2.c};
            case 17:
                return ruy.b((String) obj);
            case 18:
                return ((ConversationIdType) obj).a();
            case 19:
                return rvc.b((String) obj);
            default:
                return Long.valueOf(((snq) obj).h());
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
