package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atao extends atat {
    public final int a;
    public final int b;
    public final int c;

    public atao(atan atanVar) {
        super(atanVar);
        this.a = atanVar.a;
        this.b = atanVar.b;
        this.c = atanVar.c;
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
