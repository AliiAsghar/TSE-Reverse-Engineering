package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accv {
    public final long a;
    public final long b;
    public final long c;

    public accv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accv) {
            accv accvVar = (accv) obj;
            if (this.a == accvVar.a && this.b == accvVar.b && this.c == accvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) this.b)) * (-721379959)) ^ ((int) this.c);
    }

    public final String toString() {
        return "TimestampBounds{decisionValidFromDays=" + this.a + ", decisionValidToDays=" + this.b + ", expirationValidFromDays=0, expirationValidToDays=" + this.c + "}";
    }

    public accv(byte[] bArr) {
        this.a = -30L;
        this.b = 3L;
        this.c = 30L;
    }
}
