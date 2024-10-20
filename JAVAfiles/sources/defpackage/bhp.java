package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhp extends arrp implements arqr<dho, arnb> {
    final /* synthetic */ String a;
    final /* synthetic */ bhm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhp(String str, bhm bhmVar) {
        super(1);
        this.a = str;
        this.b = bhmVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dho dhoVar = (dho) obj;
        dhl.I(dhoVar);
        dhl.i(dhoVar, this.a);
        dhl.c(dhoVar, null, new bho(this.b));
        return arnb.a;
    }
}
