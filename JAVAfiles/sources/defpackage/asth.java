package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asth extends astd {
    public asth() {
        aotl.J(this);
        assw.a();
        i();
    }

    @Override // defpackage.assy
    public final int a(byte[] bArr, int i) {
        f();
        atow.I(this.b, bArr, i);
        atow.I(this.c, bArr, i + 8);
        atow.I(this.d, bArr, i + 16);
        atow.I(this.e, bArr, i + 24);
        atow.I(this.f, bArr, i + 32);
        atow.I(this.g, bArr, i + 40);
        atow.I(this.h, bArr, i + 48);
        atow.I(this.i, bArr, i + 56);
        i();
        return 64;
    }

    @Override // defpackage.assy
    public final int b() {
        return 64;
    }

    @Override // defpackage.assy
    public final String c() {
        return "SHA-512";
    }

    @Override // defpackage.astd
    public final void i() {
        super.i();
        this.b = 7640891576956012808L;
        this.c = -4942790177534073029L;
        this.d = 4354685564936845355L;
        this.e = -6534734903238641935L;
        this.f = 5840696475078001361L;
        this.g = -7276294671716946913L;
        this.h = 2270897969802886507L;
        this.i = 6620516959819538809L;
    }
}
