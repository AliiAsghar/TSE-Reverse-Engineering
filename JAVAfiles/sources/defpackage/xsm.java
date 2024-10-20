package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xsm implements xrx {
    public final /* synthetic */ xrz a;
    private final /* synthetic */ int b;

    public /* synthetic */ xsm(xrz xrzVar, int i) {
        this.b = i;
        this.a = xrzVar;
    }

    @Override // defpackage.xrx
    public final xsz a(aqhy aqhyVar) {
        if (this.b != 0) {
            aozy createBuilder = qeq.a.createBuilder();
            xrz xrzVar = this.a;
            qep g = xtf.g(aqhyVar, xrzVar.e, xrzVar.c);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeq qeqVar = (qeq) createBuilder.b;
            g.getClass();
            qeqVar.c = g;
            qeqVar.b |= 1;
            return new xsz(new xsc((qeq) createBuilder.s()));
        }
        aozy createBuilder2 = qeq.a.createBuilder();
        qep g2 = xtf.g(aqhyVar, Optional.empty(), this.a.g);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qeq qeqVar2 = (qeq) createBuilder2.b;
        g2.getClass();
        qeqVar2.d = g2;
        qeqVar2.b |= 2;
        return new xsz(new xsc((qeq) createBuilder2.s()));
    }
}
