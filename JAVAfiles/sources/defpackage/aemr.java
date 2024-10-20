package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemr extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemr(amt amtVar, aeoo aeooVar, float f, arqv arqvVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = amtVar;
        this.d = aeooVar;
        this.a = f;
        this.e = arqvVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, arqr] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                bwj bwjVar = (bwj) obj;
                ((Number) obj2).intValue();
                int i2 = this.b;
                ?? r5 = this.d;
                ?? r4 = this.c;
                aeke.bH(this.e, this.a, r4, r5, bwjVar, bzh.a(i2 | 1));
                return arnb.a;
            }
            bwj bwjVar2 = (bwj) obj;
            ((Number) obj2).intValue();
            int i3 = this.b;
            float f = this.a;
            Object obj3 = this.d;
            hwr.I((aov) this.c, (jym) this.e, (jxu) obj3, f, bwjVar2, bzh.a(i3 | 1));
            return arnb.a;
        }
        bwj bwjVar3 = (bwj) obj;
        ((Number) obj2).intValue();
        aeke.K(this.c, (aeoo) this.d, this.a, this.e, bwjVar3, bzh.a(this.b | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemr(aov aovVar, jym jymVar, jxu jxuVar, float f, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = aovVar;
        this.e = jymVar;
        this.d = jxuVar;
        this.a = f;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemr(asai asaiVar, float f, arqg arqgVar, arqr arqrVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.e = asaiVar;
        this.a = f;
        this.c = arqgVar;
        this.d = arqrVar;
        this.b = i;
    }
}
