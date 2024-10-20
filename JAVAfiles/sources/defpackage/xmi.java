package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmi implements xmk {
    public final Instant a;
    public final Instant b;
    private final int c;
    private final UUID d;
    private final UUID e;

    public xmi(Instant instant, Instant instant2, int i, UUID uuid, UUID uuid2) {
        instant.getClass();
        instant2.getClass();
        this.a = instant;
        this.b = instant2;
        this.c = i;
        this.d = uuid;
        this.e = uuid2;
    }

    @Override // defpackage.xmk
    public final int a() {
        return this.c;
    }

    @Override // defpackage.xmk
    public final UUID b() {
        return this.e;
    }

    @Override // defpackage.xmk
    public final UUID c() {
        return this.d;
    }

    @Override // defpackage.xmk
    public final xiu d(aiqj aiqjVar) {
        return aiqjVar.x(this.b.toEpochMilli(), this.a.toEpochMilli());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmi)) {
            return false;
        }
        xmi xmiVar = (xmi) obj;
        if (d.F(this.a, xmiVar.a) && d.F(this.b, xmiVar.b) && this.c == xmiVar.c && d.F(this.d, xmiVar.d) && d.F(this.e, xmiVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TimeBasedSyncBatch(upperBoundTime=" + this.a + ", lowerBoundTime=" + this.b + ", targetMessagesToUpdate=" + this.c + ", syncId=" + this.d + ", batchId=" + this.e + ")";
    }
}
