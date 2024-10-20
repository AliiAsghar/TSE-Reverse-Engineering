package defpackage;

import j$.util.Objects;
import j$.util.function.Function$CC;
import java.net.InetAddress;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aiec implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ aiec(int i) {
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
        long j;
        switch (this.a) {
            case 0:
                return ((aidi) obj).a;
            case 1:
                aozy createBuilder = aled.a.createBuilder();
                createBuilder.aG(((aidj) obj).a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aled) createBuilder.b).c = 1L;
                return (aled) createBuilder.s();
            case 2:
                aidi aidiVar = (aidi) obj;
                aozy createBuilder2 = aled.a.createBuilder();
                createBuilder2.aG(aidiVar.a.a);
                aieg aiegVar = (aieg) aidiVar.b.orElseThrow();
                if (aiegVar.b == 1) {
                    j = ((Long) aiegVar.c).longValue();
                } else {
                    j = 0;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((aled) createBuilder2.b).c = j;
                return (aled) createBuilder2.s();
            case 3:
                return ((atka) obj).e();
            case 4:
                return ((atjw) obj).e();
            case 5:
                return ((aihx) obj).a();
            case 6:
                return ((aihx) obj).a;
            case 7:
                InetAddress inetAddress = (InetAddress) obj;
                advp advpVar = aihw.a;
                return inetAddress;
            case 8:
                Integer num = (Integer) obj;
                advp advpVar2 = aihw.a;
                return num;
            case 9:
                Integer num2 = (Integer) obj;
                advp advpVar3 = aihw.a;
                return num2;
            case 10:
                ahlp ahlpVar = (ahlp) obj;
                advp advpVar4 = aihw.a;
                return ahlpVar;
            case 11:
                atmx atmxVar = (atmx) obj;
                boolean z = atmxVar instanceof atmb;
                int i = aiie.a;
                if (z) {
                    return ((atmb) atmxVar).c.b(true);
                }
                if (atmxVar instanceof atng) {
                    return ((atng) atmxVar).d.b(true);
                }
                if (atmxVar instanceof atka) {
                    return ((atka) atmxVar).e().getHostAddress();
                }
                if (atmxVar instanceof atjw) {
                    return ((atjw) atmxVar).e().getHostAddress();
                }
                throw new IllegalStateException("unexpected record type in response");
            case 12:
                return ((InetAddress) obj).getHostAddress();
            case 13:
                return ((aiiy) obj).a;
            case 14:
                return ((aikh) obj).a;
            case 15:
                advp advpVar5 = ailk.a;
                return ((aill) obj).a;
            case 16:
                advp advpVar6 = ailk.a;
                return ((aill) obj).b;
            case 17:
                return Objects.toString((aill) obj);
            case 18:
                return anbj.a((String) obj);
            case 19:
                return ((ajqb) obj).c;
            default:
                return Long.valueOf(((aifc) obj).a());
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
