package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aptd implements Closeable {
    public aptc a;
    private final InputStream c;
    private final byte[] d = new byte[8];
    public final aojh b = new aojh((byte[]) null);

    public aptd(InputStream inputStream) {
        this.c = inputStream;
    }

    private final void f() {
        this.a = null;
    }

    private final void g(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.c.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        f();
    }

    private final void h(int i) {
        g(this.d, i);
    }

    public final long a() {
        byte b = this.a.b;
        if (b < 24) {
            f();
            return b;
        }
        if (b == 24) {
            int read = this.c.read();
            if (read != -1) {
                f();
                return read & 255;
            }
            throw new EOFException();
        }
        if (b == 25) {
            h(2);
            byte[] bArr = this.d;
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        if (b == 26) {
            h(4);
            byte[] bArr2 = this.d;
            return ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (255 & bArr2[3]);
        }
        if (b == 27) {
            h(8);
            byte[] bArr3 = this.d;
            long j = bArr3[0];
            long j2 = bArr3[1];
            long j3 = bArr3[2];
            long j4 = bArr3[3];
            return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((j4 & 255) << 32) | ((j2 & 255) << 48) | ((j & 255) << 56) | ((j3 & 255) << 40) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
        }
        throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(b), Integer.valueOf(this.a.a())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (r0 == (-2)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Deque] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aptc b() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aptd.b():aptc");
    }

    public final void c() {
        b();
        if (this.a.b != 31) {
        } else {
            throw new IllegalStateException(String.format("expected definite length but found %s", (byte) 31));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
        this.b.F();
    }

    public final void d(byte b) {
        b();
        if (this.a.a == b) {
        } else {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.a.a())));
        }
    }

    public final byte[] e() {
        c();
        long a = a();
        if (a >= 0 && a <= 2147483647L) {
            if (this.c.available() >= a) {
                int i = (int) a;
                byte[] bArr = new byte[i];
                g(bArr, i);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
    }
}
