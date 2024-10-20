package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambh extends ambj implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public ambh(int i) {
        this.a = i;
    }

    @Override // defpackage.ambj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ambj
    public final int b() {
        return 32;
    }

    @Override // defpackage.ambj
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.ambj
    public final boolean d(ambj ambjVar) {
        if (this.a == ambjVar.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ambj
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    @Override // defpackage.ambj
    public final void g(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (this.a >> (i2 * 8));
        }
    }
}
