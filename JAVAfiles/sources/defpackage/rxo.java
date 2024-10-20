package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rxo implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rxo(int i) {
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
        int i = 16;
        switch (this.a) {
            case 0:
                alwo alwoVar = rxq.a;
                return ((jat) obj).e;
            case 1:
                uuf uufVar = rxn.a;
                return ((msh) obj).o(((Boolean) new mss(1).get()).booleanValue());
            case 2:
                alwo alwoVar2 = rxq.a;
                return ((ParticipantsTable.BindData) obj).v();
            case 3:
                return ((ParticipantsTable.BindData) obj).F();
            case 4:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                alwo alwoVar3 = rxq.a;
                return bindData;
            case 5:
                alwo alwoVar4 = rxq.a;
                return ((ifq) obj).c;
            case 6:
                alwo alwoVar5 = rxq.a;
                return ((tar) obj).a;
            case 7:
                alwo alwoVar6 = rxq.a;
                return ((tar) obj).a;
            case 8:
                return ((smh) obj).l();
            case 9:
                return ((sku) obj).l();
            case 10:
                return ((qwm) obj).b();
            case 11:
                return ((stc) obj).k();
            case 12:
                return Stream.CC.of((MessageIdType) obj);
            case 13:
                return Optional.ofNullable(((stc) obj).l());
            case 14:
                return (Stream) ((Optional) obj).map(new rxo(12)).orElseGet(new roi(i));
            case 15:
                return ((MessageIdType) obj).toString();
            case 16:
                stc stcVar = (stc) obj;
                return Optional.ofNullable(stcVar.m()).map(new rxb(stcVar, 20));
            case 17:
                return (Stream) ((Optional) obj).map(new rxo(18)).orElseGet(new roi(i));
            case 18:
                return Stream.CC.of((aqby) obj);
            case 19:
                return ((uqg) obj).c;
            default:
                return ((ead) obj).b;
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
