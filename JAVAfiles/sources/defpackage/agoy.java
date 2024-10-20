package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agoy implements AutoCloseable {
    final long a = Thread.currentThread().getId();

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (Thread.currentThread().getId() == this.a) {
        } else {
            throw new IllegalStateException("thread state change disallowed here");
        }
    }
}
