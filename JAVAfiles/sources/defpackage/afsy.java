package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsy {
    public static final /* synthetic */ int a = 0;
    private static final afsz[] b = afsz.values();

    public static final afsm a(afso afsoVar, afry afryVar) {
        afsz afszVar = afsz.b;
        afszVar.getClass();
        if (afsoVar instanceof afsn) {
            return d((afsn) afsoVar, afryVar, afszVar, null);
        }
        if (afsoVar instanceof afsm) {
            return (afsm) afsoVar;
        }
        throw new armm();
    }

    public static final afsm b(afsn afsnVar, afry afryVar, Long l) {
        afsnVar.getClass();
        return d(afsnVar, afryVar, afsz.d, l);
    }

    public static final afsm c(afso afsoVar, afsp afspVar, Long l) {
        afsoVar.getClass();
        return e(afsoVar, afspVar, afsz.d, l);
    }

    public static final afsm d(afsn afsnVar, afry afryVar, afsz afszVar, Long l) {
        afmo afmoVar;
        Object obj;
        afszVar.getClass();
        Iterable f = afsnVar.f();
        afsm afsmVar = (afsm) aqjn.Y(f);
        if (afsmVar != null) {
            int ordinal = afszVar.ordinal();
            do {
                afsz afszVar2 = b[ordinal];
                if (afszVar2 == afszVar) {
                    afmoVar = new afmo(afszVar, 7);
                } else {
                    afmoVar = new afmo(afszVar2, 8);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : f) {
                    afsm afsmVar2 = (afsm) obj2;
                    if (l == null || afsmVar2.b() <= l.longValue()) {
                        if (((Boolean) afmoVar.a(afsmVar2.n())).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (afryVar.a(((afsm) obj3).l())) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it = arrayList2.iterator();
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    Object next = it.next();
                    if (it.hasNext()) {
                        long b2 = ((afsm) next).b();
                        do {
                            Object next2 = it.next();
                            long b3 = ((afsm) next2).b();
                            if (b2 > b3) {
                                b2 = b3;
                            }
                            if (b2 > b3) {
                                next = next2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                }
                afsm afsmVar3 = (afsm) obj;
                if (afsmVar3 != null) {
                    return afsmVar3;
                }
                ordinal--;
            } while (ordinal >= 0);
            return afsmVar;
        }
        throw new IllegalStateException("Variation list can't be empty");
    }

    public static final afsm e(afso afsoVar, afsp afspVar, afsz afszVar, Long l) {
        afszVar.getClass();
        if (afsoVar instanceof afsm) {
            return (afsm) afsoVar;
        }
        afsw m = afsoVar.m();
        if (d.F(m, afsu.a)) {
            return d((afsn) afsoVar, afspVar.a, afszVar, l);
        }
        if (d.F(m, afsv.a)) {
            return d((afsn) afsoVar, afspVar.b, afszVar, l);
        }
        if (!d.F(m, afss.a)) {
            if (m instanceof afsr) {
                afsw m2 = afsoVar.m();
                Objects.toString(m2);
                throw new IllegalArgumentException("Unhandled Media Type ".concat(m2.toString()));
            }
            throw new armm();
        }
        throw new IllegalArgumentException("Audio media doesn't have variations");
    }
}
