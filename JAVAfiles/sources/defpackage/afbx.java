package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbx extends arrp implements arqr {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbx(long j, long j2, float f) {
        super(1);
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cny cnyVar = (cny) obj;
        cnyVar.getClass();
        cnw.k(cnyVar, new afbw(this.c, this.a, this.b, cku.g), 0L, 0L, brg.a, null, 126);
        return arnb.a;
    }
}
