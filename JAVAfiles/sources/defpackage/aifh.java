package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
class aifh extends InputStream implements InputStreamRetargetInterface {
    private final InputStream a;

    public aifh(InputStream inputStream) {
        inputStream.getClass();
        this.a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aifh)) {
            return false;
        }
        if (this != obj && !this.a.equals(((aifh) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(aifh.class, this.a);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.a.skip(j);
    }

    public final String toString() {
        return String.format("ForwardingInputStream { delegate=%s }", this.a);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.a.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
