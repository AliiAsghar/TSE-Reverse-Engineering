package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bei extends arrp implements arqr<bcy, arnb> {
    final /* synthetic */ bdy a;
    final /* synthetic */ arqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bei(bdy bdyVar, arqr arqrVar) {
        super(1);
        this.a = bdyVar;
        this.b = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bcy bcyVar = (bcy) obj;
        this.a.t(bcyVar);
        this.b.a(bcyVar);
        return arnb.a;
    }
}
