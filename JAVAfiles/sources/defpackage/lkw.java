package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkw implements lkr, lki {
    public final int a;
    private final lkf b;
    private final String c = "RequestedState";

    public lkw(int i, lkf lkfVar) {
        this.a = i;
        this.b = lkfVar;
    }

    @Override // defpackage.lke
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lke
    public final /* synthetic */ lkh b() {
        return this.b;
    }

    @Override // defpackage.lkr
    public final String c() {
        return this.c;
    }

    @Override // defpackage.lkr
    public final void d(lke lkeVar) {
        lkeVar.getClass();
        if (lkeVar instanceof lkp) {
        } else {
            throw new lkq(lkeVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkw)) {
            return false;
        }
        lkw lkwVar = (lkw) obj;
        if (this.a == lkwVar.a && d.F(this.b, lkwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RequestedState(requestId=" + this.a + ", target=" + this.b + ")";
    }
}
