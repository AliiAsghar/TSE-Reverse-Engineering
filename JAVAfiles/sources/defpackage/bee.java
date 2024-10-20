package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bee extends arrp implements arqr<ciy, arnb> {
    final /* synthetic */ bdy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bee(bdy bdyVar) {
        super(1);
        this.a = bdyVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ciy ciyVar = (ciy) obj;
        if (!ciyVar.b() && this.a.y()) {
            this.a.k();
        }
        this.a.r(ciyVar.b());
        return arnb.a;
    }
}
