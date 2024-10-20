package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mji implements mjk {
    public final nfw a;
    public final atok b;
    public final nbg c;
    private final Instant d;

    public mji(nfw nfwVar, Instant instant, atok atokVar, nbg nbgVar) {
        this.a = nfwVar;
        this.d = instant;
        this.b = atokVar;
        this.c = nbgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mji)) {
            return false;
        }
        mji mjiVar = (mji) obj;
        if (d.F(this.a, mjiVar.a) && d.F(this.d, mjiVar.d) && d.F(this.b, mjiVar.b) && d.F(this.c, mjiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AddedOptimisticReaction(selfIdentity=" + this.a + ", timestamp=" + this.d + ", traceId=" + this.b + ", reaction=" + this.c + ")";
    }
}
