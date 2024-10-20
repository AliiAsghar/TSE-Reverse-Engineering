package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axb extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ avj b;
    final /* synthetic */ doj c;
    final /* synthetic */ ayd d;
    final /* synthetic */ baa e;
    final /* synthetic */ dob f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(avj avjVar, doj dojVar, ayd aydVar, baa baaVar, dob dobVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = avjVar;
        this.c = dojVar;
        this.d = aydVar;
        this.e = baaVar;
        this.f = dobVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        long a;
        cjp cjpVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            avj avjVar = this.b;
            doj dojVar = this.c;
            ayd aydVar = this.d;
            baa baaVar = this.e;
            dob dobVar = this.f;
            ayq ayqVar = aydVar.a;
            this.a = 1;
            int a2 = dobVar.a(djc.c(dojVar.b));
            diy diyVar = baaVar.a;
            if (a2 < diyVar.a.a.a()) {
                cjpVar = diyVar.l(a2);
            } else if (a2 == 0) {
                a = ayy.a(ayqVar.b, ayqVar.e, ayqVar.f, ayy.a, 1);
                cjpVar = new cjp(brg.a, brg.a, 1.0f, (int) (a & 4294967295L));
            } else {
                cjpVar = diyVar.l(a2 - 1);
            }
            Object a3 = avjVar.a(cjpVar, this);
            if (a3 != arpl.a) {
                a3 = arnb.a;
            }
            if (a3 == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new axb(this.b, this.c, this.d, this.e, this.f, arpeVar);
    }
}
