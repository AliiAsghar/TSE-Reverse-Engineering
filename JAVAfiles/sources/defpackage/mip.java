package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mip implements armf {
    private final armf a;
    private final armf b;
    private final apwt c;

    public mip(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.b = armfVar2;
        armfVar2.getClass();
        alhr D = albo.D(new mlz(armfVar2, 1));
        D.getClass();
        this.c = new mrr(D, 1);
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        if (((Boolean) this.a.b()).booleanValue()) {
            return this.c.b();
        }
        return this.b.b();
    }
}
