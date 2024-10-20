package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afuv implements afuy {
    public final Instant a;
    public final Duration b;

    public afuv(Instant instant, Duration duration) {
        duration.getClass();
        this.a = instant;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afuv)) {
            return false;
        }
        afuv afuvVar = (afuv) obj;
        if (d.F(this.a, afuvVar.a) && d.F(this.b, afuvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Instant instant = this.a;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Audio(dateModified=" + this.a + ", duration=" + this.b + ")";
    }
}
