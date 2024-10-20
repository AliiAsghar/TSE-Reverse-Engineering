package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozj extends aozl {
    private final byte[] a;
    private final int b;
    private int c;

    public aozj(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int i3 = i + i2;
            int length = bArr.length;
            if ((i | i2 | (length - i3)) >= 0) {
                this.a = bArr;
                this.c = i;
                this.b = i3;
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // defpackage.aozl
    public final void A(int i, int i2) {
        C(apdh.c(i, i2));
    }

    @Override // defpackage.aozl
    public final void B(int i, int i2) {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.aozl
    public final void C(int i) {
        int i2;
        int i3 = this.c;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.a[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i3 = i2;
                    throw new aozk(i3, this.b, 1, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new aozk(i3, this.b, 1, e);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.aozl
    public final void D(int i, long j) {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.aozl
    public final void E(long j) {
        int i;
        int i2;
        int i3 = this.c;
        if (aozl.e && b() >= 10) {
            while ((j & (-128)) != 0) {
                apdb.n(this.a, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            apdb.n(this.a, i3, (byte) j);
        } else {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.a[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    throw new aozk(i3, this.b, 1, e);
                }
            }
            i = i3 + 1;
            try {
                this.a[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = i;
                throw new aozk(i3, this.b, 1, e);
            }
        }
        this.c = i;
    }

    @Override // defpackage.aozl
    public final void F(byte[] bArr, int i) {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.aozl, defpackage.aoyt
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // defpackage.aozl
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new aozk(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.aozl
    public final void j(byte b) {
        int i;
        int i2 = this.c;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.a[i2] = b;
            this.c = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new aozk(i2, this.b, 1, e);
        }
    }

    @Override // defpackage.aozl
    public final void l(int i, boolean z) {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
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
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.aozl
    public final void p(int i) {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new aozk(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.aozl
    public final void q(int i, long j) {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.aozl
    public final void r(long j) {
        int i = this.c;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new aozk(i, this.b, 8, e);
        }
    }

    @Override // defpackage.aozl
    public final void s(int i, int i2) {
        A(i, 0);
        t(i2);
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
        int i = this.c;
        try {
            int ab = ab(str.length() * 3);
            int ab2 = ab(str.length());
            if (ab2 == ab) {
                int i2 = i + ab2;
                this.c = i2;
                int a = apdd.a(str, this.a, i2, b());
                this.c = i;
                C((a - i) - ab2);
                this.c = a;
                return;
            }
            C(apdd.b(str));
            this.c = apdd.a(str, this.a, this.c, b());
        } catch (apdc e) {
            this.c = i;
            ai(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new aozk(e2);
        }
    }

    @Override // defpackage.aozl
    public final void i() {
    }
}
