package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrj extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public asrj(asqu asquVar, int i) {
        this.b = i;
        this.a = asquVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        if (this.b != 0) {
            min = Math.min(((asqu) this.a).b, 2147483647L);
        } else {
            asrk asrkVar = (asrk) this.a;
            if (!asrkVar.c) {
                min = Math.min(asrkVar.b.b, 2147483647L);
            } else {
                throw new IOException("closed");
            }
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            return;
        }
        ((asrk) this.a).close();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte d;
        if (this.b != 0) {
            asqu asquVar = (asqu) this.a;
            if (asquVar.b <= 0) {
                return -1;
            }
            d = asquVar.d();
        } else {
            asrk asrkVar = (asrk) this.a;
            if (!asrkVar.c) {
                asqu asquVar2 = asrkVar.b;
                if (asquVar2.b == 0 && asrkVar.a.b(asquVar2, 8192L) == -1) {
                    return -1;
                }
                d = ((asrk) this.a).b.d();
            } else {
                throw new IOException("closed");
            }
        }
        return d & 255;
    }

    public final String toString() {
        if (this.b != 0) {
            Object obj = this.a;
            Objects.toString(obj);
            return obj.toString().concat(".inputStream()");
        }
        Object obj2 = this.a;
        Objects.toString(obj2);
        return obj2.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        if (this.b != 0) {
            return DesugarInputStream.transferTo(this, outputStream);
        }
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public asrj(asrk asrkVar, int i) {
        this.b = i;
        this.a = asrkVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.b != 0) {
            bArr.getClass();
            return ((asqu) this.a).e(bArr, i, i2);
        }
        bArr.getClass();
        if (!((asrk) this.a).c) {
            aotl.T(bArr.length, i, i2);
            asrk asrkVar = (asrk) this.a;
            asqu asquVar = asrkVar.b;
            if (asquVar.b == 0 && asrkVar.a.b(asquVar, 8192L) == -1) {
                return -1;
            }
            return ((asrk) this.a).b.e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
