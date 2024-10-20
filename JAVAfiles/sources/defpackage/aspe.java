package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspe implements asrq {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final asqw f;

    public aspe(asqw asqwVar) {
        this.f = asqwVar;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.f.a();
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        int i;
        int f;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                this.f.B(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int g = asmt.g(this.f);
                    this.d = g;
                    this.a = g;
                    int y = asmt.y(this.f.d());
                    this.b = asmt.y(this.f.d());
                    if (aspf.a.isLoggable(Level.FINE)) {
                        Logger logger = aspf.a;
                        asqx asqxVar = asom.a;
                        logger.fine(asom.b(true, this.c, this.a, y, this.b));
                    }
                    f = this.f.f() & Integer.MAX_VALUE;
                    this.c = f;
                    if (y != 9) {
                        throw new IOException(a.cq(y, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long b = this.f.b(asquVar, Math.min(8192L, i2));
                if (b != -1) {
                    this.d -= (int) b;
                    return b;
                }
            }
            return -1L;
        } while (f == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
