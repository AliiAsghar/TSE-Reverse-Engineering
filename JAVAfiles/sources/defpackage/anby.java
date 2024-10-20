package defpackage;

import j$.time.Instant;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anby {
    public static final /* synthetic */ int a = 0;

    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        a(Long.MAX_VALUE);
        a(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    public static Instant a(long j) {
        return Instant.ofEpochSecond(albo.cN(j, 1000000L, RoundingMode.FLOOR), albo.cJ(j, 1000000) * 1000);
    }

    public static void b(long j) {
        Instant.ofEpochSecond(albo.cN(j, 1000000000L, RoundingMode.FLOOR), albo.cJ(j, 1000000000));
    }
}
