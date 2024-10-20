package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xel extends xdz {
    static final algk a = new xea(1);
    static final algk b = new xea(0);

    @Override // defpackage.xdz
    public final void b(anit anitVar, aozy aozyVar) {
        anit anitVar2 = anit.a;
        if (albo.aA(anitVar)) {
            qef qefVar = qef.FAILED_TRANSIENTLY;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            qeg qegVar = (qeg) aozyVar.b;
            qeg qegVar2 = qeg.a;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return;
        }
        qef qefVar2 = qef.FAILED_PERMANENTLY;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qeg qegVar3 = (qeg) aozyVar.b;
        qeg qegVar4 = qeg.a;
        qegVar3.c = qefVar2.f;
        qegVar3.b |= 1;
    }
}
