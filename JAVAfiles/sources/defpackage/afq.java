package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afq extends arrp implements arqr<dho, arnb> {
    final /* synthetic */ float a;
    final /* synthetic */ arsy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afq(float f, arsy arsyVar) {
        super(1);
        this.a = f;
        this.b = arsyVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dhl.j((dho) obj, new dgu(((Number) arrn.C(Float.valueOf(this.a), this.b)).floatValue(), this.b));
        return arnb.a;
    }
}
