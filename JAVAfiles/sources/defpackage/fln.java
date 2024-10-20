package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fln implements flv {
    public final long b;
    public long c;
    public int e;
    public int f;
    private final eqe g;
    public byte[] d = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        erf.b("media3.extractor");
    }

    public fln(eqe eqeVar, long j, long j2) {
        this.g = eqeVar;
        this.c = j;
        this.b = j2;
    }

    private final int q(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.d, 0, bArr, i, min);
        r(min);
        return min;
    }

    private final void r(int i) {
        byte[] bArr;
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr2 = this.d;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.d = bArr;
    }

    @Override // defpackage.flv, defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        int q = q(bArr, i, i2);
        if (q == 0) {
            q = b(bArr, i, i2, 0, true);
        }
        h(q);
        return q;
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.g.a(bArr, i + i3, i2 - i3);
            if (a == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + a;
        }
        throw new InterruptedIOException();
    }

    public final int c(int i) {
        int min = Math.min(this.f, i);
        r(min);
        return min;
    }

    @Override // defpackage.flv
    public final long d() {
        return this.b;
    }

    @Override // defpackage.flv
    public final long e() {
        return this.c + this.e;
    }

    @Override // defpackage.flv
    public final long f() {
        return this.c;
    }

    @Override // defpackage.flv
    public final void g(int i) {
        n(i, false);
    }

    public final void h(int i) {
        if (i != -1) {
            this.c += i;
        }
    }

    public final void i(int i) {
        int i2 = this.e + i;
        int length = this.d.length;
        if (i2 > length) {
            this.d = Arrays.copyOf(this.d, eul.d(length + length, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.flv
    public final void j(byte[] bArr, int i, int i2) {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.flv
    public final void k(byte[] bArr, int i, int i2) {
        p(bArr, i, i2, false);
    }

    @Override // defpackage.flv
    public final void l() {
        this.e = 0;
    }

    @Override // defpackage.flv
    public final void m(int i) {
        int c = c(i);
        while (c < i && c != -1) {
            c = b(this.a, -c, Math.min(i, c + 4096), c, false);
        }
        h(c);
    }

    public final boolean n(int i, boolean z) {
        i(i);
        int i2 = this.f - this.e;
        while (i2 < i) {
            i2 = b(this.d, this.e, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f = this.e + i2;
        }
        this.e += i;
        return true;
    }

    @Override // defpackage.flv
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        if (!n(i2, z)) {
            return false;
        }
        System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.flv
    public final boolean p(byte[] bArr, int i, int i2, boolean z) {
        int q = q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = b(bArr, i, i2, q, z);
        }
        h(q);
        if (q != -1) {
            return true;
        }
        return false;
    }
}
