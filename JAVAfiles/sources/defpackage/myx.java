package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myx {
    public final long a;
    public final long b;
    public final boolean c;

    public myx() {
        throw null;
    }

    public static myw a() {
        myw mywVar = new myw();
        mywVar.b(0L);
        mywVar.d(0L);
        mywVar.c(false);
        return mywVar;
    }

    public final boolean b() {
        if (this.a > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myx) {
            myx myxVar = (myx) obj;
            if (this.a == myxVar.a && this.b == myxVar.b && this.c == myxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j = this.a;
        long j2 = this.b;
        return i ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "BugleFileTransfer{bytesTransferred=" + this.a + ", totalBytesInFile=" + this.b + ", isFinished=" + this.c + "}";
    }

    public myx(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }
}
