package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahgd extends arrp implements arqv {
    final /* synthetic */ cga a;
    final /* synthetic */ float b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgd(cga cgaVar, float f, long j, int i, int i2, int i3) {
        super(2);
        this.f = i3;
        this.a = cgaVar;
        this.b = f;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            ((Number) obj2).intValue();
            ahji.U(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
        ((Number) obj2).intValue();
        ahji.V(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1), this.e);
        return arnb.a;
    }
}
