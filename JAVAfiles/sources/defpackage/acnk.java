package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acnk implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ acnk(int i) {
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
        int i = 1;
        switch (this.a) {
            case 0:
                advp advpVar = acno.d;
                return Boolean.valueOf("tel".equals(((Configuration) obj).c().A));
            case 1:
                advp advpVar2 = acno.d;
                return ((Configuration) obj).c().n;
            case 2:
                return ((acox) obj).b;
            case 3:
                advp advpVar3 = acno.d;
                return Boolean.valueOf(((Configuration) obj).mServicesConfiguration.mGroupChatAuth);
            case 4:
                advp advpVar4 = acno.d;
                return Boolean.valueOf(((Configuration) obj).mServicesConfiguration.mGeoLocPushAuth);
            case 5:
                advp advpVar5 = acno.d;
                return ((adum) obj).e;
            case 6:
                int i2 = acnz.e;
                advr.i((Throwable) obj, "Fail to log RCS process uptime to clearcut!", new Object[0]);
                return null;
            case 7:
                int i3 = acnz.e;
                advr.i((Throwable) obj, "Fail to log network status times reset event to clearcut!", new Object[0]);
                return null;
            case 8:
                acpp acppVar = (acpp) obj;
                acpq acpqVar = acpq.a;
                aozy createBuilder = apka.a.createBuilder();
                String b = acppVar.b();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apka apkaVar = (apka) createBuilder.b;
                b.getClass();
                apkaVar.b = 1 | apkaVar.b;
                apkaVar.c = b;
                String obj2 = acppVar.a().toString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apka apkaVar2 = (apka) createBuilder.b;
                obj2.getClass();
                apkaVar2.b |= 2;
                apkaVar2.d = obj2;
                return (apka) createBuilder.s();
            case 9:
                aotw aotwVar = (aotw) obj;
                if (aotwVar.c == 3) {
                    return (aouh) aotwVar.d;
                }
                return aouh.c;
            case 10:
                return Boolean.valueOf(((aouh) obj).C);
            case 11:
                advp advpVar6 = acpt.x;
                aozn aoznVar = ((aouh) obj).l;
                if (aoznVar == null) {
                    aoznVar = aozn.a;
                }
                return Integer.valueOf((int) apdp.a(aoznVar));
            case 12:
                return ((aouh) obj).A;
            case 13:
                return ((aouh) obj).j;
            case 14:
                return Boolean.valueOf(((aouh) obj).z);
            case 15:
                return Integer.valueOf(((aouh) obj).k);
            case 16:
                int T = a.T(((aouh) obj).D);
                if (T != 0) {
                    i = T;
                }
                return acpt.O(i);
            case 17:
                return Boolean.valueOf(((aouh) obj).o);
            case 18:
                aozn aoznVar2 = ((aouh) obj).I;
                if (aoznVar2 == null) {
                    return aozn.a;
                }
                return aoznVar2;
            case 19:
                return Boolean.valueOf(((aouh) obj).v);
            default:
                return Boolean.valueOf(((aouh) obj).K);
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
