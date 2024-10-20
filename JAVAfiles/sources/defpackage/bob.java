package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bob extends arrp implements arqw<arqv<? super bwj, ? super Integer, ? extends arnb>, bwj, Integer, arnb> {
    final /* synthetic */ doj a;
    final /* synthetic */ boolean b;
    final /* synthetic */ doy c;
    final /* synthetic */ ajr d;
    final /* synthetic */ boolean e;
    final /* synthetic */ arqv f;
    final /* synthetic */ arqv g;
    final /* synthetic */ arqv h;
    final /* synthetic */ arqv i;
    final /* synthetic */ brr j;
    final /* synthetic */ cmb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bob(doj dojVar, boolean z, doy doyVar, ajr ajrVar, boolean z2, arqv arqvVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, brr brrVar, cmb cmbVar) {
        super(3);
        this.a = dojVar;
        this.b = z;
        this.c = doyVar;
        this.d = ajrVar;
        this.e = z2;
        this.f = arqvVar;
        this.g = arqvVar2;
        this.h = arqvVar3;
        this.i = arqvVar4;
        this.j = brrVar;
        this.k = cmbVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        arqv arqvVar = (arqv) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (true != bwjVar.I(arqvVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & 19) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            doj dojVar = this.a;
            boolean z = this.b;
            doy doyVar = this.c;
            ajr ajrVar = this.d;
            boolean z2 = this.e;
            arqv arqvVar2 = this.f;
            arqv arqvVar3 = this.g;
            arqv arqvVar4 = this.h;
            arqv arqvVar5 = this.i;
            brr brrVar = this.j;
            bnv.a.b(dojVar.a(), arqvVar, z, true, doyVar, ajrVar, z2, arqvVar2, arqvVar3, arqvVar4, arqvVar5, brrVar, null, cdk.e(255570733, new boa(z, z2, ajrVar, brrVar, this.k), bwjVar), bwjVar, (i2 << 3) & 112, 14155776);
        }
        return arnb.a;
    }
}
