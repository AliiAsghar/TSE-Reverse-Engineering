package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asrs {
    public static final asrs j = new asrr();
    private boolean a;
    private long b;
    public long k;

    public boolean g() {
        return this.a;
    }

    public long h() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public asrs i() {
        this.k = 0L;
        return this;
    }

    public asrs j(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public asrs k(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.k = timeUnit.toNanos(j2);
        return this;
    }

    public void l() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public asrs m() {
        this.a = false;
        return this;
    }
}
