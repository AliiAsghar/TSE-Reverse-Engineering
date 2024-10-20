package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bci extends arrp implements arqr<chj, chp> {
    final /* synthetic */ long a;
    final /* synthetic */ arqg b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bci(long j, arqg arqgVar, boolean z) {
        super(1);
        this.a = j;
        this.b = arqgVar;
        this.c = z;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        chj chjVar = (chj) obj;
        return chjVar.o(new bch(this.b, this.c, bcd.a(chjVar, Float.intBitsToFloat((int) (chjVar.a() >> 32)) / 2.0f), new ckl(this.a, 5)));
    }
}
