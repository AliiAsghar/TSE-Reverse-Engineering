package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdz extends arpw implements arqv {
    int a;
    final /* synthetic */ asai b;
    final /* synthetic */ arsb c;
    final /* synthetic */ arqw d;
    final /* synthetic */ arqr e;
    final /* synthetic */ List f;
    final /* synthetic */ asgm g;
    final /* synthetic */ arzu h;
    private /* synthetic */ Object i;
    private final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdz(arpe arpeVar, asai asaiVar, asgm asgmVar, arsb arsbVar, arqw arqwVar, arqr arqrVar, List list, arzu arzuVar, int i) {
        super(2, arpeVar);
        this.j = i;
        this.b = asaiVar;
        this.g = asgmVar;
        this.c = arsbVar;
        this.d = arqwVar;
        this.e = arqrVar;
        this.f = list;
        this.h = arzuVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.j != 0) {
            return ((akdz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((akdz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.j != 0) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                arpg arpgVar = ((arwe) this.i).b().get(arxm.c);
                arpgVar.getClass();
                asai asaiVar = this.b;
                akdx akdxVar = new akdx(this.g, this.c, this.d, this.e, this.f, (arxm) arpgVar, this.h);
                this.a = 1;
                if (asaiVar.a(akdxVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }
        arpl arplVar2 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            arwe arweVar = (arwe) this.i;
            asai asaiVar2 = this.b;
            akdy akdyVar = new akdy(arweVar, this.g, this.c, this.d, this.e, this.f, this.h);
            this.a = 1;
            if (asaiVar2.a(akdyVar, this) == arplVar2) {
                return arplVar2;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.j != 0) {
            akdz akdzVar = new akdz(arpeVar, this.b, this.g, this.c, this.d, this.e, this.f, this.h, 1);
            akdzVar.i = obj;
            return akdzVar;
        }
        akdz akdzVar2 = new akdz(this.b, this.g, this.c, this.d, this.e, this.f, this.h, arpeVar, 0);
        akdzVar2.i = obj;
        return akdzVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdz(asai asaiVar, asgm asgmVar, arsb arsbVar, arqw arqwVar, arqr arqrVar, List list, arzu arzuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.j = i;
        this.b = asaiVar;
        this.g = asgmVar;
        this.c = arsbVar;
        this.d = arqwVar;
        this.e = arqrVar;
        this.f = list;
        this.h = arzuVar;
    }
}
