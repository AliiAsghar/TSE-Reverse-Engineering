package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoue {
    public static volatile aqux a;

    public static final /* synthetic */ aoto a(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aoto) s;
    }

    public static final void b(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aoto aotoVar = (aoto) aozyVar.b;
        aoto aotoVar2 = aoto.a;
        aotoVar.b = aozbVar;
    }

    public static aozu c(Object obj) {
        return ((apab) obj).l;
    }

    public static aozu d(Object obj) {
        return ((apab) obj).a();
    }

    public static void e(aozh aozhVar, Object obj, aozs aozsVar, aozu aozuVar) {
        apae apaeVar = (apae) obj;
        aozuVar.n(apaeVar.d, aozhVar.t(apaeVar.c.getClass(), aozsVar));
    }

    public static final void f(Object obj) {
        c(obj).f();
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i != 2) {
            return "INTENT";
        }
        return "AIDL";
    }

    public static final aped i(apea apeaVar) {
        apdz apdzVar = (apdz) apeaVar;
        if ((apdzVar.b & 4) != 0) {
            aped apedVar = apdzVar.d;
            if (apedVar == null) {
                return aped.a;
            }
            return apedVar;
        }
        return null;
    }

    public static final aozn j(Duration duration) {
        aozn i = aotl.i(duration);
        i.getClass();
        return i;
    }

    public static final apct k(Instant instant) {
        instant.getClass();
        apct j = aotl.j(instant);
        j.getClass();
        return j;
    }

    public static final Duration l(aozn aoznVar) {
        Duration k = aotl.k(aoznVar);
        k.getClass();
        return k;
    }

    public static final Instant m(apct apctVar) {
        Instant l = aotl.l(apctVar);
        l.getClass();
        return l;
    }

    public static void n(aojj aojjVar, Map.Entry entry) {
        apad apadVar = (apad) entry.getKey();
        if (apadVar.d) {
            apdf apdfVar = apdf.DOUBLE;
            switch (apadVar.c) {
                case DOUBLE:
                    apck.r(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case FLOAT:
                    apck.v(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case INT64:
                    apck.y(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case UINT64:
                    apck.G(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case INT32:
                    apck.x(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case FIXED64:
                    apck.u(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case FIXED32:
                    apck.t(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case BOOL:
                    apck.p(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case STRING:
                    apck.E(apadVar.b, (List) entry.getValue(), aojjVar);
                    return;
                case GROUP:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        apck.w(apadVar.b, (List) entry.getValue(), aojjVar, apcc.a.a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case MESSAGE:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        apck.z(apadVar.b, (List) entry.getValue(), aojjVar, apcc.a.a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case BYTES:
                    apck.q(apadVar.b, (List) entry.getValue(), aojjVar);
                    return;
                case UINT32:
                    apck.F(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case ENUM:
                    apck.x(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case SFIXED32:
                    apck.A(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case SFIXED64:
                    apck.B(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case SINT32:
                    apck.C(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                case SINT64:
                    apck.D(apadVar.b, (List) entry.getValue(), aojjVar, apadVar.e);
                    return;
                default:
                    return;
            }
        }
        apdf apdfVar2 = apdf.DOUBLE;
        switch (apadVar.c) {
            case DOUBLE:
                aojjVar.f(apadVar.b, ((Double) entry.getValue()).doubleValue());
                return;
            case FLOAT:
                aojjVar.j(apadVar.b, ((Float) entry.getValue()).floatValue());
                return;
            case INT64:
                aojjVar.m(apadVar.b, ((Long) entry.getValue()).longValue());
                return;
            case UINT64:
                aojjVar.v(apadVar.b, ((Long) entry.getValue()).longValue());
                return;
            case INT32:
                aojjVar.l(apadVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case FIXED64:
                aojjVar.i(apadVar.b, ((Long) entry.getValue()).longValue());
                return;
            case FIXED32:
                aojjVar.h(apadVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case BOOL:
                aojjVar.d(apadVar.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case STRING:
                aojjVar.t(apadVar.b, (String) entry.getValue());
                return;
            case GROUP:
                aojjVar.k(apadVar.b, entry.getValue(), apcc.a.a(entry.getValue().getClass()));
                return;
            case MESSAGE:
                aojjVar.n(apadVar.b, entry.getValue(), apcc.a.a(entry.getValue().getClass()));
                return;
            case BYTES:
                aojjVar.e(apadVar.b, (aozb) entry.getValue());
                return;
            case UINT32:
                aojjVar.u(apadVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case ENUM:
                aojjVar.l(apadVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED32:
                aojjVar.p(apadVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED64:
                aojjVar.q(apadVar.b, ((Long) entry.getValue()).longValue());
                return;
            case SINT32:
                aojjVar.r(apadVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case SINT64:
                aojjVar.s(apadVar.b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
