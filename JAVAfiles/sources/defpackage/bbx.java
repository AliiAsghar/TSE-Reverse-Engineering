package defpackage;

import defpackage.bdd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbx implements ays {
    final /* synthetic */ arqg a;
    final /* synthetic */ bes b;
    final /* synthetic */ long c;
    private long d = 0;
    private long e = 0;

    public bbx(arqg arqgVar, bes besVar, long j) {
        this.a = arqgVar;
        this.b = besVar;
        this.c = j;
    }

    @Override // defpackage.ays
    public final void a() {
        if (bev.a(this.b, this.c)) {
            this.b.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cti, java.lang.Object] */
    @Override // defpackage.ays
    public final void b(long j) {
        ?? a = this.a.a();
        if (a != 0) {
            bes besVar = this.b;
            long j2 = this.c;
            if (a.r() && bev.a(besVar, j2)) {
                long aH = d.aH(this.e, j);
                this.e = aH;
                long aH2 = d.aH(this.d, aH);
                long j3 = this.d;
                int i = bdd.a;
                if (besVar.h(a, aH2, j3, bdd.a.b, true)) {
                    this.d = aH2;
                    this.e = 0L;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cti, java.lang.Object] */
    @Override // defpackage.ays
    public final void c(long j) {
        ?? a = this.a.a();
        if (a != 0) {
            bes besVar = this.b;
            if (a.r()) {
                int i = bdd.a;
                besVar.f(a, j, bdd.a.b, true);
                this.d = j;
            } else {
                return;
            }
        }
        if (bev.a(this.b, this.c)) {
            this.e = 0L;
        }
    }

    @Override // defpackage.ays
    public final void d() {
        if (bev.a(this.b, this.c)) {
            this.b.e();
        }
    }

    @Override // defpackage.ays
    public final void e() {
    }

    @Override // defpackage.ays
    public final void f() {
    }
}
