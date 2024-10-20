package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkk implements lkr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/statemachine/CompletedWithResultState");
    public final Object b;
    public arpe c;
    private final int d;
    private final lkg e;
    private final arwe f;
    private final String g = "CompletedWithResultState";

    public lkk(Object obj, int i, lkg lkgVar, arwe arweVar) {
        this.b = obj;
        this.d = i;
        this.e = lkgVar;
        this.f = arweVar;
    }

    @Override // defpackage.lke
    public final int a() {
        return this.d;
    }

    @Override // defpackage.lke
    public final /* synthetic */ lkh b() {
        return this.e;
    }

    @Override // defpackage.lkr
    public final String c() {
        return this.g;
    }

    @Override // defpackage.lkr
    public final void d(lke lkeVar) {
        lkeVar.getClass();
        if ((lkeVar instanceof lko) && ((lko) lkeVar).a == this.d) {
            qjh.l(this.f, null, new kca(this, lkeVar, (arpe) null, 14), 3);
            return;
        }
        throw new lkq(lkeVar, this.g, this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkk)) {
            return false;
        }
        lkk lkkVar = (lkk) obj;
        if (d.F(this.b, lkkVar.b) && this.d == lkkVar.d && d.F(this.e, lkkVar.e) && d.F(this.f, lkkVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((armq.a(this.b) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CompletedWithResultState(result=" + armq.b(this.b) + ", requestId=" + this.d + ", target=" + this.e + ", coroutineScope=" + this.f + ")";
    }
}
