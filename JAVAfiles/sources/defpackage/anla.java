package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anla implements anky {
    private final anjw a;
    private final anja b;
    private final String c;
    private final anix d;

    public anla(anjw anjwVar, anja anjaVar, String str, anix anixVar) {
        this.a = anjwVar;
        this.b = anjaVar;
        this.c = str;
        this.d = anixVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aptx e(int i, aniv anivVar) {
        aozy createBuilder = aptx.a.createBuilder();
        createBuilder.getClass();
        aovn.o(this.c, createBuilder);
        aozy createBuilder2 = apty.a.createBuilder();
        createBuilder2.getClass();
        aovn.i(this.a.a, createBuilder2);
        aovn.h(this.b.b.toString(), createBuilder2);
        aovn.j(this.b.a.d(), createBuilder2);
        aovn.l(i, createBuilder2);
        if (anivVar != null) {
            aovn.k(aogy.j(anivVar), createBuilder2);
        }
        aovn.p(aovn.g(createBuilder2), createBuilder);
        anix anixVar = this.d;
        if (anixVar != null) {
            aovn.q(anixVar.a, createBuilder);
        }
        return aovn.m(createBuilder);
    }

    @Override // defpackage.anky
    public final aptx a(aniv anivVar) {
        return e(5, anivVar);
    }

    @Override // defpackage.anky
    public final aptx b() {
        throw null;
    }

    @Override // defpackage.anky
    public final aptx c() {
        return e(3, null);
    }
}
