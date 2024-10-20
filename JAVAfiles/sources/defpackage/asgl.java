package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgl implements arvo, arys {
    public final arvp a;
    final /* synthetic */ asgm b;

    public asgl(asgm asgmVar, arvp arvpVar) {
        this.b = asgmVar;
        this.a = arvpVar;
    }

    @Override // defpackage.arys
    public final void F(aseo aseoVar, int i) {
        this.a.F(aseoVar, i);
    }

    @Override // defpackage.arvo
    public final void a(Object obj) {
        this.a.a(obj);
    }

    @Override // defpackage.arvo
    public final void d(arqr arqrVar) {
        throw null;
    }

    @Override // defpackage.arvo
    public final /* bridge */ /* synthetic */ void e(Object obj, arqr arqrVar) {
        throw null;
    }

    @Override // defpackage.arvo
    public final /* bridge */ /* synthetic */ void f(Object obj, arqw arqwVar) {
        boolean z = arwh.a;
        this.b.a.c(null);
        this.a.e(obj, new arnd(this.b, 14));
    }

    @Override // defpackage.arvo
    public final /* bridge */ /* synthetic */ void g(arwb arwbVar, Object obj) {
        throw null;
    }

    @Override // defpackage.arvo
    public final boolean h(Throwable th) {
        return this.a.h(th);
    }

    @Override // defpackage.arvo
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.arvo
    public final boolean j() {
        throw null;
    }

    @Override // defpackage.arvo
    public final /* synthetic */ Object k(Object obj, arqw arqwVar) {
        boolean z = arwh.a;
        aeyj aeyjVar = new aeyj(this.b, 8);
        asfn I = this.a.I((arnb) obj, aeyjVar);
        if (I != null) {
            this.b.a.c(null);
        }
        return I;
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return this.a.b;
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        this.a.w(obj);
    }
}
