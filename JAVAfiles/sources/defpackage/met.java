package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class met implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ met(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                ((akia) this.a).g((ahmb) obj);
                return;
            case 1:
                String bm = yyb.bm((String) obj);
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amkn amknVar = (amkn) aozyVar.b;
                amkn amknVar2 = amkn.a;
                bm.getClass();
                amknVar.b |= 1;
                amknVar.c = bm;
                return;
            case 2:
                ((ahnh) this.a).c = (maf) obj;
                return;
            case 3:
                ((ahqx) this.a).e = algw.i((ahpp) obj);
                return;
            case 4:
                long longValue = ((Long) obj).longValue();
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amiq amiqVar = (amiq) aozyVar2.b;
                amiq amiqVar2 = amiq.a;
                amiqVar.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                amiqVar.ab = longValue;
                return;
            case 5:
                amlx amlxVar = (amlx) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                amiq amiqVar3 = (amiq) aozyVar3.b;
                amiq amiqVar4 = amiq.a;
                amiqVar3.ac = amlxVar.t;
                amiqVar3.c |= 16777216;
                return;
            case 6:
                akul a = ((nbt) obj).a();
                Object obj2 = this.a;
                qiu.h(a.h(new mds(obj2, 3), ((mfo) obj2).y));
                return;
            case 7:
                String str = (String) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                amiq amiqVar5 = (amiq) aozyVar4.b;
                amiq amiqVar6 = amiq.a;
                str.getClass();
                amiqVar5.d |= 1;
                amiqVar5.ak = str;
                return;
            case 8:
                akul a2 = ((wtw) obj).a();
                Object obj3 = this.a;
                a2.k(qjc.a(new isn(obj3, 4)), ((mfo) obj3).x);
                return;
            case 9:
                long longValue2 = ((Long) obj).longValue();
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                amiq amiqVar7 = (amiq) aozyVar5.b;
                amiq amiqVar8 = amiq.a;
                amiqVar7.c |= 524288;
                amiqVar7.X = longValue2;
                return;
            case 10:
                long longValue3 = ((Long) obj).longValue();
                aozy aozyVar6 = (aozy) this.a;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                amiq amiqVar9 = (amiq) aozyVar6.b;
                amiq amiqVar10 = amiq.a;
                amiqVar9.c |= 1048576;
                amiqVar9.Y = longValue3;
                return;
            case 11:
                long longValue4 = ((Long) obj).longValue();
                aozy aozyVar7 = (aozy) this.a;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                amiq amiqVar11 = (amiq) aozyVar7.b;
                amiq amiqVar12 = amiq.a;
                amiqVar11.c |= 2097152;
                amiqVar11.Z = longValue4;
                return;
            case 12:
                long longValue5 = ((Long) obj).longValue();
                aozy aozyVar8 = (aozy) this.a;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                amiq amiqVar13 = (amiq) aozyVar8.b;
                amiq amiqVar14 = amiq.a;
                amiqVar13.c |= 4194304;
                amiqVar13.aa = longValue5;
                return;
            case 13:
                amgn amgnVar = (amgn) obj;
                Object obj4 = this.a;
                aozy aozyVar9 = (aozy) obj4;
                if (!aozyVar9.b.isMutable()) {
                    aozyVar9.u();
                }
                amgu amguVar = (amgu) ((amgl) obj4).b;
                amgu amguVar2 = amgu.a;
                amguVar.ak = amgnVar.d;
                amguVar.c |= Integer.MIN_VALUE;
                return;
            case 14:
                amgq amgqVar = (amgq) obj;
                Object obj5 = this.a;
                aozy aozyVar10 = (aozy) obj5;
                if (!aozyVar10.b.isMutable()) {
                    aozyVar10.u();
                }
                amgu amguVar3 = (amgu) ((amgl) obj5).b;
                amgu amguVar4 = amgu.a;
                amguVar3.al = amgqVar.d;
                amguVar3.d |= 1;
                return;
            case 15:
                amgo amgoVar = (amgo) obj;
                Object obj6 = this.a;
                aozy aozyVar11 = (aozy) obj6;
                if (!aozyVar11.b.isMutable()) {
                    aozyVar11.u();
                }
                amgu amguVar5 = (amgu) ((amgl) obj6).b;
                amgu amguVar6 = amgu.a;
                amguVar5.am = amgoVar.d;
                amguVar5.d |= 2;
                return;
            case 16:
                long longValue6 = ((Long) obj).longValue();
                Object obj7 = this.a;
                aozy aozyVar12 = (aozy) obj7;
                if (!aozyVar12.b.isMutable()) {
                    aozyVar12.u();
                }
                amgu amguVar7 = (amgu) ((amgl) obj7).b;
                amgu amguVar8 = amgu.a;
                amguVar7.d |= 131072;
                amguVar7.aC = longValue6;
                return;
            case 17:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj8 = this.a;
                aozy aozyVar13 = (aozy) obj8;
                if (!aozyVar13.b.isMutable()) {
                    aozyVar13.u();
                }
                amgu amguVar9 = (amgu) ((amgl) obj8).b;
                amgu amguVar10 = amgu.a;
                amguVar9.c |= 1073741824;
                amguVar9.aj = booleanValue;
                return;
            case 18:
                alhr alhrVar = mic.h;
                String f = ((rve) obj).f();
                Object obj9 = this.a;
                aozy aozyVar14 = (aozy) obj9;
                if (!aozyVar14.b.isMutable()) {
                    aozyVar14.u();
                }
                amgu amguVar11 = (amgu) ((amgl) obj9).b;
                amgu amguVar12 = amgu.a;
                amguVar11.b = Integer.MIN_VALUE | amguVar11.b;
                amguVar11.H = f;
                return;
            case 19:
                alhr alhrVar2 = mic.h;
                String f2 = ((ruz) obj).f();
                Object obj10 = this.a;
                aozy aozyVar15 = (aozy) obj10;
                if (!aozyVar15.b.isMutable()) {
                    aozyVar15.u();
                }
                amgu amguVar13 = (amgu) ((amgl) obj10).b;
                amgu amguVar14 = amgu.a;
                amguVar13.d |= 512;
                amguVar13.au = f2;
                return;
            default:
                amfg v = lgb.v((Integer) obj);
                Object obj11 = this.a;
                aozy aozyVar16 = (aozy) obj11;
                if (!aozyVar16.b.isMutable()) {
                    aozyVar16.u();
                }
                amgu amguVar15 = (amgu) ((amgl) obj11).b;
                amgu amguVar16 = amgu.a;
                amguVar15.r = v.f;
                amguVar15.b |= 16384;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
