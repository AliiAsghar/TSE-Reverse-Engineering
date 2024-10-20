package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkz implements lkr, lki {
    public final int a;
    public final arpe b;
    private final lkg c;
    private final String d = "RequestedWithResultState";

    public lkz(int i, lkg lkgVar, arpe arpeVar) {
        this.a = i;
        this.c = lkgVar;
        this.b = arpeVar;
    }

    @Override // defpackage.lke
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lke
    public final /* synthetic */ lkh b() {
        return this.c;
    }

    @Override // defpackage.lkr
    public final String c() {
        return this.d;
    }

    @Override // defpackage.lkr
    public final void d(lke lkeVar) {
        lkeVar.getClass();
        if (lkeVar instanceof lkp) {
        } else {
            throw new lkq(lkeVar, this.d, this.c, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkz)) {
            return false;
        }
        lkz lkzVar = (lkz) obj;
        if (this.a == lkzVar.a && d.F(this.c, lkzVar.c) && d.F(this.b, lkzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RequestedWithResultState(requestId=" + this.a + ", target=" + this.c + ", continuation=" + this.b + ")";
    }
}
