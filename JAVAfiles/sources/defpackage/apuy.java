package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apuy implements apus {
    private final int a;
    private final int b;
    private final InputStream c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    public apuy(InputStream inputStream, long j, int i) {
        if (!inputStream.markSupported()) {
            this.c = new BufferedInputStream(inputStream);
        } else {
            this.c = inputStream;
        }
        this.g = j;
        this.a = i;
        i = i != Integer.MAX_VALUE ? i + 1 : i;
        this.b = i;
        this.c.mark(i);
    }

    @Override // defpackage.apus
    public final synchronized int a(byte[] bArr, int i, int i2) {
        boolean z;
        if (65536 - i >= i2) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        int read = this.c.read(bArr, i, (int) Math.min(i2, this.a - (this.e - this.d)));
        if (read == -1) {
            long j = this.g;
            if (j == -1) {
                this.g = this.e;
            } else if (this.e < j) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j2 = this.e + read;
        this.e = j2;
        long j3 = this.g;
        if (j3 != -1 && j2 > j3) {
            throw new IOException("The stream continues beyond expected size");
        }
        return read;
    }

    @Override // defpackage.apus
    public final synchronized long b() {
        return this.d;
    }

    @Override // defpackage.apus
    public final synchronized long c() {
        return this.a;
    }

    @Override // defpackage.apus, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // defpackage.apus
    public final synchronized long d() {
        return this.e;
    }

    @Override // defpackage.apus
    public final synchronized long e() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (i() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r2 = r5.c.skip(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r2 == 0) goto L27;
     */
    @Override // defpackage.apus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized long f(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.e     // Catch: java.lang.Throwable -> L44
            long r2 = r5.d     // Catch: java.lang.Throwable -> L44
            long r0 = r0 - r2
            int r2 = r5.a     // Catch: java.lang.Throwable -> L44
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L44
            long r2 = r2 - r0
            long r6 = java.lang.Math.min(r6, r2)     // Catch: java.lang.Throwable -> L44
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            monitor-exit(r5)
            return r0
        L16:
            boolean r2 = r5.f     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L22
            java.io.InputStream r2 = r5.c     // Catch: java.lang.Throwable -> L44
            r2.reset()     // Catch: java.lang.Throwable -> L44
            r2 = 0
            r5.f = r2     // Catch: java.lang.Throwable -> L44
        L22:
            java.io.InputStream r2 = r5.c     // Catch: java.lang.Throwable -> L44
            long r2 = r2.skip(r6)     // Catch: java.lang.Throwable -> L44
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L3c
            boolean r2 = r5.i()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L3d
        L32:
            java.io.InputStream r2 = r5.c     // Catch: java.lang.Throwable -> L44
            long r2 = r2.skip(r6)     // Catch: java.lang.Throwable -> L44
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L32
        L3c:
            r0 = r2
        L3d:
            long r6 = r5.e     // Catch: java.lang.Throwable -> L44
            long r6 = r6 + r0
            r5.e = r6     // Catch: java.lang.Throwable -> L44
            monitor-exit(r5)
            return r0
        L44:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L44
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apuy.f(long):long");
    }

    @Override // defpackage.apus
    public final synchronized void g() {
        if (this.d != this.e) {
            this.c.mark(this.b);
        }
        this.d = this.e;
    }

    @Override // defpackage.apus
    public final synchronized void h() {
        this.e = this.d;
        this.f = true;
    }

    @Override // defpackage.apus
    public final synchronized boolean i() {
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        if (this.c.available() <= 0) {
            if (this.c.read() == -1) {
                this.g = this.e;
                return false;
            }
            this.c.reset();
            long j = this.e;
            long j2 = this.d;
            while (true) {
                j -= j2;
                if (j <= 0) {
                    break;
                }
                j2 = this.c.skip(j);
            }
        }
        return true;
    }
}
