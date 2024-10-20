package defpackage;

import defpackage.abg;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abh extends arpw implements arqv<arwe, arpe, Object> {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ abe e;
    final /* synthetic */ abg f;
    final /* synthetic */ arqr g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abh(abe abeVar, abg abgVar, arqr arqrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.e = abeVar;
        this.f = abgVar;
        this.g = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        abg.a aVar;
        abg abgVar;
        abg.a aVar2;
        arqr arqrVar;
        Object obj2;
        abg abgVar2;
        Throwable th;
        arpl arplVar = arpl.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        abgVar2 = (abg) this.b;
                        obj2 = this.a;
                        aVar2 = (abg.a) this.h;
                        try {
                            aqil.P(obj);
                            a.bD(abgVar2.a, aVar2);
                            ((asgm) obj2).d();
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            a.bD(abgVar2.a, aVar2);
                            throw th;
                        }
                    }
                    Object obj3 = this.c;
                    arqr arqrVar2 = (arqr) this.b;
                    Object obj4 = this.a;
                    abg.a aVar3 = (abg.a) this.h;
                    aqil.P(obj);
                    abgVar = obj3;
                    obj2 = obj4;
                    arqrVar = arqrVar2;
                    aVar2 = aVar3;
                } else {
                    aqil.P(obj);
                    arwe arweVar = (arwe) this.h;
                    abe abeVar = this.e;
                    arpg arpgVar = arweVar.b().get(arxm.c);
                    arpgVar.getClass();
                    abg.a aVar4 = new abg.a(abeVar, (arxm) arpgVar);
                    abg abgVar3 = this.f;
                    do {
                        aVar = (abg.a) abgVar3.a.get();
                        if (aVar != null && aVar4.a.compareTo(aVar.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                    } while (!a.bC(abgVar3.a, aVar, aVar4));
                    if (aVar != null) {
                        aVar.b.v(new abf());
                    }
                    abgVar = this.f;
                    arqr arqrVar3 = this.g;
                    this.h = aVar4;
                    asgm asgmVar = abgVar.b;
                    this.a = asgmVar;
                    this.b = arqrVar3;
                    this.c = abgVar;
                    this.d = 1;
                    if (asgmVar.b(this) != arplVar) {
                        aVar2 = aVar4;
                        arqrVar = arqrVar3;
                        obj2 = asgmVar;
                    }
                    return arplVar;
                }
                this.h = aVar2;
                this.a = obj2;
                this.b = abgVar;
                this.c = null;
                this.d = 2;
                Object a = arqrVar.a(this);
                if (a != arplVar) {
                    abgVar2 = abgVar;
                    obj = a;
                    a.bD(abgVar2.a, aVar2);
                    ((asgm) obj2).d();
                    return obj;
                }
                return arplVar;
            } catch (Throwable th3) {
                abgVar2 = abgVar;
                th = th3;
                a.bD(abgVar2.a, aVar2);
                throw th;
            }
        } catch (Throwable th4) {
            ((asgm) r1).d();
            throw th4;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        abh abhVar = new abh(this.e, this.f, this.g, arpeVar);
        abhVar.h = obj;
        return abhVar;
    }
}
