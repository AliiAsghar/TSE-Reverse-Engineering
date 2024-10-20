package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjh {
    private final xmm a;
    private final int b;

    public xjh(xmm xmmVar, int i) {
        xmmVar.getClass();
        this.a = xmmVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjh)) {
            return false;
        }
        xjh xjhVar = (xjh) obj;
        if (d.F(this.a, xjhVar.a) && this.b == xjhVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bm(i);
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SyncMerged(mergeDetails=");
        sb.append(this.a);
        sb.append(", mergeType=");
        if (this.b != 1) {
            str = "ACTIVE_SYNC";
        } else {
            str = "NEW_REQUEST";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
