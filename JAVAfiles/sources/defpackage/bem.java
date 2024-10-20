package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bem extends arrp implements arqr<agf, arnb> {
    final /* synthetic */ agi a;
    final /* synthetic */ bdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(agi agiVar, bdy bdyVar) {
        super(1);
        this.a = agiVar;
        this.b = bdyVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bdy bdyVar = this.b;
        agf agfVar = (agf) obj;
        arnb[] arnbVarArr = new arnb[2];
        ayp aypVar = ayp.b;
        if (bdyVar.B()) {
            bdy bdyVar2 = this.b;
            agfVar.a.add(new cdj(262103052, true, new agg(new awt(aypVar), cga.e, new bek(this.a, bdyVar2))));
        }
        arnbVarArr[0] = arnb.a;
        agi agiVar = this.a;
        bdy bdyVar3 = this.b;
        ayp aypVar2 = ayp.d;
        boolean z = bdyVar3.z();
        bdy bdyVar4 = this.b;
        if (!z) {
            agfVar.a.add(new cdj(262103052, true, new agg(new awt(aypVar2), cga.e, new bel(agiVar, bdyVar4))));
        }
        arnbVarArr[1] = arnb.a;
        aqjn.B(arnbVarArr);
        return arnb.a;
    }
}
