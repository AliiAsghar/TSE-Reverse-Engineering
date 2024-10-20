package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhw implements qhv {
    private final alor a;
    private final armf b;

    public qhw(Map map, armf armfVar) {
        this.a = alor.j(map);
        this.b = armfVar;
    }

    @Override // defpackage.qhv
    public final boolean a() {
        amuk d = ((xtj) this.b.b()).d();
        armf armfVar = (armf) this.a.get(d);
        d.name();
        armfVar.getClass();
        return ((qhv) armfVar.b()).a();
    }
}
