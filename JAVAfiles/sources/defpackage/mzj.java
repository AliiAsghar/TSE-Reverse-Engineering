package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzj {
    public final int a;
    public final long b;
    public final nae c;

    public mzj(int i, long j, nae naeVar) {
        this.a = i;
        this.b = j;
        this.c = naeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzj)) {
            return false;
        }
        mzj mzjVar = (mzj) obj;
        if (this.a == mzjVar.a && this.b == mzjVar.b && d.F(this.c, mzjVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + a.A(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CachedPagingResults(limit=" + this.a + ", version=" + this.b + ", pagingResults=" + this.c + ")";
    }
}
