package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luq {
    public final UUID a;
    public final lwz b;
    public final lwr c;
    public final Instant d;
    public final Instant e;
    public final lwp f;
    public final Instant g;
    public final Instant h;
    private final long i;

    public luq(UUID uuid, lwz lwzVar, lwr lwrVar, Instant instant, Instant instant2, lwp lwpVar, long j, Instant instant3, Instant instant4) {
        this.a = uuid;
        this.b = lwzVar;
        this.c = lwrVar;
        this.d = instant;
        this.e = instant2;
        this.f = lwpVar;
        this.i = j;
        this.g = instant3;
        this.h = instant4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luq)) {
            return false;
        }
        luq luqVar = (luq) obj;
        if (d.F(this.a, luqVar.a) && this.b == luqVar.b && this.c == luqVar.c && d.F(this.d, luqVar.d) && d.F(this.e, luqVar.e) && d.F(this.f, luqVar.f) && this.i == luqVar.i && d.F(this.g, luqVar.g) && d.F(this.h, luqVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Instant instant = this.e;
        int i = 0;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        lwp lwpVar = this.f;
        if (lwpVar != null) {
            i = lwpVar.hashCode();
        }
        return ((((((i2 + i) * 31) + a.A(this.i)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "RestoreExecution(sessionId=" + this.a + ", feature=" + this.b + ", status=" + this.c + ", startTime=" + this.d + ", finishTime=" + this.e + ", backupDatabaseMetadata=" + this.f + ", initialMessagesVersion=" + this.i + ", statusTimestamp=" + this.g + ", lastAttachmentRequestTimestamp=" + this.h + ")";
    }
}
