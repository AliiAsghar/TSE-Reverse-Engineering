package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alii {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public alii() {
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alii) {
            alii aliiVar = (alii) obj;
            long j = aliiVar.a;
            long j2 = aliiVar.b;
            long j3 = aliiVar.c;
            long j4 = aliiVar.d;
            long j5 = aliiVar.e;
            long j6 = aliiVar.f;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("hitCount", 0L);
        aj.g("missCount", 0L);
        aj.g("loadSuccessCount", 0L);
        aj.g("loadExceptionCount", 0L);
        aj.g("totalLoadTime", 0L);
        aj.g("evictionCount", 0L);
        return aj.toString();
    }
}
