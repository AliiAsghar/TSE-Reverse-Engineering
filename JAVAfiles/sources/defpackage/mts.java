package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mts implements mjb {
    public final long a;
    public final long b;
    public final long c;

    public mts() {
        throw null;
    }

    public final boolean a() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        mjb mjbVar = (mjb) obj;
        if (mjbVar instanceof mts) {
            mts mtsVar = (mts) mjbVar;
            long j = this.a;
            long j2 = mtsVar.a;
            if (j != j2) {
                if (j <= j2) {
                    return -1;
                }
                return 1;
            }
            long j3 = this.b;
            long j4 = mtsVar.b;
            if (j3 != j4) {
                if (j3 <= j4) {
                    return -1;
                }
                return 1;
            }
            long j5 = this.c;
            long j6 = mtsVar.c;
            if (j5 != j6) {
                if (j5 <= j6) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
        throw new InvalidParameterException("wrong PagingKey type, expected BuglePagingKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mts) {
            mts mtsVar = (mts) obj;
            if (this.a == mtsVar.a && this.b == mtsVar.b && this.c == mtsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "BuglePagingKey{timestamp=" + this.a + ", id=" + this.b + ", partId=" + this.c + "}";
    }

    public mts(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
