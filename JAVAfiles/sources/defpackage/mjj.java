package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjj implements mjk {
    public final nfw a;
    private final Instant b;
    private final atok c;

    public mjj(nfw nfwVar, Instant instant, atok atokVar) {
        this.a = nfwVar;
        this.b = instant;
        this.c = atokVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjj)) {
            return false;
        }
        mjj mjjVar = (mjj) obj;
        if (d.F(this.a, mjjVar.a) && d.F(this.b, mjjVar.b) && d.F(this.c, mjjVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RemovedOptimisticReaction(selfIdentity=" + this.a + ", timestamp=" + this.b + ", traceId=" + this.c + ")";
    }
}
