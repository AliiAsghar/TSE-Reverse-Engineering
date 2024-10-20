package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astg extends astc {
    public astg() {
        super(256);
    }

    @Override // defpackage.astc, defpackage.assy
    public final int a(byte[] bArr, int i) {
        h(2, 2);
        return super.a(bArr, i);
    }

    @Override // defpackage.astc, defpackage.assy
    public final String c() {
        return "SHA3-" + this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public astg(int i) {
        super(i);
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(a.cb(i, "'bitLength' ", " not supported for SHA-3"));
        }
    }
}
