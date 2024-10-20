package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqn {
    public static final akqn a;
    private final UUID b;
    private final AtomicLong c;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new akqn(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public akqn(UUID uuid, long j) {
        this.b = uuid;
        this.c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long a() {
        long j;
        do {
            j = this.c.get();
        } while (!this.c.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r4 >>> 16)) << 32) + ((int) (r2 >>> 16));
    }

    public final UUID b() {
        return new UUID((a() & (-61441)) ^ this.b.getMostSignificantBits(), (a() >>> 2) ^ this.b.getLeastSignificantBits());
    }
}
