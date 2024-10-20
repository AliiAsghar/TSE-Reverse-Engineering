package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azr extends arrp implements arqr<Float, Float> {
    final /* synthetic */ azv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azr(azv azvVar) {
        super(1);
        this.a = azvVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        float b = this.a.b() + floatValue;
        if (b > this.a.a()) {
            azv azvVar = this.a;
            floatValue = azvVar.a() - azvVar.b();
        } else if (b < brg.a) {
            floatValue = -this.a.b();
        }
        azv azvVar2 = this.a;
        azvVar2.d(azvVar2.b() + floatValue);
        return Float.valueOf(floatValue);
    }
}
