package defpackage;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqt extends OutputStream {
    final /* synthetic */ asqu a;

    public asqt(asqu asquVar) {
        this.a = asquVar;
    }

    public final String toString() {
        asqu asquVar = this.a;
        Objects.toString(asquVar);
        return asquVar.toString().concat(".outputStream()");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.M(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a.K(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
