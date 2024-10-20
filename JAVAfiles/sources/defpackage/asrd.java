package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrd implements asrq {
    private final InputStream a;
    private final asrs b;

    public asrd(InputStream inputStream, asrs asrsVar) {
        this.a = inputStream;
        this.b = asrsVar;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.b;
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        try {
            this.b.l();
            asrl w = asquVar.w(1);
            int read = this.a.read(w.a, w.c, (int) Math.min(j, 8192 - w.c));
            if (read == -1) {
                if (w.b == w.c) {
                    asquVar.a = w.a();
                    asrm.b(w);
                    return -1L;
                }
                return -1L;
            }
            w.c += read;
            long j2 = read;
            asquVar.b += j2;
            return j2;
        } catch (AssertionError e) {
            if (asre.d(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
