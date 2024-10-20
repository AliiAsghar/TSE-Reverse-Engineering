package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambg extends ambj implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public ambg(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.ambj
    public final int a() {
        boolean z;
        int length = this.a.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        albo.V(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.ambj
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.ambj
    public final long c() {
        boolean z;
        int length = this.a.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        albo.V(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.ambj
    public final boolean d(ambj ambjVar) {
        boolean z;
        if (this.a.length != ambjVar.f().length) {
            return false;
        }
        boolean z2 = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                if (bArr[i] == ambjVar.f()[i]) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
                i++;
            } else {
                return z2;
            }
        }
    }

    @Override // defpackage.ambj
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.ambj
    public final byte[] f() {
        return this.a;
    }

    @Override // defpackage.ambj
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }
}
