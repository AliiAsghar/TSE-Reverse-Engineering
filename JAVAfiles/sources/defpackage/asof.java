package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asof extends asoa {
    private boolean c;

    public asof(asog asogVar) {
        super(asogVar);
    }

    @Override // defpackage.asoa, defpackage.asrq
    public final long b(asqu asquVar, long j) {
        if (!this.a) {
            if (this.c) {
                return -1L;
            }
            long b = super.b(asquVar, 8192L);
            if (b == -1) {
                this.c = true;
                c();
                return -1L;
            }
            return b;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c();
        }
        d();
    }
}
