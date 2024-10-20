package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class IndefiniteLengthInputStream extends LimitedInputStream {
    private int a;
    private int b;
    private boolean e;
    private boolean f;

    public IndefiniteLengthInputStream(InputStream inputStream, int i) {
        super(inputStream, i);
        this.e = false;
        this.f = true;
        this.a = inputStream.read();
        int read = inputStream.read();
        this.b = read;
        if (read >= 0) {
            c();
            return;
        }
        throw new EOFException();
    }

    private final boolean c() {
        if (!this.e && this.f && this.a == 0 && this.b == 0) {
            this.e = true;
            b();
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.f = z;
        c();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (c()) {
            return -1;
        }
        int read = this.c.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i = this.a;
        this.a = this.b;
        this.b = read;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.e) {
            return -1;
        }
        int read = this.c.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.a;
            bArr[i + 1] = (byte) this.b;
            this.a = this.c.read();
            int read2 = this.c.read();
            this.b = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
