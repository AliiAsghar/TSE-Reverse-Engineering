package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astf extends astd {
    public astf() {
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
        i();
        return 48;
    }

    @Override // defpackage.assy
    public final int b() {
        return 48;
    }

    @Override // defpackage.assy
    public final String c() {
        return "SHA-384";
    }

    @Override // defpackage.astd
    public final void i() {
        super.i();
        this.b = -3766243637369397544L;
        this.c = 7105036623409894663L;
        this.d = -7973340178411365097L;
        this.e = 1526699215303891257L;
        this.f = 7436329637833083697L;
        this.g = -8163818279084223215L;
        this.h = -2662702644619276377L;
        this.i = 5167115440072839076L;
    }
}
