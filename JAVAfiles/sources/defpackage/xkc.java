package defpackage;

import j$.time.Duration;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkc implements Closeable {
    private final xnv a;
    private final Duration b;
    private Duration c;

    public xkc(xnv xnvVar) {
        this.a = xnvVar;
        this.b = Duration.ofMillis(xnvVar.a());
    }

    public final Duration a() {
        Duration duration = this.c;
        if (duration == null) {
            duration = Duration.ofMillis(this.a.a());
        }
        Duration minus = duration.minus(this.b);
        minus.getClass();
        return minus;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c == null) {
            this.c = Duration.ofMillis(this.a.a());
            return;
        }
        throw new IllegalArgumentException("Timer has already been closed");
    }
}
