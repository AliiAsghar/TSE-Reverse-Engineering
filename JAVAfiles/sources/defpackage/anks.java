package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anks {
    public final Instant a;

    public anks(Instant instant) {
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof anks) && d.F(this.a, ((anks) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendMessageResponse(timestamp=" + this.a + ")";
    }
}
