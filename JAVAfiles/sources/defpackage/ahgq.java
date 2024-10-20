package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahgq extends arrp implements arqr {
    final /* synthetic */ long a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgq(long j, int i) {
        super(1);
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cny cnyVar = (cny) obj;
        cnyVar.getClass();
        float min = Math.min(cnyVar.em(4.0f), cjt.a(cnyVar.o()));
        float a = cjt.a(cnyVar.o()) - min;
        int i = this.b;
        long j = this.a;
        float f = a / 2.0f;
        if (a.bA(i, 1)) {
            float f2 = min / 2.0f;
            cnw.g(cnyVar, j, f2, a.z((cjt.c(cnyVar.o()) - f2) - f, cjt.a(cnyVar.o()) / 2.0f), null, 120);
        } else {
            cnw.l(cnyVar, j, a.z((cjt.c(cnyVar.o()) - min) - f, (cjt.a(cnyVar.o()) - min) / 2.0f), a.z(min, min), brg.a, null, 120);
        }
        return arnb.a;
    }
}
