package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzg {
    public final int a;

    public xzg(int i) {
        this.a = i;
    }

    public final void a(int i) {
        if (this.a >= i) {
            return;
        }
        throw new UnsupportedOperationException("This API requires extension version " + i + ", but the device is on " + this.a);
    }

    public xzg(int i, byte[] bArr) {
        this.a = i;
    }

    public xzg(byte[] bArr) {
        int i = gor.a;
        this.a = gor.a();
    }

    public xzg() {
        this(300, null);
    }
}
