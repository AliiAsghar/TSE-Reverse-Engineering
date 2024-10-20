package defpackage;

import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urg {
    public final Set a;
    private final Duration b;

    public urg(Set set, Duration duration) {
        this.a = set;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urg)) {
            return false;
        }
        urg urgVar = (urg) obj;
        if (d.F(this.a, urgVar.a) && d.F(this.b, urgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JanitorStepResult(affectedQueues=" + this.a + ", queryDuration=" + this.b + ")";
    }
}
