package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asoe implements asro {
    final /* synthetic */ asog a;
    private final asra b;
    private boolean c;

    public asoe(asog asogVar) {
        this.a = asogVar;
        this.b = new asra(asogVar.d.a());
    }

    @Override // defpackage.asro
    public final asrs a() {
        return this.b;
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        asog.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.asro, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        if (!this.c) {
            asmt.z(asquVar.b, j);
            this.a.d.hq(asquVar, j);
            return;
        }
        throw new IllegalStateException("closed");
    }
}
