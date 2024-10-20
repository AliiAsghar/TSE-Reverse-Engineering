package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class uee implements Closeable {
    final /* synthetic */ uef a;
    private final ude b;
    private final long c;

    public uee(uef uefVar, ude udeVar) {
        this.a = uefVar;
        this.b = udeVar;
        this.c = uefVar.b.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long a = this.a.b.a() - this.c;
        if (this.b.b.equals(udf.BEGIN_TRANSACTION)) {
            this.a.c.g("Bugle.Datamodel.DatabaseTransactionStartLatency.Duration", a);
        }
    }
}
