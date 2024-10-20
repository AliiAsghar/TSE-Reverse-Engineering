package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blf extends arrp implements arqr<cle, arnb> {
    final /* synthetic */ float a;
    final /* synthetic */ cmb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blf(float f, cmb cmbVar) {
        super(1);
        this.a = f;
        this.b = cmbVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cle cleVar = (cle) obj;
        cleVar.o(this.a);
        cleVar.A(this.b);
        cleVar.r(true);
        return arnb.a;
    }
}
