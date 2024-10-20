package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lil extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lil(Object obj, boolean z, int i, int i2, int i3) {
        super(2);
        this.e = i3;
        this.d = obj;
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, ake] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        bwj bwjVar = (bwj) obj;
                        ((Number) obj2).intValue();
                        adcx.bu(null, (String) this.d, this.a, bwjVar, bzh.a(this.b | 1), this.c);
                        return arnb.a;
                    }
                    ((Number) obj2).intValue();
                    Object obj3 = this.d;
                    String str = (String) obj3;
                    agkx.N(str, this.a, (bwj) obj, bzh.a(1 | this.b), this.c);
                    return arnb.a;
                }
                ((Number) obj2).intValue();
                int a = bzh.a(this.b | 1);
                int i2 = this.c;
                boolean z = this.a;
                aeke.u(this.d, z, (bwj) obj, a, i2);
                return arnb.a;
            }
            ((Number) obj2).intValue();
            a.bS(this.a, this.d, (bwj) obj, 1 | this.b, this.c);
            return arnb.a;
        }
        ((Number) obj2).intValue();
        lgc.c(this.d, this.a, (bwj) obj, bzh.a(1 | this.b), this.c);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lil(boolean z, arqg arqgVar, int i, int i2, int i3) {
        super(2);
        this.e = i3;
        this.a = z;
        this.d = arqgVar;
        this.b = i;
        this.c = i2;
    }
}
