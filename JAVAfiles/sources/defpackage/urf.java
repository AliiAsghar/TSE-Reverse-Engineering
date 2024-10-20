package defpackage;

import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urf {
    private final Map a;
    private final Duration b;

    public urf(Map map, Duration duration) {
        map.getClass();
        this.a = map;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urf)) {
            return false;
        }
        urf urfVar = (urf) obj;
        if (d.F(this.a, urfVar.a) && d.F(this.b, urfVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JanitorResult(steps=" + this.a + ", rescheduleDuration=" + this.b + ")";
    }
}
