package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atak extends atat {
    public final int a;
    public final int b;

    public atak(ataj atajVar) {
        super(atajVar);
        this.a = atajVar.a;
        this.b = atajVar.b;
    }

    @Override // defpackage.atat
    public final byte[] a() {
        byte[] a = super.a();
        atow.G(0, a, 16);
        atow.G(this.a, a, 20);
        atow.G(this.b, a, 24);
        return a;
    }
}
