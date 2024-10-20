package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yec implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ yec(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v70, types: [agnw, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i;
        Integer valueOf;
        Integer valueOf2;
        int i2 = 1;
        switch (this.b) {
            case 0:
                yek yekVar = (yek) obj;
                if (true != ((yaq) ((yed) this.a).b.h.a()).q()) {
                    i = 300000;
                } else {
                    i = 1000000;
                }
                int i3 = 3;
                List list = (List) DesugarArrays.stream(yee.d).filter(new xdm(yekVar, 15)).map(new yec(yekVar, i2)).filter(new myg(i, i3)).sorted(Comparator.EL.reversed(Comparator.CC.comparingInt(new kmb(9)))).limit(2L).collect(Collectors.toCollection(new yaa(i3)));
                if (list.isEmpty()) {
                    return apzz.a;
                }
                if (list.size() == 1) {
                    list.add(1, (yel) list.get(0));
                }
                aozy createBuilder = apzz.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((apzz) createBuilder.b).h = a.ak(5);
                apzw b = yee.b((yel) list.get(0));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apzz apzzVar = (apzz) createBuilder.b;
                b.getClass();
                apzzVar.f = b;
                apzzVar.b |= 1;
                apzw b2 = yee.b((yel) list.get(1));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                apzz apzzVar2 = (apzz) apagVar;
                b2.getClass();
                apzzVar2.g = b2;
                apzzVar2.b |= 2;
                String str = yekVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                ((apzz) apagVar2).c = str;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                ((apzz) apagVar3).d = "tenor.com";
                String str2 = yekVar.b;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                ((apzz) apagVar4).e = str2;
                String str3 = yekVar.a;
                if (!apagVar4.isMutable()) {
                    createBuilder.u();
                }
                ((apzz) createBuilder.b).i = str3;
                return (apzz) createBuilder.s();
            case 1:
                xze xzeVar = yee.a;
                yel a = ((yek) this.a).a((String) obj);
                a.getClass();
                return a;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                akrh a2 = ((xny) entry.getValue()).a();
                try {
                    akul a3 = ((yfv) entry.getKey()).a(this.a);
                    a2.b(a3);
                    a2.close();
                    return a3;
                } catch (Throwable th) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 3:
                syc sycVar = (syc) obj;
                sycVar.i((MessageIdType) this.a);
                return sycVar;
            case 4:
                stk stkVar = (stk) obj;
                stkVar.c((MessageIdType) this.a);
                return stkVar;
            case 5:
                stk stkVar2 = (stk) obj;
                stkVar2.c((MessageIdType) this.a);
                return stkVar2;
            case 6:
                tny tnyVar = (tny) obj;
                tnyVar.U(new agmd("messages.conversation_id", 1, Long.valueOf(ruy.a((ConversationIdType) this.a))));
                return tnyVar;
            case 7:
                slx slxVar = (slx) obj;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 12000) {
                    agnc.t("target_rcs_message_id", intValue);
                }
                slxVar.U(new agmd("conversation_suggestions.target_rcs_message_id", 1, rve.d((rvf) this.a)));
                return slxVar;
            case 8:
                syc sycVar2 = (syc) obj;
                sycVar2.f((ConversationIdType) this.a);
                return sycVar2;
            case 9:
                szt sztVar = (szt) obj;
                ybe ybeVar = new ybe(11);
                sxy sxyVar = (sxy) this.a;
                sxyVar.e(ybeVar);
                sztVar.U(new agme("p2p_suggestions.target_message_id", 1, sxyVar.b()));
                return sztVar;
            case 10:
                return ((yjy) ((yjr) this.a).f.b()).h(((ykb) obj).a()).j(true);
            case 11:
                return d.U(this.a, obj);
            case 12:
                tbd tbdVar = (tbd) obj;
                alvi alviVar = ymh.a;
                tbdVar.h((String) this.a);
                return tbdVar;
            case 13:
                swv swvVar = (swv) obj;
                swvVar.b((ConversationIdType) this.a);
                return swvVar;
            case 14:
                swv swvVar2 = (swv) obj;
                swvVar2.b((ConversationIdType) this.a);
                return swvVar2;
            case 15:
                yob yobVar = (yob) obj;
                utz utzVar = ynr.a;
                yobVar.b((ConversationIdType) this.a);
                yobVar.d();
                yobVar.c();
                return yobVar;
            case 16:
                return Long.valueOf(this.a.P("spam_logging_ids_table", (ContentValues) obj));
            case 17:
                swv swvVar3 = (swv) obj;
                uuf uufVar = ypr.a;
                swvVar3.c((MessageIdType) this.a);
                return swvVar3;
            case 18:
                swv swvVar4 = (swv) obj;
                long epochMilli = ((xnv) ((ypr) this.a).e.b()).f().toEpochMilli() - Duration.ofDays(((Number) ypr.a.e()).intValue()).toMillis();
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 59190) {
                    agnc.t("classification_timestamp", intValue2);
                }
                swvVar4.U(new agoi("message_spam.classification_timestamp", 8, Long.valueOf(epochMilli)));
                return swvVar4;
            case 19:
                return albo.ag(((ykb) obj).A(((ytw) this.a).i));
            default:
                return yup.e((yum) obj, (ansm) this.a);
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
