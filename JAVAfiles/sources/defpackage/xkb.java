package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkb {
    public final Instant a;
    public final Duration b;
    public final int c;
    public final int d;
    public final int e;

    public xkb(Instant instant, Duration duration, int i, int i2, int i3) {
        this.a = instant;
        this.b = duration;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkb)) {
            return false;
        }
        xkb xkbVar = (xkb) obj;
        if (d.F(this.a, xkbVar.a) && d.F(this.b, xkbVar.b) && this.c == xkbVar.c && this.d == xkbVar.d && this.e == xkbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "SyncCursorPairResults(lastScannedMessageTimestamp=" + this.a + ", txnDurationMillis=" + this.b + ", messagesSyncedCount=" + this.c + ", localTotal=" + this.d + ", remoteTotal=" + this.e + ")";
    }
}
