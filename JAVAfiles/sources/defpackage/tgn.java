package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tgn implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ tgn(int i) {
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
        Integer valueOf;
        Integer valueOf2;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z = true;
        switch (this.a) {
            case 0:
                return a.aZ(obj);
            case 1:
                return a.aZ(obj);
            case 2:
                return a.aZ(obj);
            case 3:
                return a.aZ(obj);
            case 4:
                soq soqVar = (soq) obj;
                xze xzeVar = trn.a;
                soqVar.c();
                return soqVar;
            case 5:
                soq soqVar2 = (soq) obj;
                xze xzeVar2 = trn.a;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 58010) {
                    agnc.t("request_id", intValue);
                }
                soqVar2.U(new agmg("desktop.request_id", 6));
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 58010) {
                    agnc.t("request_id", intValue2);
                }
                soqVar2.U(new agmd("desktop.request_id", 2, ""));
                return soqVar2;
            case 6:
                xze xzeVar3 = trn.a;
                return ((soi) obj).c;
            case 7:
                xze xzeVar4 = trn.a;
                return ((soi) obj).d;
            case 8:
                xze xzeVar5 = trn.a;
                return ((soi) obj).b;
            case 9:
                return rvc.b((String) obj);
            case 10:
                sec secVar = (sec) obj;
                alvi alviVar = tsl.a;
                secVar.getClass();
                if (!secVar.j() || !secVar.k()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(((sec) obj).j());
            case 12:
                sec secVar2 = (sec) obj;
                if (!secVar2.j() || !secVar2.k()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                sec secVar3 = (sec) obj;
                if (!secVar3.j() || !secVar3.k()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                obj2 = ((qei) obj).d;
                return obj2;
            case 15:
                return Boolean.valueOf(((sec) obj).j());
            case 16:
                return aozb.z((String) obj);
            case 17:
                return Integer.valueOf(((ttf) obj).y + 10);
            case 18:
                obj3 = ((qei) obj).d;
                return obj3;
            case 19:
                obj4 = ((qei) obj).d;
                return obj4;
            default:
                return ((msh) obj).toString();
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
