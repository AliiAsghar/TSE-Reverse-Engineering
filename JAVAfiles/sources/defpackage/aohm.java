package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aohm {
    public final String a;
    private final long b;
    private final long c;

    public aohm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aohm) {
            aohm aohmVar = (aohm) obj;
            if (this.a.equals(aohmVar.a) && this.b == aohmVar.b && this.c == aohmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.b;
        return (((hashCode * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public aohm(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
