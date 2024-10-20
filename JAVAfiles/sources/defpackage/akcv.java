package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcv {
    public final long a;
    public final TimeUnit b;

    public akcv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcv) {
            akcv akcvVar = (akcv) obj;
            if (this.a == akcvVar.a && this.b.equals(akcvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TimeUnitPair{duration=" + this.a + ", timeUnit=" + this.b.toString() + "}";
    }

    public akcv(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }
}
