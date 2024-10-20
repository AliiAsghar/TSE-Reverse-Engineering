package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkq extends IllegalStateException {
    public final String a;
    private final lke b;
    private final lkh c;
    private final int d;

    public lkq(lke lkeVar, String str, lkh lkhVar, int i) {
        lkeVar.getClass();
        this.b = lkeVar;
        this.a = str;
        this.c = lkhVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkq)) {
            return false;
        }
        lkq lkqVar = (lkq) obj;
        if (d.F(this.b, lkqVar.b) && d.F(this.a, lkqVar.a) && d.F(this.c, lkqVar.c) && this.d == lkqVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "IllegalNavigationStateTransitionException(from=" + this.b + ", to=" + this.a + ", target=" + this.c + ", requestId=" + this.d + ")";
    }
}
