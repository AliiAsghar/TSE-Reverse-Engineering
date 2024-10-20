package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdw implements pss {
    private final alor a;
    private final armf b;

    public qdw(Map map, armf armfVar) {
        this.a = alor.j(map);
        this.b = armfVar;
    }

    private final pss h() {
        amuk d = ((xtj) this.b.b()).d();
        armf armfVar = (armf) this.a.get(d);
        if (armfVar != null) {
            return (pss) armfVar.b();
        }
        throw new IllegalStateException("Do not have an OutgoingChatApi implementation registered for ChatTransportType: ".concat(String.valueOf(d.name())));
    }

    @Override // defpackage.pss
    public final akul a(qec qecVar) {
        return h().a(qecVar);
    }

    @Override // defpackage.pss
    public final akul b(qen qenVar) {
        return h().b(qenVar);
    }

    @Override // defpackage.pss
    public final akul c(qfy qfyVar) {
        return h().c(qfyVar);
    }

    @Override // defpackage.pss
    public final akul d(qgb qgbVar) {
        return h().d(qgbVar);
    }

    @Override // defpackage.pss
    public final akul e(qgf qgfVar) {
        return h().e(qgfVar);
    }

    @Override // defpackage.pss
    public final akul f(qgt qgtVar) {
        return h().f(qgtVar);
    }

    @Override // defpackage.pss
    public final akul g(qgw qgwVar) {
        return h().g(qgwVar);
    }
}
