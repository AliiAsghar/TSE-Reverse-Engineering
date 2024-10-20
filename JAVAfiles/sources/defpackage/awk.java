package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awk extends arrp implements arqr<chj, chp> {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awk(long j) {
        super(1);
        this.a = j;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        chj chjVar = (chj) obj;
        float intBitsToFloat = Float.intBitsToFloat((int) (chjVar.a() >> 32)) / 2.0f;
        return chjVar.o(new awj(intBitsToFloat, bcd.a(chjVar, intBitsToFloat), new ckl(this.a, 5)));
    }
}
