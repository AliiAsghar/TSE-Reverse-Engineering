package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkj {
    public final xkk a;
    public final boolean b;
    public final Instant c;
    public final int d;
    public final int e;
    public final Duration f;
    public final Duration g;
    public final int h;
    public final int i;

    public xkj() {
        this(null, null, 511);
    }

    public static /* synthetic */ xkj a(xkj xkjVar, xkk xkkVar) {
        boolean z = xkjVar.b;
        Instant instant = xkjVar.c;
        int i = xkjVar.d;
        int i2 = xkjVar.e;
        Duration duration = xkjVar.f;
        Duration duration2 = xkjVar.g;
        int i3 = xkjVar.h;
        int i4 = xkjVar.i;
        xkkVar.getClass();
        return new xkj(xkkVar, z, instant, i, i2, duration, duration2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkj)) {
            return false;
        }
        xkj xkjVar = (xkj) obj;
        if (this.a == xkjVar.a && this.b == xkjVar.b && d.F(this.c, xkjVar.c) && this.d == xkjVar.d && this.e == xkjVar.e && d.F(this.f, xkjVar.f) && d.F(this.g, xkjVar.g) && this.h == xkjVar.h && this.i == xkjVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Instant instant = this.c;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        return ((((((((((((((hashCode2 + a.v(this.b)) * 31) + hashCode) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        return "BatchStats(status=" + this.a + ", isFinalBatch=" + this.b + ", lastScannedMessageTime=" + this.c + ", messagesSyncedCount=" + this.d + ", messagesUpdatedCount=" + this.e + ", transactionTime=" + this.f + ", totalBatchTime=" + this.g + ", remoteTotal=" + this.h + ", localTotal=" + this.i + ")";
    }

    public xkj(xkk xkkVar, boolean z, Instant instant, int i, int i2, Duration duration, Duration duration2, int i3, int i4) {
        xkkVar.getClass();
        duration.getClass();
        duration2.getClass();
        this.a = xkkVar;
        this.b = z;
        this.c = instant;
        this.d = i;
        this.e = i2;
        this.f = duration;
        this.g = duration2;
        this.h = i3;
        this.i = i4;
    }

    public /* synthetic */ xkj(xkk xkkVar, Duration duration, int i) {
        this((i & 1) != 0 ? xkk.a : xkkVar, false, null, 0, 0, (i & 32) != 0 ? Duration.ZERO : null, (i & 64) != 0 ? Duration.ZERO : duration, 0, 0);
    }
}
