package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfy extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfy(aexh aexhVar, cga cgaVar, long j, boolean z, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.e = aexhVar;
        this.f = cgaVar;
        this.a = j;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                ((Number) obj2).intValue();
                int a = bzh.a(this.c | 1);
                int i2 = this.d;
                boolean z = this.b;
                long j = this.a;
                ?? r3 = this.f;
                adcx.ax((aexh) this.e, r3, j, z, (bwj) obj, a, i2);
                return arnb.a;
            }
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            yzc.z((kkc) this.f, this.a, this.b, this.e, bwjVar, bzh.a(this.c | 1), this.d);
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        ((Number) obj2).intValue();
        yzc.A((kkc) this.f, this.a, this.b, this.e, bwjVar2, bzh.a(this.c | 1), this.d);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfy(kkc kkcVar, long j, boolean z, arqg arqgVar, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.f = kkcVar;
        this.a = j;
        this.b = z;
        this.e = arqgVar;
        this.c = i;
        this.d = i2;
    }
}
