package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apzd extends apyu {
    private final apyu b;

    public apzd(apyu apyuVar) {
        this.b = apyuVar;
    }

    @Override // defpackage.apyu
    public final void b(Throwable th) {
        try {
            this.b.b(th);
        } catch (RuntimeException e) {
            apzg.c(e, this.b, "failed", th);
        }
    }

    @Override // defpackage.apyu
    public final void c() {
        try {
            this.b.c();
        } catch (RuntimeException e) {
            apzg.e(e, this.b, "methodFinished");
        }
    }

    @Override // defpackage.apyu
    public final void d() {
        try {
            this.b.d();
        } catch (RuntimeException e) {
            apzg.e(e, this.b, "methodStarting");
        }
    }

    @Override // defpackage.apyu
    public final void e() {
        try {
            this.b.e();
        } catch (RuntimeException e) {
            apzg.e(e, this.b, "ready");
        }
    }

    @Override // defpackage.apyu
    public final void f() {
        try {
            this.b.f();
        } catch (RuntimeException e) {
            apzg.e(e, this.b, "requested");
        }
    }

    @Override // defpackage.apyu
    public final void g(Object obj) {
        try {
            this.b.g(obj);
        } catch (RuntimeException e) {
            apzg.c(e, this.b, "succeeded", obj);
        }
    }
}
