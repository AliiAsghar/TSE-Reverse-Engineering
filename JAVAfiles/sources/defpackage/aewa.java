package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewa extends arrp implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewa(aeul aeulVar, cga cgaVar, zj zjVar, aeux aeuxVar, arqw arqwVar, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.f = aeulVar;
        this.c = cgaVar;
        this.e = zjVar;
        this.d = aeuxVar;
        this.g = arqwVar;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, aevy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, arqv] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                bwj bwjVar = (bwj) obj;
                ((Number) obj2).intValue();
                ahji.L(this.f, this.c, this.d, this.g, (bmj) this.e, bwjVar, bzh.a(this.a | 1), this.b);
                return arnb.a;
            }
            bwj bwjVar2 = (bwj) obj;
            ((Number) obj2).intValue();
            Object obj3 = this.f;
            ?? r12 = this.c;
            Object obj4 = this.e;
            aeux aeuxVar = (aeux) this.d;
            zj zjVar = (zj) obj4;
            adcx.cf((aeul) obj3, r12, zjVar, aeuxVar, this.g, bwjVar2, bzh.a(1 | this.a), this.b);
            return arnb.a;
        }
        bwj bwjVar3 = (bwj) obj;
        ((Number) obj2).intValue();
        ?? r0 = this.c;
        Object obj5 = this.d;
        String str = (String) obj5;
        adcx.bh(r0, str, this.e, (aewd) this.f, this.g, bwjVar3, bzh.a(1 | this.a), this.b);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewa(aevy aevyVar, String str, cga cgaVar, aewd aewdVar, arqg arqgVar, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.c = aevyVar;
        this.d = str;
        this.e = cgaVar;
        this.f = aewdVar;
        this.g = arqgVar;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewa(arqv arqvVar, cga cgaVar, arqv arqvVar2, arqv arqvVar3, bmj bmjVar, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.f = arqvVar;
        this.c = cgaVar;
        this.d = arqvVar2;
        this.g = arqvVar3;
        this.e = bmjVar;
        this.a = i;
        this.b = i2;
    }
}
