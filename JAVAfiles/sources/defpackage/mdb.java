package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdb extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdb(arqy arqyVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, arsb arsbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.i = i;
        this.f = arqyVar;
        this.b = obj;
        this.d = obj2;
        this.g = obj3;
        this.c = obj4;
        this.h = obj5;
        this.e = arsbVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                return ((mdb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((mdb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((mdb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v15, types: [arqy, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object F;
        Object e;
        List list;
        ascd ascdVar;
        Object c;
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                arpl arplVar = arpl.a;
                int i2 = this.a;
                aqil.P(obj);
                if (i2 == 0) {
                    this.f.f(this.b, this.d, this.g, this.c, this.h);
                    this.a = 1;
                    if (arwi.m(1000L, this) == arplVar) {
                        return arplVar;
                    }
                }
                ((arsb) this.e).a = null;
                return arnb.a;
            }
            arpl arplVar2 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
                e = obj;
            } else {
                aqil.P(obj);
                Object obj2 = this.d;
                Object obj3 = this.g;
                Object obj4 = this.b;
                this.a = 1;
                e = ((ked) obj2).e((String) obj3, (kdv) obj4, this);
                if (e == arplVar2) {
                    return arplVar2;
                }
            }
            armo armoVar = (armo) e;
            String str = (String) armoVar.a;
            List list2 = (List) armoVar.b;
            if (((Boolean) ((utz) yig.W.get()).e()).booleanValue()) {
                ?? r3 = this.h;
                list = new ArrayList();
                for (Object obj5 : r3) {
                    aeig aeigVar = (aeig) obj5;
                    if (!(aeigVar instanceof aeie) || ((aeie) aeigVar).a.ordinal() != 2) {
                        list.add(obj5);
                    }
                }
            } else {
                list = arnv.a;
            }
            List d = ked.d(aqjn.aq(aqjn.aq(this.c, list), list2));
            ((ked) this.d).e.put(((kdv) this.b).q.a(), new kds(str, d));
            if ((!list2.isEmpty() || !this.h.isEmpty()) && (ascdVar = (ascd) ((arsb) this.e).a) != null) {
                ?? r12 = this.f;
                do {
                    c = ascdVar.c();
                } while (!ascdVar.g(c, aezf.h((aezf) c, str, ked.d(aqjn.aq(d, r12)), null, kac.p, null, false, 2096636)));
            }
            return arnb.a;
        }
        arpl arplVar3 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
            F = obj;
        } else {
            aqil.P(obj);
            Object obj6 = this.b;
            Object obj7 = this.e;
            Object obj8 = this.f;
            Object obj9 = this.d;
            Object obj10 = this.g;
            Object obj11 = this.c;
            final amqi amqiVar = (amqi) this.h;
            final amqh amqhVar = (amqh) obj11;
            final amqf amqfVar = (amqf) obj10;
            final amqe amqeVar = (amqe) obj9;
            final Duration duration = (Duration) obj8;
            final Integer num = (Integer) obj7;
            final mdc mdcVar = (mdc) obj6;
            akul k = ((mdy) obj6).k(new Supplier() { // from class: mda
                @Override // java.util.function.Supplier
                public final Object get() {
                    Integer b;
                    aozy createBuilder = amqg.a.createBuilder();
                    createBuilder.getClass();
                    aozy createBuilder2 = amqj.a.createBuilder();
                    createBuilder2.getClass();
                    akec.X(amqhVar, createBuilder2);
                    akec.Y(amqiVar, createBuilder2);
                    akec.ab(akec.W(createBuilder2), createBuilder);
                    Integer num2 = num;
                    if (num2 != null) {
                        akec.ac(num2.intValue(), createBuilder);
                    }
                    Duration duration2 = duration;
                    if (duration2 != null && (b = mdcVar.b(duration2)) != null) {
                        akec.aa(b.intValue(), createBuilder);
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amqe amqeVar2 = amqeVar;
                    amqg amqgVar = (amqg) createBuilder.b;
                    amqgVar.d = Integer.valueOf(amqeVar2.r);
                    amqgVar.c = 101;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amqf amqfVar2 = amqfVar;
                    amqg amqgVar2 = (amqg) createBuilder.b;
                    amqgVar2.f = Integer.valueOf(amqfVar2.f);
                    amqgVar2.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                    return akec.Z(createBuilder);
                }
            });
            k.getClass();
            this.a = 1;
            F = arro.F(k, this);
            if (F == arplVar3) {
                return arplVar3;
            }
        }
        if (!((Boolean) F).booleanValue()) {
            alvw i3 = mdc.a.i();
            i3.X(alwp.a, "BugleComposeRow2");
            ((alvg) i3.h("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger$logScreenOpened$1", "invokeSuspend", 79, "ComposeNavigationEventLogger.kt")).D("Failed to log opening ComposeNavigationEvent for %s, %s", this.c, this.d);
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [arqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                return new mdb((arqy) this.f, this.b, this.d, this.g, this.c, this.h, (arsb) this.e, arpeVar, 2);
            }
            Object obj2 = this.d;
            Object obj3 = this.g;
            Object obj4 = this.b;
            return new mdb((ked) obj2, (String) obj3, (kdv) obj4, (List) this.h, (List) this.c, (arsb) this.e, (List) this.f, arpeVar, 1);
        }
        Object obj5 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.d;
        Object obj8 = this.e;
        Object obj9 = this.f;
        return new mdb((mdc) obj5, (amqh) obj6, (amqe) obj7, (Integer) obj8, (Duration) obj9, (amqf) this.g, (amqi) this.h, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdb(ked kedVar, String str, kdv kdvVar, List list, List list2, arsb arsbVar, List list3, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.i = i;
        this.d = kedVar;
        this.g = str;
        this.b = kdvVar;
        this.h = list;
        this.c = list2;
        this.e = arsbVar;
        this.f = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdb(mdc mdcVar, amqh amqhVar, amqe amqeVar, Integer num, Duration duration, amqf amqfVar, amqi amqiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.i = i;
        this.b = mdcVar;
        this.c = amqhVar;
        this.d = amqeVar;
        this.e = num;
        this.f = duration;
        this.g = amqfVar;
        this.h = amqiVar;
    }
}
