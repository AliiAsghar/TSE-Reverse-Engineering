package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lko implements lkr {
    public final int a;
    public arpe b;
    private final lkg c;
    private final String d = "DispatchedWithResultState";

    public lko(int i, lkg lkgVar) {
        this.a = i;
        this.c = lkgVar;
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
        if (lkeVar instanceof lkz) {
            lkz lkzVar = (lkz) lkeVar;
            if (lkzVar.a == this.a) {
                this.b = lkzVar.b;
                return;
            }
        }
        throw new lkq(lkeVar, this.d, this.c, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lko)) {
            return false;
        }
        lko lkoVar = (lko) obj;
        if (this.a == lkoVar.a && d.F(this.c, lkoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DispatchedWithResultState(requestId=" + this.a + ", target=" + this.c + ")";
    }
}
