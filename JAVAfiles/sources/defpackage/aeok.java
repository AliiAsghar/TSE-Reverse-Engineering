package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeok extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ cga c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeok(Character ch, long j, String str, cga cgaVar, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.f = ch;
        this.a = j;
        this.b = str;
        this.c = cgaVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    bwj bwjVar = (bwj) obj;
                    ((Number) obj2).intValue();
                    ahji.N((cor) this.f, this.b, this.c, this.a, bwjVar, bzh.a(this.d | 1), this.e);
                    return arnb.a;
                }
                bwj bwjVar2 = (bwj) obj;
                ((Number) obj2).intValue();
                ahji.O((cov) this.f, this.b, this.c, this.a, bwjVar2, bzh.a(this.d | 1), this.e);
                return arnb.a;
            }
            bwj bwjVar3 = (bwj) obj;
            ((Number) obj2).intValue();
            adom.aN((cor) this.f, this.b, this.c, this.a, bwjVar3, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
        ((Number) obj2).intValue();
        int a = bzh.a(this.d | 1);
        int i2 = this.e;
        cga cgaVar = this.c;
        String str = this.b;
        long j = this.a;
        adom.ar((Character) this.f, j, str, cgaVar, (bwj) obj, a, i2);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeok(Object obj, String str, cga cgaVar, long j, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.f = obj;
        this.b = str;
        this.c = cgaVar;
        this.a = j;
        this.d = i;
        this.e = i2;
    }
}
