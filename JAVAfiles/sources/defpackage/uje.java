package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uje implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uje(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 11;
        switch (this.b) {
            case 0:
                Duration duration = ujg.a;
                return this.a.a(obj);
            case 1:
                tbu tbuVar = (tbu) obj;
                tbuVar.f((String) this.a);
                return tbuVar;
            case 2:
                Duration duration2 = ujg.a;
                return this.a.a(obj);
            case 3:
                return this.a.a(obj);
            case 4:
                return Optional.ofNullable(((gsi) this.a).g((String) obj));
            case 5:
                tpr tprVar = (tpr) obj;
                tprVar.b((String) this.a);
                return tprVar;
            case 6:
                tbd tbdVar = (tbd) obj;
                tbdVar.h(((ParticipantsTable.BindData) this.a).M());
                return tbdVar;
            case 7:
                syc sycVar = (syc) obj;
                sycVar.F(((ParticipantsTable.BindData) this.a).M());
                return sycVar;
            case 8:
                tpr tprVar2 = (tpr) obj;
                tprVar2.b((String) this.a);
                return tprVar2;
            case 9:
                tph tphVar = (tph) obj;
                tphVar.b((String) this.a);
                return tphVar;
            case 10:
                srl srlVar = (srl) obj;
                srlVar.c((String[]) Collection.EL.stream(this.a).map(new uid(i)).toArray(new mlo(8)));
                return srlVar;
            case 11:
                srl srlVar2 = (srl) obj;
                xze xzeVar = ukq.a;
                srlVar2.b((String) this.a);
                return srlVar2;
            case 12:
                srl srlVar3 = (srl) obj;
                srlVar3.c((String[]) Collection.EL.stream(this.a).map(new uid(i)).toArray(new mlo(9)));
                return srlVar3;
            case 13:
                shq shqVar = (shq) obj;
                Long l = (Long) this.a;
                l.longValue();
                shqVar.U(new agoi("cms_deleted_messages_buffer._id", 1, l));
                return shqVar;
            case 14:
                syc sycVar2 = (syc) obj;
                alvi alviVar = ulw.a;
                sycVar2.l(this.a);
                return sycVar2;
            case 15:
                uni uniVar = new uni(((Long) obj).longValue());
                uniVar.a = ((upr) this.a).p();
                return uniVar;
            case 16:
                uqa uqaVar = (uqa) obj;
                uqaVar.b(((upr) this.a).k());
                return uqaVar;
            case 17:
                uqa uqaVar2 = (uqa) obj;
                uqaVar2.b(((upr) ((alog) this.a).get(0)).k());
                return uqaVar2;
            case 18:
                uqa uqaVar3 = (uqa) obj;
                uqaVar3.c(this.a);
                return uqaVar3;
            case 19:
                uqa uqaVar4 = (uqa) obj;
                uqaVar4.e(this.a);
                return uqaVar4;
            default:
                urc urcVar = (urc) obj;
                urcVar.c(this.a);
                return urcVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
