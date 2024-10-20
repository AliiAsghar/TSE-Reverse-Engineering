package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfq extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agfq(float f, long j, int i, int i2) {
        super(2);
        this.d = i2;
        this.a = f;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            ((Number) obj2).intValue();
            int i = this.c;
            long j = this.b;
            adcx.bB(this.a, j, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
        ((Number) obj2).intValue();
        int i2 = this.c;
        long j2 = this.b;
        agiz.J(this.a, j2, (bwj) obj, bzh.a(i2 | 1));
        return arnb.a;
    }
}
