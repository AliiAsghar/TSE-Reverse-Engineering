package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tvq implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ tvq(int i) {
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
        Object obj3;
        switch (this.a) {
            case 0:
                obj2 = ((qei) obj).d;
                return obj2;
            case 1:
                qei qeiVar = ((qea) obj).c;
                if (qeiVar == null) {
                    return qei.a;
                }
                return qeiVar;
            case 2:
                return ((MessagesTable.BindData) obj).A();
            case 3:
                return rve.a((String) obj);
            case 4:
                return ((adit) obj).a;
            case 5:
                snh snhVar = (snh) obj;
                alog alogVar = tyo.a;
                snhVar.g(0);
                snhVar.i(true);
                return snhVar;
            case 6:
                snh snhVar2 = (snh) obj;
                alog alogVar2 = tyo.a;
                snhVar2.g(1);
                return snhVar2;
            case 7:
                alog alogVar3 = tyo.a;
                return ((smu) obj).a;
            case 8:
                obj3 = ((qei) obj).d;
                return obj3;
            case 9:
                syc sycVar = (syc) obj;
                alog alogVar4 = tyo.a;
                sycVar.R();
                return sycVar;
            case 10:
                syc sycVar2 = (syc) obj;
                alog alogVar5 = tyo.a;
                sycVar2.N();
                return sycVar2;
            case 11:
                syc sycVar3 = (syc) obj;
                sycVar3.O(tyo.a);
                return sycVar3;
            case 12:
                syc sycVar4 = (syc) obj;
                sycVar4.O(tyo.b);
                return sycVar4;
            case 13:
                return Long.valueOf(((MessageCoreData) obj).n());
            case 14:
                return ((tfh) obj).k();
            case 15:
                return (uco) ((Map.Entry) obj).getValue();
            case 16:
                return new ArrayList();
            case 17:
                ucc uccVar = (ucc) obj;
                return String.format(Locale.US, "{%s,tid:%d,ts:%d,enter:%b}", uccVar.a, Long.valueOf(uccVar.b), Long.valueOf(uccVar.c), Boolean.valueOf(uccVar.d));
            case 18:
                return ((StackTraceElement) obj).toString();
            case 19:
                tlt tltVar = (tlt) obj;
                return String.format(Locale.US, "SqliteStat1 [tbl: %s, idx: %s, stat: %s]", String.valueOf(tltVar.a), String.valueOf(tltVar.b), String.valueOf(tltVar.c));
            default:
                utz utzVar = udk.a;
                return ((StackTraceElement) obj).toString();
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
