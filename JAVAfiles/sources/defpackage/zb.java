package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zb extends arrp implements arqr<cle, arnb> {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(long j) {
        super(1);
        this.a = j;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cle cleVar = (cle) obj;
        cleVar.x(Float.intBitsToFloat((int) (this.a >> 32)));
        cleVar.y(Float.intBitsToFloat((int) (this.a & 4294967295L)));
        cleVar.C(cmh.a(brg.a, brg.a));
        return arnb.a;
    }
}
