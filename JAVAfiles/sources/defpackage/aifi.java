package defpackage;

import j$.util.Objects;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
class aifi extends OutputStream {
    private final OutputStream a;

    public aifi(OutputStream outputStream) {
        outputStream.getClass();
        this.a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aifi)) {
            return false;
        }
        if (this != obj && !this.a.equals(((aifi) obj).a)) {
            return false;
        }
        return true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public final int hashCode() {
        return Objects.hash(aifi.class, this.a);
    }

    public final String toString() {
        return String.format("ForwardingOutputStream { delegate=%s }", this.a);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
