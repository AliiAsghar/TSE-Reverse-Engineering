package defpackage;

import com.android.vcard.VCardConfig;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mht implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mht(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                alhr alhrVar = mic.h;
                String f = ((rve) obj).f();
                Object obj2 = this.a;
                aozy aozyVar = (aozy) obj2;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amgu amguVar = (amgu) ((amgl) obj2).b;
                amgu amguVar2 = amgu.a;
                amguVar.b = Integer.MIN_VALUE | amguVar.b;
                amguVar.H = f;
                return;
            case 1:
                alhr alhrVar2 = mic.h;
                String f2 = ((rve) obj).f();
                Object obj3 = this.a;
                aozy aozyVar2 = (aozy) obj3;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amgu amguVar3 = (amgu) ((amgl) obj3).b;
                amgu amguVar4 = amgu.a;
                amguVar3.b = Integer.MIN_VALUE | amguVar3.b;
                amguVar3.H = f2;
                return;
            case 2:
                amgs amgsVar = (amgs) obj;
                Object obj4 = this.a;
                aozy aozyVar3 = (aozy) obj4;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                amgu amguVar5 = (amgu) ((amgl) obj4).b;
                amgu amguVar6 = amgu.a;
                amguVar5.aB = amgsVar.e;
                amguVar5.d |= 65536;
                return;
            case 3:
                amlg amlgVar = (amlg) obj;
                alhr alhrVar3 = mic.h;
                aozy createBuilder = amlh.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj5 = this.a;
                amlh amlhVar = (amlh) createBuilder.b;
                amlhVar.c = amlgVar.m;
                amlhVar.b |= 1;
                amlh amlhVar2 = (amlh) createBuilder.s();
                aozy aozyVar4 = (aozy) obj5;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                amgu amguVar7 = (amgu) ((amgl) obj5).b;
                amgu amguVar8 = amgu.a;
                amlhVar2.getClass();
                amguVar7.ao = amlhVar2;
                amguVar7.d |= 8;
                return;
            case 4:
                alhr alhrVar4 = mic.h;
                String f3 = ((rve) obj).f();
                Object obj6 = this.a;
                aozy aozyVar5 = (aozy) obj6;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                amgu amguVar9 = (amgu) ((amgl) obj6).b;
                amgu amguVar10 = amgu.a;
                amguVar9.b = Integer.MIN_VALUE | amguVar9.b;
                amguVar9.H = f3;
                return;
            case 5:
                alhr alhrVar5 = mic.h;
                String f4 = ((ruz) obj).f();
                Object obj7 = this.a;
                aozy aozyVar6 = (aozy) obj7;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                amgu amguVar11 = (amgu) ((amgl) obj7).b;
                amgu amguVar12 = amgu.a;
                amguVar11.d |= 512;
                amguVar11.au = f4;
                return;
            case 6:
                alhr alhrVar6 = mic.h;
                long min = Math.min(((Long) obj).longValue(), ((Long) mic.g.e()).longValue());
                Object obj8 = this.a;
                aozy aozyVar7 = (aozy) obj8;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                amgu amguVar13 = (amgu) ((amgl) obj8).b;
                amgu amguVar14 = amgu.a;
                amguVar13.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                amguVar13.ac = min;
                return;
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj9 = this.a;
                aozy aozyVar8 = (aozy) obj9;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                amgu amguVar15 = (amgu) ((amgl) obj9).b;
                amgu amguVar16 = amgu.a;
                amguVar15.c |= 16777216;
                amguVar15.ad = booleanValue;
                return;
            case 8:
                amxo amxoVar = (amxo) obj;
                Object obj10 = this.a;
                aozy aozyVar9 = (aozy) obj10;
                if (!aozyVar9.b.isMutable()) {
                    aozyVar9.u();
                }
                amgu amguVar17 = (amgu) ((amgl) obj10).b;
                amgu amguVar18 = amgu.a;
                amguVar17.aa = amxoVar.h;
                amguVar17.c |= 2097152;
                return;
            case 9:
                ((sya) this.a).u(((Integer) obj).intValue());
                return;
            case 10:
                ((mgm) this.a).a = Optional.of((amxb) obj);
                return;
            case 11:
                ((mgm) this.a).b = Optional.of((amgn) obj);
                return;
            case 12:
                this.a.by(((Integer) obj).intValue());
                return;
            case 13:
                this.a.bC(((Integer) obj).intValue());
                return;
            case 14:
                this.a.bF(((Integer) obj).intValue());
                return;
            case 15:
                Instant instant = (Instant) obj;
                long epochMilli = instant.toEpochMilli();
                ?? r2 = this.a;
                r2.bE(epochMilli);
                r2.bz(instant.toEpochMilli());
                return;
            case 16:
                this.a.bO((tqu) obj);
                return;
            case 17:
                ((sya) this.a).N((tqu) obj);
                return;
            case 18:
                ((sya) this.a).x((rve) obj);
                return;
            case 19:
                ((sya) this.a).E(((Integer) obj).intValue());
                return;
            default:
                ((sya) this.a).k(((Boolean) obj).booleanValue());
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
