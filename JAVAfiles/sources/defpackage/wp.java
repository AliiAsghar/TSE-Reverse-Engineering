package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wp extends arrp implements arqr<zy, cku> {
    final /* synthetic */ cmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(cmk cmkVar) {
        super(1);
        this.a = cmkVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        zy zyVar = (zy) obj;
        float f = zyVar.b;
        float f2 = brg.a;
        if (f < brg.a) {
            f = 0.0f;
        }
        float f3 = zyVar.c;
        float f4 = -0.5f;
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = zyVar.d;
        if (f5 >= -0.5f) {
            f4 = f5;
        }
        float f6 = zyVar.a;
        if (f6 >= brg.a) {
            f2 = f6;
        }
        float[] fArr = cms.a;
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return new cku(cku.e(ckw.f(f, f3, f4, f2, cms.x), this.a));
    }
}
