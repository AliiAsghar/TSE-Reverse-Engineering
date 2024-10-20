package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfx extends arrp implements arqr {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ arqg c;
    final /* synthetic */ kkc d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfx(kkc kkcVar, long j, boolean z, arqg arqgVar, int i) {
        super(1);
        this.e = i;
        this.d = kkcVar;
        this.a = j;
        this.b = z;
        this.c = arqgVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        if (this.e != 0) {
            ((bxi) obj).getClass();
            hwr.ap(this.d, this.a, this.b);
            return new kbe(this.c, 6);
        }
        ((bxi) obj).getClass();
        hwr.aq(this.d, this.a, this.b);
        return new kbe(this.c, 7);
    }
}
