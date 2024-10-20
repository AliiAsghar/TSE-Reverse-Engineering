package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aewo extends arrp implements arqr {
    final /* synthetic */ clp a;
    final /* synthetic */ czj b;
    final /* synthetic */ cmb c;
    final /* synthetic */ long d;
    final /* synthetic */ aewn e;
    final /* synthetic */ czj f;
    final /* synthetic */ czj g;
    final /* synthetic */ cas h;
    final /* synthetic */ cas i;
    final /* synthetic */ byn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewo(clp clpVar, czj czjVar, cmb cmbVar, long j, aewn aewnVar, czj czjVar2, czj czjVar3, cas casVar, cas casVar2, byn bynVar) {
        super(1);
        this.a = clpVar;
        this.b = czjVar;
        this.c = cmbVar;
        this.d = j;
        this.e = aewnVar;
        this.f = czjVar2;
        this.g = czjVar3;
        this.h = casVar;
        this.i = casVar2;
        this.j = bynVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float floatValue;
        float floatValue2;
        float floatValue3;
        float floatValue4;
        float floatValue5;
        float floatValue6;
        cnt cntVar = (cnt) obj;
        cntVar.getClass();
        floatValue = ((Number) this.h.a()).floatValue();
        if (floatValue < 0.01f || floatValue > 0.99f) {
            floatValue2 = ((Number) this.h.a()).floatValue();
            if (floatValue2 >= 0.99f) {
                cntVar.p();
            }
        } else {
            clp clpVar = this.a;
            floatValue6 = ((Number) this.h.a()).floatValue();
            clpVar.i(floatValue6);
            clp clpVar2 = this.a;
            ckr b = cntVar.q().b();
            b.m(cju.b(cntVar.o()), clpVar2);
            cntVar.p();
            b.j();
        }
        floatValue3 = ((Number) this.i.a()).floatValue();
        if (floatValue3 < 0.01f || floatValue3 > 0.99f) {
            floatValue4 = ((Number) this.i.a()).floatValue();
            if (floatValue4 >= 0.99f) {
                czj czjVar = this.b;
                czjVar.a = adcx.aR(cntVar, this.c, this.d, this.e, aewp.b(this.j), (cln) czjVar.a, (drk) this.f.a, (cjt) this.g.a);
            }
        } else {
            clp clpVar3 = this.a;
            floatValue5 = ((Number) this.i.a()).floatValue();
            clpVar3.i(floatValue5);
            clp clpVar4 = this.a;
            czj czjVar2 = this.b;
            cmb cmbVar = this.c;
            long j = this.d;
            aewn aewnVar = this.e;
            czj czjVar3 = this.f;
            czj czjVar4 = this.g;
            byn bynVar = this.j;
            ckr b2 = cntVar.q().b();
            b2.m(cju.b(cntVar.o()), clpVar4);
            czjVar2.a = adcx.aR(cntVar, cmbVar, j, aewnVar, aewp.b(bynVar), (cln) czjVar2.a, (drk) czjVar3.a, (cjt) czjVar4.a);
            b2.j();
        }
        this.g.a = new cjt(cntVar.o());
        this.f.a = cntVar.r();
        return arnb.a;
    }
}
