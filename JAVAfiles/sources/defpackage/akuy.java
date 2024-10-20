package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akuy extends apzj {
    private final aktr d;
    private final apzj e;

    public akuy(apzj apzjVar, aktr aktrVar) {
        super(null);
        this.e = apzjVar;
        this.d = aktrVar;
    }

    @Override // defpackage.apzj
    public final void a() {
        aksa a = this.d.a();
        try {
            this.e.a();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.apzj
    public final void b() {
        aksa a = this.d.a();
        try {
            this.e.b();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.apzj
    public final void c() {
        aksa a = this.d.a();
        try {
            this.e.c();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.apzj
    public final void d(Object obj) {
        aksa a = this.d.a();
        try {
            this.e.d(obj);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.apzj
    public final void e() {
        aksa a = this.d.a();
        try {
            this.e.e();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
