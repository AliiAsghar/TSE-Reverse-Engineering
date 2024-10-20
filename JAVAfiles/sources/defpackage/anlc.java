package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anlc implements anky {
    private final anjw a;
    private final String b;

    public anlc(anjw anjwVar, String str) {
        anjwVar.getClass();
        this.a = anjwVar;
        this.b = str;
    }

    public static /* synthetic */ aptx d(anlc anlcVar, int i) {
        return anlcVar.e(i, null);
    }

    public final aptx e(int i, aniv anivVar) {
        aozy createBuilder = aptx.a.createBuilder();
        createBuilder.getClass();
        aovn.o(this.b, createBuilder);
        aozy createBuilder2 = apty.a.createBuilder();
        createBuilder2.getClass();
        aovn.i(this.a.a, createBuilder2);
        aovn.l(i, createBuilder2);
        if (anivVar != null) {
            aovn.k(aogy.j(anivVar), createBuilder2);
        }
        aovn.p(aovn.g(createBuilder2), createBuilder);
        return aovn.m(createBuilder);
    }

    @Override // defpackage.anky
    public final aptx a(aniv anivVar) {
        return e(9, anivVar);
    }

    @Override // defpackage.anky
    public final aptx b() {
        throw null;
    }

    @Override // defpackage.anky
    public final aptx c() {
        return e(8, null);
    }
}
