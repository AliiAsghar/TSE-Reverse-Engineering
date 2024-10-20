package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnx extends arrp implements arqw<arqv<? super bwj, ? super Integer, ? extends arnb>, bwj, Integer, arnb> {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ doy c;
    final /* synthetic */ ajr d;
    final /* synthetic */ arqv e;
    final /* synthetic */ arqv f;
    final /* synthetic */ brr g;
    final /* synthetic */ cmb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnx(String str, boolean z, doy doyVar, ajr ajrVar, arqv arqvVar, arqv arqvVar2, brr brrVar, cmb cmbVar) {
        super(3);
        this.a = str;
        this.b = z;
        this.c = doyVar;
        this.d = ajrVar;
        this.e = arqvVar;
        this.f = arqvVar2;
        this.g = brrVar;
        this.h = cmbVar;
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
            String str = this.a;
            boolean z = this.b;
            doy doyVar = this.c;
            ajr ajrVar = this.d;
            arqv arqvVar2 = this.e;
            arqv arqvVar3 = this.f;
            brr brrVar = this.g;
            bnv.a.b(str, arqvVar, z, false, doyVar, ajrVar, false, null, arqvVar2, arqvVar3, null, brrVar, null, cdk.e(2108828640, new bnw(z, ajrVar, brrVar, this.h), bwjVar), bwjVar, (i2 << 3) & 112, 14155776);
        }
        return arnb.a;
    }
}
