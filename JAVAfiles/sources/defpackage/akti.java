package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akti implements Closeable {
    public final long a;

    public akti(long j) {
        this.a = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aiut.d(new akhg(this, 20), 5000L);
    }
}
