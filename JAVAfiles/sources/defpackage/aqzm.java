package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzm {
    public static final Logger a = Logger.getLogger(aqzm.class.getName());
    public final String b;
    public final AtomicLong c;

    public aqzm(long j) {
        boolean z;
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(j);
    }
}
