package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyt {
    long a = -1;
    long b = -1;

    public final long a() {
        boolean z;
        if (this.b != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return TimeUnit.NANOSECONDS.toMillis(b() - this.b);
    }

    public final long b() {
        if (this.a == -1) {
            return System.nanoTime();
        }
        this.a = -1L;
        return 0L;
    }

    public final void c() {
        this.b = b();
    }
}
