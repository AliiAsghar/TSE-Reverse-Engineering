package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkp implements lkr {
    private final int a;
    private final llg c = llg.b;
    private final String b = "IdleState";

    public lkp(int i) {
        this.a = i;
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
        return this.b;
    }

    @Override // defpackage.lkr
    public final void d(lke lkeVar) {
        lkeVar.getClass();
        if (!(lkeVar instanceof lkj) && !(lkeVar instanceof lkk)) {
            throw new lkq(lkeVar, this.b, this.c, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lkp) && this.a == ((lkp) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "IdleState(requestId=" + this.a + ")";
    }
}
