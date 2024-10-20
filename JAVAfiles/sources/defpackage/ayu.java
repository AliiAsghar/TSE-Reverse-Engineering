package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayu extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ baw a;
    final /* synthetic */ dob b;
    final /* synthetic */ doj c;
    final /* synthetic */ ayd d;
    final /* synthetic */ cko e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayu(baw bawVar, dob dobVar, doj dojVar, ayd aydVar, cko ckoVar) {
        super(1);
        this.a = bawVar;
        this.b = dobVar;
        this.c = dojVar;
        this.d = aydVar;
        this.e = ckoVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjp cjpVar;
        diy diyVar;
        cnt cntVar = (cnt) obj;
        cntVar.p();
        float b = this.a.c.b();
        if (b != brg.a) {
            dob dobVar = this.b;
            doj dojVar = this.c;
            ayd aydVar = this.d;
            int a = dobVar.a(djc.e(dojVar.b));
            baa d = aydVar.d();
            if (d != null && (diyVar = d.a) != null) {
                cjpVar = diyVar.m(a);
            } else {
                cjpVar = new cjp(brg.a, brg.a, brg.a, brg.a);
            }
            float em = cntVar.em(2.0f);
            float f = em / 2.0f;
            float o = arrn.o(arrn.p(cjpVar.b + f, Float.intBitsToFloat((int) (cntVar.o() >> 32)) - f), f);
            cntVar.A(this.e, (Float.floatToRawIntBits(o) << 32) | (Float.floatToRawIntBits(cjpVar.c) & 4294967295L), (Float.floatToRawIntBits(o) << 32) | (Float.floatToRawIntBits(cjpVar.e) & 4294967295L), em, b);
        }
        return arnb.a;
    }
}
