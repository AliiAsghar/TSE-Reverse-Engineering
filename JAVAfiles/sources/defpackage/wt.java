package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wt extends arrp implements arqr<cle, arnb> {
    final /* synthetic */ cas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(cas casVar) {
        super(1);
        this.a = casVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float floatValue;
        floatValue = ((Number) this.a.a()).floatValue();
        ((cle) obj).o(floatValue);
        return arnb.a;
    }
}
