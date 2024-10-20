package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qax {
    public static final xze a = xze.g("BugleGroupManagement", "UpdateGroupChatOperations");
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final pss c;
    public final vti d;
    public final anen e;

    public qax(pss pssVar, vti vtiVar, anen anenVar) {
        this.c = pssVar;
        this.d = vtiVar;
        this.e = anenVar;
    }

    public final qeg a(String str, qeg qegVar) {
        Consumer m393m = fo$$ExternalSyntheticApiModelOutline0.m393m(this.b.remove(str));
        if (m393m == null) {
            xyo e = a.e();
            e.H("Received result for unknown update group operation");
            e.z("operationId", str);
            e.q();
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar2 = (qeg) createBuilder.b;
            qegVar2.c = qefVar.f;
            qegVar2.b |= 1;
            return (qeg) createBuilder.s();
        }
        m393m.q(qegVar);
        aozy createBuilder2 = qeg.a.createBuilder();
        qef qefVar2 = qef.OK;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qeg qegVar3 = (qeg) createBuilder2.b;
        qegVar3.c = qefVar2.f;
        qegVar3.b |= 1;
        return (qeg) createBuilder2.s();
    }
}
