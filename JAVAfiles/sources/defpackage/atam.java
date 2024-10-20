package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atam extends atat {
    public final int a;
    public final int b;
    public final int c;

    public atam(atan atanVar) {
        super(atanVar);
        this.a = atanVar.b;
        this.b = atanVar.c;
        this.c = atanVar.a;
    }

    @Override // defpackage.atat
    public final byte[] a() {
        int i = this.a;
        byte[] a = super.a();
        atow.G(i, a, 16);
        atow.G(this.b, a, 20);
        atow.G(this.c, a, 24);
        return a;
    }
}
