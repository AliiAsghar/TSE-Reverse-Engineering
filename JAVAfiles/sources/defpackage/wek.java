package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wek implements wei {
    private final wan a;
    private final wcj b;
    private final qco c;
    private final vzz d;

    public wek(qco qcoVar, wan wanVar, vzz vzzVar, wcj wcjVar) {
        this.c = qcoVar;
        this.a = wanVar;
        this.d = vzzVar;
        this.b = wcjVar;
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ qeg a(Object obj) {
        wcq wcqVar = ((wdp) obj).e;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        return wam.d(wcqVar);
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ akul b(Object obj) {
        return this.c.i((qgg) obj);
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ akul c(Object obj) {
        return akul.g(this.b.b((wdr) obj));
    }

    @Override // defpackage.wei
    public final /* synthetic */ Optional d(Object obj) {
        wbk wbkVar = ((wdp) obj).g;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        int Y = a.Y(wbkVar.c);
        if (Y != 0 && Y == 3) {
            wcy wcyVar = wbkVar.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            return Optional.of(wcyVar.c);
        }
        return Optional.empty();
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        return this.d.apply((wdp) obj);
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.a.apply((qgf) obj);
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        qgf qgfVar = (qgf) obj;
        aozy createBuilder = qgg.a.createBuilder();
        aozy createBuilder2 = qeg.a.createBuilder();
        qef qefVar = qef.PENDING;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qeg qegVar = (qeg) createBuilder2.b;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar = (qgg) createBuilder.b;
        qeg qegVar2 = (qeg) createBuilder2.s();
        qegVar2.getClass();
        qggVar.c = qegVar2;
        qggVar.b |= 1;
        aozb aozbVar = qgfVar.j;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar2 = (qgg) createBuilder.b;
        aozbVar.getClass();
        qggVar2.b |= 2;
        qggVar2.d = aozbVar;
        return (qgg) createBuilder.s();
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((qgf) obj).f));
    }

    @Override // defpackage.wei
    public final String i() {
        return "sendMessage";
    }

    @Override // defpackage.wei
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        qgf qgfVar = (qgf) obj;
        aozy createBuilder = qgg.a.createBuilder();
        aozy createBuilder2 = qeg.a.createBuilder();
        qef qefVar = qef.FAILED_PERMANENTLY;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        qeg qegVar = (qeg) apagVar;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        qee qeeVar = qee.TRANSPORT_INTERNAL_ERROR;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        qeg qegVar2 = (qeg) createBuilder2.b;
        qegVar2.d = qeeVar.p;
        qegVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar = (qgg) createBuilder.b;
        qeg qegVar3 = (qeg) createBuilder2.s();
        qegVar3.getClass();
        qggVar.c = qegVar3;
        qggVar.b |= 1;
        aozb aozbVar = qgfVar.j;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar2 = (qgg) createBuilder.b;
        aozbVar.getClass();
        qggVar2.b |= 2;
        qggVar2.d = aozbVar;
        return (qgg) createBuilder.s();
    }
}
