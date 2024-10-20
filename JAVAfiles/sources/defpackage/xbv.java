package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbv {
    public final UUID a;
    public final Instant b;
    public final Optional c;

    public xbv() {
        throw null;
    }

    public static xbv a(UUID uuid, Instant instant, Instant instant2) {
        return new xbv(uuid, instant, Optional.of(instant2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xbv) {
            xbv xbvVar = (xbv) obj;
            if (this.a.equals(xbvVar.a) && this.b.equals(xbvVar.b) && this.c.equals(xbvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Instant instant = this.b;
        return "CurrentSyncData{syncId=" + this.a.toString() + ", currentExecutionStartTime=" + instant.toString() + ", firstExecutionStartTime=" + optional.toString() + "}";
    }

    public xbv(UUID uuid, Instant instant, Optional optional) {
        if (uuid == null) {
            throw new NullPointerException("Null syncId");
        }
        this.a = uuid;
        if (instant != null) {
            this.b = instant;
            this.c = optional;
            return;
        }
        throw new NullPointerException("Null currentExecutionStartTime");
    }
}
