package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xdx extends algf {
    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        anip anipVar = (anip) obj;
        aozy createBuilder = qel.a.createBuilder();
        String str = anipVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qel qelVar = (qel) apagVar;
        str.getClass();
        qelVar.b |= 1;
        qelVar.c = str;
        String str2 = anipVar.b;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qel qelVar2 = (qel) createBuilder.b;
        str2.getClass();
        qelVar2.b |= 2;
        qelVar2.d = str2;
        createBuilder.A(alor.j(anipVar.c));
        return (qel) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        qel qelVar = (qel) obj;
        aoad aoadVar = new aoad((char[]) null, (byte[]) null);
        if ((qelVar.b & 1) != 0) {
            aoadVar.s(qelVar.c);
        }
        if ((qelVar.b & 2) != 0) {
            aoadVar.r(qelVar.d);
        }
        aoadVar.q(DesugarCollections.unmodifiableMap(qelVar.e));
        return aoadVar.p();
    }
}
