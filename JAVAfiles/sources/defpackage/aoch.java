package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoch extends FilterOutputStream {
    final ByteBuffer a;
    final ByteBuffer b;
    boolean c;
    private final aocf d;
    private final int e;

    public aoch(aobt aobtVar, OutputStream outputStream, byte[] bArr) {
        super(outputStream);
        aocf h = aobtVar.h(bArr);
        this.d = h;
        int f = aobtVar.f();
        this.e = f;
        ByteBuffer allocate = ByteBuffer.allocate(f);
        this.a = allocate;
        this.b = ByteBuffer.allocate(aobtVar.d());
        allocate.limit(f - aobtVar.c());
        ByteBuffer a = h.a();
        byte[] bArr2 = new byte[a.remaining()];
        a.get(bArr2);
        this.out.write(bArr2);
        this.c = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            return;
        }
        try {
            this.a.flip();
            this.b.clear();
            this.d.c(this.a, this.b);
            this.b.flip();
            OutputStream outputStream = this.out;
            ByteBuffer byteBuffer = this.b;
            outputStream.write(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            this.c = false;
            super.close();
        } catch (GeneralSecurityException e) {
            ByteBuffer byteBuffer2 = this.a;
            ByteBuffer byteBuffer3 = this.b;
            throw new IOException("ptBuffer.remaining():" + byteBuffer2.remaining() + " ctBuffer.remaining():" + byteBuffer3.remaining(), e);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (this.c) {
            while (i2 > this.a.remaining()) {
                int remaining = this.a.remaining();
                ByteBuffer wrap = ByteBuffer.wrap(bArr, i, remaining);
                i += remaining;
                i2 -= remaining;
                try {
                    this.a.flip();
                    this.b.clear();
                    this.d.b(this.a, wrap, this.b);
                    this.b.flip();
                    OutputStream outputStream = this.out;
                    ByteBuffer byteBuffer = this.b;
                    outputStream.write(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
                    this.a.clear();
                    this.a.limit(this.e);
                } catch (GeneralSecurityException e) {
                    throw new IOException(e);
                }
            }
            this.a.put(bArr, i, i2);
        } else {
            throw new IOException("Trying to write to closed stream");
        }
    }
}
