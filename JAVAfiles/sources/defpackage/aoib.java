package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoib extends FilterInputStream implements InputStreamRetargetInterface {
    private long a;
    private long b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoib(InputStream inputStream, long j, int i) {
        super(inputStream);
        this.c = i;
        this.b = -1L;
        d.t(j >= 0, "limit must be non-negative");
        this.a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long min;
        if (this.c != 0) {
            min = Math.min(this.in.available(), this.a);
        } else {
            min = Math.min(this.in.available(), this.a);
        }
        return (int) min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        if (this.c != 0) {
            this.in.mark(i);
            this.b = this.a;
        } else {
            this.in.mark(i);
            this.b = this.a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i = this.c;
        long j = this.a;
        if (i != 0) {
            if (j == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read == -1) {
                return read;
            }
            this.a--;
            return read;
        }
        if (j == 0) {
            return -1;
        }
        int read2 = this.in.read();
        if (read2 == -1) {
            return read2;
        }
        this.a--;
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.c != 0) {
            if (this.in.markSupported()) {
                if (this.b != -1) {
                    this.in.reset();
                    this.a = this.b;
                    return;
                }
                throw new IOException("Mark not set");
            }
            throw new IOException("Mark not supported");
        }
        if (this.in.markSupported()) {
            if (this.b != -1) {
                this.in.reset();
                this.a = this.b;
                return;
            }
            throw new IOException("Mark not set");
        }
        throw new IOException("Mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (this.c != 0) {
            long skip = this.in.skip(Math.min(j, this.a));
            this.a -= skip;
            return skip;
        }
        long skip2 = this.in.skip(Math.min(j, this.a));
        this.a -= skip2;
        return skip2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        if (this.c != 0) {
            return DesugarInputStream.transferTo(this, outputStream);
        }
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoib(InputStream inputStream, int i) {
        super(inputStream);
        this.c = i;
        this.b = -1L;
        this.a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.c != 0) {
            long j = this.a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min(i2, j));
            if (read == -1) {
                return read;
            }
            this.a -= read;
            return read;
        }
        long j2 = this.a;
        if (j2 == 0) {
            return -1;
        }
        int read2 = this.in.read(bArr, i, (int) Math.min(i2, j2));
        if (read2 == -1) {
            return read2;
        }
        this.a -= read2;
        return read2;
    }
}
