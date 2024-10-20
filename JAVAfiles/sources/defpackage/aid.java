package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aid extends arrp implements arqv<Float, Float, Boolean> {
    final /* synthetic */ aia a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aid(aia aiaVar) {
        super(2);
        this.a = aiaVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        aia aiaVar = this.a;
        arrn.J(aiaVar.B(), null, null, new aic(aiaVar, floatValue, floatValue2, null), 3);
        return true;
    }
}
