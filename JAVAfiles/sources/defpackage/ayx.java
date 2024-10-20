package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayx extends arrp implements arqr<cll, arnb> {
    final /* synthetic */ cti a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayx(cti ctiVar) {
        super(1);
        this.a = ctiVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        float[] fArr = ((cll) obj).a;
        if (this.a.r()) {
            cti ctiVar = this.a;
            ctj.f(ctiVar).p(ctiVar, fArr);
        }
        return arnb.a;
    }
}
