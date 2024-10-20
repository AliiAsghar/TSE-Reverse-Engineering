package defpackage;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozi extends aozl {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    public aozi(OutputStream outputStream, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.a = bArr;
            this.b = bArr.length;
            if (outputStream != null) {
                this.g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    private final void aA(int i) {
        if (this.b - this.c < i) {
            az();
        }
    }

    private final void az() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    @Override // defpackage.aozl
    public final void A(int i, int i2) {
        C(apdh.c(i, i2));
    }

    @Override // defpackage.aozl
    public final void B(int i, int i2) {
        aA(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.aozl
    public final void C(int i) {
        aA(5);
        g(i);
    }

    @Override // defpackage.aozl
    public final void D(int i, long j) {
        aA(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.aozl
    public final void E(long j) {
        aA(10);
        h(j);
    }

    @Override // defpackage.aozl
    public final void F(byte[] bArr, int i) {
        C(i);
        k(bArr, 0, i);
    }

    @Override // defpackage.aozl, defpackage.aoyt
    public final void a(byte[] bArr, int i, int i2) {
        k(bArr, i, i2);
    }

    @Override // defpackage.aozl
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void c(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        bArr[i] = b;
        this.c = i + 1;
        this.d++;
    }

    final void d(int i) {
        int i2 = this.c;
        byte[] bArr = this.a;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.c = i2 + 4;
        this.d += 4;
    }

    final void e(long j) {
        int i = this.c;
        byte[] bArr = this.a;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.c = i + 8;
        this.d += 8;
    }

    final void f(int i, int i2) {
        g(apdh.c(i, i2));
    }

    final void g(int i) {
        if (aozl.e) {
            long j = this.c;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                apdb.n(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            apdb.n(bArr2, i3, (byte) i);
            this.d += (int) (this.c - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            bArr3[i4] = (byte) (i | 128);
            this.d++;
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        bArr4[i5] = (byte) i;
        this.d++;
    }

    final void h(long j) {
        if (aozl.e) {
            long j2 = this.c;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    apdb.n(bArr, i2, (byte) i);
                    this.d += (int) (this.c - j2);
                    return;
                }
                byte[] bArr2 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                apdb.n(bArr2, i3, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.a;
                    int i5 = this.c;
                    this.c = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.d++;
                    return;
                }
                byte[] bArr4 = this.a;
                int i6 = this.c;
                this.c = i6 + 1;
                bArr4[i6] = (byte) (i4 | 128);
                this.d++;
                j >>>= 7;
            }
        }
    }

    @Override // defpackage.aozl
    public final void i() {
        if (this.c > 0) {
            az();
        }
    }

    @Override // defpackage.aozl
    public final void j(byte b) {
        if (this.c == this.b) {
            az();
        }
        c(b);
    }

    public final void k(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        this.c = this.b;
        this.d += i5;
        az();
        int i7 = i2 - i5;
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.aozl
    public final void l(int i, boolean z) {
        aA(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.aozl
    public final void m(int i, aozb aozbVar) {
        A(i, 2);
        n(aozbVar);
    }

    @Override // defpackage.aozl
    public final void n(aozb aozbVar) {
        C(aozbVar.d());
        aozbVar.p(this);
    }

    @Override // defpackage.aozl
    public final void o(int i, int i2) {
        aA(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.aozl
    public final void p(int i) {
        aA(4);
        d(i);
    }

    @Override // defpackage.aozl
    public final void q(int i, long j) {
        aA(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.aozl
    public final void r(long j) {
        aA(8);
        e(j);
    }

    @Override // defpackage.aozl
    public final void s(int i, int i2) {
        aA(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.aozl
    public final void t(int i) {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.aozl
    public final void u(int i, apbt apbtVar, apcj apcjVar) {
        A(i, 2);
        C(((aoyj) apbtVar).getSerializedSize(apcjVar));
        apcjVar.m(apbtVar, this.f);
    }

    @Override // defpackage.aozl
    public final void v(apbt apbtVar) {
        C(apbtVar.getSerializedSize());
        apbtVar.writeTo(this);
    }

    @Override // defpackage.aozl
    public final void w(int i, apbt apbtVar) {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(apbtVar);
        A(1, 4);
    }

    @Override // defpackage.aozl
    public final void x(int i, aozb aozbVar) {
        A(1, 3);
        B(2, i);
        m(3, aozbVar);
        A(1, 4);
    }

    @Override // defpackage.aozl
    public final void y(int i, String str) {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.aozl
    public final void z(String str) {
        int b;
        try {
            int length = str.length() * 3;
            int ab = ab(length);
            int i = ab + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int a = apdd.a(str, bArr, 0, length);
                C(a);
                k(bArr, 0, a);
                return;
            }
            if (i > i2 - this.c) {
                az();
            }
            int ab2 = ab(str.length());
            int i3 = this.c;
            try {
                if (ab2 == ab) {
                    int i4 = i3 + ab2;
                    this.c = i4;
                    int a2 = apdd.a(str, this.a, i4, this.b - i4);
                    this.c = i3;
                    b = (a2 - i3) - ab2;
                    g(b);
                    this.c = a2;
                } else {
                    b = apdd.b(str);
                    g(b);
                    this.c = apdd.a(str, this.a, this.c, b);
                }
                this.d += b;
            } catch (apdc e) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new aozk(e2);
            }
        } catch (apdc e3) {
            ai(str, e3);
        }
    }
}
