package defpackage;

import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class puo implements puu {
    public static final alwo a = alwo.o("BugleRcsCapabilities");
    private final alor b;
    private final armf c;
    private final aneo d;
    private final qxr e;

    public puo(armf armfVar, Map map, qxr qxrVar, aneo aneoVar) {
        this.b = alor.j(map);
        this.c = armfVar;
        this.e = qxrVar;
        this.d = aneoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    private final amdr d() {
        qxr qxrVar = this.e;
        Object b = qxrVar.c.b();
        b.getClass();
        Duration ofMillis = Duration.ofMillis(((Number) b).longValue());
        ofMillis.getClass();
        return amdr.d(ofMillis, 2.0d, (int) ((Number) qxrVar.h.b()).longValue());
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        amdt amdtVar = new amdt();
        amdtVar.b(this.d);
        amdtVar.a = new xdp(1);
        return akul.g(amdtVar.a(akto.b(new ndb(this, iterable, 3, null)), d(), new evp(4))).f(amdk.class, new jab(9), this.d);
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        amdt amdtVar = new amdt();
        amdtVar.b(this.d);
        amdtVar.a = new xdp(1);
        return akul.g(amdtVar.a(akto.b(new ndb(this, qeiVar, 4, null)), d(), new evp(4))).f(amdk.class, new jab(10), this.d);
    }

    public final puu c() {
        amuk d = ((xtj) this.c.b()).d();
        armf armfVar = (armf) this.b.get(d);
        d.name();
        armfVar.getClass();
        return (puu) armfVar.b();
    }
}
