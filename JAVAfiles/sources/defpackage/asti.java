package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asti extends astc implements assy {
    public asti() {
        super(128);
    }

    @Override // defpackage.astc, defpackage.assy
    public final int a(byte[] bArr, int i) {
        int b = b();
        l(bArr, i, b);
        return b;
    }

    @Override // defpackage.astc, defpackage.assy
    public final int b() {
        return this.e >> 2;
    }

    @Override // defpackage.astc, defpackage.assy
    public final String c() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.astc
    protected final void k() {
        c();
    }

    public final void l(byte[] bArr, int i, int i2) {
        if (!this.f) {
            h(15, 4);
        }
        j(bArr, i, i2 * 8);
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asti(int i) {
        super(i);
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException(a.cb(i, "'bitStrength' ", " not supported for SHAKE"));
        }
    }
}
