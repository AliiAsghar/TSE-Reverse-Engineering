package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknx {
    public final akny a;
    public final long b;

    public aknx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aknx) {
            aknx aknxVar = (aknx) obj;
            if (this.a.equals(aknxVar.a) && this.b == aknxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + "}";
    }

    public aknx(akny aknyVar, long j) {
        if (aknyVar == null) {
            throw new NullPointerException("Null constraintType");
        }
        this.a = aknyVar;
        this.b = j;
    }
}
