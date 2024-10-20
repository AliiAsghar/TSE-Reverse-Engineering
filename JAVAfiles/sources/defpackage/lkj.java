package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkj implements lkr {
    private final int a;
    private final lkf b;
    private final String c = "CompletedState";

    public lkj(int i, lkf lkfVar) {
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
        if ((lkeVar instanceof lkl) && ((lkl) lkeVar).a == this.a) {
        } else {
            throw new lkq(lkeVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkj)) {
            return false;
        }
        lkj lkjVar = (lkj) obj;
        if (this.a == lkjVar.a && d.F(this.b, lkjVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CompletedState(requestId=" + this.a + ", target=" + this.b + ")";
    }
}
