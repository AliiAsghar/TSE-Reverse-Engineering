package defpackage;

import android.net.Uri;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ter implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ter(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    Object obj2 = this.a;
                    ((tes) obj2).a = String.valueOf(l);
                    ((aglz) obj2).fE(0);
                    return;
                }
                return;
            case 1:
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    Object obj3 = this.a;
                    ((tdo) obj3).a = String.valueOf(l2);
                    ((aglz) obj3).fE(0);
                    return;
                }
                return;
            case 2:
                Long l3 = (Long) obj;
                if (l3.longValue() >= 0) {
                    Object obj4 = this.a;
                    ((tes) obj4).a = String.valueOf(l3);
                    ((aglz) obj4).fE(0);
                    return;
                }
                return;
            case 3:
                Long l4 = (Long) obj;
                if (l4.longValue() >= 0) {
                    Object obj5 = this.a;
                    ((tes) obj5).a = String.valueOf(l4);
                    ((aglz) obj5).fE(0);
                    return;
                }
                return;
            case 4:
                Long l5 = (Long) obj;
                if (l5.longValue() >= 0) {
                    Object obj6 = this.a;
                    ((tie) obj6).a = l5.longValue();
                    ((aglz) obj6).fE(0);
                    return;
                }
                return;
            case 5:
                Long l6 = (Long) obj;
                if (l6.longValue() >= 0) {
                    Object obj7 = this.a;
                    ((tiq) obj7).a = l6.longValue();
                    ((aglz) obj7).fE(0);
                    return;
                }
                return;
            case 6:
                Long l7 = (Long) obj;
                if (l7.longValue() >= 0) {
                    Object obj8 = this.a;
                    ((tkh) obj8).a = String.valueOf(l7);
                    ((aglz) obj8).fE(0);
                    return;
                }
                return;
            case 7:
                Long l8 = (Long) obj;
                if (l8.longValue() >= 0) {
                    Object obj9 = this.a;
                    ((tkh) obj9).a = String.valueOf(l8);
                    ((aglz) obj9).fE(0);
                    return;
                }
                return;
            case 8:
                Long l9 = (Long) obj;
                if (l9.longValue() >= 0) {
                    Object obj10 = this.a;
                    ((tla) obj10).a = l9.longValue();
                    ((aglz) obj10).fE(0);
                    return;
                }
                return;
            case 9:
                Long l10 = (Long) obj;
                if (l10.longValue() >= 0) {
                    Object obj11 = this.a;
                    ((tod) obj11).a = String.valueOf(l10);
                    ((aglz) obj11).fE(0);
                    return;
                }
                return;
            case 10:
                Long l11 = (Long) obj;
                if (l11.longValue() >= 0) {
                    Object obj12 = this.a;
                    ((tox) obj12).a = l11.longValue();
                    ((aglz) obj12).fE(0);
                    return;
                }
                return;
            case 11:
                String f = ((rve) obj).f();
                Object obj13 = this.a;
                aozy aozyVar = (aozy) obj13;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amgu amguVar = (amgu) ((amgl) obj13).b;
                amgu amguVar2 = amgu.a;
                amguVar.b |= Integer.MIN_VALUE;
                amguVar.H = f;
                return;
            case 12:
                String f2 = ((rve) obj).f();
                Object obj14 = this.a;
                aozy aozyVar2 = (aozy) obj14;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amgu amguVar3 = (amgu) ((amgl) obj14).b;
                amgu amguVar4 = amgu.a;
                amguVar3.c |= 32768;
                amguVar3.T = f2;
                return;
            case 13:
                ((alob) this.a).h(((qei) obj).d);
                return;
            case 14:
                rve rveVar = (rve) obj;
                xyo c = twv.a.c();
                c.H("Update original RcsMessageId.");
                ?? r1 = this.a;
                c.g(r1.E());
                c.z("OriginalRcsMessageId", rveVar.f());
                c.q();
                r1.bu(rveVar);
                return;
            case 15:
                rve rveVar2 = (rve) obj;
                tcb tcbVar = new tcb();
                tcbVar.f("removePendingFtdMessage");
                tcbVar.b(new ttr(rveVar2, 16));
                int d = tcbVar.d();
                xyo c2 = twy.a.c();
                c2.H("Removed the pending message");
                c2.g(rveVar2);
                c2.x("count", d);
                c2.q();
                return;
            case 16:
                ((yve) ((armf) obj).b()).c(this.a);
                return;
            case 17:
                ((yvs) ((armf) obj).b()).d(this.a);
                return;
            case 18:
                ((alob) this.a).h((uha) obj);
                return;
            case 19:
                alpt alptVar = ukj.a;
                ((hgi) this.a).n("sms_verification_brand_logo_key", ((Uri) obj).toString());
                return;
            default:
                Map.EL.forEach((java.util.Map) obj, new lui(this.a, 5));
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
