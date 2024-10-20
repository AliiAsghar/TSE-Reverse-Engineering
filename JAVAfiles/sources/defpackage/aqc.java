package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqc extends arrp implements arqr<Integer, aqf> {
    final /* synthetic */ aqi a;
    final /* synthetic */ aqg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqc(aqi aqiVar, aqg aqgVar) {
        super(1);
        this.a = aqiVar;
        this.b = aqgVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int intValue = ((Number) obj).intValue();
        this.a.b(intValue);
        return this.b.d(intValue, 0, 1, this.a.c(0, 1));
    }
}
