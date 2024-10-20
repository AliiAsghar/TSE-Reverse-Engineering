package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kza implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kza(Object obj, int i) {
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 5;
        int i2 = 2;
        switch (this.b) {
            case 0:
                return ((aglz) this.a).an((String) obj);
            case 1:
                String str = ((qei) obj).d;
                if (TextUtils.isEmpty(str)) {
                    kpa.a.o("Skip Phone bind because RCS MSISDN is empty");
                    return aktp.ag(null);
                }
                Object obj2 = this.a;
                kpa kpaVar = (kpa) obj2;
                return ((vbs) kpaVar.g.b()).d(str, 3).i(new jab(i2), kpaVar.h).i(new ikd(obj2, str, 10), kpaVar.h);
            case 2:
                return ((aglz) this.a).an((String) obj);
            case 3:
                smo smoVar = (smo) obj;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 4:
                slc slcVar = (slc) obj;
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 5:
                lcy lcyVar = (lcy) obj;
                lcyVar.W(lga.u(((lcq) this.a).c));
                return lcyVar;
            case 6:
                lcy lcyVar2 = (lcy) obj;
                Object obj3 = this.a;
                lcyVar2.b(new kza(obj3, 16), new kza(obj3, 17));
                return lcyVar2;
            case 7:
                lcy lcyVar3 = (lcy) obj;
                lcyVar3.W(lga.v(((lcq) this.a).c));
                return lcyVar3;
            case 8:
                lcq lcqVar = (lcq) this.a;
                lcy lcyVar4 = (lcy) obj;
                lcyVar4.W(lga.t(lcqVar.c));
                lcyVar4.o(lcqVar.a);
                return lcyVar4;
            case 9:
                lcy lcyVar5 = (lcy) obj;
                Object obj4 = this.a;
                lcyVar5.b(new kza(obj4, 12), new kza(obj4, 13));
                return lcyVar5;
            case 10:
                lcy lcyVar6 = (lcy) obj;
                lcyVar6.W(lga.u(((lcq) this.a).c));
                return lcyVar6;
            case 11:
                lcq lcqVar2 = (lcq) this.a;
                lcy lcyVar7 = (lcy) obj;
                lcyVar7.W(lga.t(lcqVar2.c));
                lcyVar7.n(lcqVar2.a);
                lcyVar7.h(lcqVar2.b.a);
                return lcyVar7;
            case 12:
                lcy lcyVar8 = (lcy) obj;
                lcyVar8.W(lga.v(((lcq) this.a).c));
                return lcyVar8;
            case 13:
                lcq lcqVar3 = (lcq) this.a;
                lcy lcyVar9 = (lcy) obj;
                lcyVar9.W(lga.t(lcqVar3.c));
                lcyVar9.q(lcqVar3.a);
                return lcyVar9;
            case 14:
                lcy lcyVar10 = (lcy) obj;
                lcyVar10.o(((lcq) this.a).a);
                return lcyVar10;
            case 15:
                lcq lcqVar4 = (lcq) this.a;
                lcy lcyVar11 = (lcy) obj;
                lcyVar11.n(lcqVar4.a);
                lcyVar11.h(lcqVar4.b.a);
                return lcyVar11;
            case 16:
                lcy lcyVar12 = (lcy) obj;
                lcyVar12.p(((lcq) this.a).a);
                return lcyVar12;
            case 17:
                lcq lcqVar5 = (lcq) this.a;
                lcy lcyVar13 = (lcy) obj;
                lcyVar13.n(lcqVar5.a);
                lcyVar13.j(lcqVar5.b.a);
                return lcyVar13;
            case 18:
                lcy lcyVar14 = (lcy) obj;
                Object obj5 = this.a;
                lcyVar14.b(new kza(obj5, 14), new kza(obj5, 15));
                return lcyVar14;
            case 19:
                lcy lcyVar15 = (lcy) obj;
                Object obj6 = this.a;
                lcyVar15.b(new kza(obj6, i), new kza(obj6, 8), new kza(obj6, 11));
                return lcyVar15;
            default:
                lcy lcyVar16 = (lcy) obj;
                Object obj7 = this.a;
                lcyVar16.b(new ldg(obj7, 4), new ldg(obj7, i));
                return lcyVar16;
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
