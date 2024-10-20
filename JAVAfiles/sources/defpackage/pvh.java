package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvh implements pvk {
    private final alor a;
    private final armf b;

    public pvh(armf armfVar, Map map) {
        this.a = alor.j(map);
        this.b = armfVar;
    }

    @Override // defpackage.pvk
    public final akul c(qei qeiVar) {
        amuk d = ((xtj) this.b.b()).d();
        armf armfVar = (armf) this.a.get(d);
        d.name();
        armfVar.getClass();
        return ((pvk) armfVar.b()).c(qeiVar);
    }
}
