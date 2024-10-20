package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsd {
    public final psv a;
    public final Instant b;

    public lsd(psv psvVar, Instant instant) {
        this.a = psvVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsd)) {
            return false;
        }
        lsd lsdVar = (lsd) obj;
        if (d.F(this.a, lsdVar.a) && d.F(this.b, lsdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RcsCapabilitiesWithTimestamp(capabilities=" + this.a + ", timestamp=" + this.b + ")";
    }
}
