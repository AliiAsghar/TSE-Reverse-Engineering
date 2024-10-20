package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asri implements asqv {
    public final asro a;
    public final asqu b = new asqu();
    public boolean c;

    public asri(asro asroVar) {
        this.a = asroVar;
    }

    @Override // defpackage.asqv
    public final void J(asqx asqxVar) {
        asqxVar.getClass();
        if (!this.c) {
            this.b.J(asqxVar);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqv
    public final void N(int i) {
        if (!this.c) {
            this.b.M(i);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqv
    public final void P(int i) {
        if (!this.c) {
            this.b.O(i);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqv
    public final void Q(int i) {
        if (!this.c) {
            asqu asquVar = this.b;
            asrl w = asquVar.w(2);
            byte[] bArr = w.a;
            int i2 = w.c;
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i2 + 1] = (byte) (i & 255);
            w.c = i2 + 2;
            asquVar.b += 2;
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqv
    public final void U(byte[] bArr) {
        if (!this.c) {
            this.b.K(bArr, 0, 0);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqv
    public final void X(byte[] bArr) {
        bArr.getClass();
        if (!this.c) {
            this.b.X(bArr);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asqv
    public final void Z(String str) {
        str.getClass();
        if (!this.c) {
            this.b.Z(str);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asro
    public final asrs a() {
        return this.a.a();
    }

    public final void c() {
        if (!this.c) {
            long h = this.b.h();
            if (h > 0) {
                this.a.hq(this.b, h);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.asro
    public final void close() {
        Throwable th;
        if (!this.c) {
            try {
                asqu asquVar = this.b;
                long j = asquVar.b;
                th = null;
                if (j > 0) {
                    this.a.hq(asquVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.asqv, defpackage.asro, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            asqu asquVar = this.b;
            long j = asquVar.b;
            if (j > 0) {
                this.a.hq(asquVar, j);
            }
            this.a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        if (!this.c) {
            this.b.hq(asquVar, j);
            c();
            return;
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

    @Override // defpackage.asqv
    public final asqu q() {
        return this.b;
    }

    @Override // defpackage.asqv
    public final asqv r(long j) {
        if (!this.c) {
            this.b.Y(j);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
