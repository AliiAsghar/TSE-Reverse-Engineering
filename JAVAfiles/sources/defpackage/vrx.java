package defpackage;

import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vrx implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ vrx(int i) {
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
        Integer valueOf3;
        Object obj2;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                long longValue = ((Long) obj).longValue();
                return new vsa(albo.D(new vrz(longValue, i)), longValue);
            case 1:
                return ((vsa) obj).a;
            case 2:
                smr smrVar = (smr) obj;
                smrVar.getClass();
                return new vsa(new vvk(smrVar, i2), yyb.cE(smrVar.F()));
            case 3:
                alwo alwoVar = vsj.a;
                return Optional.ofNullable(((GroupInfo) obj).c);
            case 4:
                return ((GroupInfo) obj).a;
            case 5:
                return ((GroupInfo) obj).d;
            case 6:
                jat jatVar = (jat) obj;
                jatVar.getClass();
                return jatVar.e;
            case 7:
                return Integer.valueOf(((smr) obj).h());
            case 8:
                ifq ifqVar = (ifq) obj;
                ifqVar.getClass();
                return ifqVar.c;
            case 9:
                return ((uvm) obj).a;
            case 10:
                return ((xtg) obj).g;
            case 11:
                snh snhVar = (snh) obj;
                alwo alwoVar2 = vtr.a;
                snhVar.u("");
                return snhVar;
            case 12:
                snh snhVar2 = (snh) obj;
                alwo alwoVar3 = vtr.a;
                snhVar2.e(2);
                snhVar2.b(new vrx(11), new vrx(13), new vrx(14), new vrx(15), new vrx(16), new vrx(17));
                return snhVar2;
            case 13:
                snh snhVar3 = (snh) obj;
                snhVar3.v();
                return snhVar3;
            case 14:
                snh snhVar4 = (snh) obj;
                alwo alwoVar4 = vtr.a;
                snhVar4.s("");
                return snhVar4;
            case 15:
                snh snhVar5 = (snh) obj;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 40050) {
                    agnc.t("rcs_conference_uri", intValue);
                }
                snhVar5.U(new agmg("conversations.rcs_conference_uri", 5));
                return snhVar5;
            case 16:
                snh snhVar6 = (snh) obj;
                alwo alwoVar5 = vtr.a;
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 58540) {
                    agnc.t("rcs_group_self_msisdn", intValue2);
                }
                snhVar6.U(new agmd("conversations.rcs_group_self_msisdn", 1, ""));
                return snhVar6;
            case 17:
                snh snhVar7 = (snh) obj;
                valueOf3 = Integer.valueOf(a.bp().c());
                int intValue3 = valueOf3.intValue();
                if (intValue3 < 58540) {
                    agnc.t("rcs_group_self_msisdn", intValue3);
                }
                snhVar7.U(new agmg("conversations.rcs_group_self_msisdn", 5));
                return snhVar7;
            case 18:
                alwo alwoVar6 = vub.a;
                return rxn.g((String) obj).a();
            case 19:
                snh snhVar8 = (snh) obj;
                alwo alwoVar7 = vum.a;
                snhVar8.e(2);
                snhVar8.n(2);
                return snhVar8;
            default:
                obj2 = ((qei) obj).d;
                return obj2;
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
