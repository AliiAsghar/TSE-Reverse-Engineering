package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoag extends InputStream implements InputStreamRetargetInterface {
    boolean a = false;
    InputStream b = null;
    final InputStream c;
    final List d;
    final byte[] e;

    public aoag(List list, InputStream inputStream, byte[] bArr) {
        this.d = list;
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new BufferedInputStream(inputStream);
        }
        this.c.mark(Integer.MAX_VALUE);
        this.e = (byte[]) bArr.clone();
    }

    private final void a() {
        this.c.reset();
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        if (!this.a) {
            this.a = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    try {
                        InputStream a = ((annk) it.next()).a(this.c, this.e);
                        int read = a.read(bArr, i, i2);
                        if (read != 0) {
                            this.b = a;
                            this.c.mark(0);
                            return read;
                        }
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    } catch (IOException unused) {
                        a();
                    }
                } catch (GeneralSecurityException unused2) {
                    a();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
