package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucc {
    public final agni a;
    public final long b;
    public final long c;
    public final boolean d;

    public ucc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucc) {
            ucc uccVar = (ucc) obj;
            if (this.a.equals(uccVar.a) && this.b == uccVar.b && this.c == uccVar.c && this.d == uccVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j = this.b;
        long j2 = this.c;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ i;
    }

    public final String toString() {
        return "HistoryLogItem{loggingTag=" + this.a.toString() + ", threadId=" + this.b + ", timeStamp=" + this.c + ", enter=" + this.d + "}";
    }

    public ucc(agni agniVar, long j, long j2, boolean z) {
        if (agniVar == null) {
            throw new NullPointerException("Null loggingTag");
        }
        this.a = agniVar;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
