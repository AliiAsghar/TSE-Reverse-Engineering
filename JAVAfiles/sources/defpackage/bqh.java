package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqh extends arrp implements arqr<dho, arnb> {
    final /* synthetic */ String a;
    final /* synthetic */ bqe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqh(String str, bqe bqeVar) {
        super(1);
        this.a = str;
        this.b = bqeVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dho dhoVar = (dho) obj;
        dhl.I(dhoVar);
        dhl.c(dhoVar, null, new bqg(this.b));
        dhl.i(dhoVar, this.a);
        return arnb.a;
    }
}
