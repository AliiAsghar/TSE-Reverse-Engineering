package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axe extends arrp implements arqr<dhv, Boolean> {
    final /* synthetic */ ayd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axe(ayd aydVar) {
        super(1);
        this.a = aydVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        arnb arnbVar;
        dhv dhvVar = (dhv) obj;
        ayd aydVar = this.a;
        dov dovVar = aydVar.e;
        if (dovVar != null) {
            ayw.b(aqjn.B(new dna(), new dmw(dhvVar, 1)), aydVar.d, aydVar.q, dovVar);
            arnbVar = arnb.a;
        } else {
            arnbVar = null;
        }
        if (arnbVar == null) {
            ayd aydVar2 = this.a;
            String str = dhvVar.b;
            int length = str.length();
            long a = djd.a(length, length);
            long j = djc.a;
            aydVar2.q.a(new doj(str, a, 4));
        }
        return true;
    }
}
