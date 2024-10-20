package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axf extends arrp implements arqr<dhv, Boolean> {
    final /* synthetic */ boolean a;
    final /* synthetic */ ayd b;
    final /* synthetic */ doj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axf(boolean z, ayd aydVar, doj dojVar) {
        super(1);
        this.a = z;
        this.b = aydVar;
        this.c = dojVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        arnb arnbVar;
        dhv dhvVar = (dhv) obj;
        if (!this.a) {
            return false;
        }
        ayd aydVar = this.b;
        dov dovVar = aydVar.e;
        if (dovVar != null) {
            ayw.b(aqjn.B(new dnj(), new dmw(dhvVar, 1)), aydVar.d, aydVar.q, dovVar);
            arnbVar = arnb.a;
        } else {
            arnbVar = null;
        }
        if (arnbVar == null) {
            doj dojVar = this.c;
            ayd aydVar2 = this.b;
            String a = dojVar.a();
            long j = dojVar.b;
            String obj2 = arsd.C(a, djc.e(j), djc.a(j), dhvVar).toString();
            int e = djc.e(dojVar.b) + dhvVar.a();
            aydVar2.q.a(new doj(obj2, djd.a(e, e), 4));
        }
        return true;
    }
}
