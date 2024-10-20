package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambi extends ambj implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public ambi(long j) {
        this.a = j;
    }

    @Override // defpackage.ambj
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.ambj
    public final int b() {
        return 64;
    }

    @Override // defpackage.ambj
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ambj
    public final boolean d(ambj ambjVar) {
        if (this.a == ambjVar.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ambj
    public final byte[] e() {
        return new byte[]{(byte) this.a, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
    }

    @Override // defpackage.ambj
    public final void g(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (this.a >> (i2 * 8));
        }
    }
}
