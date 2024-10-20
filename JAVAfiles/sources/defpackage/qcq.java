package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qcq implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qcq(int i) {
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
                return ((smu) obj).a;
            case 1:
                qgr qgrVar = ((qgj) obj).g;
                if (qgrVar == null) {
                    return qgr.a;
                }
                return qgrVar;
            case 2:
                qei qeiVar = ((qff) obj).c;
                if (qeiVar == null) {
                    return qei.a;
                }
                return qeiVar;
            case 3:
                return (ConversationIdType) ((Map.Entry) obj).getKey();
            case 4:
                return alor.j((Map) ((Map.Entry) obj).getValue());
            case 5:
                return ((sxo) obj).B;
            case 6:
                return ((smu) obj).a;
            case 7:
                return albo.ag(((msh) obj).m());
            case 8:
                return lqn.n((msh) obj);
            case 9:
                return new qje((Throwable) obj);
            case 10:
                return new RuntimeException((Throwable) obj);
            case 11:
                return new RuntimeException((Throwable) obj);
            case 12:
                return new qje((Throwable) obj);
            case 13:
                alwo alwoVar = qot.a;
                String O = ((ParticipantsTable.BindData) obj).O();
                albo.C(O);
                return O;
            case 14:
                String G = ((ParticipantsTable.BindData) obj).G();
                G.getClass();
                return G;
            case 15:
                String O2 = ((ParticipantsTable.BindData) obj).O();
                O2.getClass();
                return O2;
            case 16:
                String O3 = ((ParticipantsTable.BindData) obj).O();
                O3.getClass();
                return O3;
            case 17:
                return albo.ag(((msh) obj).m());
            case 18:
                return albo.ag(((msh) obj).m());
            case 19:
                return ((ParticipantsTable.BindData) obj).O();
            default:
                smr smrVar = (smr) obj;
                xze xzeVar = qpn.a;
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
