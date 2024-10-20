package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepf extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepf(aenr aenrVar, aeoo aeooVar, float f, int i, int i2) {
        super(2);
        this.e = i2;
        this.c = aenrVar;
        this.d = aeooVar;
        this.a = f;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r3v3, types: [amt, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                ((Number) obj2).intValue();
                int i2 = this.b;
                ?? r0 = this.d;
                float f = this.a;
                agiz.r(this.c, f, r0, (bwj) obj, bzh.a(i2 | 1));
                return arnb.a;
            }
            ((Number) obj2).intValue();
            Object obj3 = this.d;
            jym jymVar = (jym) obj3;
            hwr.L(jymVar, this.a, this.c, (bwj) obj, bzh.a(1 | this.b));
            return arnb.a;
        }
        ((Number) obj2).intValue();
        int i3 = this.b;
        float f2 = this.a;
        Object obj4 = this.d;
        adom.L((aenr) this.c, (aeoo) obj4, f2, (bwj) obj, bzh.a(i3 | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepf(amt amtVar, float f, arqg arqgVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.c = amtVar;
        this.a = f;
        this.d = arqgVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepf(jym jymVar, float f, cga cgaVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.d = jymVar;
        this.a = f;
        this.c = cgaVar;
        this.b = i;
    }
}
