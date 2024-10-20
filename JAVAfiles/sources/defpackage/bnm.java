package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnm extends arrp implements arqr<cle, arnb> {
    final /* synthetic */ zj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnm(zj zjVar) {
        super(1);
        this.a = zjVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float f;
        cle cleVar = (cle) obj;
        float floatValue = ((Number) this.a.d()).floatValue();
        float a = bnb.a(cleVar, floatValue);
        float b = bnb.b(cleVar, floatValue);
        if (b == brg.a) {
            f = 1.0f;
        } else {
            f = a / b;
        }
        cleVar.y(f);
        cleVar.C(bnb.a);
        return arnb.a;
    }
}
