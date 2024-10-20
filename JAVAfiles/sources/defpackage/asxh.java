package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asxh implements assy {
    private final assy a;
    private final int b;

    public asxh(assy assyVar, int i) {
        this.a = assyVar;
        this.b = i;
    }

    @Override // defpackage.assy
    public final int a(byte[] bArr, int i) {
        assy assyVar = this.a;
        byte[] bArr2 = new byte[assyVar.b()];
        assyVar.a(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i, this.b);
        return this.b;
    }

    @Override // defpackage.assy
    public final int b() {
        return this.b;
    }

    @Override // defpackage.assy
    public final String c() {
        return this.a.c() + "/" + (this.b * 8);
    }

    @Override // defpackage.assy
    public final void d(byte b) {
        this.a.d(b);
    }

    @Override // defpackage.assy
    public final void e(byte[] bArr, int i, int i2) {
        this.a.e(bArr, i, i2);
    }
}
