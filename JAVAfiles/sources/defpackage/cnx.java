package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnx extends arrp implements arqr<cny, arnb> {
    final /* synthetic */ cny a;
    final /* synthetic */ arqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnx(cny cnyVar, arqr arqrVar) {
        super(1);
        this.a = cnyVar;
        this.b = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cny cnyVar = (cny) obj;
        dqv c = cnyVar.q().c();
        drk d = cnyVar.q().d();
        ckr b = cnyVar.q().b();
        long a = cnyVar.q().a();
        cof cofVar = ((cnr.AnonymousClass1) cnyVar.q()).b;
        cny cnyVar2 = this.a;
        cnr cnrVar = (cnr) cnyVar2;
        cnu cnuVar = cnrVar.b;
        dqv c2 = cnuVar.c();
        drk d2 = cnuVar.d();
        ckr b2 = cnuVar.b();
        long a2 = cnuVar.a();
        cnr.AnonymousClass1 anonymousClass1 = (cnr.AnonymousClass1) cnuVar;
        cof cofVar2 = anonymousClass1.b;
        cnuVar.f(c);
        cnuVar.g(d);
        cnuVar.e(b);
        cnuVar.h(a);
        anonymousClass1.b = cofVar;
        b.l();
        try {
            this.b.a(cnyVar2);
            b.j();
            cnu cnuVar2 = cnrVar.b;
            cnuVar2.f(c2);
            cnuVar2.g(d2);
            cnuVar2.e(b2);
            cnuVar2.h(a2);
            ((cnr.AnonymousClass1) cnuVar2).b = cofVar2;
            return arnb.a;
        } catch (Throwable th) {
            b.j();
            cnu cnuVar3 = cnrVar.b;
            cnuVar3.f(c2);
            cnuVar3.g(d2);
            cnuVar3.e(b2);
            cnuVar3.h(a2);
            ((cnr.AnonymousClass1) cnuVar3).b = cofVar2;
            throw th;
        }
    }
}
