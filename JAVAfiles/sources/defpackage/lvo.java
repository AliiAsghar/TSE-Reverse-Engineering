package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lvo implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ lvo(int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, agpj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                sfy sfyVar = (sfy) obj;
                sfyVar.c(-1L);
                String[] strArr = MessagesTable.a;
                sfyVar.f("messages");
                return sfyVar;
            case 1:
                tix tixVar = (tix) obj;
                tixVar.b(tja.a);
                return tixVar;
            case 2:
                sfy sfyVar2 = (sfy) obj;
                sfyVar2.c(2L);
                String[] strArr2 = MessagesTable.a;
                sfyVar2.f("messages");
                return sfyVar2;
            case 3:
                sfy sfyVar3 = (sfy) obj;
                sfyVar3.c(-1L);
                String[] strArr3 = MessagesTable.a;
                sfyVar3.f("messages");
                return sfyVar3;
            case 4:
                sfy sfyVar4 = (sfy) obj;
                sfyVar4.c(2L);
                String[] strArr4 = MessagesTable.a;
                sfyVar4.f("messages");
                return sfyVar4;
            case 5:
                ifq ifqVar = (ifq) obj;
                int i = mac.c;
                return new spx[]{(spx) ifqVar.c, (spx) ifqVar.b, (spx) ifqVar.a};
            case 6:
                smu smuVar = (smu) obj;
                int i2 = mac.c;
                return new smv[]{smuVar.a, smuVar.q};
            case 7:
                sxk sxkVar = (sxk) obj;
                int i3 = man.b;
                sxkVar.U(new agmg("message_status.message_id", 5));
                return sxkVar;
            case 8:
                jat jatVar = (jat) obj;
                int i4 = man.b;
                return new sxf[]{(sxf) jatVar.f, (sxf) jatVar.g, (sxf) jatVar.e, (sxf) jatVar.b};
            case 9:
                sxo sxoVar = (sxo) obj;
                int i5 = man.b;
                return new sxp[]{sxoVar.a, sxoVar.k};
            case 10:
                int i6 = man.b;
                return ((sxo) obj).k;
            case 11:
                syc sycVar = (syc) obj;
                int i7 = man.b;
                sycVar.j(sxl.d.g);
                sycVar.P(1, 2, 11, 15, 14, 100);
                return sycVar;
            case 12:
                return (mbt) ((Map.Entry) obj).getKey();
            case 13:
                return new lfl((mbu) ((Map.Entry) obj).getValue());
            case 14:
                return ((StackTraceElement) obj).toString();
            case 15:
                mcc mccVar = (mcc) obj;
                if (mccVar.b == 2) {
                    amrs b = amrs.b(((Integer) mccVar.c).intValue());
                    if (b == null) {
                        return amrs.UNKNOWN_BUGLE_EVENT_CODE;
                    }
                    return b;
                }
                return amrs.UNKNOWN_BUGLE_EVENT_CODE;
            case 16:
                return Integer.valueOf(((mcc) obj).d);
            case 17:
                mcc mccVar2 = (mcc) obj;
                if (mccVar2.b == 1) {
                    amfp b2 = amfp.b(((Integer) mccVar2.c).intValue());
                    if (b2 == null) {
                        return amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                    }
                    return b2;
                }
                return amfp.UNKNOWN_BUGLE_EVENT_TYPE;
            case 18:
                return String.valueOf((Integer) obj);
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + ": " + ((String) entry.getValue());
            default:
                return ((mez) obj).name();
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
