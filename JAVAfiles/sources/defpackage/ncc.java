package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncc implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ncc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue;
            case 1:
                if (!((nbw) this.a).a.contains(((ncj) ((Map.Entry) obj).getValue()).getClass())) {
                    return true;
                }
                return false;
            case 2:
                return ((yjr) ((nfq) this.a).d.b()).A(((qei) ((msh) obj).e().get()).d);
            case 3:
                if (!((alpt) this.a).contains(((Recipient) obj).f())) {
                    return true;
                }
                return false;
            case 4:
                return ((String) this.a).equals((String) obj);
            case 5:
                return ((String) obj).contains(this.a);
            case 6:
                return ((pvo) this.a).a((pto) obj);
            case 7:
                return ((pul) this.a).d.a((pto) ((Map.Entry) obj).getValue());
            case 8:
                if (!((pus) this.a).c.a((pto) ((Map.Entry) obj).getValue())) {
                    return true;
                }
                return false;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                alwo alwoVar = pus.a;
                pto ptoVar = (pto) ((alor) this.a).get(entry.getKey());
                if (ptoVar != null && ((pto) entry.getValue()).b().isAfter(ptoVar.b())) {
                    return true;
                }
                return false;
            case 10:
                int i = qba.a;
                if (!((qei) obj).equals(this.a)) {
                    return true;
                }
                return false;
            case 11:
                int i2 = qbi.a;
                if (!((qei) obj).equals(this.a)) {
                    return true;
                }
                return false;
            case 12:
                return this.a.contains((qei) obj);
            case 13:
                if (((Integer) obj).intValue() == ((qwm) ((Optional) this.a).get()).e()) {
                    return true;
                }
                return false;
            case 14:
                if (!((String) obj).equals(this.a)) {
                    return true;
                }
                return false;
            case 15:
                qei qeiVar = (qei) obj;
                alwo alwoVar2 = qcu.a;
                qei qeiVar2 = ((qfm) this.a).c;
                if (qeiVar2 == null) {
                    qeiVar2 = qei.a;
                }
                if (!qeiVar.equals(qeiVar2)) {
                    return true;
                }
                return false;
            case 16:
                return this.a.contains((qei) obj);
            case 17:
                return ((alnu) this.a).contains((Integer) obj);
            case 18:
                return ((agmx) ((Map.Entry) obj).getValue()).a.equals(((qxn) this.a).l.b);
            case 19:
                AtomicBoolean atomicBoolean = qxn.a;
                return ((String) this.a).contains((String) obj);
            default:
                String str = qxq.a;
                return ((String) ((Map.Entry) obj).getKey()).startsWith(String.valueOf(((uci) this.a).f.b).concat("+"));
        }
    }
}
