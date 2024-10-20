package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xio {
    public final long a;
    public final xaz b;

    public xio() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xio) {
            xio xioVar = (xio) obj;
            if (this.a == xioVar.a && this.b.equals(xioVar.b)) {
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
        return "ThreadMergeData{oldThreadId=" + this.a + ", newThreadData=" + this.b.toString() + "}";
    }

    public xio(long j, xaz xazVar) {
        this.a = j;
        this.b = xazVar;
    }
}
