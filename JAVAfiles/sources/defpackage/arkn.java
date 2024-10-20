package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arkn implements asrq {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final asqw f;

    public arkn(asqw asqwVar) {
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
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int b = arkr.b(this.f);
                    this.d = b;
                    this.a = b;
                    int d = this.f.d() & 255;
                    this.b = (byte) (this.f.d() & 255);
                    byte b2 = (byte) d;
                    if (arkr.a.isLoggable(Level.FINE)) {
                        arkr.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", arko.a(true, this.c, this.a, b2, this.b));
                    }
                    f = this.f.f() & Integer.MAX_VALUE;
                    this.c = f;
                    if (b2 != 9) {
                        throw arkr.c("%s != TYPE_CONTINUATION", Byte.valueOf(b2));
                    }
                }
            } else {
                long b3 = this.f.b(asquVar, Math.min(8192L, i2));
                if (b3 != -1) {
                    this.d -= (int) b3;
                    return b3;
                }
            }
            return -1L;
        } while (f == i);
        throw arkr.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
