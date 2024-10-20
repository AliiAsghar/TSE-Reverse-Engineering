package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class unt implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ unt(int i) {
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
                upr uprVar = (upr) obj;
                if (uprVar.q() != null && uprVar.q().getTime() != 0) {
                    return Long.valueOf(uprVar.q().getTime());
                }
                return Long.valueOf(uprVar.l());
            case 1:
                return Integer.valueOf(((upr) obj).h());
            case 2:
                upt uptVar = (upt) obj;
                return new upu[]{(upu) uptVar.f, (upu) uptVar.b};
            case 3:
                uuf uufVar = uot.a;
                return Long.valueOf(((upr) obj).k());
            case 4:
                uuf uufVar2 = uot.a;
                return Long.valueOf(((upr) obj).k());
            case 5:
                uuf uufVar3 = uot.a;
                return ((StackTraceElement) obj).toString();
            case 6:
                return String.valueOf((Long) obj);
            case 7:
                return new HashMap();
            case 8:
                return upo.NOT_SCHEDULED;
            case 9:
                return a.aZ(obj);
            case 10:
                urc urcVar = (urc) obj;
                urcVar.U(new agmg("work_queue_work_manager_ids.workmanager_id", 6));
                return urcVar;
            case 11:
                urc urcVar2 = (urc) obj;
                urcVar2.U(new agmg("work_queue_work_manager_ids.workmanager_id", 5));
                return urcVar2;
            case 12:
                return Long.valueOf(((upr) obj).k());
            case 13:
                return new andr();
            case 14:
                return (uup) ((armf) obj).b();
            case 15:
                return ((uup) obj).a();
            case 16:
                return ((adit) obj).a;
            case 17:
                return ((adit) obj).a;
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                xou xouVar = new xou((short[]) null);
                xouVar.j((String) entry.getKey());
                xouVar.k((String) entry.getValue());
                return xouVar.i();
            case 19:
                return (List) ((Optional) obj).get();
            default:
                return Collection.EL.stream((List) obj);
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
