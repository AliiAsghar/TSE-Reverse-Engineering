package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avg extends arrp implements arqv<Float, Float, arnb> {
    final /* synthetic */ arry a;
    final /* synthetic */ ahv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avg(arry arryVar, ahv ahvVar) {
        super(2);
        this.a = arryVar;
        this.b = ahvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        arry arryVar = this.a;
        this.a.a = arryVar.a + this.b.a(floatValue - arryVar.a);
        return arnb.a;
    }
}
