package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivu extends InputStream implements InputStreamRetargetInterface {
    private final Callable a;
    private volatile boolean b = false;
    private InputStream c;

    public aivu(Callable callable) {
        this.a = callable;
    }

    private final void a() {
        if (!this.b) {
            this.b = true;
            try {
                this.c = new ByteArrayInputStream((byte[]) this.a.call());
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (!this.b) {
            return 0;
        }
        return this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (!this.b) {
            return;
        }
        this.c.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        return this.c.read();
    }

    @Override // java.io.InputStream
    public final void reset() {
        a();
        this.c.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        a();
        return this.c.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        a();
        return this.c.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        a();
        return this.c.read(bArr, i, i2);
    }
}
