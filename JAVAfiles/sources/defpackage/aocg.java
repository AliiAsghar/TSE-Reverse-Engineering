package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aocg extends FilterInputStream implements InputStreamRetargetInterface {
    private final ByteBuffer a;
    private final ByteBuffer b;
    private final int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final byte[] h;
    private int i;
    private final aoce j;
    private final int k;
    private final int l;

    public aocg(aobt aobtVar, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.j = aobtVar.g();
        this.c = aobtVar.e();
        this.h = Arrays.copyOf(bArr, bArr.length);
        int d = aobtVar.d();
        this.k = d;
        ByteBuffer allocate = ByteBuffer.allocate(d + 1);
        this.a = allocate;
        allocate.limit(0);
        this.l = d - aobtVar.c();
        ByteBuffer allocate2 = ByteBuffer.allocate(aobtVar.f() + 16);
        this.b = allocate2;
        allocate2.limit(0);
        this.d = false;
        this.e = false;
        this.f = false;
        this.i = 0;
        this.g = false;
    }

    private final void a() {
        byte b;
        while (!this.e && this.a.remaining() > 0) {
            InputStream inputStream = this.in;
            ByteBuffer byteBuffer = this.a;
            int read = inputStream.read(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer2 = this.a;
                byteBuffer2.position(byteBuffer2.position() + read);
            } else if (read == -1) {
                this.e = true;
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (!this.e) {
            ByteBuffer byteBuffer3 = this.a;
            int position = byteBuffer3.position() - 1;
            ByteBuffer byteBuffer4 = this.a;
            b = byteBuffer3.get(position);
            byteBuffer4.position(byteBuffer4.position() - 1);
        } else {
            b = 0;
        }
        this.a.flip();
        this.b.clear();
        try {
            this.j.a(this.a, this.i, this.e, this.b);
            this.i++;
            this.b.flip();
            this.a.clear();
            if (!this.e) {
                this.a.clear();
                this.a.limit(this.k + 1);
                this.a.put(b);
            }
        } catch (GeneralSecurityException e) {
            c();
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.i + " endOfCiphertext:" + this.e, e);
        }
    }

    private final void b() {
        if (!this.d) {
            ByteBuffer allocate = ByteBuffer.allocate(this.c);
            while (allocate.remaining() > 0) {
                int read = this.in.read(allocate.array(), allocate.position(), allocate.remaining());
                if (read != -1) {
                    if (read != 0) {
                        allocate.position(allocate.position() + read);
                    } else {
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    }
                } else {
                    c();
                    throw new IOException("Ciphertext is too short");
                }
            }
            allocate.flip();
            try {
                this.j.b(allocate, this.h);
                this.d = true;
                return;
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        }
        c();
        throw new IOException("Decryption failed.");
    }

    private final void c() {
        this.g = true;
        this.b.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.b.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return -1;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int read;
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(this.k, j);
        byte[] bArr = new byte[min];
        long j2 = j;
        while (j2 > 0 && (read = read(bArr, 0, (int) Math.min(min, j2))) > 0) {
            j2 -= read;
        }
        return j - j2;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.i + "\nciphertextSegmentSize:" + this.k + "\nheaderRead:" + this.d + "\nendOfCiphertext:" + this.e + "\nendOfPlaintext:" + this.f + "\ndecryptionErrorOccured:" + this.g + "\nciphertextSgement position:" + this.a.position() + " limit:" + this.a.limit() + "\nplaintextSegment position:" + this.b.position() + " limit:" + this.b.limit();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (this.g) {
            throw new IOException("Decryption failed.");
        }
        if (!this.d) {
            b();
            this.a.clear();
            this.a.limit(this.l + 1);
        }
        if (this.f) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (this.b.remaining() == 0) {
                if (this.e) {
                    this.f = true;
                    break;
                }
                a();
            }
            int min = Math.min(this.b.remaining(), i2 - i3);
            this.b.get(bArr, i3 + i, min);
            i3 += min;
        }
        if (i3 == 0 && this.f) {
            return -1;
        }
        return i3;
    }
}
