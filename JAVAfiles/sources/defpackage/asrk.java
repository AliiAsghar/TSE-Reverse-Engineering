package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrk implements asqw {
    public final asrq a;
    public final asqu b = new asqu();
    public boolean c;

    public asrk(asrq asrqVar) {
        this.a = asrqVar;
    }

    @Override // defpackage.asqw
    public final void A(long j) {
        if (D(j)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // defpackage.asqw
    public final void B(long j) {
        if (!this.c) {
            while (j > 0) {
                asqu asquVar = this.b;
                if (asquVar.b == 0 && this.a.b(asquVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.b.b);
                this.b.B(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqw
    public final boolean C() {
        if (!this.c) {
            asqu asquVar = this.b;
            if (asquVar.C() && this.a.b(asquVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqw
    public final boolean D(long j) {
        asqu asquVar;
        if (j >= 0) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            do {
                asquVar = this.b;
                if (asquVar.b >= j) {
                    return true;
                }
            } while (this.a.b(asquVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(a.ck(j, "byteCount < 0: "));
    }

    @Override // defpackage.asqw
    public final byte[] F(long j) {
        A(j);
        return this.b.F(j);
    }

    @Override // defpackage.asqw
    public final void H(asro asroVar) {
        while (this.a.b(this.b, 8192L) != -1) {
            long h = this.b.h();
            if (h > 0) {
                asroVar.hq(this.b, h);
            }
        }
        asqu asquVar = this.b;
        long j = asquVar.b;
        if (j > 0) {
            asroVar.hq(asquVar, j);
        }
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.a.a();
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        if (j >= 0) {
            if (!this.c) {
                asqu asquVar2 = this.b;
                if (asquVar2.b == 0 && this.a.b(asquVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.b.b(asquVar, Math.min(j, this.b.b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.ck(j, "byteCount < 0: "));
    }

    public final int c() {
        A(4L);
        int f = this.b.f();
        int i = f >>> 24;
        int i2 = 16711680 & f;
        int i3 = 65280 & f;
        return ((f & 255) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.asrq
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
            this.b.z();
        }
    }

    @Override // defpackage.asqw
    public final byte d() {
        A(1L);
        return this.b.d();
    }

    public final long e() {
        return h((byte) 0, Long.MAX_VALUE);
    }

    @Override // defpackage.asqw
    public final int f() {
        A(4L);
        return this.b.f();
    }

    @Override // defpackage.asqw
    public final int g(asrf asrfVar) {
        asrfVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int a = asrt.a(this.b, asrfVar, true);
            if (a != -2) {
                if (a != -1) {
                    this.b.B(asrfVar.a[a].b());
                    return a;
                }
            } else if (this.a.b(this.b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final long h(byte b, long j) {
        if (!this.c) {
            long j2 = 0;
            while (j2 < j) {
                long i = this.b.i(b, j2, j);
                if (i != -1) {
                    return i;
                }
                asqu asquVar = this.b;
                long j3 = asquVar.b;
                if (j3 >= j || this.a.b(asquVar, 8192L) == -1) {
                    return -1L;
                }
                j2 = Math.max(j2, j3);
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        if (!this.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0151 A[SYNTHETIC] */
    @Override // defpackage.asqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j(defpackage.asqx r17) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asrk.j(asqx):long");
    }

    @Override // defpackage.asqw
    public final InputStream k() {
        return new asrj(this, 0);
    }

    @Override // defpackage.asqw
    public final String o() {
        return p(Long.MAX_VALUE);
    }

    @Override // defpackage.asqw
    public final String p(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long h = h((byte) 10, j2);
            if (h != -1) {
                return asrt.b(this.b, h);
            }
            if (j2 < Long.MAX_VALUE && D(j2) && this.b.c((-1) + j2) == 13 && D(1 + j2) && this.b.c(j2) == 10) {
                return asrt.b(this.b, j2);
            }
            asqu asquVar = new asqu();
            asqu asquVar2 = this.b;
            asquVar2.G(asquVar, 0L, Math.min(32L, asquVar2.b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.b.b, j) + " content=" + asquVar.s().d() + "…");
        }
        throw new IllegalArgumentException(a.ck(j, "limit < 0: "));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        asqu asquVar = this.b;
        if (asquVar.b == 0 && this.a.b(asquVar, 8192L) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.asqw
    public final asqx t(long j) {
        A(j);
        return this.b.t(j);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.asqw
    public final short x() {
        A(2L);
        return this.b.x();
    }
}
