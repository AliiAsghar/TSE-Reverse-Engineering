package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfa extends arpw implements arqv {
    final /* synthetic */ adit a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ wyp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfa(wyp wypVar, adit aditVar, boolean z, boolean z2, arpe arpeVar) {
        super(2, arpeVar);
        this.d = wypVar;
        this.a = aditVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aozy createBuilder = amxn.a.createBuilder();
        createBuilder.getClass();
        aktp.aW(12, createBuilder);
        wyp wypVar = this.d;
        adji adjiVar = (adji) wypVar.g.b();
        adit aditVar = this.a;
        Optional f = adjiVar.f(aditVar);
        aozy createBuilder2 = amxi.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        boolean z = this.b;
        apag apagVar = createBuilder2.b;
        amxi amxiVar = (amxi) apagVar;
        amxiVar.b |= 1;
        amxiVar.c = z;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        boolean z2 = this.c;
        amxi amxiVar2 = (amxi) createBuilder2.b;
        amxiVar2.b |= 2;
        amxiVar2.d = z2;
        boolean o = ((adji) wypVar.g.b()).o();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxi amxiVar3 = (amxi) createBuilder2.b;
        amxiVar3.b |= 4;
        amxiVar3.e = o;
        boolean isPresent = f.isPresent();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxi amxiVar4 = (amxi) createBuilder2.b;
        amxiVar4.b |= 8;
        amxiVar4.f = isPresent;
        String r = wyp.r(aditVar);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxi amxiVar5 = (amxi) createBuilder2.b;
        amxiVar5.b |= 16;
        amxiVar5.g = r;
        apag s = createBuilder2.s();
        s.getClass();
        amxi amxiVar6 = (amxi) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxn amxnVar = (amxn) createBuilder.b;
        amxnVar.j = amxiVar6;
        amxnVar.b |= 32;
        this.d.q(aktp.aU(createBuilder));
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new wfa(this.d, this.a, this.b, this.c, arpeVar);
    }
}
