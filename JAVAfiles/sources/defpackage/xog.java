package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xog {
    public final long a;
    public final long b;

    public xog() {
        throw null;
    }

    public final boolean a() {
        if (this.a == this.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xog) {
            xog xogVar = (xog) obj;
            if (this.a == xogVar.a && this.b == xogVar.b) {
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
        return "FileTransferProgress{bytesTransferred=" + this.a + ", totalBytesInFile=" + this.b + "}";
    }

    public xog(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
