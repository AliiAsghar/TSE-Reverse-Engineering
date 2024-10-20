package defpackage;

import defpackage.aff;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afg extends arpw implements arqv<arwe, arpe, Object> {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ afd e;
    final /* synthetic */ aff f;
    final /* synthetic */ arqr g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afg(afd afdVar, aff affVar, arqr arqrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.e = afdVar;
        this.f = affVar;
        this.g = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aff affVar;
        aff.a aVar;
        arqr arqrVar;
        Object obj2;
        aff affVar2;
        Throwable th;
        arpl arplVar = arpl.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        affVar2 = (aff) this.b;
                        obj2 = this.a;
                        aVar = (aff.a) this.h;
                        try {
                            aqil.P(obj);
                            a.bD(affVar2.a, aVar);
                            ((asgm) obj2).d();
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            a.bD(affVar2.a, aVar);
                            throw th;
                        }
                    }
                    Object obj3 = this.c;
                    arqr arqrVar2 = (arqr) this.b;
                    Object obj4 = this.a;
                    aff.a aVar2 = (aff.a) this.h;
                    aqil.P(obj);
                    affVar = obj3;
                    obj2 = obj4;
                    arqrVar = arqrVar2;
                    aVar = aVar2;
                } else {
                    aqil.P(obj);
                    arwe arweVar = (arwe) this.h;
                    afd afdVar = this.e;
                    arpg arpgVar = arweVar.b().get(arxm.c);
                    arpgVar.getClass();
                    aff.a aVar3 = new aff.a(afdVar, (arxm) arpgVar);
                    this.f.b(aVar3);
                    affVar = this.f;
                    arqr arqrVar3 = this.g;
                    this.h = aVar3;
                    asgm asgmVar = affVar.b;
                    this.a = asgmVar;
                    this.b = arqrVar3;
                    this.c = affVar;
                    this.d = 1;
                    if (asgmVar.b(this) != arplVar) {
                        aVar = aVar3;
                        arqrVar = arqrVar3;
                        obj2 = asgmVar;
                    }
                    return arplVar;
                }
                this.h = aVar;
                this.a = obj2;
                this.b = affVar;
                this.c = null;
                this.d = 2;
                Object a = arqrVar.a(this);
                if (a != arplVar) {
                    affVar2 = affVar;
                    obj = a;
                    a.bD(affVar2.a, aVar);
                    ((asgm) obj2).d();
                    return obj;
                }
                return arplVar;
            } catch (Throwable th3) {
                affVar2 = affVar;
                th = th3;
                a.bD(affVar2.a, aVar);
                throw th;
            }
        } catch (Throwable th4) {
            ((asgm) r1).d();
            throw th4;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        afg afgVar = new afg(this.e, this.f, this.g, arpeVar);
        afgVar.h = obj;
        return afgVar;
    }
}
