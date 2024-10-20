package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asod extends asoa {
    final /* synthetic */ asog c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asod(asog asogVar, long j) {
        super(asogVar);
        this.c = asogVar;
        this.d = j;
        if (j == 0) {
            c();
        }
    }

    @Override // defpackage.asoa, defpackage.asrq
    public final long b(asqu asquVar, long j) {
        if (!this.a) {
            long j2 = this.d;
            if (j2 == 0) {
                return -1L;
            }
            long b = super.b(asquVar, Math.min(j2, 8192L));
            if (b != -1) {
                long j3 = this.d - b;
                this.d = j3;
                if (j3 == 0) {
                    c();
                }
                return b;
            }
            this.c.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !asmt.B(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
