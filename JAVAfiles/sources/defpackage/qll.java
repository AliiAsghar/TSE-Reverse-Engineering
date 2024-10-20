package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qll {
    public final long a;
    public final Instant b;

    public qll(long j, Instant instant) {
        this.a = j;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qll)) {
            return false;
        }
        qll qllVar = (qll) obj;
        if (this.a == qllVar.a && d.F(this.b, qllVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContactIdWithDeletedTimestamp(contactId=" + this.a + ", deletedTimestamp=" + this.b + ")";
    }
}
