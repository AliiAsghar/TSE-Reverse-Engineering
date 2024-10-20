package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yur implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ yur(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v28, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Object apply;
        int i = 0;
        switch (this.b) {
            case 0:
                yup.a.o("Decrypting VSMS key pair...");
                Object obj2 = this.a;
                yup yupVar = (yup) obj2;
                return yupVar.c().h(new yez((yum) obj, 18), yupVar.c).f(Exception.class, new ytu(obj2, 7), yupVar.d);
            case 1:
                aozb aozbVar = (aozb) obj;
                xze xzeVar = yuu.a;
                aozy createBuilder = anmc.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                aozbVar.getClass();
                ((anmc) apagVar).b = aozbVar;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((anmc) createBuilder.b).c = (aozb) this.a;
                return (anmc) createBuilder.s();
            case 2:
                slc slcVar = (slc) obj;
                d.aE((ParticipantsTable.BindData) this.a, slcVar);
                return slcVar;
            case 3:
                tbd tbdVar = (tbd) obj;
                ?? r0 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r0, 10));
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ParticipantsTable.BindData) it.next()).M());
                }
                tbdVar.j(aqjn.aE(arrayList));
                return tbdVar;
            case 4:
                slc slcVar2 = (slc) obj;
                d.aE((ParticipantsTable.BindData) this.a, slcVar2);
                return slcVar2;
            case 5:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.j(this.a);
                return tbdVar2;
            case 6:
                tbd tbdVar3 = (tbd) obj;
                tbdVar3.l((String) this.a);
                return tbdVar3;
            case 7:
                tbd tbdVar4 = (tbd) obj;
                tbdVar4.j(this.a);
                return tbdVar4;
            case 8:
                slc slcVar3 = (slc) obj;
                slcVar3.b(this.a.z());
                return slcVar3;
            case 9:
                tbd tbdVar5 = (tbd) obj;
                tbdVar5.j(this.a);
                return tbdVar5;
            case 10:
                return d.T(this.a, obj);
            case 11:
                slx slxVar = (slx) obj;
                sxp[] sxpVarArr = {MessagesTable.c.C};
                sxy sxyVar = (sxy) this.a;
                sxyVar.c(sxpVarArr);
                sxx b = sxyVar.b();
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 12000) {
                    agnc.t("target_rcs_message_id", intValue);
                }
                slxVar.U(new agme("conversation_suggestions.target_rcs_message_id", 1, b));
                return slxVar;
            case 12:
                slx slxVar2 = (slx) obj;
                yug yugVar = new yug(17);
                sxy sxyVar2 = (sxy) this.a;
                sxyVar2.e(yugVar);
                slxVar2.U(new agme("conversation_suggestions.message_id", 1, sxyVar2.b()));
                return slxVar2;
            case 13:
                slx slxVar3 = (slx) obj;
                Object obj3 = this.a;
                Function[] functionArr = {new yur(obj3, 11), new yur(obj3, 12)};
                slx[] slxVarArr = new slx[2];
                while (i < 2) {
                    apply = functionArr[i].apply(new slx());
                    slxVarArr[i] = (slx) apply;
                    i++;
                }
                slxVar3.V(slxVarArr);
                return slxVar3;
            case 14:
                return new Intent((Context) this.a, (Class<?>) ((znv) obj).a());
            case 15:
                return this.a.k((msh) obj);
            case 16:
                final List list = (List) obj;
                IntStream filter = IntStream.CC.range(0, list.size()).filter(new zlp(list, i));
                final zls zlsVar = (zls) this.a;
                return (List) filter.mapToObj(new IntFunction() { // from class: zlq
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i2) {
                        SmsMessage smsMessage = (SmsMessage) list.get(i2);
                        zln zlnVar = new zln();
                        zls zlsVar2 = zls.this;
                        zlnVar.b = ((msk) zlsVar2.b.f.b()).t(smsMessage.getDisplayOriginatingAddress(), zlsVar2.a);
                        zlnVar.a = smsMessage.getDisplayMessageBody();
                        zlnVar.c = zlsVar2.b.a(smsMessage.getTimestampMillis());
                        zlnVar.c(smsMessage.getIndexOnIcc());
                        zlnVar.b(i2);
                        return zlnVar.a();
                    }
                }).collect(Collectors.toCollection(new zhh(4)));
            case 17:
                return ((lyw) obj).a();
            case 18:
                aabp aabpVar = (aabp) obj;
                if (aabpVar != null) {
                    Object obj4 = this.a;
                    boolean u = aabpVar.u();
                    boolean w = aabpVar.w();
                    if (u && !w) {
                        zri zriVar = (zri) obj4;
                        zriVar.D(false);
                        ((ixd) zriVar.j).bn();
                    }
                    ((zri) obj4).S();
                    return Boolean.valueOf(u);
                }
                return false;
            case 19:
                return ((msk) ((zrw) this.a).j.b()).n((String) obj);
            default:
                return ((ndi) ((zrw) this.a).k.b()).e((msh) obj);
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
