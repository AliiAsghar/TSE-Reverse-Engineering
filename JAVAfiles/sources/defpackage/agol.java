package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Predicate$CC;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agol implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agol(Object obj, int i) {
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
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.function.BiPredicate, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        boolean z;
        String str;
        boolean test;
        switch (this.b) {
            case 0:
                return ((agoz) obj).H((String) this.a);
            case 1:
                booleanValue = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue;
            case 2:
                return ((alpt) this.a).contains((String) obj);
            case 3:
                if (!((alpt) this.a).contains((String) obj)) {
                    return true;
                }
                return false;
            case 4:
                int i = agwn.g;
                return ((String) obj).contentEquals((CharSequence) this.a);
            case 5:
                int i2 = aiel.a;
                return ((ales) this.a).o.contains((Long) obj);
            case 6:
                advp advpVar = aihw.a;
                if ((this.a instanceof Inet4Address) == (((aihx) obj).a instanceof Inet4Address)) {
                    return true;
                }
                return false;
            case 7:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null && (!((ailk) this.a).b.a || (inetAddress instanceof Inet4Address))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    advp advpVar2 = ailk.a;
                    if (inetAddress == null) {
                        str = "null";
                    } else {
                        str = "IPv6 result in force IPv4 mode";
                    }
                    advr.r(advpVar2, "dropping InetAddress from SIP discovery: [%s]", str);
                }
                return z;
            case 8:
                return ((ailn) this.a).b.equals(((ailp) obj).b());
            case 9:
                int i3 = ajsg.a;
                return ((ajsf) obj).b.getName().equals(((Class) this.a).getName());
            case 10:
                int i4 = ajsg.a;
                return ((ajsf) obj).a.e((ContentType) this.a);
            case 11:
                if (!((akos) this.a).m()) {
                    return true;
                }
                return false;
            case 12:
                return ((akwk) this.a).a(((akwr) obj).a());
            case 13:
                return ((Enum) obj).toString().equals(((albi) this.a.get(0)).e);
            case 14:
                return ((Enum) obj).toString().equals(((albi) this.a).e);
            default:
                Map.Entry entry = (Map.Entry) obj;
                test = this.a.test(entry.getKey(), entry.getValue());
                return test;
        }
    }
}
