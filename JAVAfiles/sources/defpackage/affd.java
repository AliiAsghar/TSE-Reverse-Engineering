package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affd extends aeke {
    public final Instant a;
    public final Object b;

    public affd(Instant instant, Object obj) {
        this.a = instant;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affd)) {
            return false;
        }
        affd affdVar = (affd) obj;
        if (d.F(this.a, affdVar.a) && d.F(this.b, affdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "DataPacket(timestamp=" + this.a + ", value=" + this.b + ")";
    }
}
