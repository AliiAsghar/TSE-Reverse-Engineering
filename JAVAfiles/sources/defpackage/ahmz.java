package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmz {
    public final long a;
    public final long b;

    public ahmz() {
        throw null;
    }

    public static ahmz a(aegu aeguVar) {
        return new ahmz(SystemClock.elapsedRealtime(), aeguVar.e().toMillis());
    }

    public static ahmz b() {
        return new ahmz(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahmz) {
            ahmz ahmzVar = (ahmz) obj;
            if (this.a == ahmzVar.a && this.b == ahmzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }

    public ahmz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
