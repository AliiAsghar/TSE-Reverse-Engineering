package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqam {
    public static volatile aqux a;
    public static volatile aqux b;
    public static volatile aqux c;
    public static volatile aqux d;
    public static volatile aqux e;
    public static volatile aqux f;
    public static volatile aqux g;
    private static volatile aqux h;

    public static aqal a(aqrs aqrsVar) {
        return (aqal) aqal.g(new wci(9), aqrsVar);
    }

    public static aqux b() {
        aqux aquxVar = h;
        if (aquxVar == null) {
            synchronized (aqam.class) {
                aquxVar = h;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("google.internal.communications.instantmessaging.v1.Messaging", "SendMessage");
                    a2.b();
                    aqdt aqdtVar = aqdt.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(aqdtVar);
                    a2.d = new arkw(aqdu.a);
                    aquxVar = a2.a();
                    h = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static arky c(aqrs aqrsVar) {
        return new arky(aqrsVar, aqrr.a.e(arlj.a, arlh.ASYNC));
    }

    public static final aqbu d(aqbz aqbzVar) {
        aqby aqbyVar = (aqby) aqbzVar;
        if (aqbyVar.b == 21) {
            return (aqbu) aqbyVar.c;
        }
        return null;
    }

    public static final aqbw e(aqbz aqbzVar) {
        aqby aqbyVar = (aqby) aqbzVar;
        if (aqbyVar.b == 8) {
            return (aqbw) aqbyVar.c;
        }
        return null;
    }

    public static final aqbx f(aqbz aqbzVar) {
        aqby aqbyVar = (aqby) aqbzVar;
        if (aqbyVar.b == 22) {
            return (aqbx) aqbyVar.c;
        }
        return null;
    }

    public static final /* synthetic */ aqfn g(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aqfn) s;
    }

    public static final void h(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqfn aqfnVar = (aqfn) aozyVar.b;
        aqfn aqfnVar2 = aqfn.a;
        aqfnVar.c = str;
    }

    public static final void i(asku askuVar, aozy aozyVar) {
        askuVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqfn aqfnVar = (aqfn) aozyVar.b;
        aqfn aqfnVar2 = aqfn.a;
        aqfnVar.b = askuVar.a();
    }

    public static final void j(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqfn aqfnVar = (aqfn) aozyVar.b;
        aqfn aqfnVar2 = aqfn.a;
        aqfnVar.d = "Bugle";
    }

    public static final aqft k(aqgx aqgxVar) {
        aqgw aqgwVar = (aqgw) aqgxVar;
        if ((aqgwVar.b & 2) != 0) {
            aqft aqftVar = aqgwVar.d;
            if (aqftVar == null) {
                return aqft.a;
            }
            return aqftVar;
        }
        return null;
    }

    public static final void m(String str, aqww aqwwVar, Map map) {
        map.put(str, aqwwVar);
    }

    public static void n(enh enhVar, aqvq aqvqVar) {
        if (((eno) enhVar).c == eng.DESTROYED) {
            aqvqVar.a();
        } else {
            enhVar.c(new rb(aqvqVar, 8, null));
        }
    }

    public static final asmb o(Map map) {
        return new asmb(alor.j(map));
    }

    public final synchronized void l() {
    }
}
