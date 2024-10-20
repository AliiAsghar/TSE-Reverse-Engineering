package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vge implements vfy {
    public static final xze a = xze.g("BugleNetwork", "TachygramClientFeatureFlagsValueDecorator");
    private final anen b;
    private final armf c;
    private final xti d;

    public vge(xti xtiVar, anen anenVar, armf armfVar) {
        this.d = xtiVar;
        this.b = anenVar;
        this.c = armfVar;
    }

    @Override // defpackage.vfy
    public final akul a(aozy aozyVar, msh mshVar) {
        if (((pop) this.c.b()).a()) {
            if (!alog.s(1, 3).contains(xtk.a.e())) {
                aozyVar.bN(askr.TACHYGRAM);
            }
            return akul.g(albo.bI(aozyVar));
        }
        return this.d.c(mshVar).h(new vgd(aozyVar, 0), this.b);
    }
}
