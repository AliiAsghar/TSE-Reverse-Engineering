package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahgr extends arrp implements arqv {
    final /* synthetic */ cga a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ float e;
    final /* synthetic */ int f;
    final /* synthetic */ Object g;
    final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgr(long j, cor corVar, long j2, cga cgaVar, float f, String str, int i, int i2, int i3) {
        super(2);
        this.i = i3;
        this.b = j;
        this.g = corVar;
        this.c = j2;
        this.a = cgaVar;
        this.e = f;
        this.h = str;
        this.f = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, arqr] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            int a = bzh.a(this.f | 1);
            int i = this.d;
            Object obj3 = this.h;
            float f = this.e;
            cga cgaVar = this.a;
            adcx.be(this.b, (cor) this.g, this.c, cgaVar, f, (String) obj3, bwjVar, a, i);
            return arnb.a;
        }
        ((Number) obj2).intValue();
        ahji.B(this.g, this.a, this.b, this.c, this.d, this.e, this.h, (bwj) obj, bzh.a(this.f | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgr(arqg arqgVar, cga cgaVar, long j, long j2, int i, float f, arqr arqrVar, int i2, int i3) {
        super(2);
        this.i = i3;
        this.g = arqgVar;
        this.a = cgaVar;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = f;
        this.h = arqrVar;
        this.f = i2;
    }
}
