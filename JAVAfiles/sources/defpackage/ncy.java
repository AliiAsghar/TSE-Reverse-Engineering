package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncy implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ncy(int i) {
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
        boolean z = true;
        switch (this.a) {
            case 0:
                rty rtyVar = (rty) obj;
                if (rtyVar.a != 0 || rtyVar.b) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return akul.g(((akbj) obj).c());
            case 2:
                return Boolean.valueOf(((msh) obj).z());
            case 3:
                return ((msh) obj).i();
            case 4:
                return ((ndq) obj).a;
            case 5:
                return ((msh) obj).k();
            case 6:
                return ((ParticipantsTable.BindData) obj).M();
            case 7:
                tby tbyVar = (tby) obj;
                return new sjf[]{(sjf) tbyVar.g, (sjf) tbyVar.o, (sjf) tbyVar.q, (sjf) tbyVar.i};
            case 8:
                return ((jat) obj).e;
            case 9:
                return ((tde) obj).i;
            case 10:
                tby tbyVar2 = (tby) obj;
                return new sjf[]{(sjf) tbyVar2.g, (sjf) tbyVar2.o, (sjf) tbyVar2.q, (sjf) tbyVar2.i};
            case 11:
                return ((sxo) obj).c;
            case 12:
                return ((ifq) obj).c;
            case 13:
                return new BugleConversationId((ConversationIdType) obj);
            case 14:
                return ((msh) obj).k();
            case 15:
                int i = ndv.a;
                return ((jat) obj).d;
            case 16:
                int i2 = ndx.a;
                return ((ifq) obj).a;
            case 17:
                return lga.ap((tar) obj);
            case 18:
                int i3 = nea.a;
                return ((jat) obj).d;
            case 19:
                return lga.ap((tar) obj);
            default:
                return lga.ap((tar) obj);
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
