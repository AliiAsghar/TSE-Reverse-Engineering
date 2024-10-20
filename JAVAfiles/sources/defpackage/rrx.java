package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrx {
    public final String a;
    public final long b;
    public final long c;
    public final Optional d;

    public rrx(String str, long j, long j2, Optional optional) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrx)) {
            return false;
        }
        rrx rrxVar = (rrx) obj;
        if (this.b == rrxVar.b && this.c == rrxVar.c && Objects.equals(this.a, rrxVar.a) && Objects.equals(this.d, rrxVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.c), this.d);
    }
}
