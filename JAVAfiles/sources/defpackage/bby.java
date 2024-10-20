package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bby implements bcr {
    final /* synthetic */ arqg a;
    final /* synthetic */ bes b;
    final /* synthetic */ long c;
    private long d = 0;

    public bby(arqg arqgVar, bes besVar, long j) {
        this.a = arqgVar;
        this.b = besVar;
        this.c = j;
    }

    @Override // defpackage.bcr
    public final void a() {
        this.b.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cti, java.lang.Object] */
    @Override // defpackage.bcr
    public final boolean b(long j, bdd bddVar) {
        ?? a = this.a.a();
        if (a != 0) {
            bes besVar = this.b;
            long j2 = this.c;
            if (!a.r() || !bev.a(besVar, j2)) {
                return false;
            }
            if (besVar.h(a, j, this.d, bddVar, false)) {
                this.d = j;
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cti, java.lang.Object] */
    @Override // defpackage.bcr
    public final boolean c(long j, bdd bddVar) {
        ?? a = this.a.a();
        if (a != 0) {
            bes besVar = this.b;
            long j2 = this.c;
            if (a.r()) {
                besVar.f(a, j, bddVar, false);
                this.d = j;
                return bev.a(besVar, j2);
            }
            return false;
        }
        return false;
    }
}
