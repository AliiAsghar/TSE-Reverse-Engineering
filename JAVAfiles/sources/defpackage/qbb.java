package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qbb implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qbb(int i) {
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
                int i = qbc.b;
                String O = ((ParticipantsTable.BindData) obj).O();
                O.getClass();
                return O;
            case 1:
                qei qeiVar = (qei) obj;
                int i2 = qbc.b;
                aozy createBuilder = qfw.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfw qfwVar = (qfw) createBuilder.b;
                qeiVar.getClass();
                qfwVar.c = qeiVar;
                qfwVar.b |= 1;
                return (qfw) createBuilder.s();
            case 2:
                int i3 = qbc.b;
                String g = ((sbo) obj).g();
                g.getClass();
                return g;
            case 3:
                return ((sbo) obj).f();
            case 4:
                qei qeiVar2 = ((qff) obj).c;
                if (qeiVar2 == null) {
                    return qei.a;
                }
                return qeiVar2;
            case 5:
                qei qeiVar3 = (qei) obj;
                int i4 = qbk.b;
                aozy createBuilder2 = qfw.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfw qfwVar2 = (qfw) createBuilder2.b;
                qeiVar3.getClass();
                qfwVar2.c = qeiVar3;
                qfwVar2.b |= 1;
                return (qfw) createBuilder2.s();
            case 6:
                return ((sbo) obj).g();
            case 7:
                return (qei) ((Optional) obj).get();
            case 8:
                return (Stream) obj;
            case 9:
                return ((qwm) obj).g();
            case 10:
                alwo alwoVar = qbq.a;
                return (qei) ((msh) obj).e().orElseThrow(new qaa(3));
            case 11:
                return Integer.valueOf(((adix) obj).a);
            case 12:
                return Integer.valueOf(((qwm) obj).e());
            case 13:
                return ((adit) obj).a;
            case 14:
                return albo.ag(((ParticipantsTable.BindData) obj).O());
            case 15:
                return Integer.valueOf(((adix) obj).a);
            case 16:
                qei qeiVar4 = ((qff) obj).c;
                if (qeiVar4 == null) {
                    qeiVar4 = qei.a;
                }
                return qeiVar4.d;
            case 17:
                qfe b = qfe.b(((qff) obj).d);
                if (b == null) {
                    return qfe.UNKNOWN_STATE;
                }
                return b;
            case 18:
                return ((smr) obj).x();
            case 19:
                return ((MessageCoreData) obj).B();
            default:
                return Long.valueOf(((MessageCoreData) obj).n());
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
