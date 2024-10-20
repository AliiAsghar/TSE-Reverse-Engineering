package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvn implements vgf {
    public static final xze a = xze.g("BugleEtouffee", "RegisterDataDecoratorImpl");
    public final anen b;
    public final tvl c;
    public final armf d;
    public final xyt e;
    public final armf f;
    public final armf g;
    public final armf h;
    private final anen i;
    private final wyp j;

    public tvn(anen anenVar, anen anenVar2, tvl tvlVar, armf armfVar, xyt xytVar, wyp wypVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = anenVar;
        this.i = anenVar2;
        this.c = tvlVar;
        this.d = armfVar;
        this.e = xytVar;
        this.j = wypVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
    }

    @Override // defpackage.vgf
    public final akul a(aozy aozyVar, msh mshVar, int i) {
        akul h;
        String str = (String) mshVar.c().orElseThrow(new toe(17));
        if (i == 1) {
            h = aktp.ag(true);
        } else {
            h = this.j.D(str).e().h(new tvd(8), this.b);
        }
        return h.i(new qbt((Object) this, (Object) aozyVar, (Object) str, 19, (byte[]) null), this.i);
    }
}
