package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akea extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ asai c;
    final /* synthetic */ arqw d;
    final /* synthetic */ arqr e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akea(Object obj, asai asaiVar, arqw arqwVar, arqr arqrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = obj;
        this.c = asaiVar;
        this.d = arqwVar;
        this.e = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akea) c((arzu) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arzu arzuVar = (arzu) this.f;
            asgm asgmVar = new asgm();
            ArrayList arrayList = new ArrayList();
            arsb arsbVar = new arsb();
            arsbVar.a = new aodz(this.b);
            akdz akdzVar = new akdz(this.c, asgmVar, arsbVar, this.d, this.e, arrayList, arzuVar, (arpe) null, 0);
            this.a = 1;
            aryi aryiVar = new aryi(u(), this);
            if (arsd.ay(aryiVar, aryiVar, akdzVar) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        akea akeaVar = new akea(this.b, this.c, this.d, this.e, arpeVar);
        akeaVar.f = obj;
        return akeaVar;
    }
}
