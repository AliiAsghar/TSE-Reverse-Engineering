package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trd implements emx {
    final /* synthetic */ ncq a;
    final /* synthetic */ Object b;
    final /* synthetic */ ahiy c;
    private ncq d;
    private yga e;

    public trd(ncq ncqVar, ahiy ahiyVar, Object obj) {
        this.a = ncqVar;
        this.c = ahiyVar;
        this.b = obj;
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        ncq ncqVar = this.a;
        this.d = ncqVar;
        yga a = ncqVar.a(new trc(this.c, this.b, 0));
        this.e = a;
        if (a != null) {
            this.c.q(aktp.ag(null), this.b);
        }
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        this.d = null;
        yga ygaVar = this.e;
        if (ygaVar != null) {
            ygaVar.a();
            this.e = null;
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
