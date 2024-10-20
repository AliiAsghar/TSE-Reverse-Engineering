package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nae {
    public final alog a;
    public final long b;
    public final long c;
    private final arqr d;

    public nae(alog alogVar, long j, long j2, arqr arqrVar) {
        alogVar.getClass();
        this.a = alogVar;
        this.b = j;
        this.c = j2;
        this.d = arqrVar;
    }

    public final int a(mjb mjbVar) {
        if (mjbVar instanceof nam) {
            return a(((nam) mjbVar).a);
        }
        if (mjbVar instanceof mzz) {
            return Math.max(Math.min((int) (((mzz) mjbVar).a - this.b), this.a.size()), 0);
        }
        return lga.aA(this.a, mjbVar, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nae)) {
            return false;
        }
        nae naeVar = (nae) obj;
        if (d.F(this.a, naeVar.a) && this.b == naeVar.b && this.c == naeVar.c && d.F(this.d, naeVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        arqr arqrVar = this.d;
        return ((((hashCode + a.A(this.b)) * 31) + a.A(this.c)) * 31) + arqrVar.hashCode();
    }

    public final String toString() {
        return "PagingResultsImpl(data=" + this.a + ", itemsBefore=" + this.b + ", itemsAfter=" + this.c + ", createPagingKey=" + this.d + ")";
    }
}
