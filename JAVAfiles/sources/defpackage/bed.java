package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bed extends arrp implements arqr<cti, arnb> {
    final /* synthetic */ bdy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bed(bdy bdyVar) {
        super(1);
        this.a = bdyVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjn cjnVar;
        bdy bdyVar = this.a;
        cti ctiVar = (cti) obj;
        bdyVar.h = ctiVar;
        if (bdyVar.y() && bdyVar.f() != null) {
            if (ctiVar != null) {
                cjnVar = new cjn(ctj.b(ctiVar));
            } else {
                cjnVar = null;
            }
            if (!d.F(bdyVar.g, cjnVar)) {
                bdyVar.g = cjnVar;
                bdyVar.w();
                bdyVar.x();
            }
        }
        return arnb.a;
    }
}
