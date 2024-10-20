package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ugo implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ugo(int i) {
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
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(sni.c.a);
                arrayList.add(sni.c.c);
                arrayList.add(sni.c.q);
                arrayList.add(sni.c.aq);
                return (smv[]) arrayList.toArray(new smv[arrayList.size()]);
            case 1:
                usk uskVar = (usk) obj;
                uuf uufVar = ugu.a;
                return new ste[]{(ste) uskVar.a, (ste) uskVar.f, (ste) uskVar.b};
            case 2:
                sxo sxoVar = (sxo) obj;
                uuf uufVar2 = ugu.a;
                return new sxp[]{sxoVar.a, sxoVar.n, sxoVar.k};
            case 3:
                tar tarVar = (tar) obj;
                uuf uufVar3 = ugu.a;
                return new tas[]{tarVar.a, tarVar.m, tarVar.h, tarVar.f, tarVar.r};
            case 4:
                int i = ugq.b;
                return ((smu) obj).a;
            case 5:
                int i2 = ugr.b;
                return ((usk) obj).a;
            case 6:
                int i3 = ugr.b;
                return ((usk) obj).a;
            case 7:
                int i4 = ugs.b;
                return ((sxo) obj).a;
            case 8:
                int i5 = ugs.b;
                return ((sxo) obj).a;
            case 9:
                int i6 = ugt.b;
                return ((tar) obj).a;
            case 10:
                int i7 = ugt.b;
                return ((tar) obj).a;
            case 11:
                return ((MessageCoreData) obj).t();
            case 12:
                return ((Uri) obj).toString();
            case 13:
                return albo.ag(((msh) obj).j(((Boolean) new msn(18).get()).booleanValue()));
            case 14:
                syc sycVar = (syc) obj;
                alog alogVar = ugz.a;
                sycVar.g(sni.c.a);
                sycVar.A(false);
                sycVar.q(false);
                sycVar.O(ugz.a);
                return sycVar;
            case 15:
                tbd tbdVar = (tbd) obj;
                tbdVar.r(-2);
                return tbdVar;
            case 16:
                tbd tbdVar2 = (tbd) obj;
                alvi alviVar = uhg.a;
                tbdVar2.q(-1);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 2000) {
                    agnc.t("sim_slot_id", intValue);
                }
                tbdVar2.U(new agoi("participants.sim_slot_id", 7, -1));
                return tbdVar2;
            case 17:
                tbd tbdVar3 = (tbd) obj;
                alvi alviVar2 = uhg.a;
                tbdVar3.p(-1);
                tbdVar3.s();
                return tbdVar3;
            case 18:
                snh snhVar = (snh) obj;
                snhVar.U(new agme("conversations.current_self_id", 3, uhg.d));
                return snhVar;
            case 19:
                return ((wxb) obj).c;
            default:
                return (String) ((Pair) obj).second;
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
