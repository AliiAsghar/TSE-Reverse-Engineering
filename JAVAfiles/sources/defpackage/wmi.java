package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wmi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wmi(int i) {
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
        String o;
        int i = 0;
        switch (this.a) {
            case 0:
                syc sycVar = (syc) obj;
                xze xzeVar = RestoreReceiver.a;
                sycVar.x(1);
                return sycVar;
            case 1:
                syc sycVar2 = (syc) obj;
                xze xzeVar2 = RestoreReceiver.a;
                sycVar2.x(0);
                return sycVar2;
            case 2:
                xze xzeVar3 = RestoreReceiver.a;
                return ((xhf) obj).a;
            case 3:
                xze xzeVar4 = wod.a;
                return ((rve) obj).b;
            case 4:
                return a.aZ(obj);
            case 5:
                wte wteVar = (wte) obj;
                agpj agpjVar = wsv.a;
                wteVar.b(sni.c.a);
                return wteVar;
            case 6:
                wst wstVar = (wst) obj;
                agpj agpjVar2 = wsv.a;
                wtf wtfVar = wtf.SENDING;
                if (wtfVar != null) {
                    i = wtfVar.ordinal();
                }
                wstVar.U(new agoi("scheduled_send.status", 2, Integer.valueOf(i)));
                return wstVar;
            case 7:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                int i2 = wyv.b;
                if (bindData == null) {
                    return "";
                }
                return Objects.toString(bindData.O(), "");
            case 8:
                int i3 = wyy.a;
                String o2 = ((msh) obj).o(true);
                albo.C(o2);
                return o2;
            case 9:
                o = ((msh) obj).o(((Boolean) msw.d.e()).booleanValue());
                return o;
            case 10:
                return ((msh) obj).m();
            case 11:
                utz utzVar = wzw.d;
                return albo.ag(((msh) obj).j(((Boolean) new msn(18).get()).booleanValue()));
            case 12:
                utz utzVar2 = wzw.d;
                return albo.ag(((msh) obj).o(((Boolean) new msn(18).get()).booleanValue()));
            case 13:
                utz utzVar3 = wzw.d;
                return ((msh) obj).j(((Boolean) new mst(2).get()).booleanValue());
            case 14:
                return ((xbv) obj).a;
            case 15:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((xas) entry.getValue()).a;
                return ((String) entry.getKey()) + "=" + yyb.cS(obj2, yyb.cQ(obj2)) + ", Source: " + ((xas) entry.getValue()).b.toString();
            case 16:
                return Integer.valueOf(((ykb) obj).a());
            case 17:
                return Integer.valueOf(((ykb) obj).a());
            case 18:
                utz utzVar4 = xcs.a;
                return new ConcurrentHashMap();
            case 19:
                return ((pto) obj).a();
            default:
                return psv.a((ptz) obj);
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
