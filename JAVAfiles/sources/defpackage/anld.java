package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anld implements anky {
    private final String a;
    private final int b;

    public anld(int i, String str) {
        this.b = i;
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aptx e(int i, aniv anivVar) {
        aozy createBuilder = aptx.a.createBuilder();
        createBuilder.getClass();
        aovn.o(this.a, createBuilder);
        aozy createBuilder2 = aptz.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aptz) createBuilder2.b).c = a.ak(this.b);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aptz) createBuilder2.b).d = a.an(3);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aptz) createBuilder2.b).e = a.ak(i);
        if (anivVar != null) {
            aptw j = aogy.j(anivVar);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            aptz aptzVar = (aptz) createBuilder2.b;
            aptzVar.f = j;
            aptzVar.b |= 1;
        }
        apag s = createBuilder2.s();
        s.getClass();
        aptz aptzVar2 = (aptz) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aptx aptxVar = (aptx) createBuilder.b;
        aptxVar.d = aptzVar2;
        aptxVar.c = 3;
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
}
