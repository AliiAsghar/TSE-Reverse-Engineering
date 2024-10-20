package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ankz implements anky {
    private final apts a;
    private final String b;
    private final anix c;

    public ankz(apts aptsVar, String str, anix anixVar) {
        aptsVar.getClass();
        this.a = aptsVar;
        this.b = str;
        this.c = anixVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aptx e(int i, aniv anivVar) {
        aozy createBuilder = aptx.a.createBuilder();
        createBuilder.getClass();
        aovn.o(this.b, createBuilder);
        aozy createBuilder2 = aptt.a.createBuilder();
        createBuilder2.getClass();
        apsd.l(this.a, createBuilder2);
        apsd.n(3, createBuilder2);
        apsd.o(i, createBuilder2);
        if (anivVar != null) {
            apsd.m(aogy.j(anivVar), createBuilder2);
        }
        aovn.n(apsd.k(createBuilder2), createBuilder);
        anix anixVar = this.c;
        if (anixVar != null) {
            aovn.q(anixVar.a, createBuilder);
        }
        return aovn.m(createBuilder);
    }

    @Override // defpackage.anky
    public final aptx a(aniv anivVar) {
        return e(4, anivVar);
    }

    @Override // defpackage.anky
    public final aptx b() {
        return e(5, null);
    }

    @Override // defpackage.anky
    public final aptx c() {
        return e(3, null);
    }

    public /* synthetic */ ankz(apts aptsVar, String str) {
        this(aptsVar, str, null);
    }
}
